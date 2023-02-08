package HomeWork6$Fedotov2.Comparators;

import HomeWork6$Fedotov.Good;
import java.util.Comparator;

public class GoodComparatorById implements Comparator<Good> {
    @Override
    public int compare(Good o1, Good o2) {
        return o1.getId().compareTo(o2.getId());
    }
}