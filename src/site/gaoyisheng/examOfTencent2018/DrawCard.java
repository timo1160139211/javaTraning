package site.gaoyisheng.examOfTencent2018;

import java.util.Scanner;


//idea 1: �����򣬴Ӵ�С���������-ż����ĺ͡�
//idea 2: ����ÿ�δ��������ҳ�һ�����ģ���ǰһ���� ��or�͡�

public class DrawCard {

    public static void main(String args[]) {
//	public int fun() {
		
		//���뱣��
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int array[] = new int[n];
		int i = 0;
		
		while(i<n&&sc.hasNext()) {
			array[i] = sc.nextInt();
			i++;
		}
		
		//1 ����
		int temp = 0;
		for(i = 0; i < n; i++) {
			for(int j = i; j < n - 1;j++) {
				if(array[j] < array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		
		//2���������(��С)����/��      or ������� - ż����ͣ�
		temp =0;//temp����Ϊ��¼��ֵ��
		for(i = 0; i < n;i++) {
			if(i%2 == 0){
				temp += array[i];
			}else {
				temp -= array[i];
			}
			System.out.println(array[i] + " ");
		}
		return ;//temp;
	}

}