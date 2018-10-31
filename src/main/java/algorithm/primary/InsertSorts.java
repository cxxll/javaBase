package algorithm.primary;


//插入排序
public class InsertSorts {

    //验证数组是否为空或数据只有一条数据
    public static void InsertSort(int[] arr){
		if(arr == null || arr.length < 2) {
			return;
		}
		for(int i = 1;i < arr.length;i++) {
			for(int j = i - 1;j >= 0 && arr[j] < arr[j+1];j--) {
				swap(arr,j,j + 1);
			}
		}
	}
	
	
	
	public static void swap(int arr[],int i,int j) {
		int temp = arr[i];
		arr[i]  =  arr[j];
		arr[j]  = temp;
	}
}
