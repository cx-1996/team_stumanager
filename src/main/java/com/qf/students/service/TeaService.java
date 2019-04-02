package com.qf.students.service;

import com.qf.students.entity.TTea;

public interface TeaService {
    int deleteByPrimaryKey(Integer tid);

    int insert(TTea record);

    int insertSelective(TTea record);

    TTea selectByPrimaryKey(Integer tid);

    int updateByPrimaryKeySelective(TTea record);

    int updateByPrimaryKey(TTea record);


}
