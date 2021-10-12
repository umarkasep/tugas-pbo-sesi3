public class answere5 {
  public static void main(String[] args) {
    int umur = 19;
    int tinggi = 166;
    int tarif = 50000;

    if ( umur < 1 ) {
      System.out.println("Dilarang masuk");
    }


    if ( umur <= 3 & umur > 0 ) {
      tarif = 30000;

      if (tinggi >= 70) {
        tarif += 10000;
      }
    }

    if ( umur <= 7 & umur >= 4 ) {
      tarif = 40000;

      if (tinggi >= 120) {
        tarif += 15000;
      }
    }


    if ( umur <= 10 & umur >= 8 ) {
      tarif = 40000;

      if (tinggi >= 150) {
        tarif += 20000;
      }
    }

    if ( umur >= 10 ) {
      tarif = 80000;
    }

    System.out.println("Harga Masuk : " + tarif);


  }
}