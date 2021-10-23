package com.company.PlayerPackage;

public class Guesser extends Player{

    String type = new String();

    public Guesser(){

        type = "Guesser";

    }

    @Override
    public String getType() {
        return type;
    }

}
