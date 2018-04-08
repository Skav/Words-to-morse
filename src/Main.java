import java.util.Scanner;

/*

    Words to morse translator by Skav

    ver. 1.1.1

    This is tested version!

    Please don't copy code without providing the author

 */


public class Main {

    public static void main(String[] args){

        String word="t";
        int action = 1;

        System.out.println("Welcome in the translator words to morse alphabet !");
        Scanner input = new Scanner(System.in);

        System.out.println("=========================");
        System.out.println("Select type of translate:");
        System.out.println("1. Words -> Morse");
        System.out.println("2. Morse -> Words");
        System.out.println("=========================");
        System.out.print("Write the number of option: ");

        switch (input.nextInt()){
            case 1:
                System.out.print("Write your words: ");
                action = 1;
                input.nextLine();
                word = input.nextLine();
                break;
            case 2:
                System.out.print("Write your morse code: ");
                action = 2;
                input.nextLine();
                word = input.nextLine();
                break;
        }
        Morse morse = new Morse(word, action);
        System.out.println("Your translated word is: " + morse.toString());

        /*
            System.out.print("Pleas enter your word/sentence: ");
            String word = input.nextLine();
            System.out.println("Thanks! The translation has begun");

            morse.convertion();

            System.out.println("Your translated word is: " + morse.toString());


            */

        input.close();
    }
}
