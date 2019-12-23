package com.zking.ssm.backstage.service;

import com.zking.ssm.backstage.dto.TreeNodeDto;
import com.zking.ssm.backstage.model.TreeNode;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface ITreeNodeService {

    List<TreeNode> listAll();

}