package com.lucas.service;

import com.lucas.pojo.Resume;

/**
 * @program: lagou-parent
 * @author: lucasLu
 **/
public interface ResumeService {

    /**
     * 根据userID 获取数据
     * @param userId
     * @return
     */
    Resume findDeafaultResumeByUserId(Long userId);
}
