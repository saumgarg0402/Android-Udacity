package com.udacity.gradle.builditbigger.jokes.test;

import org.junit.Test;
import com.udacity.gradle.builditbigger.jokes.TellJokes;

/**
 * Created by saumgarg on 10/12/17.
 */

public class TellJokesTest {

    @Test
    public void test(){
        TellJokes tj = new TellJokes();
        assert tj.getJokes().length() != 0;
    }
}
