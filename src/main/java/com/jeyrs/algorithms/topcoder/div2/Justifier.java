package com.jeyrs.algorithms.topcoder.div2;

//SRM 164
public class Justifier{
	public String[] justify(String[] textIn){
		int max = 0;
		for(String s : textIn)
			if(max < s.length())max = s.length();
		for(int i=0; i < textIn.length; i++){
			String space = "";
			for(int j=0; j < max - textIn[i].length(); j++)
				space = " "+space;
			textIn[i] = space+textIn[i];
		}
		return textIn;
	}
}