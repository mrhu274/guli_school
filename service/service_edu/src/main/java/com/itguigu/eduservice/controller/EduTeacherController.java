package com.itguigu.eduservice.controller;


import com.atguigu.commonutils.R;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itguigu.eduservice.entity.EduTeacher;
import com.itguigu.eduservice.query.TeacherQuery;
import com.itguigu.eduservice.service.EduTeacherService;
import com.itguigu.servicebase.exceptionhandler.GuliException;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 讲师 前端控制器
 * </p>
 *
 * @author testjava
 * @since 2022-06-07
 */
@Api(tags = "讲师管理")
@RestController
@CrossOrigin
@RequestMapping("/eduservice/teacher")
public class EduTeacherController {
    @Autowired
    private EduTeacherService eduTeacherService;

    /**
     * 查询所有讲师
     */
    @ApiOperation(value = "查询所有讲师")
    @GetMapping("getAllTeacher")
    public R getAllTeacher() {
        try {
            int i = 1 / 0;
        } catch (Exception e) {

            throw new GuliException(20001,"出现自定义异常");
        }
        return R.ok().data("items", eduTeacherService.list(null));
    }

    /**
     * 根据id逻辑删除讲师
     */
    @ApiOperation(value = "逻辑删除")
    @DeleteMapping("{id}")
    public R deleteTeacher(@ApiParam(name = "id", value = "讲师id", required = true) @PathVariable("id") String id) {
        boolean b = eduTeacherService.removeById(id);
        if (b) {
            return R.ok();
        }
        return R.error().message("删除失败");
    }

    /**
     * 分页查询讲师
     */
    @ApiOperation(value = "分页讲师列表")
    @PostMapping("{page}/{limit}")
    public R getTeacherByPage(@ApiParam(name = "page", value = "当前页", required = true) @PathVariable("page") Integer page,
                              @ApiParam(name = "limit", value = "每页条数", required = true) @PathVariable("limit") Integer limit
            , @ApiParam(name = "teacherQuery", value = "查询对象", required = false)
                             @RequestBody( required = false) TeacherQuery teacherQuery
    ) {

        Page<EduTeacher> pageTeacher = new Page<>(page, limit);
        IPage<EduTeacher> eduTeacherIPage = eduTeacherService.pageQuery(pageTeacher, teacherQuery);
       // IPage<EduTeacher> records = eduTeacherService.page(pageTeacher, null);
        long total = eduTeacherIPage.getTotal();
        return R.ok().data("total", total).data("rows", eduTeacherIPage);
    }

    /**
     * 新增讲师
     */
    @ApiOperation(value = "新增讲师")
    @PostMapping
    public R save(@ApiParam(name = "EduTeacher", value = "添加讲师", required = true) @RequestBody EduTeacher teacher) {
        System.out.println(teacher);
//      EduTeacher(id=null, name=90, intro=1, career=1, level=1, avatar=, sort=0, isDeleted=null, gmtCreate=null, gmtModified=null)
        eduTeacherService.save(teacher);
        return R.ok();
    }

    /**
     * 根据ID查询讲师
     */
    @ApiOperation("查询讲师")
    @GetMapping("{id}")
    public R getById(@ApiParam(name = "Id", value = "讲师id", required = true) @PathVariable("id") String id) {
        EduTeacher teacher = eduTeacherService.getById(id);
        return R.ok().data("item", teacher);
    }

    /**
     * 根据ID修改讲师
     */
    @ApiOperation(value = "根据ID修改讲师")
    @PutMapping("{id}")
    public R updateById(@ApiParam(name = "id", value = "讲师ID", required = true)
                        @PathVariable String id,
                        @ApiParam(name = "teacher", value = "讲师对象", required = true)
                        @RequestBody EduTeacher teacher) {
        eduTeacherService.getById(id);
        eduTeacherService.updateById(teacher);
        return R.ok();
    }
}

