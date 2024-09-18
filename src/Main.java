import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        //Welcome Message
        System.out.println("Welcome to Nathan's Grade Converter!");

        //Init and ass variables
        char[] gradeLetters = {'A', 'B', 'C', 'D', 'F'};
        int[] gradeNumbers = {4, 3 ,2 ,1, 0};

        //Create scanner to take user input
        Scanner scanner = new Scanner(System.in);

        //Aslk user for input
        System.out.print("Enter your grade letter (A, B, C, D, or F): ");
        char userInput = scanner.next().charAt(0);
        //Convert character grade to uppercase if not done already
        userInput = Character.toUpperCase(userInput);

        //Assign correct number to letter
        for (int i = 0; i < gradeLetters.length; i++){
            if (gradeLetters[i] == userInput) {
                System.out.println("You got a " + gradeNumbers[i] + "!");
                break;


            }
        }
        scanner.close();
    }
}
