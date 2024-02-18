package com.tlias.controller;

import com.tlias.anno.Log;
import com.tlias.pojo.Emp;
import com.tlias.pojo.PageBean;
import com.tlias.pojo.Result;
import com.tlias.service.EmpService;
import com.tlias.service.impl.EmpServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

/**
 * 员工管理Controller
 */
@Slf4j
@RestController
@RequestMapping("/emps")
public class EmpController {

    @Autowired
    private EmpService empService;

    /**
     * 分页查询
     * @param page
     * @param pageSize
     * @param name
     * @param gender
     * @param begin
     * @param end
     * @return
     */
    @GetMapping
    public Result page(@RequestParam(defaultValue = "1") Integer page,
                       @RequestParam(defaultValue = "10") Integer pageSize,
                       String name,
                       Short gender,
                       @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate begin,
                       @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate end) {
        log.info("分页查询，参数：{},{},{},{},{},{}", page, pageSize, name, gender, begin, end);
        PageBean pageBean = empService.page(page, pageSize, name, gender, begin, end);
        return Result.success(pageBean);
    }

    /**
     * 批量删除
     * @param ids
     * @return
     */
    @Log
    @DeleteMapping("/{ids}")
    public Result delete(@PathVariable List<Integer> ids) {
        log.info("批量删除， ids：{}", ids);
        empService.delete(ids);
        return Result.success();
    }

    /**
     * 新增员工
     * @param emp
     * @return
     */
    @Log
    @PostMapping
    public Result save(@RequestBody Emp emp) {
        log.info("新增员工, emp:{}", emp);
        empService.save(emp);
        return Result.success();
    }

    /**
     * 根据ID查询员工
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id) {
        log.info("根据id查询, id:{}", id);
        Emp emp = empService.getById(id);
        return Result.success(emp);
    }

    /**
     * 修改员工
     * @param emp
     * @return
     */
    @Log
    @PutMapping
    public Result updateById(@RequestBody Emp emp) {
        log.info("修改员工, emp:{}", emp);
        empService.updateById(emp);
        return Result.success();
    }
}
