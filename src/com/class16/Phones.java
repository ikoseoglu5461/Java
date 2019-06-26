package com.class16;

public class Phones {

	// Create a Class “Phone”. Create 3 Objects of it: iPhone, Android, Nokia with specific  attributes and behaviours.
	
	String brand, color, os;
    boolean camera, voicerecord;
    int screen, ram;
    
    public static void main(String[] args) {
		
    	Phones phon1=new Phones();
    	phon1.brand="Apple";
    	phon1.os="IOS";
    	phon1.camera=true;
    	phon1.voicerecord=true;
    	phon1.screen=6;
    	phon1.ram=4;
        
        
    	phon1.watchMovie();
    	phon1.takeVideo();
    	phon1.playMusic();
        
    	Phones phon2=new Phones();
    	phon2.brand="Samsung";
    	phon2.os="Android";
    	phon2.camera=true;
    	phon2.voicerecord=true;
    	phon2.screen=5;
    	phon2.ram=3;
        
    	phon2.watchMovie();
    	phon2.takeVideo();
    	phon2.playMusic();
        
        Phones phon3=new Phones();
    	phon3.brand="Nokia";
    	phon3.os="Windows";
    	phon3.camera=true;
    	phon3.voicerecord=true;
    	phon3.screen=7;
    	phon3.ram=2;
    	
    	phon3.watchMovie();
    	phon3.takeVideo();
    	phon3.playMusic();
	}
    
    void watchMovie() {
    	System.out.println("We can watch movie on a phone "+brand);
    }
	
	void takeVideo() {
		System.out.println("We can take a video on our phone "+brand);
	}
	
	void playMusic() {
		System.out.println("We can play music on our phone "+brand);
	}
}
	