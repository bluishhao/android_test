package com.example.cnedujnux2020101351;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class RollBallsTest {
    private BowlingGame g;
    @Before
    public void setUp() throws Exception{
        g=new BowlingGame();
    }



    private void Roll(int pin,int times) {
        for (int i = 0; i < times; i++)
            g.roll(pin);
    }

    @Test
    public void roll0_20() throws Exception {
        Roll(0,20);
        assertEquals(0, g.score());

    }
    @Test
    public void roll2_20() throws Exception {
        Roll(2,20);
        assertEquals(40, g.score());

    }
}