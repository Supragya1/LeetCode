class MyCircularDeque {
    int front, rear;
    int[] queue;
    int size,capacity;
    public MyCircularDeque(int k) {
        this.capacity=k;
        queue = new int[capacity];
        this.front = 0;
        this.rear = 0;
        this.size=0;
    }
    
    public boolean insertFront(int value) {
        if(isFull()){
            return false;
        }
        if(front==0){
            front = capacity-1;
        }
        else{
            front--;
        }
        queue[front]=value;
        size++;
        return true;
    }
    
    public boolean insertLast(int value) {
        if(isFull()){
            return false;
        }
        queue[rear]=value;
        if(rear==capacity-1){
            rear=0;
        }
        else{
           rear++;
        }
        size++;
        return true;
    }
    
    public boolean deleteFront() {
        if (isEmpty()) {
            return false;
        }
        queue[front]=-1;
        if (front == capacity-1) {
            front= 0;
        }
        else{
            front++;
        }
        size--;
        return true;
    }
    
    public boolean deleteLast() {
        if (isEmpty()) {
            return false;
        }
        if (rear==0) {
            rear=capacity-1;
        }
        else{
            rear--;
        }
        queue[rear]=-1;
        size--;
        return true;
    }
    
    public int getFront() {
        if (isEmpty()) {
            return -1;
        }
        return queue[front];
    }
    
    public int getRear() {
        if (isEmpty()) {
            return -1;
        }
        if(rear==0){
            return queue[capacity-1];
        }
        else{
            return queue[rear-1];
        }
    }
    
    public boolean isEmpty() {
        return size==0;
    }
    
    public boolean isFull() {
        return size==capacity;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */