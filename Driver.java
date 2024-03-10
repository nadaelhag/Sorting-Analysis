package assignment;
public class Driver {
	public static void main(String[] args) {
		Car [] car1 = new Car[250];
        Car [] car2 = new Car[500];
        Car [] car3 = new Car[750];
        Car [] car4 = new Car[1000];
        
        //creating and writing to formatted_cars
        Cars.readCars(car4);
        Cars.writeCars(car4, "formatted_cars.txt");
        
        System.out.println();
        System.out.println("FOR UNSORTED ARRAYS");
        System.out.println();
        
        //250 elements for bubble sort
        Cars.readCars(car1); 
        
        long time0 = System.nanoTime();
        sorting.bubbleSort(car1); 
        long time1 = System.nanoTime();
        double t0 = (time1 - time0) / 1000000.0;
        
        
        System.out.println("Bubble Sort for 250 elements, Comparisons: " + sorting.comparisons + ", Swaps: " + sorting.swaps);
        System.out.println("Time taken: " + t0 + " ms");
        System.out.println("-----------------------------------------------------------------------------");
        sorting.reset();
        
        //500 elements for bubble sort
        Cars.readCars(car2);
        
        long time2 = System.nanoTime();
        sorting.bubbleSort(car2);
        long time3 = System.nanoTime();
        double t1 = (time3 - time2) / 1000000.0;
        
        System.out.println("Bubble Sort for 500 elements, Comparisons: " + sorting.comparisons + ", Swaps: " + sorting.swaps);
        System.out.println("Time taken: " + t1 + " ms");
        System.out.println("-----------------------------------------------------------------------------");
        sorting.reset();
        
        //750 elements for short bubble
        Cars.readCars(car3); 
        
        long time4 = System.nanoTime();
        sorting.bubbleSort(car3);
        long time5 = System.nanoTime();
        double t2 = (time5 - time4) / 1000000.0;
        
        System.out.println("Bubble Sort for 750 elements, Comparisons: " + sorting.comparisons + ", Swaps: " + sorting.swaps);
        System.out.println("Time taken: " + t2 + " ms");
        System.out.println("-----------------------------------------------------------------------------");
        sorting.reset();
        
        //1000 elements for short bubble
        Cars.readCars(car4);         
        
        long time6 = System.nanoTime();
        sorting.bubbleSort(car4);
        Cars.writeCars(car4, "bsorted.txt");
        long time7 = System.nanoTime();
        double t3 = (time7 - time6) / 1000000.0;
        
        System.out.println("Bubble Sort for 1000 elements, Comparisons: " + sorting.comparisons + ", Swaps: " + sorting.swaps);
        System.out.println("Time taken: " + t3 + " ms");
        System.out.println("-----------------------------------------------------------------------------");
        sorting.reset();

        //250 elements for quick sort
        Cars.readCars(car1); 
        
        long time8 = System.nanoTime();
        sorting.quickSort(car1, 0, car1.length-1); 
        long time9 = System.nanoTime();
        double t4 = (time9 - time8) / 1000000.0;
        
        
        System.out.println("Quick Sort for 250 elements, Comparisons: " + sorting.comparisons + ", Swaps: " + sorting.swaps);
        System.out.println("Time taken: " + t4 + " ms");
        System.out.println("-----------------------------------------------------------------------------");
        sorting.reset();
        
        //500 elements for quick sort
        Cars.readCars(car2); 
        
        long time10 = System.nanoTime();
        sorting.quickSort(car2, 0, car2.length-1); 
        long time11 = System.nanoTime();
        double t5 = (time11 - time10) / 1000000.0;
        
        
        System.out.println("Quick Sort for 500 elements, Comparisons: " + sorting.comparisons + ", Swaps: " + sorting.swaps);
        System.out.println("Time taken: " + t5 + " ms");
        System.out.println("-----------------------------------------------------------------------------");
        sorting.reset();
        
        
        //750 elements for quick sort
        Cars.readCars(car3); 
        
        long time12 = System.nanoTime();
        sorting.quickSort(car3, 0, car3.length-1); 
        long time13 = System.nanoTime();
        double t6 = (time13 - time12) / 1000000.0;
        
        
        System.out.println("Quick Sort for 750 elements, Comparisons: " + sorting.comparisons + ", Swaps: " + sorting.swaps);
        System.out.println("Time taken: " + t6 + " ms");
        System.out.println("-----------------------------------------------------------------------------");
        sorting.reset();
        
        
        //1000 elements for quick sort
        Cars.readCars(car4); 
        
        long time14 = System.nanoTime();
        sorting.quickSort(car4, 0, car4.length-1);
        Cars.writeCars(car4, "qsorted");
        long time15 = System.nanoTime();
        double t7 = (time15 - time14) / 1000000.0;
        
        
        System.out.println("Quick Sort for 1000 elements, Comparisons: " + sorting.comparisons + ", Swaps: " + sorting.swaps);
        System.out.println("Time taken: " + t7 + " ms");
        System.out.println("-----------------------------------------------------------------------------");
        sorting.reset();
        
        
        //250 elements for heap sort
        Cars.readCars(car1); 
        
        long time16 = System.nanoTime();
        sorting.heapSort(car1, car1.length); 
        long time17 = System.nanoTime();
        double t8 = (time17 - time16) / 1000000.0;
        
        
        System.out.println("Heap Sort for 250 elements, Comparisons: " + sorting.comparisons + ", Swaps: " + sorting.swaps+", Reheap downs: "+sorting.reheaps);
        System.out.println("Time taken: " + t8 + " ms");
        System.out.println("-----------------------------------------------------------------------------");
        sorting.reset();
        
        //500 elements for heap sort
        Cars.readCars(car2); 
        
        long time18 = System.nanoTime();
        sorting.heapSort(car2, car2.length); 
        long time19 = System.nanoTime();
        double t9 = (time19 - time18) / 1000000.0;
        
        
        System.out.println("Heap Sort for 500 elements, Comparisons: " + sorting.comparisons + ", Swaps: " + sorting.swaps+", Reheap downs: "+sorting.reheaps);
        System.out.println("Time taken: " + t9 + " ms");
        System.out.println("-----------------------------------------------------------------------------");
        sorting.reset();

        //750 elements for heap sort
        Cars.readCars(car3); 
        
        long time20 = System.nanoTime();
        sorting.heapSort(car3, car3.length); 
        long time21 = System.nanoTime();
        double t10 = (time21 - time20) / 1000000.0;
        
        
        System.out.println("Heap Sort for 750 elements, Comparisons: " + sorting.comparisons + ", Swaps: " + sorting.swaps+", Reheap downs: "+sorting.reheaps);
        System.out.println("Time taken: " + t10 + " ms");
        System.out.println("-----------------------------------------------------------------------------");
        sorting.reset();

        //1000 elements for heap sort
        Cars.readCars(car4); 
        
        long time22 = System.nanoTime();
        sorting.heapSort(car4, car4.length); 
        Cars.writeCars(car4, "hsorted.txt");
        long time23 = System.nanoTime();
        double t11 = (time23 - time22) / 1000000.0;
        
        
        System.out.println("Heap Sort for 1000 elements, Comparisons: " + sorting.comparisons + ", Swaps: " + sorting.swaps+", Reheap downs: "+sorting.reheaps);
        System.out.println("Time taken: " + t11 + " ms");
        System.out.println("-----------------------------------------------------------------------------");
        sorting.reset();
        
        
        //250 elements for merge sort
        Cars.readCars(car1); 
        
        long time24 = System.nanoTime();
        sorting.mergeSort(car1, 0, car1.length-1); 
        long time25 = System.nanoTime();
        double t12 = (time25 - time24) / 1000000.0;
        
        
        System.out.println("Merge Sort for 250 elements, Comparisons: " + sorting.comparisons + ", Swaps: " + sorting.swaps+", Merge calls: "+sorting.merges);
        System.out.println("Time taken: " + t12 + " ms");
        System.out.println("-----------------------------------------------------------------------------");
        sorting.reset();

        //500 elements for merge sort
        Cars.readCars(car2); 
        
        long time26 = System.nanoTime();
        sorting.mergeSort(car2, 0, car2.length-1); 
        long time27 = System.nanoTime();
        double t13 = (time27 - time26) / 1000000.0;
        
        System.out.println("Merge Sort for 500 elements, Comparisons: " + sorting.comparisons + ", Swaps: " + sorting.swaps+", Merge calls: "+sorting.merges);
        System.out.println("Time taken: " + t13 + " ms");
        System.out.println("-----------------------------------------------------------------------------");
        sorting.reset();

        //750 elements for merge sort
        Cars.readCars(car3); 
        
        long time28 = System.nanoTime();
        sorting.mergeSort(car3, 0, car3.length-1); 
        long time29 = System.nanoTime();
        double t14 = (time29 - time28) / 1000000.0;
        
        
        System.out.println("Merge Sort for 750 elements, Comparisons: " + sorting.comparisons + ", Swaps: " + sorting.swaps+", Merge calls: "+sorting.merges);
        System.out.println("Time taken: " + t14 + " ms");
        System.out.println("-----------------------------------------------------------------------------");
        sorting.reset();
        
        //1000 elements for merge sort
        Cars.readCars(car4); 
        
        long time30 = System.nanoTime();
        sorting.mergeSort(car4, 0, car4.length-1); 
        Cars.writeCars(car4, "msorted.txt");
        long time31 = System.nanoTime();
        double t15 = (time31 - time30) / 1000000.0;
        
        
        System.out.println("Merge Sort for 1000 elements, Comparisons: " + sorting.comparisons + ", Swaps: " + sorting.swaps+", Merge calls: "+sorting.merges);
        System.out.println("Time taken: " + t15 + " ms");
        System.out.println("-----------------------------------------------------------------------------");
        sorting.reset();
        
        System.out.println();
        System.out.println("FOR SORTED ARRAYS");
        System.out.println();
        
        //250 elements for bubble sort
        long time32 = System.nanoTime();
        sorting.bubbleSort(car1); 
        long time33 = System.nanoTime();
        double t16 = (time33 - time32) / 1000000.0;
        
        
        System.out.println("Bubble Sort for 250 elements, Comparisons: " + sorting.comparisons + ", Swaps: " + sorting.swaps);
        System.out.println("Time taken: " + t16 + " ms");
        System.out.println("-----------------------------------------------------------------------------");
        sorting.reset();
        
        //500 elements for bubble sort
        long time34 = System.nanoTime();
        sorting.bubbleSort(car2);
        long time35 = System.nanoTime();
        double t17 = (time35 - time34) / 1000000.0;
        
        System.out.println("Bubble Sort for 500 elements, Comparisons: " + sorting.comparisons + ", Swaps: " + sorting.swaps);
        System.out.println("Time taken: " + t17 + " ms");
        System.out.println("-----------------------------------------------------------------------------");
        sorting.reset();
        
        //750 elements for short bubble
        long time36 = System.nanoTime();
        sorting.bubbleSort(car3);
        long time37 = System.nanoTime();
        double t18 = (time37 - time36) / 1000000.0;
        
        System.out.println("Bubble Sort for 750 elements, Comparisons: " + sorting.comparisons + ", Swaps: " + sorting.swaps);
        System.out.println("Time taken: " + t18 + " ms");
        System.out.println("-----------------------------------------------------------------------------");
        sorting.reset();
        
        //1000 elements for short bubble     
        long time38 = System.nanoTime();
        sorting.bubbleSort(car4);
        long time39 = System.nanoTime();
        double t19 = (time39 - time38) / 1000000.0;
        
        System.out.println("Bubble Sort for 1000 elements, Comparisons: " + sorting.comparisons + ", Swaps: " + sorting.swaps);
        System.out.println("Time taken: " + t19 + " ms");
        System.out.println("-----------------------------------------------------------------------------");
        sorting.reset();

        
        //250 elements for quick sort
        long time40 = System.nanoTime();
        sorting.quickSort(car1, 0, car1.length-1); 
        long time41 = System.nanoTime();
        double t20 = (time41 - time40) / 1000000.0;
        
        
        System.out.println("Quick Sort for 250 elements, Comparisons: " + sorting.comparisons + ", Swaps: " + sorting.swaps);
        System.out.println("Time taken: " + t20 + " ms");
        System.out.println("-----------------------------------------------------------------------------");
        sorting.reset();
        
        //500 elements for quick sort
        long time42 = System.nanoTime();
        sorting.quickSort(car2, 0, car2.length-1); 
        long time43 = System.nanoTime();
        double t21 = (time43 - time42) / 1000000.0;
        
        
        System.out.println("Quick Sort for 500 elements, Comparisons: " + sorting.comparisons + ", Swaps: " + sorting.swaps);
        System.out.println("Time taken: " + t21 + " ms");
        System.out.println("-----------------------------------------------------------------------------");
        sorting.reset();
        
        
        //750 elements for quick sort
        long time44 = System.nanoTime();
        sorting.quickSort(car3, 0, car3.length-1); 
        long time45 = System.nanoTime();
        double t22 = (time45 - time44) / 1000000.0;
        
        
        System.out.println("Quick Sort for 750 elements, Comparisons: " + sorting.comparisons + ", Swaps: " + sorting.swaps);
        System.out.println("Time taken: " + t22 + " ms");
        System.out.println("-----------------------------------------------------------------------------");
        sorting.reset();
        
        
        //1000 elements for quick sort
        long time46 = System.nanoTime();
        sorting.quickSort(car4, 0, car4.length-1);
        long time47 = System.nanoTime();
        double t23 = (time47 - time46) / 1000000.0;
        
        
        System.out.println("Quick Sort for 1000 elements, Comparisons: " + sorting.comparisons + ", Swaps: " + sorting.swaps);
        System.out.println("Time taken: " + t23 + " ms");
        System.out.println("-----------------------------------------------------------------------------");
        sorting.reset();
        
         
        //250 elements for heap sort
        long time49 = System.nanoTime();
        sorting.heapSort(car1, car1.length); 
        long time50 = System.nanoTime();
        double t24 = (time50 - time49) / 1000000.0;
        
        
        System.out.println("Heap Sort for 250 elements, Comparisons: " + sorting.comparisons + ", Swaps: " + sorting.swaps+", Reheap downs: "+sorting.reheaps);
        System.out.println("Time taken: " + t24 + " ms");
        System.out.println("-----------------------------------------------------------------------------");
        sorting.reset();
        
        //500 elements for heap sort
        long time51 = System.nanoTime();
        sorting.heapSort(car2, car2.length); 
        long time52 = System.nanoTime();
        double t25 = (time52 - time51) / 1000000.0;
        
        
        System.out.println("Heap Sort for 500 elements, Comparisons: " + sorting.comparisons + ", Swaps: " + sorting.swaps+", Reheap downs: "+sorting.reheaps);
        System.out.println("Time taken: " + t25 + " ms");
        System.out.println("-----------------------------------------------------------------------------");
        sorting.reset();

        //750 elements for heap sort
        long time53 = System.nanoTime();
        sorting.heapSort(car3, car3.length); 
        long time54 = System.nanoTime();
        double t26 = (time54 - time53) / 1000000.0;
        
        
        System.out.println("Heap Sort for 750 elements, Comparisons: " + sorting.comparisons + ", Swaps: " + sorting.swaps+", Reheap downs: "+sorting.reheaps);
        System.out.println("Time taken: " + t26 + " ms");
        System.out.println("-----------------------------------------------------------------------------");
        sorting.reset();

        //1000 elements for heap sort
        long time55 = System.nanoTime();
        sorting.heapSort(car4, car4.length); 
        long time56 = System.nanoTime();
        double t27 = (time56 - time55) / 1000000.0;
        
        
        System.out.println("Heap Sort for 1000 elements, Comparisons: " + sorting.comparisons + ", Swaps: " + sorting.swaps+", Reheap downs: "+sorting.reheaps);
        System.out.println("Time taken: " + t27 + " ms");
        System.out.println("-----------------------------------------------------------------------------");
        sorting.reset();
        
        
        //250 elements for merge sort
        long time57 = System.nanoTime();
        sorting.mergeSort(car1, 0, car1.length-1); 
        long time58 = System.nanoTime();
        double t28 = (time58 - time57) / 1000000.0;
        
        
        System.out.println("Merge Sort for 250 elements, Comparisons: " + sorting.comparisons + ", Swaps: " + sorting.swaps+", Merge calls: "+sorting.merges);
        System.out.println("Time taken: " + t28 + " ms");
        System.out.println("-----------------------------------------------------------------------------");
        sorting.reset();

        //500 elements for merge sort
        long time60 = System.nanoTime();
        sorting.mergeSort(car2, 0, car2.length-1); 
        long time61 = System.nanoTime();
        double t29 = (time61 - time60) / 1000000.0;
        
        System.out.println("Merge Sort for 500 elements, Comparisons: " + sorting.comparisons + ", Swaps: " + sorting.swaps+", Merge calls: "+sorting.merges);
        System.out.println("Time taken: " + t29 + " ms");
        System.out.println("-----------------------------------------------------------------------------");
        sorting.reset();

        //750 elements for merge sort
        long time62 = System.nanoTime();
        sorting.mergeSort(car3, 0, car3.length-1); 
        long time63 = System.nanoTime();
        double t30 = (time63 - time62) / 1000000.0;
        
        
        System.out.println("Merge Sort for 750 elements, Comparisons: " + sorting.comparisons + ", Swaps: " + sorting.swaps+", Merge calls: "+sorting.merges);
        System.out.println("Time taken: " + t30 + " ms");
        System.out.println("-----------------------------------------------------------------------------");
        sorting.reset();
        
        //1000 elements for merge sort
        long time64 = System.nanoTime();
        sorting.mergeSort(car4, 0, car4.length-1); 
        long time65 = System.nanoTime();
        double t31 = (time65 - time64) / 1000000.0;
        
        
        System.out.println("Merge Sort for 1000 elements, Comparisons: " + sorting.comparisons + ", Swaps: " + sorting.swaps+", Merge calls: "+sorting.merges);
        System.out.println("Time taken: " + t31 + " ms");
        System.out.println("-----------------------------------------------------------------------------");
        sorting.reset();
        
	}
}
