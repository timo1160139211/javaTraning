/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Circle
 * Author:   gaoyisheng
 * Date:     19-3-31 下午5:53
 * Description: Circle
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package site.gaoyisheng.interfacetraning;

/**
 * 〈一句话功能简述〉<br> 
 * 〈Circle〉
 *
 * @author gaoyisheng
 * @create 19-3-31
 * @since 1.0.0
 */
public class Circle implements Area {
    double r;
    final double pie = 3.1415926535;
    @Override
    public double calculateArea() {
        return r*r*pie;
    }
}
