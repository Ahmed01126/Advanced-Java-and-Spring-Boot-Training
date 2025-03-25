package com.example.demo.test;

public class Main {
    public static void main(String[] args) {

        SpellChecker spellChecker1 = new SpellChecker("Hello World1");
        SpellChecker spellChecker2 = new SpellChecker("Hello World2");
        SpellChecker spellChecker3 = new SpellChecker("Hello World3");
        SpellChecker spellChecker4 = new SpellChecker("");

        TextEditor textEditor = new TextEditor(spellChecker4);

//        TextEditor textEditor = new TextEditor();


        textEditor.spellCheck(textEditor.getSpellChecker().getText());
        textEditor.print();

    }
}
