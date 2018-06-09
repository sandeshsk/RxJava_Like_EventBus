package com.example.rxjavalikeeventbus;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;

public class RxEventService extends IntentService {

    public RxEventService() {
        super("RxEveService");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        try {
            MyEventModel myEventModel= MyEventModel.getInstance();
            myEventModel.addEvent(MyEvents.ERORR);
            Thread.sleep(3000);

            myEventModel.addEvent(MyEvents.SUCCESS);
            Thread.sleep(3000);

            myEventModel.addEvent(MyEvents.ERORR);

            Thread.sleep(3000);
            myEventModel.addEvent(MyEvents.SUCCESS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }


}
