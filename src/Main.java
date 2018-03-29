import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        System.out.println("Welcome in the translator words to morse alphabet !");
        System.out.print("Pleas enter your word/sentence: ");
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        System.out.println("Thanks! The translation has begun");
        Morse morse = new Morse(word);
        morse.convertion();

        System.out.println(morse.toString());

        input.close();
    }
}
