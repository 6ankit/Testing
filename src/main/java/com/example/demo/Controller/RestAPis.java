package com.example.demo.Controller;

import com.example.demo.AgeLessThanEighteenException;
import com.example.demo.DataTransferFile;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;

import javax.xml.crypto.Data;

@RestController
public class RestAPis {

    @Autowired
    private DataTransferFile dtf;

    private static final Logger logger = LoggerFactory.getLogger(RestAPis.class);

    @GetMapping("/greet")
     public String gt(){
        return "This is not the authenticated one";
    }
    @PostMapping("/nottrackedbygit")
    public String getTracked(){
        return "Hello singh";
    }
}
