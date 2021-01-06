package com.lyb.content.service;

import com.lyb.e3mall.common.pojo.EasyUITreeNode;
import com.lyb.e3mall.common.utils.E3Result;

import java.util.List;

public interface ContentCategoryService {

	List<EasyUITreeNode> getContentCatList(long parentId);
	E3Result addContentCategory(long parentId, String name);
}
