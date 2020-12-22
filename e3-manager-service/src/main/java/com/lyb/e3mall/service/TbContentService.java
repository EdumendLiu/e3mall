package com.lyb.e3mall.service;

import com.lyb.e3mall.entity.TbContent;

import java.util.List;

/**
 * (TbContent)表服务接口
 *
 * @author makejava
 * @since 2020-12-07 18:33:41
 */
public interface TbContentService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TbContent queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<TbContent> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tbContent 实例对象
     * @return 实例对象
     */
    TbContent insert(TbContent tbContent);

    /**
     * 修改数据
     *
     * @param tbContent 实例对象
     * @return 实例对象
     */
    TbContent update(TbContent tbContent);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
