package com.xydq.mall.wx.model.param;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

/**
 * @author wanghuaidong
 * @date 2020/4/4
 */
@Data
public class RegisterParam implements Serializable {
    private static final long serialVersionUID = 7587670180584347807L;
    @NotEmpty(message = "手机号码不可为空")
    private String mobile;
    @NotEmpty(message = "密码不可为空")
    private String password;

}
