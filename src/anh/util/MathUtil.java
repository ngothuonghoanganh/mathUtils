/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anh.util;

/**
 *
 * @author ngoanh
 */
// day la class chua cac ham tinh toan, toan hoc dung chung lam tien ich dung chung
public class MathUtil {
//    hamg tinh n! = 1.2.3..n
//    int chi chiu toi 2 ty 1
//    nen dung long nhung long chi co the tinh toi 15!

    public static long computerFactories(int n) {
//        long result = 1;
//        for (int i = 1; i <= n; i++) {
//            result *= i;
//        }
//        return result;
        if (n < 0 || n > 15) {
            throw new IllegalArgumentException("");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        
        return n * computerFactories(n - 1); //n! = n * (n - 1)!
    }
}
