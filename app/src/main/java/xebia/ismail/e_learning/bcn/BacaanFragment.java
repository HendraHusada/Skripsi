package xebia.ismail.e_learning.bcn;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import xebia.ismail.e_learning.R;

/**
 * Created by Zulfa_K on 14-11-2017.
 */

public class BacaanFragment extends Fragment {

    RecyclerView rvBacaan;
    MediaPlayer mPlayer;
    String bacaanApa;

    public void setBacaanApa(String bcnApa){
        bacaanApa = bcnApa;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_bcn, container, false);
        rvBacaan = (RecyclerView) v.findViewById(R.id.recyclerViewBacaan);
        mPlayer = MediaPlayer.create(getContext(), R.raw.awaitsu);
        Toast.makeText(getContext(), bacaanApa, Toast.LENGTH_SHORT).show();
        return v;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        rvBacaan.setLayoutManager(layoutManager);
        rvBacaan.setHasFixedSize(true);

        List<BacaanModel> bcn = new ArrayList<BacaanModel>();

        if(BacaanModel.kelamin.equals("cowok")){
            if(bacaanApa.equals("niat")){
                bcn.add(new BacaanModel(2, false, R.drawable.niat_cowok, R.raw.niat_laki, "Artinya : 'Saya niat shalat atas mayyit (laki-laki) ini empat takbir fardhu kifayah karena Allah SWT'", "Ushalli 'alaa haadzal mayyiti arba'a takbiiraatin fardhal kifaayati makmuuman lillaahi ta'aalaa"));

            }
            else if(bacaanApa.equals("takbir1")){
                bcn.add(new BacaanModel(1, false, R.drawable.alfatihah_1, R.raw.alfatihah_1, "Artinya : 'Dengan menyebut nama Allah Yang Maha Pengasih lagi Maha Penyayang'", "Bismillaahirrahmaanirrahiim"));
                bcn.add(new BacaanModel(1, false, R.drawable.alfatihah_2, R.raw.alfatihah_2, "Artinya : 'Segala puji bagi Allah, Tuhan semesta alam'", "Alhamdulillaahirabbil’aalamiin"));
                bcn.add(new BacaanModel(1, false, R.drawable.alfatihah_3, R.raw.alfatihah_3, "Artinya : 'Yang Maha Pemurah lagi Maha Penyayang'", "Arrahmaanirrahiim"));
                bcn.add(new BacaanModel(1, false, R.drawable.alfatihah_4, R.raw.alfatihah_4, "Artinya : 'Yang menguasai di Hari Pembalasan'", "Maalikiyawmiddiin"));
                bcn.add(new BacaanModel(1, false, R.drawable.alfatihah_5, R.raw.alfatihah_5, "Artinya : 'Hanya Engkaulah yang kami sembah, dan hanya kepada Engkaulah kami meminta pertolongan'", "Iyyaakana’buduwa-iyyaakanasta’iin"));
                bcn.add(new BacaanModel(1, false, R.drawable.alfatihah_6, R.raw.alfatihah_6, "Artinya : 'Tunjukanlah kami kejalan yang lurus'", "Ihdinaashshiraathalmustaqiim"));
                bcn.add(new BacaanModel(2, false, R.drawable.alfatihah_7, R.raw.alfatihah_7, "Artinya : '(yaitu) Jalan orang-orang yang telah Engkau beri nikmat kepada mereka; bukan (jalan) mereka yang dimurkai dan bukan (pula jalan) mereka yang sesat'", "Shiraathalladziinaan’amta’alayhim ghayrilmaghdhuubi’alayhim "));
            }
            else if(bacaanApa.equals("takbir2")){
                bcn.add(new BacaanModel(1, false, R.drawable.sholawat_1, R.raw.sholawat_1, "Artinya : 'Ya Allah, berilah rahmat kepada Muhammad dan keluarganya'", "Allaahumma shalli 'alaa muhammadin, wa 'alaa aali muhammadin"));
                bcn.add(new BacaanModel(1, false, R.drawable.sholawat_2, R.raw.sholawat_2, "Artinya : 'sebagaimana Engkau telah memberikan rahmat kepada Ibrahim dan keluarganya'", "Kamaa shallaita 'alaa ibraahiima, wa 'alaa aali ibraahiima"));
                bcn.add(new BacaanModel(1, false, R.drawable.sholawat_3, R.raw.sholawat_3, "Artinya : 'Berilah berkah kepada Muhammad dan keluarganya (termasuk anak dan istri atau umatnya)'", "Wa baarik 'alaa muhammadin, wa 'alaa aali muhammadin,"));
                bcn.add(new BacaanModel(1, false, R.drawable.sholawat_4, R.raw.sholawat_4, "Artinya : 'sebagaimana Engkau telah memberi berkah kepada Ibrahim dan keluarganya'", "kamaa baarakta 'alaa ibraahiima, wa 'alaa aali ibraahiima"));
                bcn.add(new BacaanModel(1, false, R.drawable.sholawat_5, R.raw.sholawat_5, "Artinya : 'Sesungguhnya Engkau Maha Terpuji dan Maha Agung'", "Fil 'aalamiina innaka hamiidum majiid"));
            }
            else if(bacaanApa.equals("takbir3")){
                bcn.add(new BacaanModel(1, false, R.drawable.takbir3_baris1, R.raw.takbir3_co1, "Artinya : 'Ya Allah ampunilah dia, rahmatilah dia, maafkanlah dia'","Allaahummaghfirlahu warhamhu wa 'aafihi wa'fu 'anhu"));
                bcn.add(new BacaanModel(1, false, R.drawable.takbir3_baris2, R.raw.takbir3_co2, "Artinya : 'maafkanlah dia, ampunilah kesalahannya'","wa akrim nuzuulahu, wa wassi' madkhalahu"));
                bcn.add(new BacaanModel(1, false, R.drawable.takbir3_baris3, R.raw.takbir3_co3, "Artinya : 'lapangkanlah kuburannya, cucilah kesalahannya dengan air'","waghsilhu bimaa-in watsaljin wabaradin"));
                bcn.add(new BacaanModel(2, false, R.drawable.takbir3_baris4, R.raw.takbir3_co4, "Artinya : 'dan embun sebagaimana mencuci pakaian putih dari kotoran'","wanaqqihi minal khathaayaa kamaa yunaqqats tsaubul abyadhu minaddanasi"));
                bcn.add(new BacaanModel(1, false, R.drawable.takbir3_baris5, R.raw.takbir3_co5, "Artinya : 'gantilah rumahnya dengan rumah yang lebih baik'","wa abdilhu daaran khairan min daarihi"));
                bcn.add(new BacaanModel(1, false, R.drawable.takbir3_baris6, R.raw.takbir3_co6, "Artinya : 'gantilah keluarganya dengan keluarga yang lebih baik, gantilah istrinya dengan isri yang lebih baik'","wa ahlan khairan min ahlihi, wa zaujan khairan min zaujihi"));
                bcn.add(new BacaanModel(1, false, R.drawable.takbir3_baris7, R.raw.takbir3_co7, "Artinya : 'hindarkanlah dari fitnah kubur dan siksa neraka'","waqihi fitnatal qabri wa 'adzaabannaar"));
            }
            else if(bacaanApa.equals("takbir4")){
                bcn.add(new BacaanModel(2, false, R.drawable.takbir4_baris1_co, R.raw.takbir4_co1, "Artinya : 'Ya Allah, janganlah kiranya pahalanya tidak sampai kepada kami, dan janganlah Engkau memberi kami fitnah sepeninggalnya, dan ampunilah kami dan dia'", "Allahumma laa tahrimnaa ajrahu walaa taftinna ba’dahu waghfir lanaa walahu"));
                bcn.add(new BacaanModel(2, false, R.drawable.takbir4_baris2_co, R.raw.takbir4_ayat2, "Artinya : 'dan bagi saudara-saudara kita yang mendahului kita dengan iman, dan janganlah Engkau menjadikan gelisah dalam hati kami'","wali ikhwaaninal ladziina sabaquuna bil imaani walaa taj’al fii quluubina"));
                bcn.add(new BacaanModel(1, false, R.drawable.takbir4_baris3_co, R.raw.takbir4_ayat3, "Artinya : 'dan bagi orang-orang yang beriman. Wahai Tuhan kami sesungguhnya Engkaulah Maha Pengampun lagi Maha Penyayang'", "ghillanlilladziina aamanuu rabbanaa innaka ra'uufur rahiimun"));
            }

            else if(bacaanApa.equals("salam")){
                bcn.add(new BacaanModel(1, false, R.drawable.salam, R.raw.salam, "Artinya : 'Keselamatan, rahmat Allah dan keberkahan-Nya semoga untuk kalian semua'","Assalaamu 'alaikum warahmatullaahi wa barakaatuh"));
            }
        }
        else if(BacaanModel.kelamin.equals("cewek")){
            if(bacaanApa.equals("niat")){
                bcn.add(new BacaanModel(2, false, R.drawable.niat_cewek, R.raw.niat_perempuan, "Artinya : 'Saya niat shalat atas mayyit (perempuan) ini empat takbir fardhu kifayah karena Allah SWT'","Ushalli 'alaa haadzihil maytati arba'a takbiiraatin fardhal kifaayati makmuuman lillaahi ta'aalaa"));

            }
            else if(bacaanApa.equals("takbir1")){
                bcn.add(new BacaanModel(1, false, R.drawable.alfatihah_1, R.raw.alfatihah_1, "Artinya : 'Dengan menyebut nama Allah Yang Maha Pengasih lagi Maha Penyayang'", "Bismillaahirrahmaanirrahiim"));
                bcn.add(new BacaanModel(1, false, R.drawable.alfatihah_2, R.raw.alfatihah_2, "Artinya : 'Segala puji bagi Allah, Tuhan semesta alam'", "Alhamdulillaahirabbil’aalamiin"));
                bcn.add(new BacaanModel(1, false, R.drawable.alfatihah_3, R.raw.alfatihah_3, "Artinya : 'Yang Maha Pemurah lagi Maha Penyayang'", "Arrahmaanirrahiim"));
                bcn.add(new BacaanModel(1, false, R.drawable.alfatihah_4, R.raw.alfatihah_4, "Artinya : 'Yang menguasai di Hari Pembalasan'", "Maalikiyawmiddiin"));
                bcn.add(new BacaanModel(1, false, R.drawable.alfatihah_5, R.raw.alfatihah_5, "Artinya : 'Hanya Engkaulah yang kami sembah, dan hanya kepada Engkaulah kami meminta pertolongan'", "Iyyaakana’buduwa-iyyaakanasta’iin"));
                bcn.add(new BacaanModel(1, false, R.drawable.alfatihah_6, R.raw.alfatihah_6, "Artinya : 'Tunjukanlah kami kejalan yang lurus'", "Ihdinaashshiraathalmustaqiim"));
                bcn.add(new BacaanModel(2, false, R.drawable.alfatihah_7, R.raw.alfatihah_7, "Artinya : '(yaitu) Jalan orang-orang yang telah Engkau beri nikmat kepada mereka; bukan (jalan) mereka yang dimurkai dan bukan (pula jalan) mereka yang sesat'", "Shiraathalladziinaan’amta’alayhim ghayrilmaghdhuubi’alayhim "));
            }
            else if(bacaanApa.equals("takbir2")){
                bcn.add(new BacaanModel(1, false, R.drawable.sholawat_1, R.raw.sholawat_1, "Artinya : 'Ya Allah, berilah rahmat kepada Muhammad dan keluarganya'", "Allaahumma shalli 'alaa muhammadin, wa 'alaa aali muhammadin"));
                bcn.add(new BacaanModel(1, false, R.drawable.sholawat_2, R.raw.sholawat_2, "Artinya : 'sebagaimana Engkau telah memberikan rahmat kepada Ibrahim dan keluarganya'", "Kamaa shallaita 'alaa ibraahiima, wa 'alaa aali ibraahiima"));
                bcn.add(new BacaanModel(1, false, R.drawable.sholawat_3, R.raw.sholawat_3, "Artinya : 'Berilah berkah kepada Muhammad dan keluarganya (termasuk anak dan istri atau umatnya)'",
                        "Wa baarik 'alaa muhammadin, wa 'alaa aali muhammadin,"));
                bcn.add(new BacaanModel(1, false, R.drawable.sholawat_4, R.raw.sholawat_4, "Artinya : 'sebagaimana Engkau telah memberi berkah kepada Ibrahim dan keluarganya'", "kamaa baarakta 'alaa ibraahiima, wa 'alaa aali ibraahiima"));
                bcn.add(new BacaanModel(1, false, R.drawable.sholawat_5, R.raw.sholawat_5, "Artinya : 'Sesungguhnya Engkau Maha Terpuji dan Maha Agung'", "Fil 'aalamiina innaka hamiidum majiid"));
            }
            else if(bacaanApa.equals("takbir3")){
                bcn.add(new BacaanModel(1, false, R.drawable.takbir3_baris1_ce, R.raw.takbir3_ce1, "Artinya : 'Ya Allah ampunilah dia, rahmatilah dia, maafkanlah dia'", "Allaahummaghfirlaha warhamha wa 'aafiha wa'fu 'anha"));
                bcn.add(new BacaanModel(1, false, R.drawable.takbir3_baris2_ce, R.raw.takbir3_ce2, "Artinya : 'maafkanlah dia, ampunilah kesalahannya'","wa akrim nuzuulaha, wa wassi' madkhalaha"));
                bcn.add(new BacaanModel(1, false, R.drawable.takbir3_baris3_ce, R.raw.takbir3_ce3, "Artinya : 'lapangkanlah kuburannya, cucilah kesalahannya dengan air'","waghsilha bimaa-in watsaljin wabaradin"));
                bcn.add(new BacaanModel(2, false, R.drawable.takbir3_baris4_ce, R.raw.takbir3_ce4, "Artinya : 'dan embun sebagaimana mencuci pakaian putih dari kotoran'","wanaqqihi minal khathaayaa kamaa yunaqqats tsaubul abyadhu minaddanasi"));
                bcn.add(new BacaanModel(1, false, R.drawable.takbir3_baris5_ce, R.raw.takbir3_ce5new, "Artinya : 'gantilah rumahnya dengan rumah yang lebih baik'","wa abdilha daaran khairan min daariha"));
                bcn.add(new BacaanModel(1, false, R.drawable.takbir3_baris6_ce, R.raw.takbir3_ce6, "Artinya : 'gantilah keluarganya dengan keluarga yang lebih baik, gantilah suaminya dengan suami yang lebih baik'","wa ahlan khairan min ahliha, wa zaujan khairan min zaujiha"));
                bcn.add(new BacaanModel(1, false, R.drawable.takbir3_baris7_ce, R.raw.takbir3_ce7, "Artinya : 'hindarkanlah dari fitnah kubur dan siksa neraka'","waqiha fitnatal qabri wa 'adzaabannaar"));
            }
            else if(bacaanApa.equals("takbir4")){
                bcn.add(new BacaanModel(2, false, R.drawable.takbir4_baris1_co, R.raw.takbir4_ce1, "Artinya : 'Ya Allah, janganlah kiranya pahalanya tidak sampai kepada kami, dan janganlah Engkau memberi kami fitnah sepeninggalnya, dan ampunilah kami dan dia'", "Allahumma laa tahrimnaa ajraha walaa taftinna ba’daha waghfir lanaa walaha"));
                bcn.add(new BacaanModel(2, false, R.drawable.takbir4_baris2_co, R.raw.takbir4_ayat2, "Artinya : 'dan bagi saudara-saudara kita yang mendahului kita dengan iman, dan janganlah Engkau menjadikan gelisah dalam hati kami'","wali ikhwaaninal ladziina sabaquuna bil imaani walaa taj’al fii quluubina"));
                bcn.add(new BacaanModel(1, false, R.drawable.takbir4_baris3_co, R.raw.takbir4_ayat3, "Artinya : 'dan bagi orang-orang yang beriman. Wahai Tuhan kami sesungguhnya Engkaulah Maha Pengampun lagi Maha Penyayang'","ghillanlilladziina aamanuu rabbanaa innaka ra’uufur rahiimun"));
            }

            else if(bacaanApa.equals("salam")){
                bcn.add(new BacaanModel(1, false, R.drawable.salam, R.raw.salam, "Artinya : 'Keselamatan, rahmat Allah dan keberkahan-Nya semoga untuk kalian semua'","Assalaamu 'alaikum warahmatullaahi wa barakaatuh"
                ));
            }
        }


        final BacaanAdapter adapterBacaan = new BacaanAdapter(getContext());
        adapterBacaan.setListBacaan(bcn);
        adapterBacaan.setClickListener(new BacaanAdapter.ViewHolderClickListener() {
            @Override
            public void onViewHolderClick(View v, int position) {
                Toast.makeText(getContext(), Integer.toString(position), Toast.LENGTH_SHORT).show();
                for(int i=0; i<adapterBacaan.getListBacaan().size(); i++){
                    if(i==position){
                        adapterBacaan.getListBacaan().get(i).isSelected = true;
                    }
                    else{
                        adapterBacaan.getListBacaan().get(i).isSelected = false;
                    }
                }
                adapterBacaan.notifyDataSetChanged();

                if(mPlayer.isPlaying()){ mPlayer.stop(); }
                mPlayer = MediaPlayer.create(getContext(), adapterBacaan.getListBacaan().get(position).mp3Id);
                mPlayer.start();
            }
        });

        rvBacaan.setAdapter(adapterBacaan);
    }

    @Override
    public void onPause() {
        super.onPause();
        if(mPlayer.isPlaying()){ mPlayer.stop(); }
    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if(!isVisibleToUser){
            try{
                if(mPlayer.isPlaying()){ mPlayer.stop(); }
            }catch (Exception n){
                Log.e("MediaPlayer", "null");
            }
        }
    }
}
