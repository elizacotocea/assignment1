package io.fxbits.assignment;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author Dana Ciubancan
 **/
@Component
@Primary
public class Car implements Vehicle {

    @Override
    public void ride() {
        System.out.println("vum vum");
    }
}
