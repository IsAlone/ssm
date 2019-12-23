package com.zking.ssm.backstage.service.impl;

import com.zking.ssm.backstage.dto.TreeNodeDto;
import com.zking.ssm.backstage.mapper.TreeNodeMapper;
import com.zking.ssm.backstage.model.TreeNode;
import com.zking.ssm.backstage.service.ITreeNodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class TreeNodeServiceImpl implements ITreeNodeService {

    @Autowired
    private  TreeNodeMapper  treeNodeMapper;

    @Override
    public List<TreeNode> listAll() {
        List<TreeNode> treeNodes = treeNodeMapper.listAll();
        for (TreeNode treeNode : treeNodes) {
            System.out.println("----------"+treeNode.getTreeNodeId());
            List<TreeNode>   childrenList = treeNodeMapper.listByParentNodeId(treeNode.getTreeNodeId());
            treeNode.setChildrenList(childrenList);
        }
        return  treeNodes;
    }
}
