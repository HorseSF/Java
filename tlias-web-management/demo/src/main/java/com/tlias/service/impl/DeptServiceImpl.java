package com.tlias.service.impl;

import java.time.LocalDateTime;
import java.util.List;

import com.tlias.mapper.EmpMapper;
import com.tlias.pojo.DeptLog;
import com.tlias.service.DeptLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tlias.mapper.DeptMapper;
import com.tlias.pojo.Dept;
import com.tlias.service.DeptService;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;

    @Autowired
    private EmpMapper empMapper;

    @Autowired
    private DeptLogService deptLogService;

    @Override
    public List<Dept> list() {
        return deptMapper.list();
    }

    @Transactional
    @Override
    public void delete(Integer id){
        try {
            deptMapper.deleteById(id);
//            int i = 1/0;
            empMapper.deleteByDeptId(id);
        } finally {
            DeptLog deptLog = new DeptLog();
            deptLog.setCreateTime(LocalDateTime.now());
            deptLog.setDescription("执行了解散部门的操作,此次解散的是" + id + "号部门");
            deptLogService.saveLog(deptLog);
        }
    }

    @Override
    public void add(Dept dept) {
        dept.setCreateTime(LocalDateTime.now());
        dept.setUpdateTime(LocalDateTime.now());
        deptMapper.insert(dept);
    }

    @Override
    public Dept selectById(Integer id) {
        return deptMapper.selectById(id);
    }

    @Override
    public void put(Dept dept) {
        deptMapper.update(dept);
    }
}
