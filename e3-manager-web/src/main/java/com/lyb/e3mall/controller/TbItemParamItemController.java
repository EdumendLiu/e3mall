//package cn.e3mall.controller;
//
//import cn.e3mall.TbItemParamItem;
//import com.lyb.service.TbItemParamItemService;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.annotation.Resource;
//
///**
// * (TbItemParamItem)表控制层
// *
// * @author makejava
// * @since 2020-12-07 18:34:51
// */
//@RestController
//@RequestMapping("tbItemParamItem")
//public class TbItemParamItemController {
//    /**
//     * 服务对象
//     */
//    @Resource
//    private TbItemParamItemService tbItemParamItemService;
//
//    /**
//     * 通过主键查询单条数据
//     *
//     * @param id 主键
//     * @return 单条数据
//     */
//    @GetMapping("selectOne")
//    public TbItemParamItem selectOne(Integer id) {
//        return this.tbItemParamItemService.queryById(id);
//    }
//
//}
