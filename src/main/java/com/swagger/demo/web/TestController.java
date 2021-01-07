package com.swagger.demo.web;

import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api("用于测试Swagger的类")
public class TestController {

    @RequestMapping(value = "/login", method = {RequestMethod.POST})
    @ResponseBody
    @ApiOperation(value="登陆", notes="备注说明")
    @ApiImplicitParams({
            @ApiImplicitParam(name="年龄", paramType = "form", dataType = "String")
    })
    @ApiResponses({
            @ApiResponse(code=200, message="正常", response = String.class)
    })
    public String view01(TestBean testBean, String age) {
        return "test";
    }
}
