package com.paintedharmony.mathMessage;

public class MessageMaker {

	public static void main(String[] args) {
		MessageEncoder me = new MessageEncoder();
		me.Initialize();
		String encodedMessage = me.encodeMessage(args[0]);
		System.out.println(encodedMessage);
		System.out.println(me.getCode());
	}
}
