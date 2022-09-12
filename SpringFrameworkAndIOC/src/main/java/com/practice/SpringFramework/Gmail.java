package com.practice.SpringFramework;

import com.practice.Interface.SharingApp;

public class Gmail implements SharingApp{

	@Override
	public void share() {
		System.out.println("Shared through Gmail");
	}

	
}
