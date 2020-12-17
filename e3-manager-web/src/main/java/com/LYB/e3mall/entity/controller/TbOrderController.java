//package cn.e3mall.controller;
//
//import cn.e3mall.TbOrder;
//import com.LYB.service.TbOrderService;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.annotation.Resource;
//
///**
// * (TbOrder)表控制层
// *
// * @author makejava
// * @since 2020-12-07 18:34:54
// */
//@RestController
//@RequestMapping("tbOrder")
//public class TbOrderController {
//    /**
//     * 服务对象
//     */
//    @Resource
//    private TbOrderService tbOrderService;
//
//    /**
//     * 通过主键查询单条数据
//     *
//     * @param id 主键
//     * @return 单条数据
//     */
//    @GetMapping("selectOne")
//    public TbOrder selectOne(String id) {
//        return this.tbOrderService.queryById(id);
//    }
//
//}
