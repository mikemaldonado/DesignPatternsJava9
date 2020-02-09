package com.premaseem.builder;

/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
*/
/* "Abstract Builder" */
public abstract class HouseBuilder {
    public House build() {
        return house;
    }

    protected House house;

    public HouseBuilder(){
     house = new House();
   }

    public abstract HouseBuilder addRooms();

    public HouseBuilder addSecuritySystem(){
        System.out.println("adding security system");
        house.securitySystem = true;
        return this;
    }

    public HouseBuilder addPlumbingSystem(){
        System.out.println("adding plumbing system");
        house.setPlumbingSystem("Plubming System");
        return this;
    }

    public HouseBuilder addAirConditionerSystem(){
        System.out.println("adding air conditioning system");
        house.setAirConditioningSystem("Central Unit Air Conditioning");
        return this;
    }

    public HouseBuilder paintHouse(String color){
        System.out.println("paiting house with color " + color);
        house.setExteriorColor(color);
        return this;
    }

}
