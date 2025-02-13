package com.study.service.impl;

import com.study.service.WeixinService;
import lombok.extern.slf4j.Slf4j;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.api.impl.WxMpServiceImpl;
import me.chanjar.weixin.mp.bean.template.WxMpTemplateData;
import me.chanjar.weixin.mp.bean.template.WxMpTemplateMessage;
import me.chanjar.weixin.mp.config.impl.WxMpDefaultConfigImpl;
import org.springframework.stereotype.Service;

/**
 * @author peterche
 * @description:
 * @date 2023-11-06
 */
@Service
@Slf4j
public class WeixinServiceImpl implements WeixinService {


    @Override
    public String sendTemplateMsg(String openid) {
        return sendWeixinMsg(openid);
    }


    private String sendWeixinMsg(String openid) {
        try {
            WxMpService wxMpService = new WxMpServiceImpl();
            // 配置基本信息
            WxMpDefaultConfigImpl wxMpDefaultConfig = new WxMpDefaultConfigImpl();
            wxMpDefaultConfig.setAppId("wxc376efbe62e7f425");
            wxMpDefaultConfig.setSecret("75c306936559a73d5f7ada609a73c914");
            // 设置基本信息
            wxMpService.setWxMpConfigStorage(wxMpDefaultConfig);
            // 配置模板信息
            WxMpTemplateMessage wxMpTemplateMessage = new WxMpTemplateMessage();
            // 发送的模板信息
            wxMpTemplateMessage.setTemplateId("o4JXmPv9B0ODlYImlmOAg1XHQezjuuDdJiZYtzE01e4");
            // 接收人
            wxMpTemplateMessage.setToUser(openid);

            wxMpTemplateMessage.addData(new WxMpTemplateData("driver_location", "湖北省武汉市江夏区腾讯研发中心", "#9370DB"));
            wxMpTemplateMessage.addData(new WxMpTemplateData("driver_time", "2023年11月06日 18:45:30", "#87CEFA"));
            wxMpTemplateMessage.addData(new WxMpTemplateData("driver_user", "peterche", "#87CEEB"));
            wxMpTemplateMessage.addData(new WxMpTemplateData("now_wind_dir", "东北风三级", "#708090"));
            wxMpTemplateMessage.addData(new WxMpTemplateData("now_wind_class", "三级", "#708090"));
            wxMpTemplateMessage.addData(new WxMpTemplateData("now_rh", "17", "#778899"));
            wxMpTemplateMessage.addData(new WxMpTemplateData("today_weather", "多云", "#FFC1C1"));
            wxMpTemplateMessage.addData(new WxMpTemplateData("today_high", "27", "#CD9B9B"));
            wxMpTemplateMessage.addData(new WxMpTemplateData("today_low", "19", "#CD9B9B"));
            wxMpTemplateMessage.addData(new WxMpTemplateData("tomorrow_weather", "太阳", "#DDA0DD"));
            wxMpTemplateMessage.addData(new WxMpTemplateData("tomorrow_high", "28", "#EE82EE"));
            wxMpTemplateMessage.addData(new WxMpTemplateData("daily_english_en1", "dede", "#FFCCFF"));
            wxMpTemplateMessage.addData(new WxMpTemplateData("daily_english_en2", "efer", "#FFCCFF"));
            wxMpTemplateMessage.addData(new WxMpTemplateData("daily_english_cn1", "武汉", "#CCCCFF"));
            wxMpTemplateMessage.addData(new WxMpTemplateData("daily_english_cn2", "江夏", "#CCCCFF"));


            wxMpTemplateMessage.addData(new WxMpTemplateData("car", "鄂AD71636", "#CCCCFF"));
            wxMpTemplateMessage.addData(new WxMpTemplateData("music", "一生所爱", "#CCCCFF"));

            wxMpTemplateMessage.setUrl("https://c6.y.qq.com/base/fcgi-bin/u?__=beJOpZXmLDGo");

//            WxMpTemplateMessage.MiniProgram miniProgram = new WxMpTemplateMessage.MiniProgram();
//            miniProgram.setAppid("wxbd56b62a13d242d2");
//            miniProgram.setPagePath("/modules/trails/pages/shareloc/shareloc?shareId=d5b1e357-6ca6-11ee-a33a-8b3718ec2f84&wecarId=630c30e99d273701ae080d25");
//            wxMpTemplateMessage.setMiniProgram(miniProgram);

            // 打印模板内容
            System.out.printf(">>> 模板内容：%s%n", wxMpTemplateMessage.toJson());
            // 发送
            String result = wxMpService.getTemplateMsgService().sendTemplateMsg(wxMpTemplateMessage);
            log.info("result:{}",result);
            return result;
        } catch (Exception e) {
            log.info("sendWeixinMsg error",e);
        }
        return null;
    }
}
