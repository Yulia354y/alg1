import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;
class BasicAlgSortTest{
    @Test
    public void testBubbleSortWhenArraysWithIntegerTypesAndRangeEqualsLength() {
        Integer[] sourceArray=new Integer[]{5,4,10,2,1};
        Integer[] destArray= new Integer[]{1,2,4,5,10};
        BasicAlgSort<Integer>integerBasicAlgSort=new BasicAlgSort<>(sourceArray,true);
        integerBasicAlgSort.bubbleSortAsc();
        assertThat(integerBasicAlgSort.getArray()).isEqualTo(destArray);
    }
    @Test
    public void testBubbleSortWhenArraysWithIntegerTypesAndRangeEqualsLength2() {
        Integer[] sourceArray=new Integer[]{5,4,10,2,1};
        Integer[] destArray= new Integer[]{10,5,4,2,1};
        BasicAlgSort<Integer>integerBasicAlgSort=new BasicAlgSort<>(sourceArray,false);
        integerBasicAlgSort.bubbleSortAsc();
        assertThat(integerBasicAlgSort.getArray()).isEqualTo(destArray);
    }

    @Test
    public void testSelectionSortWhenArraysWithIntegerTypesAndRangeEqualsLength() {
        Integer[] sourceArray=new Integer[]{5,4,10,2,1};
        Integer[] destArray= new Integer[]{1,2,4,5,10};
        BasicAlgSort<Integer>integerBasicAlgSort=new BasicAlgSort<>(sourceArray,true);
        integerBasicAlgSort.bubbleSortAsc();
        assertThat(integerBasicAlgSort.getArray()).isEqualTo(destArray);

    }

    @Test
    public void testInsertionSortWhenArraysWithIntegerTypesAndRangeEqualsLength() {
        Integer[] sourceArray=new Integer[]{5,4,10,2,1,8,-5,0};
        Integer[] destArray= new Integer[]{-5,0,1,2,4,5,8,10};
        BasicAlgSort<Integer>integerBasicAlgSort=new BasicAlgSort<>(sourceArray, true);
        integerBasicAlgSort.insertionSortWithinearSearchAsc();
        assertThat(integerBasicAlgSort.getArray()).isEqualTo(destArray);
    }

    @Test
    public void testInsertionSortWithBinarySearchWhenArraysWithIntegerTypesAndRangeEqualsLength() {
        Integer[] sourceArray=new Integer[]{5,4,10,2,1,8,-5,0};
        Integer[] destArray= new Integer[]{-5,0,1,2,4,5,8,10};
        BasicAlgSort<Integer>integerBasicAlgSort=new BasicAlgSort<>(sourceArray, true);
        integerBasicAlgSort.insertionSortWithinearSearchAsc();
        assertThat(integerBasicAlgSort.getArray()).isEqualTo(destArray);
    }
    public static Integer[] getRandomInteger(int n){
        Integer[] sourceArray = new Integer[n];
        for (int i=0; i<n; i++){
            sourceArray[i]=new Random().nextInt(200)-100;
        }
        return sourceArray;
    }
}
