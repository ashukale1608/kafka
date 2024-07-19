package com.delivaryboy.kfka_first_project.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class kafkaConfig {

    @Bean
    public NewTopic topic(){

        return TopicBuilder.name(AppConstant.LOCATION_TOPIC_NAME).build();

    }
    
}
