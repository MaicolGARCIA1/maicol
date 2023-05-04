	import javax.swing.JOptionPane;



	public class Actividad {
		String nombres[];
		int edades[];
		public void procedimiento() {
			String menu = "Estas son las diferentes opciones que tiene \n";
			menu+="1. Llenar estudiantes \n";
			menu+="2. ver promedio de edades \n";
			menu+="3. ver estudiantes con mayor y menor edad \n";
			menu+="4. ver estudiantes mayores de edad y menores de edad \n";
			menu+="5. Mostrar estudiantes \n";
			menu+="6. Buscar Estudiante\n";
			menu+="7. Salir \n";
			menu+="seleccione alguna opcion";
			int select;
			String nombreOEdad;
			do {
				select = Integer.parseInt(JOptionPane.showInputDialog(menu));
				switch (select) {
				case 1:
					Llenar();
					break;
				case 2:
					if (comprobar(nombres))
						promediarEdades();
					break;
				case 3:
					if (comprobar(nombres))
						Mayor_Menor(edades);
					break;
				case 4:
					if (comprobar(nombres))
					Mayor_de_Edad(nombres);
					break;
				case 5:
					if (comprobar(nombres))
					Ver(nombres);
					break;
				
				case 6:
					if (comprobar(nombres)) {
						nombreOEdad = JOptionPane.showInputDialog("Â¿desea buscar por nombre o por edad?");
								if (nombreOEdad.equalsIgnoreCase("edad")) 
									BuscarEdad(nombres);
								else if (nombreOEdad.equalsIgnoreCase("nombre"))						
									Buscar_nombre(nombres);
								else 
									System.out.println("ingrese algo valido");
						}
					break;
				case 7: 
					System.out.println("Gracias por usarme");
					break;
				default:
					System.out.println("ingrese una opcion de menu valida");
					break;
				}
			} while (select!=7);
			
		}
		private void Buscar_nombre(String[] nombres2) {
			// TODO Auto-generated method stub
			
		}
		private void BuscarEdad(String[] nombres2) {
			// TODO Auto-generated method stub
			
		}
		private void Mayor_de_Edad(String[] nombres2) {
			// TODO Auto-generated method stub
			
		}
		private void Mayor_Menor(int[] edades2) {
			// TODO Auto-generated method stub
			
		}
		private void Ver(String[] nombres2) {
			// TODO Auto-generated method stub
			
		}
		private void promediarEdades() {
			// TODO Auto-generated method stub
			
		}
		private boolean comprobar(String[] nombres2) {
			// TODO Auto-generated method stub
			return false;
		}
		private void Llenar() {
			// TODO Auto-generated method stub
			
		}
	}
		
		

		