package site.gaoyisheng.BaseDataType;

public class DefaultValue {
	    static boolean Paddy; //defaultvalue = false
	    public static void main(String args[]){
	    	
	    	int[] no= {1,1,2,2,3,4,4};
	    	
			int i = 1;
			int num = no[0];
			
			for(;i<no.length;i+=2) {
				if(num == no[i]) {
					num = no[i+1];
					
				}else {
					break;
				}
			}
			System.out.println(num);;
	       // System.out.println(Paddy);
	    }
	    
	    /*
	     * 
	     * boolean           false

			char             '/uoooo'(null)

			byte             (byte)0

			short            (short)0

			int              0

			long             0L

			float            0.0f

			double           0.0d

	     */
	    
	    
	    
	    /*
	     * 基本数据类型							包装类
	     * 
			byte							Byte
			boolean							Boolean
			short							Short
			char							Character
			int								Integer
			long							Long
			float							Float
			double							Double
	     * 
	     * 
	     */
}
