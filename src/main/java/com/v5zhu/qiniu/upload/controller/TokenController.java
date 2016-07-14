package com.v5zhu.qiniu.upload.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zhuxl@paxsz.com on 2016/7/14.
 */
@Controller
@RequestMapping(value = "uploader")
public class TokenController {

    @ResponseBody
    @RequestMapping(value = "/token",method = RequestMethod.GET)
    public ResponseEntity getToken(){
        String token="11111111111111111111111111111111";
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("token",token);
        return new ResponseEntity(jsonObject, HttpStatus.OK);
    }
}
