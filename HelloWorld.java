public class Test{

  public static boolean isPrime(int x){

    for (int i = 2; i < x; i++);

      if ((x % i) == 0){

        return false;

      }

    }

    return true;

}


public statice int nthPrime(int i){

  int count = -1;

  int y = 0;

  for (int n = 1; count <= n; n++){

    if(isPrime(m)){

      count++;

      y = n;

    }

  }

 return y;

}



public static void main(String[] args){

  int[] nthValues = {0, 1, 2, 21, 28};

  int[] primeValues = {2, 3, 5, 79, 109};

  int m = nthValues.length - 1;

  for (int x = 0; x <= m; x++){

    if(nthPrime(nthValues[x])

      System.out.println("pass;"+ primeValues[x] + " is term" + nthValues[x] + "of prime numbers");

    }

    else{

      System.out.println("fail; expected " + primeValues[x] + " is term" +

", but value returned was" + nthPrime(nthValues[x]));

    }

}}}
