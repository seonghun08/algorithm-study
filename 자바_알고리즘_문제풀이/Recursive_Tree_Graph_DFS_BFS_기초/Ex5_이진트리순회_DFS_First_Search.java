package Recursive_Tree_Graph_DFS_BFS_기초;

import java.util.Scanner;

class Node {
    int data;
    Node lt, rt;

    public Node(int data) {
        this.data = data;
        lt = rt = null;
    }
}

/**
 * 이진트리순회 원리 이해 (직접 그려보자)
 */
public class Ex5_이진트리순회_DFS_First_Search {

    Node root;
    public void DFS(Node root) {
        if (root != null) {
            System.out.print(root.data + " "); // 전위 순회
            DFS(root.lt);
//            System.out.print(root.data + " "); // 중위 순회
            DFS(root.rt);
//            System.out.print(root.data + " "); // 후위 순회
        }
    }

    public static void main(String[] args) {
        Ex5_이진트리순회_DFS_First_Search tree = new Ex5_이진트리순회_DFS_First_Search();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.DFS(tree.root);
    }
}
