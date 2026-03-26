package Lab01;

import javax.swing.JOptionPane;

public class Assignment225 {
    public static void main(String[] args) {
        String strNum1, strNum2;
        String strNotification = "You've just entered: ";

        strNum1 = JOptionPane.showInputDialog(
                null,
                "Please input the first number: ",
                "Input the first number",
                JOptionPane.INFORMATION_MESSAGE);
        strNotification += strNum1 + " and ";

        strNum2 = JOptionPane.showInputDialog(
                null,
                "Please input the second number: ",
                "Input the second number",
                JOptionPane.INFORMATION_MESSAGE);
        strNotification += strNum2;

        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);

        double sum=num1+num2;
        double dif=num1-num2;
        double pro=num1*num2;
        System.out.println("Sum of the two numbers is "+sum+"\n");
        System.out.println("Difference of the two numbers is "+dif+"\n");
        System.out.println("Product of the two numbers is "+pro+"\n");
        if(num2==0){
            System.out.println("Can not divided");
        }else{
            System.out.println("Quotient of the two numbers is "+num1/num2);
        }
    }
}
