package employees;

public class Vendedor extends Empleado {

	private double porceComision;
	private int totalVentas;
	
	public Vendedor() {
		
		super();
		
		porceComision = 0;
		totalVentas = 0;
		
	}
	
	public void setDni(String dni) {
		
		this.dni = dni;
		
	}
	
	public void setNombre(String nombre) {
		
		this.nombre = nombre;
		
	}
	
	public void setApellido(String apellido) {
		
		this.apellido = apellido;
		
	}
	
	public void setEmail(String email) {
		
		this.email = email;
		
	}
	
	public void setSueldoBase(double sueldoBase) {
		
		this.sueldoBase = sueldoBase;
		
	}
	
	public void setPorcenComision(double porcenComision) {
		
		this.porceComision = porcenComision;
		
	}
	
	public void setTotalVentas(int totalVentas) {
		
		this.totalVentas = totalVentas;
		
	}
	
	public double getSueldo() {
		
		double sueldo = sueldoBase + (porceComision * totalVentas / 100);
		
		return sueldo;
		
	}

}
