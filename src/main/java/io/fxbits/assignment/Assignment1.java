package io.fxbits.assignment;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Dana Ciubancan
 **/
public class Assignment1 {

    public static void main(String[] args) {

        System.out.println("--------------------START-------------------");


        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);

        Traveler traveler = ctx.getBean(Traveler.class);
        traveler.setVehicle(ctx.getBean(Bus.class));
        traveler.travel();

        traveler.setVehicle(ctx.getBean(Vehicle.class));
        traveler.travel();

        System.out.println("Bye!");


        ctx.close();
        System.out.println("--------------------END-------------------");

    }
}
