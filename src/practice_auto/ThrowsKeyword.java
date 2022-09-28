package practice_auto;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsKeyword {

	public static void main(String[] args) throws IOException, InterruptedException {
		FileReader fr=null;
		fr= new FileReader("Downloads");
		BufferedReader bf= new BufferedReader(fr);
		System.out.println(bf.readLine());
		
		Thread.sleep(5000);

	}

}
