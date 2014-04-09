package GUI;


import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.List;
import javax.microedition.midlet.MIDlet;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author joe
 */
public class statistiquesForm extends List implements CommandListener {

    piechartCanvas piechCanvas = new piechartCanvas();
    barchartForm barForm;
    int id_co ;
    public statistiquesForm(int id_co) {
         
        super("Choisir une statistiques à afficher :", List.IMPLICIT);
        this.id_co=id_co;
        System.out.println("IDCO STATFFORM"+this.id_co);
        barForm = new barchartForm(this.id_co);
        this.append("Les 3 Meilleurs Villes", null);
        this.append("Mes dépenses covoiturages", null);
        this.setCommandListener(this);
    }

    public void commandAction(Command c, Displayable d) {
        if ((c == List.SELECT_COMMAND) && (this.getSelectedIndex() == 0)) {
          Midlet.getDisplay().setCurrent(piechCanvas); 
        }
        if ((c == List.SELECT_COMMAND) && (this.getSelectedIndex() == 1)) {
          Midlet.getDisplay().setCurrent(barForm);
        }
    }

    public void run() {
    }
}
