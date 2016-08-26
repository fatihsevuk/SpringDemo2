package com.fatih.SpringDemo2;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import javax.annotation.Resources;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;
import org.springframework.util.SystemPropertyUtils;




@Component
public class Daire implements Sekil{
	
	private Nokta merkez;
	
	
	
	public Nokta getMerkez() {
		return merkez;
	}


	//@Required
	
	//@Autowired
	//@Qualifier("daireMerkez")
	
	
	//@Resource(name="nokta1")
	
	@Resource//name atribute ını kullanmazsak xmlde merkez isminde bir bean tanımlamak zorundayız.
	public void setMerkez(Nokta merkez) {
		this.merkez = merkez;
	}



	public void sekilCiz() {
		
		System.out.println("Daire Çizildi");
		
		System.out.println("Merkez kordinatlari: "+merkez.getX()+" , "+merkez.getY() );
	}
	
	
	@PostConstruct
	public void başlat(){
		System.out.println("daire nesnesi başlatıldı");
	}
	
	@PreDestroy//bu anotasyonun çalışması için main içinde AbstractApplicationContext tanımlamamız ve context.registerShutdownHook yapmamz lazım.
	public void bitir(){
		System.out.println("daire nesnesi bitirildi");
	}
	
}
