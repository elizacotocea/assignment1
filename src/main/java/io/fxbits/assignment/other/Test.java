package io.fxbits.assignment.other;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author Dana Ciubancan
 **/
@Component
public class Test {

    @PostConstruct
    public void constructMessage(){
        System.out.println("Test is initialized!");

    }

    @PreDestroy
    public void destroyMessage(){
        System.out.println("Test is destroyed!");
    }
}
