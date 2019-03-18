package site.gaoyisheng.bigNumber;

public class NumberMod {

	public static void main(String[] args) {
		
		System.out.println(Long.MAX_VALUE);
	}
	
//    public int InversePairs(int[] array){
//        long mod = 1000000007;
//        int count = 0;
//        for(int i = 0; i < array.length; i++){
//            for(int j = i + 1; j< array.length; j++){
//                if(array[i] > array[j]){
//                    count++;
//                }
//            }
//        }
//        return (int) (count%mod);
//    }
	
	 int count=0;
	    public int InversePairs(int [] array) {
	        if(array==null||array.length<=0) return 0;
	        mergeUp2Down(array,0,array.length-1);
	        return count;
	    }
	    public void mergeUp2Down(int [] a,int start,int end){
	        if(start>=end) return;
	        int mid=(end+start)>>1;
	        mergeUp2Down(a,start,mid);
	        mergeUp2Down(a,mid+1,end);
	        merge(a,start,mid,end);
	    }
	    public void merge(int [] a,int start,int mid,int end){
	        int[] temp=new int[end-start+1];
	        int i=start,j=mid+1,index=0;
	        while(i<=mid&&j<=end){
	            if(a[i]>a[j]) {
	                temp[index++]=a[j++];
	                count+=mid-i+1;
	                count=count>1000000007?count%1000000007:count;
	            }else temp[index++]=a[i++];
	        }
	        while(i<=mid) temp[index++]=a[i++];
	        while(j<=end) temp[index++]=a[j++];
	        for(int k=0;k<temp.length;k++) a[start+k]=temp[k];
	    }
}
