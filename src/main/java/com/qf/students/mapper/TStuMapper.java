package com.qf.students.mapper;

import com.qf.students.entity.TStu;

import java.util.List;

public interface TStuMapper {

    List getStuList();

    int deleteByPrimaryKey(Integer sid);

    int insert(TStu record);

    int insertSelective(TStu record);

    TStu selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(TStu record);

    int updateByPrimaryKey(TStu record);
}