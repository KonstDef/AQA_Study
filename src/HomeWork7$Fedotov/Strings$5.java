package HomeWork7$Fedotov;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//5. Даны два предложения посчитать сколько слов совпадает.
public class Strings$5 {
    public static void main(String[] args) {
        String sentence = "The fact that there is a stairway to heaven and a highway to hell explains life well.";
        String sentenceComparison = "There is a lady who is sure all that glitters is gold. And she is buying a stairway to heaven";

        String regex = "[^a-zA-Z0-9\\s]"; //deletes non words char
        Set<String> wordsUnique = new HashSet<>(); //uses set to get unique words from sentence1
        Set<String> wordsComparison = new HashSet<>(); //uses set to get unique words from sentence2
        wordsUnique.addAll(Arrays.asList(sentence.replace(regex,"").toUpperCase().split(" ")));
        wordsComparison.addAll(Arrays.asList(sentenceComparison.replace(regex,"").toUpperCase().split(" ")));
        //UpperCase is required for ignore cases

        int wordsCommonNum = 0;
        for (String wordA : wordsUnique) {
            for (String wordB : wordsComparison) {
                if (wordA.equalsIgnoreCase(wordB)) wordsCommonNum++;
            }
        }

        System.out.println("------5------");
        System.out.println(String.join(": ", "Original", sentence));
        System.out.println(String.join(": ", "And", sentenceComparison));
        System.out.println(String.join(": ", "Has number of common words", Integer.toString(wordsCommonNum)));
    }
}
