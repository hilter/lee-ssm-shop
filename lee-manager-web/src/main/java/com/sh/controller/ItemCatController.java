package com.sh.controller;

import com.sh.common.pojo.EasyUITreeNode;
import com.sh.service.ItemCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author lee leeshuhua@163.com
 * @create 2018-05-12-18:05
 **/
@Controller
public class ItemCatController {
    @Autowired
    private ItemCatService itemCatService;
    @RequestMapping("/item/cat/list")
    @ResponseBody
    public List<EasyUITreeNode> getItemCatList(@RequestParam(value="id", defaultValue="0")Long parentId) {

        List<EasyUITreeNode> list = itemCatService.getItemCatList(parentId);
        return list;
    }
}
