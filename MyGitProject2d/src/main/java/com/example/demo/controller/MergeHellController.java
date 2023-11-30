package com.example.demo.controller;

import java.util.Random;

public class MergeHellController {
	public static void main(String[] args) {

		kadaiB();

	}

		static void kadaiB() {
		Random rnd =new Random();
		int a=rnd.nextInt(100);
		System.out.println(a+1+"が出ました");
		}
}