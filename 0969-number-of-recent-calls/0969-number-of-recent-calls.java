class RecentCounter {
    private Queue<Integer> req;

    public RecentCounter() {
        req = new LinkedList<>();
    }
    
    public int ping(int t) {
        this.req.add(t);
        int count=0;

        for(Integer i : req){
            if(i >= t-3000 && i<= t ){
                count++;
            }
        }
        return count;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */