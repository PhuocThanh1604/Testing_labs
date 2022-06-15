/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thanhvp.mathutil.main;

import com.thanhvp.mathutil.core.MathUtil;

/**
 *
 * @author Mr.Thanh
 */
public class Main {
    public static void main(String[] args) {
        //thử nghiệm hàm tính giai thừa coi chạy đúng như thiết kế hay k 
        //ta phải đưa ra các tình huống sử dụng hàm trong thực 
        // ví dụ :-5 coi tính đc k 
        // 0 ?
       //20=?
       //Test case: một tình huống hàm / app/ màn hình/ tính năng đc đưa vào sử dụng 
       // giả lập hành vi xài của ai đó
       //TEST CASE: LÀ 1 tình huống sử dụng ,xài APP(HÀM) MÀ NÓ BAO GỒM
       // DATA ĐẦU VÀO CỤ THỂ NÀO ĐÓ
       // OUTPUT ĐẦU ỨNG VỚI XỬ LÍ CỦA HÀM/CHỨC NĂNG CỦA APP, DĨ NHIÊN DÙNG ĐẦU VÀO ĐỂ XỬ LÍ 
       // SO SÁNH ĐỂ BIẾT KẾT QUẢ CÓ NHƯ KÌ VỌNG HAY K 
       //KÌ VỌNG: MONG HÀM SẼ TRẢ VỀ VALUE NÀO ĐÓ ỨNG VỚI INPUT Ở TRÊN
       long expected =120;//kì vọng hàm ói về 120 nếu tính 5!
       int n=5;             // input
       long actual = MathUtil.getFactorial(n);
        System.out.println("5! =" +expected +"expected");
        System.out.println("5! =" +actual + "actual");
    }
}
