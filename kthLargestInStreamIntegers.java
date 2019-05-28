{\rtf1\ansi\ansicpg1252\cocoartf1671
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx566\tx1133\tx1700\tx2267\tx2834\tx3401\tx3968\tx4535\tx5102\tx5669\tx6236\tx6803\pardirnatural\partightenfactor0

\f0\fs24 \cf0 /*package whatever //do not write package name here */\
\
import java.util.*;\
import java.lang.*;\
import java.io.*;\
\
class GFG \{\
	public static void main (String[] args) \{\
		//code\
		Scanner sc = new Scanner(System.in);\
		int T = Integer.parseInt(sc.nextLine());\
		for(int i=0; i<T; i++)\{\
		    int k = sc.nextInt();\
		    int n = sc.nextInt();\
		    int[] sortedArray = new int[n];\
		    for(int j=0; j<n; j++)\{\
		        sortedArray[j] = -1;\
		    \}\
		    for(int j=0; j<n; j++)\{\
		        sortedArray[j] = sc.nextInt();\
		      //  System.out.print(sortedArray[j]);\
		        int current = j;\
                while(true)\{\
                    if(current == 0)\{\
                        break;\
                    \}\
                    if(sortedArray[current] > sortedArray[current-1])\{\
                        int temp = sortedArray[current];\
                        sortedArray[current] = sortedArray[current-1];\
                        sortedArray[current-1] = temp;\
                    \}\
                    else\{\
                        break;\
                    \}\
                    current--;\
                \}\
                System.out.print(sortedArray[k-1]);\
                System.out.print(" ");\
		    \}\
		    System.out.print("\\n");\
		\}\
	\}\
\}}