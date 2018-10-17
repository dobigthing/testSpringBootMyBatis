package com.wubin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wubin.entity.NewStudent;
import com.wubin.mapper.newStudentInfoDao;
import com.wubin.service.NewStudentInfoService;

import java.util.List;

/**
 * Created by Elric on 2017/7/6.
 */
@Service
public class NewStudentInfoServiceImpl implements NewStudentInfoService {
    @Autowired
    private newStudentInfoDao studentInfoDao;
    public List<NewStudent> getAllStudent() {
        return studentInfoDao.getAllStudent();
    }
}
