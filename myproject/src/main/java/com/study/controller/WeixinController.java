package com.study.controller;

import com.study.service.WeixinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author peterche
 * @description:
 * @date 2023-11-06
 */
@RestController
@RequestMapping("/weixin")
public class WeixinController {

    @Autowired
    private WeixinService weixinService;

    @GetMapping("/sendTemplateMsg")
    public String sendTemplateMsg(@RequestParam("openid") String openid) {
        return weixinService.sendTemplateMsg(openid);
    }
}
