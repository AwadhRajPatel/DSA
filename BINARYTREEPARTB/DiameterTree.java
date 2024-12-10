package BINARYTREEPARTB;

public class DiameterTree {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int height(Node root){
        if(root == null){
            return 0;
        }

        int Lh = height(root.left);
        int Rh = height(root.right);
        return Math.max(Lh, Rh) +1;
    }

    public static int diameter1(Node root){
        if (root == null) {
            return 0;
        }
        int leftDiam = diameter1(root.left);
        int leftHt = height(root.left);
        int rightDiam = diameter1(root.right);
        int rightHt = height(root.right);
        int selfDiam = leftHt + rightHt +1;
        return  Math.max(selfDiam, Math.max(leftDiam, rightDiam));

    }


    static class Info {
        int diam;
        int ht;

        public Info(int diam, int ht){
            this.diam = diam;
            this.ht = ht;
        }
   
    }
    public static Info diameter(Node root) {
        if (root == null) {
            return new Info(0, 0);
        }
        Info leftInfo = diameter(root.left);
        Info rightInfo = diameter(root.right);

        int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht + rightInfo.ht +1);
        int ht = Math.max(leftInfo.ht, rightInfo.ht) +1;

        return new Info(diam,ht);
    }
    

    public static void main(String[] args) {
        
        Node root  = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // System.out.println(diameter1(root));
        System.out.println(diameter(root).diam);
        System.out.println(diameter(root).ht);
        // Info result = diameter(root);
        // System.out.println( result.diam);
        // System.out.println( result.ht);
    }
}