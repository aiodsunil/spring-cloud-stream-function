package spring.example.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import reactor.core.publisher.Flux;
import spring.example.commons.SampleObject;

import java.util.UUID;
import java.util.function.Supplier;

@SpringBootApplication
@Configuration
public class SpringCloudStreamProducerApp {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudStreamProducerApp.class, args);
    }

    @Bean
    Supplier<Flux<Message<SampleObject>>> producer() {
        return () -> Flux.just(
            MessageBuilder
                .withPayload(new SampleObject(UUID.randomUUID(), "value" + Math.random()))
                .build()
        );
    }

}
