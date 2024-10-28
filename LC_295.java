import java.util.ArrayList;

public class LC_295 {
    ArrayList<Integer> MedianFinder = new ArrayList<>();

    public LC_295(ArrayList<Integer> nums) {
        this.MedianFinder = nums;
    }

    public void addNum(int num){
        if (MedianFinder.size() == 0){
            MedianFinder.add(num);
        } else {
            int i = 0;
            while (i < MedianFinder.size() && MedianFinder.get(i) < num){
                i++;
            }
            MedianFinder.add(i, num);
        }
    }

    public double findMedian(){
        if (MedianFinder.size() % 2 != 0){
            return MedianFinder.get(MedianFinder.size() / 2);
        } else {
            double a = (MedianFinder.size() / 2) - 0.5;
            double b = (MedianFinder.size() / 2) + 0.5;
            return (MedianFinder.get((int) a) + MedianFinder.get((int) b)) / 2.0;
        }
    }
}
