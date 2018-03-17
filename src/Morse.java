public class Morse {

    private String word, lowLetter, morseCode, morseWord = "";
    private double pro;

    public Morse()
    {
        this.word = "test";
    }

    public Morse(String word)
    {
        this.word = word;
    }

    public void convertion()
    {
        word = word.toLowerCase();
        for(int i = 0; i<word.length(); i++)
        {
            pro = (i*100)/word.length();
            System.out.println(pro);
            System.out.println("Complete:" + Math.round(pro) + "%");
            lowLetter = word.substring(i, i+1);
            switch (lowLetter){
                case "a":
                    morseCode =  ".-";
                    break;
                case "b":
                    morseCode =  "-...";
                    break;
                case "c":
                    morseCode =  "-.-.";
                    break;
                case "d":
                    morseCode =  "-..";
                    break;
                case "e":
                    morseCode =  ".";
                    break;
                case "f":
                    morseCode =  "..-.";
                    break;
                case "g":
                    morseCode =  "--.";
                    break;
                case "h":
                    morseCode =  "....";
                    break;
                case "i":
                    morseCode =  "..";
                    break;
                case "j":
                    morseCode =  ".---";
                    break;
                case "k":
                    morseCode =  "-.-";
                    break;
                case "l":
                    morseCode =  ".-..";
                    break;
                case "m":
                    morseCode =  "--";
                    break;
                case "n":
                    morseCode =  "-.";
                    break;
                case "o":
                    morseCode =  "---";
                    break;
                case "p":
                    morseCode =  ".--.";
                    break;
                case "r":
                    morseCode =  ".-.";
                    break;
                case "s":
                    morseCode =  "...";
                    break;
                case "t":
                    morseCode =  "-";
                    break;
                case "u":
                    morseCode =  "..-";
                    break;
                case "v":
                    morseCode =  "...-";
                    break;
                case "w":
                    morseCode =  ".--";
                    break;
                case "x":
                    morseCode =  "-..-";
                    break;
                case "y":
                    morseCode =  "-.--";
                    break;
                case "z":
                    morseCode =  "--..";
                    break;
                case " ":
                    morseCode = " / ";
                    break;
            }
            morseWord = morseWord + " " + morseCode;

        }
        System.out.println("Your word ("+word+") in morse alphabet is: " + morseWord);
    }
}
