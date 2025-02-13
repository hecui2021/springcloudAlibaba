package com.study.pojo;

import java.util.Date;
import lombok.Data;

/**
 * @Author peterche
 * @Description
 * @Date 2023/10/17 19:33
 **/
@Data
public class User {

    private int id;

    private String name;

    private int age;

    private String addr;

    private Date createDate;

}
