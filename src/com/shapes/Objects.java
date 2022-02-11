package com.shapes;

import org.testng.Assert;

public class Objects {

	@org.testng.annotations.Test
	public static void Test() {
		Shapes circle = new Shapes(5);
		circle.setColor("green");
//		circle.setDimention(3);
		
		System.out.println("area : "  + circle.getArea());
		System.out.println("color : " + circle.getColor());
		System.out.println("dimention : " + circle.getDimention());
		
		Assert.assertEquals(circle.getDimention(), 2);
		Assert.assertTrue(circle.getArea()>0);
	//arulkumart@zeta.tech0
	}

}
