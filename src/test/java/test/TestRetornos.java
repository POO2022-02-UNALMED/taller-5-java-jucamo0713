package test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import zooAnimales.Anfibio;
import zooAnimales.Animal;
import zooAnimales.Ave;
import zooAnimales.Mamifero;
import zooAnimales.Pez;
import zooAnimales.Reptil;

@TestMethodOrder(MethodOrderer.Alphanumeric.class)
public class TestRetornos {

	@Test
   	public void testTotalTipo(){
		
		new Anfibio();
		new Anfibio();
		new Mamifero();
		new Mamifero();
		new Mamifero();
		new Reptil();
		new Pez();
		new Ave();
		new Ave();
		boolean ok = false;
		String  comp = "Mamiferos: 4\n" + 
				"Aves: 4\n" + 
				"Reptiles: 2\n" + 
				"Peces: 2\n" + 
				"Anfibios: 3";
		if(Animal.totalPorTipo().equals(comp)) {
			ok = true;
		}
		assertTrue(ok, "Hay un problema en el metodo totalPorTipos");
    }
	
	@Test
   	public void testToString(){
		
		Ave an2 = new Ave("paloma", 5, "ciudad", "F", "gris");
		boolean ok = false;
		String  comp = "Mi nombre es paloma, tengo una edad de 5, habito en ciudad y mi genero es F";
		if(an2.toString().equals(comp)) {
			ok = true;
		}
		assertTrue(ok, "Hay un problema en el metodo toString de la clase Animal");
    }
	
	@Test
   	public void testMovimiento(){
		
		Animal a1 = new Anfibio();
		Animal a2 = new Ave();
		Animal a3 = new Mamifero();
		Animal a4 = new Pez();
		Animal a5 = new Reptil();
		boolean ok = false;
		if(a1.movimiento().equals("saltar") && a2.movimiento().equals("volar")
				&& a3.movimiento().equals("desplazarse") && a4.movimiento().equals("nadar")
				&& a5.movimiento().equals("reptar")) {
			ok = true;
		}
		assertTrue(ok, "Hay un problema en algun metodo movimiento de las subclases y la clase Animal");
    }
}