package 커피메뉴만들기;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CoffeeMain {
    static Map<String, MenuInfo> map = new HashMap<>(); // 키값 하나에 value가 여러개가 올 수 있다
    public static void main(String[] args) {
        makeMenu();
        selectMenu();
    }
    static void makeMenu() {
        map.put("Americano", new MenuInfo("Americano", 2000, "Coffee", "기본 커피"));
        map.put("Espresso", new MenuInfo("Espresso", 2000, "Coffee", "진한 커피"));
        map.put("Latte", new MenuInfo("Latte", 4000, "Coffee", "우유 커피"));
    }
    static void selectMenu() {
        Scanner sc = new Scanner(System.in);
        String key;
        while(true) {
            System.out.println("메뉴를 선택하세요 : ");
            System.out.print("[1]메뉴보기 [2]메뉴조회 [3]메뉴추가 [4]메뉴삭제 [5]메뉴수정 [6]종료 ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("메뉴 리스트 보기");
                    // keySet() 이용해서 반복 순회
                    for(String e : map.keySet()) {
                        System.out.println("이름: " + map.get(e).getName());
                        System.out.println("가격: " + map.get(e).getPrice());
                        System.out.println("분류: " + map.get(e).getCategory());
                        System.out.println("설명: " + map.get(e).getDesc());
                        System.out.println(" ==================== ");
                    }
                    break;
                case 2:
                    System.out.println("조회할 메뉴 이름 입력");
                    // containsKey(키) 이용해서, 해당 키가 map 내에 있는지 확인
                    String findName = sc.next();
                    if (map.containsKey(findName)) {
                        System.out.println(findName + "가 존재합니다.");
                        System.out.println("이름: " + map.get(findName).getName());
                        System.out.println("가격: " + map.get(findName).getPrice());
                        System.out.println("분류: " + map.get(findName).getCategory());
                        System.out.println("설명: " + map.get(findName).getDesc());

                    } else {
                        System.out.println("해당 메뉴가 존재하지 않습니다");
                    }
                    break;
                case 3:
                    System.out.println("추가할 메뉴 이름 입력");
                    // containskey(키)로 해당 키 존재하는지 확인 뒤, 없을 시 키와 값을 입력 받아서 put() 이용해서 추가
                    String addName = sc.next();
                    if (!map.containsKey(addName)) {
                        System.out.println("새로 넣을 이름, 가격, 카테고리 및 설명을 차례대로 추가해주세요");
                        String newName = sc.next();
                        int newPrice = sc.nextInt();
                        String newCategory = sc.next();
                        String newDesc = sc.next();
                        map.put(addName, new MenuInfo(newName, newPrice, newCategory, newDesc));
                        System.out.println(addName + "이 추가되었습니다.");
                    }
                    break;
                case 4:
                    System.out.println("삭제할 메뉴 이름 입력");
                    // containskey(키)로 해당 키 존재하는지 확인 뒤, 있을시 remove(키) 이용해서 제거
                    String deleteName = sc.next();
                    if (map.containsKey(deleteName)) {
                        map.remove(deleteName);
                        System.out.println(deleteName + "이 제거되었습니다.");
                    }
                    break;
                case 5:
                    System.out.println("수정할 메뉴 이름 입력");
                    String replaceName = sc.next();
                    if (map.containsKey(replaceName)) {
                        System.out.println("변경할 넣을 이름, 가격, 카테고리 및 설명을 차례대로 추가해주세요");
                        String newName = sc.next();
                        int newPrice = sc.nextInt();
                        String newCategory = sc.next();
                        String newDesc = sc.next();
                        map.put(replaceName, new MenuInfo(newName, newPrice, newCategory, newDesc));
                    }
                    break;
                case 6:
                    System.out.println("메뉴를 종료합니다");
                    return;
                default:
                    System.out.println("선택된 메뉴가 없습니다");
            }
        }
    }
}
