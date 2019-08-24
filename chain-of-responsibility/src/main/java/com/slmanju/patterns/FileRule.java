package com.slmanju.patterns;

public abstract class FileRule {

    protected FileRule next;

    public abstract void execute(String version);

    public void setNext(FileRule fileRule) {
        this.next = fileRule;
    }

}
