package ejercicio06;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Oficina oficina = new Oficina(10);

        CuentaCorriente cc1 = new CuentaCorriente("Juan", 500,20,5);
        CuentaJoven cj1 = new CuentaJoven("María", 300);
        CuentaEmpresa ce1 = new CuentaEmpresa("Empresa A", 1000,15,4);

        oficina.agregarCuenta(cc1);
        oficina.agregarCuenta(cj1);
        oficina.agregarCuenta(ce1);

        // Operaciones
        cc1.ingresar(200);
        cc1.retirar(100);
        cj1.ingresar(50); // Regala 1€
        ce1.retirar(500); // Cobra 1€

        oficina.registrarIngresoEnCuentaJoven(cj1, 50); // Otra operación con regalo

        // Resultados
        System.out.println("Saldo total en la oficina: " + oficina.calcularSaldoTotal());
        System.out.println("Ganancias por retiros de cuentas empresa: " + oficina.calcularGananciasPorRetirosEmpresa());
        System.out.println("Total gastado en regalos por cuenta joven: " + oficina.calcularTotalGastadoEnRegalos());	
		
	}

}
