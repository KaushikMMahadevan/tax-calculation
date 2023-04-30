public class Node {
    private Double startingAmount;
    private Double profitAfterTax;
    private Double amountAfterWTH;
    private Node leftNode;
    private Node rightNode;

    public Double getStartingAmount() {
        return startingAmount;
    }

    public void setStartingAmount(Double startingAmount) {
        this.startingAmount = startingAmount;
    }

    public Double getProfitAfterTax() {
        return profitAfterTax;
    }

    public void setProfitAfterTax(Double profitAfterTax) {
        this.profitAfterTax = profitAfterTax;
    }

    public Double getAmountAfterWTH() {
        return amountAfterWTH;
    }

    public void setAmountAfterWTH(Double amountAfterWTH) {
        this.amountAfterWTH = amountAfterWTH;
    }

    public Node getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(Node leftNode) {
        this.leftNode = leftNode;
    }

    public Node getRightNode() {
        return rightNode;
    }

    public void setRightNode(Node rightNode) {
        this.rightNode = rightNode;
    }

    public Node() {}
    public Node(Double amount){
        this.startingAmount = amount;
    }
}
