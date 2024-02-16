class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer, Integer> numberOccurrences = new TreeMap<>();
        for (int i = 0; i < arr.length; i++) {
            int occ = numberOccurrences.getOrDefault(arr[i], 0);
            numberOccurrences.put(arr[i], occ + 1);
        }
        Map<Integer, List<Integer>> occurrencesToList = new TreeMap<>();
        for (int i = 0; i < arr.length; i++) {
            int key = arr[i];
            int value = numberOccurrences.get(key);
            if (occurrencesToList.containsKey(value)) {
                occurrencesToList.get(value).add(key);
            } else {
                List<Integer> ints = new ArrayList<>();
                ints.add(key);
                occurrencesToList.put(value, ints);
            }
        }
        Set<Integer> keys = occurrencesToList.keySet();
        for (int key : keys) {
            List<Integer> occurrences = occurrencesToList.get(key);
            Collections.sort(occurrences);
            int size = occurrences.size();
            int elementsToRemove = Math.min(size, k);
            occurrences.subList(0, elementsToRemove).clear();
            k -= elementsToRemove;

            if (k == 0) {
                break;
            }
        }
        Set<Integer> finalSet = new HashSet<>();
        for (int key : occurrencesToList.keySet()) {
            finalSet.addAll(occurrencesToList.get(key));
        }
        return finalSet.size();
    }
}