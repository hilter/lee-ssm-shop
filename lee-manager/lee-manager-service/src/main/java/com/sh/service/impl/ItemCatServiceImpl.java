package com.sh.service.impl;

import com.sh.common.pojo.EasyUITreeNode;
import com.sh.mapper.TbItemCatMapper;
import com.sh.pojo.TbItemCat;
import com.sh.pojo.TbItemCatExample;
import com.sh.service.ItemCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 商品分类管理
 * @author lee leeshuhua@163.com
 * @create 2018-05-12-17:51
 **/
@Service
public class ItemCatServiceImpl implements ItemCatService {

    @Autowired
    private TbItemCatMapper itemCatMapper;

    public List<EasyUITreeNode> getItemCatList(long parentId) {
        // 1、根据parentId查询节点列表
        TbItemCatExample example = new TbItemCatExample();
        //设置查询条件
        TbItemCatExample.Criteria criteria = example.createCriteria();
        criteria.andParentIdEqualTo(parentId);
        List<TbItemCat> list = itemCatMapper.selectByExample(example);
        // 2、转换成EasyUITreeNode列表。
        List<EasyUITreeNode> resultList = new ArrayList<>();
        for (TbItemCat tbItemCat : list) {
            EasyUITreeNode node = new EasyUITreeNode();
            node.setId(tbItemCat.getId());
            node.setText(tbItemCat.getName());
            node.setState(tbItemCat.getIsParent()?"closed":"open");
            //添加到列表
            resultList.add(node);
        }
        // 3、返回。
        return resultList;
    }
}
