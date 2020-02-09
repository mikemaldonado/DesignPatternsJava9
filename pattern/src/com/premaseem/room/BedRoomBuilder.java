package com.premaseem.room;

public class BedRoomBuilder implements RoomBuilder {
    private Room room;
    public BedRoomBuilder() {
        this.room = new Room();
    }

    @Override
    public RoomBuilder buildFloor() {
        room.setFloorType("Wood floor");
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
