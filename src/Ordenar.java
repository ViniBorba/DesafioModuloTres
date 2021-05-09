
public class Ordenar {
	
	public int[] selectionSort(int[] array) throws IllegalArgumentException {
		if(array == null)
			throw new IllegalArgumentException(); 
		//int menor = array[0];
		int menor = 1;
		return selectionSort(array, 0, menor, 0);
	}
	private int[] selectionSort(int[] array, int percorreArray, int menor, int sairDaPilha) {
		if(sairDaPilha < array.length) {
			if(percorreArray < array.length && menor < array.length) {
				if(array[percorreArray] < array[menor]) {
					menor = percorreArray;
				}
				return selectionSort(array, percorreArray +1, menor, sairDaPilha);
			}
			int T = array[sairDaPilha];
			//array[sairDaPilha] = menor;
			//array[sairDaPilha] = T;
			//array[sairDaPilha] = menor;
			array[sairDaPilha] = array[menor];
			array[menor] =T;
			return selectionSort(array, sairDaPilha +1, sairDaPilha +1, sairDaPilha +1);
		}
		return array;
	}

}
