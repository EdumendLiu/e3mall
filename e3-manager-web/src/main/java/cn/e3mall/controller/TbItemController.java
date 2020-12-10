//package cn.e3mall.controller;
//
//import cn.e3mall.TbItem;
//import cn.e3mall.service.TbItemService;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.annotation.Resource;
//
///**
// * (TbItem)表控制层
// *
// * @author makejava
// * @since 2020-12-07 18:34:42
// */
//@RestController
//@RequestMapping("tbItem")
//public class TbItemController {
//    /**
//     * 服务对象
//     */
//    @Resource
//    private TbItemService tbItemService;
//
//    /**
//     * 通过主键查询单条数据
//     *
//     * @param id 主键
//     * @return 单条数据
//     */
//    @GetMapping("selectOne")
//    public TbItem selectOne(Integer id) {
//        return this.tbItemService.queryById(id);
//    }
//
//}
