package com.ecjtu.dao;

import com.ecjtu.pojo.Room;
import com.ecjtu.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoomMapper {
    //模糊查询的方法
    List<Room> findRoomByRoom(Room room);

    int addRoom(Room room);
    int deleteRoom(int roomid);
    int updateRoom(Room room);
}
