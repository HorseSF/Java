package com.tlias.controller;

import com.tlias.anno.Log;
import jakarta.websocket.server.PathParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import com.tlias.pojo.Dept;
import com.tlias.pojo.Result;
import com.tlias.service.DeptService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 部门管理Controller
 */
@Slf4j
@RestController
@RequestMapping("/depts")
public class DeptController {

    @Autowired
    private DeptService deptService;

    // @RequestMapping("/depts", method = RequestMethod.GET)

    /**
     * 查询全部部门数据
     * @return
     */
    @GetMapping
    public Result list() {
        // log.info("查询全部部门数据");

        // 调用service查询部门数据
        List<Dept> deptList = deptService.list();

        return Result.success(deptList);
    }

    /**
     * 根据ID删除部门
     * @param id
     * @return
     */
    @Log
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        log.info("根据ID删除部门:{}", id);
        deptService.delete(id);
        return Result.success();
    }

    /**
     * 新增部门
     * @return
     */
    @Log
    @PostMapping
    public Result add(@RequestBody Dept dept) {
        log.info("新增部门:{}", dept);
        deptService.add(dept);
        return Result.success();
    }

    /**
     * 根据ID查询部门
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public Result selectById(@PathVariable Integer id) {
        log.info("根据ID查询部门:{}", id);
        Dept dept = deptService.selectById(id);
        return Result.success(dept);
    }

    /**
     * 修改部门
     * @param dept
     * @return
     */
    @Log
    @PutMapping
    public Result put(@RequestBody Dept dept) {
        log.info("修改部门:{}", dept);
        deptService.put(dept);
        return Result.success();
    }
}
