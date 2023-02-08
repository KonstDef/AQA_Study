package Lesson15.Skip_Limit;

import java.util.stream.Stream;

public class Skip_Limit {
    public static void main(String[] args) {
        Stream<String> phoneStream = Stream.of("iPhone X","Nokia 3310","Huawei Nexus 6P","Galaxy S11","LG G6",
                "Xiaomi MI6","ASUS Zenfone 3","Sony Xperia Z5","Meizu Pro 6", "Pixel 2");

        phoneStream.skip(1)
                .limit(2)
                .forEach(System.out::println);
    }
}
