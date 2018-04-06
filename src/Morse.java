public class Morse {

    private String word, morseWord="";
    private int pro;
    char[] english = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
            'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x',
            'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0',
            ',', '.', '?', ' '};

    String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
            ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
            "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
            "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
            "-----", "--..--", ".-.-.-", "..--..", "/"};

    public Morse() {
        this.word = "test";
    }

    public Morse(String word) {
        this.word = word.toLowerCase();
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

    public String toString(){
        return morseWord;
    }
}


