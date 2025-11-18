class Solution {
    public static void sort012(int[] arr) {
        
        int high=arr.length- 1;
        int low =0;
        int mid=0;
        
        
       while(mid<=high){
           if(arr[mid]==0){
               int temp=arr[low];
               arr[low]=arr[mid];
               arr[mid]=temp;
               low++;
               mid++;
           }
           else if(arr[mid]==1){
                   mid++;
               }
               else{
                       int temp=arr[mid];
                       arr[mid]=arr[high];
                       arr[high]=temp;
                       high--;
                   }
               
       }
    }
      public static void printArr(int [] arr){
           System.out.print("[");
           for(int i =0;i<=arr.length;i++){
               System.out.print(arr[i]);
              if (i < arr.length - 1) System.out.print(", ");
               
           }
           System.out.print("]");
       }
        
        public static void main (String []adsf){
            int arr[]={0,0,1,0,1,1,2,1,0};
            sort012(arr);
            printArr(arr);
        }
        
    }
