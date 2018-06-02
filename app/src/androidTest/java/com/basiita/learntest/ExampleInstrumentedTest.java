package com.basiita.learntest;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.espresso.remote.EspressoRemoteMessage;
import android.support.test.runner.AndroidJUnit4;
import android.widget.Toast;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;
import  com.basiita.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();
//      Toast.makeText(appContext.getApplicationContext(),"android test", Toast.LENGTH_LONG).show();
        assertEquals("com.basiita.learntest", appContext.getPackageName());
    }

    @Test
    public  void test_createMessagebox()
    {
        MainActivity mainActivity=new MainActivity();
        mainActivity.Write_to_shard_prefrance("said");
        assertEquals("mahmoud",mainActivity.read_to_shard_prefrance());
    }
}
