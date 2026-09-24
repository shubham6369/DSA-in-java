static int countNodes(Treenode root) {
    i
}f (root == null) {
    return 0;
}

int leftCount = countNodes(root.left);
int rightCount = countnodes(root.right);

retrn leftCount + rightCount +1;