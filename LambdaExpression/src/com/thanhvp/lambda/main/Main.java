/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thanhvp.lambda.main;

import com.thanhvp.lambda.core.Salutation;

/**
 *
 * @author Mr.Thanh
 */
public class Main {
    public static void main(String[] args) {
        //xài interface kiểu truyền thống - new class Con đã implements Cha
        SalutationVN loichao=  new SalutationVN();
        loichao.sayhello();
        
        //xài cách 2, éo thèm làm class Con implements Cha
        //xài kiểu on-the-go, take-away
        //ANONYMOUS CLASS NGHĨA LÀ ÉO CẦN TẠO CLASS TƯỜNG MINH 
        //CHỈ CẦN NEW VÀ GÕ CODE VÀ CHẤM HOY MÀ 
        
        Salutation helloEN = new Salutation() {
            @Override
            public void sayhello() {
                System.out.println("TRường 3 chux2... RUN");
            }
        };//VIP
        
        helloEN.sayhello();
        
        // vì chỉ có 1 hàm trong interface, và cần có code cho hàm này khi xài 
        // dù là anoymous hay làm class riêng 
        // vì chỉ có 1 hàm duy nhất, mà lại cần code/ implement, tại sao 
        // k tập trung vào codem mà mắc mớ viết cả tên làm chi 
        // rút gọn từ class riêng rẽ thành anounymous, bớt đc tên class
        //                             bớt luôn tên hàm cho gọn -> lambada expression 
        // chỉ còn cái dây nịt - code của hàm mà hoy 
        // chỉ đc xài cái dây nịt - lambda ex- khi chơi với functional interface
        // interface chỉ có 1 hàm 
        
        // chào = tiếng hàn, nhật ....
        // c1: class rời rac SalutationJP, KR, viết code
        // c2: on the -go anounymous 
        // c3: lambda
        
        Salutation helloJP= () -> System.out.println("say hentai");;
        
        helloJP.sayhello();
    }
}
