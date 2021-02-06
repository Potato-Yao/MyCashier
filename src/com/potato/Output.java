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
	public void billPlease(float lumpSum)
	{
		String detail = "d";  // 查看详情使用
		String settleAccounts = "s";  // 结账使用

		System.out.println("您的总金额为：");
		System.out.println(lumpSum);

		Scanner scanner = new Scanner(System.in);
		System.out.println("输入d查看详情，输入s结账");
		// Ctrl+Alt+Shift+J
		String choose = scanner.nextLine();
		choose = choose.toLowerCase();
		flag:
		if (choose.equals(detail))
		{
			// TODO 展示详情
		}
		else if(choose.equals(settleAccounts))
		{
			System.out.println("支付成功");
		}
		else
		{
			System.out.println("请输入正经的东西");
			break flag;
		}
		scanner.close();
	}

	/**
	 * 显示订单详情
	 */
	public void showCheckoutDetails()
	{
	}
}
