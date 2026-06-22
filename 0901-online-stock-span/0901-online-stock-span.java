class StockSpanner {
    Stack<int[]>st;

    public StockSpanner() {
        st = new Stack<>();
        
    }
    
    public int next(int price) {
        int span =1;//ye 1 se chalu hora h 
        while(!st.isEmpty()&& st.peek()[0]<=price){
            span+=st.pop()[1]; //prev span bhi add krena h
        }
        // push current price with its span
        st.push(new int[]{price,span});
        return span;
        
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */