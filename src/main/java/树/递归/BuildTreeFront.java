package 树.递归;

import 树.TreeNode;

import java.util.HashMap;

public class BuildTreeFront {
    HashMap<Integer,Integer> inorderMap = new HashMap<>();//方便根据数值查找位置
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int i = 0 ; i <= inorder.length-1 ; i++){
            //用 map保存中序序列的数值对应的位置
            inorderMap.put(inorder[i],i);
        }
        return findNode(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
    }

    public TreeNode findNode(int[] preorder, int preBegin, int preEnd, int[] inorder, int inBegin, int inEnd) {
        if (inBegin > inEnd || preBegin > preEnd) {//不满足左闭右开,说明没有元素,返回空树
            return null;
        }
        int mid = preorder[preBegin];//找到遍历的第一个元素
        int rootIndex = inorderMap.get(mid);
        int lenOfLeft = rootIndex - inBegin;//左子树的长度
        TreeNode root = new TreeNode(mid);//构造节点
        root.left = findNode(preorder,preBegin+1,preBegin+lenOfLeft,inorder,inBegin,rootIndex-1);
        //中序数组的大小一定和后序数组的大小一样,所以直接用后序数组的长度减去左子树的长度
        root.right = findNode(preorder,preBegin+lenOfLeft+1,preEnd,inorder,rootIndex+1,inEnd);
        return root;
    }
}
