package com.tlias.service;

import java.util.List;
import com.tlias.pojo.Dept;

/**
 * 部门管理
 */
public interface DeptService {
    /**
     * 查询全部部门
     * 
     * @return
     */
    List<Dept> list();

    /**
     * 根据ID删除部门
     * @param id
     */
    void delete(Integer id);

    /**
     * 新增部门
     * @param dept
     */
    void add(Dept dept);

    /**
     * 根据id查询部门
     * @param id
     * @return
     */
    Dept selectById(Integer id);

    /**
     * 根据id修改部门
     * @param dept
     */
    void put(Dept dept);
}
