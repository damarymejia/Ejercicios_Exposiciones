import java.util.*;
  
public class Ejercicio7_20 
{
    static void reverse(Integer a[])
    {
        Collections.reverse(Arrays.asList(a));
        System.out.println(Arrays.asList(a));
    }
  
    public static void main(String[] args)
    {
        Integer [] arr = {3, 7, 11, 13, 19};
        reverse(arr);
    }
}