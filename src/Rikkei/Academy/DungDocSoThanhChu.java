package Rikkei.Academy;

import java.util.Scanner;

public class DungDocSoThanhChu {
    public static void main(String[] args) {
        System.out.println("Vui lòng nhập số cần đọc :");
        Scanner scanner = new Scanner(System.in);
        short number = scanner.nextShort();
        int ones = (number % 10);
        String textOnes = "";
        int tens = (number % 100) / 10;
        String textTens = "";
        int hundreds = number / 100;
        String texthundreds = "";
        System.out.println("hundreds: " + hundreds + ", tens " + tens + ",one " + ones);
        String resoult = "";
        switch (ones) {
            case 0:
                textOnes = "Zero";
                break;
            case 1:
                textOnes = "One";
                break;
            case 2:
                textOnes = "Two";
                break;
            case 3:
                textOnes = "Three";
                break;
            case 4:
                textOnes = "Four";
                break;
            case 5:
                textOnes = "Five";
                break;
            case 6:
                textOnes = "Six";
                break;
            case 7:
                textOnes = "Seven";
                break;
            case 8:
                textOnes = "Eight";
                break;
            case 9:
                textOnes = "Nine";
                break;
            default:
                System.out.println("out of ability");
        }

        if (tens == 1) {
            tens = Integer.parseInt(tens + "" + ones);
            System.out.println(tens);
            switch (tens) {
                case 10:
                    textOnes = "";
                    textTens = "Ten ";
                    break;
                case 11:
                    textOnes = "";
                    textTens = "Eleven ";
                    break;
                case 12:
                    textOnes = "";
                    textTens = "Twelve ";
                    break;
                case 13:
                    textOnes = "";
                    textTens = "Thirteen ";
                    break;
                case 14:
                    textOnes = "";
                    textTens = "Fourteen ";
                    break;
                case 15:
                    textOnes = "";
                    textTens = "Fifteen ";
                    break;
                case 16:
                    textOnes = "";
                    textTens = "Sixteen ";
                    break;
                case 17:
                    textOnes = "";
                    textTens = "Seventeen ";
                    break;
                case 18:
                    textOnes = "";
                    textTens = "Eighteen ";
                    break;
                case 19:
                    textOnes = "";
                    textTens = "Nineteen ";
                    break;
            }
        } else if (tens >= 2 && tens < 10) {
            switch (tens) {
                case 2:
                    textTens = "Twenty";
                    break;
                case 3:
                    textTens = "Thirty";
                    break;
                case 4:
                    textTens = "Forty";
                    break;
                case 5:
                    textTens = "Fifty";
                    break;
                case 6:
                    textTens = "Sixty";
                    break;
                case 7:
                    textTens = "Seventy";
                    break;
                case 8:
                    textTens = "Eighty";
                    break;
                case 9:
                    textTens = "Ninety";
                    break;
            }
        }

        switch (hundreds) {
            case 0:
                texthundreds = "";
                break;
            case 1:
                texthundreds = "one";
                break;
            case 2:
                texthundreds = "Two";
                break;
            case 3:
                texthundreds = "Three";
                break;
            case 4:
                texthundreds = "Four";
                break;
            case 5:
                texthundreds = "Five";
                break;
            case 6:
                texthundreds = "Six";
                break;
            case 7:
                texthundreds = "Seven";
                break;
            case 8:
                texthundreds = "Eight";
                break;
            case 9:
                texthundreds = "Nine";
                break;
            default:
                System.out.println("Out of ability");
        }

        resoult = hundreds != 0 ? texthundreds + " Hundreds " : "";
        resoult += ones == 0 ? textTens : textTens + " " + textOnes;

        System.out.println(resoult);
    }
}