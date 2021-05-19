
public class SumaArray {
	
	private int array [] = null;
	
	
	public SumaArray(int[] array) {
		this.array = array;
	}


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