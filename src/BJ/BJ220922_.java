package BJ;

import java.io.*;
import java.util.*;

public class BJ220922_ {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        System.out.printf("%d", m-543);
    }
}
