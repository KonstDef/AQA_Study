package Lesson15.Skip_Limit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Skip_Limit_PageNav {
    public static void main(String[] args) {
        List<String> phone = new ArrayList<>();
        Collections.addAll(phone,"iPhone X","Nokia 3310","Huawei Nexus 6P","Galaxy S11","LG G6",
                "Xiaomi MI6","ASUS Zenfone 3","Sony Xperia Z5","Meizu Pro 6", "Pixel 2");

        int pageSize = 3;
        Scanner scanner = new Scanner(System.in);
        while (true){

            System.out.print("Enter page num: ");
            int page = scanner.nextInt();

            if(page<1) break;

            phone.stream().skip((page-1)*pageSize)
                    .limit(pageSize)
                    .forEach(s -> System.out.println(s));
            System.out.println("***");
        }
    }
}
