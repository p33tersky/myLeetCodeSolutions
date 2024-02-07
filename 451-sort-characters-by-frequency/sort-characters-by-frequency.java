class Solution {
    public String frequencySort(String s) {
        Map<Integer, List<Character>> occurrencesToCharListMap = new TreeMap<>();
        char[] charactersFromStringSorted = s.toCharArray();
        Arrays.sort(charactersFromStringSorted);

        for (int i = 0; i <s.length(); i++) {
            int occ = 0;
            char sign = charactersFromStringSorted[i];
            for (int j = i; j < s.length(); j++) {
                if (charactersFromStringSorted[j]==sign){
                    occ++;
                }else {
                    break;
                }
            }
            if (occurrencesToCharListMap.containsKey(occ)){
                occurrencesToCharListMap.get(occ).add(sign);
            } else {
                List<Character> signs = new ArrayList<>();
                signs.add(sign);
                occurrencesToCharListMap.put(occ,signs);
            }
            i += occ-1;
        }
        StringBuilder sb = new StringBuilder();
        for (Integer key : occurrencesToCharListMap.keySet()){
            List<Character> values = occurrencesToCharListMap.get(key);
            for (Character value : values) {
                sb.append(String.valueOf(value).repeat(Math.max(0, key)));
            }
        }
        return sb.reverse().toString();
    }
}