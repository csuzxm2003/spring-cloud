package com.cloud.client;

import java.util.ArrayList;
import java.util.List;

/**
 * Description: 测试
 * FileName: Test
 * Author:   ZhaoXiaoman
 * Date:     2019/1/31 13:53
 * History:
 * <author>          <time>          <version>          <desc>
 * Zhao Xiaoman      2019/1/31 13:53    1.0
 * 版权:   版权所有(C)2019
 * 公司:   东华云计算有限公司
 */

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        list.add("g");
        list.add("h");
        list.add("i");
        list.add("j");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + "===" + list.get(i));
        }

        list.remove(3);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + "===>" + list.get(i));
        }
    }
}
