package Lesson15.Collect;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CollectToList {
    public static void main(String[] args) {
        List<String> phone = new ArrayList<>();
        Collections.addAll(phone, "iPhone X", "Nokia 3310", "Huawei Nexus 6P", "Galaxy S11", "LG G6",
                "Xiaomi MI6", "ASUS Zenfone 3", "Sony Xperia Z5", "Meizu Pro 6", "Pixel 2");

        List<String> filteredPhonesList = phone.stream()
                .filter(s -> s.length() < 10)
                .collect(Collectors.toList());

        for (String s : filteredPhonesList) {
            System.out.println(s);
        }
    }
}
