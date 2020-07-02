package com.fileoperation;
import java.util.Scanner;
import java.io.IOException;
public class Mainclass1 {
	public static void main(String[] args) throws IOException {
		System.out.println("Welcome to our website");
		System.out.println("LockedMe.com");
	    try(Scanner sc=new Scanner(System.in)){
	     implenfile fle=new implenfile();
			int n=0;
			do
			{
				System.out.println(" LockedME.com menu"); 
				System.out.println("-^-^-^-^-^-^-^-^-^-^-");
				System.out.println("1: Create a file");
				
				System.out.println("2:search file");
				System.out.println("3:delete file");
				System.out.println("4:sort file");
				System.out.println("5:Exit");
				System.out.println("choice your option");
				 
				n = Integer.parseInt(sc.nextLine());
				
				switch(n)
				{
				case 1:
					  fle.createFile();
					  break;
					  
				case 2: 
					
					Scanner s1= new Scanner(System.in);
					String filename1=s1.nextLine();
					fle.getFileName(filename1);
					break;
				case 3:
					
					Scanner s2=new Scanner(System.in);
					String filename2=s2.nextLine();
					fle.deleteFile(filename2); 
					break;
				case 4:
					fle.getAllFiles();
					break;
				case 5:
					System.out.println("thank you  for visting our site LockedMe.com");
					break;
				default:
					System.out.println("Entered option is Invalid");
				}
			}while(n!=5);
			

		}
	}
}


