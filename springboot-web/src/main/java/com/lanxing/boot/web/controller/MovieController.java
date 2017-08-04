package com.lanxing.boot.web.controller;

import com.lanxing.boot.dao.mapper.MovieDetailModelDOMapper;
import com.lanxing.boot.dao.model.MovieDetailModelDO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author gaofan
 * @version 1.0
 * @date 2017/8/3 下午4:35
 * @desc 功能描述
 */
@RestController
@RequestMapping("movie")
public class MovieController {

    @Resource
    private MovieDetailModelDOMapper movieDetailModelDOMapper;

    @GetMapping("test")
    public MovieDetailModelDO getFirst(){
        MovieDetailModelDO movieDetailModelDO = movieDetailModelDOMapper.selectByPrimaryKey(1);
        return movieDetailModelDO;
    }

}
