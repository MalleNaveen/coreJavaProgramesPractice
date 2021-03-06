package com.threads;


//Java program to illustrate getRuntime() 
//method of Runtime class 
public class RuntimeTest 
{ 
	public static void main(String[] args) 
	{ 
		// get the current runtime assosiated with this process 
		Runtime run = Runtime.getRuntime(); 
		// print the current free memory for this runtime 
		long t=run.freeMemory();
		System.out.println("" + run.freeMemory()); 
		// print the number of total bytes 
        System.out.println("" + Runtime.getRuntime().totalMemory()); 
        System.out.println(bytesIntoHumanReadable(t));
        
	}
	private static String bytesIntoHumanReadable(long bytes) {
        long kilobyte = 1024;
        long megabyte = kilobyte * 1024;
        long gigabyte = megabyte * 1024;
        long terabyte = gigabyte * 1024;

        if ((bytes >= 0) && (bytes < kilobyte)) {
            return bytes + " B";

        } else if ((bytes >= kilobyte) && (bytes < megabyte)) {
            return (bytes / kilobyte) + " KB";

        } else if ((bytes >= megabyte) && (bytes < gigabyte)) {
            return (bytes / megabyte) + " MB";

        } else if ((bytes >= gigabyte) && (bytes < terabyte)) {
            return (bytes / gigabyte) + " GB";

        } else if (bytes >= terabyte) {
            return (bytes / terabyte) + " TB";

        } else {
            return bytes + " Bytes";
        }
    }
} 
