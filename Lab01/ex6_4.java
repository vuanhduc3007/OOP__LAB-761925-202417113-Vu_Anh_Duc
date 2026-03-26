package Lab01;

import java.util.Scanner;

public class ex6_4 {
    private static int getMonth(String s) {
        switch (s) {
            case "January":
            case "Jan.":
            case "Jan":
            case "1":
                return 1;
            case "February":
            case "Feb.":
            case "Feb":
            case "2":
                return 2;
            case "March":
            case "Mar.":
            case "Mar":
            case "3":
                return 3;
            case "April":
            case "Apr.":
            case "Apr":
            case "4":
                return 4;
            case "May":
            case "5":
                return 5;
            case "June":
            case "Jun":
            case "6":
                return 6;
            case "July":
            case "Jul":
            case "7":
                return 7;
            case "August":
            case "Aug.":
            case "Aug":
            case "8":
                return 8;
            case "September":
            case "Sept.":
            case "Sep":
            case "9":
                return 9;
            case "October":
            case "Oct.":
            case "Oct":
            case "10":
                return 10;
            case "November":
            case "Nov.":
            case "Nov":
            case "11":
                return 11;
            case "December":
            case "Dec.":
            case "Dec":
            case "12":
                return 12;
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String monthInput;
        int year = -1;
        int month = -1;
        while (true) {
            System.out.println("Nhap thang: ");
            monthInput = scanner.nextLine().trim();
            System.out.println("Nhap nam: ");
            String yearInput = scanner.nextLine().trim();

            try {
                year = Integer.parseInt(yearInput);
                if (year < 0) {
                    System.out.println("vui long thu lai");
                    continue;
                }
            } catch (NumberFormatException e) {
                System.out.println("Nam khong hop le!");
                continue;
            }

            month = getMonth(monthInput);
            if (month == -1) {
                System.out.println("Thang khong hop le!");
                continue;
            }
            break;
        }

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        int day = 0;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                day = 31;
                break;
            case 2:
                if (isLeapYear)
                    day = 29;
                else
                    day = 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                day = 30;
                break;
        }
        System.out.println(day);
        scanner.close();
    }
}