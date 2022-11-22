class HelloWord extends Program{
    
    final int TailleMenu = 20;

    void initialiserIdentifieur(char[][] identifieur){
        for(int i=0; i<TailleMenu; i++){
            for(int j=0; j<TailleMenu; j++){
                identifieur[i][j]='╳';
            }
        }
    }

    void insérerLigneHorizontale(char[][] menu, int x, int y, int longueur, char c){
        int max = x+longueur;
        for(int i=x; i<max; i++){
            menu[y][i] = c;
        }
    }

    void insérerLigneHorizontale(char[][] menu, int x, int y, int longueur, char c){
        int max = x+longueur;
        for(int i=x; i<max; i++){
            menu[i][y] = c;
        }
    }
    
    void insérerBordure(char[][] menu, int debut, int xmax, int ymax, char c){
        char vertical = '';
        char coinHautGauche = '';
        char coinHautDroit = '';
        char coinBasGauche = '';
        char coinBasDroit = '';
        if(c=='═'){
            vertical = ''
        }
    }

    void afficherIdentifieur(char[][] identifieur){
        String menu = "";
        for(int i=0; i<TailleMenu; i++){
            for(int j=0; j<TailleMenu; j++){
                menu += identifieur[i][j];
            }
            menu+="\n";
        }
        println(menu);
    }

    void algorithm(){
        char[][] identifieur = new char[TailleMenu][TailleMenu];
        initialiserIdentifieur(identifieur);
        afficherIdentifieur(identifieur);
        println("------------------------------------");
        insérerLigneHorizontale(identifieur, 4, 4, TailleMenu-8, '═');
        afficherIdentifieur(identifieur);
    }
}
