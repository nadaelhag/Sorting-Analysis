package assignment;

  public class sorting {
	  //declare counters 
	  public static int comparisons;
	  public static int swaps;
	  public static int reheaps;
	  public static int merges;
	  public static void reset() {
		  //reset counter in Driver because variables are static 
		  comparisons = 0;
		  swaps=0;
		  reheaps=0;
		  merges=0;
	  }
	public static void main(String[] args) {
	  }
	  
    //Swap method 
    public  static void swap(Car[] array, int i, int j) {
        Car temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    //Bubble Sort
    public static void bubbleSort(Car[] cars) {
    	//Initialize comparisons and swaps 
    	comparisons =0;
    	swaps = 0;
        int n = cars.length;
        //set true in for loop
        boolean swapped = false;

        for (int last = n-1; (last>=1)&&(!swapped); last--) {
        	swapped = true;
            for (int j = 0; j<last; j++) {
                comparisons++;
                //compare names
                if (cars[j].name.compareTo(cars[j + 1].name) > 0) {
                	swaps++;
                	swap(cars, j, j + 1);
                    swapped = false; }
                //decrement
                //bubble sort from last index to first
            }
        }
    }

    //Quick Sort
    public static void quickSort(Car[] cars, int F, int L) {
    	int lastS1;
        comparisons++;
        //if not less than then no more conquering
        if (F < L) {
            lastS1 = F;
            //for conquer
            for (int FU = F + 1; FU <= L; FU++) {
                comparisons++;
                //compare names 
                if (cars[FU].name.compareTo(cars[F].name) < 0) {
                    lastS1++;
                    comparisons++;
                    if (FU != lastS1) {
                        swap(cars, FU, lastS1);
                        swaps++;
                    }
                }
            }
            comparisons++;
            if (F != lastS1) {
                swap(cars, F, lastS1);
                swaps++;
            }
            //for dividing array 
            comparisons++;
            if (F < (lastS1 - 1)) {
            	//before pivot
                quickSort(cars, F, lastS1 - 1);
            }
            comparisons++;
            if ((lastS1 + 1) < L)
            	//after pivot
                quickSort(cars, lastS1 + 1, L);
        }

    }

    //Merge Sort
    public static void mergeSort(Car[] cars, int first, int last) {
    	comparisons++;
        if (first < last) {
        	//middle index
            int middle = (first + last) / 2;
            //sort left and right arrays
            mergeSort(cars, first, middle);
            mergeSort(cars, middle + 1, last);
            merges++;
            //merge
            merge(cars, first, middle, middle + 1, last);
        }
    }
    
    public static void merge(Car[] cars, int lF, int lL, int rF, int rL) {
    	//temp array
        Car[] temp = new Car[cars.length];
        int index = lF;
        int saveFirst = lF;

        //merging sub arrays
        while (lF <= lL && rF <= rL) {
        	comparisons++;
            if (cars[lF].name.compareTo(cars[rF].name) < 0)
                temp[index++] = cars[lF++];
            else
                temp[index++] = cars[rF++];
        }

        //copy from left sub array
        while (lF <= lL) {
            temp[index++] = cars[lF++];
        }

        //copy from right sub array
        while (rF <= rL) {
            temp[index++] = cars[rF++];
        }
        //save temp to cars
        for(index = saveFirst; index <= rL; index++) 
			cars[index] = temp[index];
    }
    
    //Heap Sort
    public static void reheapDown(Car[] cars, int root, int bottom) {
    	//right and left child index
        int maxChild;
        int leftChild = root * 2 + 1;
        int rightChild = root * 2 + 2;
        comparisons++;
        if (leftChild <= bottom) {
            comparisons++;
            //left child is max
            if (leftChild == bottom) {
                maxChild = leftChild;
            } else {
                comparisons++;
                //compare children for max child 
                if (cars[leftChild].name.compareTo(cars[rightChild].name) <= 0) {
                    maxChild = rightChild;
                } else {
                    maxChild = leftChild;
                }
            }
            comparisons++;
            //compare root with max child 
            if (cars[root].name.compareTo(cars[maxChild].name) < 0) {
                swaps++;
                //swap root and max child 
                swap(cars, root, maxChild);
                reheaps++;
                //reheap
                reheapDown(cars, maxChild, bottom);
            }
        }
    }

    
    public static void heapSort(Car[] cars, int num) {
    	//start from last non leaf node 
        for (int index = num / 2 - 1; index >= 0; index--)
            reheapDown(cars, index, num - 1);
        for (int index = num - 1; index >= 1; index--) {
            swaps++;
            //swap root with last element 
            swap(cars, 0, index);
            //reheap again
            reheapDown(cars, 0, index - 1);
        }
    }


}
