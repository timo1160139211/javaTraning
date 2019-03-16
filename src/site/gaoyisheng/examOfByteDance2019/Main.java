package site.gaoyisheng.examOfByteDance2019;

import java.util.Scanner;

/*
//小孩分糖问题
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        while(n>0) {//case num
        	
        	int count = sc.nextInt();
        	int u[] = new int[count];
            for(int i=0;i<count;i++){
           	 	u[i] = sc.nextInt();
            }
            
            //work
            int sum = 0; 
            int tmpsum = 0;
            int top = 0;//top goal
           // for(int i=0;i<count;i++) {
            int i=0;
            	//通过i%n来实现循环转圈
            	
            	//找上坡
            	while(u[(i+1)%n]<u[i%n]) {
            		i= (i-1+n)%n;
            	}
            	u[i%n] = 1;
            	while(u[(i+1)%n]>u[i%n]) {
            		u[(i+1)%n] = u[i%n] + 1;
            		i = (i+1)%n;
            	}
            	top = u[i%n];
            	
            	//找下坡
            	while(u[(i+1)%n]<u[i%n]) {
            		i= (i+1)%n;
            	}
            	u[i%n] = 1;
           // }
        	
        	
        	//
        	n--;
        }

        

//        int m = sc.nextInt();
//        int l[] = new int[n];
//        for(int i=0;i<n;i++){
//        	l[i] = sc.nextInt();
//        }
        
        //work
        int length = 0;
        
        
        
        
        //print
        System.out.println(length);
        
    }
}

*/

public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
        String[] strs=new String[n];
        for(int i=0;i<n;i++){
        	strs[i]=sc.next();
        }
        for(int i=0;i<n;i++){
        	System.out.println(strs[i]);
        }
        //work
        
        for(int i=0;i<n;i++){
        	
        	char[] s = new char[strs[i].length()];
        	s[strs[i].length()-1] = '\0';
        	for(int kk = 0; kk<s.length;kk++) {
        		s[kk] = 'a';
        	}
        	int len = 0;
        	while(strs[i].length()>len) {
        		s[len] = strs[i].charAt(len);
        		len++;
        	}
        	
        	//char[] s = strs[i].toCharArray();
        	
        	System.out.println(s.length + "\n  look:" + s.toString());
        	
        	for(int j = 0; j<s.length;j++) {
        		if(true) {
        			//check
        			if(j+2>s.length-1) {
        				break;//+2 break
        			}else if(s[j] == s[j+1] && s[j+1] == s[j+2]){
        				//case 1
        				s[j] = ' ';//repalce to ' ' 
        			}
        		}
        		
        		if(true) {
        			//check
        			if(j+3>s.length-1) {
        				continue;
        			}else if(s[j] == s[j+1] && s[j+2] == s[j+3]){
        				//case 1
        				s[j+3] = ' ';//repalce to ' ' 
        			}
        		}
        	}
        	
        	
        	//replace " " to ""
        	strs[i]=s.toString().replaceAll(" ","");
        }
        

        //print
        for(int i=0;i<n;i++){
        	System.out.println(strs[i]);
        }
	    
	} 
}


/*
 * 
 * 
 * 
// 本题为考试单行多行输入输出规范示例，无需提交，不计分。
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {//注意while处理多个case
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(a + b);
        }
    }
}


// 本题为考试多行输入输出规范示例，无需提交，不计分。
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0, x;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                x = sc.nextInt();
                ans += x;
            }
        } 
        System.out.println(ans);
    }
}
 */
/*
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] fav=new int[n];
        for(int i=0;i<n;i++){
            fav[i]=scan.nextInt();
        }
        Map<Integer,List<Integer>> map=new HashMap<>();
        for(int i=0;i<n;i++){
            int key=fav[i];
            int value=i+1;
            if(!map.containsKey(key)){
                List<Integer> list=new LinkedList<>();
                list.add(value);
                map.put(key,list);
            }else{
                List<Integer> list=map.get(key);
                list.add(value);
            }
        }
        int m=scan.nextInt();
        Queue<Integer> queue=new LinkedList<>();
        for(int i=0;i<m;i++){
            int lo=scan.nextInt();
            int hi=scan.nextInt();
            int des=scan.nextInt();
            List<Integer> list=map.get(des);
            int count=0;
            if(list!=null){
                for(Integer integer:list){
                    if(integer>=lo&&integer<=hi){
                        count++;
                    }
                }
            }
 
            queue.add(count);
 
        }
        for(Integer integer:queue){
            System.out.println(integer);
        }
 
    }
}



==================================================================

    public static void main(String[] args) {
    		Scanner in = new Scanner(System.in);
            int a = in.nextInt();
            a = 1024-a;
            int count = 0;
            if(a>64) {
            	count += a>>6;
            	a = a%64; 
            }
            if(a>16) {
            	count += a>>4;
            	a = a%16;
            }
            if(a>4) {
            	count += a>>2;
            	a = a%4;
            }
            if(a>0) {
            	count += a;
            }
            System.out.println(count);
    }  
*/