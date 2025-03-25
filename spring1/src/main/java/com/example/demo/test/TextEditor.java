package com.example.demo.test;

public class TextEditor {

    // Eager Instantiation
//    public static SpellChecker spellChecker = new SpellChecker();

    // Lazy Instantiation
    private final SpellChecker spellChecker;

    // Tightly coupled
    public TextEditor() {
        spellChecker = new SpellChecker("Hello");
    }

    // Loose coupling
    public TextEditor(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    public void spellCheck(String text) {
        System.out.println(spellChecker.isSpellChecked(text));
    }

    public void print() {
        spellChecker.print();
    }

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }
}
