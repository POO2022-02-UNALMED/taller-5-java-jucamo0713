package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import gestion.Zona;
import gestion.Zoologico;
import zooAnimales.Anfibio;
import zooAnimales.Ave;
import zooAnimales.Mamifero;
import zooAnimales.Pez;
import zooAnimales.Reptil;

@TestMethodOrder(MethodOrderer.Alphanumeric.class)
public class TestCantidades {
	
	public static Zoologico zoo = new Zoologico();
	
	static {
		Zona z1 = new Zona();
		Zona z2 = new Zona();
		zoo.agregarZonas(z1);
		zoo.agregarZonas(z2);
		z1.agregarAnimales(Mamifero.crearCaballo("test", 11, "M"));
		z1.agregarAnimales(Mamifero.crearCaballo("test", 11, "M"));
		z1.agregarAnimales(Mamifero.crearLeon("test", 11, "M"));
		z1.agregarAnimales(Ave.crearHalcon("test", 11, "M"));
		z1.agregarAnimales(Ave.crearHalcon("test", 11, "M"));
		z1.agregarAnimales(Ave.crearAguila("test", 11, "M"));
		z1.agregarAnimales(Ave.crearAguila("test", 11, "M"));
		z1.agregarAnimales(Anfibio.crearRana("test", 11, "M"));
		z2.agregarAnimales(Anfibio.crearSalamandra("test", 11, "M"));
		z2.agregarAnimales(Reptil.crearIguana("test", 11, "M"));
		z2.agregarAnimales(Reptil.crearSerpiente("test", 11, "M"));
		z2.agregarAnimales(Pez.crearSalmon("test", 11, "M"));
		z2.agregarAnimales(Pez.crearBacalao("test", 11, "M"));
		Mamifero.crearCaballo("test", 11, "M");
		Ave.crearHalcon("test", 11, "M");
		Anfibio.crearRana("test", 11, "M");
		Reptil.crearIguana("test", 11, "M");
		Pez.crearBacalao("test", 11, "M");
	}
	
	@Test
   	public void testCantidadTotalAnimales(){
		assertEquals(zoo.cantidadTotalAnimales(), 13, "Hay un problema en el metodo de cantidadTotalAnimales en la clase Zoologico");
    }
	
	@Test
   	public void testCantidadAnimalesZonas(){
		assertEquals(zoo.getZona().get(0).cantidadAnimales(), 8, "Hay un problema en el metodo de cantidadAnimales en la clase Zona");
    }
	
	@Test
   	public void testCantidadMamiferos(){
		boolean ok = false;
		
		if(Mamifero.caballos == 3 && Mamifero.leones == 1) {
			ok = true;
		}
		assertTrue(ok, "Hay un problema con el conteo de caballos o leones");
    }
	
	@Test
   	public void testCantidadAves(){
		boolean ok = false;
		
		if(Ave.aguilas == 2 && Ave.halcones == 3) {
			ok = true;
		}
		assertTrue(ok, "Hay un problema con el conteo de aguilas o halcones");
    }
	
	@Test
   	public void testCantidadAnfibios(){
		
		boolean ok = false;
		
		if(Anfibio.ranas == 2 && Anfibio.salamandras == 1) {
			ok = true;
		}
		assertTrue(ok, "Hay un problema con el conteo de ranas o salamandras");
    }
	
	@Test
   	public void testCantidadReptiles(){
		
		boolean ok = false;
		
		if(Reptil.iguanas == 2 && Reptil.serpientes == 1) {
			ok = true;
		}
		assertTrue(ok, "Hay un problema con el conteo de iguanas o serpientes");
    }
	
	@Test
   	public void testCantidadPeces(){
		
		boolean ok = false;
		
		if(Pez.salmones == 1 && Pez.bacalaos == 2) {
			ok = true;
		}
		assertTrue(ok, "Hay un problema con el conteo de salmones o bacalaos");
    }
}
