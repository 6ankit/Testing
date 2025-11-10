package com.example.demo.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

@Configuration
public class AppConfig {

    @Bean(name="testExecutor")
    public Executor config(){
        ThreadPoolTaskExecutor tpte = new ThreadPoolTaskExecutor();
        tpte.setCorePoolSize(3);
        tpte.setMaxPoolSize(5);
        tpte.setQueueCapacity(5);
        tpte.initialize();
        return tpte;
    }
}
