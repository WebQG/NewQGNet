package com.qg.www.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 用以包装JSON中的data;
 * 所有字段统一为小写，用于区别。
 *
 * @author linxu
 * @version 1.0
 */
@Setter
@Getter
public class Data {
    /**
     * 用户邮箱；
     */
    private String email;

    /**
     * 密码；
     */
    private String password;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 新的昵称
     */
    private String newNickName;

    /**
     * 验证码
     */
    private String verifyCode;

    /**
     * 用户列表
     */
    private List<User> users;

    private int status;
    private String filePath;
    private int fileId;
    private int userId;

    private String fileName;
    private String newFileName;
    private int operatorID;
    private List<Message> messages;

    private User user;
    private List<NetFile> files;

    public Data() {
    }

    /**
     * 初始化用户数据的方法；
     *
     * @param user 用户
     */
    public Data(User user) {
        this.email = user.getEmail();
        this.password = user.getPassword();
        this.nickName = user.getNickName();
        this.status = user.getStatus();
        this.userId = user.getUserId();
    }
}
