class BrowserHistory {
 List<String> list = new ArrayList<>();
    int cur = 0 ;
    public BrowserHistory(String homepage) {
        list.add(homepage);
    }

    public void visit(String url) {
        list = list.subList(0, cur + 1);
        list.add(url);
        cur = list.size()-1;
    }

    public String back(int steps) {
        if(cur-steps<0){
            cur = 0;
            return list.get(cur);
        }
        cur = cur - steps;
        return list.get(cur);
    }

    public String forward(int steps) {
        if(cur+steps>=list.size()){
            cur = list.size()-1;
            return list.get(cur);
        }
        cur = cur+steps;
        return list.get(cur);
    }
}
