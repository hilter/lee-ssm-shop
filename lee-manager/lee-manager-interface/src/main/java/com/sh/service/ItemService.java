package com.sh.service;
import com.sh.common.pojo.EasyUIDataGridResult;
import com.sh.pojo.TbItem;

public interface ItemService {

	TbItem getItemById(long itemId);
	EasyUIDataGridResult getItemList(int page,int rows);
}
