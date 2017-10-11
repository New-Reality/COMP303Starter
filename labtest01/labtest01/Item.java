package labtest01;

/**
 * An item in a grocery store: 
 * Jar of peanut butter, package of pasta,
 * whatever.
 */
public class Item
{
	private final String aName;
	private final int aId;
	private final int aPrice; // In cents: 100 = one dollar
	
	/**
	 * Creates a new item.
	 * @param pName The name of the item. Not necessarily unique.
	 * @param pId A unique id for the item
	 * @param pPrice The price of the item in cents
	 */
	public Item(String pName, int pId, int pPrice)
	{
		aName = pName;
		aId = pId;
		aPrice = pPrice;
	}
	
	
	public void compareItems(Item1, Item2) 
	{
		
	}
	
// 	public void stock(Item pItem, int pQuantity)
// 	{
// 		int amount = 0;
// 		if( aInventory.containsKey(pItem))
// 		{
// 			amount = aInventory.get(pItem);
// 		}
// 		amount += pQuantity;
// 		aInventory.put(pItem, amount);
// 	}
	
// 	/**
// 	 * Removes pQuantity of items from the inventory,
// 	 * for example by selling them or tossing them in
// 	 * the garbage.
// 	 * @param pItem The type of item to dispose of
// 	 * @param pQuantity The amount to dispose.
// 	 * @pre aInventory.containsKey(pItem) && pQuantity >= aInventory.get(pItem)
// 	 */
// 	public void dispose(Item pItem, int pQuantity)
// 	{
// 		int amount = aInventory.get(pItem);
// 		amount -= pQuantity;
// 		aInventory.put(pItem, amount);
// 	}
	
	/**
	 * @return The name of the item
	 */
	public String getName()
	{
		return aName;
	}
	
	/**
	 * @return The ID of the item.
	 */
	public int getId()
	{
		return aId;
	}
	
	/**
	 * @return The price of the item in cents
	 */
	public int getPrice()
	{
		return aPrice;
	}
	
	public static boolean equals() 
	{
		if (getName(pName) != getPrice(pPrice) || getPrice(pPrice) !=	getID(pID)  || getName(pName) != getId(pID)) {
			return false;
		} else {
			return true;
		}
	}
}
