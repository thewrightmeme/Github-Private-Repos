import ComplexSorts.MergeSort;
import ComplexSorts.QuickAndMergeSorts;

import java.util.List;

public class RecursiveSort_Wright implements QuickAndMergeSorts {

    public <T extends Comparable<T> & Cloneable> T[] mergeSort(T[] array) {
        array = mergeSort(array, 0, array.length);
        return array;
    }

    public <T extends Comparable<T> & Cloneable> T[] mergeSort(T[] array, int startIndex, int endIndex) {
        int numElements = endIndex - startIndex;
        if (numElements == 1) {
            return array;
        }

        int lengthLeft = numElements / 2;
        int lengthRight = numElements - lengthLeft;
        int rightStartIndex = startIndex + lengthLeft;
        array = mergeSort(array, startIndex, rightStartIndex);
        array = mergeSort(array, rightStartIndex, endIndex);
        T[] clone = array.clone();
        int left = startIndex;
        int right = rightStartIndex;
        int index = startIndex;
        while (left < rightStartIndex && right < endIndex) {
            if (array[right].compareTo(array[left])  <0) {
                clone[index] = array[right];
                right++;
            } else {
                clone[index] = array[left];
                left++;
            }
            index++;
        }
        while (left < rightStartIndex) {
            clone[index] = array[left];
            left++;
            index++;
        }
        while (right < endIndex) {
            clone[index] = array[right];
            right++;
            index++;
        }
        return clone;
    }

    public <T extends Comparable<T> & Cloneable> List<T> mergeSort(List<T> list) {
        list = mergeSort(list, 0, list.size());
        return list;
    }

    public <T extends Comparable<T> & Cloneable> List<T> mergeSort(List<T> list, int startIndex, int endIndex) {
        int numElements = endIndex - startIndex;
        if (numElements == 1) {
            return list;
        }

        int lengthLeft = numElements / 2;
        int lengthRight = numElements - lengthLeft;
        int rightStartIndex = startIndex + lengthLeft;
        list = mergeSort(list, startIndex, rightStartIndex);
        list = mergeSort(list, rightStartIndex, endIndex);
        Object[] original = list.toArray();
        int left = startIndex;
        int right = rightStartIndex;
        int index = startIndex;
        while (left < rightStartIndex && right < endIndex) {
            if (((T)original[right]).compareTo((T)original[left]) < 0) {
                list.set(index,(T)original[right]);
                right++;
            } else {
                list.set(index,(T)original[left]);
                left++;
            }
            ++index;
        }
        while (left < rightStartIndex) {
            list.set(index,(T)original[left]);
            left++;
            index++;
        }
        while (right < endIndex) {
            list.set(index,(T)original[right]);
            right++;
            index++;
        }
        return list;
    }

    public <T extends Comparable<T> & Cloneable> T[] quickSort(T[] array) {
        array = quickSort(array, 0, array.length);
        return array;
    }

    public <T extends Comparable<T> & Cloneable> T[] quickSort(T[] array, int startIndex, int endIndex) {
        int numElements = endIndex - startIndex;
        if(numElements < 2){
            return array;
        }

        T splitData = array[endIndex-1];
        int splitIndex = startIndex;
        for(int current = startIndex; current < endIndex-1; current++){
            if(array[current].compareTo(splitData) <= 0){
                T temp = array[current];
                array[current] = array[splitIndex];
                array[splitIndex] = temp;
                splitIndex++;
            }
        }
        T temp = array[splitIndex];
        array[splitIndex] = splitData;
        array[endIndex-1] = temp;
        array = quickSort(array, startIndex, splitIndex);
        array = quickSort(array, splitIndex+1, endIndex);
        return array;
    }

    public <T extends Comparable<T> & Cloneable> List<T> quickSort(List<T> list) {
        list = quickSort(list, 0, list.size());
        return list;
    }

    public <T extends Comparable<T> & Cloneable> List<T> quickSort(List<T> list, int startIndex, int endIndex) {
        //finish THIS
        int numElements = endIndex - startIndex;
        if(numElements < 2){
            return list;
        }

        T splitData = list.get(endIndex-1);
        int splitIndex = startIndex;
        for(int current = startIndex; current < endIndex-1; current++){
            if(list.get(current).compareTo(splitData) <= 0){
                T temp = list.get(current);
                list.set(current, list.get(splitIndex));
                list.set(splitIndex, temp);
                splitIndex++;
            }
        }
        T temp = list.get(splitIndex);
        list.set(splitIndex, splitData);
        list.set(endIndex-1, temp);
        list = quickSort(list, startIndex, splitIndex);
        list = quickSort(list, splitIndex+1, endIndex);
        return list;
    }
}
