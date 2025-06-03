class Solution {

    public boolean searchEle(List<Integer> arr, int x) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                return true;
            }
        }
        return false;
    }

    public void insertEle(List<Integer> arr, int y, int yi) { arr.add(yi, y); }

    public void deleteEle(List<Integer> arr, int z) {
        int index = arr.indexOf(z);
        if (index != -1) {
            arr.remove(index);
        }
    }
}
