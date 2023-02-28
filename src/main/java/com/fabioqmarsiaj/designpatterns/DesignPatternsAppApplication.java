package com.fabioqmarsiaj.designpatterns;

import com.fabioqmarsiaj.designpatterns.prototype.PrototypeFalse;
import com.fabioqmarsiaj.designpatterns.prototype.PrototypeTrue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class DesignPatternsAppApplication {
    public static void main(String[] args) {
        SpringApplication.run(DesignPatternsAppApplication.class, args);
    }

    @Bean
    public PrototypeFalse prototypeFalse(){
        return new PrototypeFalse();
    }

    @Bean
    @Scope("prototype")
    public PrototypeTrue prototypeTrue(){
        return new PrototypeTrue();
    }
}
