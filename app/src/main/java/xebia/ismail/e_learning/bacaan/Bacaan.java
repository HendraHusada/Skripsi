package xebia.ismail.e_learning.bacaan;

/**
 * Created by Hendra Fang on 11/2/2017.
 */

public class Bacaan {
    private int status;
    private int gambar;
    private int waktu;
    private String arti;
    private String audio;
    private int pos;
    private boolean showPB;

    public Bacaan(int status, int gambar, int waktu, String arti, String audio, int pos, boolean showPB) {
        this.status = status;
        this.gambar = gambar;
        this.waktu = waktu;
        this.arti = arti;
        this.audio = audio;
        this.pos = pos;
        this.showPB = showPB;
    }

    public void setShowPB(boolean isShow){ this.showPB = isShow; }

    public boolean getShowPB(){ return showPB; }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public int getPos() {
        return pos;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }

    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }

    public void setWaktu(int waktu) {
        this.waktu = waktu;
    }

    public void setArti(String arti) {
        this.arti = arti;
    }


    public int getWaktu() {
        return waktu;
    }

    public String getArti() {
        return arti;
    }
}
