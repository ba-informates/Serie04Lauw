import java.util.ArrayList;

class Cloture {
    public static void main(String[] args) {
        int[][] carte = {
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1,1,1,1,0,0},
            {0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,0,0},
            {0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,0,0},
            {0,0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1,1,1,1,0,0,0,0},
            {0,0,0,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0},
            {0,0,0,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0},
            {0,0,0,0,0,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,1,1,1,1,1,1,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,1,1,1,1,1,1,1,1,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0},
            {0,0,0,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0},
            {0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0},
            {0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
        };

        /*******************************************
         * Completez le programme à partir d'ici.
         *******************************************/
        int numLigne = 0;
        int numCol = 0;
        double cloture = 0;
        boolean firstOne = false;
        boolean isEtang = false;
        ArrayList<Integer> coordX = new ArrayList<Integer>();
        ArrayList<Integer> coordY = new ArrayList<Integer>();
        for (int[] ligne : carte) { //Nettoyage & test carte
            for (int val : ligne) {
                if (val != 0 && val != 1) {
                    System.out.print("Votre carte du terrain n'a pas le bon format :\nvaleur '");
                    System.out.print(val);
                    System.out.print("' trouvée en position [");
                    System.out.print(numLigne);
                    System.out.print("][");
                    System.out.print(numCol);
                    System.out.println("]");
                    return;
                }
                if (val == 1 && !firstOne) {
                    firstOne = true;
                }
                if(val == 0 && firstOne) {
                    for (int i = numCol; i < carte[numLigne].length; ++i) {
                        if (carte[numLigne][i] == 1) {
                            isEtang = true;
                        }
                    }
                    if(isEtang) {
                        coordX.add(numLigne);
                        coordY.add(numCol);
                        carte[numLigne][numCol] = 1;
                    }
                }
                ++numCol;
                isEtang = false;
            }
            ++numLigne;
            firstOne = false;
            numCol = 0;
        }
        int times = 0;
        for(Integer x : coordX) {
            Integer y = coordY.get(times);
            if (x == 0 || (x == carte.length - 1)) {
                System.out.println("Votre carte du terrain n'a pas le bon format :");
                System.out.print("bord extérieur entrant trouvé en position [");
                System.out.print(x);
                System.out.print("][");
                System.out.print(y);
                System.out.println("]");
                return;
            } else if(carte[x-1][y] == 0 || carte[x+1][y] == 0 || carte[x][y+1] == 0 || carte[x][y-1] == 0) {
                System.out.println("Votre carte du terrain n'a pas le bon format :");
                System.out.print("bord extérieur entrant trouvé en position [");
                System.out.print(x);
                System.out.print("][");
                System.out.print(y);
                System.out.println("]");
                return;
            }
            ++times;
        }
        numLigne = 0;
        numCol = 0;
        boolean lastWasOne = false;
        for (int[] ligne : carte) {
            for (int val : ligne) {
                if (val == 1) {
                    lastWasOne = true;
                    if (!firstOne) {     //premier carreau
                        cloture += 2.5;
                        firstOne = true;
                    }
                    if (numLigne == 0) {    //première ligne / cloture du dessus
                        cloture += 2.5;
                    } else if (carte[numLigne - 1][numCol] == 0) {
                        cloture += 2.5;
                    }
                    if (numLigne == (carte.length - 1)) { // dernière ligne / cloture du dessous
                        cloture += 2.5;
                    } else if (carte[numLigne + 1][numCol] == 0) {
                        cloture += 2.5;
                    }
                    if(numCol == (carte[numLigne].length - 1)) {    //fin de ligne
                        cloture += 2.5;
                    }
                } else {
                    if (lastWasOne) {       //fin de cloture
                        cloture += 2.5;
                        lastWasOne = false;
                    }
                }
                ++numCol;
            }
            firstOne = false;
            lastWasOne = false;
            numCol = 0;
            ++numLigne;
        }

        System.out.print("Il vous faut ");
        System.out.print(cloture);
        System.out.println(" mètres de clôture pour votre terrain.");

        /*******************************************
         * Ne rien modifier après cette ligne.
         *******************************************/
    }
}
