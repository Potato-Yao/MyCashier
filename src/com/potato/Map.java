package com.potato;

import java.util.HashMap;

/**
 * @author 碳烤黄蜂
 */

public class Map
{
	public static HashMap<Integer, Commodity> map = new HashMap<>();

	{
		map.put(1, new Commodity("Notebook", 10, Kinds.STATIONERY));
		map.put(2, new Commodity("Pen", 1, Kinds.STATIONERY));
	}

	public String getName(int id)
	{
		return map.get(id).getName();
	}
}
