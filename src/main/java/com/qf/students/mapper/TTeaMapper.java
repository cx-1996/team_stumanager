package com.qf.students.mapper;


import com.qf.students.entity.TTea;

import java.util.List;

public interface TTeaMapper {
    int deleteByPrimaryKey(Integer tid);

    int insert(TTea record);

    int insertSelective(TTea record);

    TTea selectByPrimaryKey(Integer tid);

    int updateByPrimaryKeySelective(TTea record);

    int updateByPrimaryKey(TTea record);

    List<TTea> selectAllTeacher();
}