package com.shapes;

public class Shapes {
	private String color;
	private int dimention;
	private int l,b,h,r;
	
	Shapes(int l,int b){
		this.l = l;
		this.b = b;
		this.dimention = 2;
	}
	
	Shapes(int r){
		this.r = r;
		this.dimention = 2;
	}
	
	Shapes(int l,int b,int h){
		this.l = l;
		this.b = b;
		this.h = h;
		this.dimention = 3;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getDimention() {
		return dimention;
	}
//
//	public void setDimention(int dimention) {
//		this.dimention = dimention;
//	}
	
	public int getVolume(){
		if(dimention == 3){
			return l*b*h;
		}
		else{
			System.out.println("It is not 3 Dimention object");
			return -1;
		}
	}
	
	public int getArea(){
		if(dimention == 2){
			if(r>0){
				return r*r*22/7;
			}else{
				return l*b;
			}
		}else{
			System.out.println("It is not 2 Dimention object");
			return -1;
		}
	}
}
