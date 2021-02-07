package com.potato;

import java.io.InputStream;

/**
 * @author Potato Yao
 */

public class Test
{
	public static void main(String[] args)
	{
		System.out.println("欢迎使用本计算器");
		Output.showCommodity();
		Input.purchasedItemsInput();
		MoneyManager.manager();
		Output.billPlease(MoneyManager.lumpSum);
	}
}
