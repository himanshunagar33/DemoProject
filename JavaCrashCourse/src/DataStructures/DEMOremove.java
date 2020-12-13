package DataStructures;

import java.util.Iterator;
import java.util.LinkedList;

class MyDS {
	
	LinkedList<Integer> ls= new LinkedList<>();
		
		  void addon(int x) {
			 ls.add(x);
		 }
		 
		void RemoveAndPrint(int a) {
			Iterator<Integer> itr= ls.iterator();
			while(itr.hasNext()) {
				int s= (Integer)itr.next();
				if(s==a) {
					itr.remove();
				}
				else
					System.out.print(s+ " ");
			}
			System.out.println();
		}
		 
	}

public class DEMOremove{
	public static void main(String[] args) {
		
		MyDS dst= new MyDS();
		dst.addon(20);
		dst.addon(10);
		dst.addon(20);
		
		dst.RemoveAndPrint(20);
		dst.addon(40);
		dst.addon(60);
		dst.addon(10);
		dst.RemoveAndPrint(10);
	}
}

