package com.potato;

import java.util.HashMap;

/**
 * @author Potato Yao
 */

public class Map
{
	public static HashMap<Integer, Commodity> map = new HashMap<>();
	static int id = 0   ;

	static
	{
		map.put(id++, new Commodity("Notebook", 10, Kinds.STATIONERY));
		map.put(id++, new Commodity("Pen", 1, Kinds.STATIONERY));
	}
	static
	{
		map.put(id++, new Commodity("Potato", 2, Kinds.VEGETABLE));
		map.put(id++, new Commodity("Tomato", 2, Kinds.VEGETABLE));
	}
	static
	{
		map.put(id++, new Commodity("Beef", 20, Kinds.MEAT));
	}
	static
	{
		map.put(id++, new Commodity("Apple", 5, Kinds.FRUIT));
	}
	static
	{
		map.put(id++, new Commodity("Potato chips", 10, Kinds.SNACK));
	}
	static
	{
		map.put(id++, new Commodity("Teeth blush", 10, Kinds.NECESSARY));
	}

	public String getName(int id)
	{
		return map.get(id).getName();
	}

	public float getPrice(int id)
	{
		return map.get(id).getPrice();
	}

	public Kinds getKind(int id)
	{
		return map.get(id).getKind();
	}
}
