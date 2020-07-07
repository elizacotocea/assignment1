package io.fxbits.assignment.other;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author Dana Ciubancan
 **/
@Component
public class Example {

    @PostConstruct
    public void constructMessage(){
        System.out.println("Example is initialized!");

    }

    @PreDestroy
    public void destroyMessage(){
        System.out.println("Example is destroyed!");
    }
}
