package site.gaoyisheng.list;

//import apache.commons.ArrayUtils;
public class ListContain {

	public static void main(String[] args) {
		
/*		String[] fieldsToInclude = { "id", "name", "location" };

		if ( ArrayUtils.contains( fieldsToInclude, "id" ) ) {
		    // Do some stuff.
		}
*/
		
		
		
	}
	
	 

	/**
	 * 问题的本质，其实是一个查找的问题，即查找一个数组是否包含某个值。对于原始类型，若是无序的数组，可以直接写一个 for 循环
	 */
	public static boolean useLoop(String[] arr, String targetValue) {
	    for(String s: arr){
	        if(s.equals(targetValue))
	            return true;
	    }
	    return false;
	}

}
