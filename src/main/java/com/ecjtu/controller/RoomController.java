package com.ecjtu.controller;

import com.ecjtu.pojo.DataVo;
import com.ecjtu.pojo.Role;
import com.ecjtu.pojo.Room;
import com.ecjtu.pojo.User;
import com.ecjtu.service.RoomService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class RoomController {
    @Resource
    RoomService roomService;
    //跳转至room.jsp
    @RequestMapping("/sys/room")
    public String user(){
        //获取角色权限的所有值传递到user.jsp页面
        return "room";
    }
    @RequestMapping("/getAllRoom")
    @ResponseBody //不返回视图，直接写入页面
    //返回给layui使用，返回值必须包含某些字段
    public DataVo getAllUsers(@RequestParam(defaultValue = "1") Integer page,
                              @RequestParam(defaultValue = "8") Integer limit,
                              @RequestParam(required = false,value = "roomid")Integer roomid,
                              @RequestParam(required = false,value = "roomtype")String roomtype,
                              @RequestParam(required = false,value = "state")String state){
        //初始化查询的User对象
        Room room = new Room(roomid,roomtype,state);
        //设置分页的参数
        PageHelper.startPage(page,limit);//设置当前页和每页的数量
        //获取数据
        List<Room> list = roomService.getRoom(room);
        //获取分页的信息,将要分页的数据给分页工具
        PageInfo<Object> pageInfo = new PageInfo(list);
        //封装的layui数据根据分页对象来获取
        DataVo userVo = new DataVo(pageInfo.getList(),(int)pageInfo.getTotal());
        return userVo;
    }
    //添加用户的请求
    @RequestMapping("/addRoom")
    @ResponseBody
    public String addRoom(Room room){
        int a = roomService.addRoom(room);
        if(a>0){
            return "添加成功!";
        }else{
            return "添加失败!";
        }
    }
    //添加用户的请求
    @RequestMapping("/updateRoom")
    @ResponseBody
    public String updateRoom(Room room){
        int a = roomService.updateRoom(room);
        if(a>0){
            return "修改成功!";
        }else{
            return "修改失败!";
        }
    }
    //批量删除的方法
    @RequestMapping("/deleteRoom")
    @ResponseBody
    public String deleteUser(int roomid){
        int a = roomService.deleteRoom(roomid);
        if(a>0){
            return "删除"+a+"个房间成功!";
        }else{
            return "删除失败!";
        }
    }


}
