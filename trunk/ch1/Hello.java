package ch1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hello {

	/**
	 * @param args
	 */

	public Hello() {
	}

	public static void main(String[] args) {

		System.out.println("Please type your name and press Enter");
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String str = "";
		while (str.length() == 0) {
			try {
				System.out.print("> prompt ");
				str = in.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		System.out.println( String.format("Hello %s\nWelcome to the course on Introductory Programming Fall 2011.\nIt will be great fun :)",str));		
		System.exit(0);
	}

}
