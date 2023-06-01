package com.example.nobeautyfinally.model;

public class Goods_class {

    int id;
    String block, nameofgood, descriptionofgood, icongood, text;

    public Goods_class(int id, String block, String nameofgood, String descriptionofgood, String icongood, String text) {
        this.nameofgood = nameofgood;
        this.descriptionofgood = descriptionofgood;
        this.icongood = icongood;
        this.id = id;
        this.block = block;
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public String getBlock() {
        return block;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public String getNameofgood() {
        return nameofgood;
    }

    public String getDescriptionofgood() {
        return descriptionofgood;
    }

    public String getIcongood() {
        return icongood;
    }

    public void setNameofgood(String nameofgood) {
        this.nameofgood = nameofgood;
    }

    public void setDescriptionofgood(String descriptionofgood) {
        this.descriptionofgood = descriptionofgood;
    }

    public void setIcongood(String icongood) {
        this.icongood = icongood;
    }


}
