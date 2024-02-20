package Metier;

public class Jeu {
    protected int nombreSecret;
    private boolean nombreTrouve;

    public void genererNombre(){
        nombreSecret=(int)(Math.random()*10);
    }

    public String jouer(int nombrePropose) {
        if (nombrePropose == nombreSecret) {
            nombreTrouve = true;
            return "Félicitations, vous avez trouvé le nombre secret !";
        } else if (nombrePropose < nombreSecret) {
            return "Le nombre est plus grand. Essayez encore.";
        } else {
            return "Le nombre est plus petit. Essayez encore.";
        }

    }

    public boolean getNombreSecret() {
        return nombreTrouve;
    }
}

