import java.util.List;

public class BinaryTreeUtil {

    private double[][] printArr = new double[10][100];

    public void updateArr(Node node, int row, int column){
        if(node == null){
            return;
        }
        printArr[row][column] = node.getAmountAfterWTH();
        updateArr(node.getLeftNode(), row + 1, (column * 2));
        updateArr(node.getRightNode(), row + 1, (column * 2) + 1);
    }

    public void printBinaryTree(){
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 100; j++){
                System.out.print(printArr[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }

}
