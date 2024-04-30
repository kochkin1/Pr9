package com.example.pr9;

public class DataFlags {

    private int flagID;
    private int nameID;
    private int abbreviatetionID;

    public DataFlags (int _flagID, int _nameID, int _abbreviatetionID){
        flagID = _flagID;
        nameID = _nameID;
        abbreviatetionID = _abbreviatetionID;
    }

    public int getFlagID(){
        return flagID;
    }
    public int getNameID(){
        return nameID;
    }
    public int getAbbreviatetionID(){
        return abbreviatetionID;
    }
}
