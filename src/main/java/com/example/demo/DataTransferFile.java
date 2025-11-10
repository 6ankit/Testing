package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class DataTransferFile {
    private static final Logger logger = LoggerFactory.getLogger(DataTransferFile.class);

    @Async("testExecutor")
    public void greet(){
        logger.info(Thread.currentThread().getName());
    }
}
