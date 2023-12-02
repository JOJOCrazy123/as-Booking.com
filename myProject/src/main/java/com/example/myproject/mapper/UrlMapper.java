package com.example.myproject.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UrlMapper {
    //XML
    @Select("select url from myproject.urls where page = #{page} order by name ASC;")
    public List<String>GetUrlsAscOrderByName(String page);
}
