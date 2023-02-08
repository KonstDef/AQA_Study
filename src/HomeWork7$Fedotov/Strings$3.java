package HomeWork7$Fedotov;

//3. Перевернуть строку, изменив расположение символов в строке задом наперёд.
public class Strings$3 {
    public static void main(String[] args) {
        String sentence = "Furthermore, this reverse speech serves as a direct subconscious commentary on the forward speech communication. " +
                "If you are lying in your forward statements, your reverse speech is revealing the truth.";

        StringBuffer sentenceRev = new StringBuffer(sentence);
        sentenceRev.reverse();

        System.out.println("------3------");
        System.out.println(String.join(": ", "Original", sentence));
        System.out.println(String.join(": ", "Modified", sentenceRev));
    }
}
