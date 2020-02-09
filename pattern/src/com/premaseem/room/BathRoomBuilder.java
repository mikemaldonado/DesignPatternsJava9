package com.premaseem.room;

public class BathRoomBuilder implements RoomBuilder {
    private Room room;
    public BathRoomBuilder() {
        this.room = new Room();
    }

    @Override
    public RoomBuilder buildFloor() {
        room.setFloorType("Tile");
        return this;
    }

    @Override
    public RoomBuilder buildWalls() {
        room.setNumberOfWalls(4);
        return this;
    }

    @Override
    public RoomBuilder buildWindows() {
        room.setNumberOfWindows(1);
        return this;
    }

    @Override
    public Room build() {
        return room;
    }

}
