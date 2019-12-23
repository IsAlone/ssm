package com.zking.ssm.frontDesk.controller;

import com.zking.ssm.frontDesk.model.TreeNode;
import com.zking.ssm.frontDesk.service.ITreeNodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping(value = "/treeNode")
public class TreeNodeController {

    @Autowired
    private ITreeNodeService treeNodeService;


    @ModelAttribute
    public void init(Model model) {
        System.out.println("init...");
        TreeNode treeNode = new TreeNode();
        model.addAttribute("treeNode", treeNode);
    }

    @RequestMapping(value = "/treeNodeList")
    @ResponseBody
    public List<TreeNode> treeNodeList(HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        List<TreeNode> treeNodes = treeNodeService.listAll();

        return treeNodes;
    }


}
