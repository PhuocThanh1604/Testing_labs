/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thanhvp.lambda.core;

/**
 *
 * @author Mr.Thanh
 */

@FunctionalInterface// chỉ được 1 hàm k có code nếu dùng FunctionalInterfaces chỉ có duy nhất 1 hàm abstract
public interface Salutation {// vì chỉ có 1 hàm , sau này khi new()
                            //vùng ram chỉ có 1 hàm, dẹp mẹ tên hàm khi xài 
                            // vì k có sự nhầm lẫn giữa hàm này và hàm kia 
                            // Lambda expression chỉ được sử dụng 
                            // khi chơi với INTERFACE MÀ CHỈ CÓ 1 HÀM DUY NHẤT
//    public default void sayhello() {
//    }
    public void sayhello();// hàm k có code
//    public void sayhello1(); 
}
