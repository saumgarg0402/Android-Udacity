package com.udacity.gradle.builditbigger.app;

import android.app.Application;
import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.test.ApplicationTestCase;

import com.udacity.gradle.builditbigger.EndpointsAsyncTask;

import org.junit.Test;

import java.util.concurrent.CountDownLatch;

/**
 * Created by saumgarg on 11/12/17.
 */

public class TaskTest{

    CountDownLatch signal;
    Context context;

    @Test
    public void asyncTaskTest(){
        try{

            signal =  new CountDownLatch(1);
            context = InstrumentationRegistry.getContext();
            EndpointsAsyncTask endTask = new EndpointsAsyncTask(){
                @Override
                protected void onPostExecute(String result){
                    assert result.length() != 0;
                    signal.countDown();
                }
            };
            endTask.execute(context);
            signal.await();

        }catch(InterruptedException e){
            e.printStackTrace();
        }

    }
}
