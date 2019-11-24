package org.demo.lib;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class LibTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void shouldBeFoo(){
        assertEquals("foo", new Lib().foo());
    }

    @Test
    public void shouldBeOne(){
        assertEquals(1, new Lib().one());
    }

    @Test
    public void shouldEcho(){
        String s = "hello";
        assertEquals(s, new Lib().echo(s));
    }
}
