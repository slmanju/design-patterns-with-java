package com.slmanju.patterns;

public class BetaFileRule extends FileRule {

    @Override
    public void execute(String version) {
        if ("beta".equals(version)) {
            System.out.println("Executing beta file rule...");
        } else {
            next.execute(version);
        }
    }

}
