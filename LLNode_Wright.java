public class LLNode_Wright<T> implements Node<T> {
	public T data;
	public Node<T> next;

	public LLNode_Wright(T data) {
		this.data = data;
		next = null;
	}

	public Node<T> getNext(){
		return this.next;
	}
	
	public void setNext(Node<T> newNext){
		this.next = newNext;
		return;
	}
	
	public T getData(){
		return this.data;
	}
	
	public void setData(T newData){
		this.data = newData;
		return;
	}
	

}