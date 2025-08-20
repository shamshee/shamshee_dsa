package org.sr.array;

public class ArmstronNo {
public static void main(String[] args) {
	System.out.println(isArmstrong(152));
}
static boolean isArmstrong(int num) {
	int originalNum=0,result=0, reminder=0;
	originalNum=num;
	
	
	while(originalNum!=0) {
		reminder= originalNum%10;
		result+=Math.pow(reminder, 3);
		originalNum=originalNum/10;
	}
	return num==result;
}

}
