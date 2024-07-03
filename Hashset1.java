import java.util.*;

class Hashset
{
    public static void main(String[] args) {
        HashMap<String,String> emp=new HashMap<String,String>();
        emp.put("id", "101");
        emp.put("name", "Rahul");
        emp.put("sal", "450000");
        emp.put("null", "null");
        emp.put("null", "null");
        System.out.println(emp);

        //Read the emp
        emp.get("id");
        emp.get("name");
        emp.get("sal");
        emp.get("null");
        System.out.println(emp.values());
        System.out.println(emp.keySet());
        System.out.println(emp.entrySet());

    }
}