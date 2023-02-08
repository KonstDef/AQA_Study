package HomeWork7$Fedotov;

//1. Вырезать подстроку из строки начиная с первого вхождения символа(А) до, последнего вхождения символа(B).
public class Strings$1 {
    public static void main(String[] args) {
        String sentence = "The fact that there is a stairway to heaven and a highway to hell explains life well.";

        char A = 'r';
        char B = 'f';
        int indexOfA = sentence.indexOf(A);
        int indexOfB = sentence.lastIndexOf(B);

        StringBuffer sentenceSub = new StringBuffer(sentence.substring(indexOfA, indexOfB));

        System.out.println("------1------");
        System.out.println(String.join(": ", "Original", sentence));
        System.out.println(String.join(": ", "Modified", sentenceSub));
    }
}
