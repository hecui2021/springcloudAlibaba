package com.study.controller;

import com.study.service.ObsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author peterche
 * @description:
 * @date 2025-04-24
 */
@RestController
@RequestMapping("/obs")
public class ObsController {

    @Autowired
    private ObsService obsService;

    /**
     * 上传excel导入
     * @param file
     * @return
     */
    @PostMapping("/uploadFile")
    public String uploadFile(@RequestHeader("logId") String logId,
                                       @RequestPart("file") MultipartFile file) {
        return obsService.uploadFile(logId, file);
    }

    @PostMapping("/uploadFile2")
    public String uploadFile2(@RequestPart("file") MultipartFile file) {
        return obsService.uploadFile2(file);
    }

}
