package impo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZeroRotation {
	public static void main(String[] args) {
		int a[]= {0,0,13,5,0,16,0};
		zeroRotator(a);
		System.out.println(Arrays.toString(a));
		System.out.println(a[2]%10);
	}
//-----------------------------------------------------------	
	public static void zeroRotator(int a[])
	
	{
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length-1; j++) {
				if (a[j]==0){
					int t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
		
		
	}

}
