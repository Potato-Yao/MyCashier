package com.potato.map;

import java.util.HashMap;

/**
 * @author 碳烤黄蜂
 */

public class Map
{
	public Map()
	{
		var map = new HashMap<Integer, Commodity>();
		map.put(1, new Commodity("Notebook", 10, kinds.STATIONERY));
		map.put(2, new Commodity("Pen", 1, kinds.STATIONERY));
	}
}
