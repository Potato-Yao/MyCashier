package com.potato;

import java.util.HashMap;

/**
 * @author Potato Yao
 */

public class Map
{
	// 商品信息
	public static HashMap<Integer, Commodity> commodity = new HashMap<>();
	// 要买的物品信息
	public static HashMap<Commodity, Integer> shoppingCart = new HashMap<>();
	// 商品id
	static int id = 0;

	/*
	 这里放蔬菜类
	 */
	static
	{
		commodity.put(id++, new Commodity("Potato", 2, Kinds.VEGETABLE));
		commodity.put(id++, new Commodity("Tomato", 2, Kinds.VEGETABLE));
	}

	/*
	 这里放肉类
	 */
	static
	{
		commodity.put(id++, new Commodity("Beef", 20, Kinds.MEAT));
		commodity.put(id++, new Commodity("Chicken", 20, Kinds.MEAT));
	}

	/*
	 这里放水果类
	 */
	static
	{
		commodity.put(id++, new Commodity("Apple", 5, Kinds.FRUIT));
		commodity.put(id++, new Commodity("Banana", 5, Kinds.FRUIT));
	}

	/*
	 这里放饮料类
	 */
	static
	{
		commodity.put(id++, new Commodity("Milk", 5, Kinds.DRINK));
		commodity.put(id++, new Commodity("Coffee", 5, Kinds.DRINK));
	}

	/*
	 这里放零食类
	 */
	static
	{
		commodity.put(id++, new Commodity("Potato chips", 10, Kinds.SNACK));
		commodity.put(id++, new Commodity("Apple pie", 10, Kinds.SNACK));
	}

	/*
	 这里放文具类
	 */
	static
	{
		commodity.put(id++, new Commodity("Notebook", 10, Kinds.STATIONERY));
		commodity.put(id++, new Commodity("Pen", 1, Kinds.STATIONERY));
	}

	/*
	 这里放日用品类
	 */
	static
	{
		commodity.put(id++, new Commodity("Teeth blush", 10, Kinds.NECESSARY));
		commodity.put(id++, new Commodity("Towel", 20, Kinds.NECESSARY));
	}
}
