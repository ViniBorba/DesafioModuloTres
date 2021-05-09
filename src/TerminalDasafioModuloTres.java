
public class TerminalDasafioModuloTres {

	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5, 6};
		
		PesquisaBinaria pb = new PesquisaBinaria();
		System.out.println(pb.pesquisaBinaria(array, 6));
		
		
		int[] arrayDes = {3, 2, 10, 7, 8, 4};
		
		Ordenar ordem = new Ordenar();
		
		System.out.println(ordem.selectionSort(arrayDes));
		for(int i =0; i < arrayDes.length; i++) {
			System.out.print(" "+arrayDes[i]);
		}
	}
}
