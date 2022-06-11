package com.itguigu.eduservice.controller;


import com.atguigu.commonutils.R;
import com.itguigu.eduservice.service.EduSubjectService;
import com.itguigu.eduservice.vo.SubjectNestedVo;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * <p>
 * 课程科目 前端控制器
 * </p>
 *
 * @author testjava
 * @since 2022-06-09
 */
@RestController
@RequestMapping("/eduservice/subject")
@CrossOrigin
public class EduSubjectController {
  @Autowired
    private EduSubjectService subjectService;
  //添加课程分类
   //获取上的传文件
   @PostMapping("addSubject")
    public R addSubject(MultipartFile file){
       System.err.println("dawwda");
       subjectService.saveSubject(file,subjectService);
       return R.ok();
   }
    @ApiOperation(value = "嵌套数据列表")
    @GetMapping
    public R nestedList(){
        List<SubjectNestedVo> subjectNestedVoList = subjectService.nestedList();
        return R.ok().data("items", subjectNestedVoList);
    }


}

