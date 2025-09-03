public class StringBufferBuilderDemo {
    public static void main(String[] args) {

        // Using StringBuffer (Thread-Safe)
        StringBuffer sbf = new StringBuffer("Hello");
        sbf.append(" World");                     // append
        sbf.insert(6, "Java ");                   // insert
        sbf.replace(6, 10, "Python");             // replace
        sbf.delete(6, 12);                        // delete
        sbf.reverse();                            // reverse
        System.out.println("StringBuffer Result: " + sbf);

        // Methods
        System.out.println("Capacity: " + sbf.capacity());
        System.out.println("Length: " + sbf.length());
        System.out.println("CharAt(2): " + sbf.charAt(2));

        // Using StringBuilder (Faster, Not Thread-Safe)
        StringBuilder sbl = new StringBuilder("Welcome");
        sbl.append(" to Java");                   // append
        sbl.insert(8, "World ");                  // insert
        sbl.replace(8, 13, "Universe");           // replace
        sbl.delete(8, 16);                        // delete
        sbl.reverse();                            // reverse
        System.out.println("StringBuilder Result: " + sbl);

        // Extra Methods
        sbl.setCharAt(0, 'X');
        System.out.println("After setCharAt: " + sbl);
        System.out.println("Substring(1, 4): " + sbl.substring(1, 4));
    }
}
