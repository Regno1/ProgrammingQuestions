class Solution {
    public static void sortByComparator(String[] arr) {
        // code here
        Arrays.sort(arr,String::compareToIgnoreCase);
    }
}