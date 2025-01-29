import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
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
            System.out.println(obj);

            Iterable<?> it = (Iterable<?>)obj;

            it.iterator();

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}