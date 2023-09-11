package com.enterprise.exercise.test.encargado;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import com.enterprise.exercise.EmpleadoBR;
import com.enterprise.exercise.TipoEmpleado;

public class TestEmpleadoEncargadoConExtras {
	EmpleadoBR empleado = new EmpleadoBR();
	TipoEmpleado tipoEmpleado = new TipoEmpleado("Encargado");

	@Test
	public void testCalcularSalarioBrutoNulo() {
		try {
			float salarioBruto = empleado.calculaSalarioBruto(null, 1000, 5);
			empleado.calculaSalarioNeto(salarioBruto);
		} catch (Exception e) {
			Assert.assertEquals("BRException", e.getMessage());
		}
	}
	
	@Test
	public void testCalcularSalarioBrutoVentasNegativo() {
		try {
			float salarioBruto = empleado.calculaSalarioBruto(tipoEmpleado, -1000, 5);
			empleado.calculaSalarioNeto(salarioBruto);
		} catch (Exception e) {
			Assert.assertEquals("BRException", e.getMessage());
		}
	}
	
	@Test
	public void testCalcularSalarioBrutoHorasNegativo() {
		try {
			float salarioBruto = empleado.calculaSalarioBruto(tipoEmpleado, 1000, -5);
			empleado.calculaSalarioNeto(salarioBruto);
		} catch (Exception e) {
			Assert.assertEquals("BRException", e.getMessage());
		}
	}
	
	@Test
	public void testCalcularSalarioBrutoHorasVentasNegativo() {
		try {
			float salarioBruto = empleado.calculaSalarioBruto(tipoEmpleado, -1000, -5);
			empleado.calculaSalarioNeto(salarioBruto);
		} catch (Exception e) {
			Assert.assertEquals("BRException", e.getMessage());
		}
	}
	
	@Test
	public void testCalcularSalarioBrutoCeroVentas() {
		try {
			float salarioBruto = empleado.calculaSalarioBruto(tipoEmpleado, 0, 5);
			float salarioNeto = empleado.calculaSalarioNeto(salarioBruto);
			Assert.assertEquals(1344.0f, salarioNeto, 0.001f);
		} catch (Exception e) {
			fail("Exception: " + e.getMessage());
		}
	}
	
	@Test
	public void testCalcularSalarioBrutoVentasMenoresAMil() {
		try {
			float salarioBruto = empleado.calculaSalarioBruto(tipoEmpleado, 999, 5);
			float salarioNeto = empleado.calculaSalarioNeto(salarioBruto);
			Assert.assertEquals(1344.0f, salarioNeto, 0.001f);
		} catch (Exception e) {
			fail("Exception: " + e.getMessage());
		}
	}
	
	@Test
	public void testCalcularSalarioBrutoVentasIgualesAMil() {
		try {
			float salarioBruto = empleado.calculaSalarioBruto(tipoEmpleado, 1000, 5);
			float salarioNeto = empleado.calculaSalarioNeto(salarioBruto);
			Assert.assertEquals(1428.0f, salarioNeto, 0.001f);
		} catch (Exception e) {
			fail("Exception: " + e.getMessage());
		}
	}
	
	@Test
	public void testCalcularSalarioBrutoVentasSuperioresAMil() {
		try {
			float salarioBruto = empleado.calculaSalarioBruto(tipoEmpleado, 1001, 5);
			float salarioNeto = empleado.calculaSalarioNeto(salarioBruto);
			Assert.assertEquals(1428.0f, salarioNeto, 0.001f);
		} catch (Exception e) {
			fail("Exception: " + e.getMessage());
		}
	}
	
	@Test
	public void testCalcularSalarioBrutoVentasIgualesAMilQuinientos() {
		try {
			float salarioBruto = empleado.calculaSalarioBruto(tipoEmpleado, 1500, 5);
			float salarioNeto = empleado.calculaSalarioNeto(salarioBruto);
			Assert.assertEquals(1512.0f, salarioNeto, 0.001f);
		} catch (Exception e) {
			fail("Exception: " + e.getMessage());
		}
	}
	
	@Test
	public void testCalcularSalarioBrutoVentasSuperioresAMilQuinientos() {
		try {
			float salarioBruto = empleado.calculaSalarioBruto(tipoEmpleado, 1501, 5);
			float salarioNeto = empleado.calculaSalarioNeto(salarioBruto);
			Assert.assertEquals(1512.0f, salarioNeto, 0.001f);
		} catch (Exception e) {
			fail("Exception: " + e.getMessage());
		}
	}
}
