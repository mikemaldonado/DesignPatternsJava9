package com.premaseem.director;

import com.premaseem.builder.House;
import com.premaseem.builder.HouseBuilder;

/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
*/

/* "Director" */
public class Architect {

    private HouseBuilder houseBuilder;

    public Architect(final HouseBuilder houseBuilder) { this.houseBuilder = houseBuilder; }

    public void construct() {
        houseBuilder.addRooms()
        .addPlumbingSystem()
        .addAirConditionerSystem()
        .addSecuritySystem()
        .paintHouse("white");
    }

    public House getFinishedHouse(){
        return houseBuilder.build();
    }
}
