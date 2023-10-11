class MostFrequent {

    public static void main(String[] args) {
        int[] tab1 = {2, 7, 5, 6, 7, 1, 6, 2, 1, 7, 6};
        int taille = tab1.length;

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/
        int max = 0;
        int number = 0;
        for (int i : tab1) {
            int occurency = 0;
            for (int j : tab1) {
                if (i == j) {
                    occurency++;
                }
            }
            if (occurency > max) {
                max = occurency;
                number = i;
            }
        }
        System.out.println("Le nombre le plus frequent dans le tableau est le :");
        System.out.println(number + " (" + max + " x)");
        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/

    }
}
