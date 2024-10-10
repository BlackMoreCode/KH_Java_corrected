package 단어정렬;

import java.util.Comparator;

public class Word implements Comparator<Word> {
    private String name;

    public Word(String name) {
        this.name = name;
    }

    @Override
    public int compare(String o1, String o2) {
        if(o1.length() == o2.length()) {
            return o1.compareTo(o2);
        } else {
            return o1.length() - o2.length();
        }
    }

    @Override
    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}