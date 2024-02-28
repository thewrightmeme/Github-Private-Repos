import java.util.*;

public class ArrayList_Wright<E> extends AbstractList<E> implements List<E> {
	private E[] array;
	private int size;

	public ArrayList_Wright(){
		this.array = (E[]) new Object[10];
		this.size = 0;
	}

	public ArrayList_Wright(int initialCapacity){
		this.array = (E[]) new Object[initialCapacity];
		this.size = 0;
	}

	public ArrayList_Wright(Collection<? extends E> c){
		this.array = (E[]) c.toArray();
		this.addAll(c);
		this.size = c.size();
	}
	
	public int size(){
		return size;
	}

	public E get(int index){
		return array[index];
	}

	public void ensureCapacity(int minCapacity) {
		if(minCapacity> array.length){
			int newCapacity = (array.length * 3/2) +1;
			if (newCapacity < minCapacity){
				newCapacity = minCapacity;
			}
		}
		E[] tempArray = (E[]) new Object [minCapacity];		
		for(int i = 0; i < size; i++){
			tempArray[i] = array[i];
		}
		array = tempArray;
	}
	
	public E set(int index, E element){
		E oldElement = this.array[index];
		this.array[index] = element;
		return oldElement;
	}

	public boolean add(E element){
		ensureCapacity(size + 1);
		array[size] = element;
		size++;
		return true;
	}

	public void add(int index, E element){
		if(index < 0||index>size){
			throw new IndexOutOfBoundsException();
		}
		ensureCapacity(size+1);
		for(int i = size; i > index; i--){
			array[i]= array[i-1];
		}
		array[index] = element;
		size++;
	}
	public void clear(){
		this.array = (E[]) new Object[10];
		this.size = 0;
		}  

	public List<E> subList(int fromIndex, int toIndex){
		if(fromIndex < 0 || toIndex > size || toIndex < fromIndex){
				throw new IndexOutOfBoundsException();
		}
		int subListSize = toIndex-fromIndex;
		ArrayList_Wright<E> sublist = new ArrayList_Wright<>(subListSize);

		for(int i = fromIndex; i < toIndex; i++){
			sublist.add(array[i]);
		}
		return sublist;
	}
	
	public void trimToSize(){
		this.ensureCapacity(this.size());
	}

	public boolean contains(Object o){
		for (int i = 0; i < size; i++){
			if(o.equals(array[i])){
				return true;
			}
		}
		return false;	
	}
	public int indexOf(Object o){
		for(int i = 0 ; i <= size; i++){
			if(array[i].equals(o)){
				return i;
			}
		}
		return -1;
	}
	
	public int lastIndexOf(Object o){
		for(int i = 0 ; i <= size; i++){
			if(array[i].equals(o)){
				return i;
			}
		}
		return -1;
	}
	public boolean remove(Object o) {
		for(int i = 0; i < array.length; i++){
			if(array[i].equals(o)){
				array[i] = array[array.length-1];
				this.size--;
				return true;
			}
		}
		return false;
	}
	public E remove(int index){
		if(index < 0 || index >= size()){
			throw new IndexOutOfBoundsException();
		}
		if(index >= 0 && index <= size){
			for(int i=0; i < array.length; i++){
				if(i==index){
					array[index] =array[array.length-1];
					this.size--;
				}
			}
		}
		return array[index];
	}
	public void removeRange(int fromIndex, int toIndex){
		if(fromIndex < 0 || toIndex > size || toIndex < fromIndex || fromIndex >= size){
			throw new IndexOutOfBoundsException();
		}
		int toFrom = toIndex-fromIndex;
		for(int i = fromIndex; i < size - toFrom; i++){
			array[i]= array[i+toFrom];
		}
		for(int i = size-toFrom;i < size; i++){
			array[i]=null;
		}
		size-=toFrom;
	}
	
	public E[] toArray(){
		E[] yes = (E[]) new Object[size];

		for(int i = 0; i < size; i++){
			yes[i] = array[i];
		}

		return yes;
	}
}