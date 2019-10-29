## Spring Cloud Stream Function support with Apache Kafka binder

### What is done

Attempt to use Spring Cloud Stream Hoxton.BUILD-SNAPSHOT and functional support together with Kafka Binder. There is a 
consumer implementation class which suppose to be discovered by spring cloud stream and provide data.

Consumer is discovered by an exception is thrown:

```
Caused by: java.lang.ClassCastException: class java.lang.String cannot be cast to class reactor.core.publisher.Flux 
(java.lang.String is in module java.base of loader 'bootstrap'; reactor.core.publisher.Flux is in unnamed module of 
loader 'app')
```
