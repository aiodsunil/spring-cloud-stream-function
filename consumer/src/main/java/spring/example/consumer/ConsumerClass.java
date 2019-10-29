package spring.example.consumer;

import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import spring.example.commons.SampleObject;

import java.util.function.Consumer;

@Component("consumer")
public class ConsumerClass implements Consumer<Flux<Message<SampleObject>>> {

    @Override
    public void accept(Flux<Message<SampleObject>> messageFlux) {
        messageFlux.subscribe(message -> System.out.println("consumer: " + message.getPayload()));
    }

}
