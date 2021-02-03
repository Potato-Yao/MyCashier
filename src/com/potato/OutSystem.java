package com.potato;

import java.util.Collection;

/**
 * @author 碳烤黄蜂
 */

public class OutSystem
{
	public void showCommodity()
	{
		var map = Map.map;

		Collection<Commodity> values = map.values();

		for (var i : values)
		{
			System.out.println(i.getName());
		}
	}
}
