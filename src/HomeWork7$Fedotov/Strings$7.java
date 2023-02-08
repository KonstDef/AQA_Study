package HomeWork7$Fedotov;

// 7. Даны строки разной длины (длина - четное число), необходимо вернуть ее два средних знака.
// "string" → "ri", "code" → "od", "Practice"→"ct".
public class Strings$7 {
    public static void main(String[] args) {
        String word1 = "string";
        String word2 = "code";
        String word3 = "Practice";

        String word1Mid = word1.substring(word1.length()/2-1,word1.length()/2+1);
        String word2Mid = word2.substring(word2.length()/2-1,word2.length()/2+1);
        String word3Mid = word3.substring(word3.length()/2-1,word3.length()/2+1);

        System.out.println("------7------");
        System.out.println(String.join(": ", "Word 1", word1Mid));
        System.out.println(String.join(": ", "Word 2", word2Mid));
        System.out.println(String.join(": ", "Word 3", word3Mid));
    }
}