package com.zking.ssm.backstage.controller;

import com.zking.ssm.backstage.dto.TreeNodeDto;
import com.zking.ssm.backstage.model.TreeNode;
import com.zking.ssm.backstage.service.ITreeNodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/treeNode")
public class TreeNodeController {

        @Autowired
        private ITreeNodeService treeNodeService;

    @RequestMapping(value = "/listAll")
    @ResponseBody
    public List<TreeNode>  listAll(HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
//        Map<String ,Object> map=new HashMap<String ,Object>();
        List<TreeNode> treeNodes = treeNodeService.listAll();
//        map.put("data",treeNodes);
        return treeNodes;
    }


}
