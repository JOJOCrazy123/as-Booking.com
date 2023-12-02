package com.example.myproject.service.impl;

import com.example.myproject.mapper.UrlMapper;
import com.example.myproject.service.UrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UrlServiceimpl implements UrlService {
    @Autowired
    private UrlMapper urlMapper;
    public List<String>GetUrlsAscOrderByName(String page){
        return urlMapper.GetUrlsAscOrderByName(page);
    }
}
