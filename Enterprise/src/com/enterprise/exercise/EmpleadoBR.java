package com.enterprise.exercise;

public class EmpleadoBR {
	private static final float SALARIO_BASE_VENDEDOR = 1000f;
	private static final float SALARIO_BASE_ENCARGADO = 1500f;
	private static final float VALOR_HORA_EXTRA = 20f;
    private static final float BONUS_1 = 100f;
    private static final float BONUS_2 = 200f;
    private static final float IMPUESTO_1 = 0.16f;
    private static final float IMPUESTO_2 = 0.18f;
	private float salarioBruto;
	private float salarioNeto;
	
	public float calculaSalarioBruto(TipoEmpleado tipoEmpleado, float ventasMes, float horasExtra) throws Exception {
		if (tipoEmpleado == null || ventasMes < 0 || horasExtra < 0) {
			throw new Exception("BRException");
		}
		try {
			switch (tipoEmpleado.getTipo()) {
			case "Vendedor":
				salarioBruto = SALARIO_BASE_VENDEDOR + (VALOR_HORA_EXTRA * horasExtra);
				if (ventasMes >= 1000f && ventasMes < 1500f) {
					salarioBruto+= BONUS_1;
				} else if (ventasMes >= 1500f) {
					salarioBruto+= BONUS_2;
				}
				break;
			case "Encargado":
				salarioBruto = SALARIO_BASE_ENCARGADO + (VALOR_HORA_EXTRA * horasExtra);
				if (ventasMes >= 1000f && ventasMes < 1500f) {
					salarioBruto+= BONUS_1;
				} else if (ventasMes >= 1500f) {
					salarioBruto+= BONUS_2;
				}
				break;
            default:
                throw new Exception("Tipo de empleado no válido.");
			}
		} catch (Exception e) {
			throw new Exception("Error al calcular el salario bruto.", e);
		}
		return salarioBruto;
	}
	
	public float calculaSalarioNeto(float salarioBruto) throws Exception {
        if (salarioBruto < 0) {
            throw new Exception("El salario bruto no puede ser negativo.");
        }
		if (salarioBruto >= 1000f && salarioNeto < 1500f) {
			salarioNeto = salarioBruto * (1 - IMPUESTO_1);
		} else if (salarioBruto >= 1500f) {
			salarioNeto = salarioBruto * (1 - IMPUESTO_2);
		}
		return salarioNeto;
	}
}
