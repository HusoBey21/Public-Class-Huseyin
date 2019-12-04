import java.util.Comparator;

/**
 * FrekansKarsilastirici sınıfı Huffman ağaçlarını köklerindeki frekans değerlerine göre
 * karşılaştırır.
 */
 //Hüseyin Can Şimşek 17253064
class FrekansKarsilastirici implements Comparator<HuffmanNode> {

    @Override
    public int compare(HuffmanNode o1, HuffmanNode o2) {
        int s=0;
        if(o1.frequency - o2.frequency < 0)
            {
                s=-1;
            }
        if (o1.frequency-o2.frequency > 0)
        {
            s=1;
        }
        if(o1.frequency - o2.frequency == 0)
        {
            return 0;
        }
        return s;
        
    }
}

/**
 * AlfabetikKarsilastirici sınıfı Huffman ağaçlarını içlerinde bulunan en küçük karakterlere
 * göre karşılaştırır.
 */
class AlfabetikKarsilastirici implements Comparator<HuffmanNode> {
    public String dolas(HuffmanNode a)
      
      {
         String k="";
          
          
           
          if(a==null)
          {
              return "";
          }
          String sol=dolas(a.left);
          String sag=dolas(a.right);
          if(sol.compareTo(sag)<0)
          {
              k=sol;
          }
         else if(sol.compareTo(sag)>0)
          {
              k=sag;
          }
          
         
          
          return k +(sol.equals("")?"":" ") +(sag.equals("")?"":" ")+a.value;
      }
     
                
            
          
             
        
              
     
     
      
         
        
        
        
          
          
       
        
         
          
          
         
      

    @Override
    public int compare(HuffmanNode o1, HuffmanNode o2) {
        int a=0;
        
        String x=dolas(o1);
        String y=dolas(o2);
       
        
       
         
          if(x.compareTo(y)<0)
          {
              a=-1;
          }
          else if(x.compareTo(y)==0)
          {
              a=0;
          }
          else
          {
              a=1;
          }
         
          return a;
      
    
        
        
     
        
        
       
       
       
        
    }
}
