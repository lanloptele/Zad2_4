import java.util.Scanner;
class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner( System.in );

  System.out.print( "Podaj liczbę z której liczymy silnię " );
int a = sc.nextInt();
a = a + 1;
int wynik= 1 ;
for(int b = 1;b<a;b++)
  {
    wynik=wynik*b;
    
  }
   System.out.print( "wynik: "+wynik );

}}