package homework11_16;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class page_43 {
	public static void main(String[] args)throws IOException	//P43
	{
		System.out.println("請輸入兩個整數");
		
		BufferedReader br1 =
				new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br1.readLine();	
		String str2 = br1.readLine();
		
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		
		int ans = Math.max(num1, num2);
		System.out.println(num1+"與"+num2+"中較大的是"+ans);
	}
}
