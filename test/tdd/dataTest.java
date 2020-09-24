/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

import static anh.util.MathUtil.computerFactories;
import static junit.framework.Assert.assertEquals;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author ngoanh
 */
@RunWith(Parameterized.class)
public class dataTest {
    @Parameter(value = 0)
    public long expected;
    @Parameter(value = 1)
    public int actual;

    // chuan bi data theo cap expected-actual
    // no phai la mot ham static
    // bao cho junit biet day la bo data de xai
    @Parameters
    public static Integer[][] initData() {
        return new Integer[][]{
            {720,6},{120,5},{240,4},{1,0}
        };
    }

    @Test
    public void test() {
        assertEquals(expected, computerFactories(actual));
    }

    public dataTest() {
    }
}
