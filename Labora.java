import javax.swing.JOptionPane;

public class Labora {
//	Aplicación secuencial usando una sola clase sin
//	métodos.
	public static void main(String[] args) {
		
		String cadena;
		double ladoA;
		double ladoB;
		double resultado;
		
		cadena=JOptionPane.showInputDialog(null, "ingrese la longitud del lado A: ");
		ladoA=Double.parseDouble(cadena);
		
		cadena=JOptionPane.showInputDialog(null, "ingrese la longitud del lado B: ");
		ladoB=Double.parseDouble(cadena);
		
		resultado=ladoA*ladoB;
		JOptionPane.showInputDialog(null, "el resultado es:"+resultado);

	}

}
