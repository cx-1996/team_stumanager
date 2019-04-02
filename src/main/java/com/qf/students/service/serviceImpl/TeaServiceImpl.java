package com.qf.students.service.serviceImpl;

import com.qf.students.entity.TTea;
import com.qf.students.mapper.TTeaMapper;
import com.qf.students.service.TeaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeaServiceImpl implements TeaService {
    @Autowired
    private TTeaMapper tTeaMapper;

    public int deleteByPrimaryKey(Integer tid) {
        return tTeaMapper.deleteByPrimaryKey(tid);
    }

    public int insert(TTea record) {
        return tTeaMapper.insert(record);
    }

    public int insertSelective(TTea record) {
        return tTeaMapper.insertSelective(record);
    }

    public TTea selectByPrimaryKey(Integer tid) {
        return tTeaMapper.selectByPrimaryKey(tid);
    }

    public int updateByPrimaryKeySelective(TTea record) {
        return tTeaMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(TTea record) {
        return tTeaMapper.updateByPrimaryKey(record);
    }

    public List<TTea> selectAllTeacher() {
        return tTeaMapper.selectAllTeacher();
    }
}
