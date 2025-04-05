package com.Practice;


public class MinOfThree{
public static int findMin(int a ,int b,int c){
return (a<b?(a<c?a:c):((b<c)?b:c));
} 
public static void main(String[] args){

int a = 10;
int b = 3;
int c =2;
System.out.println(findMin(a,b,c));
}
}
