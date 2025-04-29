package com.google.yashwant.week1homework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class cakebaker{

    @Autowired
    private  syrup syrup;
    @Autowired
    private  frosting frosting;

    void bakecake(){
        String fostingtype= frosting.getfrostingtype();
        String syruptype=syrup.getsyruptype();
        System.out.println("frostingType : " + fostingtype +"\n"+ "syrupType : " + syruptype);
    }
}