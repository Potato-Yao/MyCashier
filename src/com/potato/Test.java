package com.potato;

/**
 * @author Potato Yao
 */

public class Test
{
	public static void main(String[] args)
	{
		System.out.println("欢迎使用本收银台");
		Output.showCommodity();
		Input.purchasedItemsInput();
		MoneyManager.manager();
		Output.billPlease(MoneyManager.lumpSum);
	}
}
