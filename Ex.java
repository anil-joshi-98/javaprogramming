import java.util.*;
class Ex{
public static void main(String args[])throws Exception{
ArrayList l=new ArrayList(3);
l.add("anil");
l.add("joshi");
l.set(1,"phantom");
l.add(1,"joshi");
Iterator i=l.iterator();
System.out.println(l.size());
while(i.hasNext()){
System.out.println(i.next());}
}
}