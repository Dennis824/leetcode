package UniqueNumberOfOccurrences1207;

class UniqueNumberOfOccurrences1207{
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        Set<Integer> freqSet = new HashSet<>(map.values());
        return map.size() == freqSet.size();
    }
}