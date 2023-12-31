package com.pknepps.shoppinglist;

import androidx.annotation.NonNull;

import java.io.Serializable;

/**
 * This class models a item to go into the shopping list. It has fields for the item name and
 * price.
 * @author Preston Knepper
 */
public class Item implements Serializable {

    /** The name of the item. */
    private String name;

    /** The price of the item. */
    private Double price;

    private boolean removeButtonVisible;

    /**
     * Creates a new instance of an Item.
     * @param name The name of the item.
     * @param price The price of the item, as a string.
     */
    public Item(String name, String price) {
        this.name = name;
        setPrice(price);
        removeButtonVisible = false;
    }

    /**
     * Creates a new instance of an item from the output produced by item.toString().
     * @param fromFile The name of the item.fromFile the output of Item.toString().
     */
    public Item(String fromFile) {
        this(fromFile.substring(6, fromFile.indexOf(" Price: ")),
                fromFile.substring(fromFile.indexOf(" Price: ") + 8,
                        fromFile.indexOf( " removeButtonVisible")));
        removeButtonVisible = Boolean.parseBoolean(fromFile.substring(fromFile.indexOf(
                "removeButtonVisible: " + 21, fromFile.length() - 1)));
    }

    /**
     * Creates a new, default instance of an item.
     */
    public Item() {
        this("", "0.00");
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
        if (price.equals("") || price.equals(".")) {
            price = "0.00";
        }
        this.price = Double.parseDouble(price);
    }

    /**
     * Gets if the respective remove button should be visible.
     * @return true if the attached removeButton is visible.
     */
    public boolean isRemoveButtonVisible() {
        return removeButtonVisible;
    }

    /**
     * Sets the associated removeButton visibility.
     * @param removeButtonVisible The visibility of the respective removeButton. true if visible.
     */
    public void setRemoveButtonVisible(boolean removeButtonVisible) {
        this.removeButtonVisible = removeButtonVisible;
    }

    /**
     * @return a String representation of this object
     */
    @NonNull
    public String toString() {
        return "Name: " + name + " Price: " + price + " removeButtonVisible: " +
                removeButtonVisible;
    }
}
