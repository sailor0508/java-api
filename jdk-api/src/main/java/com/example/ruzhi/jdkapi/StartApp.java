/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.example.ruzhi.jdkapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author chunlong.wchl
 * @version $Id: Example.java, v 0.1 2018年04月21日 下午2:20 chunlong.wchl Exp $
 */

@EnableAutoConfiguration
@ComponentScan
@RestController
public class StartApp {
    public static void main(String[] args) {
        SpringApplication.run(StartApp.class, args);
    }

    @RequestMapping("/hello")
    public String hello() {
        return "Hello world!";
    }
}