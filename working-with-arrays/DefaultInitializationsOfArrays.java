import helpers.Print;

public class DefaultInitializationsOfArrays {
  public static void main(String[] args) {
    final int MAX = 2;
    PrintArrays array = new PrintArrays();

    byte[] byteArray = new byte[MAX];
    short[] shortArray = new short[MAX];
    int[] intArray = new int[MAX];
    long[] longArray = new long[MAX];
    float[] floatArray = new float[MAX];
    double[] doubleArray = new double[MAX];

    Print.p("\nThe default initializations for the basic types are as follows:\n");

    array.print(byteArray);
    array.print(shortArray);
    array.print(intArray);
    array.print(longArray);
    array.print(floatArray);
    array.print(doubleArray);
  }
}
