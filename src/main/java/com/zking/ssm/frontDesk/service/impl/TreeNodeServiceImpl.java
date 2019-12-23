package com.zking.ssm.frontDesk.service.impl;

import com.zking.ssm.frontDesk.mapper.TreeNodeMapper;
import com.zking.ssm.frontDesk.model.TreeNode;
import com.zking.ssm.frontDesk.service.ITreeNodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TreeNodeServiceImpl implements ITreeNodeService {

    @Autowired
    private TreeNodeMapper treeNodeMapper;


    @Override
    public List<TreeNode> listByParentNodeId(TreeNode treeNode) {
        return treeNodeMapper.listByParentNodeId(treeNode);
    }

    @Override
    public List<TreeNode> listAll() {

        List<TreeNode> treeNodes = treeNodeMapper.listAll();
        for (TreeNode treeNode : treeNodes) {
            List<TreeNode> childList = treeNodeMapper.listByParentNodeId(treeNode);
            treeNode.setChildren(childList);
        }
        return  treeNodes;

    }

    @Override
    public List<TreeNode> listChild(TreeNode treeNode) {
        return treeNodeMapper.listChild(treeNode);
    }
}
