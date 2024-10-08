package HashMap기본;
// Map 인터페이스 : 키(key) 와 값(value) 쌍(pair) 으로 이루어진 자료를 관리하는 인터페이스
// 구현체 HashMap, TreeMap, HashTable, Properties

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {
    public static void main(String[] args) {
        // Map 생성
        Map<String, Integer> map = new HashMap<>();
        // 객체 추가 : Entry(키, 값)
        map.put("Joker", 90);
        map.put("Joker2", 20);
        map.put("Dark Knight", 100);
        map.put("Joker2", 40); // 키가 같으면 저장된 값이 대체된다.
        System.out.println("총 Entity 수 : " + map.size());
        System.out.println("Key로 값 찾기 : " + map.get("Joker2"));
        //반복 순회 방법 (향상된 for문 이용)
        for(String key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }
        //이전 방식 순회 : 반복자 (iterator)를 이용하는 방식. 현재 잘 안씀,
        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.println(key + " : " + map.get(key));
        }
    }
}
