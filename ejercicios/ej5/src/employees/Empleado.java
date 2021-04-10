package employees;

public abstract class Empleado {
	
	protected String dni;
	protected String nombre;
	protected String apellido;
	protected String email;
	protected double sueldoBase;
	
	public Empleado() {
		
		dni = null;
		nombre = null;
		apellido = null;
		email = null;
		sueldoBase = 0;
		
	}
	
	public abstract void setDni(String dni);
	
	public abstract void setNombre(String nombre);
	
	public abstract void setApellido(String apellido);
	
	public abstract void setEmail(String email);
	
	public abstract void setSueldoBase(double sueldoBase);
	
	public abstract double getSueldo();
	
	public String getDni() {
		
		return dni;
		
	}
	
	public String getNombre() {
		
		return nombre;
		
	}
	
	public String getApellido() {
		
		return apellido;
		
	}
	
	public String getEmail() {
		
		return email;
		
	}


}
