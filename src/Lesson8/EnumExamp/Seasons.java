package Lesson8.EnumExamp;

import java.util.Arrays;

public class Seasons {
    public static void main(String[] args) {
        Season season = Season.WINTER;
        if(season==Season.WINTER) season = Season.SUMMER;
        System.out.println(season);
        System.out.println("---");
        System.out.println(Season.class.getSuperclass());
        System.out.println("---");
        System.out.println("season.name() = "+season.name() + "\nseason.toString() = "+season.toString()+"\nseason.ordinal() = "+season.ordinal());
        System.out.println("---");
        System.out.println(Season.valueOf("WINTER"));
        System.out.println("---");
        System.out.println(Arrays.toString(Season.values()));
    }
}

enum Season{
    WINTER, //0
    SPRING, //1
    SUMMER, //2
    AUTUMN  //3
}