import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CheckLeapYear check = new CheckLeapYear();
        Scanner getInput = new Scanner(System.in);
        System.out.println("Please write the year you'd like to check:");
        int inputYear = getInput.nextInt();
        boolean trueOrFalse = check.isLeapYear(inputYear);
        if (trueOrFalse) {
            System.out.println("The year "+inputYear+" is a leap year.");
        }
        else {
            System.out.println("The year "+inputYear+" is not a leap year.");
        }


    }
}

