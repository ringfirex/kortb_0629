package com.ll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//- 5단계 : 목록
//== 명언 앱 ==
//명령) 등록
//명언 : 현재를 사랑하라.
//작가 : 작자미상
//1번 명언이 등록되었습니다.
//명령) 등록
//명언 : 과거에 집착하지 마라.
//작가 : 작자미상
//2번 명언이 등록되었습니다.
//명령) 목록
//번호 / 작가 / 명언
//----------------------
//2 / 작자미상 / 과거에 집착하지 마라.
//1 / 작자미상 / 현재를 사랑하라.
//명령) 종료

class App {
    void run() {
        Scanner sc = new Scanner(System.in);
        String strcmd;
        int num = 0;

        // 저장하기 위하여
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        System.out.println("== 명언 앱 ==");

        while (true) {
            System.out.print("명령) ");
            strcmd = sc.nextLine();

            if (strcmd.equals("등록")) {
                num++;

                System.out.print("명언 : ");
                String str1 = new String(sc.nextLine());

                System.out.print("작가 : ");
                String str2 = new String(sc.nextLine());

                list1.add(str1);
                list2.add(str2);

                System.out.println(num + "번 명언이 등록되었습니다.");

                strcmd = "";
                continue;
            }

            if (strcmd.equals("목록")) {
                System.out.println("번호 / 작가 / 명언");
                System.out.println("--------------------------------------");

                for (int i = 0; i < list1.size(); i++) {
                    System.out.print((i + 1) + " / ");
                    System.out.print(list2.get(i) + " / ");
                    System.out.print(list1.get(i));
                    System.out.println();
                }

                System.out.println("======================================");
            }

            if (strcmd.equals("종료")) {
                break;
            }
        }


    }
}
