package xebia.ismail.e_learning.evaluasi;

/**
 * Created by Zulfa_K on 17-11-2017.
 */

public class evaluasi {
    public String soal[];
    String jawaban[];
    String pilihanJawaban[][];

    int jumlahSoal = 5;
    int jumlahpilihanJawaban = 4;

    public static int jumlahbenar=0;

    public evaluasi(){
        soal = new String[jumlahSoal];
        jawaban = new String [jumlahSoal];
        pilihanJawaban = new String [jumlahSoal][jumlahpilihanJawaban];

        setSoal();
        setJawaban();
        setPilihanJawaban();
    }

    public void setSoal(){
        soal[0] = "Apa hukum shalat jenazah ?";
        soal[1] = "Lengkapilah bacaan dibawah ini!";
        soal[2] = "Bacaan apa yang dibaca pada saat takbir kedua shalat jenazah?";
        soal[3] = "Apa yang dimaksud fardhu kifayah?";
        soal[4] = "What?";
    }
    public void setJawaban(){
        jawaban[0] = "a";
        jawaban[1] = "b";
        jawaban[2] = "c";
        jawaban[3] = "d";
        jawaban[4] = "a";
    }

    public void setPilihanJawaban(){
        pilihanJawaban[0][0] = "Fardhu Kifayah";
        pilihanJawaban[0][1] = "sunnah";
        pilihanJawaban[0][2] = "Haram";
        pilihanJawaban[0][3] = "Wajib";

        pilihanJawaban[1][0] = "2.1";
        pilihanJawaban[1][1] = "2.2";
        pilihanJawaban[1][2] = "2.3";
        pilihanJawaban[1][3] = "2.4";

        pilihanJawaban[2][0] = "3.1";
        pilihanJawaban[2][1] = "3.2";
        pilihanJawaban[2][2] = "3.3";
        pilihanJawaban[2][3] = "3.4";

        pilihanJawaban[3][0] = "4.1";
        pilihanJawaban[3][1] = "4.2";
        pilihanJawaban[3][2] = "4.3";
        pilihanJawaban[3][3] = "4.4";

        pilihanJawaban[4][0] = "5.1";
        pilihanJawaban[4][1] = "5.2";
        pilihanJawaban[4][2] = "5.3";
        pilihanJawaban[4][3] = "5.4";
    }

    public void setJumlahBenar(int jmlbnr){
        jumlahbenar=jmlbnr;
    }
    public int getJumlahBenar(){
        return jumlahbenar;
    }

    public String getSoal(int nomorsoal){
        return soal[nomorsoal];
    }
    public String getPilihanJawaban(int nomorsoal, int nomorjawaban){
        return pilihanJawaban[nomorsoal][nomorjawaban];
    }
    public String getJawaban(int nomorsoal){
        return jawaban[nomorsoal];
    }
}
