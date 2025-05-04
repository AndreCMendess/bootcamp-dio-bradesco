package com.springestudos.estudos_spring;

import org.springframework.stereotype.Component;

@Component
public class Logger {

    public void log(String msg) {
        System.out.println("[LOG] " + msg);
    }
}
