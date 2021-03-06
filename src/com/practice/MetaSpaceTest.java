package com.practice;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

import org.apache.commons.lang.StringEscapeUtils;

public class MetaSpaceTest {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String str="{$#34test$#34:\"test\"}";
		StringEscapeUtils.unescapeHtml(str);
		System.out.println(StringEscapeUtils.unescapeHtml(str.replace("\"", "\"\"")));
	}

}
