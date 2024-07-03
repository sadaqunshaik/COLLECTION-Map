import java.util.*;
class Test
{
    public static void main(String[] args) {
        HashMap<String,String>  product=new HashMap<String,String>();

        product.put("PId", "1001");
        product.put("Pname", "IPhone 5s");
        product.put("price", "75000");
        product.put("color", "red");
        product.put("avail", "true");
        System.out.println(product);
        
         System.out.println("display values using keySet()");
         Set<String>keys=product.keySet();
         for (String key : keys) {
         
         System.out.println(key+":"+product.get(key));
         }
          System.out.println("display values using values()");
          Collection<String> values=product.values();
          for (String value : values) {
            System.out.println(value);
              
          }
        
    }
}