package listdemo;
/**
 * Demo class
 *
 * @author keriezhang
 * @date 2016/10/31
 * 二分查找法
 */
public class bsearch {
    public static void main(String[] args) {
        int [] arr= new int[]{1,2,3,4,5,7,8,89};
        int [] arr1=new int[]{2,6,9,9,48,48,48,56};
        /*System.out.println(new bsearch().bsearchdemo(arr1,arr1.length,48));*/
        System.out.println(new bsearch().bsearchdemo3(arr1,arr1.length,48));
    }
    /*二分查找法  简单适用于有序不重复*/
    public int bsearchdemo(int[] arr,int n,int value){
        int low=0;
        int hight=n-1;
        while (low<=hight){
            int mid=(low+hight)/2;
            if(arr[mid]==value){
                return mid;
            }else if(arr[mid]<value){
                  low=mid+1;
            }else {
                hight=mid-1;
            }
        }
        return -1;
    }
    //当有重复数据时 查找第一个值等于给定值的元素
    public int bsearchdemo2(int[] arr,int n,int value){
        int low=0;
        int hight=n-1;
        while (low<=hight){
            int mid=low+((hight-low)>>1);
            if (arr[mid]>value){
                hight=mid-1;
            }else if (arr[mid]<value){
                low=mid+1;
            }else{
                if ((mid==0)||(arr[mid-1]!=value)){
                    return mid;
                }else{
                    hight=mid-1;
                }
            }
        }
        return -1;
    }
    //当有重复数据时 查找最后一个值等于给定值的元素
    public int bsearchdemo3(int[] arr,int n,int value){
        int low=0;
        int hight=n-1;
        while (low<=hight){
            int mid=low+((hight-low)>>1);
            if (arr[mid]>value){
                hight=mid-1;
            }else if (arr[mid]<value){
                low=mid+1;
            }else{
                if ((mid==n-1)||(arr[mid+1]!=value)){
                    return mid;
                }else{
                    low=mid+1;
                }
            }
        }
        return -1;
    }
    //当有重复数据时 查找第一个值大于给定值的元素
    public int bsearchdemo4(int[] a, int n, int value) {
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid =  low + ((high - low) >> 1);
            if (a[mid] >= value) {
                if ((mid == 0) || (a[mid - 1] < value)){ return mid;}
                else{ high = mid - 1;}
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
    //当有重复数据时 查找最后一个小于等于给定值的元素
    public int bsearch7(int[] a, int n, int value) {
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid =  low + ((high - low) >> 1);
            if (a[mid] > value) {
                high = mid - 1;
            } else {
                if ((mid == n - 1) || (a[mid + 1] > value)){ return mid;}
                else {low = mid + 1;}
            }
        }
        return -1;
    }
}
