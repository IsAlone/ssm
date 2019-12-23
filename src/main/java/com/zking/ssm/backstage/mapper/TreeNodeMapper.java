package com.zking.ssm.backstage.mapper;

import com.zking.ssm.backstage.dto.TreeNodeDto;
import com.zking.ssm.backstage.model.TreeNode;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TreeNodeMapper {

    List<TreeNode> listByParentNodeId(@Param(value="treeNodeId")Integer treeNodeId);


    List<TreeNode> listAll();





}