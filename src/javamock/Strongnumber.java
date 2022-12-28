package javamock;
public class Strongnumber {

	public static void main(String[] args) {
        int n=146;
        int temp=n;
        int sum=0;
        while(n>0) {
        	int rem=n%10;
        	int fact=1;
        	while(rem>0) {
        		fact=fact*rem;
        		rem--;
        	}
        	sum=sum+fact;
        	n=n/10;
        }
        if(sum==temp) {
        	System.out.println(temp+" is a strong number");
        }
        else
        {
        	System.out.println(temp+" is not a strong number");
        }
        	
        	
	}

}
