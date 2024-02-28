package needed;

import java.util.List;

public interface SortingRequirementsSELECTION {


    <T extends Comparable<T>> T[] selectionSort(T[] array);
    /**
     * Perform Selection Sort Completely
     * @param list the list to be sorted
     * @return a fully sorted list
     */
    <T extends Comparable<T>> List<T> selectionSort(List<T> list);

    /**
     * Perform a specified number of loops of Selection Sort
     * @param array the array to be sorted
     * @param numIterations the number of iterations to sort
     * @return a partially sorted array
     */
    <T extends Comparable<T>> T[] selectionSort(T[] array, int numIterations);

    /**
     * Perform a specified number of loops of Selection Sort
     * @param list the list to be sorted
     * @param numIterations the number of iterations to sort
     * @return a partially sorted list
     */
    <T extends Comparable<T>> List<T> selectionSort(List<T> list, int numIterations);


}
