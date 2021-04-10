package application;

import employees.*;

public class Menu {

	private String title;
	private String description;
	private Input input;
	
	public Menu() {
	
		title = null;
		description = null;
		input = new Input();
	
	}
	
	private void setTitle(String title) {
		
		this.title = title;
		
	}
	
	private void setDescription(String description) {
		
		this.description = description;
		
	}
	
	private void showTitle() {
		
		setTitle("PANIC CORP\n\n");
		
		System.out.println(title);
		
	}
	
	private void showDescription() {
		
		setDescription("Nos encargamos que todos entren en pánico :P\n");
		
		System.out.println(description);
		
	}

	public void display() {
		
		int option, MAX_EMPLEADOS = 20;
		Empleado[] empleados = new Empleado[MAX_EMPLEADOS];
		
		do {
	
			showTitle();
			showDescription();
			
			option = input.setInputInt("(Panic Corp)> ");
			
			if (option == 1) {
				
				loadEmployees(empleados, MAX_EMPLEADOS);
				
			} else if (option == 2) {
				
				listEmployees(empleados, MAX_EMPLEADOS);
				
			} else if (option != 3){
				
				System.out.println("Opción incorrecta...");
				
			}
			
		} while (option != 3);

		input.close();

	}

	private int getEmployee() {
		
		int type;
		
		do {
			
			System.out.println("\n\nTipo de empleado: \n1) Administrativo\n2) Vendedor\n\n");
			type = input.setInputInt("(Panic Corp/loadEmployees)> ");
			
			if (type != 1 && type != 2) {
				
				System.out.println("\n\n[x] No existe ese tipo de empleado :(\n\n");
				
			}
			
			
		} while(type != 1 && type != 2);
		
		return type;
		
	}
	
	private String setOption() {
		
		String option;
		
		do {
			
			option = (input.setInputString("Desea agregar otro empleado? (yes/no): ")).toLowerCase();
			
		} while(!option.equals("yes") && !option.equals("no"));
		
		return option;
		
	}
	
	private void loadEmployees(Empleado[] empleados, int MAX_EMPLEADOS) {
		
		// Datos generales
		int tipoEmpleado, n_empleado = 0;
		String option;
		
		// Datos de empleados
		int horas, totalVentas;
		String dni, nombre, apellido, email;
		double sueldo, porcentaje;
		
		do {
			
			tipoEmpleado = getEmployee();
			
			dni = input.setInputString("DNI: ");
			nombre = input.setInputString("Nombre: ");
			apellido = input.setInputString("Apellido: ");
			email = input.setInputString("email: ");
			sueldo = input.setInputDouble("Sueldo Base: ");
			
			if (tipoEmpleado == 1) {
				
				Administrativo empleado = new Administrativo();
				empleado.setDni(dni);
				empleado.setNombre(nombre);
				empleado.setApellido(apellido);
				empleado.setEmail(email);
				empleado.setSueldoBase(sueldo);
				
				horas = input.setInputInt("Horas extra: ");
				empleado.setHsExtra(horas);
				
				horas = input.setInputInt("Horas mes: ");
				empleado.setHsMes(horas);
				
				empleados[n_empleado] = empleado; 
				
			} else {
				
				Vendedor empleado = new Vendedor();
				empleado.setDni(dni);
				empleado.setNombre(nombre);
				empleado.setApellido(apellido);
				empleado.setEmail(email);
				empleado.setSueldoBase(sueldo);
				
				porcentaje = input.setInputInt("Porcentaje comisión: ");
				empleado.setPorcenComision(porcentaje);
				
				totalVentas = input.setInputInt("Total ventas: ");
				empleado.setTotalVentas(totalVentas);
			
				empleados[n_empleado] = empleado; 
				
			}
			
			n_empleado++;
			
			option = setOption();
			
			
		} while(!option.equals("no") && n_empleado < MAX_EMPLEADOS);
		
	}
	
	private void listEmployees(Empleado[] empleados, int MAX_EMPLEADOS) {
		
		int i;
		
		/*for (i = 0; i < MAX_EMPLEADOS; i++) {
				
				if (empleados[i] instanceof Administrativo) {
					
					Administrativo empleado = (Administrativo)empleados[i];
				
					System.out.println("Nombre: " + empleado.getNombre());
					System.out.println("Apellido: " + empleado.getApellido());
					System.out.println("DNI: " + empleado.getDni());
					System.out.println("Sueldo: " + empleado.getSueldo());
					
				} else if (empleados[i] instanceof Vendedor) {
					
					Vendedor empleado = (Vendedor)empleados[i];
					
					System.out.println("Nombre: " + empleado.getNombre());
					System.out.println("Apellido: " + empleado.getApellido());
					System.out.println("DNI: " + empleado.getDni());
					System.out.println("Sueldo: " + empleado.getSueldo());
					
				}
				
			
		}*/
		
		for (Empleado empleado: empleados) {
			
			try {
			
				System.out.println("Nombre: " + empleado.getNombre());
				System.out.println("Apellido: " + empleado.getApellido());
				System.out.println("DNI: " + empleado.getDni());
				System.out.println("Sueldo: " + empleado.getSueldo());
				
			} catch(Exception e) {}
			
		}
		
	}


}
