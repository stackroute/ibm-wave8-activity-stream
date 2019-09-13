package com.stackroute.upstream.config;

<<<<<<< HEAD
import com.ibm.common.activitystreams.Activity;
import com.stackroute.model.Tweet;
import com.stackroute.upstream.domain.ActivityTweet;
import com.stackroute.upstream.domain.MyCustomTweet;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.ByteArraySerializer;
import org.apache.kafka.common.serialization.Serializer;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.support.serializer.JsonSerializer;
import org.springframework.stereotype.Component;

import javax.swing.*;
=======
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.ByteArraySerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;

>>>>>>> 7bcf257ee55423b583da4dd05967c9fdd3e547d2
import java.util.HashMap;
import java.util.Map;

@Configuration
<<<<<<< HEAD
@EnableKafka
public class UpstreamKafkaProducerConfig {

    @Bean
    public ProducerFactory<String, ActivityTweet> producerFactory() {
        Map<String, Object> config = new HashMap<>();
        config.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092");
        config.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        config.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);
        return new DefaultKafkaProducerFactory<String, ActivityTweet>(config);
    }

    @Bean
    public KafkaTemplate<String, ActivityTweet> kafkaTemplate() {

        return new KafkaTemplate<String, ActivityTweet>(producerFactory());
    }

}

=======
public class UpstreamKafkaProducerConfig {

    @Bean
    public ProducerFactory<byte[], byte[]> producerFactory() {
        Map<String, Object> config = new HashMap<>();
        config.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092");
        config.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, ByteArraySerializer.class);
        config.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, ByteArraySerializer.class);
        return new DefaultKafkaProducerFactory<>(config);
    }

    @Bean
    public KafkaTemplate<byte[], byte[]> kafkaTemplate() {
        return new KafkaTemplate<>(producerFactory());
    }

}
>>>>>>> 7bcf257ee55423b583da4dd05967c9fdd3e547d2
