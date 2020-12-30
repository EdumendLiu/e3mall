package com.lyb.e3mall.service.impl;
import com.lyb.e3mall.common.pojo.EasyUIDataGridResult;
import com.lyb.e3mall.entity.TbItem;

public interface ItemService {

	TbItem getItemById(long itemId);
	EasyUIDataGridResult getItemList(int page, int rows);
}
