package com.swagger.demo.web;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel("用于测试的javaBean")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TestBean {
    @ApiModelProperty("用户ID")
    private String id;
    @ApiModelProperty("用户名")
    private String name;
}
