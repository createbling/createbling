package com.createbling.modules.sys.utils;

public class StringUtils {
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
	public static void main(String[] args){
		System.out.println(StringUtils.getSecondIndexOf("1,10,2,3,",","));
	}

}
