package com.potato;

/**
 * @author Potato Yao
 */

public class Test
{
	public static void main(String[] args)
	{
		System.out.println("欢迎使用本收银台");
		Output.showCommodity();  // 显示商品
		Input.purchasedItemsInput();  // 输入要购买的物品
		MoneyManager.manager();  // 结算总额
		Output.billPlease(MoneyManager.lumpSum);  // 结账
	}
}
