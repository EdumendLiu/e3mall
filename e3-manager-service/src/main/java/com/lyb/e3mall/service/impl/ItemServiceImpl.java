package com.lyb.e3mall.service.impl;

import java.util.List;

import com.lyb.e3mall.common.pojo.EasyUIDataGridResult;
import com.lyb.e3mall.dao.TbItemDao;
import com.lyb.e3mall.entity.TbItem;
import com.lyb.e3mall.entity.TbItemExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
/**
 * 商品管理Service
 * <p>Title: ItemServiceImpl</p>
 * <p>Description: </p>
 * <p>Company: www.itcast.cn</p> 
 * @version 1.0
 */
@Service("ItemService")
public class ItemServiceImpl implements ItemService {

	@Autowired
	private TbItemDao itemMapper;
	
@Override
public TbItem getItemById(long itemId) {
//		//根据主键查询
//		//TbItem tbItem = itemMapper.selectByPrimaryKey(itemId);
//		TbItemExample example = new TbItemExample();
//		TbItemExample.Criteria criteria = example.createCriteria();
//		//设置查询条件
//		criteria.andIdEqualTo(itemId);
//		//执行查询
//		List<TbItem> list = itemMapper.selectByExample(example);
//		if (list != null && list.size() > 0) {
//			return list.get(0);
//		}
		return null;
	}

	@Override
	public EasyUIDataGridResult getItemList(int page, int rows) {
		//设置分页信息
		PageHelper.startPage(page, rows);
		//执行查询
		TbItem example = new TbItem();
		List<TbItem> list = itemMapper.queryAll(example);
		//创建一个返回值对象
		EasyUIDataGridResult result = new EasyUIDataGridResult();
		result.setRows(list);
		//取分页结果
		PageInfo<TbItem> pageInfo = new PageInfo<>(list);
		//取总记录数
		long total = pageInfo.getTotal();
		result.setTotal(total);
		return result;
	}

}
