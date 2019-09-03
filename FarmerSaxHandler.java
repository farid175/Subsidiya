import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

public class FarmerSaxHandler extends DefaultHandler {

    private List<Farmer> farmerList;

    public List<Farmer> getFarmerList() {
        return farmerList;
    }

    public void setFarmerList(List<Farmer> farmerList) {
        this.farmerList = farmerList;
    }

    private Farmer tempFarmer;
    private boolean isFarmer;

    private boolean isSira;
    private boolean isSname;
    private boolean isCemi_ha;
    private boolean isArpa;
    private boolean isQargidali;
    private boolean isGun_bax;
    private boolean isPambiq;
    private boolean isSek_cug;
    private boolean isKartof;
    private boolean isTerevez;
    private boolean isBostan;
    private boolean isUzum;
    private boolean isMeyve;
    private boolean isCay;
    private boolean isDiger;
    private boolean isKend;
    private boolean isAdrayon;
    private boolean isRayon;

    @Override
    public void startDocument() throws SAXException {
        farmerList = new ArrayList<>();
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if (qName.equals("Farmer")){
            tempFarmer = new Farmer();
            isFarmer = true;
        }else if (qName.equals("sira")){
            isSira = true;
        }else if (qName.equals("sname")){
            isSname= true;
        }else if (qName.equals("cemi_ha")) {
            isCemi_ha = true;
        } else if (qName.equals("arpa")) {
            isArpa = true;
        } else if (qName.equals("qargidali")) {
            isQargidali = true;
        } else if (qName.equals("gun_bax")) {
            isGun_bax = true;
        } else if (qName.equals("pambiq")) {
            isPambiq = true;
        } else if (qName.equals("sek_cug")) {
            isSek_cug = true;
        } else if (qName.equals("kartof")) {
            isKartof = true;
        } else if (qName.equals("terevez")) {
            isTerevez = true;
        } else if (qName.equals("bostan")) {
            isBostan = true;
        } else if (qName.equals("uzum")) {
            isUzum = true;
        } else if (qName.equals("meyve")) {
            isMeyve = true;
        } else if (qName.equals("cay")) {
            isCay = true;
        } else if (qName.equals("diger")) {
            isDiger = true;
        } else if (qName.equals("kend")) {
            isKend = true;
        } else if (qName.equals("adrayon")) {
            isAdrayon = true;
        } else if (qName.equals("rayon")) {
            isRayon = true;
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        String data = new String(ch ,start ,length);
        if (isSira){
            if (isFarmer){
                tempFarmer.setSira(data);
            }
            isSira = false;
        }else if (isSname){
            if (isFarmer){
                tempFarmer.setSname(data);
            }
            isSname = false;
        }else if (isCemi_ha) {
            if (isFarmer) {
                tempFarmer.setCemi_ha(data);
            }
            isCemi_ha = false;
        } else if (isArpa) {
            if (isFarmer) {
                tempFarmer.setArpa(data);
            }
            isArpa = false;
        } else if (isQargidali) {
            if (isFarmer) {
                tempFarmer.setQargidali(data);
            }
            isQargidali = false;
        } else if (isGun_bax) {
            if (isFarmer) {
                tempFarmer.setGun_bax(data);
            }
            isGun_bax = false;
        } else if (isPambiq) {
            if (isFarmer) {
                tempFarmer.setPambiq(data);
            }
            isPambiq = false;
        } else if (isSek_cug) {
            if (isFarmer) {
                tempFarmer.setSek_cug(data);
            }
            isSek_cug = false;
        } else if (isKartof) {
            if (isFarmer) {
                tempFarmer.setKartof(data);
            }
            isKartof = false;
        } else if (isTerevez) {
            if (isFarmer) {
                tempFarmer.setTerevez(data);
            }
            isTerevez = false;
        } else if (isBostan) {
            if (isFarmer) {
                tempFarmer.setBostan(data);
            }
            isBostan = false;
        } else if (isUzum) {
            if (isFarmer) {
                tempFarmer.setUzum(data);
            }
            isUzum = false;
        } else if (isMeyve) {
            if (isFarmer) {
                tempFarmer.setMeyve(data);
            }
            isMeyve = false;
        } else if (isCay) {
            if (isFarmer) {
                tempFarmer.setCay(data);
            }
            isCay = false;
        } else if (isDiger) {
            if (isFarmer) {
                tempFarmer.setDiger(data);
            }
            isDiger = false;
        } else if (isKend) {
            if (isFarmer) {
                tempFarmer.setKend(data);
            }
            isKend = false;
        } else if (isAdrayon) {
            if (isFarmer) {
                tempFarmer.setAdrayon(data);
            }
            isAdrayon = false;
        } else if (isRayon) {
            if (isFarmer) {
                tempFarmer.setRayon(data);
            }
            isRayon = false;
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (qName.equals("Farmer")){
            farmerList.add(tempFarmer);
            tempFarmer = null;
            isFarmer = false;
        }
    }

    @Override
    public void endDocument() throws SAXException {
    }

}
