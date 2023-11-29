package _08_collection_list;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Practice2 {
    public static void main(String[] args) {
        Map<String, Integer> test  = new HashMap<>();
        System.out.println("이름과 나이를 입력하세요. '종료'를 입력하면 종료됩니다.");
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.print("이름 입력: ");
            String name = sc.next();

            if(name.equals("종료")){
                break;
            }

            System.out.print("나이 입력: ");
            int age = sc.nextInt();

            test.put(name, age);

        }

        Set<Entry<String, Integer>> entrySet = test.entrySet();
        System.out.println("== 입력 받은 이름과 나이 목록 ==");
        Iterator<Entry<String, Integer>> iter = entrySet.iterator();
        while(iter.hasNext()) {
            Entry<String, Integer> entry = iter.next();
            String k = entry.getKey();
            Integer v = entry.getValue();
            System.out.println("이름: " + k + ", 나이: " + v);
        }
    }
}
