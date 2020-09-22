package com.sansui.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket buildDocket(){

        return new Docket(DocumentationType.SWAGGER_2)
                //将API的元信息设置为包含在json resourcelisting响应中
                .apiInfo(buildApiInfo())
                //启动用于API选择的生成器
                .select()
                //可以指定controller的路径
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any()).build();

    }
    private ApiInfo buildApiInfo(){
        return new ApiInfoBuilder()
                //标题
                .title("sansui西西里APi")
                //简介
                .description("XXLsansui")
                .termsOfServiceUrl("")
                //作者信息
                .contact(new Contact("sansui","https://blog.csdn.net/SanSuiBuSha","xxlsansui@163.com"))
                //.contact(new springfox.documentation..service.Contact("sansui","",""))
                .version("1.0")
                .build();
    }

}
