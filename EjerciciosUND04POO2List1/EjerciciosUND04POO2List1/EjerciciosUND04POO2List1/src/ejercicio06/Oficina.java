package ejercicio06;

public class Oficina {

	private Cuenta[] cuentas;
	private int indiceCuentas;
	private double totalGastadoEnRegalos;
	
	
	public Oficina(int capacidad) {
		super();
		cuentas=new Cuenta[capacidad];
		this.indiceCuentas=0;
		this.totalGastadoEnRegalos=0.0;
	}
	
	public void agregarCuenta(Cuenta cuenta) {
        if (indiceCuentas < cuentas.length) {
            cuentas[indiceCuentas++] = cuenta;
        } else {
            System.out.println("No se pueden agregar más cuentas.");
        }
    }

    public double calcularSaldoTotal() {
        double total = 0.0;
        for (Cuenta cuenta : cuentas) {
            if (cuenta != null) {
                total += cuenta.getSaldo();
            }
        }
        return total;
    }

    public double calcularGananciasPorRetirosEmpresa() {
        double total = 0.0;
        for (Cuenta cuenta : cuentas) {
            if (cuenta instanceof CuentaEmpresa) {
                total += ((CuentaEmpresa) cuenta).getTotalCobradoPorRetiros();
            }
        }
        return total;
    }

    public double calcularTotalGastadoEnRegalos() {
        return totalGastadoEnRegalos;
    }

    public void registrarIngresoEnCuentaJoven(CuentaJoven cuenta, double cantidad) {
        cuenta.ingresar(cantidad);
        totalGastadoEnRegalos += 1.0;
    }

	public Cuenta[] getCuentas() {
		return cuentas;
	}

	public void setCuentas(Cuenta[] cuentas) {
		this.cuentas = cuentas;
	}

	public int getIndiceCuentas() {
		return indiceCuentas;
	}

	public void setIndiceCuentas(int indiceCuentas) {
		this.indiceCuentas = indiceCuentas;
	}

	public double getTotalGastadoEnRegalos() {
		return totalGastadoEnRegalos;
	}

	public void setTotalGastadoEnRegalos(double totalGastadoEnRegalos) {
		this.totalGastadoEnRegalos = totalGastadoEnRegalos;
	}
    
    
}
