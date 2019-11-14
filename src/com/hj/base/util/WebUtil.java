package com.hj.base.util;

import java.util.UUID;
//提交URL时，将链接字符串中的"-"替换为""的工具类
public class WebUtil {

	public static String getUUID(){
		String uuid = UUID.randomUUID().toString();
		//replace(oldChar,newChar),会将字符串中出现的旧字符替换为新字符
		uuid = uuid.replace("-", "");//将"-"替换为""
		return uuid;
	}
}
