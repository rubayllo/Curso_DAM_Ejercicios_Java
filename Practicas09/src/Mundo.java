
public class Mundo {

	public static void main(String[] args) {

		Humano mario = new Humano("Mario", 23, 65.50f, 170.82f);
		Humano maria = new Humano("Maria", 23, 45.50f, 155.34f);
		
		System.out.println(mario.toString());
		System.out.println(maria.toString());
		
		maria.cumplirAnos();
		mario.cambiarPeso(63f);
		maria.cambiarEstatura(156.56f);
		
		System.out.println();
		System.out.println(mario.toString());
		System.out.println(maria);
				
	}

}
