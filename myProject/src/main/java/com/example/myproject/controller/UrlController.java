package com.example.myproject.controller;

import com.example.myproject.pojo.Result;
import com.example.myproject.service.UrlService;
import com.example.myproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UrlController {
    @Autowired
    private UrlService urlService;

    @GetMapping("/urls")
    public Result GetUrlsAscOrderByName(String page){
        List<String> urls = urlService.GetUrlsAscOrderByName(page);
        if(urls.isEmpty()) {
            return Result.error("获取url失败！");
        }
        else {
            return Result.success(urls);
        }
    }
}
