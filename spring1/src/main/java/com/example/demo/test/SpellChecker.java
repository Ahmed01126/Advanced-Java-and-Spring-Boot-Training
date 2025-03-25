package com.example.demo.test;

public class SpellChecker {

    private final String text;

    public SpellChecker(String text) {
        this.text = text;
    }

    public boolean isSpellChecked(String sentence) {
        return sentence != null && !sentence.isEmpty();
    }

    public void print() {
        System.out.println(text);
    }

    public String getText() {
        return text;
    }
}
