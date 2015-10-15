package kakeru_201510;
import java.io.*;
import java.util.*;

public class collectionTest {
	public static void main(String[] args){
		//collection<E>接口下定义着以下子接口
		//List<E> Queue<E> Set<E> Map<K,V>
		//先来看List<E>接口
		
		//ArrayList<E> 相当于数组 带顺序 可按index快速查询相应元素    查询快速  插入， 删减效率低
		ArrayList<String> list01 = new ArrayList<>();
		//添加元素   不指定Index时位追加到list结尾
		list01.add("str01");
		list01.add("str02");
		System.out.println(list01.get(0));
		System.out.println(list01.get(1));
		
		//指定index时，将插入元素到此index 此index原有元素将依次向后窜一位，因此效率低
		list01.add(0,"str03");
		System.out.println(list01.get(0));
		System.out.println(list01.get(1));
		System.out.println(list01.get(2));
		
		ArrayList<Integer> list02 = new ArrayList<>();
		list02.add(1);
		//addAll(Collection<? extends E> c) 实参只能传E或E的子类为元素的集合  否则cast会报错
		//list01.addAll(list02);
		
		//返回指定元素第一次/最后一次出现的Index
		System.out.println(list01.indexOf(new String("str01")));//应该是用equals方法比较
		System.out.println(list01.lastIndexOf(new String("str01")));
		
		//替换指定index的元素
		list01.set(0,"str00");
		System.out.println(list01.get(0));
		
		//移除指定index的元素，移除后该index后的元素将依次向前窜，因此效率较低
		list01.remove(0);
		System.out.println(list01.get(0));
		System.out.println(list01.get(1));
		
		//listIterator  Iterabel接口的子接口
		ListIterator<String> iterator01 = list01.listIterator();
		while(iterator01.hasNext()){
			System.out.print((iterator01.nextIndex() + 1) +"号元素是:");
			System.out.println(iterator01.next());
		}
		
		//一些Collection接口的方法
		System.out.println(list01.isEmpty());//false
		System.out.println(list01.size());//2
		System.out.println(list01.contains("str01"));//true  调用equals("str01")
		
		Object[] objects = list01.toArray();//返回Object[] 
		for(Object i:objects){
			if(i instanceof String){
				//转换成String
				System.out.println((String)i);
			}
		}
		
		String[] strings = new String[2];
		strings=list01.toArray(strings);//返回传入参数类型的数组 <T> T[] toArray(T[] a)，因此不用类型转换
		for(String i:strings){
			System.out.println(i);
		}
		
		list01.clear();//清空集合
		System.out.println(list01.isEmpty());//true
		
		
		
		//LinkedList<E> 双向链表 追加删除元素快速 ，查询效率较低
		//可以作为stack和queue使用
		
		LinkedList<String> link01 = new LinkedList<>();
		//链首，链尾追加元素
		link01.addFirst("str01");
		link01.addLast("str02");
		//返回第一个元素，返回最后一个元素
		System.out.println(link01.getFirst());
		System.out.println(link01.getLast());
		//返回第一个元素，并删除第一个元素
		System.out.println(link01.removeFirst());
		System.out.println(link01.removeLast());
		
		//stack FILO
		link01.push("str01");
		link01.push("str02");
		//弹出并删除  
		System.out.println(link01.pop());
		System.out.println(link01.pop());
		
		//queue FIFO
		link01.offerFirst("str01");
		link01.offerFirst("str02");
		System.out.println(link01.pollLast());
		System.out.println(link01.pollLast());
		
		//Set 无重复元素的集合 应用Set接口和SortedSet解耦（默认按升序排序，根据指定的comparator可以按降序排序）
		//HashSet
		HashSet<Integer> set01 = new HashSet<>();
		set01.add(1);
		set01.add(2);
		set01.add(2);//不允许重复元素，所以不会被添加
		set01.add(4);
		set01.add(3);
		set01.add(6);
		set01.add(5);
		Iterator<Integer> ite01 = set01.iterator();
		while(ite01.hasNext()){
			System.out.println(ite01.next());
		}
		
		
		//TreeSet<E> 应用探索二分木结构的集合 实现了元素的排序
		TreeSet<Integer> tree01 = new TreeSet<>(new Comparator<Integer>(){//声明泛型匿名类时需要制定泛型类型，即指定所继承父类的明确类型
			//关于构造器TreeSet(Comparator<? super E> comparator):
			//为什么是<? super E>而不是<? extends E> 也就是说形参是以E或E的父类为元素的comparator
			//因为comparator<? super E>中的compare(? super E a,? super E b)需要接受E类型的实参，所以a,b形参的类型必须是E或E的父类
			//如果此处是? extends E的话 ，会有形参是E的子类的情况，则会无法cast而编译出错
			
			
			
			public int compare(Integer a,Integer b){
				//TreeSet是按照compare的返回值进行排序的
				//默认为return a.compareTo(b)  a>b为1 a=b为0 a<b为-1 此时为升序
				//若想改为降序 则按一下掉转即可
				return b.compareTo(a);
			}
		});
		tree01.addAll(set01);
		ite01 = tree01.iterator();
		while(ite01.hasNext()){
			System.out.println(ite01.next());
		}
		
		
		
	}
}

