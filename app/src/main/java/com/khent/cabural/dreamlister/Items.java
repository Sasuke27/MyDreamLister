package com.khent.cabural.dreamlister;

/**
 * Created by khent on 10/12/2017.
 */

public class Items {

    private int id;
    private String itemName;
    private String itemDesc;
    private int itemPrice;
    private byte[] image;

    public Items(String name, String desc, int itemPrice, byte[] image, int id){
        this.itemDesc = desc;
        this.itemName = name;
        this.itemPrice = itemPrice;
        this.image = image;
        this.id = id;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getListName() {
        return itemName;
    }

    public void setListName(String listName) {
        this.itemName = listName;
    }

    public String getListDesc() {
        return itemDesc;
    }

    public void setListDesc(String listDesc) {
        this.itemDesc = listDesc;
    }

    public int getListPrice() {
        return itemPrice;
    }

    public void setListPrice(int listPrice) {
        this.itemPrice = listPrice;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
}
