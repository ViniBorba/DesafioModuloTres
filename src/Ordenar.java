
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
			array[sairDaPilha] = array[menor];
			array[menor] =T;
			return selectionSort(array, sairDaPilha +1, sairDaPilha +1, sairDaPilha +1);
		}
		return array;
	}
	
	public int[] insertionSort(int[] array) throws IllegalArgumentException{
		if(array == null)
			throw new IllegalArgumentException();
		int B =0;
		return insertionSort(array, 0, B, 0);
		
	}
	private int[] insertionSort(int[] array, int elemento, int B, int contador) {
		if(contador < array.length) {
			if((elemento >0) && (array[elemento -1] > B)) {
				array[elemento] = array[elemento -1];
				return insertionSort(array, elemento -1, B, contador);
			} else {
				array[elemento] = B;
				return insertionSort(array, contador, array[contador], contador +1);
			}
		}
		return array;
	}

}
