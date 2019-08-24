package com.slmanju.patterns;

public class AlphaFileRule extends FileRule {

    @Override
    public void execute(String version) {
        if ("alpha".equals(version)) {
            System.out.println("Executing alpha file rule...");
        } else {
            System.out.println("Not defined...");
        }
    }

}
