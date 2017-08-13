package stack;

public class Stack<T> implements IStack<T>{
	private int growSize;
	private int stackSize;
	protected int size;
	protected Object[] stack;
	
	Stack(int stackSize){
		this.stackSize = stackSize;
		this.size = 0;
		this.stack = new Object[stackSize];
		this.growSize = 5;
	}
	
	public Stack(int stackSize, int growSize){
		this.stackSize = stackSize;
		this.size = 0;
		this.stack = new Object[stackSize];
		this.growSize = growSize;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return this.size;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T pop() {
		// TODO Auto-generated method stub
		if(isEmpty()){
			return null;
		}
		T temp = (T) stack[--size];
		stack[size] = null;
		return temp;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (0==this.size? true: false);
	}

	@Override
	public int clean() {
		// TODO Auto-generated method stub
		int numberToClean = this.size;
		for(int i = size; i > 0; i --){
			pop();
		}
		return numberToClean;
	}

	@Override
	public boolean push(T t) {
		// TODO Auto-generated method stub
		if(checkFull()){
			return false;
		}
		stack[size++] = t;
		return true;
	}

	@Override
	public int grow() {
		// TODO Auto-generated method stub
		return grow(this.growSize);
	}

	@Override
	public int grow(int n) {
		// TODO Auto-generated method stub
		this.stackSize += n;
		Object[] newStack = new Object[stackSize];
		for(int i = size - 1; i >= 0; i -= 1){
			newStack[i] = this.stack[i];
		}
		this.stack = newStack;
		return stackSize;
	}
	
	protected boolean checkFull(){
		return (size >= stackSize ? true : false);
	}

	@Override
	public int stackSize() {
		// TODO Auto-generated method stub
		return this.stackSize;
	}

	@Override
	public int trimToSize() {
		// TODO Auto-generated method stub
		return grow(this.size - this.stackSize);
	}
	
}
