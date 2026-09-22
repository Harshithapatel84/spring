package com.xworkz.monitor.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class TestComponent {
    public TestComponent(){
        System.out.println("test componenet is created");
    }

    @RequestMapping("/click")
    public String click(){
        System.out.println("running click");
        return "/test.jsp";
    }
}
