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
        soal[0] = "1. Apa hukum shalat jenazah ?";
        soal[1] = "2. Lengkapilah bacaan dibawah ini dengan potongan ayat yang benar!";
        soal[2] = "3. Manakah potongan ayat yang benar untuk bacaan dibawah ini ?";
        soal[3] = "4. Posisi ketika mensholatkan jenazah perempuan adalah pada bagian ?";
        soal[4] = "5. Dibawah ini merupakan syarat sah sholat jenazah, kecuali ?";
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
        pilihanJawaban[0][1] = "Sunnah";
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

        pilihanJawaban[3][0] = "Searah Kepala";
        pilihanJawaban[3][1] = "Searah Bahu";
        pilihanJawaban[3][2] = "Antara Kepala dan bahu";
        pilihanJawaban[3][3] = "Searah Perut";

        pilihanJawaban[4][0] = "Berdiri bagi yang mampu";
        pilihanJawaban[4][1] = "Baligh dan berakal";
        pilihanJawaban[4][2] = "Menutup aurat";
        pilihanJawaban[4][3] = "Beragama Islam";
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
