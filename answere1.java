public class answere1 {

  public static class ConanCariAnggota {
    public String nama;
    public int umur;
    public String tempatTinggal;
    public int tabungan;

    ConanCariAnggota(String nama, int umur, String tempatTinggal, int tabungan) {
      this.nama = nama;
      this.umur = umur;
      this.tempatTinggal = tempatTinggal;
      this.tabungan = tabungan;
    }
  }

  public static void main(String[] args) {
    ConanCariAnggota jebolanDon = new ConanCariAnggota("Filson Fisk", 42, "Nevada", 12000000);
    ConanCariAnggota jebolanUnderboss = new ConanCariAnggota("Gustavo Fring", 35, "Nevada", 1500000 );
    ConanCariAnggota jebolanCapo = new ConanCariAnggota("Jessie Pinkman", 24, "California", 900000);
    ConanCariAnggota jebolanNusaPutra = new ConanCariAnggota("Umar Falah", 20, "Salabintana", 700);
    System.out.println(getWarning(jebolanDon));
    System.out.println(getWarning(jebolanUnderboss));
    System.out.println(getWarning(jebolanCapo));
    System.out.println(getWarning(jebolanNusaPutra));
  }

  public static String getWarning(ConanCariAnggota anggota) {
    String syndicate = getSyndicate(
      anggota.umur,
      anggota.tempatTinggal,
      anggota.tabungan
    );


    switch(syndicate.toLowerCase()) {
      case "don":
      case "underboss":
      case "capo":
        return anggota.nama + " kemungkinan adalah seorang anggota mafia dengan pangkat " + syndicate;
      default:
        return anggota.nama + " tidak mencurigakan karena dia baik hati.";
    }
  }

  public static String getSyndicate(
      int umur, 
      String tempatTinggal, 
      int tabungan
  ) {
    if ( umur > 40 & tabungan > 10000000) {
      switch(tempatTinggal.toLowerCase()) {
        case "nevada":
        case "havana":
        case "new york":
          return "Don";
        default:
          return "";
      }
    }
    
    else if (
      ( umur >= 25 & umur <= 40 ) && 
      ( tabungan > 1000000 || tabungan <= 2000000 )
    ) {
      switch(tempatTinggal.toLowerCase()) {
        case "new jersey":
        case "manhattan":
        case "nevada":
          return "Underboss";
        default:
          return "";
      }
    }

    else if (
      ( umur >= 18 & umur <= 24 ) && 
      ( tabungan < 1000000 )
    ) {
      switch(tempatTinggal.toLowerCase()) {
        case "california":
        case "detroit":
        case "boston":
          return "Capo";
        default:
          return "";
      }
    }

    else {
      return "";
    }
  }


}