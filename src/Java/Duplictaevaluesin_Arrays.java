package Java;

public class Duplictaevaluesin_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] ={1,2,3,4,4,3,5,6,7,7,6,7};
		//int count = 0;
		System.out.println("duplicate values  in array");
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[j]);
				}
			}
		}
	//System.out.println("counts are:"+count);
	}

}
