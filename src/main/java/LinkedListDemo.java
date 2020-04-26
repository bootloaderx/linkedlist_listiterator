//LinkedList listIterator kod örneği
import java.io.*; 
import java.util.LinkedList; 
import java.util.ListIterator; 
  
public class LinkedListDemo { 
    public static void main(String args[]) 
    { 
        // Boş bir LinkedList oluşturuyorum
        LinkedList<String> list = new LinkedList<String>(); 
  
        // Listeye eleman eklemek için add() metodunu kullanıyorum 
        list.add("Merhaba"); 
        list.add("Benim"); 
        list.add("adım"); 
        list.add("Karahan"); 
        list.add("Sarıoğlu"); 
  
        // LinkedList'i yazdırıyorum
        System.out.println("LinkedList:" + list); 
          
        // Örneğin 2. indeksteki elemandan başlamasını istiyorum 
        ListIterator list_Iter = list.listIterator(2); 
  
        // Oluşturulan listeyi belirlediğim indeksten itibaren yazdırıyorum 
        System.out.println("Listem şu şekildedir:"); 
        while(list_Iter.hasNext()){ 
           System.out.println(list_Iter.next()); 
        } 
    } 
}