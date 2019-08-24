package com.slmanju.patterns;

public class PdfDocumentTemplate extends DocumentTemplate {

    @Override
    protected void generate() {
        System.out.println("Generating pdf document.");
    }

}
