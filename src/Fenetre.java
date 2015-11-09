import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * Created by nico on 08/11/15.
 */
public class Fenetre extends JFrame {

    private Panel pan = new Panel(new GridBagLayout());
    protected JRadioButton A1,A2,A3,B1,B2,B3,C1,C2,C3,D1,D2,D3;
    //section sup
    int nbJoueur =3;
    protected JTextField txtsectionsup[];
    protected JTextField txtTotalAs[];
    protected JTextField txtTotalDeux[];
    protected JTextField txtTotalTrois[];
    protected JTextField txtTotalQuatre[];
    protected JTextField txtTotalCinq[];
    protected JTextField txtTotalSix[];
    protected JTextField txtTotal[];
    protected JTextField txtPrime35[];
    protected JTextField txtTotalsectionSup[];
    protected JLabel joueur[];
    protected JLabel joueur2[];
    //section bas
    protected JTextField txtBrelan[];
    protected JTextField txtCarre[];
    protected JTextField txtFull[];
    protected JTextField txtPSuite[];
    protected JTextField txtGSuite[];
    protected JTextField txtYahtzee[];
    protected JTextField txtChance[];
    protected JTextField txtPrime100[];
    protected JTextField txtTotalInf[];
    protected JTextField txtTotalFinal[];
    protected JComboBox<String> E1;
    protected JCheckBox F1;
    //protected JButton G1;
    protected ControlButton control = new ControlButton(this);
    protected ControlMenu control2 = new ControlMenu(this);
    protected JMenuBar menuBar;
    protected JMenu option;
    protected JMenuItem itemInterface1, itemInterface2, itemComment, itemApropos;
    protected JMenu itemAide;
    protected ImageIcon img1,img2;

    public Fenetre(Model model) {

        initAttribut();
        creerMenu();
        creerWidget2();
        this.setResizable(true);
        pack();
        setTitle("Yahtsee");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void initAttribut(){

        A1 = new JRadioButton("1",true);
        A2 = new JRadioButton("2",false);
        A3 = new JRadioButton("3",false);
    //partie sup


       /*     joueur[nbJoueur]= new JLabel("joueur ");
            txtsectionsup[nbJoueur] = new JTextField();
            txtsectionsup[nbJoueur].setColumns(10);
            txtTotalAs[nbJoueur] = new JTextField();
            txtTotalAs[nbJoueur].setColumns(10);
            txtTotalDeux[nbJoueur] = new JTextField();
            txtTotalDeux[nbJoueur].setColumns(10);
            txtTotalTrois[nbJoueur] = new JTextField();
            txtTotalTrois[nbJoueur].setColumns(10);
            txtTotalQuatre[nbJoueur] = new JTextField();
            txtTotalQuatre[nbJoueur].setColumns(10);
            txtTotalCinq[nbJoueur] = new JTextField();
            txtTotalCinq[nbJoueur].setColumns(10);
            txtTotalSix[nbJoueur] = new JTextField();
            txtTotalSix[nbJoueur].setColumns(10);
            txtTotal[nbJoueur] = new JTextField();
            txtTotal[nbJoueur].setColumns(10);
            txtPrime35[nbJoueur] = new JTextField();
            txtPrime35[nbJoueur].setColumns(10);
            txtTotalsectionSup[nbJoueur] = new JTextField();
            txtTotalsectionSup[nbJoueur].setColumns(10);

            //section bass

            txtBrelan[nbJoueur] = new JTextField();
            txtBrelan[nbJoueur].setColumns(10);
            txtCarre[nbJoueur] = new JTextField();
            txtCarre[nbJoueur].setColumns(10);
            txtFull[nbJoueur] = new JTextField();
            txtCarre[nbJoueur].setColumns(10);
            txtPSuite[nbJoueur] = new JTextField();
            txtPSuite[nbJoueur].setColumns(10);
            txtGSuite[nbJoueur] = new JTextField();
            txtGSuite[nbJoueur].setColumns(10);
            txtYahtzee[nbJoueur] = new JTextField();
            txtYahtzee[nbJoueur].setColumns(10);
            txtChance[nbJoueur] = new JTextField();
            txtChance[nbJoueur].setColumns(10);
            txtPrime100[nbJoueur] = new JTextField();
            txtPrime100[nbJoueur].setColumns(10);
            txtTotalInf[nbJoueur] = new JTextField();
            txtTotalInf[nbJoueur].setColumns(10);
            txtTotalFinal[nbJoueur] = new JTextField();
            txtTotalFinal[nbJoueur].setColumns(10);*/



        B1 = new JRadioButton("1",true);
        B2 = new JRadioButton("2",false);
        B3 = new JRadioButton("3",false);



        C1 = new JRadioButton("1",true);
        C2 = new JRadioButton("2",false);
        C3 = new JRadioButton("3",false);



        D1 = new JRadioButton("1",true);
        D2 = new JRadioButton("2",false);
        D3 = new JRadioButton("3",false);



        String[] Option = new String[]{"Latin", "Grec", "Sport"};
        E1 = new JComboBox<String>(Option);


        F1 = new JCheckBox("Prendre en consideration les coefficients", true);

       // G1= new JButton("Moyenne");


        menuBar = new JMenuBar();
        option = new JMenu("Option");
        img1 = new ImageIcon("version1.gif");
        setItemInterface1(new JMenuItem("Version 1",img1));
        img2 = new ImageIcon("version2.gif");
        itemInterface2 = new JMenuItem("Version 2",img2);
        itemAide = new JMenu("Aide");
        itemComment = new JMenuItem("Comment ça marche?");
        itemApropos = new JMenuItem("A propos");
       // G1.addActionListener((ActionListener) control);
        getItemInterface1().addActionListener(control2);
        itemInterface2.addActionListener(control2);
        itemAide.addActionListener(control2);



    }

    public void creerWidget2() {

//section superieur

        JPanel PanoB1 = new JPanel();
        PanoB1.setBorder(BorderFactory.createLineBorder(Color.black));
        JLabel sectionUp = new JLabel("SECTION SUPERIEUR");
        PanoB1.add(sectionUp);

        JPanel PanoB2 = new JPanel();
        PanoB2.setBorder(BorderFactory.createLineBorder(Color.black));
        JLabel TotalAs = new JLabel("Total des AS");
        PanoB2.add(TotalAs);

        JPanel PanoB3 = new JPanel();
        PanoB3.setBorder(BorderFactory.createLineBorder(Color.black));
        JLabel TotalDeux = new JLabel("Total des DEUX");
        PanoB3.add(TotalDeux);


        JPanel PanoB4 = new JPanel();
        PanoB4.setBorder(BorderFactory.createLineBorder(Color.black));
        JLabel TotalTrois = new JLabel("Total des TROIS");
        PanoB4.add(TotalTrois);

        JPanel PanoB5 = new JPanel();
        PanoB5.setBorder(BorderFactory.createLineBorder(Color.black));
        JLabel TotalQuatre = new JLabel("Total des QUATRE");
        PanoB5.add(TotalQuatre);

        JPanel PanoB6 = new JPanel();
        PanoB6.setBorder(BorderFactory.createLineBorder(Color.black));
        JLabel TotalCinq = new JLabel("Total des CINQ");
        PanoB6.add(TotalCinq);

        JPanel PanoB7 = new JPanel();
        PanoB7.setBorder(BorderFactory.createLineBorder(Color.black));
        JLabel TotalSix = new JLabel("Total des SIX");
        PanoB7.add(TotalSix);

        JPanel PanoB8 = new JPanel();
        PanoB8.setBorder(BorderFactory.createLineBorder(Color.black));
        JLabel Total = new JLabel("Total");
        PanoB8.add(Total);

        JPanel PanoB9 = new JPanel();
        PanoB9.setBorder(BorderFactory.createLineBorder(Color.black));
        JLabel Prime35 = new JLabel("Prime des 35 points");
        PanoB9.add(Prime35);

        JPanel PanoB10 = new JPanel();
        PanoB10.setBorder(BorderFactory.createLineBorder(Color.black));
        JLabel TotalSup = new JLabel("Total de la section superieure");
        PanoB10.add(TotalSup);

        //section inferrieur

        JPanel PanoA1 = new JPanel();
        PanoA1.setBorder(BorderFactory.createLineBorder(Color.black));
        JLabel sectionInf = new JLabel("SECTION INFERIEUR");
        PanoA1.add(sectionInf);

        JPanel PanoA2 = new JPanel();
        PanoA2.setBorder(BorderFactory.createLineBorder(Color.black));
        JLabel Brelan = new JLabel("Brelan - Total des 5 dés");
        PanoA2.add(Brelan);

        JPanel PanoA3 = new JPanel();
        PanoA3.setBorder(BorderFactory.createLineBorder(Color.black));
        JLabel Carre = new JLabel("Carré - Total des 5 dés");
        PanoA3.add(Carre);


        JPanel PanoA4 = new JPanel();
        PanoA4.setBorder(BorderFactory.createLineBorder(Color.black));
        JLabel Full = new JLabel("Full - 25 point");
        PanoA4.add(Full);

        JPanel PanoA5 = new JPanel();
        PanoA5.setBorder(BorderFactory.createLineBorder(Color.black));
        JLabel PSuite = new JLabel("Petite suite - 30 points");
        PanoA5.add(PSuite);

        JPanel PanoA6 = new JPanel();
        PanoA6.setBorder(BorderFactory.createLineBorder(Color.black));
        JLabel GSuite = new JLabel("Grande suite - 40 points");
        PanoA6.add(GSuite);

        JPanel PanoA7 = new JPanel();
        PanoA7.setBorder(BorderFactory.createLineBorder(Color.black));
        JLabel Yahtzee = new JLabel("Yahtzee - 50 points");
        PanoA7.add(Yahtzee);

        JPanel PanoA8 = new JPanel();
        PanoA8.setBorder(BorderFactory.createLineBorder(Color.black));
        JLabel Chance = new JLabel("Chance - Total des 5 dés");
        PanoA8.add(Chance);

        JPanel PanoA9 = new JPanel();
        PanoA9.setBorder(BorderFactory.createLineBorder(Color.black));
        JLabel PrimeY = new JLabel("Prime Yahtzee 100 points");
        PanoA9.add(PrimeY);

        JPanel PanoA10 = new JPanel();
        PanoA10.setBorder(BorderFactory.createLineBorder(Color.black));
        JLabel TotalInf = new JLabel("Total de la section inferieur");
        PanoA10.add(TotalInf);

        JPanel PanoA11 = new JPanel();
        PanoA11.setBorder(BorderFactory.createLineBorder(Color.black));
        JLabel TotalSup2 = new JLabel("Total de la section supérieur");
        PanoA11.add(TotalSup2);

      //  JPanel PanoA12 = new JPanel();


        JPanel PanoCC1 = new JPanel();
        PanoCC1.setBorder(BorderFactory.createLineBorder(Color.black));
        JLabel TotalGen = new JLabel("Total Général");
        PanoCC1.add(TotalGen);

        JPanel PanoC1 = new JPanel();
        PanoC1.add(PanoCC1);

        //grille1
        JPanel player= new JPanel(new GridLayout(10,10));
        for (int i = 1; i <=nbJoueur; i++) {
          /*  player.add(joueur[i]);
            player.add(txtTotalAs[i]);
            player.add(txtTotalDeux[i]);
            player.add(txtTotalTrois[i]);
            player.add(txtTotalQuatre[i]);
            player.add(txtTotalCinq[i]);
            player.add(txtTotalSix[i]);
            player.add(txtTotal[i]);
            player.add(txtPrime35[i]);
            player.add(txtTotalsectionSup[i]);*/

        }
        //grille2
        JPanel player2= new JPanel(new GridLayout(10,10));
        for (int i = 1; i <=nbJoueur; i++) {
          /*  player.add(joueur2[i]);
            player.add(txtBrelan[i]);
            player.add(txtCarre[i]);
            player.add(txtFull[i]);
            player.add(txtPSuite[i]);
            player.add(txtGSuite[i]);
            player.add(txtYahtzee[i]);
            player.add(txtChance[i]);
            player.add(txtPrime100[i]);
            player.add(txtTotalInf[i]);*/

        }



        //affichage partie h
        JPanel PanoSecSup = new JPanel(new GridLayout(10, 1));
        PanoSecSup.setBorder(BorderFactory.createLineBorder(Color.black));
        PanoSecSup.add(PanoB1);
        PanoSecSup.add(PanoB2);
        PanoSecSup.add(PanoB3);
        PanoSecSup.add(PanoB4);
        PanoSecSup.add(PanoB5);
        PanoSecSup.add(PanoB6);
        PanoSecSup.add(PanoB7);
        PanoSecSup.add(PanoB8);
        PanoSecSup.add(PanoB9);
        PanoSecSup.add(PanoB10);

        //affichage partie B

        JPanel PanoSecInf = new JPanel(new GridLayout(12, 1));
        PanoSecInf.setBorder(BorderFactory.createLineBorder(Color.black));
        PanoSecInf.add(PanoA1);
        PanoSecInf.add(PanoA2);
        PanoSecInf.add(PanoA3);
        PanoSecInf.add(PanoA4);
        PanoSecInf.add(PanoA5);
        PanoSecInf.add(PanoA6);
        PanoSecInf.add(PanoA7);
        PanoSecInf.add(PanoA8);
        PanoSecInf.add(PanoA9);
        PanoSecInf.add(PanoA10);
        PanoSecInf.add(PanoA11);
        //PanoSecInf.add(PanoA12);
        PanoSecInf.add(PanoC1);





        JPanel Capsule1 = new JPanel();
        Capsule1.add(PanoSecSup);
        JPanel Capsule2 = new JPanel();
        Capsule2.add(PanoSecInf);
        JPanel Capsule3 = new JPanel();
        Capsule3.add(player);
        JPanel Capsule4 = new JPanel();
        Capsule4.add(player2);

        JPanel affichage = new JPanel(new GridLayout(2, 2));
        affichage.add(Capsule1);
        affichage.add(Capsule3);
        affichage.add(Capsule2);
        affichage.add(Capsule4);
        JPanel affichage2 = new JPanel();
        affichage2.add(affichage);

        setContentPane(affichage2);

    }


    public void creerDialogue(String dtexte) {
        JOptionPane d = new JOptionPane();
        d.showMessageDialog(this, dtexte, "Erreur",
                JOptionPane.ERROR_MESSAGE);

        JDialog fenErr = d.createDialog(this, "Erreur");
    }

    public void creerMenu() {
        JMenuBar menuBar = new JMenuBar();
        option.add(getItemInterface1());
        option.add(itemInterface2);
        option.add(itemAide);
        itemAide.add(itemComment);
        itemAide.add(itemApropos);
        menuBar.add(option);
        setJMenuBar(menuBar);
    }

    public void changerVersion(int Version) {

        switch(Version){
            case 1:
                pan.removeAll();
                pack();
                setVisible(true);
                break;

            case 2:
                pan.removeAll();
                creerWidget2();
                pack();
                setVisible(true);
                break;

            case 3:
                creerDialogue(" créer par nico");
                break;

            default:
                pan.removeAll();
                pack();
                setVisible(true);
                break;
        }

    }

    public JMenuItem getItemInterface1() {
        return itemInterface1;

    }
    public void setItemInterface1(JMenuItem itemInterface1) {

        this.itemInterface1 = itemInterface1;
    }
}
