/**
 * @author Yudhishthir Singh. Bangalore. 2020
 */
import java.util.*;
import java.io.*;

class Node {
    Node left;
    Node right;
    int data;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Solution {

    public static void preOrder( Node root ) {

        if( root == null)
            return;

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);

    }

 /* Node is defined as :
 class Node
    int data;
    Node left;
    Node right;

    */

    public static Node insert(Node root,int data) {
        //Both the solutions work...

        // if(root == null) return new Node(data);
        // if(data <= root.data) {
        //     //the value will go somewhere in the left
        //     if(root.left != null) {
        //         insert(root.left, data);
        //     }else{
        //         root.left = new Node(data);
        //     }
        // }else{
        //     if(root.right != null) {
        //         insert(root.right, data);
        //     }else{
        //         root.right = new Node(data);
        //     }
        // }

        // return root;

        if(root == null) return new Node(data);
        else{
            if(data <= root.data) root.left = insert(root.left, data);
            else root.right = insert(root.right, data);
            return root;
        }
    }

    public static void main(String[] args) {