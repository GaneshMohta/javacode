import java.util.*;
class Arrays{
public static void main(String args []){
Scanner s=new Scanner(System.in);
int a[]=new int[5];

for(int i=0;i<5;i++){
a[i]=s.nextInt();
}
s.close();
for(int i=0;i<5;i++){
System.out.print(a[i]+" ");
}
int sum=0;
for(int i : a){
sum+=i;
}
System.out.println(sum);
}

public static void sort(int[] arr) {
}
}
