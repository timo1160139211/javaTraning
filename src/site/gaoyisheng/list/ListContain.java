package site.gaoyisheng.list;

//import apache.commons.ArrayUtils;
public class ListContain {

	public static void main(String[] args) {
		
/*		String[] fieldsToInclude = { "id", "name", "location" };

		if ( ArrayUtils.contains( fieldsToInclude, "id" ) ) {
		    // Do some stuff.
		}
*/
		
		int n = 25;
		
		System.out.println((n+7)/8<<3);
		
	}
	
	 

	/**
	 * ����ı��ʣ���ʵ��һ�����ҵ����⣬������һ�������Ƿ����ĳ��ֵ������ԭʼ���ͣ�������������飬����ֱ��дһ�� for ѭ��
	 */
	public static boolean useLoop(String[] arr, String targetValue) {
	    for(String s: arr){
	        if(s.equals(targetValue))
	            return true;
	    }
	    return false;
	}

}
