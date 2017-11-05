package com.suanfa;


//二叉树的操作
class Node{
	public int data;
	public Node left;
	public Node right;
	public Node(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
}
public class BinaryTree {
    private Node root;
    public BinaryTree() {
    	root = null;
    }
    //将data插入到排序二叉树中
    public void insert(int data) {
    	Node newNode = new Node(data);
    	if(root == null) {
    		root = newNode;
    	}else {
			Node current = root;
			Node parent;
			while(true) {
				parent = current;
				if(data < current.data) {
					current = current.left;
					if(current == null) {
						parent.left = newNode;
						return;
					}
				}else {
					current = current.right;
					if(current == null) {
						parent.right = newNode;
						return;
					}
				}
			}
		}
    }
    //构建二叉树
    public void buildTree(int []data) {
    	for(int i = 0;i < data.length;i++) {
    		insert(data[i]);
    	}
    }
    //中序遍历
    public void inOrder(Node localRoot) {
    	if(localRoot != null) {
    		inOrder(localRoot.left);
    		System.out.print(localRoot.data + " ");
    		inOrder(localRoot.right);
    	}
    }
    public void inOrder() {
    	this.inOrder(this.root);
    }
    //先序遍历
    public void preOrder(Node localRoot) {
    	if(localRoot != null) {
    		System.out.print(localRoot.data + " ");
    		preOrder(localRoot.left);
    		preOrder(localRoot.right);
    	}
    }
    public void preOrder() {
    	this.preOrder(this.root);
    }
    //后序遍历
    public void postOrder(Node localRoot) {
    	if(localRoot != null) {
    		postOrder(localRoot.left);
    		postOrder(localRoot.right);
    		System.out.print(localRoot.data + " ");
    	}
    }
    public void postOrder() {
    	this.postOrder(this.root);
    }
    public void initTree(int []preOrder,int []inOrder) {
    	this.root = this.initTree(preOrder,0,preOrder.length-1, inOrder,0,inOrder.length-1);
    }
    public Node initTree(int []preOrder,int start1,int end1,int []inOrder,int start2,int end2) {
    	if(start1 > end1 || start2 >end2) {
    		return null;
    	}else {
    		//根节点
			int rootData = preOrder[start1];
			Node head = new Node(rootData);
			//找到根节点所在位置
			int rootIndex = findIndexInArray(inOrder,rootData,start2,end2);
			int offSet = rootIndex - start2 - 1;
			//构建左子树
			Node left = initTree(preOrder, start1+1, start1+1+offSet, inOrder, start2, start2+offSet);
			//构建右子树
			Node right = initTree(preOrder, start1+offSet+2, end1, inOrder, rootIndex+1, end2);
			head.left = left;
			head.right = right;
			return head;
		}
    }
    public int findIndexInArray(int []a,int x,int begin,int end) {
    	for(int i=begin;i<=end;i++) {
    		if(a[i] == x) {
    			return i;
    		}
    	}
		return -1;
    }
    public static void main(String[] args) {
//		BinaryTree biTree = new BinaryTree();
//		int data[] = {2,8,7,4,9,3,1,6,7,5};
//		biTree.buildTree(data);
//		biTree.inOrder();
//		System.out.println();
//		biTree.preOrder();
//		System.out.println();
//		biTree.postOrder();
		
    	//已知先序遍历和中序遍历求后续遍历
		BinaryTree biTree = new BinaryTree();
		int preOrder[] = {1,2,4,8,9,5,10,3,6,7};
		int inOrder[] = {8,4,9,2,10,5,1,6,3,7};
		biTree.initTree(preOrder, inOrder);
		biTree.postOrder();
	}
}
