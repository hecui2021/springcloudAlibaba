package com.study.controller;

import com.study.service.DataService;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/data")
public class DataController {

    @Autowired
    private DataService dataService;

    /**
     * 导出excel
     * @param response
     */
    @GetMapping("/exportFile")
    public void exportFile(@RequestParam("channelId") String channelId,HttpServletResponse response) throws Exception{
        dataService.exportFile(channelId,response);
    }


}
