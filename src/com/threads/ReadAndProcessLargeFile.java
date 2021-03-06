package com.threads;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadAndProcessLargeFile {
	
	//The standard way of reading the lines of the file is in memory – both Guava and Apache Commons IO provide a quick way to do just that:

		
		//Files.readLines(new File(path), Charsets.UTF_8);
		//FileUtils.readLines(new File(path));
	//4. Streaming with Apache Commons IO
	//3. Streaming Through the File
	
	 public static void main(String[] args) throws IOException {

	        String fileName = "C://AGS_PROJECTS//ORBIT_PROJECT//ORBIT_WORKSPACE//Java_practice//src//resources//onemil.txt"; //this path is on my local
	       /* try (BufferedReader fileBufferReader = new BufferedReader(new FileReader(fileName))) {
	            String fileLineContent;
	            while ((fileLineContent = fileBufferReader.readLine()) != null) {
	                // process the line.
	            }
	        }*/
	        try(Scanner scanner = new Scanner(new File(fileName))) {
	            while ( scanner.hasNextLine() ) {
	                String line = scanner.nextLine();
	                System.out.println(line);
	                // process line here.
	            }
	        }
	       /* System.out.println(java.time.LocalTime.now());  
	        try (Stream inputStream = Files.lines(Paths.get(fileName), StandardCharsets.UTF_8)) {
	            inputStream.forEach(System.out::println);
	        
	    }*/
	        System.out.println(java.time.LocalTime.now());  
	 }
}
