package com.paintedharmony.mathMessage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CodeEntry {
	
	public String alpha = "";
    public int num = 0;
    public List<String> values = new ArrayList<String>();

    public CodeEntry(String inAlpha, int inNum, List<String> inValues) {
    	alpha = inAlpha;
    	num = inNum;
    	values = inValues;
    }
}
