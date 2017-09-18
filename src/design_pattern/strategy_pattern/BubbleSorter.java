package design_pattern.strategy_pattern;

class BubbleSorter implements Sorter {

    @Override
    public void sort(int[] arr) {
        int end = arr.length;
        int endJ = end - 1;
        for (int i = 0; i < end; i++){
            for (int j = 0; j < endJ; j++){
                if (arr[j] > arr[j+1]){
                    swap(arr, j, j+1);
                }
            }
        }
    }
}
