package com.hpf;

import org.junit.Test;

public class StageTest {
		
	//测试边界
	@Test
	public void test1() {
		int[] arr = null;
		StageDemo.letterCombination(arr);
	}
	
	//测试非0~9的数组
	@Test
	public void test2() {
		int[] arr = {-2,3};
		StageDemo.letterCombination(arr);
	}
	
	//正常运行结果测试
	@Test
	public void test3() {
		int[] arr = {2,3,4};
		StageDemo.letterCombination(arr);
	}

}
