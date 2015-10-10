package kakeru_201510;

public class listQueStack {
//list queue stack
	public static void main(String[] args){
	//list Test
	list<String> list01 = new list<>(5);	
	list01.getHead().repo = "Hello";
	list01.getHead().next.repo = "World";
	list01.Iterate();
	
	//list 双向
	listTwi<Integer> listTwi01 = new listTwi<>(4);
	listTwi01.getHead().repo = 10;
	listTwi01.getHead().next.repo = 100;
	listTwi01.getTail().repo = 10000;
	listTwi01.getTail().previous.repo = 1000;
	listTwi01.IterateFromHead();
	listTwi01.IterateFromTail();
	
	//queue FIFO
	queue<String> que01 = new queue<>();
	ceil<String> ceil01 = new ceil<>();
	ceil<String> ceil02 = new ceil<>();
	ceil01.repo = "Hello";
	ceil02.repo = "World";
	que01.enq(ceil01);
	que01.enq(ceil02);
	que01.deqAll();
	
	//Stack FILO
	stack<Integer> stk01 = new stack<>();
	ceilTwi<Integer> twi01 = new ceilTwi<>();
	ceilTwi<Integer> twi02 = new ceilTwi<>();
	ceilTwi<Integer> twi03 = new ceilTwi<>();
	twi01.repo=1;
	twi02.repo=2;
	twi03.repo=3;
	stk01.push(twi01);
	stk01.push(twi02);
	stk01.push(twi03);
	stk01.popAll();


	}
}


/*
 List 单向链表 repo可以做存储一些数据用  两个构造器  其中一个可以指定生成某一长度的链表
 */
class ceil<E>{
	ceil<E> next;
	E repo;
}
class list<E>{
	protected ceil<E> head;
	protected ceil<E> tail;
	list(){
		head=new ceil<E>();
		tail=head;
	}
	list(int n){
		this();
		for(int i=0;i<n-1;i++){
			tail.next=new ceil<E>();
			tail=tail.next;
		}
	}
	ceil<E> getHead(){
		return this.head;
	}
	ceil<E> getTail(){
		return this.tail;
	}
	void Iterate(){
		ceil<E> pointer = head;
		while(pointer != null){
			System.out.println(pointer.repo);
			pointer = pointer.next;
		}
	}
}

/*
List 双向链表 repo可以做存储一些数据用  两个构造器  其中一个可以指定生成某一长度的链表
*/

class ceilTwi<E>{
	ceilTwi<E> next;
	ceilTwi<E> previous;
	E repo;
}
class listTwi<E>{
	protected ceilTwi<E> head;
	protected ceilTwi<E> tail;
	
	public listTwi(){
		head = new ceilTwi<E>();
		tail=head;
	}
	public listTwi(int n){
		this();
		for(int i=0;i<n-1;i++){
			tail.next=new ceilTwi<E>();
			tail.next.previous=tail;
			tail=tail.next;
		}
	}
	ceilTwi<E> getHead(){
		return this.head;
	}
	ceilTwi<E> getTail(){
		return this.tail;
	}
	void IterateFromHead(){
		ceilTwi<E> pointer = head;
		while(pointer != null){
			System.out.println(pointer.repo);
			pointer = pointer.next;
		}
	}	
	void IterateFromTail(){
		ceilTwi<E> pointer = tail;
		while(pointer != null){
			System.out.println(pointer.repo);
			pointer = pointer.previous;
		}
	}	
}


/*
Queue 双向链表 repo可以做存储一些数据用  两个构造器  其中一个可以指定生成某一长度的链表
*/

class queue<E> extends list<E>{
	public queue(){
		super();
	}
	public queue(int n){
		super(n);
	}
	public ceil<E> deq(){
		ceil<E> out = head;
		head=head.next;
		return out;
	}
	public void enq(ceil<E> in){
		tail.next=in;
		tail=in;
	}
	public void deqAll(){
		while(true){
			if(head.next == null){
				System.out.println(deq().repo);	
				break;
			}
			System.out.println(deq().repo);
		}
	}
}


class stack<E> extends listTwi<E>{
	public stack(){
		super();
	}
	public stack(int n){
		super(n);
	}
	public void push(ceilTwi<E> in){
		tail.next=in;
		tail.next.previous=tail;
		tail=in;
		
	}
	public ceilTwi<E> pop(){
		ceilTwi<E> out = tail;
		tail=tail.previous;
		return out;
	}
	public void popAll(){
		while(true){
			if(tail.previous==null){
				System.out.println(pop().repo);
				break;
			}
			System.out.println(pop().repo);
		}
	}
}