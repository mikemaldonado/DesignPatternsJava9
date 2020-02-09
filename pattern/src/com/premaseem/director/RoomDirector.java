package com.premaseem.director;

import com.premaseem.room.Room;
import com.premaseem.room.RoomBuilder;

public class RoomDirector {
    private RoomBuilder roomBuilder;

    public RoomDirector(final RoomBuilder roomBuilder) {
        this.roomBuilder = roomBuilder;
    }

    public void setRoomBuilder(final RoomBuilder roomBuilder) {
        this.roomBuilder = roomBuilder;
    }

    public Room construct() {
        return roomBuilder.buildFloor().buildWalls().buildWindows().build();
    }
}
