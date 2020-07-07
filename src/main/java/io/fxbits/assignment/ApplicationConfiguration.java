package io.fxbits.assignment;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Dana Ciubancan
 **/
@Configuration
@ComponentScan
public class ApplicationConfiguration {

    public Bus getNewBus(){
        return new Bus();
    }
}
