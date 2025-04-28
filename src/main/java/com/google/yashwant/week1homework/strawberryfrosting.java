package com.google.yashwant.week1homework;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

@Service
@ConditionalOnProperty(value = "frosting.flavour", havingValue = "strawberry")
public class strawberryfrosting implements frosting {
    @Override
    public String getfrostingtype() {
        return "strawberry frosting";
    }
}
