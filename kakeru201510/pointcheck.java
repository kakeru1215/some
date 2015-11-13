package kakeru_201510;
import java.util.*;
import static kakeru_201510.sex.*;
import static kakeru_201510.grades.*;
import static kakeru_201510.classes.*;

enum sex{MALE,FEMALE;}
enum grades{ONE,TWO,THREE,FOUR;}
enum classes{A,B,C;}

class student implements Comparable<student>{
	private String NAME;
	private sex SEX;
	private grades GRADE;
	private classes CLASS;
	private HashMap<String,Byte> POINT;
	
	public student(String NAME,sex SEX,grades GRADE,classes CLASS,HashMap<String,Byte> POINT){
	}
	public String getName(){
		return this.NAME;
	}
	public sex getSex(){
		return this.SEX;
	}
	public grades getGradees(){
		return this.GRADE;
	}
	public classes getClasses(){
		return this.CLASS;
	}
	public HashMap<String,Byte> getPoint(){
		if(POINT instanceof HashMap){
			Object tmp = this.POINT.clone();
			return (HashMap<String,Byte>)tmp;
		}
		return null;
	}
	public void setName(String NAME){
		if(!NAME.isEmpty())this.NAME = NAME;
	}
	public void setSex(sex SEX){
		this.SEX = SEX;
	}
	public void setGrades(grades GRADE){
		this.GRADE = GRADE;
	}
	public void setClasses(classes CLASS){
		this.CLASS = CLASS;
	}
	public void setPoint(HashMap<String,Byte> POINT){
		if(POINT instanceof HashMap){
			Object tmp = POINT.clone();
			this.POINT = (HashMap<String,Byte>)tmp;
		}
	}
	
	@Override
	public int compareTo(student a){
		if(a.NAME == null){
			return 1;
		}
		if(this.NAME == null){
			return -1;
		}
		return this.NAME.compareTo(a.NAME);
	}
	
	@Override
	public boolean equals(Object a){
		if(a instanceof student){
			student tmp = (student)a;
			if(tmp == this){return true;}
			if(tmp.NAME == null){return false;}
			return this.NAME.equals(tmp.NAME);
		}
		return false;
	}
	
	@Override
	public int hashCode(){
		int result = 10;
		result+=NAME.hashCode();
		result+=SEX.hashCode();
		result+=GRADE.hashCode();
		result+=CLASS.hashCode();
		result+=POINT.hashCode();
		return result;
	}
}
