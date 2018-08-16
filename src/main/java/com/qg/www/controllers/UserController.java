package com.qg.www.controllers;

import com.qg.www.models.Data;
import com.qg.www.models.DataPack;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * @author net
 * @version 2.0
 * 用户操作控制类
 */
@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserController {

    /**
     * 发送邮箱验证码
     *
     * @param email      被发送邮件的账号
     * @param isRegister 是否是注册操作
     * @return 状态码
     */
    @GetMapping("/sendverifycode")
    public DataPack sendVerifyCode(String email, @RequestParam("isregister") String isRegister) {
        return null;
    }

    /**
     * 用户注册
     *
     * @param data 邮箱、密码、昵称、邮箱验证码
     * @return 状态码和用户信息
     */
    @PostMapping("/register")
    public DataPack register(@RequestBody Data data) {
        return null;
    }

    /**
     * 用户登录
     *
     * @param data 邮箱、密码
     * @return 状态码和用户信息
     */
    @PostMapping("/login")
    public DataPack login(@RequestBody Data data) {
        return null;
    }

    /**
     * 验证邮箱和验证码
     * @param data 邮箱、验证码
     * @return 状态码
     */
    @PostMapping("/validateverifycode")
    public DataPack validateVerifyCode(@RequestBody Data data){
        return null;
    }

    /**
     * 通过邮箱更新密码
     * @param data 邮箱、新密码
     * @return 状态码
     */
    @PostMapping("resetpassword")
    public DataPack reSetPassword(@RequestBody Data data){
        return null;
    }

    /**
     * 修改个人昵称
     * @param newNickName 新的昵称
     * @param userId 用户ID
     * @return 状态码、用户个人信息
     */
    @GetMapping("modifynickname")
    public DataPack updateNickName(@RequestParam("newnickname") String newNickName, @RequestParam("userid") int userId){
        return null;
    }

    /**
     * 修改个人密码
     * @param data yonghuID、新秘密
     * @return 状态码、个人信息
     */
    @PostMapping("/modifypassword")
    public DataPack modifyPassword(@RequestBody Data data){
        return null;
    }

}
