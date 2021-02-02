package com.potato;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 碳烤黄蜂
 */

public class OutSystem
{
	/*
	HashMap a;

	{
		a.put(1, new Commodity("Notebook", 10, Kinds.STATIONERY));
		a.put(2, new Commodity("Pen", 1, Kinds.STATIONERY));
	}
	 */

	/*
	{
		a = Map.map;
	}
	 */

	public void showCommodity()
	{
		HashMap a = new HashMap<>();

		a.put(1, new Commodity("Notebook", 10, Kinds.STATIONERY));
		a.put(2, new Commodity("Pen", 1, Kinds.STATIONERY));

		for (int i = 1; i <= a.size(); i++)
		{
			System.out.println(a.get(i));
		}

		for (var key : a.keySet())
		{
			var value = a.get(key);
			System.out.println(key + " " + value);
		}

		for (Map.Entry<String, Integer> e : a.entrySet())
		{

		}
	}
}
