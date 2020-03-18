package com.hpf;

import java.util.ArrayList;
import java.util.LinkedList;

public class StageDemo {

	/**
	 * 
	 * @param arr     需要进行组合的数组，数字为0-9范围内
	 * @param letters 数字对应的字符，一一对应
	 * @return 返回值为组合后的String类型的集合
	 */
	public static ArrayList<String> doLetterCombination(int[] arr, String[] letters) {
		ArrayList<String> res = new ArrayList<String>();
		LinkedList<String> list = new LinkedList<>();
		// 初始值
		list.add("");
		// 将list中的值存入结果中
		while (!list.isEmpty()) {
			String head = list.remove();
			// 合并完字符串，放入结果集中
			if (head.length() == arr.length) {
				res.add(head);
			} else {
				String letter = letters[arr[head.length()]];
				for (int i = 0; i < letter.length(); i++) {
					// 临时
					list.add(head + letter.charAt(i));
				}
			}
		}

		return res;
	}

	/**
	 * 
	 * @param 传入需要进行组合的数组，数字为0-9范围内
	 */
	public static void letterCombination(int[] arr) {
		if (arr == null || arr.length == 0) {
			System.out.println("当前数组为空！");
			return;
		}
		for (int i : arr) {
			if (i < 0 || i > 9) {
				System.out.println("数组中的数字只能为1~9的数字！");
				return;
			}
		}
		// 所有数字对应的字符
		String[] letters = new String[] { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
		// 组合后的结果
		ArrayList<String> result = doLetterCombination(arr, letters);
		// 打印结果
		for (String str : result) {
			System.out.print(str + " ");
		}

	}

}
