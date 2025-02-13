package com.study.service;

import javax.servlet.http.HttpServletResponse;

public interface DataService {

    void exportFile(String channelId,HttpServletResponse response) throws Exception;
}
