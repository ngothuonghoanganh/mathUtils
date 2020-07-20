/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math;

import static anh.util.MathUtil.computerFactories;

/**
 *
 * @author ngoanh
 */
public class Math {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //5! hy vong may in ra 120
        System.out.println("5! = " + computerFactories(5));

        //6! hy vong no in ra 720
        //thuc te in ra bao nhieu phai chay moi biet
        System.out.println("6! = " + computerFactories(6));
        //actueal: 720, expected 720 -> correct 
        //actueal: 1000, expected 720 -> error
        System.out.println("1! = " + computerFactories(1));
        //actueal: 1, expected 1 -> correct 
        //actueal: 720, expected 1 -> errorÏ
        System.out.println("-5! = " + computerFactories(-5));
//        ky vong nem ve ngoai le do dua vao du lieu sai do giai thua chi choi voi so duong
//        dung mau sac neu xanh la ky vong dung neu do la ky vong sai
//        viet them vao code de nem ra mau
//        phu tro Junit, Nunit, testNG, PHPunit, CPPunit, ...
//        chay, F6, nhin ket qua luan dung sai bang mat tren tung ham sout()
    }

}
