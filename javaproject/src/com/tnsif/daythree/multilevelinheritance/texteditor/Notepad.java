package com.tnsif.daythree.multilevelinheritance.texteditor;

public class Notepad {
	protected String content;
	
	public Notepad() {
		this.content = "";
	}
	
	public void write(String text) {
		content+= text;
	}
	
	public void displayContent() {
		System.out.println("Notepad Content: "+content);
	}

	public static void main(String[] args) {
		Word word = new Word();

		word.write("Hello, ");
		word.formatText(true);
		word.write("World!");
		word.displayContent();

		word.spellCheck();

		System.out.println("Is text in Wordpad bold? " + word.isBold());
		System.out.println("Disabling spell check in Word.");
		word.enableSpellCheck(false);
		word.spellCheck();
	}
}
