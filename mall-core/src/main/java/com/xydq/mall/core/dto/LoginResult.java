package com.xydq.mall.core.dto;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author wanghuaidong
 * @date 2020/4/4
 */
@Data
@Builder
public class LoginResult implements Serializable {
    private static final long serialVersionUID = -4824121907622847661L;
    private String token;
    private String username;
    private Date lastLoginTime;
    
}
