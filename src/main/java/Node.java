public class Node {

    private final Node right;
    private final Node left;
    private final int data;

    public Node(int data, Node left, Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    boolean isValidBST(Node root, int lowerBounds, int upperBounds) {
        if (root == null)
            return true;

        if (root.data < lowerBounds || root.data > upperBounds)
            return false;

        return isValidBST(root.left, lowerBounds, data) && isValidBST(root.right, data, upperBounds);
    }

}
