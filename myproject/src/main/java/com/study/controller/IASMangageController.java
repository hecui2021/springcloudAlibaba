package com.study.controller;

import com.alibaba.fastjson.JSONObject;
import com.study.service.IASMangageService;
import com.study.vo.BaseListVO;
import com.study.vo.IASDomainVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 * @author peterche
 * @description:
 * @date 2024-12-20
 */
@RestController
@RequestMapping("/ias")
@Slf4j
public class IASMangageController {

    @Autowired
    private IASMangageService iasMangageService;

    @RequestMapping("/exportFile")
    public void exportFile(HttpServletResponse response) throws Exception {
        iasMangageService.exportFile(response);
    }

    @RequestMapping("/ListDomain")
    public BaseListVO<IASDomainVO> listDomain() {

        Set<String> domainSet = new HashSet<>();

        BaseListVO<IASDomainVO> baseListVO = iasMangageService.listDomain();
        for (IASDomainVO iasDomainVO : baseListVO.getList()) {
            JSONObject data = iasMangageService.getDomain(iasDomainVO.getId());
            IASDomainVO domain = JSONObject.toJavaObject(data, IASDomainVO.class);
            BeanUtils.copyProperties(domain, iasDomainVO);
            domainSet.add(iasDomainVO.getDomain());
        }
        return baseListVO;
    }

    @RequestMapping("/GetDomain")
    public JSONObject getDomain(@RequestParam("id") String id) {
        log.info("getDomain date:{}", new Date());

        return iasMangageService.getDomain(id);
    }

    @RequestMapping("/ListDomainVip")
    public Set<String> listDomainVip(@RequestParam("id") String id) {
        return iasMangageService.listDomainVip(id);
    }



}
