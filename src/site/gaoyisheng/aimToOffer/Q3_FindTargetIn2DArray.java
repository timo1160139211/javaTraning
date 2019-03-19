package site.gaoyisheng.aimToOffer;

public class Q3_FindTargetIn2DArray {
	
	public static void main(String[] args) {
		
		int[][] arr = {{1,2,3},{4,5,6}};
		System.out.println(Find(7,arr) + " " );
		System.out.println(Find(3,arr) + " " );
		System.out.println(Find(1,arr) + " " );
	}
    public static boolean Find(int target, int [][] array) {
        int i = array.length - 1, j = 0;
        boolean flag = false;
        
        System.out.println("初始 " + i + "  " + j);
        while(!flag && i >= 0 && j <= array[0].length - 1 ){
            if(array[i][j] == target){
                flag = true;//find
                continue;
            }else if(array[i][j] > target){
                i--;
                System.out.println(" " + i + "  " + j);
                continue;
            }else if(array[i][j] < target){
                j++;
                System.out.println(" " + i + "  " + j);
                continue;
            }
        }
        return flag;
    }
}

/**

Q:二维数组中的查找
*在一个二维数组中（每个一维数组的长度相同），
*每一行都按照从左到右递增的顺序排序，
*每一列都按照从上到下递增的顺序排序。
*请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。

A:
* 矩阵是有序的，从左下角来看，向上数字递减，向右数字递增，
* 因此从左下角开始查找，当要查找数字比左下角数字大时。右移
* 要查找数字比左下角数字小时，上移

*/