package com.zking.ssm.frontDesk.mapper;

import com.zking.ssm.frontDesk.model.TreeNode;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface TreeNodeMapper {
    List<TreeNode> listByParentNodeId(TreeNode treeNode);

    List<TreeNode> listAll();


    //查询子节点
    List<TreeNode> listChild(TreeNode treeNode);



}