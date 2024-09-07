import java.util.Scanner;
public class List1
{
	Node head;
	static class Node
	{
		int data;
		Node next;
		
		Node(int data)
		{
			this.data=data;
			Node next=null;
		}
	}
	public void insert(int data)
	{
		Node new_node=new Node(data);
		new_node.next=head;
		head=new_node;
	}
	public void insertLast(int data)
	{
		Node new_node=new Node(data);
		if(head==null)
		{

			head=new_node;
			return ;
		}
		new_node.next=null;
		
		Node temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		head.next=new_node;
		return ;
	}
	
	public void  insertBetn(Node prev,int data)
	{
		if(prev==null)
		{
			System.out.println("list is empty");
		}
		Node new_node=new Node(data);
		new_node.next=prev.next;
		prev.next=new_node;
	}
	
	public void reverse()
	{
		Node prev=null;
		Node curr=head;
		Node top=head;
		
		while(curr!=null)
		{
			top=curr.next;
			curr.next=prev;
			prev=curr;
			curr=top;
		}
		head=prev;
	}
	
	Node nelement(int pos)
	{
		Node temp=head;
		int c=0;
		while(temp!=null)
		{
			if(c==pos)
				return temp.next;
			c++;
			temp=temp.next;
		}
		//assert(false);
		//return null;
	}
	public void display()
	{
		Node n=head;
		while(n!=null)
		{
			System.out.print(n.data+"-->");
			n=n.next;
		}
		System.out.println();
		
	}
	public static void main(String []args)
	{
		List1 l1=new List1();
		l1.insert(11);
		l1.insertLast(12);
		
		l1.insertBetn(l1.head,10);
		l1.insertBetn(l1.head.next,15);
        l1.display();
		l1.reverse();
		l1.display();
		Scanner sc =new Scanner(System.in);
		Node n=l1.nelement(sc.nextInt());
		System.out.println(n);
		
		
		
		
	 	
		
	}
}