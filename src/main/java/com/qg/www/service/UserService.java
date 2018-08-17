package com.qg.www.service;

import com.qg.www.models.Data;
import com.qg.www.models.DataPack;

/**
 * @author net
 * @version 2.0
 * 用户业务接口
 */
public interface UserService {

    /**
     * 发送邮箱验证码
     *
     * @param email      被发送邮件的账号
     * @param isRegister 是否是注册操作
     * @return 状态码
     */
    DataPack sendVerifyCode(String email, String isRegister);

    /**
     * 用户注册
     *
     * @param data 邮箱、密码、昵称、邮箱验证码
     * @return 状态码和用户信息
     */
    DataPack register(Data data);

    /**
     * 用户登录
     *
     * @param data 邮箱、密码
     * @return 状态码和用户信息
     */
    DataPack login(Data data);

    /**
     * 验证邮箱和验证码
     *
     * @param data 邮箱、验证码
     * @return 状态码
     */
    DataPack validateVerifyCode(Data data);

    /**
     * 通过邮箱更新密码
     *
     * @param data 邮箱、新密码
     * @return 状态码
     */
    DataPack reSetPassword(Data data);

    /**
     * 修改个人昵称
     *
     * @param newNickName 新的昵称
     * @param userId      用户ID
     * @return 状态码、用户个人信息
     */
    DataPack updateNickName(String newNickName, int userId);

    /**
     * 修改个人密码
     *
     * @param data 用户ID、新密码
     * @return 状态码、个人信息
     */
    DataPack modifyPassword(Data data);
}
