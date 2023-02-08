package HomeWork6$Fedotov.Comparators;

import HomeWork6$Fedotov.Good;
import java.util.Comparator;

public class GoodComparatorByPrice implements Comparator<Good> {
    @Override
    public int compare(Good o1, Good o2) {
        return Double.compare(o1.getPrice(), o2.getPrice());
    }
}
