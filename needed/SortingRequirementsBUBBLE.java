package needed;

import java.util.List;

public interface SortingRequirementsBUBBLE {


    /**
     * Perform Bubble Sort Completely
     * @param array the array to be sorted
     * @return a fully sorted array
     */
    <T extends Comparable<T>> T[] bubbleSort(T[] array);

    /**
     * Perform Bubble Sort Completely
     * @param list the list to be sorted
     * @return a fully sorted list
     */
    <T extends Comparable<T>> List<T> bubbleSort(List<T> list);

    /**
     * Perform a specified number of loops of Bubble Sort
     * @param array the array to be sorted
     * @param numIterations the number of iterations to sort
     * @return a partially sorted array
     */
    <T extends Comparable<T>> T[] bubbleSort(T[] array, int numIterations);

    /**
     * Perform a specified number of loops of Bubble Sort
     * @param list the list to be sorted
     * @param numIterations the number of iterations to sort
     * @return a partially sorted list
     */
    <T extends Comparable<T>> List<T> bubbleSort(List<T> list, int numIterations);


}
