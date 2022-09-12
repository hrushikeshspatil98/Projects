package com.practice.SpringFramework;

import com.practice.Interface.SharingApp;

public class WhatsApp implements SharingApp{

	@Override
	public void share() {
		System.out.println("Shared through Whatsapp");
	}
	
}
