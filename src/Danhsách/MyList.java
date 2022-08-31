package Danhsách;
public class MyList<E> {
    private int size=0;
    // do dai mac dinh cua arrayList
    private static final int DEFAULT_CAPACITY=10;

    private E elements[];

    public MyList() {
        elements= (E[]) new Object[DEFAULT_CAPACITY];
    }
    public MyList(int size) {
        elements= (E[]) new Object[size];
    }

    //bolean add(E e)
    public void add(E e) {
        if(size==elements.length){
            size++;
        }
        elements[size++]=e;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public E[] getElements() {
        return elements;
    }

    public void setElements(E[] elements) {
        this.elements = elements;
    }

    //void add(int index, E e)
    public boolean addToIndex(int index, E e){
        if(index>=0 && index<=size){
            size++;
            for(int i=size-1; i>=index; i--){
                elements[i+1]= elements[i];
            }
            elements[index]= e;
            return true;
        }
        return false;
    }
    //E remove(int index)
    public boolean removeToIndex(int index){
        if(index>=0 && index<size){
            for(int i=index; i<size;i++){
                elements[i]= elements[i+1];
            }
            size--;
            return true;
        }
        return false;
    }
    // int size
    public int getSize() {
        return size;
    }


    //E clone
    @Override
    public MyList clone() {
        MyList<E> clone = new MyList<>(elements.length);
        for (E x : elements) {
            clone.add(x);
        }
        return clone;
    }
    //boolean contains(E e)
    public boolean contains(E e){
        for(int i=0; i<size;i++){
            if(elements[i].equals(e)){
                return true;
            }
        }
        return false;
    }
    //int indexOf(E e)
    public int indexOf(E e){
        for(int i=0; i<size;i++){
            if(elements[i].equals(e)){
                return i;
            }
        }
        return -1;
    }
    //E get(int i)
    public E get(int index){
        return elements[index];
    }
    //public void clear()
    public  void clear(){
        for(int i=0; i<size;i++){
            elements[i]=null;
        }
        ensureCapacity(DEFAULT_CAPACITY);
    }
    //void ensureCapacity(int minCapacity)
    public void ensureCapacity(int minCapacity){
        this.size=DEFAULT_CAPACITY;
    }

    public static void main(String[] args) {


        MyList<String> myList1= new MyList<String>();

        myList1.addToIndex(0,"tham");
        System.out.println("List: ");
        for(int i=0; i<myList1.size;i++){
            System.out.println(myList1.get(i));
        }

    }
}

