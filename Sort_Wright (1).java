import needed.SortingRequirementsSELECTION;

import java.util.List;

public class Sort_Wright implements SortingRequirementsSELECTION {
    public <T extends Comparable<T>> T[] selectionSort(T[] array) {
        for(int numSorted = 0; numSorted < array.length-1; numSorted++){
            int minIndex= numSorted;
            for(int current = numSorted+1; current < array.length; current++){
                if(array[current].compareTo(array[minIndex]) < 0){
                    T temp = array[minIndex];
                    array[minIndex]= array[current];
                    array[current] = temp;
                }
            }
        }
        return array;
    }

    public <T extends Comparable<T>> List<T> selectionSort(List<T> list) {
        for(int numSorted = 0; numSorted < list.size()-1; numSorted++){
            int minIndex= numSorted;
            for(int current = numSorted+1; current < list.size(); current++){
                if(list.get(current).compareTo(list.get(minIndex)) < 0){
                    T temp = list.get(minIndex);
                    list.set(minIndex, list.get(current));
                    list.set(current, temp);
                }
            }
        }
        return list;
    }

    public <T extends Comparable<T>> T[] selectionSort(T[] array, int numIterations) {
        for(int numSorted = 0; numSorted < numIterations; numSorted++){
            int minIndex= numSorted;
            for(int current = numSorted+1; current < array.length; current++){
                if(array[current].compareTo(array[minIndex]) < 0){
                    T temp = array[minIndex];
                    array[minIndex]= array[current];
                    array[current] = temp;
                }
            }
        }
        return array;
    }

    public <T extends Comparable<T>> List<T> selectionSort(List<T> list, int numIterations) {
        for(int numSorted = 0; numSorted < numIterations; numSorted++){
            int minIndex= numSorted;
            for(int current = numSorted+1; current < list.size(); current++){
                if(list.get(current).compareTo(list.get(minIndex)) < 0){
                    T temp = list.get(minIndex);
                    list.set(minIndex, list.get(current));
                    list.set(current, temp);
                }
            }
        }
        return list;
    }
    public <T extends Comparable<T>> T[] insertionSort(T[] array) {
        int numSorted = 0;

        for(numSorted = 1; numSorted < array.length; numSorted++){
            int current = numSorted;
            T temp = array[current];
            while(current > 0 && array[current].compareTo(array[current-1]) < 0){
                array[current] = array[current-1];
                array[current-1] = temp;
                current--;
            }
        }

        return array;
    }

    public <T extends Comparable<T>> List<T> insertionSort(List<T> list) {
        int numSorted = 0;

        for(numSorted = 1; numSorted < list.size(); numSorted++){
            int current = numSorted;
            T temp = list.get(current);
            while(current > 0 && list.get(current).compareTo(list.get(current-1)) < 0){
                list.set(current, list.get(current-1));
                list.set(current-1, temp);
                current--;
            }
        }

        return list;
    }

    public <T extends Comparable<T>> T[] insertionSort(T[] array, int numIterations) {
        int numSorted = 0;

        for(numSorted = 1; numSorted < numIterations+1; numSorted++){
            int current = numSorted;
            T temp = array[current];
            while(current > 0 && array[current].compareTo(array[current-1]) < 0){
                array[current] = array[current-1];
                array[current-1] = temp;
                current--;
            }
        }

        return array;
    }

    public <T extends Comparable<T>> List<T> insertionSort(List<T> list, int numIterations) {
        int numSorted = 0;

        for(numSorted = 1; numSorted < numIterations+1; numSorted++){
            int current = numSorted;
            T temp = list.get(current);
            while(current > 0 && list.get(current).compareTo(list.get(current-1)) < 0){
                list.set(current, list.get(current-1));
                list.set(current-1, temp);
                current--;
            }
        }

        return list;
    }


    public <T extends Comparable<T>> T[] bubbleSort(T[] array) {
       int numSorted = 0;
        while(numSorted < array.length) {
            int current = array.length - 1;
            while (current > numSorted) {
                if (array[current].compareTo(array[current - 1]) > 0) {
                    T temp = array[current];
                    array[current] = array[current - 1];
                    array[current - 1] = temp;
                }
                current--;
            }

            numSorted++;
        }
        return array;
    }

    public <T extends Comparable<T>> List<T> bubbleSort(List<T> list) {
        int numSorted = 0;
        while(numSorted < list.size()) {
            int current = list.size() - 1;
            while (current > numSorted) {
                if (list.get(current).compareTo(list.get(current-1)) > 0) {
                    T temp = list.get(current);
                    list.set(current, list.get(current-1));
                    list.set(current-1, temp);
                }
                current--;
            }

            numSorted++;
        }
        return list;
    }

    public <T extends Comparable<T>> T[] bubbleSort(T[] array, int numIterations) {
        int numSorted = 0;
        while(numSorted < numIterations) {
            int current = array.length - 1;
            while (current > numSorted) {
                if (array[current].compareTo(array[current - 1]) > 0) {
                    T temp = array[current];
                    array[current] = array[current - 1];
                    array[current - 1] = temp;
                }
                current--;
            }

            numSorted++;
        }
        return array;
    }

    public <T extends Comparable<T>> List<T> bubbleSort(List<T> list, int numIterations) {
        int numSorted = 0;
        while(numSorted < numIterations) {
            int current = list.size() - 1;
            while (current > numSorted) {
                if (list.get(current).compareTo(list.get(current-1)) > 0) {
                    T temp = list.get(current);
                    list.set(current, list.get(current-1));
                    list.set(current-1, temp);
                }
                current--;
            }

            numSorted++;
        }
        return list;
    }
}
