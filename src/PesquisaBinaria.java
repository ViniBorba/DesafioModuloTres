
public class PesquisaBinaria {
	public int pesquisaBinaria(int[] array, int procurar) throws IllegalArgumentException{
		if(array == null)
			throw new IllegalArgumentException();
		
		int inferior = 0;
		int superior = array.length;
		
		return pesquisaBinaria(array, procurar, inferior, superior);
	}
	private int pesquisaBinaria(int[] array, int procurar, int inf, int sup) {
		if(inf <= sup) {
			int med = (inf + sup) /2;
			if(array[med] == procurar) {
				return med;
			} else if(procurar < array[med]) {
				return pesquisaBinaria(array, procurar, inf, med -1);
			} else {
				return pesquisaBinaria(array, procurar, med +1, sup);
			}
		}
		return -1;
	}


}
