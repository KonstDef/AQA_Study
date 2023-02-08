package HomeWork7$Fedotov;

//2. Заменить все вхождения символа стоящего в позиции (3) на символ стоящий в позиции 0
public class Strings$2 {
    public static void main(String[] args) {
        String sentence = "Please try to understand, there is no great plan. We have cast our lies to the open skies";

        char A = sentence.charAt(0);
        char B = sentence.charAt(3);

        StringBuffer sentenceRep = new StringBuffer(sentence.replace(B, A));

        System.out.println("------2------");
        System.out.println(String.join(": ", "Original", sentence));
        System.out.println(String.join(": ", "Modified", sentenceRep));
    }
}
