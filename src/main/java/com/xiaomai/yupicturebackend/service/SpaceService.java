package com.xiaomai.yupicturebackend.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaomai.yupicturebackend.model.dto.space.SpaceQueryRequest;
import com.xiaomai.yupicturebackend.model.entity.Space;
import com.xiaomai.yupicturebackend.model.vo.SpaceVO;

import javax.servlet.http.HttpServletRequest;

public interface SpaceService extends IService<Space> {
    void validSpace(Space space);

   
    /**
     * 获取空间包装类（单条）
     * @param space
     * @param request
     * @return
     */
    SpaceVO getSpaceVO(Space space, HttpServletRequest request);

    /**
     * 获取空间包装类（分页）
     * @param spacePage
     * @param request
     * @return
     */
    Page<SpaceVO> getSpaceVOPage(Page<Space> spacePage, HttpServletRequest request);

    /**
     * 获取查询对象
     * @param spaceQueryRequest
     * @return
     */
    QueryWrapper<Space> getQueryWrapper(SpaceQueryRequest spaceQueryRequest);

}
