package com.premaseem.builder;

import com.premaseem.director.RoomDirector;
import com.premaseem.room.*;

/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
*/

/* "ConcreteBuilder" */
public class TwoBedroomHouseBuilder extends HouseBuilder{

    @Override
    public HouseBuilder addRooms () {
        RoomDirector roomDirector = new RoomDirector(new BathRoomBuilder());
        house.rooms.add(roomDirector.construct());
        roomDirector.setRoomBuilder(new BedRoomBuilder());
        house.rooms.add(roomDirector.construct());
        house.rooms.add(new LivingRoom());
        return this;
    }
}
