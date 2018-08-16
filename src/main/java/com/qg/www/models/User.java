package com.qg.www.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

/**
 * user实体类
 *
 * @author net
 * @version 2.0
 */
@Setter
@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class User {
    private Integer userId;

    private String email;

    private String password;

    private String nickName;

    private Integer status;
}