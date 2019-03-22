package site.gaoyisheng.aimToOffer;

import java.lang.Math;
public class Q12_PowerDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Math.pow(2,2);
		//System.out.println(Powerz(3.14,2));
		System.out.println("运算结果 : \t " + Power0(15,9));
	}

	public static double Powerz(double base,int exponent){
		double d =1;
		while(exponent > 0){
			d *= base;
			exponent--;
		}
		return d;
	}
	
    public static double Power0(double base, int exponent) {
        double d = 1;
        if(exponent != 0){
            while(exponent > 0){
                if(exponent % 2 == 1){
                    d *= base;	System.out.println("d:\t " + d);
                }
                base *= base;	System.out.println("base:\t " + base);
                exponent >>= 1;	System.out.println("exp:\t " + exponent);
            }//while
        }//if
        return d;
    }
    
    
	//考虑负指数的情况
    public static double Power(double base, int exponent) {
        double d = 1;//default = 1; if exp == 0 ,deturn 1;
        boolean flag = true;
        if(exponent != 0){
            //如果
            if(exponent < 0){
                exponent = Math.abs(exponent);
                flag = false;
            }
            while(exponent > 0){
                if(exponent % 2 == 1){
                    d *= base;
                }
                base *= base;
                exponent >>= 1;
            }
            
        }//
        
        if(flag) {
        	return d;
        }else {
        	return 1/d;
        }

    }
}



/**
 * Q:
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 * 
 * 
 * A:
 * 
 * 
 */

/*剑指书中细节：
*1.当底数为0且指数<0时
*会出现对0求倒数的情况，需进行错误处理，设置一个全局变量；
*2.判断底数是否等于0
*由于base为double型，不能直接用==判断
*3.优化求幂函数
*当n为偶数，a^n =（a^n/2）*（a^n/2）
*当n为奇数，a^n = a^[(n-1)/2] * a^[(n-1)/2] * a
*时间复杂度O(logn)
*/