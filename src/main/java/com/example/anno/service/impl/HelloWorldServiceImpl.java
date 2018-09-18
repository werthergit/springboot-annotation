package com.example.anno.service.impl;


import com.example.anno.annotation.AnalysisActuator;
import com.example.anno.service.IHelloWorldService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class HelloWorldServiceImpl implements IHelloWorldService {

    @AnalysisActuator(note = "获取聊天信息方法")
    @Override
    public String getHelloMessage(String name) {
        return "Hello " + Optional.ofNullable(name).orElse("World!");
    }

}