/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.io.DataInputStream;
import java.io.IOException;
import javax.microedition.io.ConnectionNotFoundException;
import javax.microedition.io.Connector;
import javax.microedition.io.HttpConnection;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;
import java.io.IOException;
import javax.microedition.io.ConnectionNotFoundException;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;

/**
 *
 * @author admin
 */
public class FormContact extends List implements CommandListener {
Displayable testform;
MIDlet midlet;
    sendSMS sms1 = new sendSMS();
    String[] elm = {"réserver", "envoyer un message", "envoyer un sms", "appeler"};
    List list;//=new List("Contacter",List.IMPLICIT,elm,null);
    public Command exit, next;
    public Image reser, call, sms, message;

    public FormContact() {
        super("ism liste",List.IMPLICIT);
        System.out.println("  reser");
       
        try {
            reser = Image.createImage("/book.jpg");
            message = Image.createImage("/message.jpg");
            sms = Image.createImage("/sms.jpg");
            call = Image.createImage("/call.jpg");

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        System.out.println("    image");
        Image[] imageElements = {reser, message, sms, call};
        list = new List("contact", List.IMPLICIT, elm, imageElements);
        System.out.println("    list1");

        next = new Command("Select", Command.SCREEN, 0);
        exit = new Command("Exit", Command.EXIT, 0);
        System.out.println("    commede");
        list.addCommand(next);
        
        list.addCommand(exit);
        System.out.println("    commecde4");
        list.setCommandListener(this);

    }

    
   
    

    public void commandAction(Command c, Displayable d) {

        if (c == List.SELECT_COMMAND) {
            if (list.getSelectedIndex() == 0) {

            }
            if (list.getSelectedIndex() == 1) {

            }

            if (list.getSelectedIndex() == 2) {
                System.out.println(" sms");
                Midlet.getDisplay().setCurrent(sms1.compose);

            }

            if (list.getSelectedIndex() == 3) {
                Midlet m = new Midlet();
                System.out.println(" call ");
                m.callme("5550000");

            }
        }

    }
     

}
