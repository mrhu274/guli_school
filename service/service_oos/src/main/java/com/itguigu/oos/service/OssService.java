package com.itguigu.oos.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: hhp
 * Date: 2022/6/9
 * Time: 14:33
 * Description: No Description
 * @author hhp
 */
public interface OssService {
    /**
     * 文件上传至阿里云
     * @param file
     * @return
     */

    String upload(MultipartFile file) ;
}
