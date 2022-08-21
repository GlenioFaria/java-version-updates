package com.cydeo;

import java.util.ArrayList;
import java.util.List;

public class OrangeTest {

    public static void main(String[] args) {

        List<Orange> inventory = new ArrayList<Orange>();

        inventory.add(new Orange(300, Color.GREEN));
        inventory.add(new Orange(100, Color.RED));
        inventory.add(new Orange(200, Color.GREEN));
        inventory.add(new Orange(500, Color.RED));

        OrangeFormatter orangeLambda = orange -> "An orange of "+orange.getWeight()+"g";
        prettyPrintOrange(inventory,orangeLambda);

        prettyPrintOrange(inventory,orange ->  "An orange of "+orange.getWeight()+"g");


    }

    private static void prettyPrintOrange(List<Orange> inventory, OrangeFormatter orangeFormatter){
        for (Orange each : inventory  ) {
            String output = orangeFormatter.accept(each);
            System.out.println(output);
        }

    }
}
