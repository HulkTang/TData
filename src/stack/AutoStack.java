package stack;

public class AutoStack<T> extends Stack<T>{
	
	public AutoStack(int stackSize, int growSize){
		super(stackSize, growSize);
	}
	
	public boolean push(T t) {
		// TODO Auto-generated method stub
		if(checkFull()){
			super.grow();
		}
		stack[size++] = t;
		return true;
	}
	
}
