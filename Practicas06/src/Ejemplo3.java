import java.util.ArrayDeque;
import java.util.Queue;

public class Ejemplo3 {

	public static void main(String[] args) {

		Queue<String> meses = new ArrayDeque<>();

		meses.add("Enero");
		meses.add("Febrero");
		meses.add("Marzo");
		meses.add("Abril");
		meses.add("Mayo");
		meses.add("Junio");
		meses.offer("Julio");
		meses.offer("Agosto");
		meses.offer("Septiembre");
		meses.offer("Octubre");
		meses.offer("Noviembre");
		meses.offer("Diciembre");

		while (!meses.isEmpty()) {
			System.out.println(meses.remove());
		}		
	}
}