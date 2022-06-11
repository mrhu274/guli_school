package com.itguigu.eduservice.service;

import com.itguigu.eduservice.entity.EduSubject;
import com.baomidou.mybatisplus.extension.service.IService;
import com.itguigu.eduservice.vo.SubjectNestedVo;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * <p>
 * 课程科目 服务类
 * </p>
 *
 * @author testjava
 * @since 2022-06-09
 */
public interface EduSubjectService extends IService<EduSubject> {

    void saveSubject(MultipartFile file,EduSubjectService subjectService);

    List<SubjectNestedVo> nestedList();

}
