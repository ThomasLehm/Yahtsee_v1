import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Created by nico on 08/11/15.
 */
public class Model {
    protected int score[];
    protected int point;
    protected int lancer;
    protected  int[] sortie;
    protected int nbJoueur;

    public Model(){
        nbJoueur=3;
        score=new int[nbJoueur];
        lancer=0;
        sortie= new int[6];
        JLabel dé1, dé2, dé3, dé4, dé5;
    }


    public void jette(){
        for (int i = 0; i <6 ; i++) {
            int y=(int)(6.0 * Math.random()) + 1;
            setSortie(i,y);

        }
    }

    public void setSortie(int i,int j){
        sortie[i]=j;
    }

    public int getNbJoueur(){
        return nbJoueur;
    }

    public void setNbJoueur(int i){
        nbJoueur=i;
    }

    public int getSortie(int i){
        return sortie[i];
    }

    public void setLancer(int i){
        lancer=lancer+i;
    }

    public int getLancer(){
        return lancer;
    }

    public void initScore(int nbJoueur){
        for (int i = 0; i < nbJoueur; i++) {
            score[i]=0;
        }
    }


    public int getScore(int i){
        return score[i];
    }

    public void setScore(int j,int point)
    {
        score[j]= score[j]+point;
    }


}
