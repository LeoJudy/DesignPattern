package design_pattern.strategy_pattern;

public class SorterContext {
    public enum MODE{
        BUBBLE,
        SELECT
    }

    private Sorter sorter;

    public SorterContext(MODE mode){
        if (mode == MODE.BUBBLE){
            sorter = new BubbleSorter();
        }else{
            sorter = new SelectSorter();
        }
    }

    public void sort(int[] arr){
        sorter.sort(arr);
    }

}
