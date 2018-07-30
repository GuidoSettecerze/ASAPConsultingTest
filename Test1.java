import java.util.ArrayList;
import java.util.List;



public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int testCases = 2;
		
		int cantLineas = 4;
		
		int cantOperaciones = 5;
		
		
		for(int l=0;l<testCases;l++){
			int matriz3D [][][]= new int [cantLineas] [cantLineas] [cantLineas]; 
			
			//Inicializo la matriz 3d con 0
			for(int j=0;j<cantLineas;j++){
				matriz3D[j][j][j] = 0;
			}

			List<String> testCase1 = new ArrayList<String>();
			
			testCase1.add("UPDATE 2 2 2 4");
			testCase1.add("QUERY 1 1 1 3 3 3");
			testCase1.add("UPDATE 1 1 1 23");
			testCase1.add("QUERY 2 2 2 4 4 4");
			testCase1.add("QUERY 1 1 1 3 3 3");
			
			
			for(int i=0;i<testCase1.size();i++){
				
				String argumento = testCase1.get(i);
				
				if(argumento.startsWith("UPDATE")){
					String[] argSep = argumento.split(" ");
					int coordenadaX = Integer.parseInt(argSep[1]);
					int coordenadaY = Integer.parseInt(argSep[2]);
					int coordenadaZ = Integer.parseInt(argSep[3]);
					int valor = Integer.parseInt(argSep[4]);
					matriz3D[coordenadaX][coordenadaY][coordenadaZ] = valor;
				}
				
				if(argumento.startsWith("QUERY")){
					int valorTotalQuery = 0;
					String[] argSep = argumento.split(" ");
					int coordenadaX1 = Integer.parseInt(argSep[1]);
					int coordenadaX2 = Integer.parseInt(argSep[4]);
					
					for(int k=coordenadaX1;k<coordenadaX2;k++){
						valorTotalQuery+=matriz3D[k][k][k];
					}
					
					System.out.println(valorTotalQuery);				
				}
				
			}

		}
		
		
		
	}

}
