package libroPaginaComposicion;

public class Test {

	public static void main(String[] args) {

		Libro libro1= new Libro("Un regalo diferente", 9788496388093L, "Marta Azcona", 2005);
		
		libro1.añadirPagina("El día de su cumpleaños, Marcel invitó a Tristán a merendar en su casa..."); 
		libro1.añadirPagina("Marcel abrió el regalo y ..."); 
		libro1.añadirPagina("Es un trozo de tela que me sobró de las cortinas..."); 
		libro1.añadirPagina("Marcel invitó a su amigo a té y pastelitos de nata"); 
		libro1.añadirPagina("Y como no querían ensuciarse...");
		
		
		
		Libro libro2= new Libro("Fray Perico y su borrico", 5748394051841L, "Marta Azcona", 2005);
		
		libro2.añadirPagina("prueba de otro libro"); 
		libro2.añadirPagina("agrego una segunda pagina..."); 
		libro2.añadirPagina("y la tercera aquí está"); 

		
		System.out.println(libro1);
		System.out.println("\n" + libro2);
	}

}
