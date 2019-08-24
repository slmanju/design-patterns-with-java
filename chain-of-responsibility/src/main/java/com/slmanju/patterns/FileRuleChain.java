package com.slmanju.patterns;

public class FileRuleChain {

    private FileRule fileRule;

    public FileRuleChain() {
        setup();
    }

    private void setup() {
        FileRule alphaFileRule = new AlphaFileRule();

        FileRule betaFileRule = new BetaFileRule();
        betaFileRule.setNext(alphaFileRule);

        FileRule stableFileRule = new StableFileRule();
        stableFileRule.setNext(betaFileRule);

        this.fileRule = stableFileRule;
    }

    public void execute(String version) {
        fileRule.execute(version);
    }

}
