package com.javashitang.autoconfigure.sso;

import com.javashitang.tool.OperStatus;

/**
 * @author lilimin
 * @since 2020-05-30
 */
public interface SsoServerClient {

    /**
     * 验证用户权限
     */
    OperStatus checkAuth(String token);
}
