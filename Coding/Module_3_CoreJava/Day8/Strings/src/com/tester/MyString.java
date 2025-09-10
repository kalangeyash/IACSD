package com.tester;
import java.util.*;

public class MyString {
	

	public static void main(String[] args) {
		String s1 = new String("yash");
		
		StringBuilder s2  = new StringBuilder();
		StringBuilder s3  = new StringBuilder();
		s3.append("yashkalange");
		s2.append("yashkalange");
		StringBuilder sb1 = new StringBuilder("hello world");
		System.out.println(sb1.length()+" "+sb1.capacity());//11 27
		StringBuilder sb2=sb1.append(true).append(123)
		.append(23.45f).append(67.89).append(new Date());
		System.out.println(sb2.length()+" "+sb2.capacity());//new len n capa
		System.out.println(sb1);//hello world with appended contents
		System.out.println(sb2);//hello world appended with appended contents
		System.out.println(sb1==sb2);//t
		sb1.insert(0, 9999);
		System.out.println(sb1);
		System.out.println(sb1.length()+" "+sb1.capacity());
		sb1.delete(0,sb1.length());
		System.out.println("sb1 after delete "+sb1);//empty contents 
		System.out.println(sb1.length()+" "+sb1.capacity());//0 capa.
		sb1.trimToSize();//tries to set capa=length
		System.out.println(sb1.length()+" "+sb1.capacity());//0 0
		StringBuilder sb3=new StringBuilder("testing!!!!");
		StringBuilder sb4=new StringBuilder("testing!!!!");
		System.out.println(sb3==sb4); //f
		System.out.println(sb3.equals(sb4));//f - since StringBuilder class 
		//HAS NOT overridden equals method , so uses the inherited version
		
	

	}

}
