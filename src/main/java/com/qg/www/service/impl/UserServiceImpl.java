package com.qg.www.service.impl;

import com.google.gson.GsonBuilder;
import com.qg.www.enums.Status;
import com.qg.www.models.Data;
import com.qg.www.models.DataPack;
import com.qg.www.service.UserService;
import com.qg.www.utils.RandomVerifyCodeUtil;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author net
 * @version 2.0
 * 用户业务实现类
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    /**
     * 发送邮箱验证码
     *
     * @param email      被发送邮件的账号
     * @param isRegister 是否是注册操作
     * @return 状态码
     */
    @Override
    public DataPack sendVerifyCode(String email, String isRegister) {
        /*//随机生成验证码；
        String verifyCode = RandomVerifyCodeUtil.getVerifyCode();
        UserServiceImpl userService = new UserServiceImpl();
        //获取封装数据；
        DataPack dataPack = userService.sendMail(email, verifyCode, isRegister);
        //如果正常发送邮件,则创建全局存储；
        if (Status.NORMAL.getStatus().equals(dataPack.getStatus())){
            //如果发送成功,创建ServletContext的map;
            Map<String, String> map = new HashMap<>(16);
            map.put(email, verifyCode);
            req.getServletContext().setAttribute("map", map);
        }
        //照常响应；
        resp.getWriter().print(new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create().toJson(dataPack));*/
        return null;
    }

    /**
     * 用户注册
     *
     * @param data 邮箱、密码、昵称、邮箱验证码
     * @return 状态码和用户信息
     */
    @Override
    public DataPack register(Data data) {
        return null;
    }

    /**
     * 用户登录
     *
     * @param data 邮箱、密码
     * @return 状态码和用户信息
     */
    @Override
    public DataPack login(Data data) {
        return null;
    }

    /**
     * 验证邮箱和验证码
     *
     * @param data 邮箱、验证码
     * @return 状态码
     */
    @Override
    public DataPack validateVerifyCode(Data data) {
        return null;
    }

    /**
     * 通过邮箱更新密码
     *
     * @param data 邮箱、新密码
     * @return 状态码
     */
    @Override
    public DataPack reSetPassword(Data data) {
        return null;
    }

    /**
     * 修改个人昵称
     *
     * @param newNickName 新的昵称
     * @param userId      用户ID
     * @return 状态码、用户个人信息
     */
    @Override
    public DataPack updateNickName(String newNickName, int userId) {
        return null;
    }

    /**
     * 修改个人密码
     *
     * @param data 用户ID、新密码
     * @return 状态码、个人信息
     */
    @Override
    public DataPack modifyPassword(Data data) {
        return null;
    }
}
