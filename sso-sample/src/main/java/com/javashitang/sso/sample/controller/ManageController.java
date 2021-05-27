package com.javashitang.sso.sample.controller;

import com.javashitang.tool.OperStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lilimin
 * @since 2020-05-30
 */
@RestController
@RequestMapping("manage")
public class ManageController {

    @RequestMapping("getInfo")
    public OperStatus getInfo() {
        return OperStatus.newSuccess("获取管理信息");
    }
}
