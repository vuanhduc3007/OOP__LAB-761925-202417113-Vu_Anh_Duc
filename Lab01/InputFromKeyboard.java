package Lab01;

import java.util.Scanner;

public class InputFromKeyboard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What 's your name?");
        String strName = scanner.nextLine();
        System.out.println("How old are you?");
        String strAge = scanner.nextLine();
        System.out.println("How tall are you?(m)");
        String strHeight = scanner.nextLine();
        int age = Integer.parseInt(strAge);
        double height = Double.parseDouble(strHeight);

        System.out.println("Mrs/Ms. "+strName+", "+age+" years old. "+"Your height is "+height+".");
    }
}
