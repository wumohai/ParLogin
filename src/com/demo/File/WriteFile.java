package com.demo.File;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class WriteFile {
	
	public static void writeinfo( String username, String passwd) {
		String fileName;
		String content;
		content = username + " " + passwd;
		fileName = "Resource/passwd.dat";
        try {
            //打开一个写文件器，构造函数中的第二个参数true表示以追加形式写文件
 			
        	File file = new File(fileName);
        	OutputStreamWriter write = new OutputStreamWriter(new FileOutputStream(file, true),"UTF-8");
			BufferedWriter writer=new BufferedWriter(write);   
			writer.write(content+ "\n");
			writer.flush();
			writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	public static void main(String[] args) {
		WriteFile.writeinfo("wumohai", "wumohai");
	}
}
