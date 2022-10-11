package com.company;
public class Main {

    public static void main(String[] args) {

        BinaryTree TreeB=new BinaryTree("B");
        BinaryTree TreeD=new BinaryTree("D");
        BinaryTree TreeE=new BinaryTree("E");
        BinaryTree TreeC=new BinaryTree("C",TreeD,TreeE);
        BinaryTree TreeA=new BinaryTree("A",TreeB,TreeC);

        System.out.println("Post order:");
        System.out.println(TreeA);
        System.out.println("Is A tree Leaf:"+ TreeA.isLeaf());

        System.out.println("Is B tree Leaf:"+ TreeB.isLeaf());

        System.out.println("Size of A Tree:"+TreeA.size());

        System.out.println("Size of B Tree:"+TreeB.size());
        System.out.println("Height of A:"+TreeA.height());
        System.out.println("Height of B:"+TreeB.height());
        //Cpntains
        System.out.println("Contains X:"+TreeA.contains("X"));
        System.out.println("Contains B:"+TreeA.contains("B"));


 }
}