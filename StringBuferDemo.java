//Sting length vs Capacity in StringBuffer
class StringBuferDemo {
    public static void main (String[] args){
    StringBuffer sb = new StringBuffer("Hello");
    System.out.println("buffer =" + sb);
    System.out.println("length =" + sb.length());

System.out.println("capacity =" + sb.capacity());
//demonstrating charAt() method and set charAt() method
System.out.println("char at index 1 = " + sb.charAt(1));
sb.setCharAt(1, 'a');
sb.setLength(2);
System.out.println("buffer after = " + sb);
System.out.println("char at index 1 = " + sb.charAt(1));

}
    
}
