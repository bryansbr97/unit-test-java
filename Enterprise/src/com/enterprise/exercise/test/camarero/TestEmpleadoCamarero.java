package com.enterprise.exercise.test.camarero;

import org.junit.Assert;
import org.junit.Test;

import com.enterprise.exercise.EmpleadoBR;
import com.enterprise.exercise.TipoEmpleado;

public class TestEmpleadoCamarero {
	EmpleadoBR empleado = new EmpleadoBR();
	TipoEmpleado tipoEmpleado = new TipoEmpleado("Camarero");

	@Test
	public void testCalcularSalarioBrutoNulo() {
		try {
			float salarioBruto = empleado.calculaSalarioBruto(null, 1000, 0);
			empleado.calculaSalarioNeto(salarioBruto);
		} catch (Exception e) {
			Assert.assertEquals("BRException", e.getMessage());
		}
	}
	
	@Test
	public void testCalcularSalarioBrutoVentasNegativo() {
		try {
			float salarioBruto = empleado.calculaSalarioBruto(tipoEmpleado, -1000, 0);
			empleado.calculaSalarioNeto(salarioBruto);
		} catch (Exception e) {
			Assert.assertEquals("BRException", e.getMessage());
		}
	}
	
	@Test
	public void testCalcularSalarioBrutoHorasNegativo() {
		try {
			float salarioBruto = empleado.calculaSalarioBruto(tipoEmpleado, 1000, -1);
			empleado.calculaSalarioNeto(salarioBruto);
		} catch (Exception e) {
			Assert.assertEquals("BRException", e.getMessage());
		}
	}
	
	@Test
	public void testCalcularSalarioBrutoHorasVentasNegativo() {
		try {
			float salarioBruto = empleado.calculaSalarioBruto(tipoEmpleado, -1000, -1);
			empleado.calculaSalarioNeto(salarioBruto);
		} catch (Exception e) {
			Assert.assertEquals("BRException", e.getMessage());
		}
	}
	
	@Test
	public void testCalcularSalarioBrutoCeroVentas() {
		try {
			float salarioBruto = empleado.calculaSalarioBruto(tipoEmpleado, 0, 0);
			empleado.calculaSalarioNeto(salarioBruto);
		} catch (Exception e) {
			Assert.assertEquals("Error al calcular el salario bruto.", e.getMessage());
		}
	}
	
	@Test
	public void testCalcularSalarioBrutoSinHorasExtra() {
		try {
			float salarioBruto = empleado.calculaSalarioBruto(tipoEmpleado, 1100, 0);
			empleado.calculaSalarioNeto(salarioBruto);
		} catch (Exception e) {
			Assert.assertEquals("Error al calcular el salario bruto.", e.getMessage());
		}
	}
	
	@Test
	public void testCalcularSalarioBrutoConHorasExtra() {
		try {
			float salarioBruto = empleado.calculaSalarioBruto(tipoEmpleado, 1700, 5);
			empleado.calculaSalarioNeto(salarioBruto);
		} catch (Exception e) {
			Assert.assertEquals("Error al calcular el salario bruto.", e.getMessage());
		}
	}
}
