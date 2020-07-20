/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

import static anh.util.MathUtil.computerFactories;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;


/**
 *
 * @author ngoanh
 */
public class UnitTestTest {
    
    // day la class dung de test code chinh ben manth util 
    // khongo xai sout() ma dung mau xanh do
    // class nay chua rat nhieu ham main
    
    // dung @test, JVM

    /**
     *
     */
    
    @Test // ham main nay dung de test ca tinh huong
    public void testSuccessfulCasees(){
//        assertEquals(120, 720);
//        assertEquals(120, computerFactories(5));
//        assertEquals(720, computerFactories(6));
//        assertEquals(720*7, computerFactories(7));
//        assertEquals(2, computerFactories(2));
//        assertEquals(0, computerFactories(1));

    }
    
    @Test(expected = IllegalArgumentException.class)
         public void testFailedCasees(){
//        assertEquals(120, 720);
        // ham nay de test nhung tinh huong ca chon den tu nguoi dung
        // vi dung muon tinh -5! thi khong the thuc hien duoc
        // khi do trong thiet ke cua ham cF() ta phia du lieu tinh huong nay
        // tuc la khi nguoi dung dua data ca chon vao thi minh nem ra cai ngoai
        // le khong can xu li
        // Va ngoai le la 1 thu bat thuong, khong nhu du tinh, khong phai la 1 value
        // co the so sanh, tuc la khong the assertEquals(mot-cai-ngoai-le)
//        computerFactories(-5);
    }
    public UnitTestTest() {
    }
    
}
