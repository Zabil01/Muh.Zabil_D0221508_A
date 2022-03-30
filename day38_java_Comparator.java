impor  java.util.* ;

// Tulis kelas Checker Anda di sini
class  Checker  mengimplementasikan  Comparator< Player > {
    
    public  int  bandingkan ( Pemain  a , Pemain  b ){
        int conpareName = a . nama . bandingkanKe(b .nama ) ;
        int conpareScore = b . skor - a . skor;
        
        if (conpareScore == 0 ){
            return ((conpareName == 0 ) ? conpareScore : conpareName);
        } lain {
            kembali conpareScore;
            
        }
    }
}

 pemain kelas {
    nama string ;
    skor int ;
    
    Pemain ( Nama string  , skor int ){ 
        ini . nama = nama;
        ini . skor = skor;
    }
}

 solusi kelas {

    public  static  void  main ( String [] args ) {
        Pemindaian pemindai =  Pemindai baru  ( Sistem . in);
        int n = pindai . nextInt();

        Pemain [] pemain =  Pemain baru  [n];
        Pemeriksa pemeriksa =  Pemeriksa baru  ();
        
        untuk ( int i =  0 ; i < n; i ++ ){
            player[i] =  Pemain baru  (scan . next(), scan . nextInt());
        }
        memindai . menutup();
     
        Array . sort(pemain, pemeriksa);
        for ( int i =  0 ; i < player . length; i ++ ){
            Sistem . keluar . printf( " %s %s \n " , pemain[i] . nama, pemain[i] . skor);
        }
    }
}