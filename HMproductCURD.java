import java.util.*;
class Test
{
    public static void main(String[] args) {
        HashMap<String,String>  product=new HashMap<String,String>();

        product.put("PId", "1001");
        product.put("Pname", "IPhone 5s");
        product.put("price", "75000;");
        product.put("color", "red");
        product.put("avail", "true");
        System.out.println(product);

        System.out.println("Display Key & Values using EntrySet()");
         Set<Map.Entry<String,String>> entries=product.entrySet();

      for (Map.Entry<String,String> entry : entries) {
        System.out.println(entry.getKey()+":"+entry.getValue());
      }
    }
}