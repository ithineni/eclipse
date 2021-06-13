package InterviewScripts;

public class MissingNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
						
		}
		System.out.println(sum);
		int sum1=0;
		for(int j=1;j<=5;j++) {
			sum1=sum1+j;
		}
		System.out.println(sum1);
		System.out.println("The missing number is::" +(sum1-sum));

	}

}
