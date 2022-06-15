/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thanhvp.mathutil.test.core;

import com.thanhvp.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Mr.Thanh
 */
public class MathUtilityTest {

    // đây là class sẽ sử dụng các hàm của thư viện/framework JUnit 
    // để kiểm thử/ kiểm tra code chính - hàm tính GiaiThừa() bên //class core.MathUtil
    // viết code để test code chính bên kia!!!
    // có nhiều quy tắc đặt tên hàm kiểm thử 
    // nhưng thường sẽ là nói lên mục đích của các case/ tình huống kiểm thử
    // tình huống xài hàm theo kiểu thành công và thất bại !!1
    // hàm dưới đây là tình hường test hàm chạy thành công, trả về ngon 
    // ta sẽ xài hàm kiểu well - đưa 5! 6! , hok chơi đưa -5!, 30!
    //@Test JUnit sẽ phối phợp với JVM để chạy hàm này 
    //@Test phía hậu trường chính là public static void main()
    // có nhiều @Test ứng với nhiều case khác nhau để kiểm thử hàm tính giai thừa 
    @Test
    public void testGteFactorialGivenRightArgumentReturnsWell() {
        int n = 0;//Test thử tình hướng tử tế đầu vào, m phải run đúng 
        long expected = 1;// hy vọng 0! =1

        // long actual =;// gọi hàm cẩn test bên core //app chính/ code chính
        long actual = MathUtil.getFactorial(n);

        // so sánh expected vs. actual dùng xanh xanh đỏ đỏ, framework 
        Assert.assertEquals(expected, actual);

        //gộp thêm vài hàm case thành công / đưa đầu vào ngon !! hàm phải tính ngon 
        Assert.assertEquals(1, MathUtil.getFactorial(1)); // 1
        Assert.assertEquals(2, MathUtil.getFactorial(2));  //2
        Assert.assertEquals(6, MathUtil.getFactorial(3));  //=6
        Assert.assertEquals(24, MathUtil.getFactorial(4)); //24
        Assert.assertEquals(120, MathUtil.getFactorial(5)); //120
        Assert.assertEquals(720, MathUtil.getFactorial(6)); //720

        // hàm giúp so sánh 2 giá trị nào đó có giống nhau hay k 
        // nếu giống nhau -> thấy  màu xanh -> ok 
        //              ít nhất cho case đang test
        // nếu k giống nhau-> thấy màu đỏ 
        //                      hàm ý expected và actual k giống nhau
    }
    //Hàm getF() ta thiết kế có 2 tình huống xử lí 
    //1. đưa data tử tế trong [0..20] -> tính đúng đc n! - done
    //2. đưa data vào cà chơn, âm,>20; THIẾT KẾ CỦA HÀM LÀ NÉM RA NGOẠI LỆ 
    //TAO KÌ VỌNG NGOẠI LỆ, XUẤT HIỆN KHI N < 0 || N >20
    // rất mong ngoại lệ xuất hiện với n cà chớn này 
    // nếu hàm nhận vào n <0  hoạc n>20 và hàm ném ra ngoại lệ
    // hàm chạy đúng như thiết kế
    // nếu hàm nhận vào n < 0 hoặc n >20  và hàm éo ném ra ngoại lệ
    //sure, HÀM CHẠY SAI THIẾT KẾ , SAI KÌ VỌNG , MÀU ĐỎ
    //test case: 
    //input:-5
    // expected: IlleagalArugumentException xuất hiện 
    // là những thứ k thể do lường so sánh theo kiểu value
    // mà chỉ có thể đo lường = cách chúng có xuất hiện hay k 
    // asserEquals() ko dùng để so sánh 2 ngoại lệ
    //      equals()  là bằng nhau hay k trên value!!
    
    
    //MÀU ĐỎ ĐÓ EM, DO HÀM ĐÚNG LÀ CÓ NÉM NGOẠI LỆ
    //              NHƯNG K PHẢI LÀ NGOẠI LỆ NHƯ KÌ VỌNG - THỰC SỰ KÌ VỌNG SAI 
    //              K PHẢI HÀM NÉM SAI
//    @Test(expected = NumberFormatException.class)
//    public void testGteFactorialGivenRightArgumentThrowsException() {
//        MathUtil.getFactorial(-5);  // hàm @Test chạy , hay hàm getF() chạy 
//                                    // sẽ ném về ngoại lệ NumberFormat...
//    }
    
     @Test //(expected = IllegalArgumentException.class)
    public void testGteFactorialGivenRightArgumentThrowsException() {
        MathUtil.getFactorial(-5);  // hàm @Test chạy , hay hàm getF() chạy 
                                    // sẽ ném về ngoại lệ NumberFormat...
    }
    
    // cách khác để bắt ngoại lệ xuất hiện, viết tự nhiên hơn!!!
    //
}
