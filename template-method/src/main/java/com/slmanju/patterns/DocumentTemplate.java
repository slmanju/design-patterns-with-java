package com.slmanju.patterns;

public abstract class DocumentTemplate {

    public final void getDocument() {
        System.out.println("Load information...");

        generate();

        System.out.println("Finalize document creation...");
    }

    protected abstract void generate();

}
