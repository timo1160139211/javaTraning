/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Main
 * Author:   gaoyisheng
 * Date:     19-3-31 下午7:58
 * Description: Main
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package site.gaoyisheng.handwork.jdkdynamicproxy;

import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.lang.reflect.Proxy;

/**
 * 〈一句话功能简述〉<br> 
 * 〈Main〉
 *
 * @author gaoyisheng
 * @create 19-3-31
 * @since 1.0.0
 */
public class Main {

    public static void main(String[] args) {
        Man man = new Gaoyisheng();
        ManHandler manHandler = new ManHandler(man);

        Man proxyMan = (Man) Proxy.newProxyInstance(man.getClass().getClassLoader(),new Class[]{Man.class},manHandler);

        System.out.println(proxyMan.getClass().getName());
        proxyMan.findObject();


    }

    private static void createProxyClassFile(Class c){
        byte[] data = ProxyGenerator.generateProxyClass("$Proxy0",new Class[]{c});

        //写入文件

        try{
            FileOutputStream fileOutputStream = new FileOutputStream("$Proxy0.class");
            fileOutputStream.write(data);
            fileOutputStream.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
