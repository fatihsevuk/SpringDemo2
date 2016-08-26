package com.fatih.SpringDemo2;

public class Ucgen implements Sekil{

	private Nokta nokta1;
	private Nokta nokta2;
	private Nokta nokta3;
	
	
	
	
	
	public Nokta getNokta1() {
		return nokta1;
	}





	public void setNokta1(Nokta nokta1) {
		this.nokta1 = nokta1;
	}





	public Nokta getNokta2() {
		return nokta2;
	}





	public void setNokta2(Nokta nokta2) {
		this.nokta2 = nokta2;
	}





	public Nokta getNokta3() {
		return nokta3;
	}





	public void setNokta3(Nokta nokta3) {
		this.nokta3 = nokta3;
	}





	public void sekilCiz() {
		
		System.out.println("��gen �izildi");
		
		System.out.println("Nokta 1 kordinatlar�:"+nokta1.getX()+" , "+nokta1.getY());
		System.out.println("Nokta 2 kordinatlar�:"+nokta2.getX()+" , "+nokta2.getY());
		System.out.println("Nokta 3 kordinatlar�:"+nokta3.getX()+" , "+nokta3.getY());
	}
	
	
	

}
