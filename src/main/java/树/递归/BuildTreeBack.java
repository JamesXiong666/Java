package 树.递归;

import 树.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class BuildTreeBack {
    HashMap<Integer,Integer> inorderMap = new HashMap<>();//方便根据数值查找位置
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        for (int i = 0 ; i <= inorder.length-1 ; i++){
            //用 map保存中序序列的数值对应的位置
            inorderMap.put(inorder[i],i);
        }

        return findNode(inorder,0,inorder.length-1,postorder,0,postorder.length-1);

    }

    public TreeNode findNode(int[] inorder, int inBegin, int inEnd, int[] postorder, int postBegin, int postEnd) {
        //参数里的范围都是前闭后开
        if (inBegin > inEnd || postBegin > postEnd) {//不满足左闭右开,说明没有元素,返回空树
            return null;
        }
        int mid = postorder[postEnd];//找到后续遍历的最后一个元素
        int rootIndex = inorderMap.get(mid);
        TreeNode root = new TreeNode(postorder[postEnd]);//构造节点
        int lenOfLeft = rootIndex - inBegin;//左子树的长度
        root.left = findNode(inorder,inBegin,rootIndex-1,postorder,postBegin,postBegin+lenOfLeft-1);
        //中序数组的大小一定和后序数组的大小一样,所以直接用后序数组的长度减去左子树的长度
        root.right = findNode(inorder,rootIndex+1,inEnd,postorder,postBegin+lenOfLeft,postEnd-1);
        return root;
    }
}
