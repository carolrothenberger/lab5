import java.util.Scanner;
public class Main {

    public static void main(String[]args) {

        long value = 0;
        int i = 0;

        Scanner scnr = new Scanner(System.in);

        //Get user hexadecimal
        System.out.println("Enter a hexadecimal number: ");
        String userNum = scnr.next();

        int length = userNum.length();

        while (i < length) {
            char c;
            c = userNum.charAt(i);
            if ((c == 'A') || (c == 'a')) {
                value += 10 * Math.pow(16, length - (i + 1));
                i++;
            }
            else if ((c == 'B') || (c == 'b')) {
                value += 11 * Math.pow(16, length - (i + 1));
                i++;
            }
            else if ((c == 'C') || (c == 'c')) {
                value += 12 * Math.pow(16, length - (i + 1));
                i++;
            }
            else if ((c == 'D') || (c == 'd')) {
                value += 13 * Math.pow(16, length - (i + 1));
                i++;
            }
            else if ((c == 'E') || (c == 'e')) {
                value += 14 * Math.pow(16, length - (i + 1));
                i++;
            }
            else if ((c == 'F') || (c == 'f')) {
                value += 15 * Math.pow(16, length - (i + 1));
                i++;
            }
            else if ((c == 0) || (c == 'x')) {
                value = 0;
                i++;
            }
            else{
                value += Character.getNumericValue(c) * Math.pow(16 , (length) - (i + 1));
                i++;
            }
        }

        System.out.println("Your number is " + value + " in decimal");
    }

    }
