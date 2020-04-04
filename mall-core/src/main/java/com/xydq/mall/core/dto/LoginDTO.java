package com.xydq.mall.core.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
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
public class LoginDTO implements Serializable {
    private static final long serialVersionUID = -4824121907622847661L;
    private String token;
    private String username;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Chongqing")
    private Date lastLoginTime;
    
}
