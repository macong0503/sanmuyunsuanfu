package com.fs.test;

public class Test {

	public static void main(String[] args) {
		// x ? y : z
		
		/**x ? y : z
		 * x����һ��Booleanֵ���ʽ
		 * ���xΪtrueִ��y
		 * ���xΪfalseִ��z
		 */
		int a=10,b=20;
		boolean x=a-b>0;
		int y=10;
		int z=-10;
		int value=x?y:z;
		System.out.println(value);
		
		int num = a-b>0 ? 10 : -10;
		System.out.println(num);
		
		String num1 = a-b>0 ? ">0" : "<0";
		System.out.println(num1);

	}

}
