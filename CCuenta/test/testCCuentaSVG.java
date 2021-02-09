import static org.junit.Assert.*;

import org.junit.Test;

public class testCCuentaSVG {

	@Test
	public void testCcuentaCreacionSVG() {
		Ccuenta miCuenta=new Ccuenta("Ana","ES08-3456-2343-2345-1234-1234",3200,1);
		assertNotNull(miCuenta);
	}
	
	@Test
	public void testCcuentaCreacionCompletaSVG() {
		
		Ccuenta miCuenta=new Ccuenta("Ana","ES08-3456-2343-2345-1234-1234",3200,1);
		assertEquals("Ana",miCuenta.getNombre());
		assertEquals("ES08-3456-2343-2345-1234-1234",miCuenta.getCuenta());
		assertEquals(3200,miCuenta.getSaldo(),0.01);
	}

	@Test
	public void testIngresarSVG() {
		Ccuenta miCuenta=new Ccuenta("Ana","ES08-3456-2343-2345-1234-1234",3200,1);
		miCuenta.ingresar(1200);
		assertEquals(4400,miCuenta.getSaldo(),0.01);
		
	}
	
	@Test
	public void testIngresarNegativoSVG() {
		Ccuenta miCuenta=new Ccuenta("Ana","ES08-3456-2343-2345-1234-1234",3200,1);
		miCuenta.ingresar(-1200);
		assertEquals(3200,miCuenta.getSaldo(),0.01);
	}

	@Test
	public void testRetirarCorrectaSVG() {
		Ccuenta miCuenta=new Ccuenta("Ana","ES08-3456-2343-2345-1234-1234",3200,1);
		miCuenta.retirar(1000);
		assertEquals(2200,miCuenta.getSaldo(),0.01);
	}

	@Test
	public void testRetirarGranRetiradaSVG() {
		Ccuenta miCuenta=new Ccuenta("Ana","ES08-3456-2343-2345-1234-1234",3200,1);
		miCuenta.retirar(5000);
		assertEquals(0,miCuenta.getSaldo(),0.01);
	}

}
