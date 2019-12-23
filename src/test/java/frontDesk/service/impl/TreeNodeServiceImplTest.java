package frontDesk.service.impl;

import com.zking.ssm.frontDesk.model.TreeNode;
import com.zking.ssm.frontDesk.service.ITreeNodeService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.awt.print.Book;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml"})
public class TreeNodeServiceImplTest {

    @Autowired
    private ITreeNodeService treeNodeService;
    TreeNode treeNode;

    @Before
    public void setUp() throws Exception {
        treeNode=new TreeNode();
    }

    @Test
    public void listAll() {
        List<TreeNode> treeNodes = treeNodeService.listAll();
        for (TreeNode treeNode : treeNodes) {
            System.out.println(treeNode);
        }
    }

    @Test
    public void listTreeNodeId() {
        treeNode.setParentNodeId(2);
        List<TreeNode> treeNodes = treeNodeService.listByParentNodeId(treeNode);
//        List<TreeNode> treeNodes = treeNodeService.listByParentNodeId(treeNode);
//        List<TreeNode> treeNodes = treeNodeService.listChild(treeNode);
        for (TreeNode treeNode : treeNodes) {
            System.out.println(treeNode);
        }
    }
}