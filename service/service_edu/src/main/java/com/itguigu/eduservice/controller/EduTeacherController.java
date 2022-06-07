package com.itguigu.eduservice.controller;


import com.itguigu.eduservice.entity.EduTeacher;
import com.itguigu.eduservice.service.EduTeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 讲师 前端控制器
 * </p>
 *
 * @author testjava
 * @since 2022-06-07
 */
@RestController
@RequestMapping("/eduservice/teacher")
public class EduTeacherController {
    @Autowired
    private EduTeacherService eduTeacherService;

   //查询所有讲师
    @GetMapping("getAllTeacher")
    public List<EduTeacher> getAllTeacher() {
        return eduTeacherService.list(null);
    }
    //根据id逻辑删除讲师
    @RequestMapping("{id}")
    public boolean deleteTeacher(@PathVariable("id") String id) {
        boolean b = eduTeacherService.removeById(id);
        return b;
    }
}

