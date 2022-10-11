package com.company;

public class BinaryTree {
    Object root;
    BinaryTree left;
    BinaryTree right;
    public BinaryTree(Object root){
        this.root=root;
    }
    public BinaryTree (Object root,BinaryTree left,BinaryTree right){

        this.root=root;
        this.left=left;
        this.right=right;
    }
    public  void set_Root(Object root){
        this.root=root;
    }
    public  Object get_Root(){
        return  root;
    }
    public void set_Left_root(BinaryTree left) {
        this.left = left;
    }

    public BinaryTree get_Left_Root(){
        return left;
    }

    public void set_Right_root(BinaryTree right) {
        this.right = right;
    }

    public BinaryTree get_Right_Root(){
        return right;
    }
//In-Order
/*public String toString(){
        StringBuffer buf=new StringBuffer("");
        if(left!=null) buf.append(left+",");
        buf.append(root);
        if(right!=null) buf.append(","+right);
        return buf+"";
}*/


//Pre_Order
/*public String toString(){
        StringBuffer buf=new StringBuffer("");
        buf.append(root);
        if(left!=null) buf.append(","+left);

        if(right!=null) buf.append(","+right);
        return buf+"";
}*/
//Post _Order
public String toString(){
    StringBuffer buf=new StringBuffer("");
    if(left!=null) buf.append(left+",");

    if(right!=null) buf.append(right+",");
    buf.append(root);

    return buf+"";
}

//Is leaf
public boolean isLeaf(){
    if(left==null && right==null){
        return true;
    }
    else
        return  false;
}
//Size of the tree
    public int size(){
    if(left==null && right==null ){
        return  1;
    }

    if(left==null)
        return  1+ right.size();
    if(right==null)
        return  1+ left.size();

   else
       return  1+ left.size()+ right.size();
    }


    //height
    public  int height(){
    if(root==null) return  -1;
    int left_n=0;
    int right_n=0;

    if(left!=null)
        left_n=1+left.height();

    if(right!=null)
        right_n=1+right.height();;

        //Conditional operator
    return left_n>right_n ? left_n: right_n;

    }
//Contains Method
    public boolean contains(Object target) {

        if (root == target) return true;

        boolean present = false;

        if (left != null) {

            if (left.toString().contains(target.toString()))
                return true;
            present = left.contains(target);

        }
        if (right != null) {
            if (right.toString().contains(target.toString()))
                return true;
            present = right.contains(target);

     }

        return present;
}

}