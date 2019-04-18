import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.*;

package resistor_vancayseele2;


public class Resistor_vancayseele2 {
  
  public static void main(String[] args) {
        
      // float
        float val1 = 0,val2 = 0,multipl = 0,tol = 0,resultat,tolposs,tolneg;
      // boolean  
        boolean step1= true;
        boolean step2= false;
        boolean step3 = false;
        boolean step4 = false;
        // String
        String phrase1;
        String NumberFormat;
        // Classe Scanner
       Scanner lectureClavier = new Scanner(System.in); 
        phrase1 = lectureClavier.next().toLowerCase();;  // lire le premier mot 
        System.out.print("Entrer la premiére couleur : ");
        
        if(step1 = true){
        switch (phrase1) { 
            case "noir" : 
                System.out.println("La couleur est " + phrase1);
                System.out.println("Le noir est impossible en 1 ére Couleur");
                step2 = false;
                break; // ok
            
            case "marron" : 
                System.out.println("La couleur est" + phrase1);
                val1= 1;
                step2 = true;
                break; // ok
                
            case "rouge" : 
                System.out.println("La couleur est" + phrase1);
                val1=2;
                step2 = true;
                break;      //  ok           

            case "orange" : 
                System.out.println("La couleur est" + phrase1);
                val1=3;
                step2 = true;
                break;  
                
            case "jaune" : 
                System.out.println("La couleur est" + phrase1);
                val1=4;
                step2 = true;
                break; 
                
            case "vert" : 
                System.out.println("La couleur est" + phrase1);
                val1=5;
                step2 = true;
                break;
                
            case "bleu" : 
                System.out.println("La couleur est" + phrase1);
                val1=6;
                step2 = true;
                break;

            case "Violet" : 
                System.out.println("La couleur est" + phrase1);
                val1=7;
                step2 = true;
                break; 
                
            case "gris" : 
                System.out.println("La couleur est" + phrase1);
                val1=8;
                step2 = true;
                break;
                
            case "blanc" : 
                System.out.println("La couleur est" + phrase1);
                val1=9;
                step2 = true;
                break;
                
            case "or" : 
                System.out.println("La couleur est" + phrase1);
                System.out.println("La couleur Or est impossible en premiére position");
                step2 = false;
                break;
                
            case "argent" : 
                System.out.println("La couleur est" + phrase1);
                System.out.println("La couleur Argent est impossible en premiére position");
                step2 = false;
                break; 
                
            default : System.out.println("il y a une erreur"); 
        }// fin de switch 1
        }
        
        
        System.out.print("Entrer la Seconde couleur : ");
        phrase1 = lectureClavier.next();  // lire le premier mot 
        
        switch (phrase1) { 
            case "noir" : 
                System.out.println("La couleur est " + phrase1);
                val2=0;
                break; 
            
            case "marron" : 
                System.out.println("La couleur est" + phrase1);
                val2=1;
                break;
                
            case "rouge" : 
                System.out.println("La couleur est" + phrase1);
                val2=2;
                break;                 

            case "orange" : 
                System.out.println("La couleur est" + phrase1);
                val2=3;
                break;  
                
            case "jaune" : 
                System.out.println("La couleur est" + phrase1);
                val2=4;
                break; 
                
            case "vert" : 
                System.out.println("La couleur est" + phrase1);
                val2=5;
                break;
                
            case "bleu" : 
                System.out.println("La couleur est" + phrase1);
                val2=6;
                break;

            case "violet" : 
                System.out.println("La couleur est" + phrase1);
                val2=7;
                break; 
                
            case "gris" : 
                System.out.println("La couleur est" + phrase1);
                val2=8;
                break;
                
            case "blanc" : 
                System.out.println("La couleur est" + phrase1);
                val2=9;
                break;
                
            case "or" : 
                System.out.println("La couleur est" + phrase1);
                System.out.println("La couleur Or est impossible en premiére position");
                break;
                
            case "argent" : 
                System.out.println("La couleur est" + phrase1);
                System.out.println("La couleur Argent est impossible en premiére position");
                break; 
                
            default : System.out.println("il y a une erreur"); 
        }// fin de switch 2
        
         System.out.print("Entrer la Troisiéme couleur : ");
        phrase1 = lectureClavier.next();  // lire le premier mot 
        
        switch (phrase1) { 
            case "noir" : 
                System.out.println("La couleur est " + phrase1);
                multipl=1;
                break; 
            
            case "marron" : 
                System.out.println("La couleur est" + phrase1);
                multipl=10;
                break;
                
            case "rouge" : 
                System.out.println("La couleur est" + phrase1);
                multipl=100;
                break;                 

            case "orange" : 
                System.out.println("La couleur est" + phrase1);
                multipl=1000;
                break;  
                
            case "jaune" : 
                System.out.println("La couleur est" + phrase1);
                multipl=10000;
                break; 
                
            case "vert" : 
                System.out.println("La couleur est" + phrase1);
                multipl=100000;
                break;
                
            case "bleu" : 
                System.out.println("La couleur est" + phrase1);
                multipl=1000000;
                break;

            case "violet" : 
                System.out.println("La couleur est" + phrase1);
                multipl=10000000;
                break; 
                
            case "gris" : 
                System.out.println("La couleur est" + phrase1);
                multipl=100000000;
                break;
                
            case "blanc" : 
                System.out.println("La couleur est" + phrase1);
                multipl=1000000000;
                break;
                
            case "or" : 
                System.out.println("La couleur est" + phrase1);
                multipl=+10;
                break;
                
            case "argent" : 
                System.out.println("La couleur est" + phrase1);
                multipl=+100;
                break; 
                
            default : System.out.println("il y a une erreur"); 
        }// fin de switch 3
        
System.out.print("Entrer la derniére couleur : ");
        phrase1 = lectureClavier.next();  // lire le premier mot 
        
        switch (phrase1) { 
            case "noir" : 
                System.out.println("La couleur est " + phrase1);
                tol=0;
                break; 
            
            case "marron" : 
                System.out.println("La couleur est" + phrase1);
                tol=1;
                break;
                
            case "rouge" : 
                System.out.println("La couleur est" + phrase1);
                tol=2;
                break;                 

            case "orange" : 
                System.out.println("La couleur est" + phrase1);
                tol=3;
                break;  
                
            case "jaune" : 
                System.out.println("La couleur est" + phrase1);
                tol=4;
                break; 
                
            case "vert" : 
                System.out.println("La couleur est" + phrase1);
                tol= (float) 0.5;
                break;
                
            case "bleu" : 
                System.out.println("La couleur est" + phrase1);
                tol= (float) 0.25;
                break;

            case "violet" : 
                System.out.println("La couleur est" + phrase1);
                tol= (float) 0.10;
                break; 
                
            case "gris" : 
                System.out.println("La couleur est" + phrase1);
                tol= (float) 0.05;
                break;
                
            case "blanc" : 
                System.out.println("La couleur est" + phrase1);
                
                break;
                
            case "or" : 
                System.out.println("La couleur est" + phrase1);
                tol=5;
                break;
                
            case "argent" : 
                System.out.println("La couleur est" + phrase1);
                tol=10;
                break; 
                
            default : System.out.println("il y a une erreur");
            step1=true;
            step2= false;
            step3= false;
            step4 =false;
            
        }// fin de switch 4    
        
       resultat = (val1+val2)*multipl ;
        System.out.println("La valeur est de"+resultat+"Ohms"+"la tolérance est de "+tol+"%" );
        
      tolposs = resultat +tol;
      System.out.println("La valeur avec la tolerance positive est de"+tolposs+"Ohms" );
      tolneg = resultat -tol;
      System.out.println("La valeur avec la tolerance négative est de"+tolneg+"Ohms" );
  
      
      
  } 
  
  public static String FormatValue(double value) {
int power; 
    String suffix = " kmbt";
    String formattedNumber = "";
    NumberFormat formatter = new DecimalFormat("#,###.#");
    power = (int)StrictMath.log10(value);
    value = value/(Math.pow(10,(power/3)*3));
    formattedNumber=formatter.format(value);
    formattedNumber = formattedNumber + suffix.charAt(power/3);
    return formattedNumber.length()>4 ?  formattedNumber.replaceAll("\\.[0-9]+", "") : formattedNumber;  
}
    
}



