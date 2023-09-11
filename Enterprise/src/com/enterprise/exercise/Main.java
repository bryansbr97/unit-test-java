package com.enterprise.exercise;

public class Main {

	public static void main(String[] args) throws Exception {
		float salarioBruto, salarioNeto;
		EmpleadoBR empleado = new EmpleadoBR();
//		TipoEmpleado tipoEmpleado = new TipoEmpleado("Vendedor");
//		TipoEmpleado tipoEmpleado = new TipoEmpleado("Encargado");
		TipoEmpleado tipoEmpleado = new TipoEmpleado("Boss");
		
		// Sin horas extra
//		salarioBruto = empleado.calculaSalarioBruto(null, 1000, 0);
//		salarioBruto = empleado.calculaSalarioBruto(tipoEmpleado, -1000, 0);
//		salarioBruto = empleado.calculaSalarioBruto(tipoEmpleado, 1000, -1);
//		salarioBruto = empleado.calculaSalarioBruto(tipoEmpleado, -1000, -1);
		salarioBruto = empleado.calculaSalarioBruto(tipoEmpleado, 0, 0);
//		salarioBruto = empleado.calculaSalarioBruto(tipoEmpleado, 999, 0);
//		salarioBruto = empleado.calculaSalarioBruto(tipoEmpleado, 1000, 0);
//		salarioBruto = empleado.calculaSalarioBruto(tipoEmpleado, 1001, 0);
//		salarioBruto = empleado.calculaSalarioBruto(tipoEmpleado, 1500, 0);
//		salarioBruto = empleado.calculaSalarioBruto(tipoEmpleado, 1501, 0);
		
		// Con horas extra
//		salarioBruto = empleado.calculaSalarioBruto(null, 1000, 5);
//		salarioBruto = empleado.calculaSalarioBruto(tipoEmpleado, -1000, 5);
//		salarioBruto = empleado.calculaSalarioBruto(tipoEmpleado, 1000, -5);
//		salarioBruto = empleado.calculaSalarioBruto(tipoEmpleado, -1000, -5);
//		salarioBruto = empleado.calculaSalarioBruto(tipoEmpleado, 0, 5);
//		salarioBruto = empleado.calculaSalarioBruto(tipoEmpleado, 999, 5);
//		salarioBruto = empleado.calculaSalarioBruto(tipoEmpleado, 1000, 5);
//		salarioBruto = empleado.calculaSalarioBruto(tipoEmpleado, 1001, 5);
//		salarioBruto = empleado.calculaSalarioBruto(tipoEmpleado, 1500, 5);
//		salarioBruto = empleado.calculaSalarioBruto(tipoEmpleado, 1501, 5);
		
		salarioNeto = empleado.calculaSalarioNeto(salarioBruto);
//		
		System.out.println(salarioNeto);
//		System.out.println("El salario bruto del empleado es de: " + salarioBruto + " euros.");
//		System.out.println("El salario neto del empleado es de: " + salarioNeto + " euros.");
	}
}
