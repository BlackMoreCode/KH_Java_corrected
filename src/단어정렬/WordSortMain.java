package 단어정렬;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class WordSortMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        TreeSet<Word> set = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            set.add(new Word(name));
        }
        System.out.println("단어들 출력");
        for (Word e : set) {
            System.out.println(e);
        }
    }
}
