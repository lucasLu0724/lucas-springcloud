package com.lucas.controller;

import com.lucas.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: lagou-parent
 * @author: lucasLu
 **/
@RestController
@RequestMapping("/resume")
public class ResumeController {

    @Autowired
    private ResumeService resumeService;


    @GetMapping("/openstate/{userId}")
    public Integer findDefaultResumeSatate(@PathVariable Long userId){
        return resumeService.findDeafaultResumeByUserId(userId).getIsOpenResume();
    }
}
