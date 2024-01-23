package MaximumLengthOfAConcatenatedStringWithUniqueCharacters1239;

class MaximumLengthOfAConcatenatedStringWithUniqueCharacters1239{
    public int maxLength(List<String> arr) {

        int total= 1 << arr.size(), max_len= 0;

        for(int i = 0; i < total; i++) {

            HashSet<Character> set= new HashSet<>();
            int curr_len= 0;

            for(int j = 0; j < arr.size(); j++) {

                boolean flag= false;

                if((i & (1 << j)) > 0) {

                    if(curr_len + arr.get(j).length() > 26)
                        continue;

                    for(int k = 0; k < arr.get(j).length(); k++) {

                        if(set.contains(arr.get(j).charAt(k))) {
                            flag= true;
                            break;
                        }
                        set.add(arr.get(j).charAt(k));

                    }

                    if(!flag) {
                        curr_len += arr.get(j).length();
                        max_len= Math.max(curr_len, max_len);
                    }
                    if(max_len == 26)
                        return max_len;
                }

            }
        }

        return max_len;
    }
}
