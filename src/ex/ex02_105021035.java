package ex;
import java.util.*;
/*
 * Topic: 有一圓形，直徑為200，且中心座標為(0,0)。
 * 	請寫一支程式可以輸入「點」的座標，並判斷「點」是否在圓形的範圍內。
 * 	如果「點」的位置剛好在邊界的話也算是在圓形範圍內(例：x=100，y=0)。
 * Date: 2016/09/26
 * Author: 105021035 王文宏
 */

public class ex02_105021035 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner sca=new Scanner(System.in);
	    int x=sca.nextInt();
	    int y=sca.nextInt();
	    double z=Math.sqrt((x-0)^2+(y-0)^2);
	    System.out.print(z);
	    if(z>100){System.out.print("點在園外");
	  
	    }
	    else System.out.print("點在園內");
	}
	
}