package Lesson15.Sorted;

import java.util.Comparator;

public class PhoneComparator implements Comparator <Phone>{

    @Override
    public int compare(Phone a, Phone b) {
        return a.getName().toUpperCase()
                .compareTo(b.getName().toUpperCase());
    }
}
