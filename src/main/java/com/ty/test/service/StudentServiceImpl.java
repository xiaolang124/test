package com.ty.test.service;

import com.ty.test.dao.test2.StudentMapper;
import com.ty.test.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public int countStudentNum() {
        return studentMapper.countStudentNum();
    }
}
