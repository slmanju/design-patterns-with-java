package com.slmanju.patterns;

public class Player {

    private final String alias;
    private final String weapon;
    private final String hair;

    private Player(Builder builder) {
        this.alias = builder.alias;
        this.weapon = builder.weapon;
        this.hair = builder.hair;
    }

    public String getAlias() {
        return alias;
    }

    public String getWeapon() {
        return weapon;
    }

    public String getHair() {
        return hair;
    }

    @Override
    public String toString() {
        return "Player{" +
                "alias='" + alias + '\'' +
                ", weapon='" + weapon + '\'' +
                ", hair='" + hair + '\'' +
                '}';
    }

    public static class Builder {

        private final String alias;
        private String weapon;
        private String hair;

        public Builder(String alias) {
            this.alias = alias;
        }

        public Builder withWeapon(String weapon) {
            this.weapon = weapon;
            return this;
        }

        public Builder withHair(String hair) {
            this.hair = hair;
            return this;
        }

        public Player build() {
            return new Player(this);
        }
    }

}
