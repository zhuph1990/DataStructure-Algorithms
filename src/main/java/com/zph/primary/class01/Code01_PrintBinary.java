package com.zph.primary.class01;

/**
 *  打印32进制状态
 *
 *  整数，表面上看是10进制，底层其实是32位(int) 64位(long)
 *  32位信息
 *  系统内的 + - * / 都是通过转化为二进制之后通过位运算（ ｜ & ^ ～）进行计算的 --> 所以负数为 取反+1
 */
public class Code01_PrintBinary {

    public static void print(int num) {
        for (int i = 31; i >= 0; i--) {
            System.out.print((num & (1 << i)) == 0 ? "0" : "1");
        }
        System.out.println();
    }

    public static void main(String[] args) {

		int num = 4;
	//	print(num);

		int test = 1123123;
//		print(test);
//		print(test<<1);
//		print(test<<2);
//		print(test<<8);
//		
//		
//		int a = Integer.MAX_VALUE;
//		System.out.println(a);

//		print(-1);
		int a = Integer.MAX_VALUE; //因为0，非负领域
//		print(a);
        int b = Integer.MIN_VALUE; // 取反末尾+1
//      print(b);

		int c = 123823138;
		int d = ~c;
//		print(c);
//		print(d);

//		print(-5);


		int e = 12319283;
		int f = 3819283;
		print(e);
		print(f);
		System.out.println("=============");
		print(e | f); // 或
		print(e & f); // 与
		print(e ^ f); // 异或

//		int a = Integer.MIN_VALUE;
//		print(a);
//		print(a >> 1);
//		print(a >>> 1);
//		
//		int c = Integer.MIN_VALUE;
//		int d = -c ;
//		
//		print(c);
//		print(d);

    }

}
