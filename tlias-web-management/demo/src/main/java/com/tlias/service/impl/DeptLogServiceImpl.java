package com.tlias.service.impl;


import com.tlias.mapper.DeptLogMapper;
import com.tlias.pojo.DeptLog;
import com.tlias.service.DeptLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.annotation.Propagation;


import java.time.LocalDateTime;

@Service
public class DeptLogServiceImpl implements DeptLogService {

    @Autowired
    private DeptLogMapper deptLogMapper;

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    @Override
    public void saveLog(DeptLog deptLog) {
        deptLogMapper.insert(deptLog);
    }
}
