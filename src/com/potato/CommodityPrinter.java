package com.potato;

import java.util.Collection;

/**
 * @author Potato Yao
 */

public class CommodityPrinter
{
	public void showCommodity()
	{
		var map = Map.map;

		Collection<Commodity> values = map.values();

		int times = 0;

		for (var i : values)
		{
			System.out.println(times + " " + i.getName() + "\t" + i.getPrice());
			times++;
		}
	}
}
