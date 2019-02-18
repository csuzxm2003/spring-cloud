package com.cloud.client;

/**
 * Description: 多线程测试
 * FileName: RequestThread
 * Author:   ZhaoXiaoman
 * Date:     2019/1/25 14:30
 * History:
 * <author>          <time>          <version>          <desc>
 * Zhao Xiaoman      2019/1/25 14:30    1.0
 * 版权:   版权所有(C)2019
 * 公司:   东华云计算有限公司
 */

public class RequestThread  implements Runnable{
    private Object lock = RequestThread.class;
    private int offset = 0;
    private int limit = 0;

    public RequestThread(int offset, int limit){
        this.offset = offset;
        this.limit = limit;
    }

    public void  run(){
        synchronized (lock){
            if (offset < 9){
                try {
                    lock.wait();
                    System.out.println("======================");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        synchronized (lock){
            lock.notify();
            System.out.println(Thread.currentThread().getName());
            System.out.println("offset==" + offset + "::" + "limit==" + limit);
        }
    }
}
