package main.input_output;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Scanner;

public class InputOutput {

	public static void main(String[] args) {

		// get list of all files/directory names from given address
		File file = new File("C:\\Users\\charlie\\OneDrive\\Workspace");

		String[] fileList = file.list();
		for (String name : fileList)
			System.out.println(name);

		Scanner scan = new Scanner(System.in);
		int i = 0;
		while (scan.hasNext()) {
			i++;
			System.out.println(i + " " + scan.nextLine());
		}

		// get files by extensions from folder
		String[] list = file.list(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				if (name.toLowerCase().endsWith(".py")) {
					return true;
				} else {
					return false;
				}
			}
		});
		for (String f : list) {
			System.out.println(f);
		}
	}
}
