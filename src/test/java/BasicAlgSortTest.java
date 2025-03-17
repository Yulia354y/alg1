import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.assertj.core.api.Assertions.*;

class BasicAlgSortTest {
    @Test
    public void testBubbleSortWhenArraysWithIntegerTypesAndRAngeEqualsLength(){
        Integer[] sourceArray= new Integer[]{5,4,10,2,1};
        Integer [] destArray=new Integer[]{1,2,4,5,10};
        BasicAlgSort<Integer> integerBasicAlgSort=new BasicAlgSort<>(sourceArray, true);
        integerBasicAlgSort.bubbleSortAsc();
        assertThat(integerBasicAlgSort.getArray()).isEqualTo(destArray);
    }
    @Test
    public void testSelectionSortWhenArraysWithIntegerTypesAndRAngeEqualsLength(){
        Integer[] sourceArray= new Integer[]{5,4,10,2,1};
        Integer [] destArray=new Integer[]{1,2,4,5,10};
        BasicAlgSort<Integer> integerBasicAlgSort=new BasicAlgSort<>(sourceArray, true);
        integerBasicAlgSort.selectSortAsc();
        assertThat(integerBasicAlgSort.getArray()).isEqualTo(destArray);
    }
    @Test
    public void testInsertionSortWhenArraysWithIntegerTypesAndRAngeEqualsLength(){
        Integer[] sourceArray= new Integer[]{5,4,10,2,1,8,-5,0};
        Integer [] destArray=new Integer[]{-5,0,1,2,4,5,8,10};
        BasicAlgSort<Integer> integerBasicAlgSort=new BasicAlgSort<>(sourceArray, true);
        integerBasicAlgSort.insertionSortWithLinearSearchAsc();
        assertThat(integerBasicAlgSort.getArray()).isEqualTo(destArray);
    }
    @Test
    public void testInsertionSortWithBinarySearchWhenArraysWithIntegerTypesAndRAngeEqualsLength(){
        Integer[] sourceArray= new Integer[]{5,4,10,2,1,8,-5,0};
        Integer [] destArray=new Integer[]{-5,0,1,2,4,5,8,10};
        BasicAlgSort<Integer> integerBasicAlgSort=new BasicAlgSort<>(sourceArray, true);
        integerBasicAlgSort.insertionSortWithBinarySearchAsc();
        assertThat(integerBasicAlgSort.getArray()).isEqualTo(destArray);
    }
    public static Integer[] getRandomInteger(int n){
        Integer[] sourceArray=new Integer[n];
        for (int i = 0; i < n; i++) {
            sourceArray[i]=new Random().nextInt(200)-100;
        }
        return sourceArray;
    }


}