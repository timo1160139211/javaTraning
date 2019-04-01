/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: MyHandler
 * Author:   gaoyisheng
 * Date:     19-3-31 下午7:48
 * Description: 业务处理类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package site.gaoyisheng.handwork.jdkdynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 〈一句话功能简述〉<br> 
 * 〈业务处理类〉
 *
 * @author gaoyisheng
 * @create 19-3-31
 * @since 1.0.0
 */
public class ManHandler implements InvocationHandler {

    private Man man;

    public ManHandler(Man m){
        this.man = m;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        before();
        method.invoke(man,null);
        after();

        return null;
    }

    /**
     * before
     */
    public void before(){
        System.out.println("before");
    }

    /**
     * after
     */
    public void after(){
        System.out.println("after");
    }
}
