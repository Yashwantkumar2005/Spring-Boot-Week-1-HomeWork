package com.google.yashwant.week1homework;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

@Service
@ConditionalOnProperty(value = "syrup.flavour", havingValue = "strawberry")
public class strawberrysyrup implements syrup {
    @Override
    public String getsyruptype() {
        return "strawberry syrup";
    }
}
