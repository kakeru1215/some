package kakeru_201510;

import java.util.*;

public class book implements Comparable<book>,Cloneable{
	private String title;
	private String comment;
	private Calendar publishDate;
	
	/*
	 GETTER SETTERÊ¡ÂÔ
	 */
	
	public book(){}
	
	public book(String title,String comment,Calendar publishDate){
		this.title = title;
		this.comment = comment;
		this.publishDate = publishDate;
	}
	
	public int compareTo(book o){
		return this.publishDate.compareTo(o.publishDate);
	}
	
	@Override
	public int hashCode(){
		int result = 11;
		result = result*11+title.hashCode();
		result = result*11+comment.hashCode();
		result = result*11+publishDate.hashCode();
		return result;
	}
	
	@Override
	public String toString(){
		StringBuffer result = new StringBuffer("Title:\t\t" + title);
		result.append("\r\n");
		result.append("Publish Date:\t" + publishDate.get(Calendar.YEAR) + "/" + (publishDate.get(Calendar.MONTH)+1) + "/" + publishDate.get(Calendar.DATE));
		result.append("\r\n");
		result.append("Comment:\t" + comment);
		result.append("\r\n");
		return result.toString();
	}
	
	@Override
	public boolean equals(Object o){
		if(o==this)return true;
		if(o==null)return false;
		if(!(o instanceof book))return false;
		
		book book01 = (book)o;
		if(book01.publishDate.equals(this.publishDate) && book01.title.equals(this.title)){
			return true;
		}
		return false;
	}
	public Object clone(){
		book copy = new book();
		copy.title = this.title;
		copy.comment = this.comment;
		copy.publishDate = (Calendar)this.publishDate.clone();
		return copy;
	}

	public static void main(String[] args){
		Calendar cal = Calendar.getInstance();
		cal.set(2013,7,23,0,0);

		book ob01 = new book("three body problem","a good SF novel.",cal);
		book ob02 = (book)ob01.clone();
		
		System.out.println(ob01);
		System.out.println(ob02);
		System.out.println(ob02.equals(ob01));
		
		ob01.title = "Jurassic Park";
		System.out.println(ob02.equals(ob01));
		System.out.println(ob02.compareTo(ob01));
		
		ob01.publishDate.add(Calendar.YEAR,-1);
		System.out.println(ob02.compareTo(ob01));
		
		System.out.println(ob01);
		System.out.println(ob02);
	}
}
