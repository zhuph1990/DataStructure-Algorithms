package com.zph;


import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Test1 {


    @Test
    public void test() {
        List<Integer> list = new ArrayList<>(100);
        for (int i = 0; i < 100; i++) {
            int num = (int) ((Math.random() * 100) + 1);
            list.add(num);
        }
        System.out.println(list.toString());
    }

}
