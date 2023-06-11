package com.ecjtu.service;

import com.ecjtu.pojo.Room;

import java.util.List;

public interface RoomService {
    List<Room> getRoom(Room room);

    public int addRoom(Room room);
    public int deleteRoom(int roomid);
    public int updateRoom(Room room);
}
