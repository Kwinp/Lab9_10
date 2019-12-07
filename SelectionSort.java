public class SelectionSort {
	 private int temp;

	/** Creates a new instance of SelectionSort */
    public SelectionSort() {
    }
    
    /* A simple SelectionSort algorithm
     * pre-condition: 
     * post-condition:
     * inputs:
     * outputs:
     * special conditions:
     */  
    
	public int[] basicSelectionSort(int[] x) {
		for (int i = 0; i < x.length; ++i) {
			int minLoc = i;
			for (int j= i+1; j < x.length; ++j) 
				if(x[j] < x[minLoc]) 
					minLoc = j;

			int temp = x[minLoc];
			x[minLoc] = x[i];
			x[i] = temp;
		}

		return x;
	}// end of basicSelectionSort method
}





