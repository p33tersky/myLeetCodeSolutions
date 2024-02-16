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
        Queue<Integer> occs = new LinkedList<>();
        for (int key : occurrencesToList.keySet()){
            Collections.sort(occurrencesToList.get(key));
            occs.addAll(occurrencesToList.get(key));
        }
        for (int i = 0; i < k; i++) {
            occs.poll();
        }
        Set<Integer> finalSet = new HashSet<>(occs);
        return finalSet.size();
    }
}