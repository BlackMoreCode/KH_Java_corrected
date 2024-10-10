package 큐기본;

import java.util.LinkedList;
import java.util.Queue;

// Queue는 FIFO => First In First Out 구조
// 자바에서 Queue는 LinkedLisdt를 활용하여 생성해야 함 => LinkedList가 import 되어야 한다.
public class QueueEx {
    public static void main(String[] args) {
        Queue<Message> msgQueue = new LinkedList<>();
        // offer는 객체를 queue에 추가, 실패시 false를 반환
        msgQueue.offer(new Message("MAIL", "DIO"));
        msgQueue.offer(new Message("SMS", "PUCCI"));
        msgQueue.offer(new Message("Kakao", "KAKAROT"));

        while (!msgQueue.isEmpty()) {
            Message msg = msgQueue.poll();  // 객체를 꺼내서 반환
            switch (msg.getCommand()) {
                case "MAIL":
                    System.out.println(msg.getTo() + " 에게 메일을 보냅니다.");
                    break;
                case "SMS":
                    System.out.println(msg.getTo() + " 에게 문자를 보냅니다.");
                    break;
                case "Kakao":
                    System.out.println(msg.getTo() + " 에게 카톡을 보냅니다.");
                    break;
            }
        }
    }
}

class Message {
    public String command;
    public String to;

    public Message(String command, String to) {
        this.command = command;
        this.to = to;
    }

    public String getCommand() {
        return command;
    }

    public String getTo() {
        return to;
    }
}