/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.minhng.mathutil.main;

import com.minhng.mathutil.core.MathUtil;

/**
 *
 * @author Admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        tryTDDFirst();
    }
    
    //TEST CASE #1 - Tình huống xài hàm số 1
    //n = 0, hy vọng hàm trả về expected = 1
    //       thực tế hàm trả về mấy, actual, đoán xem
    
    //TEST CASE #2 - Tình huống xài hàm số 2
    //n = 1, 1! hy vọng hàm trả về 1
    //       thực tế là mấy
    
    //TEST CASE #3 - Tình huống xài hàm số 3
    //n = 2, 2! hy vọng hàm trả về 2
    //       thực tế là mấy
    
    public static void tryTDDFirst() {
        long expected = 1;
        long actual = MathUtil.getFactorial(1);//xài hàm vừa viết
        //so sánh 2 giá trị để hàm viết đúng hay không?
        //3 thứ này tổ hợp lên 1 thứ gọi là TEST CASE - TÌNH HUỐNG XÀI HÀM/XÀI APP
        System.out.println("0! Status | Expected = " + expected +
                " | Actual = " + actual);
        System.out.println("1! Status | Expected = " + expected +
                " | Actual = " + actual);
        System.out.println("2! Status | Expected = 2" +
                " | Actual = " + MathUtil.getFactorial(2));
    }
}
