import java.util.Arrays;
public class BasicAlgSort<T extends Comparable<? super T>> {
    private int left;
    private int right;
    private T[] array;
    private boolean sortOrderingFlag;

    public BasicAlgSort(T[]array,boolean sortOrderingFlag){
        this.array=Arrays.copyOf(array,array.length);
        this.sortOrderingFlag = sortOrderingFlag;
    }

    public BasicAlgSort(int left, int right, T[] array) {
        this.left = left;
        this.right = right;
        this.array = Arrays.copyOfRange(array,left,right);
    }

    public void bubbleSortAsc() {
        boolean flagForInteration = true;
        while (flagForInteration) {
            flagForInteration = false;
            for (int i = 1; i < array.length; i++) {
                if (sortOrderingFlag) {  // Ascending order
                    if (array[i].compareTo(array[i - 1]) < 0) {
                        swap(i, i - 1);
                        flagForInteration = true;
                    }
                } else {  // Descending order
                    if (array[i].compareTo(array[i - 1]) > 0) {
                        swap(i, i - 1);
                        flagForInteration = true;
                    }
                }
            }
        }
    }


    private void swap(int leftIndex, int righIndex) {
        T temp = array[leftIndex];
        array[leftIndex] = array[righIndex];
        array[righIndex] = temp;
    }


    public void selectSortAsc() {
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            T min = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (sortOrderingFlag) {  // Ascending order
                    if (array[j].compareTo(min) < 0) {
                        min = array[j];
                        minIndex = j;
                    }
                } else {  // Descending order
                    if (array[j].compareTo(min) > 0) {
                        min = array[j];
                        minIndex = j;
                    }
                }
            }
            if (i != minIndex) swap(i, minIndex);
        }
    }


    public void insertionSortWithLinearSearchAsc() {
        for (int i = 1; i < array.length; i++) {
            T key = array[i];
            int j = i;
            for (; j > 0; j--) {
                if (sortOrderingFlag) {  // Ascending order
                    if (key.compareTo(array[j - 1]) < 0) {
                        array[j] = array[j - 1];
                    } else {
                        break;
                    }
                } else {  // Descending order
                    if (key.compareTo(array[j - 1]) > 0) {
                        array[j] = array[j - 1];
                    } else {
                        break;
                    }
                }
            }
            array[j] = key;
        }
    }


    public void insertionSortWithBinarySearchAsc() {
        for (int i = 1; i < array.length; i++) {
            T key = array[i];
            int leftIndex = 0;
            int rightIndex = i - 1;

            if (key.compareTo(array[i - 1]) < 0) {
                while (leftIndex <= rightIndex) {
                    int midIndex = (rightIndex + leftIndex) / 2;
                    if (key.compareTo(array[midIndex]) < 0) {
                        rightIndex = midIndex - 1;
                    } else {
                        leftIndex = midIndex + 1;
                    }
                }


                for (int j = i; j > leftIndex; j--) {
                    array[j] = array[j - 1];
                }
                array[leftIndex] = key;
            }
        }
    }



    public T[] getArray() {
        return array;
    }


}