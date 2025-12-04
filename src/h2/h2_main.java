
package h2;

import java.util.Arrays;

public class h2_main {

public static void main(String[] args) {

int[] a1 = {2, 7, 1, 9};
int[] b1 = {5, 6, 7};
System.out.println(Arrays.toString(change(a1, b1, 2, 4)));


int[] a2 = {2, 7, 1, 9};
int[] b2 = {2, 7, 1, 9};
System.out.println(Arrays.toString(change(a2, b2, 2, 4)));


int[] a3 = {2, 7, 1, 9};
int[] b3 = {2, 7, 1, 9};
System.out.println(Arrays.toString(change(a3, b3, 3, 2)));

}



public static int[] change(int[] a, int[] b, int start, int end) {


if (end <= start) {
return new int[0];
}


boolean identical = Arrays.compare(a, b) == 0;


if (!identical) {
return Arrays.copyOf(a, a.length);
}

 
int[] sorted = Arrays.copyOf(a, a.length);
Arrays.sort(sorted);
return Arrays.copyOfRange(sorted, start, end);
}
}
