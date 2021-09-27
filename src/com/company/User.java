package com.company;

import java.util.List;

public class User implements Observer{
    @Override
    public void update(List<String> events){
        System.out.println("There are some changes in your events:" + events);
    }
}
