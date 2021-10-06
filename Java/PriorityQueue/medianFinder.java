class MedianFinder {
    PriorityQueue<Integer> left;
    PriorityQueue<Integer> right;

    
    public MedianFinder() {
        left = new PriorityQueue<>(Collections.reverseOrder());
      right = new PriorityQueue<>();
    }
    public void addNum(int val) {
      if(right.size() > 0 && val > right.peek()){
          right.add(val);
      }else{
          left.add(val);
      }
      if(left.size() - right.size()== 2)
      {
          right.add(left.remove());
      }else if(right.size() - left.size()== 2)
      {
          left.add(right.remove());
      }
    }
    
    public double findMedian() {
         double ans ;
        if(left.size() == right.size())
        {
           ans = left.peek()+right.peek();
            ans = ans/2 ;
        }else if(right.size() > left.size()){
            ans = right.peek();
        }else{
            ans = left.peek();
        }
        return ans ;
    }
}
