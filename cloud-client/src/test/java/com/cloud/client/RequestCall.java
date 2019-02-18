package com.cloud.client;

import java.util.concurrent.Callable;

/**
 * Description: 有返回的多线程
 * FileName: RequestCall
 * Author:   ZhaoXiaoman
 * Date:     2019/1/25 17:22
 * History:
 * <author>          <time>          <version>          <desc>
 * Zhao Xiaoman      2019/1/25 17:22    1.0
 * 版权:   版权所有(C)2019
 * 公司:   东华云计算有限公司
 */

public class RequestCall implements Callable<String> {
    @Override
    public String call() throws Exception {
        return "wo shi" + Thread.currentThread().getName();
    }
}
