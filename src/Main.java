// TODO: we need to add the missing classes!
// OK, I will add `Adder` and s26695 will add `Subtractor`.
public class Main {
 public static void main(String[] args) {
  Adder adder = new Adder();
  System.out.println(adder.add(1, 2));
  Subtractor subtractor = new Subtractor();
  System.out.println(subtractor.subtract(6, 3));
 }
}

class Subtractor {
 public static int subtract(int a, int b) {
  return a - b;
 }
}


