public class Odev1LinkedList<T extends Comparable<T>> extends AbstractLinkedList<T> {
    /**
     * Bir listede elemanları uygun konuma ekler. Boş bir listeye elemanlar eklendikten
     * sonra küçükten büyüğe sıralı olur
     * @param value eklenecek değer
     * Hüseyin Can Şimşek 17253064
     */
    @Override
    public void insertInOrder(T value) {
            
        
         
            
            addFirst(value);
            Node<T> node=getHead();
            node.value=value;
            
            while(node.next!=null)
            {
               
                
                
                    
                    
                
                if(node.next.value.compareTo(node.value)<0)
                {
                    T tmp=node.next.value;
                    node.next.value=node.value;
                    node.value=tmp;
                }
                
                node=node.next;
            }
            
          
           
        
        
       
       
        
        
        
        

    }

    /**
     * Mevcut listeyi değiştirmeden, elemanların sırası ters çevrilmiş halde geri döndürür.
     * @return Ters çevrilmiş liste
     */
    @Override
    public AbstractLinkedList<T> reverse() {
        AbstractLinkedList<T> ters=new Odev1LinkedList();
        
        
            Node<T> node=getHead();
        
        
        while(node!=null)
        {

        
            ters.addFirst(node.value);
            
            node=node.next;
            
            
        }
        
        
        
        
        return ters;
    }

    /**
     * Mevcut liste ile parametre olarak gelen listeyi birleştirip geriye döndürür.
     * Mevcut listede değişiklik yapılmaz.
     * @param list Mevcut listenin sonuna eklenecek liste
     * @return Birleşmiş liste
     */
    @Override
    public AbstractLinkedList<T> concatenate(AbstractLinkedList<T> list) {
        AbstractLinkedList<T> yeniliste=new Odev1LinkedList();
        Node <T> yeni=getHead();
        
        Node<T> node=list.getHead();
        while(yeni!=null)
        {
            yeniliste.addLast(yeni.value);
            yeni=yeni.next;
        }
    
        
        
       
    
        
        
        
        while(node!=null)
        {
            yeniliste.addLast(node.value);
            node=node.next;
            
        }
        
        
        
        
        
       
        
        return yeniliste;
    }

}
