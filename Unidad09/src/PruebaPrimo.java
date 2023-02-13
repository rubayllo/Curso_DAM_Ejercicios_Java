
public class PruebaPrimo {

	public static void main(String[] args) {

		Primo x = new Primo(1);
		
		if(x.esPrimo()) {
			System.out.println("ES PRIMO " + x.getValue());
		}

		x.setValue(5);		
		if(x.esPrimo()) {
			System.out.println("ES PRIMO " + x.getValue());
		}
		
		x.setValue(8);			
		if(x.esPrimo()) {
			System.out.println("ES PRIMO " + x.getValue());
		}
		
		x.setValue(11);			
		if(x.esPrimo()) {
			System.out.println("ES PRIMO " + x.getValue());
		}
	
	}
}
