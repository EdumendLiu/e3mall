//package com.lyb.e3mall.controller;
//
//import com.lyb.e3mall.entity.TbUser;
//import com.lyb.e3mall.service.impl.TbUserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;
//
///**
// * (TbUser)表控制层
// *
// * @author makejava
// * @since 2020-12-07 18:35:01
// */
//@RestController
//@RequestMapping("tbUser")
//public class TbUserController {
//    /**
//     * 服务对象
//     */
//    @Autowired
//    private TbUserService tbUserService;
//
//    /**
//     * 通过主键查询单条数据
//     *
//     * @param id 主键
//     * @return 单条数据
//     */
//    @RequestMapping("selectOne")
//    @ResponseBody
//    public TbUser selectOne(@PathVariable Integer id) {
//        return this.tbUserService.queryById(id);
//    }
//
//}
