package com.study.service;

import org.springframework.web.multipart.MultipartFile;

public interface ObsService {

    String uploadFile(String logId, MultipartFile file);

    String uploadFile2(MultipartFile file);
}
