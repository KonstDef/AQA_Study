package Lesson15.Sorted;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class SortedEx {
    public static void main(String[] args) {
        List<String> phone = new ArrayList<>();
        Collections.addAll(phone,"iPhone X","Nokia 3310","Huawei Nexus 6P","Galaxy S11","LG G6",
                "Xiaomi MI6","ASUS Zenfone 3","Sony Xperia Z5","Meizu Pro 6", "Pixel 2");

        phone.stream()
                .filter(p->p.length()<12)
                .sorted()
                .forEach(System.out::println);
    }
}
