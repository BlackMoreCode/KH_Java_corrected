package 코코아톡;

import java.util.Scanner;

public class CocoaMain {
    public static void main(String[] args) {
        CocoaTalk cocoaTalk = new CocoaTalk("Mr.Doom");
        cocoaTalk.writeMsg("Good day to die.");
        NetworkAdapter adapter = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("메세지를 전송할 네트워크 : [1]WiFi [2]5G [3]LTE : ");
        int sel = sc.nextInt();
        switch  (sel) {
            case 1: adapter = new WiFi(); break;
            case 2: adapter = new FiveG(); break;
            case 3: adapter = new LTE(); break;
            default: System.out.println("전송할 네트워크가 잘못 되었습니다");
        }
        if (adapter != null) cocoaTalk.send(adapter);
    }
}
