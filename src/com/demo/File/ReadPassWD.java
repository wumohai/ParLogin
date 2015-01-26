package com.demo.File;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class ReadPassWD {

	/*
	 * 将命令配置文件读取到mp中
	 */
	public static void ReadToMap(HashMap<String, String> mp) {
		BufferedReader reader = null;

		try {
			FileInputStream file = new FileInputStream("Resource/passwd.dat");
			reader = new BufferedReader(new InputStreamReader(file, "UTF-8"));
			String tempString = null;
			// 一次读入一行，直到读入null为文件结束
			while ((tempString = reader.readLine()) != null) {
				// 添加到mp中
				String tmpString[] = tempString.trim().split(" ");
				if (tmpString[0] != null && tmpString[1] != null) {
					mp.put(tmpString[0], tmpString[1]);
					// System.out.println("put succ");
				}

			}
			reader.close();

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e1) {
				}
			}
		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> userinfo = new HashMap<>();
		ReadPassWD.ReadToMap(userinfo);
		//System.out.println(userinfo.keySet() + userinfo.values());
		System.out.println(userinfo.get("wumohai1"));
	}

}
