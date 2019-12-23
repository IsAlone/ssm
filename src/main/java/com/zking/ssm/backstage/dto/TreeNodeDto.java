package com.zking.ssm.backstage.dto;

import com.zking.ssm.backstage.model.TreeNode;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@ToString
public class TreeNodeDto extends TreeNode {
        private List<TreeNode> children=new ArrayList<>();

    public List<TreeNode> getChildren() {
        return children;
    }

    public void setChildren(List<TreeNode> children) {
        this.children = children;
    }
}
