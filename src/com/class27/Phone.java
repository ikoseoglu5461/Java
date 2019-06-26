package com.class27;

public abstract class Phone {

	public void makeCall() {
		System.out.println("Phone can make a call");
	}
	public void sedText() {
		System.out.println("Phone can send text");
	}
	public abstract void unlockPhone();
	public abstract void viewPictures();
	
}
class iPhone extends Phone { //Concrate class- is class that is inherited from a abstract 
	//class or implemented by interface and providing implementation of all
	//umimplemented/ abstracted classes
	
	@Override
	public void unlockPhone() {
		System.out.println("To unlock Iphone we can user FaceId or FingerPrint");
	}
	@Override
	public void viewPictures() {
		System.out.println("To view Picture on Iphone can go to Images");
	}	
}
class Samsung extends Phone {

	@Override
	public void unlockPhone() {
		System.out.println("To unlock Samsung we can user FaceId or FingerPrint");
	}
	@Override
	public void viewPictures() {
		System.out.println("To view Picture on Samsung can go to Images");
	}
}