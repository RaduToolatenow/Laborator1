
//Aplicatie 1.7.1

public class Inversare {
public String Cuvant;

String A_Inceput_Scoala(String Cuvant){
    this .Cuvant = Cuvant;
    String Invers="";
    for(int i=Cuvant.length()-1;i>=0;i--){

        Invers+=Cuvant.charAt(i);
    }


    return Invers;
}


}
