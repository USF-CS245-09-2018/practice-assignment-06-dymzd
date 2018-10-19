public class ArrayStack implements Stack {

    int defalut = 10;
    Object[] data = new Object[defalut];
    int top = 0;

    public void push(Object item){
        if(top==defalut-1){
            resize();
        }
        data[top] = item;
        top = top+1;
        return;
    }
    public Object pop(){
        top = top-1;
        return data[top];
    }
    public Object peek(){
        return data[top-1];
    }
    
	public boolean empty(){
        return top == 0;
    }
    public void resize(){
        defalut = defalut * 2;
        Object[] temp = new Object[defalut];
        for(int i = 0; i < top; i++){
            temp[i] = data[i];
        }
        data = temp; 
        return;
    }

}