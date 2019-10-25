## Spring Cloud Stream Function support with Apache Kafka binder

### What is done

Attempt to use Spring Cloud Stream Hoxton.M3 and functional support together with Kafka Binder. There is a processor 
`Function<Flux<Message<String>>, Flux<Message<String>>>` which suppose to use dynamic output destination based on
`Message` header. 

The following option is set: `spring.cloud.stream.kafka.bindings.output.producer.use-topic-header=true` in 
`application.properties` file and for each message target topic is specified via message header `KafkaHeaders.TOPIC`.

### The Problem

The problem is that producer still send data to pre-defined `output_topic`. It's not clear if that is supported or not
by the functional approach.
