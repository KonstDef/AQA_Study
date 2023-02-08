package Lesson15.Sorted;

import java.util.stream.Stream;

public class SortCompEx {
    public static void main(String[] args) {
        Stream<Phone> phoneStream = Stream.of(new Phone("oPPhone 11", 10000, "AmericanCap"),
                new Phone("KaPhone 3232", 1000, "RandoChine"),
                new Phone("UsPhone M", 5000, "SSKTech"),
                new Phone("bculbPhone", 7500, "NTechInc"));

        phoneStream.sorted(new PhoneComparator())
                .forEach(phone -> System.out.printf("%s (%s) - %d\n",phone.getName(),phone.getCompany(),phone.getPrice()));
    }
}
