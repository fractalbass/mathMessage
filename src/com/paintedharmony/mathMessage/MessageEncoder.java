package com.paintedharmony.mathMessage;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class MessageEncoder {

	ArrayList<CodeEntry> code = new ArrayList<CodeEntry>();
	
	public void Initialize() {
		code.add(new CodeEntry("A",0, (List<String>) Arrays.asList("0x0","0x1","0x2","0x3","0x4","0x5","0x6","0x7","0x8","0x9","0x10","0x11","0x12")));
		code.add(new CodeEntry("B",1,(List<String>) Arrays.asList("1x1")));
		code.add(new CodeEntry("C",2,(List<String>) Arrays.asList("1x2","2x1")));
		code.add(new CodeEntry("D",3,(List<String>) Arrays.asList("1x3","3x1")));
		code.add(new CodeEntry("E",4,(List<String>) Arrays.asList("1x4","2x2","4x1")));
		code.add(new CodeEntry("F",5,(List<String>) Arrays.asList("1x5","5x1")));
		code.add(new CodeEntry("G",6,(List<String>) Arrays.asList("1x6","2x3","3x2","6x1")));
		code.add(new CodeEntry("H",7,(List<String>) Arrays.asList("1x7","7x1")));
		code.add(new CodeEntry("I",8,(List<String>) Arrays.asList("1x8","2x4","4x2","8x1")));
		code.add(new CodeEntry("J",9,(List<String>) Arrays.asList("1x9","3x3","9x1")));
		code.add(new CodeEntry("K",10,(List<String>) Arrays.asList("1x10","2x5","5x2","10x1")));
		code.add(new CodeEntry("L",11,(List<String>) Arrays.asList("1x11","11x1")));
		code.add(new CodeEntry("M",12,(List<String>) Arrays.asList("1x12","2x6","3x4","4x3","6x2","12x1")));
		code.add(new CodeEntry("N",14,(List<String>) Arrays.asList("2x7","7x2")));
		code.add(new CodeEntry("O",15,(List<String>) Arrays.asList("3x5","5x3")));
		code.add(new CodeEntry("P",16,(List<String>) Arrays.asList("2x8","4x4","8x2")));
		code.add(new CodeEntry("Q",18,(List<String>) Arrays.asList("2x9","3x6","6x3","9x2")));
		code.add(new CodeEntry("R",20,(List<String>) Arrays.asList("2x10","4x5","5x4","10x2")));
		code.add(new CodeEntry("S",21,(List<String>) Arrays.asList("3x7","7x3")));
		code.add(new CodeEntry("T",22,(List<String>) Arrays.asList("2x11","11x2")));
		code.add(new CodeEntry("U",24,(List<String>) Arrays.asList("2x12","3x8","4x6","6x4","8x3","12x2")));
		code.add(new CodeEntry("V",25,(List<String>) Arrays.asList("5x5")));
		code.add(new CodeEntry("W",27,(List<String>) Arrays.asList("3x9","9x3")));
		code.add(new CodeEntry("X",28,(List<String>) Arrays.asList("4x7","7x4")));
		code.add(new CodeEntry("Y",30,(List<String>) Arrays.asList("3x10","5x6","6x5","10x3")));
		code.add(new CodeEntry("Z",32,(List<String>) Arrays.asList("4x8","8x4")));
		code.add(new CodeEntry("a",33,(List<String>) Arrays.asList("3x11","11x3")));
		code.add(new CodeEntry("b",35,(List<String>) Arrays.asList("5x7","7x5")));
		code.add(new CodeEntry("c",36,(List<String>) Arrays.asList("3x12","4x9","6x6","9x4","12x3")));
		code.add(new CodeEntry("d",40,(List<String>) Arrays.asList("4x10","5x8","8x5","10x4")));
		code.add(new CodeEntry("e",42 ,(List<String>) Arrays.asList("6x7","7x6")));
		code.add(new CodeEntry("f",44 ,(List<String>) Arrays.asList("4x11","11x4")));
		code.add(new CodeEntry("g",45 ,(List<String>) Arrays.asList("5x9","9x5")));
		code.add(new CodeEntry("h",48 ,(List<String>) Arrays.asList("4x12","6x8","8x6","12x4")));
		code.add(new CodeEntry("i",49 ,(List<String>) Arrays.asList("7x7")));
		code.add(new CodeEntry("j",50 ,(List<String>) Arrays.asList("5x10","10x5")));
		code.add(new CodeEntry("k",54 ,(List<String>) Arrays.asList("6x9","9x6")));
		code.add(new CodeEntry("l",55 ,(List<String>) Arrays.asList("5x11","11x5")));
		code.add(new CodeEntry("m",56 ,(List<String>) Arrays.asList("7x8","8x7")));
		code.add(new CodeEntry("n",60 ,(List<String>) Arrays.asList("5x12","6x10","10x6","12x5")));
		code.add(new CodeEntry("o",63 ,(List<String>) Arrays.asList("7x9","9x7")));
		code.add(new CodeEntry("p",64 ,(List<String>) Arrays.asList("8x8")));
		code.add(new CodeEntry("q",66 ,(List<String>) Arrays.asList("6x11","11x6")));
		code.add(new CodeEntry("r",70 ,(List<String>) Arrays.asList("7x10","10x7")));
		code.add(new CodeEntry("s",72 ,(List<String>) Arrays.asList("6x12","8x9","9x8","12x6")));
		code.add(new CodeEntry("t",77 ,(List<String>) Arrays.asList("7x11","11x7")));
		code.add(new CodeEntry("u",80 ,(List<String>) Arrays.asList("8x10","10x8")));
		code.add(new CodeEntry("v",81 ,(List<String>) Arrays.asList("9x9")));
		code.add(new CodeEntry("w",84 ,(List<String>) Arrays.asList("7x12","12x7")));
		code.add(new CodeEntry("x",88 ,(List<String>) Arrays.asList("8x11","11x8")));
		code.add(new CodeEntry("y",90 ,(List<String>) Arrays.asList("9x10","10x9")));
		code.add(new CodeEntry("z",96 ,(List<String>) Arrays.asList("8x12","12x8")));
		code.add(new CodeEntry(".",99 ,(List<String>) Arrays.asList("9x11","11x9")));
		code.add(new CodeEntry(" ",100 ,(List<String>) Arrays.asList("10x10")));
		code.add(new CodeEntry(",",108 ,(List<String>) Arrays.asList("9x12","12x9")));
		code.add(new CodeEntry("!",110 ,(List<String>) Arrays.asList("10x11","11x10")));
		code.add(new CodeEntry("$",120 ,(List<String>) Arrays.asList("10x12","12x10")));
		code.add(new CodeEntry("-",121 ,(List<String>) Arrays.asList("11x11")));
		code.add(new CodeEntry("+",132 ,(List<String>) Arrays.asList("11x12","12x11")));
		code.add(new CodeEntry("=",144 ,(List<String>) Arrays.asList("12x12")));
		
	}
	
	public String encodeMessage(String inMessage) {
		StringBuffer outMessage = new StringBuffer();
		for (int i=0;i<inMessage.length();i++) {
			String currentChar = inMessage.substring(i,i+1);
			String newChar = encode(currentChar);
			
			outMessage.append(newChar);
			outMessage.append(" ");
			
		}
		return outMessage.toString();
	}
	
	public String getCode() {
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<code.size();i++) {
			sb.append(code.get(i).alpha + ":" + code.get(i).num + "\n");
		}
		return sb.toString();
	}
	
	private String encode(String inChar) {
		for (int i=0;i<code.size();i++) {
			
			if(code.get(i).alpha.equals(inChar)) {
				int v = (int) Math.floor( (code.get(i).values.size() * Math.random()) );
				return code.get(i).values.get(v);
			}
		}
		return inChar;
	}
}
