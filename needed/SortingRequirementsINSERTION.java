package needed;

import java.util.List;

public interface SortingRequirementsINSERTION {



    /**
     * Perform Insertion Sort Completely
     * @param array the array to be sorted
     * @return a fully sorted array
     */
    <T extends Comparable<T>> T[] insertionSort(T[] array);

    /**
     * Perform Insertion Sort Completely
     * @param list the list to be sorted
     * @return a fully sorted list
     */
    <T extends Comparable<T>> List<T> insertionSort(List<T> list);

    /**
     * Perform a specified number of loops of Insertion Sort
     * @param array the array to be sorted
     * @param numIterations the number of iterations to sort
     * @return a partially sorted array
     */
    <T extends Comparable<T>> T[] insertionSort(T[] array, int numIterations);

    /**
     * Perform a specified number of loops of Insertion Sort
     * @param list the list to be sorted
     * @param numIterations the number of iterations to sort
     * @return a partially sorted list
     */
    <T extends Comparable<T>> List<T> insertionSort(List<T> list, int numIterations);

}
