package com.potato;

import java.util.Scanner;

/**
 * @author Potato Yao
 */

public class Input
{
	public static void purchasedItemsInput()
	{
		while (true)
		{
			System.out.println("请根据id号码输入需要买的物品以及数量,id输入负整数表示完成");
			Scanner scanner = new Scanner(System.in);
			System.out.println("-");
			int index = scanner.nextInt();
			if (index < 0)
			{
				return;
			}
			System.out.println("请输入个数");
			int number = scanner.nextInt();
			Map.shoppingCart.put(Map.commodity.get(index), number);
		}
	}
}
