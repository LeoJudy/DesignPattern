package design_pattern.strategy_pattern;


class SelectSorter implements Sorter {

    @Override
    public void sort(int[] arr) {
        int end = arr.length;
        for (int i = 0; i < end; i++){
            int min = i;
            for (int j = i + 1; j < end; j++){
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            swap(arr, i, min);
        }
    }
}
