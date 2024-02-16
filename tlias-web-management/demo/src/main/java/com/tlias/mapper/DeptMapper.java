package com.tlias.mapper;

import java.util.List;

import org.apache.ibatis.annotations.*;

import com.tlias.pojo.Dept;
import org.springframework.stereotype.Repository;

@Mapper
public interface DeptMapper {
    /**
     * 查询全部部门
     */
    @Select("select * from dept")
    List<Dept> list();

    /**
     * 根据ID删除部门
     * @param id
     */
    @Delete("delete from dept where id = #{id}")
    void deleteById(Integer id);

    /**
     * 添加部门
     * @param dept
     */
    @Insert("INSERT INTO dept (name, create_time, update_time) values (#{name}, #{createTime}, #{updateTime})")
    void insert(Dept dept);

    /**
     * 根据id搜索部门
     * @param id
     * @return
     */
    @Select("SELECT * FROM dept WHERE id = #{id}")
    Dept selectById(Integer id);

    /**
     * 根据id修改部门名称
     * @param dept
     */
    @Update("UPDATE dept SET name = #{name} WHERE id = #{id}")
    void update(Dept dept);
}
