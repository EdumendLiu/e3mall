//package cn.e3mall.controller;
//
//import cn.e3mall.TbContentCategory;
//import com.LYB.service.TbContentCategoryService;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.annotation.Resource;
//
///**
// * (TbContentCategory)表控制层
// *
// * @author makejava
// * @since 2020-12-07 18:34:39
// */
//@RestController
//@RequestMapping("tbContentCategory")
//public class TbContentCategoryController {
//    /**
//     * 服务对象
//     */
//    @Resource
//    private TbContentCategoryService tbContentCategoryService;
//
//    /**
//     * 通过主键查询单条数据
//     *
//     * @param id 主键
//     * @return 单条数据
//     */
//    @GetMapping("selectOne")
//    public TbContentCategory selectOne(Integer id) {
//        return this.tbContentCategoryService.queryById(id);
//    }
//
//}
