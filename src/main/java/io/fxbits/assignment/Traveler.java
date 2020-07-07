package io.fxbits.assignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author Dana Ciubancan
 **/
@Component
public class Traveler {

//    @Autowired
//    @Qualifier
    private Vehicle vehicle;

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void travel() {
        //...
        vehicle.ride();
    }
}
