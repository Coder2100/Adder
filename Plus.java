// import packages
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Plus{
    // begin main class
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int valueX;
        int valueY;
        int total;
        String x, y;
        // read the first input from the user
        System.out.print("Cofa Inani Lokuqala");
        x = JOptionPane.showInputDialog("Cofa Inani Lokuqala");
        valueX = Integer.parseInt(x);
        // read the second input from the user
        System.out.print("Cofa Inani Lesibini");
        y = JOptionPane.showInputDialog("Cofa Inani Lesibini");
        valueY = Integer.parseInt(y);
        // convert x or y from string type to integer type
        valueX = Integer.parseInt(x);
        // add numbers
        total = valueX + valueY;
        // Display results
        JOptionPane.showMessageDialog(null, "u-X no-Y  wenza u- " + total, "Iziphumo", JOptionPane.QUESTION_MESSAGE);
        System.exit(0);
    }// end of the main class
}// end of Addition class