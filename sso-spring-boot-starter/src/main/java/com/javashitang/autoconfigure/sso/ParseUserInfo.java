package com.javashitang.autoconfigure.sso;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.http.HttpServletRequest;

@Slf4j
public class ParseUserInfo {

    private static String USER_ATTRIBUTE_NAME = "userInfo";

    public static UserBaseInfo parseFromRequest(HttpServletRequest request) {
        UserBaseInfo userBaseInfo = (UserBaseInfo) request.getAttribute(USER_ATTRIBUTE_NAME);
        // 不会发生，但还是判断一下
        if (userBaseInfo == null) {
            log.error("failed get userBaseInfo from request");
        }
        return userBaseInfo;
    }

    public static void setToRequest(HttpServletRequest request, UserBaseInfo userBaseInfo) {
        request.setAttribute(USER_ATTRIBUTE_NAME, userBaseInfo);
    }
}
