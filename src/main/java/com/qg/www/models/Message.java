package com.qg.www.models;

import lombok.Getter;
import lombok.Setter;

/**
 * @author linxu
 * @version 1.5
 * 动态消息实体类；
 */
@Setter
@Getter
public class Message {
    /**
     * 消息的编号；
     */
    private int messageId;
    /**
     * 消息的发生时间；
     */
    private String time;
    /**
     * 消息的内容；
     */
    private String content;
    /**
     * 操作人ID
     */
    private int operatorId;
    /**
     * 操作人昵称
     */
    private String operatorName;
    /**
     *用户ID；
     */
    private int userId;
    /**
     * 用户昵称
     */
    private String userName;
    /**
     * 动作名称；
     */
    private String action;
    /**
     * 根组别名称；
     */
    private String rootPath;
}

