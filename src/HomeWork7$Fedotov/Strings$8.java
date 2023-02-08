package HomeWork7$Fedotov;

//8. Слить две строки, вставив символы одной строки между символами другой строки
public class Strings$8 {
    public static void main(String[] args) {
        String sentence1 = "To or not to";
        String sentence2 = "be";

        StringBuffer sentence3 = new StringBuffer(sentence1.length()+sentence2.length()*2);
        sentence3.append(sentence1);
        sentence3.append(" ".concat(sentence2));
        sentence3.insert(3,sentence2.concat(" "));

        System.out.println("------8------");
        System.out.println(String.join(": ", "Sentence 1", sentence1));
        System.out.println(String.join(": ", "Sentence 2", sentence2));
        System.out.println(String.join(": ", "Together", sentence3));
    }
}