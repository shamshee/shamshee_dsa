package org.sr.practice;

public class PrintOddEven {

	private static  int number=1;
	private static final int UPPERLIMIT=10;
	private static final Object Lock= new Object();
	
	
	
	public static void main(String[] args) {
		Runnable evenTask=()->{
			
			synchronized(Lock) {
			while(number<=UPPERLIMIT) {
				if(number%2==0) {
					System.out.println("even Number "+number++);
					Lock.notify();
				}else {
					try {
						Lock.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}}
		};
		
	Runnable oddTask=()->{
			
			synchronized(Lock) {
			while(number<=UPPERLIMIT) {
				if(number%2!=0) {
					System.out.println("odd Number "+number++);
					Lock.notify();
					
				}else {
					try {
						Lock.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}}
		};
		
		new Thread(evenTask).start();
		new Thread(oddTask).start();
	}
	
}
