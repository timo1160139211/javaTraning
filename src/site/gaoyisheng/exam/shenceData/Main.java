package site.gaoyisheng.exam.shenceData;

/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x=0,y=0,key=0;
        x = in.nextInt();
        y = in.nextInt();
        key = in.nextInt();

        int count = -1;

        if(x>key || y>key){
            count = 0;
        }else if(x<0 && y<0) {

            count = -1;
        }else{


            count = 0;
            while(x<key || y<key){
                if(x>y){
                    y+=x;
                }else{
                    x+=y;
                }

                count++;
            }
        }
        System.out.println(count);

    }
}

*/


//right
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //in
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int key = sc.nextInt();
        int num[] = new int[n];//sc.nextInt();//, x;

        for(int i = 0; i < n; i++){
            num[i] = sc.nextInt();
        }

        //work
        int result[] = {-1,-1,-1};

        if(n<3){

        }else if(num[0] + num[1] + num[2] > key){

        }else if(num[n-1] + num[n-2] + num[n-3] < key){

        }else{
            //right
            boolean flag = true;
            for (int i = 0; flag && i < n-2; i++){
                for(int j = i+1; j< n-1; j++){
                    for(int k = j+1; k< n; k++){
                        if(i<n && j<n && k<n){
                            if(num[i] + num[j] + num[k] == key){
                                result[0] = num[i];
                                result[1] = num[j];
                                result[2] = num[k];
                                flag = false;
                            }
                        }
                    }
                }
            }


        }

        System.out.println(result[0] + " " +
                result[1] + " " + result[2]);

    }
}
/*

n k
n[]

sum 3 = k

 */
