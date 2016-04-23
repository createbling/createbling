package com.createbling.modules.sys.utils;

public class StringUtils {
	private static int count = 0;
	/**
	 * 找出第二个分割字符
	 * @param a表示输入字符，b表示分隔符
	 * @return
	 */
	public static String getSecondIndexOf(String a,String b){
		String aa = a.substring(a.indexOf(b)+1,a.length());
		System.out.println(aa);
		String bb = aa.substring(0, aa.indexOf(b));
		return bb;
	}

	//使用递归判断某个字符串拥有多少个指定字符
	public static int countstr(String a,String b){
		if(a.indexOf(b) == -1){
			return count;
		}else if(a.indexOf(b) != -1){
			count++;
			a = a.substring(a.indexOf(b)+1, a.length());
			countstr(a,b);
		}
		return count;
	}
	
	public static String getIndexOf(String a,String b,int n){
		int size = countstr(a,b);
		//超过分割的字符限制
		if(n > (size+1)){
			return null;
		}else{
			for(int i = 1;i<n;i++){
				a = a.substring(a.indexOf(b)+1, a.length());				
			}
			if(a.contains(b)){
				a = a.substring(0,a.indexOf(b));
			}
		}
		return a;
	}
	
	
	public static void main(String[] args){
		System.out.println(StringUtils.getSecondIndexOf("1,10,2,3,",","));
	}

}
