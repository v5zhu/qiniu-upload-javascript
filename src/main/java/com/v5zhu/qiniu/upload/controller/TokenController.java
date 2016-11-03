package com.v5zhu.qiniu.upload.controller;

import com.alibaba.fastjson.JSONObject;
import com.qiniu.api.auth.AuthException;
import com.qiniu.api.auth.digest.Mac;
import com.qiniu.api.config.Config;
import com.qiniu.api.rs.PutPolicy;
import org.json.JSONException;
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
    @RequestMapping(value = "/uptoken",method = RequestMethod.GET)
    public ResponseEntity getToken(){
        //todo
        // 需要修改AK、SK、bucketName
        Config.ACCESS_KEY = "PkD6p_wYBOuLuFULsLBzHYgYEcDrl9l1jEfSjbzf";
        Config.SECRET_KEY = "tVcgMlqHzPnGiezSsPkglD6C47Yn0AR9tvzWZojE";
        Mac mac = new Mac(Config.ACCESS_KEY, Config.SECRET_KEY);
        String bucketName = "v5zhu";
        PutPolicy putPolicy = new PutPolicy(bucketName);
        try {
            String uptoken = putPolicy.token(mac);
            JSONObject jsonObject=new JSONObject();
            jsonObject.put("uptoken",uptoken);
            return new ResponseEntity(jsonObject, HttpStatus.OK);
        } catch (AuthException e) {
            e.printStackTrace();
            return new ResponseEntity(null, HttpStatus.BAD_REQUEST);
        } catch (JSONException e) {
            e.printStackTrace();
            return new ResponseEntity(null, HttpStatus.BAD_REQUEST);
        }
    }
}
