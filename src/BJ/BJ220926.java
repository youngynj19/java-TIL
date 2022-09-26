package BJ;

import java.io.*;
import java.util.*;

public class BJ220926 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		
		System.out.println(b%10*a);
		System.out.println(b/10%10*a);
		System.out.println(b/100*a);
		System.out.println(b*a);
	}
}
