package com.premaseem.room;

interface RoomBuilder {
    public RoomBuilder buildFloor();
    public RoomBuilder buildWalls();
    public RoomBuilder buildWindows();
    public Room build();
}
