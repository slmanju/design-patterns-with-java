package com.slmanju.patterns;

public class StableFileRule extends FileRule {

    @Override
    public void execute(String version) {
        if ("stable".equals(version)) {
            System.out.println("Executing stable file rule...");
        } else {
            next.execute(version);
        }
    }

}
