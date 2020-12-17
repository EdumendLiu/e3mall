//package cn.e3mall.controller;
//
//import cn.e3mall.TbItemParam;
//import com.lyb.service.TbItemParamService;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.annotation.Resource;
//
///**
// * (TbItemParam)表控制层
// *
// * @author makejava
// * @since 2020-12-07 18:34:49
// */
//@RestController
//@RequestMapping("tbItemParam")
//public class TbItemParamController {
//    /**
//     * 服务对象
//     */
//    @Resource
//    private TbItemParamService tbItemParamService;
//
//    /**
//     * 通过主键查询单条数据
//     *
//     * @param id 主键
//     * @return 单条数据
//     */
//    @GetMapping("selectOne")
//    public TbItemParam selectOne(Integer id) {
//        return this.tbItemParamService.queryById(id);
//    }
//
//}
