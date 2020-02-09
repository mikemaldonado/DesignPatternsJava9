package com.premaseem;

import com.premaseem.builder.House;
import com.premaseem.builder.OneBedroomHouseBuilder;
import com.premaseem.director.Architect;

/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
*/
public class Client {
    public static void main (String[] args) {
        System.out.println("Builder Design pattern example ");
        Architect architect = new Architect(new OneBedroomHouseBuilder());

        // Hiding complexity and building one bed room house
        architect.construct();
        House house = architect.getFinishedHouse();
        System.out.println(house);

    }
}
