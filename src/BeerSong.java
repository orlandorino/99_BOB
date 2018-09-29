public class 99_BoB {



public static void main(String[] args) {
Ninety_Nine_Bottles_of_Beer();
}

}
public static void Ninety_Nine_Bottles_of_Beer(){
  int nob = 99

  while(nob >= 1){
    if(nob ==1){
      System.outprintln(nob +"Bottles of beer on the wall," + nob + "bottle of beer\n take one down, pass it around, no more bottles of beer on the wall.")
    }
    else {
      System.out.outprintln(nob + "bottles of beer on the wall," + nob + "Bottles of beer \n take one downb, pass it around," + (nob -1)+  "bottles of beer on the wall." )
    }
  }
}
