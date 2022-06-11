package com.itguigu.eduservice.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itguigu.eduservice.entity.EduTeacher;
import com.baomidou.mybatisplus.extension.service.IService;
import com.itguigu.eduservice.query.TeacherQuery;

/**
 * <p>
 * 讲师 服务类
 * </p>
 *
 * @author testjava
 * @since 2022-06-07
 */
public interface EduTeacherService extends IService<EduTeacher> {
    IPage<EduTeacher> pageQuery(Page<EduTeacher> pageParam, TeacherQuery teacherQuery);
}
