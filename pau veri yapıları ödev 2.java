public class Odev2Ogrenci {
    /**
     * isBST metodu kökü verilen herhangi bir ağacın ikili arama ağacı olup
     * olmadığını hesaplar
     * @param node Kök düğüm
     * @param <T> karşılaştırılabilir generic tür
     * @return ikili arama ağacı mı değil mi
     * Hüseyin Can Şimşek 17253064
     */
    public static <T extends Comparable<T>> boolean isBST(BTNode<T> node) {
        
   
            
        
           if(node==null)
           {
              return true;
           }
           if(node.left!=null && node.value.compareTo(node.left.value)<0)
           {
               return false;
           }
           
           if(node.right!=null && node.value.compareTo(node.right.value)>0)
           {
               return false;
           }
           
           
          
    
                
            
           
    
    
           
          
           
        boolean l=isBST(node.left);
           boolean r=isBST(node.right);
           
           
              
          
          
          
           return l&&r;
         
    
        
    }
}
