package homework11_16;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class page_34 {
	public static void main(String[] args)throws IOException	//P34
	{
		System.out.println("請輸入一個整數");
		
		BufferedReader br1 =
				new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br1.readLine();
		int num = Integer.parseInt(str1);
		
		System.out.println("您輸入的數字是"+num);
	}
}
