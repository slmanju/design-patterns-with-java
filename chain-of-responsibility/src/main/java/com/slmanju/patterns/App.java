package com.slmanju.patterns;

public class App {

    public static void main(String[] args) {
        FileRuleChain fileRuleChain = new FileRuleChain();

        fileRuleChain.execute("stable");

        System.out.println("----------");

        fileRuleChain.execute("beta");

        System.out.println("----------");

        fileRuleChain.execute("alpha");

        System.out.println("----------");

        fileRuleChain.execute("something");
    }

}
