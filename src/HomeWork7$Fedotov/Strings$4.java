package HomeWork7$Fedotov;

//4. Посчитать сколько строка содержит слов и определить является ли хотя бы одно из слов палиндромом
public class Strings$4 {
    public static void main(String[] args) {
        //String sentence = "In vino veritas, in aqua sanitas"; //no palyndrome
        String sentence = "Aibohphobia is a joke word meaning \"fear of palindromes\""; //palyndrome

        String regex = "[^a-zA-Z0-9\\s]"; //expression to delete everything except chars that makes words
        String[] words = sentence.replaceAll(regex,"").split(" "); //splits sentece to words
        int wordsCount = words.length;

        StringBuffer wordsPalyndrome = new StringBuffer(sentence);

        boolean isHasPolyndrome = false; //by default thereare
        for (String word : words) {
            wordsPalyndrome.replace(0, wordsPalyndrome.length(), word).reverse(); //get word and reverses it
            if (word.equalsIgnoreCase(wordsPalyndrome.toString())) isHasPolyndrome = true;
        }

        System.out.println("------4------");
        System.out.println(String.join(": ", "Original", sentence));
        System.out.println(String.join(": ", "Has number of words", Integer.toString(wordsCount)));
        System.out.println(String.join(": ", "Has polyndroms", isHasPolyndrome ? "Yes" : "No"));

    }
}