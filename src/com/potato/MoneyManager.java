package com.potato;

import java.util.*;

/**
 * @author Potato Yao
 */

public class MoneyManager
{
	static float lumpSum;
	static Collection<Commodity> keys = com.potato.Map.shoppingCart.keySet();


	public static void manager()
	{
		for (var key : keys)
		{
			lumpSum += key.getPrice() * Map.shoppingCart.get(key);
		}
	}
}
