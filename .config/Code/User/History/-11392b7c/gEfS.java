import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) 
    {
        Module mod = new Module();

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Module.ser")))
        {
            oos.writeObject(mod);
            System.out.println("done");
        }
        catch (Exception e)
        {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Module.ser")))
            {
                Module obj = ois.readObject();
                for (Student s : )
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }


    }

    public static void SerialisationMethod()
    {
        ArrayList<String> message = new ArrayList<>();
        message.add("Fuck you");
        message.add("Fuck you");
        message.add("Fuck you");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("fuckYou.ser")))
        {
            oos.writeObject(message);
            System.out.println("Completed");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("fuckYou.ser")))
        {
            Object obj = ois.readObject();
            Iterable<?> it = (Iterable<?>)obj;
            it.forEach( (n) -> System.out.println(n));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}