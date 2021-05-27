package com.javashitang.sso.server.service.impl;

import com.javashitang.autoconfigure.sso.SsoServerClient;
import com.javashitang.sso.server.service.inf.TokenService;
import com.javashitang.tool.OperStatus;
import org.apache.commons.lang3.StringUtils;
import org.apache.dubbo.config.annotation.Service;

import javax.annotation.Resource;

/**
 * @author lilimin
 * @since 2021-05-27
 */
@Service
public class SsoServerClientImpl implements SsoServerClient {

    @Resource
    private TokenService tokenService;

    @Override
    public OperStatus checkAuth(String token) {
        if (StringUtils.isBlank(token)) {
            return OperStatus.newParamInvalid("token不能为空");
        }
        return tokenService.checkAuth(token);
    }
}
