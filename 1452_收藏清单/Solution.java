class Solution {
    public List<Integer> peopleIndexes(List<List<String>> favoriteCompanies) {
            List<Integer> result = new ArrayList<>();
            for (int i = 0; i < favoriteCompanies.size(); i++) {
                List<String> checkOne = favoriteCompanies.get(i);
                boolean flag = true;
                for (int j = 0; j < favoriteCompanies.size(); j++) {
                    if (j == i) continue;
                    List<String> second = favoriteCompanies.get(j);
                    Set<String> tmpSecond = new HashSet<>(second);
                    if (tmpSecond.containsAll(checkOne)) {
                        flag = false;
                        break;
                    }
                }
                if (flag == true) result.add(i);
            }
            return result;
    }
}