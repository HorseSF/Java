package com.itheima.reggie_take_out.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.reggie_take_out.dto.DishDto;
import com.itheima.reggie_take_out.entity.Dish;


public interface DishService extends IService<Dish> {

    // 新增菜品，插入口味数据
    public void saveWithFlavor(DishDto dishDto);

    // 根据id查询菜品信息和口味
    public DishDto getByIdWithFlavor(Long id);

    // 更新菜品
    public void updateWithFlavor(DishDto dishDto);
}
