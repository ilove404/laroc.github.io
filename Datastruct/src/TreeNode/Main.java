package TreeNode;

public class Main{
    public static void main(String[] args){
        TreeNode<String> root = new TreeNode<>("A");
        root.left = new TreeNode<>("B");
        root.right = new TreeNode<>("E");
        root.left.left = new TreeNode<>("C");
        root.left.right  = new TreeNode<>("D");
        root.right.right = new TreeNode<>("F");
        test(root);
    }

    /**
     * 二叉树遍历，前序遍历
     * @param root
     */
    public static void test(TreeNode<String> root){
        if (root == null) return;
//        System.out.print(root.e + " ");//前序遍历
        test(root.left);
//        System.out.print(root.e + " ");//中序遍历
        test(root.right);
        System.out.print(root.e + " ");//后序遍历

    }


}
