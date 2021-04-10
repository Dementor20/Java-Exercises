package employees;

public class Administrativo extends Empleado {
	
	private int hsExtra;
	private int hsMes;
	
	public Administrativo() {
		
		super();
		
		hsExtra = 0;
		hsMes = 0;
		
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
	
	public void setHsExtra(int hsExtra) {
		
		this.hsExtra = hsExtra;
		
	}
	
	public void setHsMes(int hsMes) {
		
		this.hsMes = hsMes;
		
	}
	
	public double getSueldo() {
		
		double sueldo = sueldoBase * ((hsExtra * 1.5) + hsMes) / hsMes;
		
		return sueldo;
		
	}

}
