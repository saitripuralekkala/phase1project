package com.fileoperation;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class implenfile implements filetype {
	public File createFile() throws IOException 
	{
		
		Scanner s = new Scanner(System.in);
		String name1;
		System.out.println("enter file name");
		name1 = s.nextLine();
		String fnames = "C:\\company" + "\\" + name1;
		File f = new File(fnames);
		
            if(!f.exists())
			
			{
				try {
					f.createNewFile();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
				System.out.println("Enter the contents in the file");
				FileWriter fw = new FileWriter(name1);
				fw.write(s.nextLine());
				fw.close();
				return f;

			}
			else
			{
				System.out.println("File name already exists please enter other name");
			}


	
		return null;
	}

	@Override
	public File getFileName(String fnames) 

	{

		File file = new File("C:\\company"+"\\"+ fnames);

		try {
			if(fnames.equals(file.getCanonicalFile().getName()) && file.exists())
			{

				return file;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public void deleteFile(String fnames) 
	{

		File file = new File("C:\\company"+"\\" + fnames);

		try {
			if(fnames.equals(file.getCanonicalFile().getName()))
			{
				if(file.delete())
				{
					System.out.println("file deleted successfully");
					System.out.println("Deleted the file:"  + fnames);
				}
				else
				{
					System.out.println("No such file exists");
				}
			}
			else
			{
				System.out.println("File Not Found");
			}
		} catch (IOException e) {
		
			e.printStackTrace();
		}

	}

	@Override
	public List<File> getAllFiles()
	{
		File filesInDirectory = new File("C:\\company");
		List<File> allFilesin = Arrays.asList(filesInDirectory.listFiles());
		if(allFilesin != null)
		{
			Collections.sort(allFilesin);
			
			System.out.println(allFilesin);
		}
		return null;
	}


	


}




