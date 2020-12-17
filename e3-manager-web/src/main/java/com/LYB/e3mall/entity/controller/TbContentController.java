//package cn.e3mall.controller;
//
//import cn.e3mall.TbContent;
//import com.LYB.service.TbContentService;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.annotation.Resource;
//
///**
// * (TbContent)表控制层
// *
// * @author makejava
// * @since 2020-12-07 18:34:33
// */
//@RestController
//@RequestMapping("tbContent")
//public class TbContentController {
//    /**
//     * 服务对象
//     */
//    @Resource
//    private TbContentService tbContentService;
//
//    /**
//     * 通过主键查询单条数据
//     *
//     * @param id 主键
//     * @return 单条数据
//     */
//    @GetMapping("selectOne")
//    public TbContent selectOne(Integer id) {
//        return this.tbContentService.queryById(id);
//    }
//
//}
