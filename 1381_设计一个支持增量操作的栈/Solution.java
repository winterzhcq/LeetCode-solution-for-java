class CustomStack {
    int maxSize = 0;
    List<Integer> list = null ;
    public CustomStack(int maxSize) {
        list = new LinkedList<>();
        this.maxSize = maxSize;
    }
    
    public void push(int x) {
        if(list.size() < maxSize)
            list.add(x);
    }
    
    public int pop() {
        if(list.isEmpty()) return -1;
        int x=  list.get(list.size()-1);
        list.remove(list.size()-1);
        return x;
    }
    
    public void increment(int k, int val) {
        int length = k;
        if(k >= list.size()) length = list.size();
        for(int i = 0 ;i < length;i++){
           list.set(i,list.get(i)+val);	
        }
    }
}
