package kakeru_201510;
import java.util.*;

public class SearchAlgorithm {
	//目标数组
	static int[] nums = new int[]{1,10,11,110,111,2,12,20,22,222};
	static boolean result =false;
	static int object = 1024; 
	
	private static void printResult(boolean result){
		if(result){
			System.out.println("找到" + object);
		}else{
			System.out.println("没有找到" + object);
		}
		
	}
	
	public static void main(String[] args){
	//线性查找算法
	for(int i =0;i<nums.length;i++){
		if(nums[i] != object){
			continue;
		}
		result=true;
	}
	SearchAlgorithm.printResult(result);
	
	
	
	//2分查找算法 实现1
	//首先要给目标数组排序
	Arrays.sort(nums); 
	int low=0;
	int high=nums.length-1;
	int mid=(low + high)/2;
	result =false;
	while(mid>low&&mid<high){
		if(object==nums[low]){
			result=true;
			break;
		}
		if(object==nums[high]){
			result=true;
			break;			
		}
		if(object==nums[mid]){
			result=true;
			break;			
		}
		if(object>nums[low] && object<nums[mid]){
			high=mid;
			mid=(low + high)/2;
			}else if(object>nums[mid] && object<nums[high]){
				low=mid;
				mid=(low + high)/2;
				}else{
					break;
		}
	}
	SearchAlgorithm.printResult(result);
	
	//2分查找算法 实现2
	low=0;
	high=nums.length-1;
	mid=(low + high)/2;
	result =false;
	
	while(low<=high){
		mid=(low + high)/2;
		if(object==nums[mid]){
			result=true;
			break;
		}
		if(object>nums[mid]){
			low=mid+1;
		}else{
			high=mid-1;
		}
	}
	SearchAlgorithm.printResult(result);
	}
		
}
