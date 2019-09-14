package com.stackroute.config;

import com.stackroute.model.ActivityTweet;
import com.stackroute.model.AnalyzedActivityTweet;
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
public class KafkaConfiguration {
  @Bean
  public ConsumerFactory<String, AnalyzedActivityTweet> consumerFactory() {
    Map<String, Object> config = new HashMap<>();
    JsonDeserializer<AnalyzedActivityTweet> deserializer = new JsonDeserializer<>(AnalyzedActivityTweet.class);
    deserializer.setRemoveTypeHeaders(false);
    deserializer.addTrustedPackages("*");
    deserializer.setUseTypeMapperForKey(true);
//
    config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092");
    config.put(ConsumerConfig.GROUP_ID_CONFIG, "group_id");
    config.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
//        config.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
    config.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, deserializer);
    return new DefaultKafkaConsumerFactory<>(config, new StringDeserializer(), deserializer);
  }


  @Bean
  public ConcurrentKafkaListenerContainerFactory<String, AnalyzedActivityTweet> kafkaListenerContainerFactory() {
    ConcurrentKafkaListenerContainerFactory<String, AnalyzedActivityTweet> factory = new ConcurrentKafkaListenerContainerFactory();
    factory.setConsumerFactory(consumerFactory());
    return factory;
  }

}
