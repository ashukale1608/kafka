package com.delivaryboy.kfka_first_project.config;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class ConsumerConfig {
    
    @KafkaListener(topics = AppConstant.LOCATION_UPDATE_TOPIC,groupId = AppConstant.GROUP_ID )
    public void updatedLocation(String value){
        System.out.println(value);
    }
}
