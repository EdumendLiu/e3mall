//package cn.e3mall.controller;
//
//import cn.e3mall.TbItemCat;
//import cn.e3mall.service.TbItemCatService;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.annotation.Resource;
//
///**
// * (TbItemCat)表控制层
// *
// * @author makejava
// * @since 2020-12-07 18:34:45
// */
//@RestController
//@RequestMapping("tbItemCat")
//public class TbItemCatController {
//    /**
//     * 服务对象
//     */
//    @Resource
//    private TbItemCatService tbItemCatService;
//
//    /**
//     * 通过主键查询单条数据
//     *
//     * @param id 主键
//     * @return 单条数据
//     */
//    @GetMapping("selectOne")
//    public TbItemCat selectOne(Integer id) {
//        return this.tbItemCatService.queryById(id);
//    }
//
//}
