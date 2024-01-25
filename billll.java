import java.util.Scanner;
class Bill12
{
	
	Scanner s=new Scanner(System.in);
	double dis;
	int item,ppu,total=0;
	int items[]=new int [100];
	int qty[]=new int [100];
	int price[]=new int [100];
	double just=0;
	
}
class billll extends Bill12
{
	
	void getItem()
	{
		System.out.println("Enter no of items");
		item=s.nextInt();
		
		items=new int [item];	
		
		if(item<5){
				ppu=100;
		} else if(item<10) {
			ppu=80;
		} else if (item<15) {
				ppu=60;
		} else {
			ppu=50;
		}
	}
	
	void getQty()
	{
	qty=new int [items.length];
		for (int i=0;i<items.length;i++)
		{
			System.out.println("Enter quantity of item "+(i+1)+" :");
			qty[i]=s.nextInt();
		}
	}
	
	void setPrice()
	{	
		price =new int [qty.length];
		for(int i=0;i<qty.length;i++)
		{	
			price[i]=price[i]+(qty[i]*ppu);
			
		}
		for (int i=0;i<price.length;i++)
		{
			just=just+price[i];
		}
	}
	double TotalBill()
	{
			for(int i=0;i<items.length;i++)
			{
				total=total+price[i];
			}
			if(total<1000)
					dis=(total/100)*5;
				else if(total<2000)
					dis=(total/100)*10;
				else if(total<5000)
					dis=(total/100)*12;
				else if(total<10000)
					dis=(total/100)*15;
				else if(total<20000)
					dis=(total/100)*20;
				
				return dis;
	}
	void Display()
	{
		System.out.println("\t::::BILL::::");
		System.out.println("Items \t Qty\tPrice\tTotal");
		for(int i=0;i<items.length;i++)
		{
			System.out.println("Item"+(i+1)+"\t"+qty[i]+"\t"+ppu+"\t"+(qty[i]*ppu));
		}
	
		
		System.out.println("your total is :"+just);
		System.out.println("your discount is :"+dis);
		System.out.println("your net payable is :"+(just-dis));
		
	
	}
	public static void main(String args[])
	{
		billll b =new billll();
		b.getItem();
		b.getQty();
		b.setPrice();
		double dd =b.TotalBill();
		b.Display();
	}
}