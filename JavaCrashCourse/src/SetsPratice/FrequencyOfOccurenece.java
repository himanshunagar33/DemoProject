package SetsPratice;

public class FrequencyOfOccurenece {
	
public static void main(String[] args) {
int a[]= {10,20,30,20,10,30,30,5};

for(int i=0;i<a.length;i++) {
	boolean flag=false;
	int count=0;
	for(int k=i-1;k>=0;k--) {
		if(a[i]==a[k]) {
			flag=true;
		break;	
			}
		}
	if(flag==false) {
	for(int j=i;j<a.length;j++) {
			if(a[i]==a[j]) {
				count++;
				}
			}
	System.out.println(a[i]+ " : " +count);
			}
		}
	}
}
