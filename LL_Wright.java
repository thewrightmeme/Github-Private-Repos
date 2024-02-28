import java.lang.*;

public class LL_Wright<T> implements LinkedListInterface<T> {
	private Node<T> first;
	
	public LL_Wright(){
		first = null;
	}

	public boolean contains(T element){
		//init current = first//
		Node<T> current = first;
		while(current != null){
			if(current.getData().equals(element)){
				return true;
			}
			current= current.getNext();
		}
		return false;
	}

	public int indexOf(T element){
		Node<T> current = first;
		//sets index to 0 (for the first piece of element)
		int index = 0;
		while(current != null){
			if(current.getData().equals(element)){
				return index;
			}
			current = current.getNext();
			index++;
		}
		return -1; //element doesn't exist//
	}
	
	public int lastIndexOf(T element){
		//init current to first
		Node<T> current = first;
		int lastIndex = -1;
		int index = 0;
		while(current != null){
		//if current (based on the data recieved) equals the element, it makes the lastIndex equal the value of the index
			if(current.getData().equals(element)){
				lastIndex = index;
			}
			current = current.getNext();
			index++;
		}
		//returns the last index
		return lastIndex;
	}

	public boolean isEmpty(){
		//if first is equal to null, then the rest of the list is empty
		return first == null;
	}
	
	public int size(){
		//sets size to 0 (for the starting size of data)
		int size = 0;
		//init current to first
		Node<T> current = first;
		//while current does not equal null
		while(current != null){
		//the size continue increase to match the amount of elements in the list
			size++;
			current = current.getNext();
		}
		//returns the size
		return size;
	}
	public T get(int index){
		//if the index given is before 0, the exception is thrown (to signify that u can't do that)
		if (index < 0||index>= this.size()){
			throw new IndexOutOfBoundsException("index not here");
		}
		//init current to first
		Node<T> current = first;
		//altIndex is used for going through the list, without changing the value of the index we actually need
		int altIndex = 0;
		//while current does not equal null
		while(current != null){
			//if the index (in the parameters) equals altIndex
			if(index == altIndex){
			//it will get the data at that current point
				return current.getData();
			}
			//if the index (in the parameters) doens't equal the altIndex, it moves on to the next data piece (as well increasing the altIndex to match with it)
			altIndex++;
			current = current.getNext();
		}
		throw new IndexOutOfBoundsException("nuh uh, no index");
	}
		
	public T set(int index, T element){
		//if the index given is before 0, the exception is thrown (to signify that u can't do that)
		if (index < 0 || index > this.size()){
			throw new IndexOutOfBoundsException("nuh uh, no index");
		}
		//init current to first and previous element as null
		Node<T> current = first;
		//altIndex is used for going through the list, without changing the value of the index we actually need
		int altIndex = 0;
		//while current does not equal null
		while(current != null){
			//if the index (in the parameters) equals altIndex
			if(index == altIndex){
			//it will return the element being replaced, then set the new element being input
				T previous = current.getData();
				current.setData(element);
				return previous;

			}
			//if the index (in the parameters) doens't equal the altIndex, it moves on to the next data piece (as well increasing the altIndex to match with it)//
			current = current.getNext();
			altIndex++;
		}

		return element;
	}
	//if first is equal to null, then the rest of the list is empty
	public void clear(){
		first=null;
	}
	
	public void add(T element){
		//initializes the element and connects it to your linked list
		Node<T> newNode = new LLNode_Wright<>(element);

		if(first == null) {
			first = newNode;
		}
		else{
			
			//Init previous to null
			Node<T> previous = null;
			//Init next to first//
			Node<T> next = first;
			//goes through the list the entire list, up to null//
			while(next != null){
				previous = next;
				next = next.getNext();
			}
			//after getting to the very end of the list, if previous is not null (mean that "Next" is = null), then null will be replaced by the element//
			previous.setNext(newNode);
		}
		
	}

	public void add(int index, T element){
		//if the index given is before 0, the exception is thrown (to signify that u can't do that)
		if (index < 0 || index > this.size()){
			throw new IndexOutOfBoundsException("Nuh uh, that index doesn't index");
		}

		Node<T> newNode = new LLNode_Wright<>(element);
		
		if(index==0){
			newNode.setNext(first);
			first = newNode;
		}
		else{
			
			Node<T> previous = null;
			Node<T> next = this.first;
			int altIndex = 0;
			while(next != null && altIndex < index){

				previous = next;
				next = next.getNext();
				altIndex++;
			}
			//if altIndex = the index we are looking for, then data next to previous to be the element, and whatever element is next to as what it replaced (next)//
			if(altIndex == index){
				if (previous != null){
				previous.setNext(newNode);
				}
				newNode.setNext(next);
			}
		}
	}

	public T remove(int index){
	//if the index given is before 0, the exception is thrown (to signify that u can't do that)
		if (index < 0 || index > this.size()){
			throw new IndexOutOfBoundsException("Nuh uh, that index doesn't index");
		}

		T removedElement = null;
		if(index==0){
			removedElement = first.getData();
			first = first.getNext();
		}
		else{
		Node<T> previous = null;
		//Init next to first
		Node<T> next = first;
		//index used to follow along with list//
		int altIndex = 0;
		//goes through the list the entire list, up to null//
		while(next != null && altIndex < index){
			previous = next;
			next = next.getNext();
			altIndex++;
		}
		
		//if altIndex = the index we are looking for, and next is an element 
		if(altIndex == index && next != null){
			//Based on where our while loop stoped, Remove the element by updating whatever is next to "previous", to be whatever is next to "next". Otherwise, it will set first to be whatever next is (assuming first was the one removed)
			removedElement = (T) next.getNext();
			if (previous != null){
				previous.setNext(next.getNext());
			}
			else {
				first = next.getNext();
			}
		} 
	}

		return removedElement;

	}

	public boolean remove (T element){
		//Init previous to null//
		Node<T> previous = null;
		//Init next to first
		Node<T> next = first;
		//goes through the list the entire list, up to null//
		while(next != null){	
			//removes the element by updating what is next to previous
			if(next.getData().equals(element)){
				if(previous == null){
					//if the element removed is the first element, make first equal what would be next to it//
					first = (Node<T>)next.getData();
				}
				//otherwise//
				else{
					previous.setNext(next.getNext());
				}
				return true;
			}
			
			previous = next;
			next = next.getNext();
		}
		return false;
	}
	
}
	