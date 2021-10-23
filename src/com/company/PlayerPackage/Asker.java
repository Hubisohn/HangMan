package com.company.PlayerPackage;

public class Asker extends Player{

    String type = new String();

    public Asker(){

        type = "Asker";

    }

    @Override
    public String getType() {
        return type;
    }
}
