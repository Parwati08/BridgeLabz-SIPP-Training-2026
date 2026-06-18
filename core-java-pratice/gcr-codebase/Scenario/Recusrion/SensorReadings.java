// 1. Consecutive Sensor Readings
// A sensor records temperature readings every minute.
// Task: Recursively determine whether the readings are strictly increasing.
// Example:
// Input: [12, 15, 18, 22, 30]
// Output: true
// Input: [12, 15, 14, 22]
// Output: false


public class SensorReadings {
    static boolean isIncreasing(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true;
        }
        if (arr[index] >= arr[index + 1]) {
            return false;
        }
        return isIncreasing(arr, index + 1);
    }
    public static void main(String[] args) {
        int[] readings = {12, 15, 18, 22, 30};
        System.out.println(isIncreasing(readings, 0));
    }
}