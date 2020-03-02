class MyQueue {
    private Stack<Integer> a;// ����ջ
    private Stack<Integer> b;// ���ջ
    
    public MyQueue() {
        a = new Stack<>();
        b = new Stack<>();
    }
    
    public void push(int x) {
        a.push(x);
    }
    
    public int pop() {
        // ���bջΪ�գ���aջȫ��������ѹ��bջ�У�Ȼ��b.pop()
        if(b.isEmpty()){
            while(!a.isEmpty()){
                b.push(a.pop());
            }
        }
        return b.pop();
    }
    
    public int peek() {
        if(b.isEmpty()){
            while(!a.isEmpty()){
                b.push(a.pop());
            }
        }
        return b.peek();
    }
    
    public boolean empty() {
        return a.isEmpty() && b.isEmpty();
    }
}