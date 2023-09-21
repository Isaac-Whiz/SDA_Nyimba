package com.example.sdanyimba;

public class Hym {
    private String hymNumber;
    private String hymName;
    private String hymDesc;

    public Hym(String hymNumber, String hymName, String hymDesc) {
        this.hymNumber = hymNumber;
        this.hymName = hymName;
        this.hymDesc = hymDesc;
    }

    public Hym() {
    }

    public String getHymNumber() {
        return hymNumber;
    }

    public void setHymNumber(String hymNumber) {
        this.hymNumber = hymNumber;
    }

    public String getHymName() {
        return hymName;
    }

    public void setHymName(String hymName) {
        this.hymName = hymName;
    }

    public String getHymDesc() {
        return hymDesc;
    }

    public void setHymDesc(String hymDesc) {
        this.hymDesc = hymDesc;
    }
}
