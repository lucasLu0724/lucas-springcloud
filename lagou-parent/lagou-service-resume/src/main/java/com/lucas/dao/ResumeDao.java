package com.lucas.dao;

import com.lucas.pojo.Resume;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResumeDao extends JpaRepository<Resume,Long> {
}
