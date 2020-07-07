package io.fxbits.assignment;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Bus implements Vehicle{
    @Override
    public void ride() {
        System.out.println("vum vum with the bus");
    }
}
