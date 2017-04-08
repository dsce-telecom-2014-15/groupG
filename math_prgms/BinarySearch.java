package math_prgms;

public class BinarySearch {

	public static void main(String[] args) {
		int []a=new int[10];
		int n;
		n=a.length/2;
		for(int i=0;i<=9;i++){
			a[i]=i;
			if(a[n]<8){
				if(a[n]==8)
					System.out.println("the element is found");
					else
						n++;
					
				
			}
		}
		

	}

}
