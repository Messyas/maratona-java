package exercicios.TesteDeSoftware;

class FindLast {
    public static int findLast(int[] x, int y) {  //Effects: If x==null throw NullPointerException
        //   else return the index of the last element
        //   in x that equals y.
        //   If no such element exists, return -1

        // As the example in the book points out, this loop should end at 0.
        for (int i = x.length - 1; i >= 0; i--) {//erro que inpedia que iterasse sobre o primeiro indice corretamente
            if (x[i] == y) {
                return i;
            }
        }
        return -1;
    }
    // test:  x=[2, 3, 5]; y = 2
    //        Expected = 0
}