# swaggerDemo
springboot整合swagger2

swagger2常用注解：
####@Api("用于注解测试接口类")
####@ApiOperation(value="登陆", notes="备注说明，用于注册接口方法")
####@ApiResponses({
        @ApiResponse(code=200, message="正常", response = String.class)
})//用于注册返回，粒度较粗
####@ApiImplicitParams({
        @ApiImplicitParam(name="年龄", paramType = "form", dataType = "String")
})//用于注解参数，注意如果参数是javaBean的话，需要使用以下注解。
####@ApiModel("用于测试的javaBean")
####@ApiModelProperty("用户名")//用于注解javaBean的属性


