package kakeru_201510;
import java.util.*;
public class sortAlgorithm {

	static int[] nums = new int[]{1,6,3,7,9,8,2,10,4,5};
	public static void main(String[] args){
		//Ã°ÅÝ·¨ÅÅÐò	
		int tmp=0;
		for(int x=nums.length-2;x>=0;x--){
			for(int y=0;y<=x;y++){
				if(nums[y]<=nums[y+1]){
					continue;
				}
				tmp=nums[y];
				nums[y]=nums[y+1];
				nums[y+1]=tmp;
			}
		}
		System.out.println(Arrays.toString(nums));
		//Ñ¡Ôñ·¨ÅÅÐò
		nums = new int[]{1,6,3,7,9,8,2,10,4,5};
		int max;
		for(int x=nums.length-1;x>=1;x--){
			max=0;
			for(int y=1;y<=x;y++){
				if(nums[max] < nums[y]){
					max=y;
				}
			tmp=nums[x];
			nums[x]=nums[max];
			nums[max]=tmp;
			}
		}
		System.out.println(Arrays.toString(nums));
		
	}

	
}
