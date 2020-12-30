package com.lyb.e3mall.dao;
import java.util.List;

import com.lyb.e3mall.entity.TbItemCat;
import com.lyb.e3mall.entity.TbItemCatExample;
import org.apache.ibatis.annotations.Param;

public interface TbItemCatDao {

    List<TbItemCat> queryAll(TbItemCat example);

}
