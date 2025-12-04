
package h1;

public class Zahl_klasse{

public boolean even;
public boolean small;
public boolean positive;
public int num;


public Zahl_klasse() {
this.num = 0;

setEven();
setPositive();
setSmall();
}


public Zahl_klasse(int num) {
this.num = num;

setEven();
setPositive();
setSmall();
}


public void setEven() {

this.even = (Math.abs(this.num) % 2 == 0);
}

 
public void setPositive() {
this.positive = (this.num > 0);
}


public void setSmall() {
this.small = (this.num < 100);
}


public String toString() {
return "Zahl(num=" + num + ", even=" + even + ", positive=" + positive + ", small=" + small + ")";
}
}