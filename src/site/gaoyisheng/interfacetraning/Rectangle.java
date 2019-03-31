/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Rectangle
 * Author:   gaoyisheng
 * Date:     19-3-31 下午5:28
 * Description: rectangle
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package site.gaoyisheng.interfacetraning;

/**
 * 〈一句话功能简述〉<br> 
 * 〈rectangle〉
 *
 * @author gaoyisheng
 * @create 19-3-31
 * @since 1.0.0
 */
public class Rectangle implements Area {

    int w;
    int l;

    @Override
    public double calculateArea() {
        return w*l;
    }
}
