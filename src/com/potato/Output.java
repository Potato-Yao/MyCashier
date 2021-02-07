package com.potato;

import java.util.Collection;
import java.util.Scanner;

/**
 * @author Potato Yao
 */

public class Output
{

	/**
	 * 展示所有货物
	 * static: 展示货物不需要考虑对象，因此是静态的
	 */
	static public void showCommodity()
	{
		var map = Map.commodity;

		Collection<Commodity> values = map.values();

		int times = 0;

		for (var i : values)
		{
			System.out.println(times + " " + i.getName() + "\t" + i.getPrice() + "\t" + i.getKind());
			times++;
		}
	}

	/**
	 * 结账页面
	 * @param lumpSum 总金额
	 */
	public static void billPlease(float lumpSum)
	{
		String detail = "d";  // 查看详情使用
		String settleAccounts = "s";  // 结账使用
		String again = "a";  // 重复查看

		System.out.println("您的总金额为：");
		System.out.println(lumpSum + "￥");

		Scanner scanner = new Scanner(System.in);
		System.out.println("输入d查看详情，输入s结账");
		// Ctrl+Alt+Shift+J
		String choose = scanner.nextLine();
		choose = choose.toLowerCase();
		flag:
		while (true)
		{
			showCheckoutDetails();
			System.out.println("重复查看输入a，结账输入s");
			choose = scanner.nextLine();
			if (choose.equals(again))
			{
				showCheckoutDetails();
			}
			else if (choose.equals(settleAccounts))
			{
				System.out.println("支付成功");
				break;
			}
			else
			{
				System.out.println("请输入正经的东西！");
				break flag;
			}
		}
		scanner.close();
	}

	/**
	 * 显示订单详情
	 */
	public static void showCheckoutDetails()
	{
		System.out.println("您购买的物品如下");
		var keys = MoneyManager.keys;

		System.out.println("名词\t数量\t单价");
		for (var key : keys)
		{
			System.out.println(key.getName() + "\t" + Map.shoppingCart.get(key) + "\t" + key.getPrice() + "￥");
		}
	}
}
