package work2;

  // Arrays lo biggest element and smallest element;
/* public class load {

    public static void main(String[] args) {

       int arr[]= {10,20,50,80,90,40,30};
       int small=arr[0];
       int big =arr[0];
       for(int i=0;i<arr.length;++i)
       {
    	   if(big<arr[i])
    	   {
    		   big=arr[i];
    	   }
    	   if(small>arr[i])
    	   {
    	     small=arr[i];
    	   }
       }
       System.out.println(" big :"+big);
       System.out.println(" small :"+small);
       
    }


	}*/
public class load{
	public static void main(String args[]) {
		int ele=90;
		boolean found=false;
		int arr[]= {12,45,67,89,9};
		for(int i=0;i<arr.length;++i)
		{
		 if(ele==arr[i])
		 {
			 System.out.println("presented ");
			 found=true;
		 }
		 
		}
		if(!found)
		{
			System.out.println(" not presented");
		}
		
		{
			
		}
	}
}


