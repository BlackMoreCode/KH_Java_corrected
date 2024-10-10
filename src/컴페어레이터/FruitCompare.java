package 컴페어레이터;

import java.util.Comparator;

public class FruitCompare implements Comparator<Fruit> {
    @Override
    public Comparator<Fruit> reversed() {
        return Comparator.super.reversed();
    }
    @Override
    public int compare(Fruit o1, Fruit o2) {
        if(o1.getPrice() < o2.getPrice()) return 1; // 내림차순
        else if(o1.getPrice() == o2.getPrice()) {
            return o1.getName().compareTo(o2.getName());    // compareTo => 문자열 비교
        } else return -1;
    }
}
