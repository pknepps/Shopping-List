package com.pknepps.shoppinglist;
/**
 * This class models a item to go into the shopping list. It has fields for the item name and
 * price.
 */
public class Item {

    /** The name of the item. */
    private String name;
    /** The price of the item. */
    private Double price;

    /**
     * Creates a new instance of an Item.
     * @param name The name of the item.
     * @param price The price of the item, as a string.
     */
    public Item(String name, String price) {
        this.name = name;
        setPrice(price);
    }

    /**
     * Creates a new instance of an item
     * @param name The name of the item.
     */
    public Item(String name) {
        this( name, "0.0");
    }

    /**
     * Creates a new, default instance of an item.
     */
    public Item() {
        this("");
    }

    /**
     * Gets the name of this item.
     * @return the name of this item.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the price of this item.
     * @return the price of this item.
     */
    public Double getPrice() {
        return price;
    }

    /**
     * Sets the name of this item.
     * @param name The new name of this item.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the price of this item.
     * @param price The new price of this item, as a string.
     */
    public void setPrice(String price) {
        if (price.equals("")) {
            price = "0.00";
        }
        this.price = Double.parseDouble(price);
    }
}
