
package h3;


public class h3_main {
public static void main(String[] args) {

Mensch m = new Mensch();


m.setName("x");
m.setGebJahr(2010);


m.setAlter();


System.out.println("Name: " + m.getName()); 
System.out.println("Geburtsjahr: " + m.getGebJahr()); 
System.out.println("Alter (2025): " + m.getAlter()); 
}
}