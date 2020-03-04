class Plus  
{

	public static void main(String args[])throws Exception
	{
	
		int n,i,k;
		System.out.print("Bir sayi girin : ");
		n=Keyboard.readInt();
		
		
		
		for(i=0; i<n;i=i+1)
		{
			if(i==n/2)
				for(k=1;k<n;k=k+1)
					System.out.print("* ");	
				
			else
				
				for(k=0;k<n/2;k=k+1)
					System.out.print("  ");
				
			
		System.out.println("* ");	
			
		}
		
			
				
	}
}