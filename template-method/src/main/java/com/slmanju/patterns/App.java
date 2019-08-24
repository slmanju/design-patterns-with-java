package com.slmanju.patterns;

public class App {

    public static void main(String[] args) {
        DocumentTemplate documentTemplate = new PdfDocumentTemplate();
        documentTemplate.getDocument();

        System.out.println("----------");

        documentTemplate = new ExcelDocumentTemplate();
        documentTemplate.getDocument();
    }

}
