package com.qf.students.service.serviceImpl;

import com.qf.students.entity.TStu;
import com.qf.students.mapper.TStuMapper;
import com.qf.students.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IStuServiceImpl implements StuService {

    @Autowired
    private TStuMapper stuMapper;

    @Override
    public List getStuList() {
        return stuMapper.getStuList();
    }

    public int deleteByPrimaryKey(Integer sid) {
        return stuMapper.deleteByPrimaryKey(sid);
    }

    public int insert(TStu record) {
        return stuMapper.insert(record);
    }

    public int insertSelective(TStu record) {
        return stuMapper.insertSelective(record);
    }

    public TStu selectByPrimaryKey(Integer sid) {
        return stuMapper.selectByPrimaryKey(sid);
    }

    public int updateByPrimaryKeySelective(TStu record) {
        return stuMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(TStu record) {
        return stuMapper.updateByPrimaryKey(record);
    }
}
