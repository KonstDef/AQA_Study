package Lesson12;

import java.util.Arrays;

public class StringEx {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = new String();
        String str3 = new String(new char[]{'H','e','l','l','o'});
        String str4 = new String(new char[]{'W','e','l','c','o','m','e'},3,4);

        System.out.println(str1);
        if(str2.length()==0){
            System.out.println("String is empty");
        } else{
            System.out.println(str2);
        }
        System.out.println(str3);
        System.out.println(str4);
        System.out.println();
        System.out.println(str3.concat(" "+str4));
        String str5 = "Год"+" "+2022;
        System.out.println(str5);
        System.out.println(String.join(" ",str3,str4,str5));System.out.println();
        System.out.println(str5.charAt(3));

        String str9="java";
        System.out.println(str9.equals(str1));
        System.out.println(str9.equalsIgnoreCase(str1));

        String str10 = " Hello Java! I'm Kostya ";
        System.out.println(str10.indexOf("K"));
        System.out.println(str10.lastIndexOf("a"));

        System.out.println(str10.startsWith("H"));
        System.out.println(str10.endsWith("a"));
        System.out.println(str10.startsWith(" ")&str10.endsWith(" "));

        System.out.println(str10.replace('K','k'));
        System.out.println(str10.trim());
        System.out.println(str10.substring(17,23));

        System.out.println(str10.toLowerCase());
        System.out.println(str10.toUpperCase());
        System.out.println(Arrays.toString(str10.split("!")));
    }
}
