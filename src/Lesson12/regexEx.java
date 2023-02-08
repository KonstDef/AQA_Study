package Lesson12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexEx {
    public static void main(String[] args) {
//        Pattern pattern = Pattern.compile("Java", Pattern.CASE_INSENSITIVE);
        String text = "Егор Алла Александр";
        Pattern pattern = Pattern.compile("А.+а");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()){
            System.out.println(text.substring(matcher.start(), matcher.end()));
        }

        Pattern pattern2 = Pattern.compile("А.++");
        Matcher matcher2 = pattern2.matcher(text);
        while (matcher2.find()){
            System.out.println(text.substring(matcher2.start(), matcher2.end()));
        }

        Pattern pattern3 = Pattern.compile("А.+?а");
        Matcher matcher3 = pattern3.matcher(text);
        while (matcher3.find()){
            System.out.println(text.substring(matcher3.start(), matcher3.end()));
        }

        System.out.println("---------");
        Pattern pattern4 = Pattern.compile("\\s");
        String[] strings = pattern4.split(text,2);
        for (String s : strings){
            System.out.println(s);
        }
        System.out.println("---------");
        String[] strings1 = pattern4.split(text);
        for (String s : strings1){
            System.out.println(s);
        }
    }
}
