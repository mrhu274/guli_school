package com.itguigu.eduservice.controller;

import com.atguigu.commonutils.R;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * User: hhp
 * Date: 2022/6/8
 * Time: 21:36
 * Description: No Description
 * @author hhp
 */
@RequestMapping("/eduservice/user")
@RestController
@CrossOrigin //跨域
public class EduLoginController {

        @RequestMapping("/login")
        public R login(){
            return R.ok().data("token","admin");
        }
        @GetMapping("/info")
        public R info(){
            return R.ok().data("roles","[admin]").data("name","admin").data("avatar","https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif");
        }
}
