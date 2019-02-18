package com.cloud.client;

import java.util.concurrent.Callable;

/**
 * Description: test
 * FileName: MyCallable
 * Author:   ZhaoXiaoman
 * Date:     2019/1/26 14:25
 * History:
 * <author>          <time>          <version>          <desc>
 * Zhao Xiaoman      2019/1/26 14:25    1.0
 * 版权:   版权所有(C)2019
 * 公司:   东华云计算有限公司
 */

public class MyCallable implements Callable<String> {
    private long waitTime;
    public MyCallable(int timeInMillis){
        this.waitTime=timeInMillis;
    }
    @Override
    public String call() throws Exception {
        Thread.sleep(waitTime);
        //return the thread name executing this callable task
        return Thread.currentThread().getName();
    }

}
