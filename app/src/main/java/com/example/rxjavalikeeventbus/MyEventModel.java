package com.example.rxjavalikeeventbus;

import io.reactivex.Observable;
import io.reactivex.subjects.PublishSubject;

public class MyEventModel {

    PublishSubject<MyEvents> publish=PublishSubject.create();

    private static MyEventModel myEventModel;

    public static MyEventModel getInstance(){
        if(myEventModel==null){
            myEventModel=new MyEventModel();

        }
        return myEventModel;
    }


    public void addEvent(MyEvents myEvents){
        publish.onNext(myEvents);
    }

    public Observable<MyEvents> getObservable(){
        return publish;
    }

}
