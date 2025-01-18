package com.xiaomai.yupicturebackend.controller;

import com.xiaomai.yupicturebackend.annotation.AuthCheck;
import com.xiaomai.yupicturebackend.common.BaseResponse;
import com.xiaomai.yupicturebackend.common.ResultUtils;
import com.xiaomai.yupicturebackend.constant.UserConstant;
import com.xiaomai.yupicturebackend.exception.BusinessException;
import com.xiaomai.yupicturebackend.exception.ErrorCode;
import com.xiaomai.yupicturebackend.manager.CosManager;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.io.IOException;

/**
 * 功能:
 * 作者:zhl
 */
@Slf4j
@RestController
@RequestMapping("/file")
public class FileController {
    @Resource
    private CosManager cosManager;
    /**
     * 测试文件上传
     * @param multipartFile
     * @return
     */
    @AuthCheck(mustRole = UserConstant.ADMIN_ROLE)
    @PostMapping("/test/upload")
    public BaseResponse<String> testUploadFile(@RequestPart("file")MultipartFile multipartFile){
        String filename = multipartFile.getOriginalFilename();
        String filepath = String.format("/test/%s", filename);
File file = null;
        try {
            //上传文件
            file = File.createTempFile(filepath, null);
            multipartFile.transferTo(file);
            cosManager.putObject(filepath , file);
            //返回可以访问的地址
            return ResultUtils.success(filepath);
        } catch (Exception e) {
            log.error("file upload error , filepath = " + filepath, e);
            throw new BusinessException(ErrorCode.SYSTEM_ERROR, "上传失败");
        }finally {
            if (file != null){
                //删除临时文件
                boolean delete = file.delete();
                if (!delete){
                    log.error("file delete error , filepath = {} " , filepath);
                }
            }
        }
    }
}
