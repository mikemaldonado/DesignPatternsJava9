package com.premaseem.room;

public interface RoomBuilder {
    public RoomBuilder buildFloor();
    public RoomBuilder buildWalls();
    public RoomBuilder buildWindows();
    public Room build();
}
