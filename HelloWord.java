class HelloWord extends Program{
    
    final int TailleMenu = 20;

    void initialiserIdentifieur(char[][] identifieur){
        for(int i=0; i<TailleMenu; i++){
            for(int j=0; j<TailleMenu; j++){
                identifieur[i][j]='╳';
            }
        }
    }

    String creerLigne(char c){
        String ligne = "";
        for(int i=0; i<TailleMenu; i++){
            ligne+=c;
        }
        return ligne;
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
    }
}
