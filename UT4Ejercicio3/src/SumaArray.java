/**
 * 
 * @author Patricio
 *
 */
public class SumaArray {
	/**
	 * Clase para sumar los numeros de un array terminados en 1
	 */
	private int array [] = null;
	
	/**
	 * 
	 * @param array constructor
	 */
	public SumaArray(int[] array) {
		this.array = array;
	}


	/**
	 * 
	 * @return metodo suma
	 */
	public String suma(){
		
		String resultado="";
		
		if(array != null){
			if(array.length!=0){
				int suma=0;
				for(int i=0;i<array.length;i++){
					if((array[i] % 10 == 1)){
						suma = suma + array[i];
					}
				}
				resultado="La suma de los numeros acabados en 1 es: "+suma;
			}else{
				resultado="El array esta vacio";
			}
		}else{
			resultado="El array esta inicializado a null";
		}

		return resultado;
	}
	

}