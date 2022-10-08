/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.minhng.mathutil.core;

/**
 *
 * @author Admin
 */
//Ta sẽ clone bộ thư viện/công cụ Math util của JDK
//Giả lập các hàm của class Math của JDK,
//Những gì mà là công cụ dùng cho hàm khác, class khác thì thường sẽ được
//Thiết kế là STATIC
//STATIC là chấm trực tiếp qua tên class, không có NEW
public class MathUtil {
    public static final double PI = 3.141592653589793;
    
    //Hàm tính n! = 1.2.3....n
    //Quy ước
    //Không có giai thừa cho số âm
    //0! = 1! = 1
    //21! vượt qua 18 số 0, vượt kiểu long
    //Hàm của chúng ta design là: chỉ chấp nhận tính giai thừa n từ 0...20
    //<0 || >20 chửi: MÀY ĐƯA n CÀ CHỚN
    public static long getFactorial(int n) {
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid n. n must be between 0..20");
        if (n == 0 || n == 1)
            return 1;
        long product = 1; //biến con heo đất, nhân tích lũy
                          //acc - accumulation góp dần
        for (int i = 2; i <= n; i++) 
            product *= i;
        return product;
    }
    
    //KỸ THUẬT LẬP TRÌNH KIỂU MỚI(VẪN GIỮ NGUYÊN NHỮNG KIẾN THỨC LẬP TRÌNH ĐÃ CÓ)
    //1 PLUGIN MỚI CHO TRÌNH ĐỘ CỦA DEV - VIẾT CODE
    //CHÂT LƯỢNG KHÔNG NÓI BẰNG MIỆNG, CHẤT LƯỢNG NÓI BẰNG CODE
    //KĨ THUẬT TDD - TEST DRIVEN DEVELOPMENT
    //VIẾT CODE ĐỂ TEST CODE SONG SONG VỚI NHAU
    //MỖI HÀM DEVELOPER VIẾT RA PHẢI VIẾT NGAY TEST CASE, PHẢI VIẾT NGAY HÀNH ĐỘNG
    //KIỂM THỬ HÀM, ĐỂ BIẾT RẰNG HÀM VỪA VIẾT CHẠY SAI HAY ĐỨNG
}
