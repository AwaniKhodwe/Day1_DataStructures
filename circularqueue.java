class Queue
{
    int queue[];
    int capacity;
    int head;
    int tail;
    int size;
    
    public Queue(int capacity)
    {
        this.queue = new int[capacity];
        this.capacity = capacity;
        head = -1;
        tail = -1;
        size = 0;
    }
    
    void enqueue(int val)
    {
        queue[(tail+1)%maxSize] = val;
        tail = (tail+1)%maxSize;
        size++;
        if(size == capacity)
        {
            System.out.println("Queue is full");
        }
    }
    
    void dequeue()
    {
        int ele = queue[head];
        head = (head+1)%maxSize;
        size--;
        if(size == 0)
        {
            System.out.println("Queue is empty");
        }
    }
    
}
