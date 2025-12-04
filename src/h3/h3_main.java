
package h3;


public class h3_main {

public String name;
public int gebJahr;
public int alter;


private static final int CURRENT_YEAR = 2025;


public h3_main() {
this.name = "";
this.gebJahr = 0;
this.alter = 0;
}


public void setName(String name) {
this.name = name;
}

 
public void setGebJahr(int gebJahr) {
this.gebJahr = gebJahr;
}


public void setAlter() {
this.alter = CURRENT_YEAR - this.gebJahr;
}


public String getName() {
return this.name;
}


public int getGebJahr() {
return this.gebJahr;
}


public int getAlter() {
return this.alter;
}
}