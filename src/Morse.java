import java.util.Scanner;

public class Morse {

    private String word, morseWord="", morseCode="", englishWord;
    Scanner input = new Scanner(System.in);
    private int pro, action;
    char[] english = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
            'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x',
            'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0',
            ',', '.', '?', ' ', 'ą', 'ć', 'ę', 'ł', 'ń', 'ó', 'ś', 'ż', 'ź'};

    String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
            ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
            "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
            "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
            "-----", "--..--", ".-.-.-", "..--..", "/", ".-.-", "-.-..", "..-..", ".-..-", "--.--", "---.", "...-...", "--..-", "--"};

    public Morse()
    {
        this.word = "test";
        convertion();
    }

    public Morse(String word, int action)
    {
        this.word = word.toLowerCase();

        if(action == 1)
        {
            convertion();
        }
        else if(action == 2)
        {
            convertionMorseWord();
        }

    }

    public void convertion() {
        char[] chars = word.toCharArray();

        String str = "";
        boolean isEmpty = true;
        for (int i = 0; i < chars.length; i++) {
            pro = (i*100)/chars.length;
            System.out.println("Complete: " + Math.round(pro)+ "%");
            for (int j = 0; j < english.length; j++) {

                if (english[j] == chars[i]) {

                        morseWord = morseWord +" "+ morse[j];
                        isEmpty = false;

                }

            }

            if(isEmpty == true)
            {
                morseWord = morseWord + " " + "unknow sign("+chars[i]+")";
                System.out.println("Error: unknown sign");
            }
            isEmpty = true;

        }
    }

    public void convertionMorseWord(){

    boolean isEmpty = true;
    char[] code = word.toCharArray();

        for(int n = 0; n < code.length; n++)
        {
        morseCode = morseCode + code[n];
        if(code[n] == ' ')
        {
            morseCode = morseCode.substring(0, morseCode.length() - 1);
            for(int o = 0; o < morse.length; o++)
            {
                if(morseCode.equals(morse[o]))
                {
                    englishWord = englishWord + english[o];
                    morseCode = "";
                    isEmpty = false;
                }
            }
            if(isEmpty == true)
            {
                englishWord = englishWord + "   ->Error:  unknow morse code! ("+morseCode+")<-  ";
                morseCode = "";
            }
            isEmpty = true;
        }

        }
        morseWord = englishWord.substring(4, englishWord.length());
    }

    public String toString(){
        return morseWord;
    }
}


