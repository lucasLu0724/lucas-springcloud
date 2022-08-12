package com.lucas.service;

import com.lucas.dao.ResumeDao;
import com.lucas.pojo.Resume;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

/**
 * @program: lagou-parent
 * @author: lucasLu
 **/
@Service
public class ResumeServiceImpl implements ResumeService{

    @Autowired
    private ResumeDao resumeDao;

    @Override
    public Resume findDeafaultResumeByUserId(Long userId) {
        Resume resume = new Resume();
        resume.setUserId(userId);
        //查询默认简历
        resume.setIsDefault(1);
        Example<Resume> example = Example.of(resume);
        return resumeDao.findOne(example).get();
    }
}
