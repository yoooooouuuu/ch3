package homework11_16;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class page_37 {
	public static void main(String[] args)throws IOException	//P37
	{
		System.out.println("請輸入英文字母");
		
		BufferedReader br1 =
				new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br1.readLine();

		String stru = str1.toUpperCase();
		String strl = str1.toLowerCase();
		
		System.out.println("轉換大寫時為"+stru);
		System.out.println("轉換小寫時為"+strl);
	}
}
