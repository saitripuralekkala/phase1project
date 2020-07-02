package com.fileoperation;
import java.io.File;
import java.io.IOException;
import java.util.List;


public interface filetype {
	public File createFile() throws IOException;
	public void deleteFile(String fnames);
	public File getFileName(String fnames);
	public List<File> getAllFiles();
	
	


}