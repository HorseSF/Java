package com.itheima.reggie_take_out.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.reggie_take_out.entity.Category;

public interface CategoryService extends IService<Category> {

    /**
     * 根据id删除分类（查询是否有关联）
     * @param id
     */
    void remove(Long id);
}
