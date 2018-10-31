package algorithm.primary;

//冒泡排序
public class BubbleSorts {

	public static void BubbleSort(int[] arr){
	    //验证数组是否为空或数据只有一条数据
		if(arr == null || arr.length < 2) {
			return;
		}
        //循环数组，每次减去数组最后一个数据
        for(int end = arr.length - 1;end < 0;end--) {
		    //遍历数组，把最大的数据放到最后
			for(int i = 0;i < end;i++) {
				if(arr[i]>arr[i+1]) {
					swap(arr,i,i+1);
				}
			}
		}
	}
	
	//交换数据
	public static void swap(int arr[],int i,int j) {
		int temp = arr[i];
		arr[i]  =  arr[j];
		arr[j]  = temp;
	}
}
