package serialize;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student student = new Student("Ace");
        byte[] b = serialize(student);
        Student s = (Student)deserialize(b);
        System.out.println(s.toString());

    }

    static byte[] serialize(Object o) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(o);
        oos.flush();
        return baos.toByteArray();
    }

    static Object deserialize(byte[] b) throws IOException, ClassNotFoundException {
        ByteArrayInputStream bais = new ByteArrayInputStream(b);
        ObjectInputStream ois = new ObjectInputStream(bais);
        Object o = ois.readObject();
        return o;
    }
}
