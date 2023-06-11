package com.ecjtu.pojo;

import lombok.Data;

@Data
public class Room {
    private Integer roomid;
    private String roomtype;
    private double price;
    private String state;

    public Room() {
    }

    public Room(Integer roomid, String roomtype, String state) {
        this.roomid = roomid;
        this.roomtype = roomtype;
        this.state = state;
    }
}
