import java.util.Scanner;

public class Ex {
    public static int Addition (int x, int y){
    return x + y;
    }
    public static int Multiplication (int x, int y){
    return x * y;
    }
    public static double Moyenne (int... nombres){
    int resultat = 0;
    for (int n : nombres){
        resultat = resultat + n;
        
    }
    return (double) resultat / nombres.length;
    }
    public static int plusGrand (int... valeurs){
    int max = valeurs[0];
    for (int i : valeurs){
        if ( i > max) {
            max = i;
        }
        
    }
    return max;
    }

    
    public static void main(String[] args) {
        System.out.println("===== MENU PRINCIPAL =====");
        System.out.println("1_ Addition");
        System.out.println("2_ Multiplication");
        System.out.println("3_ Moyenne");
        System.out.println("4_ Trouver le plus grand nombre");
        System.out.println("0_ Quitter le programme");
        Scanner lecteur = new Scanner(System.in);
       
        int choix;
        do {
            System.out.print("Entrez votre choix : ");
            choix = lecteur.nextInt();
    
       switch (choix) {
            case 1:
            
              System.out.print("saisir le 1er entier : ");
              int a=lecteur.nextInt();
              System.out.print("saisir le 2eme entier : ");
              int b=lecteur.nextInt();
              int somme = Addition(a,b);
              System.out.println("La somme des 2 nombres est : " + somme);
              break;
            case 2:
            
              System.out.print("saisir le 1er entier : ");
              int a1=lecteur.nextInt();
              System.out.print("saisir le 2eme entier : ");
              int b1=lecteur.nextInt();
              int resultat = Multiplication(a1,b1);
              System.out.println("Le produit des 2 nombres est : " + resultat);
              break;
            case 3:
                System.out.print("Entrez le nombre de valeurs : ");
                int n = lecteur.nextInt();
                int[] nombres = new int[n];
                for (int i = 0; i < n; i++) {
                    System.out.print("Entrez la valeur " + (i + 1) + " :");
                    nombres[i] = lecteur.nextInt();
                }
                System.out.println("La Moyenne des nombres est: " + Moyenne(nombres));
                break;
            case 4:
                System.out.print("Entrez le nombre de valeurs : ");
                int nombre = lecteur.nextInt();
                int[] valeurs = new int[nombre];
                for (int j = 0; j < nombre; j++) {
                    System.out.print("Entrez la valeur " + (j + 1) + " :");
                    valeurs[j] = lecteur.nextInt();
                }
                System.out.println("La Plus Grande valeur est : " + plusGrand(valeurs));
                break;

            case 0:
                System.out.println("Programme termine.");
              
            break;

            default:
                System.out.println("choix invalide!");
            } 
            }while (choix != 0);

            lecteur.close();
            }



        
        }

