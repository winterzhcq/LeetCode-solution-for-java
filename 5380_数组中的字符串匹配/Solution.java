class Solution {
     List<String> list = new ArrayList<>();
    public List<String> stringMatching(String[] words) {
        for(int i = 0;i<words.length;i++){
            String word = words[i];
            for(int j = i+1 ;j<words.length;j++){
                if (word.isEmpty() || words[j].isEmpty()) continue;
                if (word.indexOf(words[j]) != -1){
                    if (!list.contains(words[j])) list.add(words[j]);
                }else if (words[j].indexOf(word) != -1){
                    if (!list.contains(word)) list.add(word);
                }
            }
        }
        return list;
    }
}