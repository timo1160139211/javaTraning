/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: AreaMain
 * Author:   gaoyisheng
 * Date:     19-3-31 下午5:29
 * Description: Main of Area
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package site.gaoyisheng.interfacetraning;

/**
 * 〈一句话功能简述〉<br> 
 * 〈Main of Area〉
 *
 * @author gaoyisheng
 * @create 19-3-31
 * @since 1.0.0
 */
public class AreaMain {

//    static double fun(Area a){
//
//        return a.calculateArea();
//    }

    public static void main(String[] args) {

        Area a = new Rectangle();
        ((Rectangle) a).l = 10;
        ((Rectangle) a).w = 10;

        Area b = new Circle();
        ((Circle) b).r = 10;

        System.out.println(a.calculateArea());
        System.out.println(b.calculateArea());

    }
}
