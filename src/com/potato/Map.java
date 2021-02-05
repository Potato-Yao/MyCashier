package com.potato;

import java.util.HashMap;

/**
 * @author Potato Yao
 */

public class Map
{
	public static HashMap<Integer, Commodity> map = new HashMap<>();
	static int id = 0;

	/*
	 这里放蔬菜类
	 */
	static
	{
		map.put(id++, new Commodity("Potato", 2, Kinds.VEGETABLE));
		map.put(id++, new Commodity("Tomato", 2, Kinds.VEGETABLE));
	}

	/*
	 这里放肉类
	 */
	static
	{
		map.put(id++, new Commodity("Beef", 20, Kinds.MEAT));
		map.put(id++, new Commodity("Chicken", 20, Kinds.MEAT));
	}

	/*
	 这里放水果类
	 */
	static
	{
		map.put(id++, new Commodity("Apple", 5, Kinds.FRUIT));
		map.put(id++, new Commodity("Banana", 5, Kinds.FRUIT));
	}

	/*
	 这里放饮料类
	 */
	static
	{
		map.put(id++, new Commodity("Milk", 5, Kinds.DRINK));
		map.put(id++, new Commodity("Coffee", 5, Kinds.DRINK));
	}

	/*
	 这里放零食类
	 */
	static
	{
		map.put(id++, new Commodity("Potato chips", 10, Kinds.SNACK));
		map.put(id++, new Commodity("Apple pie", 10, Kinds.SNACK));
	}

	/*
	 这里放文具类
	 */
	static
	{
		map.put(id++, new Commodity("Notebook", 10, Kinds.STATIONERY));
		map.put(id++, new Commodity("Pen", 1, Kinds.STATIONERY));
	}

	/*
	 这里放日用品类
	 */
	static
	{
		map.put(id++, new Commodity("Teeth blush", 10, Kinds.NECESSARY));
		map.put(id++, new Commodity("Towel", 20, Kinds.NECESSARY));
	}
}
