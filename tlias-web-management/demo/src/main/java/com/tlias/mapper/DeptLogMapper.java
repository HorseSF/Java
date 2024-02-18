package com.tlias.mapper;

import com.tlias.pojo.Dept;
import com.tlias.pojo.DeptLog;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DeptLogMapper {

    @Insert("INSERT INTO dept_log (create_time, description) values (#{createTime}, #{description})")
    void insert(DeptLog deptLog);
}
