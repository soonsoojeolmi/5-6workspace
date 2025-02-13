package com.multi.b_method.run;

import com.multi.b_method.thread.CountThread;
import com.multi.b_method.thread.ImageThread;
import com.multi.b_method.thread.TimeThread;

public class Run2 {
    public static void main(String[] args) {
        TimeThread times = new TimeThread();
        ImageThread images = new ImageThread();
        CountThread counters = new CountThread();

        times.start();
        images.start();
        counters.start();
    }
}
