class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Map<Character,Integer>, List<String>> letterOccurrencesToWordsListMap = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            Map<Character, Integer> lettersOccurrenceMap = new HashMap<>();
            for (char c : strs[i].toCharArray()){
                int occurrence = lettersOccurrenceMap.getOrDefault(c,0);
                lettersOccurrenceMap.put(c,occurrence+1);
            }
            if (letterOccurrencesToWordsListMap.containsKey(lettersOccurrenceMap)){
                letterOccurrencesToWordsListMap.get(lettersOccurrenceMap).add(strs[i]);
            } else {
                List<String> words = new ArrayList<>();
                words.add(strs[i]);
                letterOccurrencesToWordsListMap.put(lettersOccurrenceMap,words);
            }
        }

        List<List<String>> values = new ArrayList<>();
        for (List<String> value : letterOccurrencesToWordsListMap.values()){
            values.add(new ArrayList<>(value));
        }
        return values;
    }
}