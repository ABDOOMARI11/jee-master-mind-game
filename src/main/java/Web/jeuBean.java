package Web;

import java.util.ArrayList;

public class jeuBean {

    private  int nb;
    //****************** partie 01***************************//
//    private String msg;
//
//    public jeuBean() {
//    }
//
//    public jeuBean(int nb, String msg) {
//        this.nb = nb;
//        this.msg = msg;
//    }
//
//    public int getNb() {
//        return nb;
//    }
//
//    public String getMsg() {
//        return msg;
//    }
//
//    public void setNb(int nb) {
//        this.nb = nb;
//    }
//
//    public void setMsg(String msg) {
//        this.msg = msg;
//    }

    ArrayList<String> lstMessages=new ArrayList();

    public jeuBean() {
    }

    public jeuBean(int nb, ArrayList<String> lstMessages) {
        this.nb = nb;
        this.lstMessages = lstMessages;
    }

    public int getNb() {
        return nb;
    }

    public void setNb(int nb) {
        this.nb = nb;
    }

    public ArrayList<String> getLstMessages() {
        return lstMessages;
    }

    public void setLstMessages(ArrayList<String> lstMessages) {
        this.lstMessages = lstMessages;
    }
}
