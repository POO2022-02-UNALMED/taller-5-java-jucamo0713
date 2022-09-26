package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import gestion.*;
import zooAnimales.*;

@TestMethodOrder(MethodOrderer.Alphanumeric.class)
public class TestConstructores {
	
	@Test
   	public void testZoologico(){
		
		Zoologico zoo1 = new Zoologico();
		Zoologico zoo2 = new Zoologico("Central park", "Calle Principal");
		
		boolean ok = false;
		if(zoo1.getNombre() == null && zoo2.getNombre().equals("Central park")) {
			ok = true;
		}
		assertTrue(ok, "Hay un error en los constructores de la clase Zoologico");
    }
	
	@Test
   	public void testZona(){
		
		Zoologico zoo1 = new Zoologico();
		Zona zona1 = new Zona();
		Zona zona2 = new Zona("salvaje", zoo1);
		
		boolean ok = false;
		if(zona1.getNombre() == null && zona2.getNombre().equals("salvaje")
				&& zona2.getZoo().getNombre() ==  null) {
			ok = true;
		}
		assertTrue(ok, "Hay un error en los constructores de la clase Zona");
    }
	
	@Test
   	public void testAnimal(){
		
		Animal an1 = new Animal();
		Animal an2 = new Animal("Perro", 10, "casa", "m");
		
		boolean ok = false;
		if(an2.getNombre() == "Perro" && an2.getEdad() == 10
				&& an2.getHabitat().equals("casa") && an2.getGenero().equals("m")) {
			ok = true;
		}
		assertTrue(ok, "Hay un error en los constructores de la clase Animal");
    }
	
	@Test
   	public void testAnfibio(){
		
		Anfibio an1 = new Anfibio();
		Anfibio an2 = new Anfibio("rana", 5, "pradera", "F","verde", false);
		
		boolean ok = false;
		if(an2.getNombre().equals("rana") && an2.getEdad() == 5
				&& an2.getHabitat().equals("pradera") && an2.getGenero().equals("F")
				&& an2.getColorPiel().equals("verde") && an2.isVenenoso() == false) {
			ok = true;
		}
		assertTrue(ok, "Hay un error en los constructores de la clase Anfibio");
    }
	
	@Test
   	public void testAve(){
		
		Ave an1 = new Ave();
		Ave an2 = new Ave("paloma", 5, "ciudad", "F", "gris");
		
		boolean ok = false;
		if(an2.getNombre().equals("paloma") && an2.getEdad() == 5
				&& an2.getHabitat().equals("ciudad") && an2.getGenero().equals("F")
				&& an2.getColorPlumas().equals("gris")) {
			ok = true;
		}
		assertTrue(ok, "Hay un error en los constructores de la clase Ave");
    }
	
	@Test
   	public void testMamifero(){
		
		Mamifero an1 = new Mamifero();
		Mamifero an2 = new Mamifero("persona", 50, "ciudad", "F",false, 2);
		
		boolean ok = false;
		if(an2.getNombre().equals("persona") && an2.getEdad() == 50
				&& an2.getHabitat().equals("ciudad") && an2.getGenero().equals("F")
				&& an2.isPelaje() == false && an2.getPatas() == 2) {
			ok = true;
		}
		assertTrue(ok, "Hay un error en los constructores de la clase Mamifero");
    }
	
	@Test
   	public void testPez(){
		
		Pez an1 = new Pez();
		Pez an2 = new Pez("payaso", 5, "mar", "F", "azul", 3);
		
		boolean ok = false;
		if(an2.getNombre().equals("payaso") && an2.getEdad() == 5
				&& an2.getHabitat().equals("mar") && an2.getGenero().equals("F")
				&& an2.getColorEscamas().equals("azul") && an2.getCantidadAletas() == 3) {
			ok = true;
		}
		assertTrue(ok, "Hay un error en los constructores de la clase Pez");
    }
	
	@Test
   	public void testReptil(){
		
		Reptil an1 = new Reptil();
		Reptil an2 = new Reptil("lagartija", 1, "casa", "F", "cafe", 1);
		
		boolean ok = false;
		if(an2.getNombre().equals("lagartija") && an2.getEdad() == 1
				&& an2.getHabitat().equals("casa") && an2.getGenero().equals("F")
				&& an2.getColorEscamas().equals("cafe") && an2.getLargoCola() == 1) {
			ok = true;
		}
		assertTrue(ok, "Hay un error en los constructores de la clase Reptil");
    }

}
