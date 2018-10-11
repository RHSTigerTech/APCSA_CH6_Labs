package Shopping;
/**
 * Name:
 * Date:
 * Period:
 *
 * Shopping.Item.java
 *
 * Represents an item in a shopping cart.
 */

import java.text.NumberFormat;

public class Item
{
    private String name;
    private double price;
    private int quantity;

    /**
     * Creates a new item with the given attributes
     *
     * @param itemName
     * @param itemPrice
     * @param numPurchased
     */
    public Item (String itemName, double itemPrice, int numPurchased)
    {
        name = itemName;
        price = itemPrice;
        quantity = numPurchased;
    }

    /**
     *
     * @return a String withe the information about the item
     */
    public String toString ()
    {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();

        return (name + "\t" + fmt.format(price) + "\t" + quantity + "\t"
            + fmt.format(price*quantity));
    }

    /**
     *
     * @return the unit price of the item
     */
    public double getPrice()
    {
        return price;
    }

    /**
     *
     * @return the name of the item
     */
    public String getName()
    {
        return name;
    }

    /**
     *
     * @return the quantity of the item
     */
    public int getQuantity()
    {
        return quantity;
    }
}  
