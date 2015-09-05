
public class Node {
	
	int num;
	Node next;
	
	Node(int  num){
		this.num = num;
	}
	
	public void display(){
		System.out.println(num);
		
	}
	public String toString(){
		return num + "";
	}
	public static void main(String args[]){
		int bnum[] = new int[]{123,43,241,5,2,865,457,0,345,888,959,21574,7,52};
	
		Linked a[]  = new Linked[10];
		for(int i= 0; i< 10;i++){
			a[i] = new Linked();
		}
		
		for(int i = 0; i<bnum.length;i++){
			
			int num = bnum[i]%10;
			 a[num].insert(bnum[i]);
		}
		for(int i = 0 ; i<10; i++){
			System.out.println("\n"+i +"\n");
			a[i].display();
			System.out.println ("\n  \n");
		}
		
		
	}
	
	
}

class Linked{
	Node firstLink ;
	Linked(){
		firstLink = null;
	}
	
	public int insert( int num){
		Node link = new Node(num);
		link.next = firstLink;
		firstLink = link;
		return 0;
	}
	
	public void display(){
		Node Link = firstLink;
		while(Link!=null)
		{
			Link.display();
			System.out.println("The next link in the array is " + Link.next);
			Link = Link.next;
		}
	}
}
