package kakeru_201510;
import java.io.*;
import java.util.*;

public class collectionTest {
	public static void main(String[] args){
		//collection<E>�ӿ��¶����������ӽӿ�
		//List<E> Queue<E> Set<E> Map<K,V>
		//������List<E>�ӿ�
		
		//ArrayList<E> �൱������ ��˳�� �ɰ�index���ٲ�ѯ��ӦԪ��    ��ѯ����  ���룬 ɾ��Ч�ʵ�
		ArrayList<String> list01 = new ArrayList<>();
		//���Ԫ��   ��ָ��Indexʱλ׷�ӵ�list��β
		list01.add("str01");
		list01.add("str02");
		System.out.println(list01.get(0));
		System.out.println(list01.get(1));
		
		//ָ��indexʱ��������Ԫ�ص���index ��indexԭ��Ԫ�ؽ���������һλ�����Ч�ʵ�
		list01.add(0,"str03");
		System.out.println(list01.get(0));
		System.out.println(list01.get(1));
		System.out.println(list01.get(2));
		
		ArrayList<Integer> list02 = new ArrayList<>();
		list02.add(1);
		//addAll(Collection<? extends E> c) ʵ��ֻ�ܴ�E��E������ΪԪ�صļ���  ����cast�ᱨ��
		//list01.addAll(list02);
		
		//����ָ��Ԫ�ص�һ��/���һ�γ��ֵ�Index
		System.out.println(list01.indexOf(new String("str01")));//Ӧ������equals�����Ƚ�
		System.out.println(list01.lastIndexOf(new String("str01")));
		
		//�滻ָ��index��Ԫ��
		list01.set(0,"str00");
		System.out.println(list01.get(0));
		
		//�Ƴ�ָ��index��Ԫ�أ��Ƴ����index���Ԫ�ؽ�������ǰ�ܣ����Ч�ʽϵ�
		list01.remove(0);
		System.out.println(list01.get(0));
		System.out.println(list01.get(1));
		
		//listIterator  Iterabel�ӿڵ��ӽӿ�
		ListIterator<String> iterator01 = list01.listIterator();
		while(iterator01.hasNext()){
			System.out.print((iterator01.nextIndex() + 1) +"��Ԫ����:");
			System.out.println(iterator01.next());
		}
		
		//һЩCollection�ӿڵķ���
		System.out.println(list01.isEmpty());//false
		System.out.println(list01.size());//2
		System.out.println(list01.contains("str01"));//true  ����equals("str01")
		
		Object[] objects = list01.toArray();//����Object[] 
		for(Object i:objects){
			if(i instanceof String){
				//ת����String
				System.out.println((String)i);
			}
		}
		
		String[] strings = new String[2];
		strings=list01.toArray(strings);//���ش���������͵����� <T> T[] toArray(T[] a)����˲�������ת��
		for(String i:strings){
			System.out.println(i);
		}
		
		list01.clear();//��ռ���
		System.out.println(list01.isEmpty());//true
		
		
		
		//LinkedList<E> ˫������ ׷��ɾ��Ԫ�ؿ��� ����ѯЧ�ʽϵ�
		//������Ϊstack��queueʹ��
		
		LinkedList<String> link01 = new LinkedList<>();
		//���ף���β׷��Ԫ��
		link01.addFirst("str01");
		link01.addLast("str02");
		//���ص�һ��Ԫ�أ��������һ��Ԫ��
		System.out.println(link01.getFirst());
		System.out.println(link01.getLast());
		//���ص�һ��Ԫ�أ���ɾ����һ��Ԫ��
		System.out.println(link01.removeFirst());
		System.out.println(link01.removeLast());
		
		//stack FILO
		link01.push("str01");
		link01.push("str02");
		//������ɾ��  
		System.out.println(link01.pop());
		System.out.println(link01.pop());
		
		//queue FIFO
		link01.offerFirst("str01");
		link01.offerFirst("str02");
		System.out.println(link01.pollLast());
		System.out.println(link01.pollLast());
		
		//Set ���ظ�Ԫ�صļ��� Ӧ��Set�ӿں�SortedSet���Ĭ�ϰ��������򣬸���ָ����comparator���԰���������
		//HashSet
		HashSet<Integer> set01 = new HashSet<>();
		set01.add(1);
		set01.add(2);
		set01.add(2);//�������ظ�Ԫ�أ����Բ��ᱻ���
		set01.add(4);
		set01.add(3);
		set01.add(6);
		set01.add(5);
		Iterator<Integer> ite01 = set01.iterator();
		while(ite01.hasNext()){
			System.out.println(ite01.next());
		}
		
		
		//TreeSet<E> Ӧ��̽������ľ�ṹ�ļ��� ʵ����Ԫ�ص�����
		TreeSet<Integer> tree01 = new TreeSet<>(new Comparator<Integer>(){//��������������ʱ��Ҫ�ƶ��������ͣ���ָ�����̳и������ȷ����
			//���ڹ�����TreeSet(Comparator<? super E> comparator):
			//Ϊʲô��<? super E>������<? extends E> Ҳ����˵�β�����E��E�ĸ���ΪԪ�ص�comparator
			//��Ϊcomparator<? super E>�е�compare(? super E a,? super E b)��Ҫ����E���͵�ʵ�Σ�����a,b�βε����ͱ�����E��E�ĸ���
			//����˴���? extends E�Ļ� �������β���E����������������޷�cast���������
			
			
			
			public int compare(Integer a,Integer b){
				//TreeSet�ǰ���compare�ķ���ֵ���������
				//Ĭ��Ϊreturn a.compareTo(b)  a>bΪ1 a=bΪ0 a<bΪ-1 ��ʱΪ����
				//�����Ϊ���� ��һ�µ�ת����
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

