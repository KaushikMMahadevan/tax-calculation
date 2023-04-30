public class Main {
    public static void main(String[] args){
        BinaryTreeUtil binaryTreeUtil = new BinaryTreeUtil();
        TaxCalculationUtil taxCalculationUtil = new TaxCalculationUtil();
        taxCalculationUtil.calculateRecursively(null, 100.0, 0.0, 0.0, 0.0, 0);
        Node binaryTree = taxCalculationUtil.getStartingNode();

        binaryTreeUtil.updateArr(binaryTree, 0, 0);
        binaryTreeUtil.printBinaryTree();
    }
}
