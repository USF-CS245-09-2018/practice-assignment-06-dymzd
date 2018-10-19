public class ArrayQueue implements Queue {
    int head, tail;
    int defalut = 10;
    Object[] data = new Object[defalut];

    public Object dequeue(){
        Object dequeued = data[head];
        head = head + 1;
        if(head == defalut){
            head = 0;
        }
        return dequeued;
    }
	public void enqueue(Object item){
        data[tail] = item;
        tail = tail + 1;
        if(tail == defalut){
            resize();
        }
    }
	public boolean empty(){
        return head == tail;
    }
    public void resize(){
        defalut = defalut * 2;
        Object[] temp = new Object[defalut];
        for(int i = 0; i < tail; i++){
            temp[i] = data[i];
        }
        data = temp;
        return;
    }
}