class RecentCounter {
    private Queue<Integer> req;

    public RecentCounter() {
        req = new LinkedList<>();
    }
    
    public int ping(int t) {
        req.add(t);

        while(req.peek() < t-3000){
            req.poll();
        }
        return req.size();
    }
}