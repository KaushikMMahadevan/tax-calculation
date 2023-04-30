import java.util.Arrays;
import java.util.List;

public class TaxCalculationUtil {

    private Node binaryTree;
    private int noOfCountriesCalculated = 0;

    private List<Double> ctaxList =Arrays.asList(0.275, 0.190, 0.258, 0.30, 0.23, 0.0);
    private List<Double> dtaxList =Arrays.asList(0.05, 0.00, 0.05, 0.10, 0.05, 0.0);
    private List<Double> itaxList =Arrays.asList(0.10, 0.00, 0.10, 0.15, 0.10,  0.0);

    public void calculateRecursively(Node currentNode, Double startingAmount, Double cTax, Double dTax, Double iTax, int country){

        cTax = ctaxList.get(country);
        dTax = dtaxList.get(country);
        iTax = itaxList.get(country);

        if(currentNode == null){
            Node newNode = new Node(startingAmount);
            newNode.setProfitAfterTax(startingAmount);
            newNode.setAmountAfterWTH(startingAmount);
            binaryTree = newNode;
            currentNode = binaryTree;
        }

        if(country == 5)
            return;

        Node leftNode = new Node();
        leftNode.setStartingAmount(startingAmount);
        leftNode.setProfitAfterTax(startingAmount * (1 - cTax));
        leftNode.setAmountAfterWTH(leftNode.getProfitAfterTax() * (1 - dTax));

        Node rightNode = new Node();
        rightNode.setStartingAmount(startingAmount);
        rightNode.setProfitAfterTax(startingAmount * (1 - cTax));
        rightNode.setAmountAfterWTH(leftNode.getProfitAfterTax() * (1 - iTax));

        currentNode.setLeftNode(leftNode);
        currentNode.setRightNode(rightNode);
        noOfCountriesCalculated++;
        calculateRecursively(leftNode, leftNode.getAmountAfterWTH(), ctaxList.get(country + 1), dtaxList.get(country + 1), itaxList.get(country + 1), country + 1);
        calculateRecursively(rightNode, rightNode.getAmountAfterWTH(), ctaxList.get(country + 1), dtaxList.get(country + 1), itaxList.get(country + 1), country + 1);



    }

    public Node getStartingNode(){
        return this.binaryTree;
    }
}
