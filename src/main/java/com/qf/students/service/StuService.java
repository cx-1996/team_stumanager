package com.qf.students.service;

import com.qf.students.entity.TStu;

public interface StuService {

    int deleteByPrimaryKey(Integer sid);

    int insert(TStu record);

    int insertSelective(TStu record);

    TStu selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(TStu record);

    int updateByPrimaryKey(TStu record);
}
