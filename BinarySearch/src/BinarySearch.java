public class BinarySearch {
    public boolean search(int array[], int key, int lo, int hi) {
        int mid = (lo+hi-1)/2;
        if(lo == hi) {
            return false;
        } else if (array[mid]==key){
            return true;
        }
        else if (key<array[mid]) {
            return search(array, key, lo, mid);
        }
        else {
            return search(array, key, mid + 1, hi);
        }
    }
}
