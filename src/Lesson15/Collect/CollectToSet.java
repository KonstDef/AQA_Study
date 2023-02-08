package Lesson15.Collect;

import java.util.*;
import java.util.stream.Collectors;

public class CollectToSet {
    public static void main(String[] args) {
        List<String> phone = new ArrayList<>();
        Collections.addAll(phone, "iPhone X", "Nokia 3310", "Huawei Nexus 6P", "Galaxy S11", "LG G6",
                "Xiaomi MI6", "ASUS Zenfone 3", "Sony Xperia Z5", "Meizu Pro 6", "Pixel 2","Pixel 2");

        Set<String> filteredPhonesSet = phone.stream()
                .filter(s -> s.length() < 10)
                .collect(Collectors.toSet());

        for (String s : filteredPhonesSet) {
            System.out.println(s);
        }
    }
}
