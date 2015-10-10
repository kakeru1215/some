package kakeru_201510;

import java.util.*;
//二分探索木结构的实现
//实现了二分探索木结构的增加节点，遍历，搜寻功能，返回ArrayList的功能

public class treeTest {
	public static void main(String[] args){
		tree tree01 = new tree();
		tree01.add(90);
		tree01.add(95);
		tree01.add(85);
		tree01.add(105);
		tree01.add(110);
		
		System.out.println(tree01.search(110));
		tree01.iterator();
		
		System.out.println();
		
		//泛型测试
		ArrayList<? super Integer> list01 = tree01.getList();
		for(Object tmp:list01){
			if(tmp instanceof Integer){
			System.out.print((Integer)tmp + " ");
			}
		}
	}
}


//节点类
class node{
	node parent=null;
	node left_brunch=null;
	node right_brunch=null;
	int repo=0;
	
	public boolean add(int repo){
		if(repo>this.repo){
			if(right_brunch==null){
				right_brunch = new node();
				right_brunch.repo=repo;
				return true;
			}
			return right_brunch.add(repo);
			
		}
		if(repo<this.repo){
			if(left_brunch==null){
				left_brunch=new node();
				left_brunch.repo=repo;
				return true;
			}
			return left_brunch.add(repo);
		}
		return false;
	}
	
	public void iterator(){
		if(left_brunch!=null){
			left_brunch.iterator();
			System.out.print(left_brunch.repo + " ");
		}
		if(right_brunch!=null){
			right_brunch.iterator();
			System.out.print(right_brunch.repo + " ");
		}
	}
	
	public boolean search(int repo){
		if(this.repo==repo){
			return true;
		}
		if(this.repo < repo){
			if(right_brunch!=null){
				return right_brunch.search(repo);
			}
			return false;
		}else{
			if(left_brunch!=null){
				return left_brunch.search(repo);
			}
			return false;
		}
		
	}
	
	public ArrayList<Integer> getList(){
		ArrayList<Integer> list = new ArrayList<>();
		
		if(left_brunch!=null){
			left_brunch.iterator();
			list.add(left_brunch.repo);
		}
		if(right_brunch!=null){
			right_brunch.iterator();
			list.add(right_brunch.repo);
		}
		return list;
	}
}



//木类
class tree{
	node root;
	public tree(){
		this(100);	
	}
	public tree(int repo){
		root=new node();
		root.repo=repo;
	}
	public boolean add(int repo){
		if(root==null){
			return false;
		}
		return root.add(repo);
	}
	public void iterator(){
		if(root==null){
			return;
		}
		root.iterator();
		System.out.print(root.repo);
	}
	public boolean search(int repo){
		if(root==null){
			return false;
		}
		return root.search(repo);
	}
	
	public ArrayList<Integer> getList(){
		if(root==null){
			return null;
		}
		ArrayList<Integer> list01 = root.getList();
		list01.add(root.repo);
		return list01;
	}
}