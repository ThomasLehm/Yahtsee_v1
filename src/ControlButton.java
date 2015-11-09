import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * Created by nico on 08/11/15.
 */
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlButton implements ActionListener{
    private float coeff;

    public ControlButton(Fenetre fen) {

        Float coeff;
        Float mul;


      /*  ControlButton(Fenetre fen)
        {
            this.fen =fen;
        }

        public void setButtonControl(){

        }

      /*  public float calcoeff(JRadioButton b1,JRadioButton b2,JRadioButton b3)
        {

            if (b1.isSelected()) {
                this.coeff = 1.0f;
            } else {
                if (b2.isSelected()) {
                    this.coeff = 2.0f;
                } else {
                    if (b3.isSelected()) {
                        this.coeff = 3.0f;
                    } else {
                        Fenetre fen;
                        fen.creerDialogue("Vous n'avez pas selectionnez de coefficient");
                    }
                }
            }

            return this.coeff;
        }*/

     /*   public void actionPerformed(ActionEvent e) {

            Float src1, src2, src3, src4, src5;
            String rsrc1, rsrc2, rsrc3, rsrc4, rsrc5;
            JTextField destination;
            float source;
            String moyenne;
            String option =(fen.E1.getSelectedItem().toString());


            rsrc1=fen.txtanglais.getText();
            rsrc2=fen.txtmath.getText();
            rsrc3=fen.txtinfo.getText();
            rsrc4=fen.txtgeo.getText();
            rsrc5=fen.txtoption.getText();

            if(fen.F1.isSelected()) { //checkbox on

                if(rsrc1.compareTo(new String("") )== 0
                        || rsrc2.compareTo(new String("") ) == 0
                        || rsrc3.compareTo(new String("") ) == 0
                        || rsrc4.compareTo(new String("") ) == 0 )
                {

                    fen.creerDialogue("Il manque des valeurs");
                    System.out.println(" test manque valeur+checkbox");

                }

                if ((src1 = Float.parseFloat(rsrc1)) ==0
                        || (src1 = Float.parseFloat(rsrc1))>=21
                        || (src2 = Float.parseFloat(rsrc2))==0
                        || (src2 = Float.parseFloat(rsrc2))>=21
                        || (src3 = Float.parseFloat(rsrc3))==0
                        || (src3 = Float.parseFloat(rsrc3))>=21
                        || (src4 = Float.parseFloat(rsrc4))==0
                        || (src4 = Float.parseFloat(rsrc4))>=21)
                {

                    fen.creerDialogue("ERROR valeurs impossibles");
                    System.out.println("test valeurs impossibles+checkbox");

                }

                else
                {



                    if (rsrc5.compareTo(new String("")) == 0) {

                        src1 = Float.parseFloat(rsrc1);
                        src2 = Float.parseFloat(rsrc2);
                        src3 = Float.parseFloat(rsrc3);
                        src4 = Float.parseFloat(rsrc4);
                        source = (src1*calcoeff(fen.A1,fen.A2,fen.A3) + src2*calcoeff(fen.B1,fen.B2,fen.B3) + src3*calcoeff(fen.C1,fen.C2,fen.C3) + src4*calcoeff(fen.D1,fen.D2,fen.D3) )/ (calcoeff(fen.A1,fen.A2,fen.A3) + calcoeff(fen.B1,fen.B2,fen.B3) + calcoeff(fen.C1,fen.C2,fen.C3) + calcoeff(fen.D1,fen.D2,fen.D3)+0.0f);
                        moyenne = Float.toString(source);
                        System.out.println("test sans option+checkbox");

                    }else{
                        src1 = Float.parseFloat(rsrc1);
                        src2 = Float.parseFloat(rsrc2);
                        src3 = Float.parseFloat(rsrc3);
                        src4 = Float.parseFloat(rsrc4);
                        src5 = Float.parseFloat(rsrc5);


                        if(option.compareTo(new String("Latin"))==0 || option.compareTo(new String("Grec"))==0){
                            mul=2.0f;
                        }
                        else{mul=1.0f;}
                        source = (src1*calcoeff(fen.A1,fen.A2,fen.A3) + src2*calcoeff(fen.B1,fen.B2,fen.B3) + src3*calcoeff(fen.C1,fen.C2,fen.C3) + src4*calcoeff(fen.D1,fen.D2,fen.D3)+mul*src5) / (calcoeff(fen.A1,fen.A2,fen.A3) + calcoeff(fen.B1,fen.B2,fen.B3) + calcoeff(fen.C1,fen.C2,fen.C3) + calcoeff(fen.D1,fen.D2,fen.D3)+ mul*1.0f);
                        moyenne = Float.toString(source);
                        System.out.println("test avec option+checkbox");

                    }





                    destination = fen.txtvaleur;
                    destination.setText(moyenne);
                }
            }//fin checkbox on

            else{ //debut checkbox off


                if(rsrc1.compareTo(new String("") )== 0
                        || rsrc2.compareTo(new String("") ) == 0
                        || rsrc3.compareTo(new String("") ) == 0
                        || rsrc4.compareTo(new String("") ) == 0 )
                {

                    fen.creerDialogue("Il manque des valeurs");
                    System.out.println(" test manque valeur");
                }

                if ((src1 = Float.parseFloat(rsrc1)) ==0
                        || (src1 = Float.parseFloat(rsrc1))>=21
                        || (src2 = Float.parseFloat(rsrc2))==0
                        || (src2 = Float.parseFloat(rsrc2))>=21
                        || (src3 = Float.parseFloat(rsrc3))==0
                        || (src3 = Float.parseFloat(rsrc3))>=21
                        || (src4 = Float.parseFloat(rsrc4))==0
                        || (src4 = Float.parseFloat(rsrc4))>=21)
                {

                    fen.creerDialogue("ERROR valeurs impossibles");
                    System.out.println(" test valeur impossible");
                }

                else
                {



                    if (rsrc5.compareTo(new String("")) == 0) {

                        src1 = Float.parseFloat(rsrc1);
                        src2 = Float.parseFloat(rsrc2);
                        src3 = Float.parseFloat(rsrc3);
                        src4 = Float.parseFloat(rsrc4);
                        source = (src1 + src2 + src3 + src4)/4.0f;
                        moyenne = Float.toString(source);
                        System.out.println("test sans option");

                    }else{
                        src1 = Float.parseFloat(rsrc1);
                        src2 = Float.parseFloat(rsrc2);
                        src3 = Float.parseFloat(rsrc3);
                        src4 = Float.parseFloat(rsrc4);
                        src5 = Float.parseFloat(rsrc5);

                        source = (src1 + src2 + src3 + src4+src5)/5.0f;
                        moyenne = Float.toString(source);
                        System.out.println("test avec option");

                    }





                    destination = fen.txtvaleur;
                    destination.setText(moyenne);
                }
            }//fin checkbox off
        }*/

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
