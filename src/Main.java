import java.util.Scanner;

/*

    Words to morse translator by Skav

    ver. 1.1

    Please don't copy code without providing the author

 */


public class Main {
    private static boolean work=true;

    public static void main(String[] args){
        System.out.println("Welcome in the translator words to morse alphabet !");
        Scanner input = new Scanner(System.in);
            System.out.print("Pleas enter your word/sentence: ");
            String word = input.nextLine();
            System.out.println("Thanks! The translation has begun");
            Morse morse = new Morse(word);
            morse.convertion();

            System.out.println("Your translated word is: " + morse.toString());

            input.close();
    }
}
