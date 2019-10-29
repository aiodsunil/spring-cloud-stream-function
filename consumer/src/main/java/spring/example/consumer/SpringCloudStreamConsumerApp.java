package spring.example.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import reactor.core.publisher.Flux;
import spring.example.commons.SampleObject;

import java.util.function.Consumer;
import java.util.function.Function;

@SpringBootApplication
@Configuration
public class SpringCloudStreamConsumerApp {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudStreamConsumerApp.class, args);
    }

//    @Bean
//    Consumer<Flux<Message<SampleObject>>> consumer() {
//        return messageFlux -> messageFlux.subscribe(message -> System.out.println("consumer: " + message.getPayload()));
//    }
//
//    @Bean
//    Function<Flux<Message<SampleObject>>, Flux<Message<String>>> processor() {
//        return messageFlux -> messageFlux.map(message -> {
//            System.out.println("function: " + message.getPayload());
//
//            return MessageBuilder
//                .withPayload("processed")
//                .copyHeaders(message.getHeaders())
//                .build();
//        });
//    }

}
