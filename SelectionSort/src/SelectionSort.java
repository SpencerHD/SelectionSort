public class SelectionSort {
	
	public static void main(String[] args) {
		
		int[] array = new int[]{-3,5,1,0,-57};
		
        for (int i = 0; i < array.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < array.length; j++)
                if (array[j] < array[index]) {
                    index = j;
                }
            
            	int smaller = array[index];  
            	array[index] = array[i];
            	array[i] = smaller;
        }
        
        for (int i = 0; i < array.length; i++) {
        	System.out.print(array[i] + " ");
        }
	}
}