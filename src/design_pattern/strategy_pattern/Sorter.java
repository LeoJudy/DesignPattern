package design_pattern.strategy_pattern;

interface Sorter {
    void sort(int[] arr);

    default void swap(int[] arr, int l, int r){
        if (l == r) return;
        int t = arr[l];
        arr[l] = arr[r];
        arr[r] = t;
    }
}
