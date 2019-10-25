package spring.example.stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import reactor.core.publisher.Flux;

import java.util.function.Function;

@SpringBootApplication
@Configuration
public class SpringCloudStreamFunctionKafkaApp {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudStreamFunctionKafkaApp.class, args);
    }

    @Bean
    Function<Flux<Message<String>>, Flux<Message<String>>> processor() {
        return messageFlux -> messageFlux.map(message -> {
            System.out.println(message.getPayload());

            return MessageBuilder
                .fromMessage(message)
                .setHeader(KafkaHeaders.TOPIC, "header_routed_topic")
                .build();
        });
    }

}
