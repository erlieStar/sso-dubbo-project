package com.javashitang.autoconfigure.sso;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author lilimin
 * @since 2020-05-30
 * 用户信息
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserBaseInfo implements Serializable {

    private Integer id;

    private String username;

    private String token;
}