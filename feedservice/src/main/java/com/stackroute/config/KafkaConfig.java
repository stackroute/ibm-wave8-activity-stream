package com.techprimers.springbootwebsocketexample.config;
import com.techprimers.springbootwebsocketexample.model.ActivityTweet;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.support.serializer.JsonDeserializer;
import java.util.HashMap;
import java.util.Map;

@EnableKafka
@Configuration
public class KafkaConfig {
    @Bean
    public ConsumerFactory<String, ActivityTweet> consumerFactory() {
        Map<String, Object> config = new HashMap<String,Object>();
        JsonDeserializer<ActivityTweet> deserializer = new JsonDeserializer<ActivityTweet>(ActivityTweet.class);
        deserializer.setRemoveTypeHeaders(false);
        deserializer.addTrustedPackages("*");
        deserializer.setUseTypeMapperForKey(true);
        config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        config.put(ConsumerConfig.GROUP_ID_CONFIG, "group_id");
        config.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        config.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, deserializer);
        config.put(JsonDeserializer.TRUSTED_PACKAGES, "*");
        return new DefaultKafkaConsumerFactory<>(config, new StringDeserializer(), deserializer);
    }
    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, ActivityTweet> kafkaListenerContainerFactory() {
        ConcurrentKafkaListenerContainerFactory<String, ActivityTweet> factory = new ConcurrentKafkaListenerContainerFactory();
        factory.setConsumerFactory(consumerFactory());
        return factory;
    }
}
