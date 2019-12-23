package com.zking.ssm.frontDesk.service;

import com.zking.ssm.frontDesk.model.TreeNode;

import java.util.List;

public interface ITreeNodeService {
    List<TreeNode> listByParentNodeId(TreeNode treeNode);

    List<TreeNode> listAll();



    //查询子节点
    List<TreeNode> listChild(TreeNode treeNode);
}