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
    @Test
    public void roll0_20() throws Exception {
        Roll(0,20);
        assertEquals(0, g.score());

    }


    private void Roll(int pin,int times) {
        for (int i = 0; i < times; i++)
            g.roll(pin);
    }



}