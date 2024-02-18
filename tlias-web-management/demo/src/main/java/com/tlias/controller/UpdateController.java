package com.tlias.controller;

import com.tlias.pojo.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.UUID;

/**
 * 文件上传
 */
@Slf4j
@RestController
public class UpdateController {
    @PostMapping("/upload")
    public Result upload(String username, Integer age, MultipartFile image) throws Exception {
        log.info("文件上传: {}, {}, {}", username, age, image);

        // 获取原始文件名
        String originalFilename = image.getOriginalFilename();

        // 构造唯一文件名 - uuid
        int index = originalFilename.lastIndexOf(".");
        String extname = originalFilename.substring(index);
        String newFileName = UUID.randomUUID().toString() + extname;
        log.info("新的文件名：{}", newFileName);

        // 将文件存储到本地
//        image.transferTo(new File("~/Downloads/" + newFileName));
        return Result.success();
    }
}
