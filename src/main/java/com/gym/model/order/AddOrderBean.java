package com.gym.model.order;

import lombok.Data;

/**
 * business:
 * Author:easy
 * Date:19/10/14 下午6:19
 */
@Data
public class AddOrderBean {

    private int id;
    private String userId;
    private String gymId;
    private double price;
    private String createTime;
    private String startTime;
    private String endTime;
    private String content;
    private int type;
    private int status;
} 