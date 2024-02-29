package com.example.sdanyimba;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DbClass extends SQLiteOpenHelper {
    private final static String DB_NAME = "nyimba";
    private static final int DB_VERSION = 1;
    public DbClass(@Nullable  Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String tbCreation = "CREATE TABLE ennyimba (HymNo INTEGER PRIMARY KEY, title TEXT, longDesc TEXT);";
        sqLiteDatabase.execSQL(tbCreation);

       String hyms = "INSERT INTO ennyimba VALUES (1,'Gw’oli Mutukuvu…','Gw’oli Mutukuvu, Ayinza byonna! \n" +
               "Buli ku nkya tunakutenderezanga; \n" +
               "Oli Mutukuvu! W’akisa wa maanyi! Katond(a) afuga ebintu byonna.\n\nGw’oli Mutukuvu, Bakutendereza,\n" +
               "Bamalayika bo bakuvunnamira;\n" +
               "(E)nkumi n’obukumi,  Bakusinza wonna, \n" +
               "Ggwe (e)yaliwo era olibaawo.\n\nGw’oli Mutukuvu, Newankubadde,\n" +
               "Nga tetukulaba n’amaaso g’obuntu;\n" +
               "Gw’oli Mutukuvu, Tewali mulala,\n" +
               "Atuukiridde mu maanyi gonna.\n\nGw’oli Mutukuvu,  Ayinza byonna!\n" +
               "Emirimu gyo gitenda erinnya lyo,\n" +
               "Gw’oli Mutukuvu, W’akisa wa maanyi \n" +
               "Katond(a) omu, Ali mu busatu.\n')," +
               "(2,'Ka Tukusuute, Omulokozi Waffe','Ka tukusuute, (O)mulokozi waffe,\n" +
               "Gwe~ yafa kaakano \n" +
               "wagenda  mu ggulu.\n\nChorus:\n" +
               "Aleruya, Tukusuuta,\n" +
               " Aleruya Yesu,\n" +
               "Aleruya, Tukusuuta, \n" +
               "Tuwonye nate.\n\nKa tukusuute\n" +
               "(O)mwoyo Mutukuvu\n" +
               "Gw’e~ yatulaga Omulokozi waffe.\n\nKa tukusuute \n" +
               "gw’Omwana gw’endiga.\n" +
               "Gwe~ yatukuza ebibi byaffe byonna.\n\nKa tukusuute, \n" +
               "Katonda (o)w’ekisa,\n" +
               "Gwe-yatununula n’otutuusa gy’oli.\n\nTuwonye nate, \n" +
               "tujjuz(e) okwagala,\n" +
               "(O)mu~liro gwakenga \n" +
               "mu mwoyo gyaffe.\n')," +
               "(3,'Aweebwe Ekitiibwa','Aweebw(e) ekitiibwa Katonda waffe;\n" +
               "Yayagal(a) ensi n’awaay(o) \n" +
               "Omwana we,\n" +
               "Yafuuka sadaaka y’ekibi kyaffe; Naggulaw(o) oluggi ffe tuyingire.\n\nChorus\n" +
               "Tumutendereze , Ensi ewulire,\n" +
               "Tuyimbe, Tuyimbe, Ensi esanyuke;\n" +
               "Mujje eri Kitaaffe  mu Mwana Yesu;\n" +
               "Aweebw(e) ekitiibwa yatununula.\n\nTwanunulibwa twagula musaayi; Kisubizo eri buli akkiriza;\n" +
               "Omubi lukulwe  amukiriza, \n" +
               "Asonyiyibwa ebibi bye byonna.\n\nAtuyigirizz(a) ebikulu bingi, \n" +
               "N’essanyu lingi lyatuwa mu Yesu;\n" +
               "Oyo Mutukuvu mugulumivu, \n" +
               "Kirabo kisuffu nga tumulabye. \n')," +
               "(4,'Tusinza Nnyo " +
               "Erinya Lye…','Tusinza nnyo erinya lye \n" +
               "(O)mulokozi waffe; \n" +
               "Awamu n’abantu~ bo~nna, \n" +
               "Kabaka waffe Yesu; \n" +
               "Awamu n’abantu~ bo~nna,\n" +
               " Kabaka wa~ffe Yesu; \n\nAbant(u) abaasonyiyibwa \n" +
               "olw’ekisa kye Ye, \n" +
               "Mumufufukaamiri~re~nga,\n" +
               " Kabaka waffe Yesu; Mumufufukaamiri~re~nga,\n" +
               " Kabaka waffe Yesu; \n\nAmawanga gonn(a) ag’ensi, \n" +
               "Mujje eri Yesu;   \n" +
               "Tumuw(e) ekitiibwa~ kyo~nna, Kabaka waffe Yesu; \n" +
               "Tumuw(e) ekitiibwa~ kyo~nna, Kabaka wa~ffe Yesu.\n\n(A)wamu ne bamalayika, \n" +
               "Ffe tulimusinza, \n" +
               "Okumweyanza bu~li~jjo,\n" +
               " Kabaka waffe Yesu;\n" +
               " Okumweyanza bu~li~jjo\n" +
               "Kabaka wa~ffe Yesu; \n')," +
               "(5,'Ka Tumusinze Mukama Waffe','Katumusinze Mukama waffe,\n" +
               "Katuyimbe ku kwaga~l(a) okungi.\n" +
               "Oyo yekka kye kiddukiro kyaffe,\n" +
               "Ekitiibwa kyonna kimwe~toloola \n\nTuyimbe ku kisa kye ekingi,\n" +
               "(E)byambalo bye gwe (o)musa~na gw’ensi;\n" +
               "Okubwatuka kwe kutiisa byonna,\n" +
               "Amakubo ge gale ne~ mu mpewo. \n\nObuyinza bwe era n’entiisa,\n" +
               "Birabikira wonna~ ku bire;\n" +
               "Eggulu n’eraddu n’omuyag(a) era,\n" +
               "Byonna baddu be abamu~wereza\n\nWansi w’eggulu (O)mugulumivu,\n" +
               "Wateekebwa daa enku~luze yo;\n" +
               "Ye nsi gye watonda n’ogyetolooza,\n" +
               "Ennyanja zona nga ensa~lo zaayo.\n\nAni ayinza okunnyumiza, Ebyo,\n" +
               "(O)mugabi waffe,~ by’ogaba?\n" +
               "Eby’ekisa kyo, by’ebitwewunyisa:\n" +
               "Katonda, Mulokoz(i), era~ Kabaka!\n')," +
               "(6,'Mmwe Amawanga Ag’oku Nsi…','Mmwe amawanga~ (a)g’oku~ nsi,\n" +
               "Mujje tuvuname fenna!\n" +
               "Awali e~nte~b(e) e~nkulu,\n" +
               "Eya Mukama Katonda.\n\nNnannyini buyi~nza bwo~nna,\n" +
               "Yatuggya mu nfufu fenna;\n" +
               "Ffe bwe twawa~ba~ ng’e~ndiga,\n" +
               "Yayanguw(a) okutunoonya.\n\nTunajjuza (e)mi~ryango~ gye,\n" +
               "Ennyimba ez’amatendo;\n" +
               "Tumwebaze~ n’e~ddo~boozi,\n" +
               "Nga tumutendereza nnyo.\n\n(A)mateeka ge ga~ mire~mbe,\n" +
               "(O)kwagala kwe kuwangula;\n" +
               "(A)mazima ge~ te~ga~kyuka\n" +
               "Gabaaw(o) emirembe gyonna.')," +
               "(7,'Mukama Gwe Kifo Kyaffe…','\n" +
               "Mukama Ggwe kifo kyaffe,\n" +
               "Eky’okutuulamu,\n" +
               "Mu mirembe n’emirembe\n" +
               "Era Lwazi lwaffe,\n\n(O)kuv(a) edda abatukuvu\n" +
               "Baakwesiganga Ggwe:\n" +
               "(O)mukono gwo gwabamala \n" +
               "Gunatumala ffe.\n\nEnsi nga tennatondebwa\n" +
               "Ebintu nga mpaawo,\n" +
               "Edda n’edda gw’oba bumu\n" +
               "Katond(a) atavaawo.\n\nEmyak(a) olukumi gy’oli\n" +
               "Lwe lunaku lumu;\n" +
               "Gikulukuta ng(a) amazzi\n" +
               "Agayita (a)mangu.\n\nN’ebintu byonn(a) eby’omu nsi\n" +
               "Biyita bwe bityo,\n" +
               "Leero tuba nabyo, naye\n" +
               "Jjo nga biweddewo.\n\nMukama Ggwe kifo kyaffe,\n" +
               "Eky’okutuulamu,\n" +
               "Mu mirembe n’emirembe\n" +
               "Era Lwazi lwaffe.')," +
               "(8,'Okukaaba Kwange Owulire…','O~kukaaba kwange owulire,\n" +
               "Jjangu, (O)muloko~zi;\n" +
               " O~mwoyo gwange gukwetaaga nnyo;\n" +
               "Jjangu, (O)muloko~zi.\n\nChorus:\n" +
               "Nakyama okuva mu kkubo lyo,\n" +
               "Mbulubutira mu ddungu;~ \n" +
               "Ntwa~la onzize mu kisibo kyo,\n" +
               "Jjangu (O)muloko~zi.\n\nSi~rina buddukiro bulala,\n" +
               "Jjangu, (O)muloko~zi;\n" +
               " A~maaso go ge gamp(a) obulamu,\n" +
               "Jjangu, (O)muloko~zi.\n\nE~kkubo limbuze, nkoye nnyo,\n" +
               "Jjangu (O)muloko~zi;\n" +
               "E~r(a) essuubi lyange lizirika,\n" +
               "Jjangu, (O)muloko-zi.\n\nTo~gobanga mmeme emenyese,\n" +
               "Jjangu, (O)muloko~zi;\n" +
               "O~nokiriz(a) okusaba kwange,\n" +
               "Jjangu (O)muloko~zi.')," +
               "(9,'Ggwe Eyanunula…','Ggwe eyanunula nebaz(a) ekisa kyo,\n" +
               "Mu Ggwe mwe mul(i) \n" +
               "ensibuko y’emikisa gyonna, \n" +
               "Mu Ggwe mwe mul(i ) \n" +
               "ensibuko y’emikisa gyo~nna,\n\nNze ndi kitonde kyo \n" +
               "Ggwe (o)bulamu bwange, \n" +
               "Katonda wange, nsanidde okukusuutanga,\n" +
               " Katonda wange, \n" +
               "nsanidde okukusuuta~nga.\n\nKale nakuwa ki anti byonna bibyo?\n" +
               "Mpayo omutima gwange, \n" +
               "sadaaka y’omwavu, \n" +
               "Mpayo omutima gwange, \n" +
               "sadaaka y’omwa~vu.\n\nNsaba ekisa kyo, kinjijuz(e) amaanyi,\n" +
               "Okwagala kwange kwonna \n" +
               "kubeerenga kukwo,\n" +
               "Okwagala kwange kwonna \n" +
               "kubeerenga ku~kwo.')," +
               "(10,'Jjangu Yesu Obe Mu Nze…','Jjangu Yesu obe mu nze, \n" +
               "Lungamy(a) omwoyo gwange,\n" +
               "Guyimbeng(a) ebiro byonna, Okukutendereza.\n\nNjigi~riza okusi~nza, \n" +
               "Ndage~ng(a) obulungi bwo,\n" +
               "Essuubi ly’amaka gaffe nga linjijuz(a) essanyu.\n\nNyimus(a) eddoboozi lyange, \n" +
               "Nga nsab(a) okuyamba kwo,\n" +
               "Olw’okwagala kw(o) okungi, Olintuusa mu ggulu.\nYesu~ (O)mununuzi wa~nge, \n" +
               "Ggwe (e)ya~mponya okufa,\n" +
               "N’oggyaw(o) ebyonono byange, Bwewawangul(a) okufa.\n\nYesu wang(e) okwagala kwo, Bulijjo kweyongere,\n" +
               "Olw’ekisa kyo ekingi, Kanywererenga ku ggwe.\nEra~ nnem(e) okukuva~ko, Mbeere~ mu kwagala kwo,\n" +
               "Twala obulamu bwange, \n" +
               "Butegeker(e) eggulu.\n')," +
               "(11,'Bonna Basuute Mukama…','Bonna basuute Mu~ka~ma,\n" +
               "Erinnya lya Yesu (e)ddungi:\n" +
               "Ye Kabaka w’eki~tii~bwa,\n" +
               "Erinnya lya Yesu (e)ddungi.\n\nChorus:" +
               "\n" +
               "Lyebazibwenga, lyebazibwenga,\n" +
               "Erinnya lya Yesu (e)ddungi;\n" +
               "Lyebazibwenga, lyebazibwenga,\n" +
               "Erinnya lya Yesu (e)ddungi.\n\nYesu (O)mununuzi~ ye~kka,\n" +
               "Erinnya lya Yesu (e)ddungi:\n" +
               "Ye lye ssanyu ly’omwo~noo~nyi\n" +
               "Erinnya lya Yesu (e)ddungi.\n\nYameny(a) amaanyi (a)g’e~ki~bi,\n" +
               "Erinnya lya Yesu (e)ddungi:\n" +
               " (O)musaayi gwe gutu~ku~za, \n" +
               "Erinnya lya Yesu (e)ddungi.')," +
               "(12,'Twebaza Ggwe Omuva Byonna…','Twebaza Ggw(e) omuva byonna,\n" +
               "Ensi zonna zikusuute, Ab’omugulu basuute, Kitaffe, (O)mwana\n" +
               "ne Mwoyo; A-mii-na.\n\n Mukama Katonda waffe \n Ggwe wekka watutonda ffe; \n" +
               "Ffe watutonda, ffe babo\n Ffe ndiga za kuttale lyo.\n\n" +
               "Tuyingire mu nzigyi zo, \n Tusemberere empya zo; \n Erinnya lyo lisinzibwe, \n Era tukuvunamire.'),"+
               "(13,'Yesu Wasuubiza Ffe Abantu Bo…','Yesu wasuubiza ffe abantu bo;\n" +
               "Bwe tubeer(a) awamu, oba kumpi nnyo;\n" +
               "Kigambo~ kakano tukikkiriza,\n" +
               "Beera naffe wano otusanyuse.\n\nChorus:\n" +
               "Yesu, jja~ngu muffe,\n" +
               "Nga tuli~ wano;\n" +
               "(O)mukisa~ gwo gu~be - -,\n" +
               "Mu kuku’ngana.\n\nBulijjo Mukama obadde naffe,\n" +
               "Yongera kubeera awamu wano;\n" +
               "Ggwe totu~vangako tukwetaaga nnyo,\n" +
               "Ayi Yesu jjangu, tukulabeko.\n\nYesu otuyambe  ffe nga tuyimba,\n" +
               "(E)nnyimba zaffe zonna zikusanyuse;\n" +
               "(E)ssubi lya~ffe mu ggwe lyeyongerenga,\n" +
               "Naffe tweyonger(e) okukufaanana.'),"+
               "(14,'Ka Ntambule Naawe Yesu…','Kantambule nawe~ Yesu\n" +
               "Nga Enoka bwe ya~kola;\n" +
               "Ggwe onkwate ku mu~kono, era oyo~gere nange.\n" +
               "Nebwemba siraba~ kkubo,\n" +
               "Yesu~ ka ntambule naawe.\n\nSiyinza kugenda~ nzekka\n" +
               "Kibuyaga mungi~ ddala;\n" +
               "Emitego gya Se~tani era n’ama~gye ge gonna;\n" +
               "Nsaba Ggwe obima~lewo,\n" +
               "Kale~ ka ntambule naawe.\n\nBwe mbeera awamu~ naawe,\n" +
               "Essanyu ly’ensi si~ kintu;\n" +
               "Ka ntambule n’obu~zira, nga nkutte e~bendera yo;\n" +
               "Olintuusa mu Sa~yuni,\n" +
               "Nga nta~mbula wamu naawe.'),"+
               "(15,'Yesu Alifuga Wonna Wonna…','Yesu ali~fuga~ wonna,\n" +
               "Wonn(a) omusana~ we gwaka:\n" +
               "Obwakabaka bwe~ bu~fuge,\n" +
               "(O)kutuusa e~nnaku~ zonna.\n\nAbantu b’e~nnimi~ zonna,\n" +
               "Batenderez(e) e~kisa kye;\n" +
               "Abaana banabuu~li~ranga,\n" +
               "Obulungi~ bw’eri~nnya lye.\n\nOmukisa~ gwe we~ guli\n" +
               "(A)basibe bafu~ne(e) eddembe;\n" +
               "Abakooye bana~wu~mmula, Abetaaga~ ne ba~kutta.\n\nBuli muntu~ yimi~rira,\n" +
               "Otende nnyo Ka~baka wo;\n" +
               "Bamalayika ka~ ba~yimbe,\n" +
               "Ensi edde~mu, “A~miina.”'),"+
               "(16,'Nkwetaaga Ayi Mukama…','Nkwetaaga Ayi Mukama,\n" +
               "Nz(e) omunafu, (o)mwonoonyi;\n" +
               "Onkwatenga ku mukono, \n" +
               "Ompenga ku maanyi go.\n\nChorus:\n" +
               "(O)lwa leero, buli (e)ssaawa,\n" +
               "Nkwetaaga ayi Mukama!\n" +
               "(O)lwa leero, buli (e)ssaawa,\n" +
               "Beera nange tondeka.\n\nNyambaza obuwombefu\n" +
               "Nze ajjudd(e) amalala;\n" +
               "Ntegeeza bwend(i) omunafu,\n" +
               "Nsembeza kumpi gy’oli.\n\nMu Ggwe mbeera n’emirembe\n" +
               "Bwembeera nzekka nnemwa:\n" +
               "Nkuma mu lugendo lwange,\n" +
               "Ggwe (e)ssuubi lyange lyokka.\n\nByonn(a) ebinanjijiranga,\n" +
               "Mu ssanyu ne mu nnaku;\n" +
               "Ku Ggwe kwe nanywereranga,\n" +
               "Ggwe kiwumulo kyange.'),"+
               "(17,'Si Nze, Naye Kristo…','Si nze, naye, Kristo alabikenga,\n" +
               "\n" +
               "Si nze, naye, Kristo awulirwe;\n" +
               "\n" +
               "Si nze, yekka, Agulumizibwenga,\n" +
               "\n" +
               "Si nze, Kristo, Afug(e) obulamu.\n\n\nSi nze, naye, Kristo abagumyenga,\n" +
               "\n" +
               "Yekka, asangule amaziga;\n" +
               "\n" +
               "Si nze, naye, Asitule (o)mugugu.\n" +
               "\n" +
               "Si nze, Kristo, Asirise (o)kutya.\n\n\nKristo yekka, So si (e)bigambo byange,\n" +
               "\n" +
               "Kristo yekka, So si amalala;\n" +
               "\n" +
               "Kristo yekka, Si eddoboozi lyange,\n" +
               "\n" +
               "Kristo yekka, Si kweyagala nze.\n\n\nSi nze, naye, Kristo agaba byonna,\n" +
               "\n" +
               "Si nze, Kristo, Ampa obulamu;\n" +
               "\n" +
               "Kristo yekka, Omwoyo n’omubiri,\n" +
               "\n" +
               "Kristo yekka, Obugagga bwange.'),"+
               "(18,'Omulokozi Omusumba Waffe…','(O)mulokozi ng’Omusu~mba~;\n" +
               "Beera naffe bulijo,\n" +
               "(O)tuliisize mu (e)ddundi~ro~, \n" +
               "Lye watukolera ffe; Omusumba omwagalwa,\n" +
               "Watugula ffe babo,\n" +
               "Omusumba omwagalwa,\n" +
               "Watugula ffe babo.\n\nAbaana bo otuya~mbe~,\n" +
               "Tulung’amye mu kkubo,\n" +
               "Ekisibo kyo tukuu~me, \n" +
               "Bwe tubula tunoonye; Omusumba omwagalwa,\n" +
               "Otuwulire mangu,\n" +
               "Omusumba omwagalwa,\n" +
               "Otuwulire mangu.\n\nAjja gy’oli, bwe waga~mba~ Tomugobera bweru,\n" +
               "Olw’ekisa kyo tuwo~nye~;\n" +
               "Otunaazeek(o) ebibi; Omusumba omwagalwa,\n" +
               "Tukyuse tudde gy’oli,\n" +
               "Omusumba omwagalwa,\n" +
               "Tukyuse tudde gy’oli.'),"+
               "(19,'Ku Musalaba Yanfirira…','Ku musalaba yanfirira,\n" +
               "Kwe yampera obulokozi,\n" +
               "Omusaayi gwe, gwe gunaaza,\n" +
               "Yebaziibwenga.\n\nChorus:\n" +
               "Nebaze Yesu,~~ \n" +
               "Yebazibwenga;~~\n" +
               "Ku musalaba yanfirira, \n" +
               "Yebazibwenga.\n\nNewuunya nnyo bwe yandokola,\n" +
               "Ye Mukama abeera mu nze;\n" +
               "N’ansembeza ku musalaba,\n" +
               "Yebaziibwenga.\n\nGgwe ow’amaanyi (o)lokola,\n" +
               "Nsanyuka olw’okuba mu Ggwe;\n" +
               "Era mu Ggwe mwe ndokokera,\n" +
               "Webazibwenga!\n\nGgwe ow’amaanyi (o)lokola,\n" +
               "Nsanyuka olw’okuba mu Ggwe;\n" +
               "Era mu Ggwe mwe ndokokera,\n" +
               "Webazibwenga!'),"+
               "(20,'Mukama Lwe Lwazi Lwaffe…','Mukama lwe lwazi lwaffe,\n" +
               "Eri oyo gyetweyuna;\n" +
               "Ye atuwonya mu kabi,\n" +
               "Ye kye kiddukiro kyaffe.\n\nChorus:\n" +
               "Ggwe Olwa~zi olw’amaanyi,\n" +
               "Obwekwe~ko bw’abanaku,\n" +
               "Omusaa~le w’abayise,\n" +
               "Ggwe (e)kiddukiro mu nnaku.\n\nYe atuwonya mu byonna\n" +
               "Eri oyo gye tweyuna\n" +
               "Tetutya ntiisa ya mubi\n" +
               "Ye kye kiddukiro kyaffe.\n\nEnnaku bwe zitujjira,\n" +
               "Eri oyo gyetweyuna;\n" +
               "Mwe muli eddembe lyaffe,\n" +
               "Ye kye kiddukiro kyaffe.\n\nGw(e) Olwazi lw’abantu bonna, \n" +
               "Eri Ggwe gyetuddukira,\n" +
               "Otuyambenga bulijjo,\n" +
               "Beera kiddukiro kyaffe.'),"+
               "(21,'Yesu Tuzze " +
               "Eri Ggwe…','Yesu tuzz(e) eri Ggwe, Tewali mulala,\n" +
               "Tweyuna Ggwe wekka, Nga tusaba.\n" +
               "Tuli mu nzikiza, Yesu nga toliiwo,\n" +
               "Tuwe ku ssanyu lyo, Ayi Yesu.\n\nChorus:" +
               "\n" +
               "Yesu tuzz(e) eri ggwe, Tukkirize,\n" +
               "Tewali mulala, Tuwulire.\n\nTuwony(e) abalabe, N’amalala g’ensi,\n" +
               "Tuwummule mu Ggwe, Otukuume.\n" +
               "Tutiisibwa mu nsi, Tuwe obuzira;\n" +
               "Twetaag(a) amaanyi go, Gawanguza.\n\nTuwe ku kisa kyo, Tufuule baana  bo,\n" +
               "Otuwony(e) ebibi, Beera naffe.\n" +
               "Otunyweze mu Gggwe, Tuwangule ensi,\n" +
               "Tukwat(e) omukono, Tube naawe.'),"+
               "(22,'Tompitako Omulokozi…','Tompitako (O)mulokozi, Nkwegayirira;\n" +
               "Nga oyita abalala,\n" +
               "Nange ompite.\n\nChorus:\n" +
               "Ayi Ye~su, Nsab(a) ompulire,\n" +
               "Nga  bwoyita abalala,\n" +
               "Nange ompite.\n\nKu ntebe yo ey’ekisa, \n" +
               "Mpebw(e) emirembe,\n" +
               "Nfukamidde wooli Yesu, \n" +
               "Nsab(a) onsonyiwe.\n\nNkwesiga Ggwe Yesu wekka,\n" +
               "Ndag(a)  amaaso go;\n" +
               "Ompony(e) endwadde z’omwoyo,\n" +
               "Yes(u) ondokole.\n\nGgwe nsulo y’essanyu lyaffe,\n" +
               "Osinga byonna,\n" +
               "Tewali mulala ku nsi,\n" +
               "Oba mu ggulu.'),"+
               "(23,'Yesu Gw’oli Ssanyu Lyaffe…','Yesu gw’oli ssanyu lyaffe,\n" +
               "Gw’oli~ mu~sa~na gw’a~bantu;\n" +
               "Twalek(a) eby’omunsi muno~,\n" +
               "Ne tusanyu~kira~ mu~Ggwe.\n\n(A)mazima  go tegakyuka,\n" +
               "Olo~ko~l(a) a~bakwe~siga;\n" +
               "Abakunoonya besiima,~\n" +
               "Abakula~ba ba~kku~ta.\n\nGwe (O)mugaati gw’obulamu,\n" +
               "Twetta~ni~r(a) o~kulii~sibwa;\n" +
               "Tunywa  mu Ggw(e) Ensul(o) ennamu,~\n" +
               "Otuwony(a) e~nnyonta~ya~ffe.\n\nWonna tukyukira gy’oli,\n" +
               "Gw’oli ki~wu~mmulo~kyaffe\n" +
               "Bw’otusiima tusanyuka,~\n" +
               "Bw’obeera na~ffe tu~la~ma.\n\nJjang(u) otubeesebeese ffe,\n" +
               "Tule~m(e) o~ku~bulu~buuta;\n" +
               "(E)kizikiza (e)ky’ensi goba,~\n" +
               "Otwakiz(e) o~musa~naso gwo.'),"+
               "(24,'Erinnya Lya " +
               "Yesu Ddungi…','Erinnya lya Yesu ddungi\n" +
               "Eri akkiriza!\n" +
               "   Lisangul(a) amaziga ge,\n" +
               "Limalamu (o)kutya.\n\nLitereza n’omwoyo gwe,\n" +
               "Linyig(a) ebiwundu;\n" +
               "Ye mmere y’omuyal(a) era,\n" +
               "Liwummuz(a) akooye.\n\nErinny(a) egganzi, lwe Lwazi,\n" +
               "Bwe bwekweko bwange,\n" +
               "Lye ggwanik(a) eritaggwamu,\n" +
               "(E)kisa  (e)kirokola.\n\nYesu Omusumba wange, \n" +
               "Ggwe Kabaka wange;\n" +
               "Ggwe bulamu bwange bwonna,\n" +
               "Kkiriz(a) ettendo lyo.\n\nNdi munafu mu mutima, \n" +
               "N’ebyo byendowooza;\n" +
               "Bwenkulaba Ggwe nga bw’oli,\n" +
               "Nkutendereza nnyo.'),"+
               "(25,'Atikkirwe Engule…','Atikkirw(e) engule,\n" +
               "Omwana gw’endiga;\n" +
               "     Muwulir(e) amatendo~ ge\n" +
               "Agatenkanika,\nFuba mwoyo gwange,\n" +
               "N’amaanyi gonna;\n" +
               "Oyatule Kabaka wo,\n" +
               "Eyakufiirira.\n\nAtikkirw(e) engule,\n" +
               "Eyakomererwa;\n" +
               "Enkovu z’emisumaa~li,\n" +
               "Zonna zirabika,\nTeri malayika Agumiikiriza,\n" +
               "Okulaba enkovu ze ,\n" +
               "Ez’emisumaali.\n\nAtikkirw(e) engule, \n" +
               "Kabak(a) ow’edembe!\n" +
               "Entalo zikome ku~nsi,\n" +
               "Tumutenereze.\nAlyoke afuge,\n" +
               "Emirembe gyonna\n" +
               "Ebimuli bitimbibwe ,\n" +
               "Mu nsi yaffe empya!\n\nAtikkirw(e) engule, \n" +
               "Emirembe gyonna;\n" +
               "Eyatonda obwengu~la \nOyo atalemwa, \n" +
               "Asinzibwe wonna,\n" +
               "Eyatufiirira;\n" +
               "Asinzibwe, asinzibwe, \n" +
               "Emirembe gyonna.'),"+
               "(26,'Katonda Tusiibule Nno…','Katonda~ Tu~siibule~ nno,\n" +
               "Kkiriz(a) e~tte~ndo lyaffe:\n" +
               "Sonyiwa ~bo~nna abeene~nya,\n" +
               "balyoke ~ba~lokoke\nTu~le~menga, Tu~le~menga,\n" +
               "O~ku~nyi~za (o)~mwoyo gwo.\n\nOtubee~re ~tuleme~nga\n" +
               "okwesa~nyu~sa fekka;\n" +
               "Tukuza~ e~ssanyu lya~ffe\nMu kuwu~mmu~la kwaffe.\n" +
               "Naa~w~e beera, naa~we beera\n" +
               "(E)ssa~nyu ~lingi ~gye tuli.\n\nAyi Kita~ffe~ obakuu~me\n" +
               "Abata~li~dda nate;\n" +
               "     (E)biro bya~bw(e) e~by’okusi~ga\nBireet(e) o~ku~kungula.\n" +
               "A~ba~lidda, a~ba~lidda,\n" +
               "ba~ko~le~nga~ n’amanyi.\n\nOmuki~sa ~gwa Kita~ffe,\n" +
               "N’ogw’Omwa~na ~we Yesu.\n" +
               "N’ogw’omwo~yo~ (o)mutuku~vu,\nGukke ku~myo~yo gyaffe;\n" +
               "Tu~be~nga wamu ~n’e~ssanyu,\n" +
               "N’e~mi~re~mbe,~ Amina.'),"+
               "(27,'Ayi Mukama Otuwulire…','Ayi Mukama Otuwuwulire\n" +
               "Nga tukyali wano tukwebaza;\n" +
               "Nga tukyali mu kusinza kuno,\n" +
               "Tulindiridde, otusiibule.\n\nTuwe emirembe nga tuddayo,\n" +
               "Tube mu ggwe okutuusa (e)kiro;\n" +
               "Tuwonye mu kukemebwa kwonna,\n" +
               "Nga bwe tukowoodde erinnya lyo.\n\nTuwe essanyu mu bulamu bwaffe,\n" +
               "Era (o)tuyambe mu nnaku zonna;\n" +
               "(E)misana n`ekiro tube babo\n" +
               "tuwummulire mu bukuumi bwo.'),"+
               "(28,'Twalanga Erinnya Lya Yesu…','Twalang(a) erinnya lya Yesu\n" +
               "gwe omwana (o)w’ennaku.\n" +
               "Lireet(a) essanyu n’eddembe,\n" +
               "Litwale buli gy’odda.\n\nChorus:\n" +
               "Nga ddungi, ddungi nnyo,\n" +
               "Ssuubi n’essanyu lyaffe;\n" +
               "Nga ddungi, ddungi nnyo,\n" +
               "Ssuubi n’essanyu lyaffe.\n\nTwalang(a) erinnnya lya Yesu\n" +
               "ng’engabo ekukuuma,\n" +
               "(E)bikemo bwe bikulumba\n" +
               "Kowoolang(a) erinnya lye.\n\nLya kitiibwa erinnya lye\n" +
               "nga lisanyusa mu mwoyo,\n" +
               "Ng(a) atukutte mu ngalo ze,\n" +
               "Ffe nga tumuyimbira.\n\nTusinz(a) erinnya lya Yesu\n" +
               "nga tuvunama w’ali;\n" +
               "Alitutikkir(a) engule,\n" +
               "(O)lugendo nga luwedde.'),"+
               "(29,'Ggwe Yesu Omulokozi…','Ggwe Yesu Omulo~kozi, Nkwagala,\n" +
               "Ebyonono bya~nge byonna mbikyaye.\n" +
               "Ggwe wekka omwa~galwa wange Yesu,~\n" +
               "Mukwano gwange~ Yesu, \n" +
               "nkwa~gala nnyo.\n\nKuba ggwe wasoo~ka, nange nkwagala.\n" +
               "Wangula n’omu~saayi gwo bwe wafa.\n" +
               "    Ku lw’engule (e)y`a~maggwa \n" +
               "ka~ nkwagale.~\n" +
               "Mukwano gwange~ Yesu nkwa~gala nnyo.\n\nMu ssanyu ne mu ~nnaku, nze nkwagala,\n" +
               "Nasuutanga er~innya lyo bulijjo.\n" +
               "(O)kufa nga kuse~mbede ndyo~gera nti:\n" +
               "Mukwano gwange ~Yesu\n" +
               "nkwa~gala nnyo.\n\nBwe ndiba nga ntu~se eyo mu ggulu,\n" +
               "Ndikusinza n’o~kwagala okungi.\n" +
               "N’okuyimba ndi~yimba n’e~ssanyu nti:\n" +
               "Mukwano gwange ~Yesu \n" +
               "nkwa~gala nnyo.'),"+
               "(30,'Yesu Ggwe Eyanjagala…','Yesu, Ggwe yanjagala\n" +
               "ka nzirukire gy’oli;\n" +
               "Amayengo g’ennaku nga\n" +
               "gankubira ddala\nNkweeka mu mikono gyo,\n" +
               "Abannumba bamaanyi,\n" +
               "Sirina magezi nze,\n" +
               "Kkiriz(a) omwoyo gwange.\n\nTewali kiddukiro\n" +
               "Wabula mu mwoyo gwo;\n" +
               "Tondekanga!\n" +
               "Ntetera Natera kugwa bugwi.\nEssanyu lyange lyonna\n" +
               "ndiggya mu kubeerwa kwo,\n" +
               "nsensez(e) omutwe gwange\n" +
               "Wansi w’emikono gyo.\n\nGgwe wekka gwe netaaga,\n" +
               "Tewali akwenkana;\n" +
               "Agudd(e) omuyimuse,\n" +
               "Vumula azirise.\nOmulwadd(e) omuwonye,\n" +
               "Zibul(a) eyazibiddwa,\n" +
               "Nze njijudde ekibi.\n" +
               "Gw’oli butuukirivu.\n\nYaza gyend(i)  ekisa kyo,\n" +
               "Sangul(a) ebibi byange\n" +
               "Nin(a) ennyont(a), ondeetere\n" +
               "(A)mazzi agampony(a) ennyo\nGwe nsulo y’obulamu.\n" +
               "Kansene omwo mwokka\n" +
               "(O)mwoyo gwange gujjule\n" +
               "(A)mazzi ag’obulamu.'),"+
               "(31,'Ka nnyimbe ku kwagala','Ka nnyimbe ku kwagala\n" +
               "    kwa Yesu (e)yanjagala\n" +
               "    Eyava mu ggulu lye,\n" +
               "    Okufa ku lwange.\n\nChorus:\n" +
               "Ka nnyimb(e) okwagala kwe,\n" +
               "Nnakute-nde~rezanga,\n" +
               "Eyatti-bwa ku lwange,\n" +
               "Nneebaza eki-sa kye.\n\nYesu ye yanjagala \n" +
               "   Nze nga si-namwagala;\n" +
               "  Nga sinna-mukowoola,\n" +
               "  Yeyasook(a) okunoonya.\n\nOkwaga-la kwo Yesu\n" +
               "  Tekute-gerekeka;\n" +
               "  Nz(e) atali-na kalungi\n" +
               "  Lwaki wanjagala?\n\nYesu ye-raga gyendi,\n" +
               "   Siyinza kumugaana\n" +
               "   Okwaga-la kwe gyendi\n" +
               "nange Kumpaliriza.'),"+
               "(32,'Nsanyukira Nnyo Okuyimba…','Nsanyuka~ nny(o) okuyimba\n" +
               "Eby’obulokozi;\n" +
               "    Ku Kabaka~ wa~nge Yesu\n" +
               "Eyanunula nze.\n\nChorus:\n" +
               "E~yanunula nze, E~yanunula nze,\n" +
               "Oyo lye  essanyu lyange;\n" +
               "Eyanunula nze.\n" +
               "Nsanyuka olw’erinnya lye.\n\nNnina Yesu ~a~mpa byonna,\n" +
               "Eyannunula nze;\n" +
               "Nsanyuk(a)~ o~ku~muweereza,\n" +
               "Eyannunula nze.\n\nYe Mujulirw(a) o~mwesigwa\n" +
               "Eyannunula nze;\n" +
               "Leero sikya~li~ko kye ntya\n" +
               "Yanunnula Oyo.\n\nAntegeke~dde~ amaka\n" +
               "Eyannunula nze;\n" +
               "Mwe nnabeera~nga~ bulijjo\n" +
               "Eyanunnula nze.'),"+
               "(33,'Onsembeze Ayi Mukama…','Onsembeze ayi Mukama,\n" +
               "Naye sirina kyonna kye nkuwa;\n" +
               "Onkumire mu mukono gyo\n" +
               "Akabi konna gye katatuuka\n" +
               "Akabi konna gye katatuuka\n\nOnsembeze ayi Mukama,\n" +
               "Naye sirina konna ke nkuwa;\n" +
               "Ndeese ebibi byange byonna,\n" +
               "gwe onongose n’omusaayi gwo;\n" +
               "Ggwe onongose n’omusayi gwo.\n\nOnsembeze mbe wuwo wekka,\n" +
               "Ebibi byange byonna mbiwaayo;\n" +
               "N’okwesiima kwonna (o)kwekibi,\n" +
               "Neetaga Yesu eyanfiirira;\n" +
               "Neetaga Yesu eyanfiirira.\n\nOnsembeze ddala gy’oli,\n" +
               "Ontuuse mu kitiibwa kyo kiri;\n" +
               "Eky’emirembe n’emirembe,\n" +
               "Mbeerenga wamu ne Yesu wange;\n" +
               "Mbeere wamu ne Yesu wange.'),"+
               "(34,'Ontegeeze ku bya Yesu.…','Ontegeeze ku bya Yesu \n" +
               "mbinywereze ku mwoyo;\n" +
               "Ebyo bisinga (o)bulungi\n" +
               "Byonna (e)by’omunsi muno;\nBamalayika baayimba\n" +
               "Yesu bwe yazaalibwa;\n" +
               "Katond(a) aweebwe (e)kitiibwa,\n" +
               "(E)mirembe gi~be mu nsi.\n\nChorus:\n" +
               "Ontegeeze ku bya Yesu,\n" +
               "mbinywereze ku mwoyo\n" +
               "Ebyo bising(a) obulungi\n" +
               "byonn(a) eby’omu nsi muno.\n\nBwe yabeera mu lukoola\n" +
               "Mu nnaku ezo zonna.\n" +
               "Bwe yakemebwa setaani,\n" +
               "Era  bwe yawangula.\nMbulir(a) eby’omulimu gwe,\n" +
               "N’eby’ennaku ze zonna;\n" +
               "Bwe yabonyabonyezebwa,\n" +
               "N’anyomebwa~ abantu~\n\nMbulir(a) eby’omusalaba,\n" +
               "bwe bamukomerera;\n" +
               "Ne bamuziika mu ntana,\n" +
               "N’azukira mu bafu.\nOkwagala kwe (o)kunene, \n" +
               "Tunakwenkanya naki?\n" +
               "    Kale ka nnebaze Yesu , \n" +
               "Mukama ya~nunula.~'),"+
               "(35,'Nsanyuka Okuyimba.…','Nsanyuka okuyimba nti,\n" +
               "“Yesu Yannunula (o)lw’okufa kwe.”\n" +
               "Mu kwagala kwe yannunula\n" +
               "Ndi wuwe (e)mirembe gyonna.\n\nChorus:\n" +
               "Yannunula,\n" +
               "Yannunul(a) olw’okufa kwe\n" +
               "Yannu~nula,\n" +
               "Ndibeera naye bulijjo.\n\nYannunula nsanyuka mu ye,\n" +
               "Essanyu lyange lingi nnyo,\n" +
               "Nga ndaba nti omusana gwe,\n" +
               "Gunabanga munda yange.\n\nBuli kaseera konna konna,\n" +
               "Ndowooza ku Mulokozi,\n" +
               "Era olw’essanyu n`ennyimba\n" +
               "Ku kwagala kwe okungi.\n\nLunaku lwe bwe lulituuka,\n" +
               "Ndiraba Kabaka wange,\n" +
               "Ankuuma mu lugendo lwange,\n" +
               "Ansanyus(a) omwoyo gwange.\n\nManyi ng’aterekedd(e) engule,\n" +
               "Mu nyumba y(e) ey’omu ggulu\n" +
               "Bw’alimala okunongosa\n" +
               "ndibeera naye bulijjo.'),"+
               "(37,'Kwagala  Kwo, ggwe.…','(O)kwagala kwo ggwe Mu~kama,\n" +
               "Kusing(a) esannyu lyo~nna:\n" +
               "Wekolere mu ff(e) e~weema\n" +
               "(O)tufukek(o) ekisa~ kyo.\nGgwe kwagal(a) okulo~ngofu,\n" +
               "Yesu Ggw(e) omusaasi~zi;\n" +
               "(O)bulokovu tubwe~taaga\n" +
               "Wony(a) obunafu bwa~ffe.\n\nTussize Mwoyo wo~leero,\n" +
               "mmalawo (e)mitawa~na.\n" +
               "Tuyambe fenna tu~beere\n" +
               "Abasikir(a) ebi~ngi.\nGwe Alufa ne O~mega!\n" +
               "Otuwony(e) okwonoo~na!  \n" +
               "Tunyweze mu kukki~riza,\n" +
               "Otutuuse mu dde~mbe.\n\nAyi Ggwe Ayinza~ Byonna,\n" +
               "Ekisa kyo kitu~we;\n" +
               "Jjangu Siir(o) obeere~ mu ffe\n" +
               "Era totuvaanga~ko\nTunayimbang(a) ette~ndo lyo\n" +
               "Tunakuweereza~nga,\n" +
               "Nga bwe bakola mu~ ggulu\n" +
               "Tunakusuutanga ggwe.\n\nTutonde fenna o~buggya\n" +
               "Nga tetuliiko bba~la;\n" +
               "Era (o)bulokozi ~bwonna\n" +
               "(O)kutuukirira kwo~nna.\nOkuyita  mu ki~tiibwa\n" +
               "Tweyongere mu maa~so\n" +
               "Okutuusa lwe tu~liba\n" +
               "N’engule mu maaso~ go.'),"+
               "(36,'Nalyoka Ne Nkusenga…','Nalyoka ne nkusenga gwe,\n" +
               "Omulokozi Katonda,\n" +
               "Kye nvudde nsanyuka nnyini.\n" +
               "Ne njatula bwe nsanyuse.\n\nChorus:\n" +
               "Nsanyuse, Nsanyuse; Yesu yannazak(o) ebibi.\n" +
               "Y(e) anjagaza by’ayagala;\n" +
               "Ansanyus(a) ennaku zona;\n" +
               "Nsanyuse, Nsanyuse,  Yesu yanazaak(o)ebibi.\n\nNamusenga n’atangoba;\n" +
               "Nze ndi wuwe, Naye wange;\n" +
               "Yampita ne nditegeera\n" +
               "(E)ddoboozi lye nga lya Yesu.\n\nEdda nasagasagana,\n" +
               "Kakano nteredde ku ye:\n" +
               "Sikyamusenguk(a); alina\n" +
               "Mukama y’alina byonna.\n\nNalayira nti ndi wuwe\n" +
               "Kankyogeranga bulijjo.\n" +
               "Era bw’olijja Mukama,\n" +
               "Ndisanyuk(a) okub(a) owuwo.'),"+
               "(38,'Ka Nnyimbe Ku Buyinza........','Ka nnyimbe ku buyinza bwo, Katonda\n" +
               "wa byonna; Ennyanja zakolembwa ggwe,\n" +
               "awamu n’ebbanga. Nebaza obuyinza\n" +
               "bwo obwas(a) omusana, ~ \n" +
               "Ggwe olagira omwezi, n’emunyenyye zonna.\n" +
               "\n" +
               "Nebaza obulungi bwo ggwe atuw(a)\n" +
               "emmere, essanyu n’ebintu byonna, era\n" +
               "birungi nnyo.\n" +
               "Emirimu gyo mikulu \n" +
               "mu bantu bo bonna\n" +
               "~Bwe ndowooza ensi eno,\n" +
               "Era n’eggulu lyo.\n" +
               "\n" +
               "Buli kintu kyonna ku nsi. Kirag(a)\n" +
               "amaanyi go; Ebbanga ne kibuyaga\n" +
               "ggwe obiragira. Obulungi buva gyoli,\n" +
               "byonna ggw(e) obikuuma era buli\n" +
               "kintu kyonna kiri mu maaso go.'),"+
               "(39,'Emikisa Gyo Mukama.…','Emikisa gyo Mukama,\n" +
               "mpulidde ogigaba;\n" +
               "Abalala bagifuna,\n" +
               "Nange ka ginjikeko.\n\nChorus:\n" +
               "\n" +
               "Ndi wano, ndi wano,\n" +
               "Nange ka ginjiikeko.\n\nYesu Mukama tonsubya,\n" +
               "Laba bwe ndi omubi,\n" +
               "Naye omponye mu byonna,\n" +
               "Ka mpeebwe ku kisa kyo.\n\nWewawo nkusobezza nnyo,\n" +
               "Era nkunakuwaza,\n" +
               "Nga ngoberera eby’ensi,\n" +
               "Naye nsab(a) onsonyiwe.\n\nTonvaako ayi Katonda,\n" +
               "Ggw(e) otuwa okumanya,\n" +
               "Ndag(a) ekisa kya Katonda,\n" +
               "Ompe emirembe gyo.'),"+
               "(40,'Jangu Ggwe Omwoyo.…','Jangu Ggw(e) Omwoyo wa Yesu,\n" +
               "Otuule mu nze leero.\n" +
               "Ontukuze nze omubi,\n" +
               "Jangu mu nz(e) olwa leero.\n\nChorus:\n" +
               "Beera mu nze leero,\n" +
               "Ofug(e) omwoyo gwange,\n" +
               "Onjijuze amaanyi go,\n" +
               "Jangu ayi Mukama.\n\nGgw(e) ojjuza omwoyo gwange,\n" +
               "siyinza kukyolesa,\n" +
               "Naye netaaga nnyo ojje,\n" +
               "Jangu mu nz(e) olwa leero.\n\nAyi Yesu ndi munafu,\n" +
               "Naye nvunnamye w’oli,\n" +
               "Tuma omwoyo wo ajje,\n" +
               "Anjijjuz(e) obulamu.\n\nOnnongoose, ondokole,\n" +
               "Onnaaze omutima, \n" +
               "   Ggwe aggyako bonn(a) ebibi\n" +
               "Jangu mu nz(e) olwa leero.'),"+
               "(41,'Omwoyo  Omutukuvu.…','Omwoyo Omutu~kuvu,\n" +
               "Omulungamya~ waffe,\n" +
               "Tukwate ku mu~kono\n" +
               "Fenna abata~mbuze,\nAbalina e~nnaku Tuwulize bulungi\n" +
               "Eddobooz(i) eddu~ngi nti:\n" +
               "“Mujje, nze naba~tuusa.”\n\nOmubeezi (o)mwe~sigwa,\n" +
               "Otuyambe buli~jjo,\n" +
               "Totuleka mu~ ntiisa\n" +
               "Ey’enzikiza~ y’ensi.\n(O)tusanyuse mu~ nnaku\n" +
               "Bwe tunawuliranga,\n" +
               "Eddobooz(i) eddu~ngi nti:\n" +
               "“Mujje, nze naba~tuusa.”\n\n(O)lugendo bwe lu~liggwa,\n" +
               "Nga tulindiri~ra Ggwe,\n" +
               "Eby’ensi bwe bi~riggwa\n" +
               "Ng’olin(a) amaanya ~gaffe,\n(O)tuyise mu ma~yengo.\n" +
               "(O)lw’omusayi gwa Yesu,\n" +
               "Eddobooz(i) eddungi nti:\n" +
               "“Mujje, nze nabatuusa.”'),"+
               "(42,'Omwoyo Owa Katonda.…','Omwoyo wa Katonda\n" +
               "wulir(a) abaana bo;\n" +
               "Ofuule emyoyo\n" +
               "gyaffe ekifo mw’obeera.\n\nBeera mu ffe maanyi mangi,\n" +
               "Tube bawanguzi;\n" +
               "Tukuz(a) emitima gyaffe nga\n" +
               "saddak(a) ennungi.\n\nTwakiz(e) omusana\n" +
               "tuwe amazima gonna;\n" +
               "Yoles(a) ekkubo efunda\n" +
               "lye tuba tukwata.\n\nTonyesa ku ff(e) omukisa\n" +
               "mu ssaw(a) entukuvu;\n" +
               "Buli omu anafuye\n" +
               "aweebwe amaanyi.\n\nJangu nga empewo leero,\n" +
               "Pentekote yaffe;\n" +
               "Jangu, obulokozi bwo\n" +
               "bubune ku ns(i) eno.'),"+
               "(43,'Nsanyukira obulamu .','Nsanyukira obulamu bwange,\n" +
               "Bwe mbeera awamu ne Yesu;\n" +
               "Omukisa gyendi nemirembe,\n" +
               "Bwe mbeera awamu ne Yesu;\n\nChorus:\n" +
               "Nywera, Nywera, \n" +
               "(nyweranga, nyweranga) x2\n" +
               "Owangule mu linnya lye;\n" +
               "Nywera, Nywera,\n" +
               "(nyweranga, nyweranga) x2\n" +
               "Ng’oli awamu ne Mukama\n\n(E)kkubo lye lireeta (e)sanyu lingi\n" +
               "Kubanga atukulembera.\n" +
               "Omusana gwe gwaka bulijjo,\n" +
               "Kubanga atukulembera.\n\nKintu ki ekiyinz(a) okuntisa,\n" +
               "Bwe mbeera awamu ne Yesu?\n" +
               "Mbeera n’eddembe lingi bulijjo,\n" +
               "Bwe mbeera awamu ne Yesu.'),"+
               "(44,'Tewali Mukwano.…','Tewali wa mukwano nga Yesu,\n" +
               "Tewali, tewali;\n" +
               "Atuwonya endwadde z’omwoyo,\n" +
               "Tewali, tewali.\n\nChorus:\n" +
               "\tYe amanyi (o)buzibu bwaffe,\n" +
               "Alitutuusa mu ddembe;\n" +
               "Tewali mukwano nga Mukama,\n" +
               "tewali, tewali;\n\nTewali mutukuvu nga Yesu,\n" +
               "Tewali mulala;\n" +
               "So tewali muwombefu nga ye,\n" +
               "Ye yekka, Mukama.\n\nBulijjo abeera kumpi naffe,\n" +
               "kumpi nnyo ,kumpi nnyo ;\n" +
               "Ne mu kizikiza atwakira,\n" +
               "Abeera kumpi nnyo.\n\nYesu ayinza okutuleka?\n" +
               "(O)mwesigwa, tayinza!\n" +
               "Agoba omubi ajja gy’ali?\n" +
               "(O)kugoba, tayinza!\n\nKirabo ki ekyenkana Yesu,\n" +
               "Tewali na kimu!\n" +
               "Alitutuusa gy’ali mu ggulu?\n" +
               "Agambye, wewaawo.'),"+
               "(45,'Enjuba Eyaka Ku Ntikko.…','(E)njuba eyaka ku ntikko,\n" +
               "Ku nsozi ne ku nnyanja;\n" +
               "Omusana gulengerwa \n" +
               "eli ku lubalama\nNaye omusana mungi,\n" +
               "Gwaka mu mwoyo gwange,\n" +
               "Kuba Yesu ali mu nze, \n" +
               "Aleeta enjuba ye.\n\nChorus:\n" +
               "\tGgwe omusana omulungi,\n" +
               "Ogwaka munda yange;\n" +
               "\tYesu Ggwe omusanyusa,\n" +
               "Ggwe enjuba yange nze.\n\nMu nfufu nze mwe ndireka,\n" +
               "Ennaku zange zonna,\n" +
               "Nga onyambazizz(a) esanyu,\n" +
               "N’ettendo lyo eringi.\nMu maka ag’ekitiibwa,\n" +
               "Gewanongoseza nze,\n" +
               "Ndigenda nga njijjudde nnyo,\n" +
               "Ekitiibwa kyo munda.\n\nMukama Ggwe eyantonda,\n" +
               "ndi wuwo okuv(a) edda;\n" +
               "Ettabaza yo gye wampa,\n" +
               "Eyakenga bulijjo;\nMu maka ag’ekitiibwa,\n" +
               "Ge wannongoseza nze,\n" +
               "Ndigenda nga njijjude,\n" +
               "nnyo Essanyu mu mutima.'),"+
               "(46,'Bwe Ntuula Awali Ebigere.…','Bwe ntuul(a) awal(i) ebigere\n" +
               "Bya Yesu, ansanyusa;\n" +
               "Njagala okuba naye,\n" +
               "mpulir( a)ebigambo bye.\nBwe mbeera awamu naye,\n" +
               "Ndowooz(a) ebikolwa bye\n" +
               "Okwagala kw(e) okunene,\n" +
               "Okwansembeza w’ali.\n\nAwali ebigere bye,\n" +
               "Kye kifo ky’omwonoonyi\n" +
               "We nsiza, ebibi byange,\n" +
               "Era we mpummulira.\nAwali ebigere bye\n" +
               "nfuk(a) okusaba kwange\n" +
               "Era olw’ekisa kye ye\n" +
               "n’ampa okuwumula.\n\nYesu ompe omukisa\n" +
               "Nga nkyali mu maaso go;\n" +
               "Ntunulira n’ekisa kyo,\n" +
               "Ondage amaaso go;\nOmpe omutima gwo Ggwe,\n" +
               "Mbe mutukuvu nga Ggwe;\n" +
               "Neerage nga ndi mwana wo,\n" +
               "Ggwe (a)mpa obutukuvu.'),"+
               "(47,'Balina Omukisa.…','Bali~na (o)~mu~kisa\n" +
               "aba~sibwa (a)~wamu\n" +
               "Okwe~gatta ~ne Mu~kama~\n" +
               "ly`essa~nyu ly’e~ggulu!\n\nMu maa~so g’e~ntebe\n" +
               "Tusa~bir(a) a~baffe:\n" +
               "(A)mazi~ga, n’o~kutya~kwaffe.~\n" +
               "Byonna~ tule~k(a) awo.\n\nBali~na (o)mu~kisa\n" +
               "Abo~(a)bakki~riza\n" +
               "Okusuubiza kwa Yesu,\n" +
               "Abo~(a)bamwe~siga.\n\nBwe twa~wuka~na ffe,\n" +
               "Tulu~mwa mu~ mwoyo;\n" +
               "Naye~tusu~bira~nate~\n" +
               "Oku~laba~gana.'),"+
               "(48,'Nkwagala Ggwe Ayi Yesu.…','Nkwagala Ggwe ayi Yesu \n" +
               "Okusinga byonna!\n" +
               "Kubanga wampa eddembe\n" +
               "Erising(a)ery`ensi.\n\nChorus:\n" +
               "\tNga tekutegerekeka, (kwagala)\n" +
               "(O)kwagala kw’olina;\n" +
               "Era nga tegutendeka, (musaayi)\n" +
               "(O)musaayi gwa Yesu! (musaa-yi gwo)\n\nManyi ng’oli kumpi nange\n" +
               "Okusinga ensi;\n" +
               "Ebigambo biwonya\n" +
               "Obulumi mu~nda.\n\nWateeka essanyu mu nze,\n" +
               "Ka nsanyukenga nnyo;\n" +
               "Singa tewa’ngumya (o)mwoyo,\n" +
               "Nandiraby(e) enna~ku.\n\nAyi Mulokozi wange,\n" +
               "Eyo ndibeera ntya?\n" +
               "Obanga essanyu lyompa,\n" +
               "Linsanyusa ku~nsi?'),"+
               "(49,'Nzudde Owo`mukwano','Nzuddeyo Ow`omukwano \n" +
               "Yasook(a) okunjagala .\n" +
               "N’ampalula mu~kisa kye,\n" +
               " Ekyakkirizisa nze.\nLeero ndi muddu we naye\n" +
               "Abaddu be ba ddembe;\n" +
               "Nze ndi wuwe, naye~wange,\n" +
               "(E)mirembe n’emirembe.\n\nNzuddeyo Ow`omukwano ,\n" +
               "Yaf(a) okundokola nze,\n" +
               "Kubanga obu~lamu bwe\n" +
               "Ye bwe yagabira nze;\nNze sirina kya bugagga.\n" +
               "Ebyange bibye byonna;\n" +
               "Newaayo mu mi~kono gye \n" +
               "Mukwano gwange ddala.\n\nNzudeyo Ow`omukwano ,\n" +
               "Yaweebwa (a)maanyi mangi\n" +
               "Ge galintusa~ ewuwe;\n" +
               "Sitya balabe bonna.\nEby’eggulu mbirengera\n" +
               "Bimyansa nnyo nga ffeza:\n" +
               "nze kankole, nfu~be, nwane!\n" +
               "Alidd(a) okumpummuza.\n\nNzuddeyo Ow`omukwano \n" +
               "mulungi ow’ekisa;\n" +
               "angabira ku maanyi ge \n" +
               "annu`gamy(a) er(a)andiisa\nEbiriwo n`ebirijja,\n" +
               "tebirinjawukanya\n" +
               "Emirembe egi~taggwawo\n" +
               "Yesu mukwano gwange.'),"+
               "(50,'Katonda Abeerenga Naawe.…','Katonda abeerenga nawe,\n" +
               "Akuwenga omukisa,\n" +
               "Akukuume mu kwagala,\n" +
               "Okutuusa Yesu lw’alijja.\n\nChorus:\n" +
               "Weraba,~~ weraba,~~\n" +
               "Otambule mi~re~mbe;\n" +
               "Weraba,~~ weraba,~~\n" +
               "Mulokozi abeere naawe.\n\nKatonda abeeerenga naawe,\n" +
               "Akukwate mu ngalo ze,\n" +
               "Akuw(e) emmere y’omwoyo,\n" +
               "Akukume mu kwagala kwe.\n\nKatonda abeeerenga naawe,\n" +
               "Entiisa bw’erikujjira,\n" +
               "Akwetoolooze ekisa,\n" +
               "Abeerenga nawe bulijjo.\n\nKatonda abeerenga naawe,\n" +
               "Era akuwe eddembe,\n" +
               "Akuyise mu mayengo,\n" +
               "Akutuse mu kisulo kyo.'),"+
               "(51,'Ggwe Yesu Oli Wange...','Ggwe Yesu oli wange ddala, \n Ggwe wekka gwe ekitiibwa kyange; \n " +
               "Ndi mukisa w’obulokozi, \n Nagulibwa na musaayi ggwo. \n\n Chorus: \n Nze nakuyimbiranga Yesu \n Nga nkutundereza bulijjo; \n" +
               "Nze nakuyimbiranga Yesu, \n Nga nkutendereza bulijo; \n\n Nze ndi wuwo era nsanyuka nga nnenger(a) essanyu lyo lyonna;" +
               "\n Bamalayika bo nga bajja, \n Nga bandaga okwagala kwo; \n\n Mu ggwe nnina ekiwummulo, \n Njijudd(e) essanyu lyo eringi;" +
               "\n Nyimusibwa mu mwoyo ggwange \n Ntadde essuubi lyonna mu ggwe.'),"+
               "(52,'Mpa Ekitabo Ekitukuvu…','Mpa ekitabo ekitukuv(u) ennyo,\n" +
               "kindag(a) ekkubo nze akooye nnyo;\n" +
               "Tewali kirobera kwaka kwakyo,\n" +
               "kirag(a)  Omulokozi nga bwali.\n\nChorus:\n" +
               "Mpa Ekitabo Ekitukuv(u) ennyo,\n" +
               "Ndyoke ndagirirwe ekkubo lyo.\n" +
               "Nnung`ame mu mateeka agalimu\n" +
               "(O)kutuusa ku lunaku lw’olidda\n\nBwe mba mu nnaku  ye ttabaza,\n" +
               "Ekibi bwe kindeter(a) okutya.\n" +
               "Mukama ondage Ekigambo kyo,\n" +
               "Olw’okwaka kwakyo nkulabenga.\n\nOmmulisizenga ekkubo lyange,\n" +
               "Ompe okudduka ensi eno.\n" +
               "Ngonjakiz(a) ettabaza y’omu ggulu\n" +
               "Endag(e) ekkubo ery`emirembe.\n\nOmp(e) ettabaza ey’Omulokozi,\n" +
               "Enteketeeke olw’okudda kwo.\n" +
               "Ndab(e) omusana \n" +
               "gwo ogw’omu ggulu,\n" +
               "Mu kittibwa kyo ekitaggwawo.'),"+
               "(53,'Nsanyuka Okwogera.…','Nsanyuka okwoge~ra \n" +
               "Ku by’eri mu ~ggulu,\n" +
               "Ku kitiibwa kya Yesu E~ra bw’atwa~gala;\n" +
               "Njagal(a) okubyogera Kuba mbikaka~sa,\n" +
               "Bimpumuza omwoyo Okusinga byonna.\n\nChorus:\n" +
               "Nsanyuka okubinyumya\n" +
               "Nnaabyogerang(o) ebyo.\n" +
               "Ebigamb(o) e~bikulu,\n" +
               "(e) by`ekisa kya Yesu.\n\nNsanyuk(a) okubinyumya, Bya kitalo ddala;\n" +
               "Bisinga byonna byonna bye~tulowoo~zako.\n" +
               "Nabinyumyanga ebyo Bikulu nnyo gye~ndi,\n" +
               "N’olw’ekyo nsanyuka nnyo, \n" +
               "(O)kubyogera wonna.\n\nBinsanyusa nnyo nnyi~ni, Okubyoge~rako,\n" +
               "Buli lwe mbyogerako Nze bimpomera nnyo.\n" +
               "Nsanyuk(a) okubinyumya Bangi tabamanyi\n" +
               "Bulokozi bwa Yesu Mu byawandikiibwa .\n\nNjagal(a) okubyoge~ra, Er(i) ababi~manyi,\n" +
               "Ababyetaaga ennyo O~kubiwu~lira.\n" +
               "Bwendituuka mu ggulu, Oluyimba lwa~nge\n" +
               "Biriba bigamb(o) ebyo, Bye njagala ennyo.'),"+
               "(54,'Ontegeeza Ebya Yesu.…','Ontegeeze ebya Yesu,\n" +
               "Ndaga okwagala kwe,\n" +
               "Ye Omulokozi wange,\n" +
               "Yayagala n’anfirira.\n\nChorus:\n" +
               "Yogera ku Yesu,\n" +
               "Yogera ku Yesu,\n" +
               "Yogera ku kwagala kwe,\n" +
               "Yes(u) Omulokozi wange\n\nOntegeeze ebya Yesu,\n" +
               "Ondage ye byayagala,\n" +
               "Era njigirizenga,\n" +
               "Okukola obulungi.\n\nOntegeeze ebya Yesu,\n" +
               "Era leka nze mpulire,\n" +
               "Okusuubiza kwe kwona,\n" +
               "Kw’alina mi kitabo kye.\n\nOntegeeze ebya Yesu,\n" +
               "Kaakano ali ludda wa?\n" +
               "Obwakabaka bwe bujje,\n" +
               "(O)mulangira w`emirembe'),"+
               "(55,'Kakano Tusiga.…','Kakano tusiga, ensigo za Yesu,\n" +
               "Twokebw(a) omusana, tuba mu mpewo;\n" +
               "Tulind(a) ekiseera ekya makungula\n" +
               "Tuliba n’essanyu, nga tukungula\n\nChorus:\n" +
               "Nga tuyingiza ,ebikungulwa ,\n" +
               "Tuliba n’essanyu nga tuyingiza;\n" +
               "Nga tuyingiza, ebikungulwa,\n" +
               "Tuliba n’essanyu nga tuyingiza.\n\nSiga mu musana,siga ne mu nkuba,\n" +
               "Awatali kutya nnaku na ntiisa;\n" +
               "Ekiseera kijja, mu makungula ge,\n" +
               "Tuliba n’essanyu, nga tukungula.\n\nMu kiseera kino, tukola na nnaku,\n" +
               "Emirundi mingi, tufiirwa bingi;\n" +
               "(E)nnaku bwe ziriggwa, alitusanyusa,\n" +
               "Tuliba n`essanyu, nga tukungula.'),"+
               "(56,'Wonya Bonna.…','Wonya bonna ab(o) abali mu kibi\n" +
               "Bakwakule okuva mu kufa;\n" +
               "Sasira abantu abalumw(a) ennyo.\n" +
               "Balag(e) obulokozi bwa Yesu.\n\nChorus:\n" +
               "Leeta abantu bonna,\n" +
               "abali mu kuffa\n" +
               "Bawone olw’ekisa kya Yesu.\n\nNewakubadde nga bo bamunyooma,\n" +
               "Ye yetaaga okubalokola.\n" +
               "Abayita bonna n’okwagala kwe,\n" +
               "Bwe bakiriza anaasonyiwa.\n\nAb(o) abayonoonebwa omulabe\n" +
               "Mukama ajja kubaza buggya.\n" +
               "Olw’okagala kwe, era n’ekisa\n" +
               "Anawonya buli (e)kyonoonese.\n\nFubanga ku lw’abo bonn(a) ababula\n" +
               "Mukama anakuwa amaanyi.\n" +
               "Bakomyewo (a)bangi \n" +
               "mu kkubo (e)ddungi;\n" +
               "Bategeez(e) eyafa ku lw’ababi.'),"+
               "(57,'Tewewolereza.…','Tewewolereza, (O)mulimu munene\n" +
               "Weewereyo ddala Yes(u) akukozese;\n" +
               "Ayita nekisa, Jjangu ompeereze,\n" +
               "Weewereyo ddala, Olisanyusibwa\n\nChorus:\n" +
               "Kkiriza, (leero) Tewewolereza;\n" +
               "Kkiriza, (leero) Weewereyo ddala\n" +
               "Bw’onewolereza,Onoddibwamu nti,\n" +
               "“Kale, tonjagala, Ogobeddwa wendi.”\n\nTewewolereza, Yesu akuyita,\n" +
               "Oludde ng’ogaana, Kakano kkiriza.\n" +
               "(E)nnimiro zengedde, (A)bakozi batono;\n" +
               "Kkiriza n’essanyu Okumuwereza.\n\nTewewolereza, Okulwa kya kabi,\n" +
               "Ng’otenguwa Yesu, Oy(o) eyakwagala;\n" +
               "Mu kiseera kino, ng(a) ekisa wekiri, \n" +
               "Ng’akuwolereza, Jjang(u) osonyibwe.'),"+
               "(58,'Nze Ndowooza Ku Nsi.…','Nze ndowooza ku nsi eyo ennungi ennyo\n" +
               "Yesu gy’alitutwala fenna,\n" +
               "Olw’ekisa kye Oyo eyatwagala\n" +
               "Ndiba n’emmunyenye mu ngule!\n\nChorus:\n" +
               "Mu ngule yange mulibaamu (e)mmunyenye\n" +
               "Obudde obwo bwe bulikya?\n" +
               "Nga ntuuse, mu bifo bir(i) eby`omu ggulu,\n" +
               "Ndiba n’emmunyenye mu ngule?\n\nMu maanyi ga Yesu\n" +
               "ka nkole, ka nsabe,\n" +
               "Ka nfube okubuuliranga;\n" +
               "Emmunyenye ezo ziriba nnyingi nnyo,\n" +
               "Mu ssanyu lir(i) eritakoma\n\nNdisanyuka nnyo bwe bwendiraba ku Yesu\n" +
               "Nga nyanjula bennabuulira;\n" +
               "Nasanyukanga mu maaso ge bwe ndiba\n" +
               "N’emmunyenye mu ngule yange.'),"+
               "(59,'Yesu Mukama " +
               "Wange.…','Yesu Mukama wange, Nesig(a) amaanyi go;\n" +
               "Sitya balabe bange, Ne bwe bannumba;\n" +
               "Onkuum(a) ennyo lwa ki~sa, \n" +
               "Siriko kye ntidde\n" +
               "Mu ngala za Kitange  Mwe mpummulira.\n\nSetaani bw’ab(a) annumba\n" +
               "N’ettima lye lingi;\n" +
               "Buli lw’ajj(a) okunnumba, Nziramu bwe nti,\n" +
               "“Vaawo genda~ Setaani, Yesu yakusinga;\n" +
               "Nali nkusenze edda, Ne nkusenguka.”\n\nOmulokozi Yesu, Tewali ayinza,\n" +
               "Okutusikula ffe Mu mikono gyo;\n" +
               "Alitulopa y(e) a~ni? Gwe watununula,\n" +
               "Wawangula Setani, Tetukyamutya.'),"+
               "(60,'“Mugende Mu nsi Zonna”…','“Mugende munsi zonna\n" +
               "Mubuulir(e) Enjiri”\n" +
               "Er(i) amawanga gonna\n" +
               "Agabeera mu nsi,\nBalyoke bategere\n" +
               "Yesu Gwe tu~sinza~\n" +
               "Bw’ali Katonda ddala,\n" +
               "Bw’alokola bonna.\n\nMukama waffe Yesu,\n" +
               "(O)tunyikize ffena,\n" +
               "Tukolerenga ddala\n" +
               "ebitusaanira;\nTweweyo gy’oli leero,\n" +
               "(E)mibiri n’e~myoyo,~\n" +
               "Tuleteng(a) ebirabo\n" +
               "N’essanyu lingi nnyo.\n\n“(O)kugaba kwa mukisa\n" +
               "(O)kusinga (o)kuweebwa”\n" +
               "Byonna byetuli nabyo\n" +
               "Biv(a) eri Katonda;\n(O)tukirizise ebyo,\n" +
               "Tukwegayi~ridde~\n" +
               "Tulem(e) okugamba nti\n" +
               "Bye byaffe ku bwaffe.\n\nAyi Katonda Kitaffe,\n" +
               "Oyimuse muffe\n" +
               "(A)bakunguzi abangi,\n" +
               "Balyoke bagende\nBanyikire nga wonna\n" +
               "(O)kubuny(a) enji~ri yo,~\n" +
               "Babulirenga bonna.\n" +
               "(A)bakulu n’abato.'),"+
               "(61,'Nina Mukwano Gwange.…','Nin(a) omukwano gwange, Omulungi ennyo,\n" +
               "Ye Yesu anjagal(a) ennyo, Era omwesigwa:\n" +
               "Njagala mbeerenga naye,\n" +
               "Ng(a) ali kumpi nange,\n" +
               "Mbeere wamu ne Yesu, Ng’ali mu nze.\n\nEra bwe mba nga nkoye, Kuba ye ammanyi,\n" +
               "Ampita okusembera, N’ampa amanyi ge;\n" +
               "Ye antwala mu kkubo lye, \n" +
               "(O)musana gwe gwaka,\n" +
               "Mbeera wamu ne Yesu, Ng’ali mu nze.\n\nMmulag(a) essanyu lyange, Awamu n’ennaku,\n" +
               "Mmulaga ne bye njagala, \n" +
               "N’ebinnyiiza byonna;\n" +
               "Andaga ebinsaanira, A’ngamba ngezeeko,\n" +
               "Nnyumya wamu ne Yesu, Ng’ali mu nze.\n\n\n" +
               "Amanyi nga njagala, (O)kubuulir(a) enjiri,\n" +
               "Andaga bwe mba njogera Ebyo ebiyamba;\n" +
               "Eby’ekisa kye ekingi (E)kyamuleet(a) okufa:\n" +
               "Tukola fembi Yesu, Ng’ali nange.'),"+
               "(62,'Nkwesiga Yesu" +
               "Mukama.…','Nkwesiga Yesu Mukama,\n" +
               "Nkwesiga wekka;\n" +
               "Lab(a) o~mpadd(e)\n" +
               "Obulo~kozi bwa buwa.\n\nNkwesig(a) ebibi ebingi,\n" +
               "Okunziyako;\n" +
               "Nkuvu~namidde \n" +
               "Mu~kama (O)muddu wo.\n\nNkwesig(a) okunnongosanga,\n" +
               "N’omusayi gwo;\n" +
               "Nakwe~sigang(a)\n" +
               "Emi~sana n’ekiro.\n\nNkwesiga okunn’ungamya\n" +
               "Gye ng’enda yonna;\n" +
               "Buli~jjo nnaawuli~ranga\n" +
               "Gwe wekka.'),"+
               "(63,'Bwendowooza Omusalaba.…','Bwe~ndowoo~z(a) o~musala~ba\n" +
               "Mu~kama~gwe ya~fiira~ko,\n" +
               "(O)bu~gagga~ bwo~nna obw’e~nsi~\n" +
               "Mbulaba nga te~bulii~mu.\n\nBwe~ndab(a) a~ma~zzi n’omu~saayi\n" +
               "E~byava~ mu mbi~riizi~ ze,\n" +
               "Ne~ ntegee~r(a) o~kusasi~ra~\n" +
               "N’okwagala kwe~ bwe ku~li.\n\nYe~su Mu~ka~ma onkuu~me,\n" +
               "Ne~m(e) okwe~nyumi~riza~nga,\n" +
               "Ki~no kyo~kka kinsanyu~se-\n" +
               "Wanjagala n’o~nfii~ri~ra.\n\nSi~nga mba~dde n’ensi zo~nna\n" +
               "Ne~ nziwaa~yo Ye~su gy’o~li;\n" +
               "Zo~nna te~za~ndisasu~dde~\n" +
               "(E)bbanja lyang(e) erye~nkan(a) a~wo.\n\nNa~ye ky’o~yagala lee~ro,\n" +
               "Era kye~ ndeese~ nz(e) e~ri Ggwe,\n" +
               "Kwe~kwaga~la kwange kwo~nna,\n" +
               "Nku~weereze, nku~sayu~se.'),"+
               "(64,'Laya Engoma Omukuumi.…','Lay(a) e’ngoma omukuumi,\n" +
               "Labula buli muntu;\n" +
               "Abawulira e’ngoma\n" +
               "Beneenye balokoke.\n\nChorus:\n" +
               "Lay(a) e’ngoma omukuumi,\n" +
               "Bunyisa mu nsi zonna;\n" +
               "(wulira)Yesu bwatyo bw’ayagala\n" +
               "Labul(a) abantu bonna.\n\nLaya ku buli kasozi\n" +
               "Na buli wantu wonna;\n" +
               "Obulokozi butuuke\n" +
               "Mu bizinga by’ennyanja.\n\nMu bibuga ne mu byalo\n" +
               "Ne  mu gabira gonna\n" +
               "Bakoleeze ettabaza\n" +
               "Mukama ajja mangu.\n\nAbasibibwa Setani\n" +
               "Banafuna eddembe;\n" +
               "Omulokoz(i) atuyita\n" +
               "N’okwagala nti “Mujje”.'),"+
               "(65,'Kale Ggye Lya Yesu.…','Kale (e)ggye lya Ye~su, Mugolokoke,\n" +
               "Mulabe Mukama  akulembedde;\n" +
               "Mu balabe ba~ngi Yesu mugabe;\n" +
               "Mukam(a) atuyi~ta; Tugende naye.\n\nChorus:\n" +
               "Kale ggye lya Ye~~su,~\n" +
               "Mugolokoke,\n" +
               "Mulabe Mukama Akulembedde.\n\nTugende mu maa~so, ng’abalwanyi be;\n" +
               "Tusinge Setani n’amagezi ge\n" +
               "Tukkirize Ye~su ye ngabo yaffe,\n" +
               "N’ekitala kya~ffe~kye Kigambo kye.\n\nErinnya lya Ye~su bwe liwulirwa,\n" +
               "(A)baddu ba Setani bakankana nnyo;\n" +
               "Mmwe mugum(e) emyo~yo,\n" +
               "Ab’oluganda,\n" +
               "Mu Mukama wa~ffe~ tuliwangula.\n\nMu bayite ba~ngi bagende naffe,\n" +
               "Balyoke babeere abasajja be;\n" +
               "Kal(e) ab’olu~ganda,\n" +
               "tugum(e) emyoyo,\n" +
               "Omugabe wa~ffe~ ye wa maanyi nnyo'),"+
               "(66,'Zukuka Gwe Mwoyo','Zukuka ggwe mwoyo gwange,\n" +
               "Leeta amaanyi go;~\n" +
               "Engule Yesu gy’atuwa\n" +
               "Yetaaga kwewaayo.\n\nDdoboozi lya mununuzi\n" +
               "Ng’ayita (a)baana be;~\n" +
               "Ye mugabi w’ebirabo\n" +
               "Eri ggwe ne bonna.\n\nAbajulirwa bangi nnyo\n" +
               "Balaba by’okola,~\n" +
               "Byonna eby’edda bireke\n" +
               "Ogende mu maaso.\n\nYesu Omwanjuzi waffe\n" +
               "Mu lugendo luno~\n" +
               "Tube mu Ggwe, tuwangule,\n" +
               "Tutuuke mu Ggulu.'),"+
               "(67,'Wekuume Bulijjo.…','We~kuume bulijjo,\n" +
               "Abalabe bangi,\n" +
               "E~ggye liku’ngana mbiro,\n" +
               "Okukulwanyisa.\n\nTunula osabe,\n" +
               "(O)lutalo lukyali,\n" +
               "Dda~mu amaanyi bulijjo,\n" +
               "Ng’osaba Katonda.\n\n“Ga~kyali mabaga,”\n" +
               "Toleka kulwana,\n" +
               "O~lutalo lwo lukome,\n" +
               "Ng’ofunye engule.'),"+
               "(68,'Nywereranga ku " +
               "Katonda.…','Nywereranga ku Katonda wonna,\n" +
               "Ne bwoba ng’oli mu kabi katya;\n" +
               "Oyo lwe Lwazi lwaff(e) olw’amaanyi,\n" +
               "Mu buli kabi ko~nna.\n\nChorus:\n" +
               "Leka tugumirenga  ku Lwazi lwa~ffe,\n" +
               "Yesu olwazi lwaffe;\n" +
               "Ffe bwe tuguma tuliyimirira,\n" +
               "Mu maaso ge mu kitiibwa.\n\nWonna nywereranga ku kitufu,\n" +
               "Ng’oli mugumu mu kukkiriza,\n" +
               "Oyo lwe Lwazi oluwanguza,\n" +
               "Eggye lyonn(a) ery’omu`bi.\n\nWonna nywereranga mu mazima,\n" +
               "Byonna byonna birituukirira,\n" +
               "Oyo lwe Lwazi omul(i) eddembe,\n" +
               "Nga tuwangudde e~nsi.'),"+
               "(69,'Essuubi Lyange Lizimbiddwa…','(E)ssubi lyange lizimbiddwa,\n" +
               "Ku Yesu n’omusaayi gwe;\n" +
               "Sirina kirala kyonna,\n" +
               "Neesigamye nze ku Yesu.\n\nChorus:\n" +
               "\n" +
               "Ka ‘ngumirenga ku Yesu\n" +
               "Byonn(a) eby’ensi butalimu;\n" +
               "Byonn(a) eby’ensi butalimu.\n\nByonn(a) eby’ensi ne bwe bijja,\n" +
               "Ka ndowooz(e) eby’omu ggulu;\n" +
               "Mu bulumi ne mu nnaku,\n" +
               "Tayinza kundeka nzekka.\n\nMazima ge ge ga’ngumya,\n" +
               "Ne byonna bye yasuubiza,\n" +
               "Ne bwenfirw(a) ebyange byonna,\n" +
               "Ka nneesigenga Ye yekka.\n\nEkiseera kiri kumpi,\n" +
               "Ka nneweeyo annongoose,\n" +
               "Annaze n’omusaayi gwe,\n" +
               "Ampe n’akabonero ke.\n\nEnkomerero ng’etuuse,\n" +
               "Ensange nga neetegese,\n" +
               "Nga nin(a) akabonero ke,\n" +
               "Aka Mwoyo Mutukuvu.'),"+
               "(70,'Ffe Abagaala Yesu.…','Ff(e) abagala~Yesu Ka tulage (e)~ssanyu!\n" +
               "Leka tuyimb(e) oluyimba,\n" +
               "Leka tuyimb(e) oluyimba;\n" +
               "Kuba tusanyuse, kuba tusanyuse.\n\nChorus:\n" +
               "Tugenda ku Sayuni,\n" +
               "(E)kibuga kirungi e-nnyo,\n" +
               "Tuluubirira Sayuni,~\n" +
               "Eki~buga kya Kato~nda.\n\nMusirike~ mwenna Abatatya ~Yesu;\n" +
               "Naye abaana ba Yesu,\n" +
               "Naye abanna ba Yesu,\n" +
               "Tuyimbe n’essanyu, Tuyimbe n’essanyu.\n\nMangu ajja kujja (O)kututwal(a) e~wuwe\n" +
               "Eyo y’eri ekifo kyo, Eyo y’eri akifo kyo;\n" +
               "Waggulu mu ggulu, Waggulu mu ggulu.\n\nTuyimbe n’e~ssanyu \n" +
               "Amaziga ga~ggwewo.\n" +
               "Kaakano tugenda eyo,\n" +
               "Kaakano tugenda eyo.\n" +
               "Eyo mu maka ge, Eyo mu maka ge.'),"+
               "(71,'Gwe Omukristaayo Tunula.…','Gwe Omukri~sta~yo Tunula kaaka~no,\n" +
               "Laba esi~ga~dde, Kaseera buseera.\n" +
               "Tunula, Yes(u) a~jja,~\n" +
               "(O)mubiri muna~fu,\n" +
               "(O)mulabe wa ~maa~nyi,\n" +
               "Tunula, saba~nga.\n\nChorus:\n" +
               "Omu~krista~yo tunula,\n" +
               "E~kiro n’emi~sana, Tunulanga,\n" +
               "Tu~nu~la, Saba.\n\nLeka kubo~ngoo~ta, So tobuusabuu~sa\n" +
               "Waliw(o) eki~ra~bo, Kye wasuubizibwa.\n" +
               "Kwe kuwummuli~ra~ Eyo Yesu gy’a~li,\n" +
               "Eyakufii~ri~ra~Tunula, saba~nga.\n\nBw’olumbwa o~mu~bi Yesu ye aku~wa,\n" +
               "Eby’okulwa~nyi~sa Gw’obanga wesiga.\n" +
               "Lindirira Ye~su~, Ye gwe musana ~gwo.\n" +
               "Kano ke ka~see~ra~ Tunula, saba~nga.'),"+
               "(72,'Tunaazimba Ku Lwazi Lwa Kristo...','Tunazimba ku lwazi Kristo,\n" +
               "Olwazi~ olwo (o)lulamu;\n" +
               "Okubwatuka n’omu~yaga,\n" +
               "Nga bizze tetulitya.\n\nChorus:\n" +
               "Ffe~ tu - - nazimba,\n" +
               "Ffe~ tu - - nazimba,\n" +
               "(Tunazimba ku Lwaz(i) olugumu, Tunazimba ku Lwaz(i) olugumu)\n" +
               "Ffe tunazimba ku Lwazi lwaffe,\n" +
               "Yesu Kristo yekka.\n\n(A)bamu bazimba ku mu~senyu,\n" +
               "Ku birooto by’obugagga;\n" +
               "Abalala bazimba~ (a)wabi,\n" +
               "Ku musingi gw’ekibi!\n\nWaliw(o) abazimba ku~ nnyombo,\n" +
               "Ku bitiibwa ku malala;\n" +
               "Naye ggwe nno zimba ku~ Lwazi,\n" +
               "Olugumu, ye Yesu.'),"+
               "(73,'Yesu Kino Kyenjagala.…','Yesu kino kye njagala,\n" +
               "Omwoyo ngo`gugwo,\n" +
               "(O)mugonv(u) er(a) omuwombefu,\n" +
               "Ogukukkiriza.\n\nEr(a) omwoy(o) oguwulira\n" +
               "(E)biragiro byonna;\n" +
               "Mukama mw’anotuulanga\n" +
               "Okugusanyusa.\n\nOmwoyo ogunazibwa\n" +
               "(O)musayi gwa Yesu,\n" +
               "Ogutabeeramu kibi,\n" +
               "Ogujjudd(e) ekisa.\n\n(O)mwoyo ogwenkanidd(e) awo, Ogumpe Katonda;\n" +
               "Otwal(e) omutima gwange, \n" +
               "Onfugire ddala.'),"+
               "(74,'Ggwe Omukuumi Mbuulira.…','Ggwe omukuumi mbuulira,\n" +
               "Obudde buli kumpi?\n" +
               "(O)bubonero bw’okujja kwe,\n" +
               "Bwo bwali bulabise?\nYesu alijja amangu?\n" +
               "Emmambya yiiy(o) esala~\n" +
               "Wesibe ebyambalo byo,\n" +
               "Golokoka bukedde.\n\nOmusana gweyongera,\n" +
               "Okwaka mu kkubo lyo?\n" +
               "(O)bubonero buli wantu,\n" +
               "Obulaga (o)kujja kwe.\nEkondere nga livuze\n" +
               "Banazukuka wonna;~\n" +
               "Ababe bonna abaafa,\n" +
               "Nga bambadd(e)ogutafa.\n\nOmusana gujja mangu,\n" +
               "Sabbiti ya Jubiri\n" +
               "Bonna boogera wamu nti\n" +
               "Obwakabaka bujje.\nWeewawo ow`oluganda,\n" +
               "Kanani yaffe ejja~\n" +
               "Ne Yerusalemi kijja\n" +
               "Nga kyakayakana nnyo.\n\nLab(a) ekibug(a) ekya zaabu,\n" +
               "Kabaka ku ntebe ye\n" +
               "Kabaka ow’ekitiibwa,\n" +
               "Afuga ensi zonna.\nKu nsozi ez’omusana,\n" +
               "Ogwak(a) obulung(i) ennyo;~\n" +
               "Ku migga egy’ekitiibwa\n" +
               "egibunye (e)bimuli.\n\nEnsi yaffe esembera,\n" +
               "Ey’emirembe (e)nnungi;\n" +
               "Eri kumpi nga nnugi nnyo!\n" +
               "Tunatuulanga omwo.\nWulira ennyimba (e)nnugi.\n" +
               "Ziwulirwa mu bbanga;~\n" +
               "Abantu bangi bayimba,\n" +
               "Tunatera (o)kutuuka.'),"+
               "(75,'Omusingi Gwaffe Munywevu.…','Omusingi gwaffe munywe~vu ddala~\n" +
               "Kye kigambo kya~Yes(u) ekitukuvu\n" +
               "Kituukirivu so tekya~bulako~\n" +
               "Fuul~anga Yesu ekiddu~kiro kyo,\n" +
               "Fuulanga Yesu ekiddukiro kyo.\n\nBw’onoyitanga mu nyanja~ totyanga~\n" +
               "Mu migg(a) egy’enna~ku tewekanganga;\n" +
               "Kubanga nabeeranga wa~mu naawe~\n" +
               "Nakuwonyanga mu nnaku zo zonna.\n" +
               "Naku~wonyanga mu nnaku zo zonna.\n\n“Mu bikemo ebiri mu~kkubo lyo~\n" +
               "Ekisa kyange~kinakuyambanga.”\n" +
               "Tebigenda kukukola~ko kabi~,\n" +
               "Naye olivaamu ng’olongosebbwa,\n" +
               "Naye olivaamu ng’olongo~sebbwa.\n\n“Omuntu bwe yenywereza~ ku Yesu~\n" +
               "Alimuwonya~(a)balabe be bonna,\n" +
               "Ne mu magye gonna ag’o~mulabe~,\n" +
               "Tagenda kumuleka n’akatono,\n" +
               "tagenda kumuleka n’akatono.”'),"+
               "(76,'Gwe Omwana Wa Yesu.…','Gwe (o)mwana wa Yesu, lwaki webaka?\n" +
               "Amaka gaffe gali kumpi nnyo!\n" +
               "Zukuka, wesib(e) eby’okulwanyisa,\n" +
               "Obudde bunater(a) okutuuka!\n\nAmawanga gonna gali mu ntalo,\n" +
               "Gonna gakankana olw’entiisa,\n" +
               "Wulira eddoboozi ly’amagaali,\n" +
               "Gwe omwana wa Yesu zukuka!\n\nTolwa, tolwa, ensi eno gidduke,\n" +
               "Laba (e)kitiibwa kyayo kiggwawo.\n" +
               "Meny(a) enjegere za Setani ezo,\n" +
               "Gwe (o)mwana wa \n" +
               "Yesu sanyuka nnyo!\n\nYimusa (a)maaso go eri eggulu,\n" +
               "Olabe Yesu Kabaka ajja,\n" +
               "Era laba emmambya ye esaze\n" +
               "Gwe (o)mwana wa Yesu sanyuka nnyo!'),"+
               "(77,'Mmwe Abakuumi Ba Sayuni.…','Mmw(e) abakumi ba Sayuni\n" +
               "Obudde buli butya?\n" +
               "Ali kumpi (O)mulokozi\n" +
               "Okukomawo ku nsi?\n" +
               "Emmunyenye ey’enkya mugirabye? \n" +
               "Emmunyenye ey’enkya tugirabye!\n\nObudde butangande nnyo\n" +
               "Tuyimbe olw’essanyu!\n" +
               "Emmambya yiiyo esaze \n" +
               "Nga emasamasa nnyo!\n" +
               "Tusanyuka Yesu Mukama ajja!\n" +
               "Tusanyuka Yesu Mukama ajja!\n\nMw(e) abakuumi mutegeeze\n" +
               "Obubonero bwaffe:\n" +
               "Tusemberedde omwalo, (O)lukalu lulengerwa?\n" +
               "Tulengera (a)maka ag’omu ggulu?\n" +
               "Tulengera (a)maka ag’omu ggulu?\n\n(O)bubonero tubulabye tunateer(a) okuutuka!\n" +
               "Tugende fenna mu maaso, twogerere waggulu\n" +
               "Kusembedde (o)kununulibwa kwaffe!\n" +
               "Kusembedde (o)kununulibwa kwaffe!'),"+
               "(78,'Olijja Ddi Mukama?.…','Olijja ddi Mukama (O)mulokozi waffe?\n" +
               "Fenna tukwetaga nnyo Olijja ddi Yesu?\n" +
               "Olunaku lwo lujje Olw’ekitalo ennyo;~\n" +
               "Ekitiibwa kyo kyonna Kikke ku baana bo.\n\nTukwetaaga ggwe Yesu Ojje mu bantu bo,\n" +
               "Tulowooza ng(a) oludde Abamu bakooye\n" +
               "Bakola eby’ekyejo N’abamu ku babo,\n" +
               "Betegese batono Okukwaniriza.\n\nMukama (o)tuzukuse Otukubirize\n" +
               "Tubuulire bonna nti “Yesu ajja mangu”\n" +
               "(E)ttabaza zaffe zake Twesib(e) amazima,~\n" +
               "Era tweteeketeeke Okukwaniriza.'),"+
               "(79,'Mpa Okukkiriza Okunene.…','Mp(a) okukkiriz(a) okunene,\n" +
               "Okutaddirira.\n" +
               "Nebwekugezebwa ennyo\n" +
               "Abalabe Neme kukanka~na,\n" +
               "Neme ~~ku~kankana.\n\nObwavu nga busembera,\n" +
               "Bwemba mbonabona\n" +
               "Ngumirenga byonna byonna, Njigiriza\n" +
               "Mbeere mu kkubo ~lyo,\n" +
               "Mbeere~mu ~kkubo lyo.\n\nOkukkiriza kwe nsaba\n" +
               "kwekweraga ennyo;\n" +
               "Ebikemo nga byetala Neme kutya\n" +
               "N’okubuusabuu~sa,\n" +
               "N’oku~~buu~~sabuusa.\n\nEnsi nga ekambuwadde,\n" +
               "Nze mbe nga sifaayo;\n" +
               "Obanga bansekerera, Kiremenga\n" +
               "Kunzigya ku Ye~su,\n" +
               "mbeere~~nga~ku Yesu.\n\nMukama mp(a) okukkiriza, Okutaddirira;\n" +
               "Byonna ebirimberako Bimpanguze\n" +
               "Ontuus(e) eyo gy’~oli,\n" +
               "Ontuu~~s(e) eyo gy’~oli.'),"+
               "(80,'Tuwe Omuliro Ogwo.…','Tuwe omuliro ogwo\n" +
               "Gwe wawa bajjajja baffe;\n" +
               "Ogwabawukanya mu nsi,\n" +
               "Ogwabawanga (o)buzira.\n\nFuka ku ffe Omwoyo wo\n" +
               "Gwe wawa bajjajja baffe;\n" +
               "Era gwe wawa Paulo,\n" +
               "N’abunyisa enjiri yo.\n\n(A)maanyi ge wawa Eriya,\n" +
               "Kakati tugetaaga nnyo\n" +
               "Musa yamasamasanga,\n" +
               "Yobu yagumikiriza.\n\nJjukira (e)biro eby’edda,\n" +
               "Ozz(e) obugya (o)mulimu gwo!\n" +
               "Tukuwadd(e) emyoyo gyaffe;\n" +
               "Fuka amaanyi go ku ffe.'),"+
               "(81,'Ennaku Endala Ziwedde.…','Ennak(u) endala ziwedde,\n" +
               "Sabbiti yaffe etuuse,\n" +
               "Ozze buggy(a) omwoyo gwange \n" +
               "Ku lunaku lwa Mukama.\n\nTusinze Yesu ow’ekisa,\n" +
               "Eyatuwa olunaku;\n" +
               "Kwe yateeka emikisa,\n" +
               "Egisinga obulungi.\n\nTwebaza Omununuzi,\n" +
               "N’eddoboozi ery’essanyu,\n" +
               "Atuwe okuwummula,\n" +
               "Kw’awummuza abantu be.\n\nLino ly’eddembe lya Yesu,\n" +
               "Lye tuweebwa ng’omusingo,\n" +
               "Ogw’ekiwummulo kiri,\n" +
               "Eky’essanyu ejjerere.'),"+
               "(82,'Olunaku Olw’essanyu.…','O~lunaku~ lw’e~ssanyu,\n" +
               "E~ra n’emi~re~mbe.\n" +
               "Lu~malawo~ e~nnaku,\n" +
               "O~lulungi~ e~nnyo.\nKu lwo abantu bonna,\n" +
               "Bakuvu~nnamire,\n" +
               "Bayimbe `mutukuvu`, katond(a)\n" +
               "a~ta~ggwaa~wo.\n\nLwe lunak(u) o~lu~londe,\n" +
               "Mu~ maaso ga~ Yesu;\n" +
               "Ng’e~nnimiro~e~nnungi;\n" +
               "O~muli a~ma~zzi.\nAgawonya ennyonta,\n" +
               "Mu nsi e~koyesa,\n" +
               "Ng(a) Abali ku Pisuga;\n" +
               "Tulaba~ Ka~na~ni.\n\n(E)kiwummulo kye kino,\n" +
               "Kwe~tusanyu~kira,\n" +
               "O~lw’okwaga~la~ Yesu,\n" +
               "Tu~lengera~ gy’a~li;\nTuweebwa emikisa,\n" +
               "Ku luna~ku luno\n" +
               "Lumu tuliwummula ,\n" +
               "Mu maka~ ge~ ga~li.'),"+
               "(83,'Tuba N’essanyu Mu Mwoyo.…','Tuba n’essanyu mu ~mwo~yo,\n" +
               "Erisinga lyo~nna,\n" +
               "Ku lunaku lwa Ssa~bbi~ti\n" +
               "Nga tusinza Yesu.\n\nChorus:\n" +
               "Ssabbiti ya Yesu.\n" +
               "Lunaku lwa ssanyu!\n" +
               "Ku lunaku lwa Ssa~bbi~ti\n" +
               "Tusinza Mukama.\n\nEndwadde z’omwoyo ~zo~nna.\n" +
               "Kwe ziwonyeze~bwa,\n" +
               "Omwo mwe nnonya e~ssanyu\n" +
               "N’eddembe ly’omwoyo.\n\nMbeera ne Mukama~wa~nge.\n" +
               "Ng’ampita n’eki~sa,\n" +
               "Ye n’ampa okumwa~ga~la.\n" +
               "N’omutima gwange.'),"+
               "(84,'Jjukira Olunaku.…','Jjukir(a) olunaku Yesu lwe yatuwa,\n" +
               "Olusinga ennak(u) endala obulungi.\n" +
               "Lulina o~kuwummula okw’omu~kisa,\n" +
               "Ogukka okuva mu ggulu eri~ Yesu\n\nChorus:\n" +
               "Twanirize, Twanirize\n" +
               "ekiwu~mmulo~,\n" +
               "Twanirize, Twanirize,\n" +
               "Sabbiti nuungi\n\nKu lunaku luno tusinza Mukama~,\n" +
               "Eyatugamba nti “Nze kkubo n’obulamu.”\n" +
               "Bwe tumugo~berera (O)mulokozi~ ku nsi,\n" +
               "Ddala alitunywesa (a)mazzi (a)g’obu~lamu.\n\nKu lunaku luno Tumutendereza~\n" +
               "Era tusuuta Yesu, mukwano gw’abaana.\n" +
               "Eri ab(o) a~bagudde, nga oli wa~kisa!\n" +
               "Ayi Mukama Yesu, tukwebaza ~leero.'),"+
               "(85,'Yesu Atutuusizza.…','Yesu atutusizza, ku Ssabbiti endala.\n" +
               "Tusabe emikisa, gye yawa (o)lunaku lwe;\n" +
               "Olusinga mu zonna, (e)kiwummulo kya Yesu,\n" +
               "Olusinga mu zonna, (e)kiwummulo~ kya Yesu.\n\nTusaba ekisa kyo, Kituke ku ffe leero.\n" +
               "Tulabe amaaso go, tugyek(o) ebibi byaffe.\n" +
               "Tuwummulire mu Ggwe, mu kutegana kwaffe,\n" +
               "Tuwummulire mu Ggwe, \n" +
               "mu kuteg~ana kwaffe.\n\nTuzze okukusinza, beeranga kumpi naffe.\n" +
               "Tulag(e) ekitiibwa kyo,\n" +
               "nga tuli mu nnyumba yo.\n" +
               "Otuwe okulega ku mbaga yaffe eri,\n" +
               "Otuwe okulega ku mbaga ya~ffe eri.\n\nEssanyu ly’enjiri yo, lituggyemu ebibi.\n" +
               "Tubaleng(a) ebibala tuwony(e) ennaku yonna \n" +
               "Buli ssabiti bwetyo,okutuusa l`wolidda\n" +
               "Buli ssabiti bwetyo,okutuusa l`wolidda'),"+
               "(86,'Twaniriza Sabbiti .…','Twaniriza Sabbiti,\n" +
               "Gye twaweebwa Mukama.\n" +
               "Twaniriza n’essanyu\n" +
               "Ekirab(o) ekikulu.\n\nEkiwummulo kyaffe,\n" +
               "Eky`eddembe ly`omwoyo\n" +
               "Kituwonya  ennaku,\n" +
               "Mu kutegana kwaffe\n\nLunaku lutukuvu,\n" +
               "Lwa katonda\n" +
               "Lutuwa amagezi,\n" +
               "N`emikisa  mingi nnyo.'),"+
               "(87,'Nga Kya Ssanyu Ku Sabbiti.…','Nga kya ssanyu ku Sa~bbiti,\n" +
               "(O)lunak(u) olulonde,\n" +
               "Eby’ensi okubizz(a)\n" +
               "eri Tulowooze Yesu.\n\nKya ssany(u) okusaba~leero,\n" +
               "(E)bibi byaffe byonna\n" +
               "Yesu abitusonyiwe\n" +
               "Olw’omusayi gwe.\n\nAyoger(a) eby’emi~rembe,\n" +
               "Ye Mukama mwene;\n" +
               "Munakuwalir(e) ebibi,\n" +
               "Mbatwale mu Ggulu\n\nOkuggibwaki e~bibi, \n" +
               "Twetaaga maanyi go,\n" +
               "Ggwe omanyi eby`omunda,\n" +
               "(E)kisa kyo kimala'),"+
               "(88,'Webale Okutukuuma.…','Webale okutukuuma\n" +
               "(O)kutuyisa mu nzikiza;\n" +
               "Kaakati nno nga bukedde\n" +
               "Fuka ku ffe~ ekisa kyo.\n\nKu lunaku luno (o)luggya\n" +
               "Oziyize obucwano;\n" +
               "Ku baana abato nga ffe\n" +
               "(E)bikemo tu~biwangule.\n\nNga tukola emirimu\n" +
               "Eminene n’e\tmitono,\n" +
               " tuleme kwerowoozako\n" +
               "Okusinga ~ku bannaffe.\n\nKa tufaanane nga Yesu\n" +
               "Eyasook(a) okutwagala;\n" +
               "Ow’ekitiibwa n’ettendo\n" +
               "Eyegyako~ekitiibwa.\n\nFfe bwe tuti bwe tusaba\n" +
               " Yesu otuyambe twetikke\n" +
               "(O)musalaba gwaffe leero,\n" +
               "Era tuku~goberere.'),"+
               "(89,'Yesu Mukama Wulira.…','Yesu buli nkya wulira, \n" +
               "Okusaba kwange\n" +
               "Nze kwe nsaba mu linnya lyo,\n" +
               "Nga nkowoola gy’oli.\n\nKatond(a) oli mutukuvu,\n" +
               "Okyawa obubi!\n" +
               "Nze nsembera mu maaso go\n" +
               "Lwa kusasira kwo.\n\nKatond(a) oli mutukuvu,\n" +
               "Okyawa obubi!\n" +
               "Nze nsembera mu maaso go\n" +
               "Lwa kusasira kwo.\n\nBonn(a) abatya erinnya lyo,\n" +
               "Olibawanguza,\n" +
               "Mukama Ggwe ngabo yaffe,\n" +
               "Ggwe bwesige bwaffe.'),"+
               "(90,'Omukemi Ya’ngamba.…','Omukemi ya~’ngamba ~nti\n" +
               "“Ggwe tolina omubeezi!”\n" +
               "Mukama Ggwe,~ Nga~bo~ ya~nge,\n" +
               "Gwe onkume, onyimuse!\n\n(O)bulokozi bu~va gy’o~li,\n" +
               "Mu kifo ky(o) ekitukuvu.\n" +
               "Nkukowoola~ n’e~ddo~boo~zi, Bw’oyogera nnaalokoka.\n\nGolokoka o~ndoko~le!\n" +
               "Kubanga Gwe wawangula\n" +
               "Abalabe ba~nge~ bo~nna\n" +
               "N’omenya amaanyi gaabwe.\n\nNagalamir(a) o~kweba~ka\n" +
               "Nenzukuka,\n" +
               "Ggwe ng(a) onkuuma\n" +
               "Sitya bula~be~ bwa~ ba~ntu\n" +
               "Abetoolol(a) okunnumba'),"+
               "(91,'Beera nange.…','Beera nange obudde buzibye:\n" +
               "Enzikiz(a) ekwata: beera nange:\n" +
               "Sirina nze mubeezi mulala,\n" +
               "Gw’abeer(a) abanaku,\n" +
               "nange, mbeera!\n\nObudde bw’obulamu buziba:\n" +
               "Bwaaka katono ne buwungeera:\n" +
               "Byonna(a) eby’ensi\n" +
               "bikyuka, bidiba:\n" +
               "Ggw(e) atadib(a) atufuka, tondeka!\n\nObudde bw’obulamu buziba:\n" +
               "Bwaaka katono ne buwungeera:\n" +
               "Byonna(a) eby’ensi\n" +
               "bikyuka, bidiba:\n" +
               "Ggw(e) atadib(a) atufuka, tondeka!\n\nSiriko kye ntya, Yesu nga wooli\n" +
               "Beera nange  ompanguz(e)\n" +
               "owomes(e) amaziga ne nnaku, \n" +
               "Entaana n`okufa tebintiise.'),"+
               "(92,'Nga Ffe Tutunuulira.…','Nga ffe tutunulira,\n" +
               "Eggulu litegeeza,\n" +
               "Ekitiibwa kyo,~ Yesu,\n" +
               "Ng’okolez(a) etta~baza ez’ekiro.\n\nChorus:\n" +
               "Oli Mutukuvu, Ayi Mukama!\n" +
               "Ojjudd(e) eggulu n’ensi,\n" +
               "Bonna batendereza, Ayi Yesu!\n\nKiseera ky’enzikiza,\n" +
               "Kitwetoolodde, Yesu;\n" +
               "Emmunyeenye zi~bikka\n" +
               "Amaaso go Ka~tonda, Tuyimuse.\n\nMukama w’obulamu,\n" +
               "Waggulu w(e) emmunyeenye,\n" +
               "Tuwambatire~ ffenna, \n" +
               "N’emikono gyo,~ Yesu, Tukwagala.\n\n(E)Mmunyeenye bwe zigenda,\n" +
               "Er(a) enjuba n’omwezi,\n" +
               "(E)Mmambya esale~ ku nsi,\n" +
               "Abantu tuzuu~kuke, Tukulabe.\n'),"+
               "(93,'Enjuba Y’Omwoyo Gwange .…','Enjuba y’o~mwoyo gwange,\n" +
               "(O)mulokozi~ gwe nja~gala,\n" +
               "Bw’abang(a) anjakir(a) obudde\n" +
               "Tebuja kunzibi~rira.\n\nEmitawa~na e~gy’ensi\n" +
               "Girem(e) oku~siki~riza\n" +
               "(O)musana ogw’amaaso go\n" +
               "Okunziyiz(a) oku~laba.\n\nNgend(a) okwe~bak(a) e~kiro,\n" +
               "Onkume mu~ kabi~ konna,\n" +
               "(O)mpaniriz(e) emikono gyo\n" +
               "Oneebase mu mi~rembe.\n" +
               " \nNgend(a) okwe~bak(a) e~kiro,\n" +
               "Onkume mu~ kabi~ konna,\n" +
               "(O)mpaniriz(e) emikono gyo\n" +
               "Oneebase mu mi~rembe.\n" +
               " \nJjanjaba a~balumwa (e)nnyo,\n" +
               "N’abatayinza kwebaka,\n" +
               "Wonya endwadde zaabwe bo,\n" +
               "Obaggyek(o) obubi~ bwonna.'),"+
               "(94,'Ennimiro Zo Zengedde .…','Ennimi~ro zo zenge~dde, Ebikungulwa~ bingi.\n" +
               "Biri bu~li wantu wo~nna,\n" +
               "Mu biwo~nvu mu nsenyi.\n\nChorus:\n" +
               "Omukunguzi omuku~lu, \nGwe Mu~kama wa~ byonna,\n" +
               "Tum(a) aba~ddu mu nnimi~ro, Ekisee~ra kituuse.\n\nTuma ku~ nkya nga bwak~akya, \n" +
               "Ne mu ttuntu to~leka.\n" +
               "Era n’e~njuba ng’egu~dde, Banoge~ buli wantu.\n\nNawe Mu~kama gw’atu~ma, Ku’nganya ebi~bala.\n" +
               "(O)kutuusa~ enkomere~ro, Olisa~nyuka mu ye.'),"+
               "(95,'Bye Tukuwa Biva Gy’oli.…','Byetukuwa biva gy’oli,\n" +
               "Kabibe nga byenkana wa!\n" +
               "Byetulina byonna bibyo,\n" +
               "Birabo by’o~tuteresa\n\n(O)tuwe (e)kisa tubereng(a)\n" +
               "Abawanika b(o) abesigwa,\n" +
               "Nga twesoloza n’omwoyo\n" +
               "Ku bintu bye~ tuli nabyo.\n\n(A)mawanga gonn(a) ag’omu nsi\n" +
               "Getaaga nny(o) Omulokozi;\n" +
               "Abantu be wafirira,\n" +
               "Bawab(a) era~ basasana.\n\nGwe mulimu gwaffe fenna,\n" +
               "(O)kukomyawo abakyama;\n" +
               "(O)kunoony(a) ababula, era\n" +
               "(O)kujjanjab(a) a~bafiiriddwa.\n\nBwatyo Yesu bwe yakola,\n" +
               "Ne yewaay(o) okutuwonya;\n" +
               "Naffe tumugoberere,\n" +
               "Abonoonyi~ balokoke.\n\nBwatyo Yesu bwe yakola,\n" +
               "Ne yewaay(o) okutuwonya;\n" +
               "Naffe tumugoberere,\n" +
               "Abonoonyi~ balokoke.'),"+
               "(96,'Kiki Ekintukuza?...','Kiki ekintukuza?\n" +
               "Musayi gwa Yesu gwokka.\n" +
               "Kiki ekinnongosa?\n" +
               "Musayi gwa Yesu gwokka.\n\nChorus:\n" +
               "Musayi gwe gwokka\n" +
               "Gwe guntuza nze,~\n" +
               "Tewali kirala\n" +
               "Musayi gwa Yesu gwokka.\n\nMmanyi ekintukuza,\n" +
               "Musayi gwa Yesu gwokka.\n" +
               "Kye mpoza kiri kimu\n" +
               "Musayi gwa Yesu gwokka.\n\nTewali kintu kyonna,\n" +
               "Musayi gwa Yesu gwokka.\n" +
               "Tewali kye nkola nze,\n" +
               "Musayi gwa Yesu gwokka.\n\nEssuubi lyange lyonna,\n" +
               "Musayi gwa Yesu gwokka.\n" +
               "(O)butukuvu bwange,\n" +
               "Musayi gwa Yesu gwokka.\n\nEra mutendereza,\n" +
               "Olw’omusayi gwe Yesu,\n" +
               "Aweebwe ekitiibwa,\n" +
               "Olw’omusayi gwe Yesu.'),"+
               "(97,'Nawaayo Obulamu.…','Nawaay(o) obu~lamu \n" +
               "okukulo~kola\n" +
               "Omusayi~ gwange~ \n" +
               "gwayika ku lulwo.\n(O)kukunula mu kufa,\n" +
               "Kiki kyompadde nze?\n" +
               "(O)kukunu~la mu kufa,\n" +
               "Kiki kyompa~dde nze?\n\nNaleka e~ntebe \n" +
               "ey’obwaka~baka,\n" +
               "Ewaffe mu~ ggulu~\n" +
               "mu kwakayakana,\nNe nzijja mu nnaku (e)nnyingi \n" +
               "n’okubonabona,\n" +
               "Ne nzijja mu~ nnaku (e)nnyingi\n" +
               "n’okubonabona.\n\nNalumwa bi~ngi nnyo,\n" +
               "siyinza ku~tenda\n" +
               "Nze nagumiki~riza~\n" +
               "nkuwonye okufa.\nNanywera era naguma,\n" +
               "ggwe ogumidde ki?\n" +
               "Nanywera e~ra naguma,\n" +
               "ggwe ogumi~dde ki?'),"+
               "(98,'Mujje Eri Yesu Temulwawo.…','Mujj(e) eri Yesu temulwawo,\n" +
               "Atudde muffe wano leero,\n" +
               "Fenn(a) atuyita (o)kusembera,\n" +
               "Agamba nti “Mujje!”\n\nChorus:\n" +
               "Ye atwagala, atwagala\n" +
               "Ye atwagala abonoonyi;\n" +
               "Era yajj(a) okutufiirira\n" +
               "Ffe tutuuke gy’ali.\n\nMujje abazitowereddwa,\n" +
               "Mwenna abakooye n’ebibi,\n" +
               "Mujje mwenna nabawummuza,\n" +
               "Mujje mwenna gyendi.\n\n\n" +
               "Abantu bonna kiyinzika\n" +
               "Leero (o)kusonyiyirwa ddala!\n" +
               "Kub(a) ebibi by’abakkiriza\n" +
               "Byatwalibwa Yesu.'),"+
               "(99,'Mujje Mwenna Abakooye.…','Mujje mwe~nna~ abakoo~ye,\n" +
               "N’okutega~na kw’ensi,\n" +
               "Yesu y(e) a~na~baaniri~za,\n" +
               "Yesu y(e) a~na~baaniri~za,\nN’okusaas~ir(a) okungi;\n" +
               "Mu~jje~ mwenna,\n" +
               "Mu~jje~ mwenna,\n" +
               "A~ba~yi~ta~ temutya.\n\nNg’ebibi~ bya~mmwe bingi;\n" +
               "Kyaba~kuu~tira kye~ kino;\n" +
               "Mweneny(e) a~ba~sonyiwe;\n" +
               "O~mwo~yo gwe, \n" +
               "O~mwo~yo gwe,\n" +
               "Ye~ ana~ba~tukuza.\n\nLab(a) Omwa~na~ wa Kato~nda,\n" +
               "Leer(o) abawo~lereza!\n" +
               "Munaawo~na lwa musaa~yi,\n" +
               "Bwe mwesigi~ra ddala;\n" +
               "E~ki~sa kye, E~ki~sa kye,\n" +
               "E~ki~ro~ko~la bonna.\n\nAbatu~ku~vu be bo~nna,\n" +
               "Bamusinza~ n’essanyu,\n" +
               "Ab’omu~nsi~ ne mu ggu~lu,\n" +
               "Bayimb(a) ama~tendo ge;\n" +
               "A~le~ruya! A~le~ruya!\n" +
               "Ye~su~ O~mu~lokozi.')";

               String secondBanch = "INSERT INTO ennyimba VALUES (100,'Yimirira ne Yesu.…','Yimirira ne Yesu, Ggwe omulwanyi we\n" +
               "Yimusa (e)bendera ye, So togissa wansi!\n" +
               "Mu ntalo zaffe zonna, Atukulembere,~\n" +
               "Awangul(e) omulabe, Ye abe Kabaka.\n\nYimirira ne Yesu, (E)ng’oma erawa;\n" +
               "Olutalo lunene, Golokoka mangu!\n" +
               "Abantu be mulwane  (A)balabe bangi nnyo,~\n" +
               "Kale muddem(u) amanyi, Tujja kuwangula\n\nYimirira ne Yesu, Weesig(e) amaanyi ge,\n" +
               "Ggwe oli munaffu nnyo, Wesige Ye yekka!\n" +
               "Mu maanyi g’Enjiri ye, \n" +
               "Wamu n’okusaba,~\n" +
               "Mu buli kabi konna, Lwaniranga mu ye.\n\nYimirira ne Yesu, (O)lutalo terulwe,\n" +
               "Olwa leero kulwana, Enkya buwanguzi!\n" +
               "Awangul(a) aliweebwa, \n" +
               "(E)ngule (e)y’obulamu,~\n" +
               "Alifuga ne Yesu, Emirembe gyonna.'),"+
               "(101,'Yesu Akuyita Okugenda Gyali.…','Yes(u) akuyita (o)kugenda \n" +
               "gyali Akuyita, ojje leero!\n" +
               "Lwaki ova ku oy(o) akwagala,\n" +
               "N’owa’nganguka bw’otyo?\n\nCHORUS:\n" +
               "A - - kuyita - -,\n" +
               "Akuyita ojje leero, Akuyita ojje leero\n" +
               " O - - jje leero!\n" +
               "Ye - - s(u) akuyita \n" +
               "n’okwagala kwe okungi.\n" +
               "Yesu akuyita n’ekis(a) ekingi, n’okwagala kwe okungi\n\nJjangu gyali anakuwummuza.\n" +
               "Akuyita ojje leero!\n" +
               "Mutwalire omugugu gwonna\n" +
               "Takugobe nakamu.\n\nJjangu, Yesu akulindiridde,\n" +
               "Genda gy`ali mangu tolwa!\n" +
               "Twala ebibi byo byonna gy`ali,\n" +
               "Genda mangu tolwawo.\n\nAkuyita n`okwagal(a) okungi,\n" +
               "Owulire eddobozi!\n" +
               "Amukkiriza alisanyuka,\n"+
               "Dduka ogende gy`ali.'),"+
               "(102,'Yesu Ali Ku Luggi.…','Yesu ali ku luggi, Ggulawo; (Ayimiridde x2)\n" +
               "Akulindiridde nnyo, \n" +
               "Ggula~wo, (Ayimiridde x2)\n" +
               "Muyingize tagenda, Ye omutukuvu Yesu,\n" +
               "Omwana wa Katonda, \n" +
               "Ggula~wo. (Ayimiridde x2)\n\nWulira akuyita, Wulira; (Eddoboozi lye x2)\n" +
               "Londa ye Vva ku by`ensi,\n" +
               "Wulira (Eddoboozi lye x2)\n" +
               "Ali awo ku luggi Anakuwa essanyu\n" +
               "Olw`erinya ly(e) egganzi, \n" +
               "Wuli~ra. (Eddoboozi lye x2)\n\nGgulawo (o)mutima gwo,\n" +
               "Ggulawo; (Yesu ayingirire x2)\n" +
               "Bw`onolwa (a)nakuvaako,\n" +
               "Ggula~wo (Yesu ayingirire x2)\n" +
               "Ye mukwano gwo ddala.\n" +
               "(O)mutima gw(o) agutaasa,\n" +
               "So takwabulirenga, Ggula~wo. (Yesu ayingirire x2)\n\nYesu ava mu Ggulu, Ggulawo; (Yesu ayingirire x2)\n" +
               "Alye awamu naawe,\n" +
               "Ggula~wo, (Yesu ayingirire x2)\n" +
               "Alyok(e) akulokole, Kkiriz(a) okwagala kwe,\n" +
               "Akutwale mu ggulu,\n" +
               "Ggula~wo (Yesu ayingirire x2)'),"+
               "(103,'Yesu Ayita Nekisa Ekingi.…','Yesu ayita n’ekisa ekingi\n" +
               "Gwe nange atuyita,\n" +
               "Ayimiride nga alindirira,\n" +
               "Alinda ggw(e) era nange.\n\nChorus:\n" +
               " Mujje, eka!~, \n" +
               "Mwenna abakooy(e) ennyo!~\n" +
               "Yes(u) abayita n’ekisa ekingi\n" +
               "Komawo mangu - - - e - - - ka.\n\nYesu yegayirira tunagaana?\n" +
               "Yegayirira ffena.\n" +
               "Lwaki tugaana ekisa kye kino,\n" +
               "Kyatulaze ffe fenna?\n\nEkiseera ky’ekisa kye kiyita,\n" +
               "Olinze kuggalirwa?\n" +
               "Esaawa ey’okufa esembera, Esemberedde ffenna.\n\nLowooza okusuubiza kwe kwonna,\n" +
               "Kw`asuubiza gwe nange.\n" +
               "Ffe twayoonona naye asonyiye,\n" +
               "Atusonyiye fenna.'),"+
               "(104,'Yesu Wange Ya’ngamba Nti.…','Yesu wange ya’ngamba nti\n" +
               "“Jjangu owummule;\n" +
               "Wamuula ggwe akooy(e) ennyo.\n" +
               "Mu kifuba kyange”\nAyi Yesu,~ najja gy’oli\n" +
               "Nali o~munaku:\n" +
               "Nawummuliranga mu Ggwe\n" +
               "Ompadde (e)ssanyu lyo.\n\nYesu wange ya’ngamba nti,\n" +
               "“Kye nkuwa kya buwa;\n" +
               "Nywa (a)mazzi ag’obulamu\n" +
               "Owon(e) enyonta yo”\nNe nsembera~ (a)wali Yesu,\n" +
               "\tNe nywa (a)ma~zzi ago;\n" +
               "Ne nfun(a) amaanyi mu mwoyo,\n" +
               "Kakano ndi wuwe.\n\nYesu wange ya’ngamba nti,\n" +
               "“Ensi ya nzikiza,\n" +
               "Tunulira Nze ofune\n" +
               "\t(O)musana gw’omwoyo.”\nNatunula~ eri Yesu,\n" +
               "Ye nanja~kira nze,\n" +
               "Kantambulirenga mu Ye,\n" +
               "Ekkubo ly’essanyu.'),"+
               "(105,'Omusumba Omulungi Akuyita.…','Omusumba (o)mulungi Akuyita leero;\n" +
               "Jjangu mu kisibo kye, Owummule~ mu ye.\n" +
               "Obang(a) oli~ mukadde, Oba muvubuka\n" +
               "Wulir(a) eddo~boozi lye,\n" +
               "Yingir(a)  ekku~bo lye.\n\nChorus:\n" +
               "Akuyita n’ekisa ekingi,\n" +
               "“Jjangu gyendi eyakyama edda;\n" +
               "Komawo ggwe nga omutambuze,\n" +
               "Komawo gyendi nate.”\n\nOmusuumb(a) omulungi\n" +
               "yawaay(o) obulamu;\n" +
               "Kakano akuyita Agamba nti~ “Jjangu,\n" +
               "Dduk(a) oleme~ okufa, Waliwo akabi;\n" +
               "Obang(a) oli~ mukadde; \n" +
               "oba muvu~buka.”\n\nTolwa naye yanguwa dduka emisege:\n" +
               "Eginoonya endiga Enkulu n’o~buto.\n" +
               "Omusumb(a) o~mulungi Akuyita “Tolwa;\n" +
               "Jjangu gyendi~ kakano,\n" +
               "Owummule~ mu Nze.”'),"+
               "(106,'Waliwo Omwoyo Ogugamba.…','Waliwo omwoy(o) ogugamba,\n" +
               "“Mbuze katono (o)kukkiriza”.\n" +
               "Naye, ggwe (o)mwonoonyi,\n" +
               "leero togamba nti,\n" +
               "“Bwe ndifun(a) ebbanga, ndikki - - riza.”\n\nToziba matu go, munnange;\n" +
               "(O)mwoyo w’ekisa bw’akuyita.\n" +
               "Yesu akuyita, ne bamalayika,\n" +
               "Omwana eyazaawa,  Oko - - mewo!\n\nOmukisa tosubwa nate,\n" +
               "Oba ol(i) awo toliddayo;\n" +
               "(O)kuwulira Mwoyo,  ng’akuyita ojje,\n" +
               "Ekiseera kijja,  Lwana - - koma.\n\nAmakungula, Tegaalwewo;\n" +
               "Olunak(u) olw’entiisa lujja!\n" +
               "Ssalawo, tolemwa,  Gwe tobuusabuusa;\n" +
               "Kkiriz(a) olwa leero, Ng’akya - - yita.'),"+
               "(107,'Yesu Atuyita Fenna.…','Yesu atuyita fenna,\n" +
               "Tukole mu nnimiro;\n" +
               "Kubanga zonna zengedde,\n" +
               "Anakola aluwa?\nAyita ggwe era nange,\n" +
               "Empeera ye nnene nnyo;\n" +
               "Ani addamu n’essanyu,\n" +
               "Nti “Nze nzuuno; ontume.”\n\nNe bw’otogenda wala nnyo\n" +
               "kunoonya ababula,\n" +
               "Ojja kubasanga bangi,\n" +
               "Kumpi ku mirirano,\nOba toli mwogezi nnyo,\n" +
               "Okwenkana Paulo,\n" +
               "Yogera ku Yesu kyokka,\n" +
               "Nga yafa kulwa bonna.\n\nObanga toli mukuumi,\n" +
               "Ku bbugwe wa Sayuni,\n" +
               "Nga obalaga ku Yesu,\n" +
               "“Ekkubo n’obulamu.”\nGgwe nyikira mu kusaba,\n" +
               "Ye anakola byonna,\n" +
               "Ojja kubanga Aloni,\n" +
               "(O)kuwanirira Musa.\n\nAbantu bazikirira,\n" +
               "Mukama akuyita,\n" +
               "Togezako kugamba nti\n" +
               "“Nze siriiko kye nnyinza.”\nKola gwonna gw’akuwadde,\n" +
               "Era kola n’essanyu;\n" +
               "Bw’akuyita ddamu bw’oti,\n" +
               "Nti “Nze nzuuno: ontume.”'),"+
               "(108,'Wulira Eky’essanyu.…','Wulira eky’essanyu, Yesu alokola.\n" +
               "Ka tukibunye wonna, Yesu alokola.\n" +
               "Bunyisa mu nsi zonna,\n" +
               "Ku nsozi n’ebizinga,\n" +
               "\tKatonda bw’atugamba,Yesu alokola.\n\nBulira buli muntu, Yesu alokola.\n" +
               "Tegeeza abonoonyi, Yesu asonyiwa.\n" +
               "Mmwe (e)bizinga muyimbe,\n" +
               "N’amayengo ge nyanja,\n" +
               "Ensi eyogaane nnyo, Yesu alokola.\n\nMuyimbe mmw(e) abalwanyi,\n" +
               "Yesu alokola.\n" +
               "Olw’okufa kwe kwokka, Yesu alokola.\n" +
               "Ne bw’obeera mu nnaku,\n" +
               "Ng’olumwa mu mwoyo gwo,\n" +
               "Ne mu kufa yimba nti, Yesu alokola.\n\nYimba nnyo mu bbanga nti,\n" +
               "Yesu alokola.\n" +
               "Ensi zonna ziyimbe, Yesu alokola.\n" +
               "Obulamu bwa buwa \n" +
               "Bulira mu mawanga,\n" +
               "Kwe kuwangula kwaffe, Yesu alokola.'),"+
               "(109,'Buli Muntu Yenna Awulire.…','Buli muntu yenna awulire\n" +
               "Ebigambo by’Omulokozi w’ensi,\n" +
               "Bunya wonna wonna nti\n" +
               "akkiriza, \n" +
               "Alirokoka - - - mu ye.\n\nChorus:\n" +
               "Buli awulira, ekigambo kye\n" +
               "Ategez(e) abalala mu nsi yonna,\n" +
               "Kitaffe ayita - Komawo eka\n" +
               "Bul(i) awulidde - - - jjangu\n\nBuli muntu yenna asembere\n" +
               "Oluggi (o)lw’omu ggulu\n" +
               "lugguddwawo,\n" +
               "Yesu ge mazima, lye kkubo lyaffe,\n" +
               "Ekibalwisa - - - kiki?\n\nBuli muntu yenna ayagala,\n" +
               "Ekigambo kya Katond(a) atalimba;\n" +
               "Kale bannange, tubuny(e) ettendo lye,\n" +
               "Atugabidde - - - buwa.'),"+
               "(110,'Waliwo Oluggi Oluggule.…','Waliwo (o)luggi (o)luggule,\n" +
               "Omwo mwe ndabira nze,\n" +
               "Okwagala kwa Mukama,\n" +
               "Okwamunfiiriza nze.- - -\n\nChorus:\n" +
               "Nga kwagala kunene nnyo,\n" +
               "Olwo lwaggulwa ku lwange?\n" +
               "Lwange, Lwange? - - -\n" +
               "Lwaggulwa ku lwange?\n\nOluggi olwo lwa bonna,\n" +
               "(A)banoonya (o)bulokozi;\n" +
               "Abagagg(a) era n’abaavu,\n" +
               "Lwa buli muntu yenna.---\n\nTulwanyise omulabe,\n" +
               "Oluggi lukyagguddwa,\n" +
               "Kkiriza ofune (e)ngule,\n" +
               "Wesige (o)kwagala kwe.---\n\nFenna bwe tulisomoka,\n" +
               "Nga tuwangudde ensi;\n" +
               "Ne tutikkirw(a) engule,\n" +
               "Tunamuyimbiranga.---'),"+
               "(111,'Omusawo Ali Kumpi.…','Omusawo ali kumpi, - -\n" +
               "Mukama ow’ekisa;\n" +
               "Azzaam(u) amaanyi abakooye,\n" +
               " -Wulir(a) eddobozi lye.\n\nChorus:\n" +
               "A~sinzibwa mu ggulu,\n" +
               "N’a~sinzibwa ne ku nsi;\n" +
               "Kirungi okuyimba,\n" +
               "Ku linnya lye Yesu.\n\nAyi Omwana gw’endiga,\n" +
               "- - Nzikiriza (o)kufa kwo;\n" +
               "Nsanyukira erinnya lyo,\n" +
               "- - Ery’omuwendo mungi.\n\nErinnya lye lindokola,\n" +
               "- - Erinnya lye lye lyokka,\n" +
               "Nsanyuka okuwulira, \n" +
               "- - Yesu nga asinzibwa\n\nBwalikomawo n’engule,\n" +
               "- - Engule ey’obulamu;\n" +
               "Tulituula wamu naye,\n" +
               "- - Twekulise ens(i) eno.'),"+
               "(112,'Ggwe Okooye, Onafuwade.…','Ozitowereddw(a) okooye, onafuwadde?\n" +
               "Yesu agamba Genda ~\n" +
               "gy’al(i) owummule! \n\nAlina bubonero ki\n" +
               "Obumundaga?\n" +
               "(E)nkovu~ nu bibatu~ ne ku bigere.\n\n(O)mutwe gwe guliko\n" +
               "engule y’obwakabaka?\n" +
               "Guli~ko engule,~\n" +
               "naye ya maggwa.\n\nNze okumugoberenga,\n" +
               "nfunamu kiki?\n" +
               "Oku~kola n’ama~ziga, n’ennaku.\n\nBwemmulemerako Yesu,\n" +
               "edd(a) alimpa ki?\n" +
               "Oliwangul(a)\n" +
               "amagombe n’okufa.\n\nBwemmusab(a) okunsembeza tangobe waali? Oku~goba, nedda, \n" +
               "~nedda, tayinza.\n\nBwe ng’umira byonna byonn(a) alimp(a) omukisa?\n" +
               "Aba~tukuvu ba~gamba - Wewaawo!'),"+
               "(113,'Waliwo Ensulo Ey’omusaayi.…','Wa~liw(o) ensul(o) ey’omusaayi,\n" +
               "O~kuva~ mu~ Yesu;\n" +
               "A~bonoonyi banaabamu, \n" +
               "Ne~bawon(a) ekibi.\nNe~bawon(a) ekibi~Nebawon(a) e~ki~bi,\n" +
               "A~bonoonyi banaabamu, Ne~bawon(a) ekibi.\n\n(O)mu~bbi oli yasanyuka (O)ku~lab(a) ensul(o) e~yo;\n" +
               "Na~nge omwonoonyi ennyo, Nnaa~tukuzibw(a) omwo.\nNnaa~tukuzibw(a) omwo" +
               " ~Nnatukuzi~bw(a) o~mwo;\nNa~nge omwonoonyi ennyo,\nnaa~tukuzibw(a) omwo.\n\nA~yi Omwana gw’Endiga, \n" +
               "(O)mu~saayi gwo gu~kola;\n" +
               "(O)ku~tuusa ekkanisa yo,\n" +
               "Lwe~linunulibwa.\nLwe~\nlinunulibwa ~ Lwelinunu~li~bwa;" +
               "\n(O)ku~tuusa ekkanisa yo,\nLwe~linunulibwa\n\n(O)ku~va lwennalab(a) ensulo,\n" +
               "E~y’ebiwundu byo;\nNdo~wooza ku kwagala kwo,\n(O)ku~tuusa lwe ndifa.\n(O)ku~tuusa lwe ndifa ~\n" +
               "B(O)kutusa lwe~ ndi~fa;\nNdo~wooza ku kwagala kwo,\n(O)ku~tuusa lwe ndifa\n\n" +
               "Ku~ luli lwendizuukira,\nO~kuva mu ntaana,\n" +
               "A~maanyi g(o) agalokola,\n" +
               "Ge~ndiyimbangako.\nGe~ndiyimbangako ~\nGendiyimba~nga~ko\n" +
               "A~maanyi g(o) agalokola,\n" +
               "Ge~ndiyimbangako.\n'),"+
               "(114,'Mukama Netaaga Okuba Omulungi.…','Mukama netaag(a)\n" +
               "Okub(a) omulungi,\n" +
               "Era njagala otulenga mu nze.\n" +
               "Omalemu byo~na ebitasaana\n" +
               "Ontukuze okusing(a) omuzira.\n\nChorus:\n" +
               "\n" +
               "Onnongose mu musayi gwo\n" +
               "Ebyonno byange byonna biggwewo\n\nNtunulira nga oyima mu ggulu, \nOmbeere okuleka buli kibi,\n" +
               "Newddeyo nze~nna mu mikono gyo,\n" +
               "Onnaze mu musayi gwo ntukule.\n\nMukama Yesu kino kye nsaba,\n" +
               "Nga bwe wattibwa ku lw’ebibi byane,\n" +
               "Omusayi gwo~ gunnazek(o) ebibi, \nNtukule okusinga omuzira.\n\nMukama olaba bwe nkusuubira," +
               "\nJjangu ompe omutima omuggya.\n" +
               "Gwe atagamba~ bajja nti “Muveewo,” \nOnnaze mu musaayi Gwo ntukule.\n'),"+
               "(115,'Njija Ku Musalaba.…','Njija ku musalaba,\n" +
               "Nze omunaku ennyo.\n" +
               "Byonn(a) eby’ensi si kintu\n" +
               "Njagala bulokozi.\n\nChorus:\n" +
               "Nesiga ggwe, Mukama,\n" +
               "Ggwe omwana gw’endiga\n" +
               "Eyafa kulw(a) ababi,\n" +
               "Ndokola ayi Yesu.\n\nNsaba mbeere ne Yesu,\n" +
               "Naye siri mulungi,\n" +
               "Ye yekka annongose,\n" +
               "Kubanga yansuumbiza.\n\nByonna mbiwaayo gy’oli,\n" +
               "Emikwano ne byonna,\n" +
               "Omwoyo n’omubiri,\n" +
               "Byonna bibenga bibyo.\n\nYesu bw’obeera mu nze,\n" +
               "Mbeera mutuukirivu,\n" +
               "Nnongoosebwa mu byonna,\n" +
               "Nkwebaza Ayi Yesu!'),"+
               "(116,'Mukama Kino Kyensaba .…','Mukama kino kye nsaba,\n" +
               "Ebyonoono byange byonna;~\n" +
               "Obinaze n’amazzi go;\n" +
               "Ontukuze, ontukuze.\n\nChorus:\n" +
               "Nnaaza munda ne kungulu,\n" +
               "Onnongoose n’omuliro;\n" +
               "Ebibi byange biggwewo,\n" +
               "Ontukuze, ontukuze\n\nBw’ onompa okwolesebwa\n" +
               "Ononsanyusa omwoyo,~\n" +
               "Nay (e) omutim(a) omulungi\n" +
               "Gwe negomba, gwe negomba.\n\nBw’ ononnongos(a) omutima\n" +
               "Kye kirabo ekisinga,~\n" +
               "Ne gufaanana ng’ogugwa,\n" +
               "(O)mutukuvu, (o)mutukuvu.\n\n(E)kkubo ebbi ka ndireke,\nMu birowoozo ebibi,~\n" +
               "Naye mu kufuba kwange, \n" +
               "Sisobola kwetukuza.'),"+
               "(117,'Wanaazibwa Mu Musaayi?.…','Wanaazibwa mu musaayi gwa Yesu,\n" +
               "(O)musaayi gw’Omwana\n" +
               "gw’Endiga?\n" +
               "Wesiga ekisakye olw’aleero,\n" +
               "Onaabye mu musaayi gwa Yesu?\n\nChorus:\n" +
               "Onnabye Mu musaayi,\n" +
               "Ogwa Yes(u) ogunaaz(e) ekibi?" +
               "\n(E)ngoye zo zitukudde ng’omuzira,\n" +
               "Onaabye mu musaayi gwa Yesu?\n\nBulijjo gwe otambula ne Yesu," +
               "\nOnaabye mu musaayi gwa Yesu?\n" +
               "Wekwese mu Yes(u) eyakomererwa," +
               "\nOnaabye mu musaayi gwa Yesu?" +
               "\n\nBwalijj(a) alisang(a) engoye zo njeru," +
               "\nZozeddwa mu musaayi gw’endiga?" +
               "\nOliba osaanidde gwe eggulu," +
               "\nNg’onabye mu musaayi gw’endiga?\n\nYambul(a) engoye zikongedd(e) ekibi;" +
               "\nOnaabe mu musaayi gw’endiga," +
               "\nWaliw(o) ensul(o) ekulukut(a) enaaza,\n" +
               "Naazibwa mu musaayi  gw’endiga.'),"+
               "(118,'Nakyama Okuva Ku Yesu.…','Nakyam(a) okuva ku~ Yesu,\n" +
               "Nkomawo eka.\n" +
               "(E)bibi byange binko~yeza,\n" +
               "Nkomawo eka.\n\nCHORUS:\n" +
               "Nkomawo, nkomawo;\n" +
               "Sikyabungeeta,\n" +
               "Nkwata mu miko~no gyo,\nNkomawo eka.\n\n(E)biro bingi nga nnyo~noona,\n" +
               "Nkomawo eka;\n" +
               "Nakuwadde nnyo (O)lw’e~bibi\n" +
               "Nkomawo eka.\n\nYesu nkoy(e) okubu~ngenta,\n" +
               "Nkomawo eka;\n" +
               "(O)kwagala kwo kwe nnee~siga,\nNkomawo eka.\n\nMusaayi gwo gwennee~taaga, Nkomawo eka;\n" +
               "Ntukuza nsing(e) omu~zira,\n" +
               "Nkomawo eka.\n'),"+
               "(119,'Yesu A’ngamba.…','Yesu a’ngamba nti,\n" +
               "“Ggwe tolina maanyi;\n" +
               "Tunulanga osabe,\n" +
               "Nze nnakuwanga byonna.”\n\nChorus:" +
               "\n" +
               "Yansasulira Ebbanja lyonna,\n" +
               "Nayonoonebw(a) ekibi, - - -\n" +
               "Ye nantukuza nze.\n\nA~maanyi go gokka, Gegawony(a) ekibi;\n" +
               "Gakyusa n’omutima, Omugumu ng’ejjinja.\n\nSi~rina kalungi,\n" +
               " Kasaanira kisa;\n" +
               "Ka njoz(e) engoye zange,\u000BMu musaayi gwo Yesu.\n\nBwe ~ndiyimirira\n" +
               "Mu maaso g’entebe,\n" +
               "Nditeek(a) engule yange,\n" +
               "Ku bigere byo Yesu.'),"+
               "(120,'Awo Ku Musalaba.…','Awo ku musalaba,\n" +
               "Awali amazzi\n" +
               "Aganaza ebbi,\n" +
               "W’oba onkuumira.\n\nChorus:\n" +
               "Ku musalaba gwe,\n" +
               "Kwe nenyumiririza,\n" +
               "(O)kutuusa nga mpumudde,\nMu ggulu ewaffe.\n\nOkwo nze omunaku\n" +
               "Kwe nsanga eddembe;\n" +
               "Omusana gwa Yesu,\n" +
               "Ne gunjakira nze.\n\nKwe nsanga Yesu wange,\n" +
               "Ne yeeraga gyendi;\n" +
               "Nga ampa amaanyi ge\n" +
               "Gabeerenga mu nze.\n\nAwo we nnaberanga\n" +
               "Nga neesiga Yesu;\n" +
               "Alyoke annongose\n" +
               "Ye antuuse gy’ali.'),"+
               "(121,'Nze Omwonoonyi Lukulwe.…','Nz(e) omwonoonyi lukulwe," +
               "\nYesu yafa ku lwange;" +
               "\nYafa mbeere mu ggulu,\nYafa nze nneme kufa;" +
               "\nNg’ettabi ku zzabbibu,\nNdi wuwe naye wange.\n\n(O)kwagala kwe kungi nnyo,\n" +
               "Kutuuka waggulu nnyo;\n" +
               "Era kukka wansi nnyo,\nKwo kwa mirembe gyonna;\n" +
               "Yannonya n’anzuula nze,\n" +
               "Nga sinnamukowoola!\n\nOmwonoonyi lukulwe," +
               "\nKri-sto ye byonna gyendi;\n" +
               "Amanyi byeneetaaga,\nAnnumirwak(o) ennaku;\n" +
               "Nze bwemba naye sitya,\n" +
               " Abeera ngabo yange.'),"+
               "(122,'Newaddeyo Gy’oli Yesu.…','Newaddeyo gy’oli Yesu,\n" +
                       "Newaddeyo nze nzenna;\n" +
                       "Nkwagala era nkwesiga,\n" +
                       "W’oli we nnabeerange.\n\nChorus:\n" +
                       "Newayo gy’oli,\n" +
                       "Newaayo gy’oli,\n" +
                       "Newaddeyo gy’oli Yesu,\n" +
                       "Newaayo gy’oli.\n\nNewaddeyo gy’oli Yesu,\n" +
                       "Ndi wano mu maaso go;\n" +
                       "Nziyako eby’ensi byonna,\n" +
                       "Onfuule omwana wo.\n\nNewaddeyo gy’oli Yesu,\n" +
                       "Onnaze ontukuze;\n" +
                       "Omwoyo wo abe nange,\n" +
                       "Ntegeere nga ndi wuwo.\n\nNewaddeyo gy’oli Yesu,\n" +
                       "Mpulira amaanyi go,\n" +
                       "N’essanyu ly’obulokozi,\n" +
                       "Nkwebaza nnyo Mukama.'),"+
               "(123,'Olw’okukkiriza Nnyiza Okulaba Ggwe.…','Olw’okukkiriza,\n" +
               "Nyinz(a) okulaba Ggwe(O)mulokozi.\n" +
               "Wulira nga nsaba,\n" +
               "Gyaw(o) ebibi byange,\n" +
               "\tOkuva kakano mbeere wuwo.\n\nEkisa kyo Yesu,\n" +
               "Kimpa amaanyi go Ndiwangula.\n" +
               "Nga bwewanfiirira,\n" +
               "Kkiriza kye nkuwa\n" +
               "Obulamu bwange Bukozese.\n\nOnyambe, Mukama, olw’okutegeera\n" +
               "(E)kigambo kyo;\n" +
               "(O)mwoyo gwo annu’ngamye\n" +
               "Nange nasomanga,\n" +
               "Ndyoke nkutegeere Mu kitabo.\n\nWano ndi mu kabi\n" +
               "N’olw’ekyo sembera Kumpi nange;\n" +
               "(O)nkwate ku mukono\n" +
               "Nnem(e) okukankana\n" +
               "Ontwale ewuwo, Ng’okomyewo!'),"+
               "(124,'Okooye Nyo?.…','Okooye Nnyo, Ozitowereddwa?\n" +
               "Tegeeza Yesu, tegeeza Yesu;\n" +
               "Olin(a) ennaku nnyingi ku myoyo?\n" +
               "Gend(a) eri Yesu totya.\n\nChorus:\n" +
               "Tegeeza Yesu, tegeeza Yesu,\n" +
               "Ye mukwano gwo ddala;\n" +
               "Tewali mulala amusinga,\n" +
               "Gend(a) eri Yesu totya.\n\n\n" +
               "Okulukus(a) amaziga mangi?\n" +
               "Tegeeza Yesu, tegeeza Yesu.\n" +
               "Olin(a) ebib(i) ebitamanyiddwa,\n" +
               "Gend(a) eri Yesu totya.\n\nOtidde nnyo olw’entiisa egya?\n" +
               "Tegeeza Yesu, tegeeza Yesu.\n" +
               "Weralikiridd(e) olw’okujja kwe,\n" +
               "Genda kaakano gy’ali.\n\nObang(a) oyagala emirembe,\n" +
               "Tegeeza Yesu, tegeeza Yesu;\n" +
               "Olyoke osanyuke lw’alidda,\n" +
               "Genda kaakano gyali.'),"+
               "(125,'Kabaka We Ggulu.…','Kabaka we~ Ggulu,\n" +
               "Tutende e~rinnya lyo, Tukusinze!\n" +
               "Ggwe omuwanguzi,\n" +
               "Nannyini kitiibwa,\n" +
               "otufuge leero, Omutonzi!\n\n(O)mwoyo (O)mutu~kuvu,\n" +
               "Gwe otuwo~lereze,\n" +
               "Fenna leero! Ggwe Ayinza byonna,\n" +
               "Fuga emitima, \n" +
               "Totuvangako Gwe Ow’amaanyi.\n\n(O)mwana wa Ka~tonda,\n" +
               "Okomewo~ mangu nnyo,\n" +
               "Beera naffe! Tukole by’osiima,\n" +
               "By’oyagala byonna,\n" +
               "Emirembe gyonna, Tube babo.'),"+
               "(126,'Nkwetaaga Bulijjo.…','Nkwetaaga bulijjo,\n" +
               "Ayi~ Ye~su;\n" +
               "Sirina mirembe\n" +
               "Wantu~ wo~nna.\n\nChorus:\n" +
               "Nkwetaaga ayi Yesu,\n" +
               "Bulijjo nkwetaaga;\n" +
               "Ompe omukisa gwo,\n" +
               "Jjangu~ gyendi.\n\nNetaaga obeere\n" +
               "Kumpi~ na~nge;\n" +
               "Ebikemo byonna\n" +
               "Ggw(e) obi~go~ba.\n\nNkwetaaga mu ssanyu\n" +
               "Ne mu~ nna~ku,\n" +
               "Ggwe obere nange,\n" +
               "Nnem(e) o~ku~fa.\n\nOnjigirizenga\n" +
               "By’oya~ga~la,\n" +
               "Ebisuubizo byo,\n" +
               "Bibe~ mu~ nze.\n\nEkiseera kyonna.\n" +
               "Ayi Mu~ka~ma\n" +
               "Netaaga onfuule\n" +
               "Omwa~na~ wo.'),"+
               "(127,'Bwenfuna Eddembe.…','Bwe nfun(a) eddembe\n" +
               "mu bula~mu bwange,\n" +
               "Oba bwe mbeera mu nnaku,\n" +
               "Onjigirize okukkirizanga,\n" +
               "Buli ngeri yonna mw’ontadde.\n\nChorus:\n" +
               "Mirembe, mirembe;\n" +
               " Mukama njagala mirembe.\n\nSetani bw’aleeta ebi~kemo bye,\n" +
               "Yimusa essuubi lyange,\n" +
               "Nti Yesu alab(a) obunafu bwange,\n" +
               "Era Ye atambula nange.\n\n(E)kigambo kino\n" +
               "kyokka kye~ neesiga,\n" +
               "Nti ebibi byange byonna,\n" +
               "Byakomererwa ku musalaba gwe, Mukama Yesu yebazibwe.\n\nMukama ayanguye o~lunaku,\n" +
               "Olulibikkula byonna;\n" +
               "(E)ssubi liritukirira bw’alijja,\n" +
               "Ndimulaba Yesu n’amaaso.'),"+
               "(128,'Bwe Tuba " +
               "Ne Yesu.…','Bwe tuba ne Yesu, Nga tumugondera\n" +
               "Atuw(a) omusana mu kkubo;\n" +
               "Tukola by’asiima Aba wamu naffe\n" +
               "Ne bonna abamugondera.\n\nChorus:\n" +
               "Mugondere, Tewali mulala,\n" +
               "Wabula Yesu yekka,\n" +
               "Gw’oba ogondera.\n\nTewali nzikiza Tewabaawo bire,\n" +
               "Omusana gwe gutwakira;\n" +
               "Okutya kuggwawo,\n" +
               "Tewaba kwekanga,\n" +
               "Aba naff(e) abamugondera.\n\nTukola lwa ssanyu Naye si lwa nnaku;\n" +
               "Yesu alituwa empeera,\n" +
               "Mu kufiirwa kwaffe,\n" +
               "Mu kulumwa okungi,\n" +
               "Aba naffe bwetumwesiga.\n\nTetulitegeera Kwagala kwe kwonna,\n" +
               "Okutuusa lwe tulyewaayo;\n" +
               "Kubang(a) ekisa kye,\n" +
               "N’essanyu lyagaba,\n" +
               "Byabo booka abamwesiga.\n\nMu kutabagana, Nga tutudde waali,\nOba nga tutambula naye,\nKy’agamba, tukole,\n" +
               "Gyatuma, tugende,\u000BTetutya twesige, tugonde.'),"+
               "(129,'Kirungi Okwesiga Yesu.…','Kirung(i) okwesiga Yesu,\n" +
               "N’ekigambo kyo kyonna;\n" +
               "N’ebyo Ye bye yasuubiza,\n" +
               "Ebyava mu kamwa ke.\n\nChorus:\n" +
               "Yesu, Yesu, nga mmwesiga,\n" +
               "Nga mmukakasizza nnyo!\n" +
               "Yesu, Yesu, omulungi!\n" +
               "Mp(a) ekisa nkwesigenga!\n\nKirungi okwesiga Yesu, \n" +
               "Twesig(e) omusaayi gwe;\n" +
               "Tukkirize tunaazibwe,\nMu nsulo etukuza.\n\nKirung(i) okwesiga Yesu,\n" +
               "So si bikolwa byaffe,\n" +
               "Mu Ye tufun(e) obulamu,\n" +
               "Essanyu n’emirembe.\n\nNsanyuka, kuba nkwesiga,\n" +
               "Yesu Ow’omukwano;\n" +
               "Era mmanyi ali nange,\n" +
               "(O)kutuus(a) enkomerero.'),"+
               "(130,'Tulina Omukwano Gwaffe.…','Tulin(a) Omukwano gwaffe,\n" +
               "Atuyamba bulijjo.\n" +
               "Bwe tunamugoberera,\n" +
               "Tatugobere bweru.\nWano tetufun(e) eddembe,\n" +
               "Wano tufun(a) ennaku;\n" +
               "Omulokozi ye Yesu,\n" +
               "(O)mukwano gw’abonoonyi.\n\nTulin(a) Omukwano gwaffe,\n" +
               "Alin(a) amaanyi mangi;\n" +
               "N’olwekyo ab’oluganda,\n" +
               "Tulemenga okutya.\nTumwesige atukuuma,\n" +
               "Tatuleka mu bibi\n" +
               "Yesu ye Mukuumi waffe,\n" +
               "(O)mukwano gw’abonoonyi.\n\nTulin(a) Omukwano gwaffe,\n" +
               "Atulu’ngamya fenna;\n" +
               "Mu kizikiz(a) ekikutte,\n" +
               "Ye musana gw’abantu.\nTulemenga okunyoma,\n" +
               "Omukisa gwa Yesu,\n" +
               "Ka tutendereze oyo\n" +
               "(O)mukwano gw’abanoonyi.'),"+
               "(131,'Ayi Yesu Amaaso Gange.…','Ayi Yesu amaaso gange\n" +
               "Tegakulabanga;\n" +
               "(E)kizikiza bwe kibikka,\n" +
               "Siraba maaso go.\n\nSikulaba siwulira,\n" +
               "Ddoboozi lyo Yesu!\n" +
               "Nga obeera kumpi nange,\n" +
               "Mu buliu kusaba.\n\nSikulaba siwulira,\n" +
               "Ddoboozi lyo Yesu!\n" +
               "Nga obeera kumpi nange,\n" +
               "Mu buliu kusaba.\n\nEnsi terinaayo kifo,\n" +
               "Kya ssanyu nga ekyo;\n" +
               "(E)kifo we ndabaganira,\n" +
               "Ne Yesu munnange.\n\nNg(a) ebirooto eby’essanyu,\n" +
               "Ebijja mu tulo,\n" +
               "Embala ye ngirowooza,\n" +
               "Ne nfun(a) okwesiima.'),"+
               "(132,'Mukama Ye Musumba.…','Muka~ma Ye Mu~sumba se~tagenga,~\n" +
                       "Anga~lamiza~ mu muddo~~ omuto;\n" +
                       "Antwa~l(a) awali~ oluzz(i) oluteefu,\n" +
                       "Ako~myaw(o) emme~me\n" +
                       "yange~~ munteeko.\n\nAnnu’ngamya mu~ butuuki~rivu bwe,~\n" +
                       "Newa~kubadde~ nga \n" +
                       "mbeera~~ mu kufa;\n" +
                       "Nga Ggw(e) o~li nange~ seralikirira,\n" +
                       "(O)luga~ lwo n’omu~ggo\n" +
                       "gwo bye~~ binkuuma.\n\n(A)bala~be ne bwe~ babawo~ ondiisa,~\n" +
                       "Onsii~ze ama~futago~~ku mutwe;\n" +
                       "(E)kiko~mpe kyange~ kijjud(e) omubisi,\n" +
                       "Nze na~beeranga~ ne Yesu~~ bulijjo.\n\n(O)bulu~ngi bwo \n" +
                       "n’e~kisa kyo~ Kitange,~\n" +
                       "Kaba~ka era~ Katonda~~ wange nze;\n" +
                       "Bibee~renga ku~ nze buli gye mbeera, \n" +
                       "Oku~tuusa lw’o~limpa  e~~ngule yo.'),"+
               "(133,'Buli Wantu Wonna.…','Buli wantu wonna Yesu gy’antwala,\n" +
               "Buli wantu wonna siriiko kye ntya;\n" +
               "Yesu bw’aba nga\n" +
               "w’ali mba n’essanyu,\n" +
               "Yesu nga w’ali mbeera n’emirembe.\n\nChorus:\n" +
               "Mukama w’obeera Siriiko kye ntya;\n" +
               "Buli wantu wonna nga ndi ne Yesu\n\nBuli wantu wonna Yesu tondeka,\n" +
               "Bonna nga bandese Ggwe beera nange;\n" +
               "Bw’ompisa mu kkubo ery’akanyigo,\n" +
               "Jjangu kumpi nnyo nga bwe wassubiza!\n\nWonna we nsula nga ndi\n" +
               "wano naawe, \n" +
               "Oba nga kifo kya kubonabona;\n" +
               "Ntegeera nga Ggwe olimponya byonna, \n" +
               "Yesu w’obeera ennaku ziggwawo.'),"+
               "(134,'Waayo Ekiseera.…','Waayo ekiseera eri Katonda,\n" +
               "Nyumyanga ne Yesu mu Kigambo kye.\n" +
               "Kwananga ababe, Yamb(a) abanafu,\n" +
               "Nonyang(a) omukisa gw’oyo bulijjo.\n\nWaayo ekiseera eri Katonda;\n" +
               "Beeranga mu kyama wamu ne Yesu.\n" +
               "Olw’okumulaba ofuuke nga ye,\n" +
               "Ne mu mpisa zo nga olaga Yesu.\n\nWaayo ekiseera eri Katonda,\n" +
               "Era Linda ye akukulembere.\n" +
               "Mu ssanyu, mu nnaku, beranga naye,\n" +
               "Tunulira Yesu n’Ekigambo kye.\n\nWaayo ekiseera eri Katonda;\n" +
               "Obeere n’eddembe mu mutima gwo.\n" +
               "Bw’okulemberwa Omwoyo we yekka,\n" +
               "Akusanyize okumuwereza.'),"+
               "(135,'Kye Kiseera " +
               "Ky’okusaba.…','Kye kiseera ky’okusaba,\n" +
               "Ka nve ku bi~gambo by’ensi;\n" +
               "Kang’ende eri Kitanga,\n" +
               "Ntwale obu~zibu bwange.\nMu biro by’entalo zange,\n" +
               "Kampwebwe okuwummula,\n" +
               "Anamponya omulabe,\n" +
               "Nage ndyoke~ mmusinzenga.\n\nKye kiseera ky’okusaba,\n" +
               "Ntwala ebi~gambo byange,\n" +
               "Eri Oyo omwesigwa,\n" +
               "Ansanyusa~ bwenneetaaga.\nAtangoba mu maaso ge,\n" +
               "Nga nesig(a) ekigambo kye,\n" +
               "Ka mmukwase buli kintu,\n" +
               "Mu kiseera~ ky’okusaba.\n\nKye kiseera ky’okusaba,\n" +
               "A’ngumyenga~ mu bikemo,\n" +
               "Ayimus(e) omwoyo gwange,\n" +
               "Andage a~maka gange,\nBwalinnyambaz(a) ogutafa,\n" +
               "Ngampadde ekirabo kye,\n" +
               "Ndiyimba n’essanyu lingi,\n" +
               "Nga ng’enda e~yo ewaffe.'),"+
               "(136,'Kwata Omukono Gwange.…','Kwat(a) omukono gwange,\n" +
               "ndi munafu,\n" +
               "Sirina nze ku tambula nzekka;\n" +
               "Naye bw’onyweza siriko kye nnaatya,\n" +
               "Nawangula byonna ebintiisa.\n\n(O)mulokozi,\n" +
               "Kwat(a) omukono gwange,\n" +
               "Onsembeze kumpi n’Omwoyo gwo;\n" +
               "Enzikiz(a) ekute, Onjakire nze,\n" +
               "Nem(e) okuva\n" +
               "mu kkubo ly(o) eddungi.\n\nKwat(a) omukono gwange,\n" +
               "mu bulwadde,\n" +
               "Nga nzirika nga nnaater(a) okufa;\n" +
               "Bw’obeera nange naafun(a) emirembe,\n" +
               "Natambulanga n’essanyu lingi.'),"+
               "(137,'Kye Kiseera Ekirungi.…','Kye kiseer(a) ekirungi ky’okusaba nate,\n" +
               "Katufukamire mu maaso g(a) entebbe;\n" +
               "Nga tukkiriza Yesu, tumusemberere;\n" +
               "Mwe abakooye mujje ---\n" +
               "Muwummu~le leero!\n\nChorus:\n" +
               "Tufukamire, nga tuku’~nganye,\n" +
               "Mwe abakooye, mujje -\n" +
               "Muwummu~le leero!\n\nKye kiseer(a) ekirungi ky’okusemberera,\n" +
               "N’okumusinza Yesu Omulokozi;\n" +
               "Mukama awulira okusaba kwaffe,\n" +
               "Mwe abakooye, mujje ---\n" +
               "Muwummu~le leero!\n\nKye kiseera tutwale \n" +
               "(E)nnaku zaffe zonna,\n" +
               "Tuziweeyo eri  Oyo atwagala;\n" +
               "Atuwanguze fenna Mu bikemo byaffe,\n" +
               "Mwe abakooye, mujje ---\n" +
               "Muwummu~le leero!\n\nKye kiseer(a) ekirungi, Yesu yasuubiza,\n" +
               "“Munoonye, mulabe, Era mukkirize;”\n" +
               "Katumwesige leero, N’okumugondera,\n" +
               "Mwe abakooye, mujje ---\n" +
               "Muwummu~le leero!'),"+
               "(138,'Nnakugoberera Yesu.…','Nnakugoberera Yesu,\n" +
               "Yonna gy’onontwalanga;\n" +
               "Gy’ogenda nange nnaagenda,\n" +
               "Yesu nkugoberere.\n\nChorus:\n" +
               "Nnakugoberera Yesu,\n" +
               "Ggwe eyanfirira nze;\n" +
               "Bonna ne bwebakuleka,\n" +
               "Nze nnaakugoberera\n\nMu kkub(o) omuli amaggwa,\n" +
               "Ezzibu ng’ennyanj(a) embi,\n" +
               "Gwe eyansooka okugenda,\n" +
               "Nnakugobereranga.\n\nBwennaabonyabonyezebwa,\n" +
               "Mu bikem(o) ebizibu,\n" +
               "Nzijukiza wakemebwa," +
               "\nNsanyuke ngoberere.\n\nBwe nnaaba wano mu nnaku, Nga njabuliddwa bonna,\n" +
               "Ggw(e) eyayabulirwa bonna,\n" +
               "Nze nnakugoberera.\n\nBw’ontwala ku Yoludani,\n" +
               "Nsomoke amayengo,\n" +
               "Gw(e) eyansook(a) okusomoka,\nSiitye nnaagoberera'),"+
               "(139,'Omununuzi Wange.…','Omununu~zi wange,\n" +
               "Oluyimba~ lwange,\n" +
               "Mulokozi~ (a)nsanyusa,\n" +
               "Mu bulumi~ bwange.\n\nChorus:\n" +
               "Omununu~zi Yesu,\n" +
               "Nakuyimba~ngako,\n" +
               "Ow’omukwa~n(o) asinga,\n" +
               "Tewali akwe~nkana!\n\nMulokozi~ nkwesiga,\n" +
               "Mulungamya~ wange,\n" +
               "Gw’osinga (a)ba~ntu bonna,\n" +
               "Ab’omu nsi~ muno.\n\nGgwe oli ssuu~bi lyange,\n" +
               "Mu bulamu~ bwange,\n" +
               "Bwembeera mu~ nzikiza,\n" +
               "Mu maziga~ gange.\n\nGw’oli luy~imba lwange,\n" +
               "Muns(i) en(o) ey’e~kibi,\n" +
               "Gw(e) essanyu lya~nge wano,\n" +
               "Era ne mu~ Ggulu!'),"+
               "(140,'Mukama, Nze Nina Ebibi.…','Mu~kama, nze~ nin(a) e~bibi,\n" +
               "Naye~ ekisa kyo kingi;\n" +
               "O~mpise o~kujja gy’oli,~\n" +
               "Nz’omwononyi,~ Yesu nzijja.\n\nYe~su, Omwa~na gw’e~ndiga,\n" +
               "Olw’e~bibi byange wafa,\n" +
               "(O)Lw’o~musaayi gwo~ nkukkiriza,~\n" +
               "Nz’omwononyi,~ Yesu nzijja.\n\n“A~jja gyendi~ simu~goba,”\n" +
               "(E)kiga~mbo kyo nkikkiriza,\n" +
               "Ku~b(a) okuli~mba toyinza,~\n" +
               "Nz’omwononyi,~ Yesu, nzijja.\n\nO~kwagala~ kw(o) oku~nene\n" +
               "N’eki~sa kyo bimpaludde;\n" +
               "Kye~ njagala,~ kusenga Ggwe,~\n" +
               "Nz’omwononyi,~ Yesu, nzijja.'),"+
               "(141,'Wansi w’Omusalaba.…','Wansi w’omusalaba\n" +
               "We nyimirira nze,\n" +
               "Guli ng(a) ekisikirize\n" +
               "Ky’olwazi mu ddungu;\nEra guli ng(a) ekisulo\n" +
               "Mu lukoola (o)lubi,\n" +
               "Abatambuz(e) abanaku\n" +
               "We bawummulira.\n\nWe guli we mpummuza\n" +
               "Omugugu gwange,\n" +
               "Omusana nga gwaka nnyo,\n" +
               "Newogoma mu gwo;\nBwe ngufumitiriza ko,\n" +
               " ndowooza nnyo Yesu\n" +
               "Eyafa ku musalaba,\n" +
               "Mufukamirira.\n\nYesu, Omusana\n" +
               "Omulala, sagala,\n" +
               "Amaaso go galabika\n" +
               "Gyendi nga enjuba;\nAmadala agagenda\n" +
               "Mu guulu ge gano:\n" +
               "Omusalaba gwo,\n" +
               "Yesu, era gwe gwange nze'),"+
               "(142,'Ompise Mukama.…','Mpu~ulira oyita,\n" +
               "Nze okujja gy’oli\n" +
               "Nnazazibwe n’omusayi gwo,\n" +
               "- - Ogwe Gologoosa.\n\nChorus:\n" +
               "Mukama nzijja!,\n" +
               "Nzijja kaakano!\n" +
               "Nnaaza, mu musaayi gwo,--\n" +
               "Ogwe Gologosa.\n\nWa~dde ndi munafu,\n" +
               "Onompa amaanyi;\n" +
               "Onnonaaza n`otunkuza\n" +
               "Mbuleko ebbala.\n\nA~mpita ye Yesu,\n" +
               "Mbeer(e) omukkiriza;\n" +
               "Nfun(e) essubi n`emirembe,\n" +
               "Ku nsi ne mu ggulu!\n\n(O)mu~saayi gwe gwa maanyi,\n" +
               "Ekisa kye kingi\n" +
               "Tusuute Kri-sto Mukama,\n" +
               "Ye ge maanyi gaffe!'),"+
               "(143,'Kitange, Nze Nkukowoola.…','Kitange, nze nkukowoola,\n" +
               "Ggwe mubeezi wange;\n" +
               "To~nzigyako ku~kuuma kwo,\n" +
               "Ne~me okubu~la.\n\n(O)mugabi w’okukkiriza,\n" +
               "Nze nkutunulidde!\n" +
               "E~kirabo kyo~ nkyetaaga\n" +
               "we~kitali nfa~ nze.\n\nMmanyi nga tondeke kufa,\n" +
               "Yogera, omponye;\n" +
               "Ka~kano ka nni~ndirire,\n" +
               "O~mwoyo (o)mubee~zi.\n\nNdijjula essanyu lingi,\n" +
               "Nga ndab(a) amaaso go;\n" +
               "Mpu~liza eki~gambo kyo,\n" +
               "Mpee~bwe n’ekisa~ kyo.\n\nNzikiriza ddala Yesu\n" +
               "Nga wanfirira nze;\n" +
               "Noo~yiwa omu~saayi gwo,\n" +
               "Nso~nyiyibw(e) ebi~bi.'),"+
               "(144,'Ompise, Yesu.…','Ompise, Yesu Mukama Wange,\n" +
               "N’eddoboozi (e)ry’eki~sa;\n" +
               "Naye njagala okusemberera,\n" +
               "Kumpi nnyo naawe, gy’oli!\n\nChorus:\n" +
               "Onsembe-ze, Kumpi, kumpi nnyo,\n" +
               "Nsembeza gy’oli Yesu;\n" +
               "Onsembe-ze, Kumpi, kumpi nnyo--\n" +
               "Awo  ku musalaba.\n\nFuka omwoyo wo ow’ekisa\n" +
               "Ku nze nkuwereze~nga;\n" +
               "(O)mutima gwange \n" +
               "gubeere ku Ggwe, \n" +
               "Nkwagalenga Ggwe wekka.\n\nOkwagala kwo kwa buziba nnyo,\n" +
               "Ndikutegeera ntuuse;\n" +
               "Kutumbira waggulu ewala,\n" +
               "Gye siyinza kulaba.'),"+
               "(145,'Twala Ensi, Ompe Yesu.…','Twala ensi, ompe Yesu,\n" +
               "Eby’ensi tebirwawo;\n" +
               "Naye (o)kwagala kwa Yesu,\n" +
               "Kwo kwa mirembe gyonna.\n\nChorus:\n" +
               "Ekisa kya Yesu kingi!\n" +
               "Nga wa kwagala kungi!\n" +
               "Oyo eyatununula,\n" +
               "N’atuwa obulamu.\n\nTwala ensi, ompe Yesu,\n" +
               "Ye ansanyus(a) omwoyo;\n" +
               "Yesu bw’aba nga ankuuma,\n" +
               "Siriiko kye’ntya kyonna.\n\nTwala ensi, ompe Yesu,\n" +
               "Bw’aba nga anjakira;\n" +
               "Mu lugendo lwange lwonna,\n" +
               "Nnaafuna omusana.\n\nTwala ensi, ompe Yesu,\n" +
               "Nze nesiga kufa kwe;\n" +
               "Okutuusa lw’alintwala,\n" +
               "Ne mulaba n’amaaso.'),"+
               "(146,'Sirika, Sirika.…','Sirika, Sirika,\n" +
               "Mu yeekaalu Ye,\n" +
               "Sirika Owulirize Mukama\n\nChorus:\n" +
               "\n" +
               "Tambula mpola, Mu Watukuvu we,\n" +
               "[Tambula mpola, mpola]\n" +
               "Tambula mpola, Tumusemberere.\n" +
               "[Tambula mpola, mpola]\n\nSirika, Sirika,\n" +
               "Mu Watukuvu,\n" +
               "Wuliriz(a) obubaka obw’ekisa:\n\nTwewombeke fenna\n" +
               "nga tumusaba,\n" +
               "Tulyoke tulege ku birungi bye.\n\nSirika, Sirika,\n" +
               "(a)kuwe (e)kisa kye,\n" +
               "Sirika olindirire Mukama.'),"+
               "(147,'Fuga Obulamu Bwange.…','Fug(a) obulamu bwange, Gwe Yesu Kabaka.\n" +
               "Gwe amagezi gange, Mu byonn(a) ebinnema;\n" +
               "Yesu, beeranga mu nze, \n" +
               "Mu byonna bye nkola,\n" +
               "Mbeere ng(a) endabirwamu, \n" +
               "Ndage (e)kitiibwa kyo.\n\nKa mbeere yekaalu yo, Omutali kibi,\n" +
               "Ekitiibwa kyo kyonna, \n" +
               "Nga kyeraga mu nze;\n" +
               "Eby’ensi ka mbiveko, Okuva kaakano,\n" +
               "Mbeere muddu wo ddala,\n" +
               "Nkole by’ondagira\n\nAyi Yesu, nze nzenna, \n" +
               "Ka mbeeranga wuwo,\n" +
               "Nkozesa by’oyagala, Sikyali ku bwange;\n" +
               "Bulijjo nettanira (O)kulu’ngamizibwa,\n" +
               "N’okulongoosebwa Gwe, \n" +
               "Mu mutima gwange\n\nNaye kannewombeeke, Mu bisera byonna,\n" +
               "Nga nnind(a) okuteesa kwo,\n" +
               "Gwe nga bw’oyagala;\n" +
               "Fug(a) obulamu bwange, Yesu Gwe Kabaka,\n" +
               "Gwe amagezi gange, Mu byonna bye nkola.'),"+
               "(148,'Mukama Onsembeze Gy’oli.…','Mukama onsembeze gy’oli,\n" +
               "Eyo gye njagala;\n" +
               "Okubera mu kifuba kyo,\n" +
               "Mpummulire mu Ggwe.\n\nChorus:\n" +
               "Nse - mbe-za n’okwagala,\n" +
               "O - ntu-se eyo gy’oli,\n" +
               "(Yesu nsembeza n’okwa-ga-la, Ntuuke, ontuuse eyo gy’oli)\n" +
               "O – nse – mbe - ze mu kifuba kyo.\n" +
               "(Nsembeza n’okwagala, Ontuse eyo gy’oli, Mbeere mu  kifuba kyo)\n\nYesu Mukama ntusa gy’oli,\n" +
               "Mbere wamu nawe,\n" +
               "Nga onkutte mu mukono gwo,\n" +
               "Mu ssany(u) ejjerere.\n\nOntwale n’amanyi g’Omwoyo,\n" +
               "Ndyoke nkufanane;\n" +
               "Nzukiza, nnaza, onnongose,\n" +
               "Nzigwemu ekibi.'),"+
               "(149,'Oyagala Obe wa Yesu Akulongoze?.…','Oyagal(a) obe wa Yesu akulongose?\n" +
               "Wetaag(a) ontambule Mu kkubo lye?\n" +
               "Oyagala yetikkenga Obuzibu bwo?\n" +
               "Mugany(e) akulu’ngamye!\n\nChorus:\n" +
               "Amaanyi ge ganakulongosa;\n" +
               "(O)musaayi gwe Gunakutukuza;\n" +
               "Bw’anakujjuza Okwagala kwe,\n" +
               "Onosanyuka Ng’akulu’ngamya!\n\nOyagala akutuuse Ku ddembe ddala?\n" +
               "Osobole okumugoberera?\n" +
               "Oyagala onywezebwe Mu mikono gye?\n" +
               "Mugany(e) akulu’ngamye!\n\nOyagala akutuuse Mu kiwummulo?\n" +
               "Oyagala obeer(e) omuwanguzi?\n" +
               "Era oleetenga bangi abakungulwa?\n" +
               "Mugany(e) akulu’ngamye!'),"+
               "(150,'Buli Kigambo Ekibi.…','Buli kigambo ekibi\n" +
               "mmwe temukyogeranga,\n" +
               "Ziyiza omutima gwo,\n" +
               "o~kuumeng(a) akamwa ko.\n\nChorus:\n" +
               "Mwagalane~nga Bw’agamba Ye~su\n" +
               "(Twagala-ne, Twagala-ne)\n" +
               "Tugondere etteeka ekkulu;\n" +
               "Mwagalane~nga Bwagamba Ye~su.\n" +
               "(Twagala-ne, Twagala-ne)\n" +
               "Tugondere etteeka lye.\n\nOkwagala kutukuvu,\n" +
               "Omukwano mulungi,\n" +
               "Empisa ey’obukyayi,\n" +
               "Ya~ Setaan(i) omulabe.\n\nEbigambo by’obusungu, \n" +
               "Ne bwebyogerw(a) empola;\n" +
               "Bizikiriza essanyu,\u000BMu~ nkolagana zaffe.'),"+
               "(151,'Annu’ngamya Kya Ssanyu.…','Annu’ngamya, kinsanyusa!\n" +
               "Kigambo kimpa~ amaanyi!\n" +
               "Buli kyenkola, gyembeera,\n" +
               "(O)mu~kono gwe~ gu~nu-ng’amya.\n\nChorus:\n" +
               "Annung’amya, annung’~amya,\n" +
               "(O)mukono gwe~gunnung’amya;\n" +
               "Ka mmwesige ngobere~re,\nKubanga Ye~ a~nnu-ng’amya.\n\nBwe mbeera mu nnaku ennyingi,\n" +
               " Oba bwembeera~ mu ssanyu,\n" +
               "Mu ddembe oba mu kabi,\n" +
               "(O)mu~kono  gwe~ gu~nu-ng’amya.\n\nMukama nnywez(a) omukono,\n" +
               "Sigenda kwemmu~lugunya;\n" +
               "Mbeera mumativu wonna,\n" +
               "Ku~banga Ggwe~  o~nu-ng’amya.\n\nMwendimala omulimu,\n" +
               "Mu kisa kyo nga~ mpangudde.\n" +
               "Okufa nze sirikutya,\n" +
               "Ku~banga Ggwe~ o~nu-ng’amya.'),"+
               "(152,'Ka Nkusemberere…','Ka nkusemberere (O)mulokozi!\n" +
               "Oba musaalaba, Ka~ ngwetikke!\n" +
               "Oluyimba lwange, Kusemberera Gwe.\nKa nkusemberere, (O)mu~lokozi.\n\n" +
               "Ng’emmomboze kunsi, Buwungedde," +
               "\nSirina wendabe Kiwummulo;\nOkusaba kwange, Ku kusemberera" +
               "\nKa nkusemberere, (O)mu~lokozi.\n\nOndag(e) ekkubo lyo, Mbere omwo,\n" +
               "Yonna gy’onoontwala, \n" +
               "Mp(a) e~kisa kyo;\n" +
               "Mu ntambula yange, Nkusembererenga,\nKa nkusemberere, (O)mu~lokozi.\n\n" +
               "Ku nkya nga nzuukuse, Nkuyimbire;\nMu bizibu byange, Nte~ndereze,\nNkusemberere nnyo, \n" +
               "Mu mbeer(a) ey’ennaku,\nKa nkusemberere, (O)mu~lokozi.\n\n" +
               "Bw’olijj(a) okuntwala, Eyo gy’oli.\nNdiyita mu bbanga, Nga~ nsanyuka," +
               "\nOluyimba lwange, Kukusemberera,\n" +
               "Ka nkusemberere, (O)mu~lokozi.'),"+
               "(153,'Kye Ndowooza " +
               "Kyokka…','Kye ndowoza~ kyokka,\n" +
               "Ge maka mu~ ggulu,\n" +
               "Neyongedd(e) o~kusembera,\n" +
               "Nnaate~r(a) okutuuka.\n\nChorus:\n" +
               "Ndi kumpi n’a~maka gaffe,\n" +
               "Kumpi nnyo, \n" +
               "ku~mpi nnyo leero;\n" +
               "Nnaate~r(a) okutuuka.\n\nNsemberedd(e) e~waffe,\n" +
               "Mu mayumb(a) a~mangi,\n" +
               "Eyo Yesu~ gy’afugira,\n" +
               "Ku nnya~nja ennungi.\n\nBwe ndituka~ eyo,\n" +
               "Ndyetikkula~ byonna,\n" +
               "Ennaku ndi~gyerabira,\n" +
               "Ndyamba~la engule'),"+
               "(154,'Netaga Omulokozi.…','Netaga Omulokozi,\n" +
               "Kuba nze ndi munafu;\n" +
               "Netaga okuba naye,\n" +
               "Ng’ankutte ku mukono.\n\nChorus:\n" +
               "Mu byonna nnagumanga,\n" +
               "Antwale gyayagala.\n" +
               "Nnaagenda semulugunya,\n" +
               "Bwenkulemberwa Yesu.\n\nNetaga Omulokozi\n" +
               "Siyinza kuwangula,\n" +
               "Wabula ye bw’ana’ngumya,\n" +
               "N’eddoboozi ly(e) eddungi.\n\nNetaga Omulokozi,\n" +
               "Mu kutambula kwange,\n" +
               "Mu buzibu bwange bwonna,\n" +
               "N’ebikemo by’omubi.\n\nNetaga Omulokozi,\n" +
               "Andagenga ekkubo.\n" +
               "Amponye mu ntalo zange,\n" +
               "N’okuwangula byonna.'),"+
               "(155,'Mu Lugendo Lwange Lwonna.…','Mu lugendo lwange lwonna\n" +
               "Yesu ankulembera;\n" +
               "Nyinza ntya (o)kubuusabuusa,\n" +
               "Ye bw’antwala bulijjo?\nByonna ebibeera mu nze\n" +
               "Tebiyinza kunnumya,\n" +
               "(Yesu ye Mukuumi wange,\n" +
               "Y’angabira (o)bulamu.) X2\n\nMu lugendo lwange lwonna,\n" +
               "Yesu ankulembera;\n" +
               "Abalab(e) abalinnumba\n" +
               "Ye alibawangula;\n\nMu lugendo lwange lwonna,\n" +
               "Yesu ankulembera;\n" +
               "Abalab(e) abalinnumba\n" +
               "Ye alibawangula;\nEnyonta ng(a) ennuma ennyo,\n" +
               "Ng’enkalamat(a) enzita,\n" +
               "(Oyo lwe Lwazi omuva,\n" +
               "Amazzi g’obulamu.) X2\n\nMu lugendo lwange lwonna,\n" +
               "Yesu onkulembera;\n" +
               "Ggwe Omulokozi wange.\n" +
               "Eyanfuul(a) omwana wo;\nKa nkutendereze bwentyo\n" +
               "(E)miremb(e) egitaggwawo,\n" +
               "(Nayimba n’essanyu lingi,\n" +
               "Ggwe Mununuzi wange.) X2'),"+
               "(156,'Katonda " +
               "Omutukuvu.…','Katonda omutukuvu, \n" +
               "Nu’ngamya nga ntambula!\n" +
               "Ndi munafu, \n" +
               "Ggwe olina Amaanyi ge netaaga;\nMpanirira, Nywereza nze\n" +
               "Mu mukon(o) ogw’amaanyi,\n" +
               "Mu muko~n(o) o~gw’amaanyi.\n\nGulaw(o) ensulo~ (e)y’amazzi,\nEtukuz(e) abaana bo,\n" +
               "Giggulire entukuze \n" +
               "okummalam(u) ekibi.\nGgwe empagi y’omuliro,\n" +
               "Beera engabo yange.\n" +
               "Beera e~nga~bo yange.\n\nBwe ndituuka ku~ mba~lama\n" +
               "Z’omugga Yoludani,\n" +
               "Okutya kwange~ ku~ggwewo,\n" +
               "Ontuuse mu~ Kanani!\nNeyonger(e), ennaku zonna,\n" +
               "(O)kukutenderezanga,\n" +
               "(O)kukute~nde~rezanga.'),"+
               "(157,'Kabaka Ali Ku Luggi.…','Kabaka ali ku luggi,\n" +
               "Eyafa ku lwa (a)bonoonyi,\n" +
               "Ajjidde mu kitiibwa kye,\n" +
               "Atutwale eka;\n\nChorus:\n" +
               "Ku luggi, Ku luggi;\n" +
               "Yesu ali kumpi ku luggi,\n" +
               "Yesu ajja, Tumulinde,\n" +
               "Ali kumpi ku luggi.\n\n(O)bubonero bw’okuddakwe,\n" +
               "Bulitukirira mangu nyo;\n" +
               "Mangu nnyo tulimulaba,\n" +
               "Lw’alidda n’amaanyi.\n\nTemunonya ssanyu lya nsi,\n" +
               "N’ekitiibwa n’emirembe.\n" +
               "Yesu yaggyawo ekibi,\n" +
               "Tuwummule mu Ye.\n\nNga tutuuse mu nsi empya,\n" +
               "Abatukuvu be bonna,\n" +
               "Tulitikkirwa engule\n" +
               "Mu maaso ga Yesu.'),"+
               "(158,'Kiseera Ki Ekisigadde?.…','Kiseera ki (e)kisi~gadde \n" +
               "Tutuke mu maka gaffe?\n" +
               "Ekiro kyonna ki~ggwawo \n" +
               "Enkya esembera.\nTotya naye dduka mangu \n" +
               "Laba emambya esala\n" +
               "Tunaatera oku~tuka \n" +
               "(E)kiro gye kitaba.\n\nMbuza mulwanyi mu~nange, \n" +
               "Naye nanziramu bwati,\n" +
               "“Gwe nyweza nnyo eki~tala \n" +
               "(O)lutalo terulwe.\nKale totya, naye guma, \n" +
               "Omal(e) omulimu gwonna;\n" +
               "Lab(a) olutalo bwe~ luggwa, \n" +
               "Tulifu(a) engule.”\n\nMbuuz(a) ebitond(e) eby’o~mu nsi,\n" +
               "Nebigambira wamu nti,\n" +
               "“Ebiro biri ku~mpi nyo, \n" +
               "Ensi empya ejje.”\nKale guma nnyo tokaaba, \n" +
               "Bingi biraga ebiro;\n" +
               "Buli kitonde ki~rinze \n" +
               "(O)kuvuga kwe’ngombe.”\n\nKiseera si kine~ne nnyo \n" +
               "(O)mutambuze asanyuke\n" +
               "Ennaku ze nga zi~wedde \n" +
               "(A)maziga gaggwewo.\nKale sanyuka nnyo nnyini, \n" +
               "Tuli kumpi okutuka,\n" +
               "Tube n’essanyu bu~lijjo \n" +
               "Mu nju ya Kitaffe.'),"+
               "(159,'Kya Ssanyu Omutambuze.…','Kya ssanyu omutambuze okuwulira\n" +
               "Ng’ali ewala mu malungu,\n" +
               "Nti “Omununuzi anaatera okujja,\n" +
               "Akutuuse mu ns(i) ensuubize”.\n\nChorus:\n" +
               "Alijja! Mmanyi~ nti Yesu ajja, - - -\n" +
               "Akomawo ku nsi kuno.\n" +
               "Naffe aba - - - na be - - - \n" +
               "Abakooy(e) ennyo,\n" +
               "Tulifuga~ ne Ye~su.\n\nEntana z’abantu baffe bonna abaafa,\n" +
               "Ziribikkuka zonna lumu;\n" +
               "Abantu be bonna abeebaka mu kufa,\n" +
               "Balivaayo mu ntaana zaabwe.\n\nTunabanga wamu fenna mu mirembe gye,\n" +
               "Nga tuyimba n’essanyu lingi;\n" +
               "Abanunule be baliva mu nsi yonna,\n" +
               "Okusinza Kabaka Yesu.\n\nAleruya, ye, wewawo, Aleruya nnyo!\n" +
               "Bwe tuba mu ye tulituuka;\n" +
               "Tunyikire okutuusa lw’alikomawo,\n" +
               "Tuweebw(e) engule z’obulamu.'),"+
               "(160,'Abatukuvu Mulabe.…','Abatukuvu mulabe\n" +
               "Eggulu nga likankana,\n" +
               "Ettabaaza zammwe zaake,\n" +
               "Mweteeketeeke Yes(u) ajja.\n\nChorus:\n" +
               "Alijja! Ye-su ajja! - - -\n" +
               "Ajja! Mu kitiibw(a) ekingi\n" +
               "Ng’Omuwanguzi afuge,\n" +
               "Alijja, Yesu ajja!- - -\n\nLaba ekisuubizo kye, \n(E)bibi byo byasonyiyibwa,\n" +
               "Olindiriddwa engule,\nYanguwa buulir(a) enjiri.\n\nObwakabaka buggwawo,\n" +
               "(O)bwakabaka bwe bwanguwa;\n(O)kubonaabona kukome,\n" +
               "Mwogere nti Yesu azze!\n\nAmawanga ganafuwa,\n(O)bwakabaka bwe bwanguwa;\n" +
               "(O)kubonaabona kukome,\n" +
               "Mwogere nti Yesu azze!\n\n(O)mwonoonyi Yes(u) akuyita,\nKakaan(o) akuwolereza;\n" +
               "Jjangu nga tebunayita,\u000BAyogera nti, “Kiwedde!”'),"+
               "(161,'Laya E’ngoma, Tegeeza Wonna…','Laya e’ngoma tegeeza wonna,\n" +
               "Yesu alijja mangu!\n" +
               "Musanyuke mmwe, abatambuze,\n" +
               "Yesu alijja mangu!\n\nChorus:\n" +
               "\n" +
               "Akomawo, akomawo,\n" +
               "Yes(u) akomawo nate!\n\nBunya kino mu mawanga gonna,\n" +
               "Yesu alijja mangu:\n" +
               "Ajja kujja mu kitiibwa kingi\n" +
               "Yesu alijja mangu.\n\nYimusa eddoboozi mu nsi zonna,\n" +
               "Yesu alijja mangu!\n" +
               "Entalo n’obusungu mu bantu,\n" +
               "Yesu alijja mangu.\n\n(A)magezi geyongedde mu bantu,\n" +
               "Yesu alijja mangu;\n" +
               "Enjala era n’ebikankano,\n" +
               "Yesu alijja mangu.\n\nEnjiri ebuna mangu mu nsi,\n" +
               "Yesu alijja mangu; \n" +
               "Ebyo byonna bitulaga ffe nti, Yesu ajja mangu nnyo.'),"+
               "(162,'Essuubi Lya Ssanyu…','Essuu~bi lya~ ssanyu\n" +
               "Lye tu~lina~ fenna,\n" +
               "Lisi~nga e~ssanyu~ ly’ensi,~\n" +
               "Eri~ggwaw(o)  a~mangu.\n\nTuli~n(a) emmu~nyeenye,\n" +
               "Emu~lisa~ wonna,\n" +
               "Ema~lawo~ enzi~kiza,~\n" +
               "Y’eki~bi n’e~ntaana. \n\n(E)ddoboo~zi we~ liri,\n" +
               "Lyoge~ra bu~lungi,\n" +
               "Nti “Ka~tonda~ akwa~gala,~\n" +
               "Totya~ gum(a) o~mwoyo.”\n\n(O)kuva~ Golo~gosa,\n" +
               "Evaa~y(o) eddo~boozi,\n" +
               "Eri~rangi~rira~ ggwe nti,~\n" +
               "“Aso~nyiy(e) e~bibi”.'),"+
               "(163,'Oba Ekiseera Kirituuka Ku Nkya…','Oba ekiseera kirituuka ku nkya - - -\n" +
               "Okumasamasa kwe ne kulabika; - - -\n" +
               "Yesu ng’ajja n’ekitiibwa ekinene\n" +
               "Okututwala e~wuwe.\n\nChorus:\n" +
               "Ayi Mukama, olijja ddi?\n" +
               "Tulab(e) amaaso go! \n" +
               "Yesu ajja, Aleruya,\n" +
               "Aleruya! Amina. Aleruya! Amina.\n\nBuliba mu ttuntu ob(a) eyo mu ttumbi, - - -\n" +
               "Tuliba tul(i) awo ng’ensi yonna, yonna; - - -\n" +
               "Effuuka omusana ogwaka ennyo,\n" +
               "Mukama ng’atuddu~kidde.\n\nBamalayika ne bayimba n’essanyu, - - -\n" +
               "Era n’abanunule be bonna wamu - - -\n" +
               "N’ekitiibwa kye ekyakayakan(a) ennyo,\n" +
               "Mukama bw’alijja~ bw’atyo.\n\nTuligenda  n’essanyu eteri kufa, - - -\n" +
               "Teri ndwade, teri  nnaku, teri ntisa; - - -\n" +
               "Tuliyita mu bire wamu ne Yesu,\n" +
               "Ng’atutwala ffe e~wuwe.'),"+
               "(164,'Olunaku Olulungi Lujja…','O~lunaku olulungi lujja,\n" +
               "Yesu lw’alijja;\n" +
               "O~kutwala abaana be fenna,\n" +
               "Mu maka gaffe.\n\nChorus:\n" +
               "(E)kitiibw(a) ekimasamasa\n" +
               "N’amanyi eby’ekitalo ennyo!\n" +
               "Birigoba enzikiza,\n" +
               "Entaana ziribikkuka.\n\nE~njiri ye egenda ebuna,\n" +
               "Mu buli ggwanga,\n" +
               "Ye~su alyoke ajje mangu nyo,\n" +
               "(E)ngombe ng’evuze\n\nA~najja ne bamalayika be,\n" +
               "Ng’amasamasa, \n" +
               "Ye~su ajja okututwala ffe,\n" +
               "Eteri kufa.\n\nA~bantu mu nsi bonna abaafa,\n" +
               "Tulibalaba,\n" +
               "E~ra (a)maziga gaffe gonna,\n" +
               "Agasangule.'),"+
               "(165,'Yesu Yasuubiza Abaana Be…','Yesu yasuubiza abakkiriza,\n" +
               "Nti “Ndikomawo ne mbatwala gyendi;\n" +
               "Mutunule nga munnindirira,\n" +
               "(O)kutuusa lwe ndijja, Mwe munyerenga”\n\nChorus:\n" +
               "“Mwe munywerenga,” Bweyasuubiza;\n" +
               "“Ndibawa eggulu n’ensi empya;\n" +
               "Era mulifuga wamu nange,\n" +
               " Muliweeb(a) engule,\n" +
               "Mwe munywerenga.”\n\nKatutunule nga tusabanga,\n" +
               "Alijja mu ssaawa etamanyiddwa;\n" +
               "Tumanyi nga ali kumpi ddala;\n" +
               "Olw’obubonero bweyatuw(a) edda.\n\nEssuubi  lyaffe mu kigambo kye -\n" +
               "Kwekukomawo kwa Yesu kuns(i) eno\n" +
               "Kyekisinga byonna obukulu,\n" +
               "Ffe ka tunywerenga, alijja mangu.'),"+
               "(166,'Tusanyunka Yesu Okujja…','Tusanyuke Yesu Ajja! Ens(i) emwanirize;\n" +
               "Buli~ o~mu~yetee~ge~ke~, \n" +
               "N’ebitonde byo~nna \n" +
               "E~by’eggulu n’ensi. Byo~nna~ bimu~tendereza”\n\nYesu ajja okufuga! Fenna tuyimbe nnyo;\n" +
               "Enso~zi~ n’e~migga~ byo~nna~,\n" +
               "Bimusanyuk~ire, \n" +
               "Bi~mutendere~ze;\n" +
               "Ka~ bi~yimbe~nga n’essanyu.\n\nYesu ajja (o)kulongosa \n" +
               "(E)bintu byona by’ensi!\n" +
               "(A)maggwa~ go~nna~ ag’e~ki~bi~,\n" +
               "Go tegalidda~yo, O~kuzisa e~nsi. \n" +
               "(E)ki~ko~limo~ kiriggwaawo.\n\nAjja (o)kuleeta eddembe! \n" +
               "Amawanga gonna;\n" +
               "Gali~ra~ba~ (e)kitii~bwa~ kye~,\n" +
               "Nga gatendere~za, E~ra gasanyu~ka.\n" +
               "O~kwa~gala~ kwe okungi.'),"+
               "(167,'Yesu Mukama Omulokozi .…','Yesu Mukama Omulokozi,\n" +
               " Yajja mu nsi okunoony(a) ababi;\n" +
               "Nga kwa kitalo okwagala kwe, \n" +
               "Yajj(a) okunoonya nze.\nYajj(a) okunoonya nze,\n" +
               " Yajj(a) okunoonya nze.\n" +
               "Nga kwa kitalo okwagala kwe,\n" +
               " Yajj(a) okunnonya nze.\n\nYesu Mukama Omulokozi, \n" +
               "Bwe nali mu nvuba ya Setani,\n" +
               "Yannunula n’omusayi gwe ye,\n" +
               " Yesu yanfiirira.\nYesu yanfiirira, \n" +
               "Yesu yanfiirira,\n" +
               "Yannunula n’omusaayi gwe ye, \n" +
               "Yesu yanfiirira.\n\nYesu Mukama Omulokozi, \n" +
               "Bwe nali nga nvudde mu kkubo lye,\n" +
               "Yankowoola n’okusasira kwe, \n" +
               "Yesu yampita nze,\nYesu yampita nze, \n" +
               "Yesu yampita nze,\n" +
               "Yankowoola n’okusaasira kwe, \n" +
               "Yesu yampita nze.\n\nYesu Mukama Omulokozi,\n" +
               " (E)kigambo kino kye kisanyusa,\n" +
               "Ndimulaba lw’alijja n’ebire,\n" +
               "Okuntwal(a) ewuwe.\nOkuntwal(a) ewuwe,\n" +
               " Okuntwal(a) ewuwe,\n" +
               "Ndimulaba lw’alijja n’ebire, \n" +
               "Okutwal(a) ewuwe.'),"+
               "(168,'Nga Bayita Amannya Gaffe.…','Bwe bafuw(a)  e’ngombe ya \n" +
               "Yesu ng’ajjira ku bire,\n" +
               "Ku lunaku olwo (O)lwe’kital(o) ennyo;\n" +
               "Abatukuvu abali mu nsi bwe baku’ngana,\n" +
               "Nga bayita amannya, nange ndibaawo!\n\nChorus:\n" +
               "[Nga bayi-t(a) amannya gaffe] x3\n" +
               "(Nga bayit(a) amannya gaffe mu ggulu) x2\n" +
               "Nga bayit(a) amannya ga-ffe\n" +
               "Nga bayit(a) amannya nange ndibawo.\n\nTuliraba abafu mu Kristo nga bazukira,\n" +
               "Baliweebw(a) ekitiibwa kya Katonda;\n" +
               "Abalonde bwe balikungaanira mu ggulu,\n" +
               "Nga bayita (a)mannya, nange ndibaawo.\n\nKa tukolere Mukama buli kisera kyonna,\n" +
               "Ka tubuulire abantu ku Yesu:\n" +
               "(O)mulimu gwe nga guwedde \n" +
               "nga azz(e) okutunona.\n" +
               "Nga bayita (a)manya nange ndibaawo.'),"+
               "(169,'Yesu Alikungaanya " +
               "Abantu.…','Yesu aliku’nganya aba~ntu,\n" +
               "(O)kulabika mu maaso ge;\n" +
               "Ffe tuliba tutya musa~ngo,\n" +
               "Bw’alituyit(a) okuwoza?\n\nChorus:\n" +
               "Aliteek(a) e’ngano mu ggwani~ka,\n" +
               "Alisuul(a) ebisu~su~nku;\n" +
               "Tu~liba tutya mu musa~ngo\n" +
               "Ku lunaku olukulu?\n\nTulimuwulira ng’aga~mba,\n" +
               "“Muddu omwesigwa weebale?”\n" +
               "Oba ffe tulitya n’obulu~mi,\n" +
               "Nga tugobwa mu maaso ge?\n\nAlisanyukira abaana~ be,\n" +
               "Ng’alaba be yanunula;\n" +
               "Alibambaza eby’omu ggu~lu,\n" +
               "Balifukamira w’ali.\n\nKa tutunule ffe twekume~nga,\n" +
               "Ettabaza nga zaaka nyo;\n" +
               "Awasa omugole bw’ali~jja,\n" +
               "Twetegeke okugenda.\n\nKa tulowooze eby’omu ggu~lu,\n" +
               "Tulindirir(e) ekiseera;\n" +
               "(O)lugendo lwaffe bwerulikoma,\n" +
               "Tulibeera mu maaso ge.'),"+
               "(170,'Sitwalibwa Bugagga.…','Sitwalibwa bugagga Oba feza zaabu,\n" +
               "Njagala bya mu ggulu N’okuuuka gy’oli;\n" +
               "Mu kitabo kyo Yesu Omuli amannya,\n" +
               "Mbuulirako, Mukama, Mulimu eryange?\n\nChorus:\n" +
               "Mu kitabo omwo,\n" +
               "omuli amannya,\n" +
               "Ontegeeze, Mukama, \n" +
               "mulimu eryange?\n\nEbibi byange bingi Binzitowerera,\n" +
               "Naye omusaayi gwo Tegulemwa kibi,\n" +
               "Yesu Gwe wansuubiza  Mu byawandiikibwa\n" +
               "Ebibi byaffe byonna, (O)kubifuul(a) ebyeru.\n\nMu kibuga kyo Yesu, kye wateekateeka\n" +
               "N’ekitiibwa ekingi Ekimasamasa,\n" +
               "Ekibi gye kitajja, Kwonoona baana bo, \n" +
               "Okuli abakuumi, Nange wampandiika?'),"+
               "(171,'Ekiseera Ky’omusango.…','Ekiseera (e)ky’omusango kituuse,\n" +
               "Ebitabo bibikkuddwa;\n" +
               "Tuliba tutya mu~ maaso ge,\n" +
               "Ka~tond(a) O~mulamuzi?\n\nChorus:\n" +
               "Tuliyimirira~ tutya?\n" +
               "Ku lunaku olu~kulu?\n" +
               "(A)wamu n’ebibi bya~ffe byonna, - - -\n" +
               "O~banga~ bisanguddwa?\n\nOmusango gwatandika n’abafu,\n" +
               "Naffe kati tukeberwa;\n" +
               "Ebitabo by’ok~jjukiza,\n" +
               "Bi~rike~berwa ddala.\n\nTuliba tutya mu kaseer(a) ako,\n" +
               "Ng(a) ebibi byaffe birabwa?\n" +
               "Omusanga nga gu~saliddwa,\n" +
               "Te~riba~ kujulira.\n\nOmusayi gwa Yesu gwe gunaaza,\n" +
               "Ebibi byaffe bingi nnyo;\n" +
               "Tetulina nsonga~ okutya,\n" +
               "Ye~ ng(a) atu~wolereza.'),"+
               "(172,'Ffe Twayibwa Ku Mbaga Ye..…','Ffe twayitibwa ku mbaga ye, Tutuule wamu n’abantu be,\n" +
               "Kale nno tulibeera tutya, Kabaka ng’azze?\n\nChorus:\n" +
               "Kale ow’o~luganda\n" +
               "Yesu~ lw’alijja\n" +
               "Olibeera ku ludda ki,\n" +
               "Kabaka ng’azze?\n\nNg’atikidd(e) engule ku \nmutwe N’ekitibw(a) oyo eyattibwa,\n" +
               "     Entiisa eribawo nnene,\n" +
               "Kabaka ng’azze.\n\nAlijja wamu n’okumyansa,\n" +
               "Byonna bye tukisa abantu;\n" +
               "   Birimanyibwa buli muntu,\n" +
               "Kabaka ng’azze.\n\nAlisanyukira ababe,\n" +
               "Abaliba mu ngoy(e) enjeru;\n" +
               "Tugume tuwangule byonna,\n" +
               "Kabaka ng’azze.\n\nMukama otuwe ekisa,\n" +
               "Fenna tukulindirirenga,\n" +
               "Tusanyuke okukulaba, Bw’onoba ng’ozze.'),"+
               "(173,'Tetumanyi ssawa.…','Tetumanyi ssaawa ya kudda kwa yesu:\n" +
               "Nay(e) obubonero bulaga etuuse!\n" +
               "    Yes(u) akomewo, nga bweyatusuubiza,\n" +
               "Tetumanyi ssaawa.\n\nChorus:\n" +
               "Alijja - Tutunule twetegeke: \n" +
               "Alijja - Aleruya Yesu ajja!\n" +
               "Alijja mu bire, mu kitiibw(a) eky’eggulu – \n" +
               "Tetumanyi ssaawa.\n\nFfe abaana be yatuwa omusana, \nOmusana ogwo guli mu kigambo;\n" +
               "    Obunabbi butulaga ali kumpi – \n" +
               "Tetumanyi ssaawa.\n\nKa tutunule twasenga ettabaaza, \n" +
               "Ka tukole nnyo nga tulind(a) okujja kwe;\n" +
               "     Tulisanyuka, tuyimbe olw’essanyu -\n" +
               "Tetumanyi ssaawa.\n'),"+
               "(174,'Tetumanyi Ssaawa Lw’alijja.…','Tetumanyi ssaawa lw’alijja,\n" +
               "    Mu ttuntu oba mu tumbi,\n" +
               "    Ku makya, oba kawungezi,\n" +
               "    Atugamba tutunule!\nTwetegekere okudda kwe,\n" +
               "    (E)ttabaza zaffe nga zaaka,\n" +
               "Lw’alidd(a) alyok(e) atusange ffe,\n" +
               "    Nga tumulindirira nnyo.\n\nChorus:\n" +
               "Nga tutunula, Nga, tumulinze,\n" +
               "Nga tutunula,\n" +
               " (Nga tutunula nga tulinda Ye) x3\n" +
               "Nga tulindirira Yesu.\n\nLowooza ekisa ky(e) ekingi,\n" +
               "    N’omuwendo gwe yawaayo;\n" +
               "    Yalek(a) ekitiibwa kye ggulu,\n" +
               "    N’ajja okufa ku lwaffe;\nNdowooza kimusanyusa nnyo,\n" +
               "    Ng’alaba beyanunula;\n" +
               "    Nga beetegeker(a) okudda kwe,\n" +
               "Nga balinda batunula.\n\nYesu omununuzi wange,\n" +
               "Omanyi nga nze nkwagala,\n" +
               "Era nsuubir(a) okukulaba,\n" +
               "Mpulire eddoboozi lyo;\nBw’olijja nga Omulamuzi,\n" +
               "Nga abamu bakudduka,\n" +
               "Nze ndikwaniriz(a) Omwagalwa,\n" +
               "N’essannyu mu ssaaawa eyo.'),"+
               "(175,'Omulokozi Ndimulaba.…','(O)mulokozi ndimulaba,\n" +
               "Ddala kiriba kitya!\n" +
               "    Bwe ndirabagana n’oyo, Yesu eyanfiirira?\n\nChorus:\n" +
               "Ndimulaba mu kitiibwa,\n" +
               " Bw’alijjira ku bire;\n" +
               "(A)maaso n’amaaso Mukama\n" +
               "Ndimulaba yennyini!\n\nSiyinza okumulaba \nOlw’enzikiza y’ensi,\n" +
               "     Naye olunaku lujja,\n" +
               "Ndabe ekitiibwa kye!\n\nTulijaguza nnyo nnyini, \n(E)nnaku nga ziweddewo;\n" +
               "    Ensobi nga zigoloddwa \nTulibeera mu ddembe.\n\nTuliba basanyufu nnyo,\n" +
               "Okumutunulako;\n" +
               "Yesu (O)mununuzi waffe,\n" +
               "Kri-sto atwagal(a) ennyo!'),"+
               "(176,'Mu Kibuga Kya Katonda.…','Mu kibuga kya Katonda,\n" +
               "Okuva mu ntebe ye,~\n" +
               "Waliw(o) omugga (o)mulungi\n" +
               "Oguleet(a) o~bula~mu.\n\nChorus:\n" +
               "Tuliku’ngana ku mugga\n" +
               "Ogwo gwetulisanyuki~ra-ko;\n" +
               "Fenna twagala~ okutuu - ka\n" +
               "Ku mugga gw’obula~mu.\n\nYesu omusumba waffe\n" +
               "Anatulung’amyanga,~\n" +
               "Mu ddundiro ly’okwesiima,\n" +
               "Kumpi n’omu~gga gu~li.\n\nNaye nga tetunatuuka\n" +
               "Awaal(i) omugga guli,~\n" +
               "Otutikkul(e) emigugu\n" +
               "Egy’ennak(u) e~nnying(i) e~nnyo.\n\nOlugendo lwaffe luno\n" +
               "Lwa nnaku si nnyingi nnyo,~\n" +
               "Ffe tetulirwa kutuuka\n" +
               "Okwetaba~ ne Ye~su.'),"+
               "(177,'Bwe Ndimala  Omulimu.…','Bwe ndimal(a) omulimu ku nsi,\n" +
               "Nentuuka gy’ali,\n" +
               "    Era nga nnyambadd(e) ogw(o) ogutafa;\n" +
               "    Ndi mutegeera Yesu, nga ntuuse emitala.\n" +
               "    Era n’essanyu alinnyaniriza.\n\nChorus:\n" +
               "Nze ndimu-tegeera Yesu,\nNga nnyimiridde ku~mpi naye;\nNze ndimu-tegeera Yesu,\n" +
               "Olw’enkovu z’emi~sumaali.\n\nBwe ndiraba ku maaso ge \n" +
               "ndibeera n’essanyu,\n" +
               "Ndimwebaza lw’ekisa ky’(e) ekingi;\n" +
               "Okusaasira kwa Katonda tekusingika,\n" +
               "    Atusanyiz(a) ebifo mu maka ge.\n\nBe twagala bwe batuvaako,\n" +
               "tulin(a) essuubi,\n" +
               "Nga tubasiibula tujjukira nti:\n" +
               "Mu ggulu tulibalaba, awatali kabi,\n" +
               "Okusooka netaaga ndabe Yesu.\n\nAmpe ekyambalo kye ekyeru ng’anyingiza,\n" +
               "   N’antuusa eyo etali kukaaba;\n" +
               " Gy’endibeera n’ennyimba\n" +
               "ez’essanyu bulijjo,\n" +
               "Negomba nsooke nsisinkane Yesu.'),"+
               "(178,'Bwe Mbeera" +
               " Ku Yoludaani.…','Bwe~ mbeera ku Yoludaani,\n" +
               "Nnengera n’essa~nyu;\n" +
               "Ka~naani yaffe ennungi,\n" +
               "Mu butaka~ bwa~ffe.\n\nChorus:" +
               "\n" +
               "Tuliwummula mu nsi ennungi, (ennungi),\n" +
               "Nga tuma-ze okusomo-ka~~(ensi),;\n" +
               "Tuyimb(e) o-luyimb(a) \n" +
               "olw’Omwana(gw’Endiga),\n" +
               "Tubeere naye bulijjo.\n\nE~mitala w’enseny(i) ezo,\n" +
               "Butangavu bwo~kka;\n" +
               "Bwe~ bwakabaka bwa Yesu,\n" +
               "Agoba e~ki~ro.\n\nNe~gomba okutuukayo,\n" +
               "Nsanyuke buli~jjo,\n" +
               "Ntu~nulenga ku Kitaffe,\n" +
               "Mu bwakaba~ka~ bwe.\n\nNni~na essanyu mu mwoyo,\n" +
               "Wano nze sirwee~wo,\n" +
               "Wa~dde ebizibu bingi,\n" +
               "Ka ng’ume ndi~ge~nda.'),"+
               "(179,'Nga Tumaze Omulimu.…','Nga tumaz(e) omulimu ku nsi,\n" +
               "(A)bakunguzi tuligenda;\n" +
               "Awamu n’ebikungulwa,\n" +
               "Mu kibuga ekiggya\n\nChorus:\n" +
               "(E)ssanyu~ eyo luberera,\n" +
               "(Essanyu~  luberera)\n" +
               "(E)ssanyu~ erita-liggwaawo,\n" +
               "(Essanyu~ teriggwaawo)\n" +
               "O-lu~naku lusembedde,\n" +
               "Tuku’nga-nire eka.\n\nTuliyimb(a) ennyimba nz’essanyu,\n" +
               "Nga tumwebaza mukama,\n" +
               "Kristo Yesu nga Kabaka,\n" +
               "Mu kibuga ekiggya.\n\nEssanyu lingi litulinze,\n" +
               "Mu nju ezakolwa zaabu\n" +
               "Yesu zeyateekateeka,\n" +
               "Mu kibuga ekiggya.'),"+
               "(180,'Waliwo Ensi " +
               "Ennungi Ennyo .…','Waliwo ensi ennungi nnyo\n" +
               "(O)lwokukkiriza tugiraba;\n" +
               "Mukama atulindiridde,\n" +
               "Okutusembeza ffe gy’ali.\n\nChorus:\n" +
               "Mu ssanyu jjereere,\n" +
               "Tulisisinkana mu ggulu,\n" +
               "Mu ssanyu jjereere,\n" +
               "Tulibeera n’omulokozi.\n\nMu nsi eyo tunaayimbaga:\n" +
               "Ennyimba z’essanyu eringi,\n" +
               "    Eyo tewaliba kukaaba, Tulibeera mu ddembe lyoka.\n\nEyo Kitaff(e) ow’omu ggulu, \n" +
               "Tunasuutang(a) obulungi bwe,\n" +
               "Olw’ekirabo kyokwagala,\n" +
               "Era n’emikisa gyatuwa.'),"+
               "(181,'Ndibeera " +
               " Ku Mugga.…','Ndibeera ku mugg(a) omulamu,\n" +
               "Ensul(o) ey’obuwa;\n" +
               "Eyo Yesu gy’atulinze ffe,\nOkutwaniriza.\n\nChorus:\n" +
               "Tulibeera ku mugga o-gwo,\n" +
               "Ogw’amazzi amala-mu;\n" +
               "[Tulibeera ku mugg(a) ogw’omuggulu, Ogw’amazzi agaw(a) obulamu]\n" +
               "Tubeere ku mugga o-gwo,\n" +
               "Ensul(o) ey’obulamu.\n" +
               "[Tulibeera ku mugg(a) ogwo bulijjo]\n\nAbakooye olw’olugendo.\n" +
               "Tuliwummulako;\n" +
               "Ku mazzi agamasamasa,\n" +
               "Agaleet(a) essanyu.\n\nYesu ge mazzi amalamu,\n" +
               "Nnywa oddem(u) amaanyi,\n" +
               "Jjang(u) ofune obulokozi,\n" +
               "Owon(e) ennyonta yo.'),"+
               "(182,'Munsi Y’abanunule.…','Mu nsi y’abanunule,\n" +
               "Yeri ekibuga;\n" +
               " Mukama kye yazimba,\n" +
               "Era teri kiro\n\nChorus:\n" +
               "Katond(a) alisangula,\n" +
               "(A)maziga gaffe gonna;\n" +
               "Teri nnaku na kufa~, Era teri kiro\n\nEmiryango gya luulu,\n" +
               "Mu kibuga ekyo;\n" +
               "(E)nguudo zonna za zaabu,\n" +
               "Era teri kiro.\n\n(E)nzigi teziggalwenga,\n" +
               "Mu kibuga ekyo; \n" +
               "(O)bulamu tebuggwaawo,\n" +
               "Era teri kiro.\n\n(E)njuba teyetaagibwa,\n" +
               "Mu kibuga ekyo;\n" +
               "Yesu musana gwakyo,\n" +
               "Era teri kiro.'),"+
               "(183,'Essanyu N’eddembe Tulifuuna.…','Essanyu n’eddembe tulifuna,\n" +
               "Essanyu n’eddembe tulifuna, \n" +
               "Essanyu n’eddembe tulifuna,\n" +
               "Yesu bw’alikomawo.\n\nChorus:\n" +
               "\n" +
               "Ng’azz(e) atutwa~l(e)ka,\n" +
               "A~baagalwa be fenna;\n" +
               "Tuliba mu ssanyu Yesu ng’azze, Okututwala eka.\n\nTewaliba nnaku Yesu ng’azze,\n" +
               "Tewaliba nnaku Yesu ng’azze,\n" +
               "Tewaliba nnaku Yesu ng’azze,\n" +
               "Okututwala eka.\n\nTeriba maziga mu nsi eyo,\n" +
               "Teriba maziga mu nsi eyo,\n" +
               "Teriba maziga mu nsi eyo,\n" +
               "Yesu bw’alikomawo;\n\nTuyimba nnyimba za kusuuta,\n" +
               "Tuyimba nnyimba za kusuuta,\n" +
               "Tuyimba nnyimba za kusuuta,\n" +
               "Yesu bw’alikomawo.'),"+
                       "(184,'Okwagala We Kuba…','Okwagala we kuba, tewaba nnaku;\n" +
               "Amaka ag’ekisa, gajjul(a) esanyu;\n" +
               "Buli wantu nga ddembe, mboozi empoomerevu\n" +
               "Liba ssanyu jjerere, Mu maka gaffe.\n\nChorus:" +
               "\n" +
               "(O)kwagala, mu maka;\n" +
               "Liba ssanyu jjerere\n" +
               "Mu maka gaffe.\n\nMu nju libeera ssanyu, Olw’okwagala;\n" +
               "Mu ggulu bsanyuka, Olw’okwaagala;\n" +
               "Wonna wonna mu nyumba,\n" +
               "Nga wajjudde essanyu,\n" +
               "(O)bulamu busanyusa,\nMu maka gaffe.\n\nNe Yesu asanyuka, \n" +
               "Nga twagalana;\n" +
               "Okukyawa n’obuggya, tebibeerawa,\n" +
               "Maka agagalana, \n" +
               "Gabeera ga muwendo;\n" +
               "Goolesa obulungi, \n" +
               "Obwa Kitaffe.\n\nYesu nfuula owuwo, Mbe n’okwagala;\n" +
               "Er(a) olwa saddaaka yo,\n" +
               "nfuula omuggya,\n" +
               "Ggwe omponye mu bubi,\n" +
               "Ompummulize mu Ggwe,\n" +
               "Ompe omukisa gwo, Mu maka gaffe'),"+
               "(185,'Ggwe Okwagala Okunene.…','Ggwe Okwagala Okusukkiridde;\n" +
               "Tufukamidde nga tukusaba;\n" +
               "Obaw(e) okwagal(a) okutakoma,\n" +
               "Abagole boogass(e) olwa leero.\n\nBaw(e) obulamu obutuukiridde, Obw’okwagala n’okukkiriza;\n" +
               "Bawe essuubi, Bagumiikirize,\n" +
               "N’obwesige Obutatya kabi.\n\nBaw(e) essanyu, Mu nnaku ey’ensi,\n" +
               "Baw(e) emirembe, \nMu buli mbeera; Enkya ennungi, Bagisuubirenga," +
               "\nNti lumu olidd(a) okubanona.'),"+
               "(186,'Mujje Nga Mweterereka.…','Mujje nga mweterereka\n" +
               "Mu maaso ga Yesu;\n" +
               "Okwagaala kwe kujjuze,\n" +
               "(E)myoyo gyammwe,\n\nWulira ggw(e) alindirira,\n" +
               "(O)mugolewo leero,\n" +
               "Mu kwagal(a) okutagwawo,\n" +
               "Mugattibwe.\n\nNaawe akkirirza wano,\n" +
               "Okumufumbirwa;\n" +
               "Laba Kitaffe awulira,\n" +
               "(o)bweyamo bwo!\n\nNammwe ababetooloodde,\n" +
               "Okubasabira;\n" +
               "Katonda waff(e) akakasa\n" +
               "(E)birayiro.\n\nMujje nga mweterereka:\n" +
               "Mukama waffe ajja,\n" +
               "Okutusembeza gy’ali,\n" +
               "Mugolewe.\n\nBwe mutyo mweterereke:\n" +
               "Abagira bonna,\n" +
               "Omwoyo omutukuvu,\n" +
               "Abasaba.'),"+
               "(187,'Bwe Tuba Ku Nsi Ne Bannaffee.…','Bwe tuba kunsi ne bannaffe\n" +
               "(E)kiseera kitono,\n" +
               "Tuba n’ennaku nyingi nnyo ffe,\n" +
               "Nga tubasiibula.\n\nChorus:\n" +
               "Teri kufa mu ggulu,\n" +
               "Teri kwawukana;\n" +
               "Mu nsi eyo ey’essanyu,\n" +
               "Tetulyawukana.\n\nEssuubi eryo nga ddungi nnyo Nga tubasiibula;\n" +
               "Bwe tujjukira essuubi nti,\n" +
               "tunaabanga nabo.\n\nTewaliba kusiibula,\n" +
               "Mu maka gaffe ago;\n" +
               "Naye liriba ssaanyu lyokka,\n" +
               "Emirembe gyonna.'),"+
               "(188,'Abebaka Mu Mukama.…','Abebaka mu Yesu; \n" +
               "Balizuukirir(a) essanyu;\n" +
               "Balibeera mu mirembe, \n" +
               "Okufa nga kuwanguddwa.\n\nAbeebakira mu Yesu!\n" +
               "Balizuukirir(a) essanyu;\n" +
               "(O)kuwummula kw’obwesige,\n" +
               "Mu ssuubi ery’omukisa.\n\nAbeebakira mu Yesu,\n" +
               "Balizuukuka mu ssanyu,\n" +
               "Telibakwatibwa ntiisa,\n" +
               "Ku kulabika kwa Yesu.\n\nAbeebakira mu Yesu,\nBanaater(a) okuzuukuka;\n" +
               "Ekkondeere nga livuze,\n" +
               "Balizuukir(a) obutafa.'),"+
               "(189,'Olw’ekisa  Kyo Nnengera.…','Ku musalana nnengera\n" +
               "(E)nsuulo y’obulamu:\n" +
               "Mukama Omulokozi\n" +
               "Ndab(e) ebiwundu ebyo.\n\nChorus:" +
               "\n" +
               "Mu mugga gw’obulokozi,\n" +
               "Ka nnabemu ntukuzibwe;\n" +
               "Yesu yebal(e) antukuzza\n" +
               "Antukuzza n’omusaayi.\n\nNze nfuuka kitonde kiggya,\n" +
               "Olw’omusaayi gwe;\n" +
               "Eby’edda byonna biggwawo,\n" +
               "Olw’amaanyi ge ye.\n\nKa ntambule mu maanyi ge,\n" +
               "Setani tannyinze;\n" +
               "Ebibi byonna bigenze,\n" +
               "Yesu andokole.\n\nOlw’omusaayi gwa Yesu,\n" +
               "Ensi tekyanfuga;\n" +
               "Yesu Mukama yamponya,\n" +
               "Oyo eyattibwa.'),"+
               "(190,'Tubatize Buggya.…','Tufukeeko (o)mwoyo\n" +
               "(o)mutukuvu\n" +
               "Ajje ku ffe leero\n" +
               "atuzze buggya.\n\nChorus:\n" +
               "Tukusaba, Yes(u), \n" +
               "emitima gyaffe;\n" +
               "O~gizze obuggya,  \n" +
               "- -Olw’ekisa kyo.\n\nFfen(a) abalina ebibi, tunaaze,\n" +
               "Tufuuke abantu abaggya leero\n\nJjangu Omwoyo Omutukuvu,\nKka ku ffe\n" +
               "nga bwe wakka \n" +
               "ku Mukama.\n\nKa tuwulire eddobozi lye,\n" +
               "“Ggwe mwana wange gwe\n" +
               "njagala ennyo.”.\nTukwebaza Ggwe,\nOmwana gw’Endiga,\nLee~ro tubatize,\n- - Buggya – Amiina\n'),"+
               "(191,'Ka Mpumulirenga Wano.…','Ka mpumulirenga wano,\n" +
               "Okumpi ne Yesu,\n" +
               "Ensonga lye’suubi lyange, Yesu yanfiirira.\n\nOmulokozi eyafa,\n" +
               "Ensulo ennaaza;\n" +
               "Okumalawo ekibi,\n" +
               "Nnaaza mu musaayi.\n\nNtukuza mbere owuwo,\n" +
               "Si bigere byokka;\n" +
               "Naye naaza n’emikono,\n" +
               "(O)mutwe n’omutima.\n\nSaddaaka y’omusaayi gwo,\n" +
               "Enoongoose nzenna;\n" +
               "Okuutusa lwe ndiraba,\n" +
               "Gwennakkiriz(a) Oyo.'),"+
               "(192,'Mmenyera Omugaati.…','Mmenyer(a) omugaati, Ayi Yesu," +
               "\nNga bwewakola ku lubalama;" +
               "\nMu byawandiikibwa Nkunoonya Gwe;" +
               "\nKigamb(o) omulamu, Nze nkwetaaga.\n\nW(a) amazima gano, Omukisa," +
               "\nNga bwewakola e Galiraaya;\nObusibe bwange Obukomye;\n" +
               "Obeere byonna mu byonna gyendi." +
               "\nEbigambo byo Yesu, Bwe bulamu,\nNjagal(a) okugonda naye nnemwa;" +
               "\nGwe buyambi bwange, N’obulamu;\nBweng’onder(a) ekigambo mpangula.\n'),"+
               "(193,'Olwazi Olw’edda N’edda.…','(O)lwazi lw’edda n’edda Ggwe,\n" +
               "Olwanjatikiriza nze;\n" +
               "Omwo mwe nekweka nze,\n" +
               "(O)musaayi mwe gwava,\n" +
               "Ebibi binziyeeko, Nfuula omuwanguzi.\n\nEmirimu gy’engalo,\n" +
               "N’okufuba kw’omuntu,\n" +
               "N’amazig(a) agajj(a) ennyo,\n" +
               "Emisana n’ekiro;\n" +
               "Byo tebiggyawo bibi,\n" +
               "Ggwe wekka (O)mulokozi.\n\nSirina nze bulungi,\n" +
               "Nkwesize Ggwe bwesizi;\n" +
               "Omweerere nyambaza,\n" +
               "Omunaku mp(a) ekisa;\n" +
               "Laba bwendi omubi, \n" +
               "Onaaze, nkuwerezze\n\nBwendituka mu ggulu,\n" +
               "nga nina ebibala;\n" +
               "Bwe ndiraba Ggwe Yesu,\n" +
               "Ne nsanyukila w’oli,\n" +
               "Ndibeera nga siyinza, \n" +
               "Okwegulumizanga.'),"+
               "(194,'Wulira Omusumba.…','Wulira Omusumba,\n" +
               "Ayita endig(a) eziri;\n" +
               "Mu ddungu ly’ekizikiza,\n" +
               "Gye zawabira obw’edda.\n\nChorus:\n" +
               " Gendayo (o)zireete,\n" +
               "Oziggye~ mu ns(i) ey’ekibi;\n" +
               "\tGendayo (o)zireete,\n" +
               "Mu kisi~bo kya Ye-su.\n\nAnaamubeera ye ani, \n" +
               "Okunoonya ezibuze,\n" +
               "Okuzizza mu kisibo,\n" +
               "Mwe zibera obulungi?\n\nZikaabira mu malungu,\n" +
               "Era ne ku nsozi zonna\n" +
               "Mukama ye akugamba,\n" +
               "“Ggwe, noonya endiga zange.”'),"+
               "(195,'Omusingi Gw’Ekkanisa…','(O)musingi gw’ekkanisa, \nYe Yesu Mukama:\n" +
               "Kye kitonde ky(e) ekiggya,\nMu mazzi n’Enjiri;\nYe yamuggya mu ggulu," +
               "\nEb(e) Omugole we;\n(O)musaayi gwagigula," +
               "\nYafa ebe nnamu\n\nEri mu buli ggwanga," +
               "\nNaye eri emu;\nMukama, (o)kukkiriza,\n(o)kubatiza kumu;\n" +
               "(E)rinnya limu lyesinza,\nEry emmer(e) emu,\nErina essubi limu,\nOkudda kwa Yesu.\n\nNewankubadd(e) enyoomwa," +
               "\nEra n’esaasirwa;\nAbalabe baayo ne bwebanagiyuuza;\n" +
               "Abakkiriza bayo, \n" +
               "Tebajjulukuke;\nEr(a) obudde tebuulwe,\nBayimb(e) olw’essanyu\n" +
               "\nMu kubonaabon(a) ennyo,\nMu kufuba kwayo;\n" +
               "Essubir(a) emirembe,\nEgy’olubeerera;\n" +
               "(O)kutuusa lweriraba Ekyasuubizibwa," +
               "\nOlw(o) erib(a) ewangudde,\nEr(a) eriwummula.'),"+
               "(196,'Bwalijja Mukama Waffe.…','Bwalijja Mukama waffe,\n" +
               "Okutwala gy’ali; \n" +
               "Abaamulindiliranga,\n" +
               "Abamwagala.\n\nChorus:\n" +
               "Ng’emmunyenye ez’omu bbanga,\n" +
               "Bwe~ zaaka waggulu,\n" +
               "N’abo bwe balibeera, \n" +
               "Abagalwa be.\n\nAliku’nganyiza w’ali,\n" +
               "Abaana be bonna,\n" +
               "Abanyikira nnyo wano,\n" +
               "(O)kumufaanana.\n\nAbakopi n’abakulu,\n" +
               "Abagala Yesu;\n" +
               "Baliweebw(a)\n" +
               "empeera yaabwe,\n" +
               "Bw’alikomawo.\n\nAbaana abamwagala,\n" +
               "Alibalokola;\n" +
               "Ng(a) amayinj(a) ag’omuwendo omungi ennyo.'),"+
               "(197,'Ai Katonda Atutuusizza.…','Ayi Katond(a) atutuusizza," +
               "\nKu lunaku olw’essanyu;" +
               "\nKkiriz(a) okwebaza kwaffe,\nWamu n’oku~saba kwaffe.\n\n" +
               "Tukugulumiza leero,\nOlw’ennyumba eno empya;" +
               "\nTulungamizenga muno,\nMu kkub(o) eri~tuuka gy’oli.\n\n" +
               "Abaazimb(a) ekkanis(a) eno,\nObaweng(a) emikisa gyo,\nBonn(a) abakulu n’abato," +
               " \nBamanye o~kwagala kwo.\n\nKatulab(e) ekitiibwa kyo,\nMu yekaalu y(o) entukuvu;\n" +
               "Kubang(a) obulungi bwayo,\nTebugasa~ nga toliimu.\n\n" +
               "Bwetukung’anirangamu,\n" +
               "Netukuw(a) emyoyo gyaffe;\n" +
               "(O)buyinza bw’amazima go,\nBwerag(e) er(a) o~tuwulire.\n\n" +
               "(E)kitiibwa ky(o) ekitaggwawo,\nKibenga mu Kanisa yo;\nEkulember(e) abantu bo,\n" +
               "Okubatuu~sa mu ggulu'),"+
               "(198,'Waliwo Omusaayi Ogw’amaanyi.…','Oyagal(a) osonyiyibw(e) ebibi?" +
               "\nMu musaayi gwe, Mwonaazibwa;" +
               "\nOyagal(a) owangule ekibi?" +
               "\nOmusaayi gwe gumala.\n\n" +
               "Chorus:\n" +
               "Waliw(o) omusaay(i) ogw‘amaanyi,\nOguva mu Yesu," +
               "\nWaliw(o) omusaay(i) ogw‘amaanyi\nGwa muwendo mungi nnyo.\n\n" +
               "Oyagal(a) ove mu by’amalala?\nMu musaayi gwe, Mwonaazibwa;" +
               "\nGenda ku musaalab(a) onaazibwe,\nOmusaayi gwe gumala\n\n" +
               "(O)kutukul(a) okusing(a) omuzira,\nMu musaayi gwe, Mwonaazibwa;" +
               "\nGusangul(a) amalala g’ekibi,\nOmusaayi gwe gumala.\n\n" +
               "Oyagal(a) owereze Mukama?\n" +
               "Mu musaayi gwe, Mwonaazibwa;\n" +
               "Oyimbe nga bw’otenda Mukama?\nOmusaayi gwe gumala.'),"+
               "(199,'Tukola Lwa Kwagala.…','Tukola lwa kwagala,\n" +
               "Kutuwa amaanyi.\n" +
               "Kutuw(a) ekisa ekingi\n" +
               "Er(i) abantu bonna\n\nChorus:\n" +
               " Wakisa, era yatuzaala;\n" +
               "Mwagazi, Tumufanane;\n" +
               "Tukola lwa kwagala, kutuwa amaanyi,\n" +
               "Kutuwa ekis(a) ekingi,\n" +
               "Er(i) abantu bonna.\n\nEnsi ejjudde (e)nnaku, \n" +
               "Endwadde n’ekibi;\n" +
               "Olw’okwagala tufuba,\n" +
               "Kulw(a) abantu bonna.\n\nEmitima gijjule\n" +
               "Essanyu bulijjo;\n" +
               "Bwe tubeera n’okwagala\n" +
               "(O)musana gwe gwaka\n\nBwe tulituuka eri\n" +
               "Ewaffe mu ggulu;\n" +
               "Enyimba zaffe ziriba,\n" +
               "Ku kisa kya Yesu.'),"+
               "(200,'Nsanyukira Ekigambo Kino.…','Nsanyukira ekigambo kino;\n" +
               "Yesu Mukama atwagala nnyo,\n" +
               "Birimu bingi ebisanyusa,\n" +
               "Eky(o) ekisinga nti,“Nze nkwagala.”\n\nChorus:" +
               "\n" +
               "Anjagala, Ye anjagala;\n" +
               "Kya kitalo (O)kunjagala!\n" +
               "Anjagala, olw’ekisa kye,\n" +
               "Nang(e) era mwagala.\n\nBwemba nnyonona ne mwerabira,\n" +
               "Yesu tandeka kubula ddala;\n" +
               "Ampita mangu okumweyuna Ye\n" +
               "Er(a) anjijukiz(a) Okwagala kwe.\n\nBwe nditunuulir(a) ekitiibwa kye,\n" +
               "Ndiyimba ntya bwe siyimba bwentyo?\n" +
               "Nnyimba emirembe n’emirembe;\n" +
               "Yesu kiki ekyakunjagaza nze?\n\nAnjagala era mmwagala Ye,\n" +
               "Yakka mu ns(i)\n" +
               "olw’okutufiirira;\n" +
               "(O)kwagala kwamuleeta\n" +
               "Ku muti,\n" +
               "Yesu atwagala ffe bwagazi.')";

       String secondBancht = "INSERT INTO ennyimba VALUES (201,'Katonda Afaayo.…','Ba n’essuubi~ mu mutima," +
               "\nKatonda afaayo~;\nAkuwamba~tira leero,\n" +
               "Katonda afaayo.\n\nChorus:\n" +
               "Katonda afaayo,\nYonna, yonna, gy’onogenda;\n" +
               "Afaayo nnyo~ gyoli, - - -\nKatonda a~ - -faayo. [afaayo]\n\n" +
               "Mu bizibu~ byonn(a) ebyensi,\nKatonda afaayo~;" +
               "\nMu bintu byo~nn(a) eby’entiisa,\nKatonda afaayo.\n\n" +
               "Byewetaaga~ (a)nabikuwa,\nKatonda afaayo~;" +
               "\nAddamu bo~nn(a) abasaba,\nKatonda afaayo.\n\n" +
               "Mu bikemo~ eby’entisa,\nKatonda afaayo~;\n" +
               "Wesige ye~ yekka totya,\nKatonda afaayo.'),"+
               "(202,'Tunaatera Okutuuka Eka.…','Leka tuyimbe oluyimba(a) olw’essanyu," +
               "\nTunatera(a) okutuuka eka,\n(E)kiro kiggwewo \n" +
               "(o)musana gwake wonna,\nTunaater(a) okutuuka eka.\n\n" +
               "Chorus:\n" +
               "Tuli kumpi nyo, Tuli kumpi nnyo,\nOkusomok(a) ens(i) eno;" +
               "\nTusisinkane ng’ebizibu bikomye,nTunaater(a) okutuuka eka.\n\n" +
               "Tulikol(a) emirimu nga tusanyuka,\nTunaater(a) okutuuka eka." +
               "\nTulinywezebwa ekisa kya Katonda," +
               "\nTunaater(a) okutuuka eka.\n\n" +
               "Tuyambe bonna abakooye mu kkubo,\n" +
               "Tunaater(a) okutuuka eka.\nTubalage okwagala kwa Katonda, \nTunaater(a) okutuuka eka.\n\n" +
               "Tuliwona ebizibu eby’ens(i) eno," +
               "\nTunaater(a) okutuuka eka.\nTeriba maziga mu kibuga ekyo, \nTunaater(a) okutuuka eka.'),"+
               "(203,'Noonya Obubonero.…','Noony(a) Obubonero ng’otambula,\nNoony(a) obubonero buve kumu;" +
               "\nOkuva ku bwakabak(a) obuna,\nTuli luddawa? - - - Noonya olabe.\n" +
               "Chorus:\n" +
               "Noonyerez(a) obubonero bw’obunnabbi," +
               "\nOkuva ku bwakabak(a) obuna;\nNoonyerez(a) obubonero bw’obunnabbi,\nTuli kumpi n’eka.\n\n" +
               "Okusook(a) Abasuuli baafuga;\n(A)bameedi n’Abaperusi nabo;\n(A)bayonaani n’abo ne bafuga, \n" +
               "Ruumi neddako - - - Tuli ludda wa?\n\n" +
               "Ebigere (e)by’ekyuma n’ebbumba,\nBinafu binater(a) okuggwaawo;\nKiki ekinaddirira ku nsi?\nKudda kwa Yesu,\n" +
               "- - N’ens(i) eteggwaawo.'),"+
               "(204,'Okuva Lweyajja Mu Nze.…\n','Nga nafun(a) Okukyusibwa \n" +
               "mu bulamu,\nOkuva lweyajja mu nze!" +
               "\nNin(a) ekitangaala kyendudde" +
               "\nnga nnoonya,\nOkuva lweyajja mu nze.\n\n" +
               "Chorus:\n" +
               "Yesu yajja mu mutima -[gwange]\n" +
               "Nzijudd(e) essanyu lingi mu mwoyo gwange;\nOkuva lwe yajja munze\n\n" +
               "Nakoma okubulubuuta mu ns(i) eno;\nOkuva lwe yajja munze," +
               "\nN’ebibi byange byonna byasangulibwa;\nOkuva lwe yajja munze.\n\n" +
               "Nnin(a) essuub(i) eddamu ery’olubeerera;" +
               "\nOkuva lwe yajja munze,\nSirina kubuusabuusa kwonna munze" +
               "\nOkuva lwe yajja munze.\n\n" +
               "Nnin(a) essuub(i) okub(a) \nOmulamu nate;\nOkuva lwe yajja munze," +
               "\nEra nnengera emiryango gye ggulu;\nOkuva lwe yajja munze.\n'),"+
               "(205,'Mumutende Yesu Omununuzi.…','Mumutende Yes(u) Omununuzi waffe!" +
               "\nMuyimbe ku kwagala kw(e) okungi\nMumutende bamalayika mu ggulu\n" +
               "Erinnya lye liweebwe ekitiibwa!\nNg’Omusu~mba, anakuum(a) abaana be" +
               "\nMu mikono gye abasitule.\n\nChorus:\n" +
               "Mumutende!\nOw’ekitiibwa asinga;\n" +
               "Mumutende!\nN’ennyimb(a) ez’essanyu.\n\n" +
               "Mumutende Yes(u) Omununuzi waffe!\nOlw’ebibi byaffe yajeezebwa\n" +
               "Ye lwe Lwazzi, (e)ssuubi ery’obulokozi" +
               "\nMumusuute eyakomerwerwa Yimba ku~ Ye!" +
               "\nYetikk(a) ennaku zaffe\nWa kwagala (o)kung(i) okwewuunyisa\n\n" +
               "Mumutende Yes(u) Omununuzi waffe! Ab’omuggulu mumuyimbire!\n" +
               "Yes(u) afuga emirembe n’emirembe" +
               "\nNga Kabaka atikkirwe engule!" +
               "\nKristo a~jja mubuwanguzi kunsi" +
               "\nObuyinzza n’ekitiibwa bibye.'),"+
               "(206,'Baibuli Ebikkulirwe Ensi.…','Baibul(i) ebikkulirw(e) ensi!" +
               "\nKyekigendererwa kyaffe!\nAmazima gabikkulwe," +
               "\nGasaasaanye emikisa.\n\nChorus:\n" +
               "Kigambo kye – (Kya mukisa)\nKibunyise – (Musana gwe)\nKu lukalu ne ku nnyanja~" +
               "\nAbali mu kizikiza~\nKibazze eri Katonda.\n\n" +
               "Wonna Baibuli wetuuka- -\nEyas(a) omusana gwayo;" +
               "\nEgoba ekizikiza,\nN’amaany(i) ag’ekibi gonna.\n\n" +
               "Erag(a) abantu Kitaffe - -\nOy(o) ajjudde okwagala;" +
               "\nAboonoonyi mu Adamu,\nEbaw(a) essuubi mu Yesu\n\n" +
               "Etegeeza ebya Yesu, " +
               "\n- - Eyaf(a) atuw(e) obulamu;" +
               "\nEra bonn(a) abakkiriza," +
               "\nBaba baana ba Katonda.'),"+
               "(207,'Okumpi Ne Katonda.…','Waliwo ekiwummulo " +
               "\n- (O)kumpi ne Katonda" +
               "\nEkibi wekitatuuka\n- (O)kumpi ne Katonda.\n\n" +
               "Chorus:\n" +
               "Yesu Omununuzi,\n(O)kuv(a) ewa Katonda," +
               "\nTunyweze ff(e) abalinze,\n(O)kumpi ne Katonda.\n\n" +
               "Waliw(o) ekif(o) ekirungi\n- (O)kumpi ne Katonda.\nWetusisinkana Yesu\n- (O)kumpi ne Katonda.\n\n" +
               "Tusumululirwa awo\n- (O)kumpi ne Katonda.\nWe wal(i) essanyu n’eddembe\n- (O)kumpi ne Katonda\n'),"+
               "(208,'Mbe Wuwo Nzenna…','Kyensaba Yesu mbeere wuwo," +
               "\nNnung’amya, nnung’amya;\nNkole by’osiima so si byange\nNkusab(a) onnyambe\n\nChorus:\n" +
               "\n" +
               "Mbe wuwo (Yesu), Mbe wuwo (Yesu);" +
               "\nEkyo nze kyenkusaba,\nMbe wuwo (Yesu), Mbe wuwo (Yesu);" +
               "\nMbe wuwo nzenna Yesu.\n\n" +
               "Eby’ensi byonna bigasa ki,\nWotali, wotali?\nOlw’erinnya lyo ka mbireke,\nGwe byonna gyendi.\n\n" +
               "Ng’amasanyu g’ensi ngaleka,\nNsembeza, nsembeza;\nBwemba w’oli mba nninna byonna,\n" +
               "Yes(u) onsembeze'),"+
               "(209,'Nga Ntuuse Eka…','Ndyambal(a) engule ya zaabu mu ggulu;\nNditikkulw(a) omugugu \n" +
               "nga ntuus(e) eka;\nNdyambazibw(a) ebyeru," +
               "\nNdiyimb(a) oluyimba\nOlw’obulokozi Nga ntuus(e) eka\n\n" +
               "Ekizikiza kyonna kiriggwawo \nNdirab(a) ekitangala nga ntuuse eka,\n(O)musana gw’e ggulu,\n" +
               "gummulise wonna\nGunkulembere nze ntuuke eka.\n\n" +
               "Ndirab(a) amaaso ga Yesu nga ntuuse\nNnyimbe ku kisakye ekyandokola\nNnyimirire waali, \n" +
               "Mu ssanyu mmusinze\nEmirembe gyonna – nga ntuus(e) eka.'),"+
               "(210,'Abakunguzi " +
               "Banaava Wa?…','Abakunguzi bali ludda wa,\n" +
               "Baggye abantu mu ns(i) ey’ekibi?\n" +
               "N’ekigambo kye ekya mazima,\n" +
               "(O)kutuus(a) omulimu nga guwedde.\nChorus:\n" +
               "Abakunguzi banaava wa?\n" +
               "Abanaakola mu ssany(u) eringi?\n" +
               "Abaneewayo, tukungaanye,\n" +
               "Abantu be bave mu ns(i) embi?\n\nMu banoonye mu makubo gonna;\n" +
               "Mulimu ababulidde omwo;\n" +
               "Munoonye wonna mu buli kifo,\n" +
               "Muleete bonna olw’ensi empya.\n\nEnnimiro wonna zengedde nnyo,\n" +
               "Ensi erinze amakungula;\n" +
               "Naye abakozi batono nnyo,\n" +
               "Tunafiirwa bingi bwe tulwawo.\n\nMujje mw(e) abantu be n’ebiwabyo,\n" +
               "Tukungulire wam(u) abantu be;\n" +
               "Tugumiikiriz(e) omulimu,\n" +
               "Tukungulire mu ssany(u) eringi.'),"+
               "(211,'Eyazaawa " +
               "Azaawuse…\n','Mukub(e) ennanga munsi ne mu ggulu,\n" +
               "Omwan(a) eyazaawa azaawuse;\n" +
               "Laba Katonda nga amwaniriza,\n" +
               "Mu ssanyu ng’amusisinkana\n\nChorus:\n" +
               "Bamalayika bayimbe nnyo\n" +
               "Mu kitiibw(a) ennanga zivuge\n" +
               "Eggye ly’abanunul(e) nga tuyimba\n(O)luyimba lw’Omwana gw’Endiga.\n\n" +
               "Mukub(e) ennanga munsi ne mu ggulu,\n" +
               "Eyazaawa asonyiyiddwa;\n" +
               "Anunuliddwa mu ns(i) en(o) ey’ekibi,\n" +
               "Lab(a) azaaliddwa buggya nate.\n\nMukub(e) ennanga munsi ne mu ggulu,\n" +
               "Eyazaawa asonyiyiddwa;\n" +
               "Anunuliddwa mu ns(i) en(o) ey’ekibi,\n" +
               "Lab(a) azaaliddwa buggya nate.'),"+
               "(212,'Engoye Enjeru…','Tulitambula naye, \n" +
               "Mu nsi ey’omu~sana,\n" +
               "Ekiro gyekitayingira; Omusana bulijjo\n" +
               "(O)gwakir(a) abanu~nule,\nKye kitiibwa ky’Omulokozi.\n\nChorus:\n" +
               "((E)ngo – ye (e)njeru -)x2\n" +
               "[Ngoy(e) enjeru x4]\n" +
               "Tulyambala ngoy(e) enjeru\n" +
               "((E)ngo – ye (e)njeru –) x2\n" +
               "[Za kitiibwa x2 Zeyagaza x2]\n" +
               "Tuliyita ne Yesu, Nga twambadde e-byeru\n\n" +
               "Tulitambula naye,\n" +
               "Tulabe ens(i) e~nnungi,\n" +
               "Tulabe Kabaka w’eggulu,\n" +
               "Tulinyumya ne Yesu.\n" +
               "Mbozi empome~revu,\n" +
               "Tuyimbe ennyimb(a) ez’essanyu.\n\nTulitambula naye,\n" +
               "Ku mugg(a) ogw’obu~lamu\n" +
               "Nga Yesu atukulembedde,\n" +
               "Ngatunaaziddw(a) ebibi\n" +
               "Tutukulidde~ ddala; Tuliba babe lubeerera" +
               "'),"+
               "(213,'Mu Ggulu…','Ba malayika bayimba,\n" +
               "N’obwengula bwanuku~la;\n" +
               "(A)mawulire galeetebwa -\n" +
               "Tuli mu ggulu!\n\nChorus:\n" +
               "Mu ggulu, Mu ggulu;\n" +
               "Kya ssany(u) okutuuka ffe mu ggulu;~\n" +
               "Mu ggulu, Mu ggulu;\n" +
               "(E)kitiibw(a) ekitakoma, Mu ggulu\n\n" +
               "Ku miryango gya yasipa,\n" +
               "Ng(a) abatambuz(e) abatuu~se;\n" +
               "Omusana gweyongera -\n" +
               "Tutuuse eka!\n\n(A)malobooz(i) ag’eggonjebwa,\n" +
               "N’akaloosa akawo~nya;\n" +
               "Wulir(a) ennyimb(a) ez’essanyu -\n" +
               "Tutuuse eka!\n\nTeri kutonyesa zziga, \n" +
               "Teri ssanyu liggwere~ra;\n" +
               "Tuliyimba nnyimba zokka, -\n" +
               "Tutuuse eka!\n\nYesu bwe bulungi bwayo,\n" +
               "Kye kitangaal(a) ekiwoo~mu;\n" +
               "Tusuut(e) Omwana gw’Endiga -\n" +
               "Tutuuse eka!'),"+
               "(214,'Ndimulaba " +
               "Kabaka…','Ndimulaba Kabaka mu ggulu,\n" +
               "Lumu nze ndimulaba\n" +
               "Nga ayimbirwa bamalayika\n" +
               "Mu nsi esinga eno.\n\nChorus:\n" +
               "Ndimulaba, Mu kitiibwa kye\n" +
               "Mbe bulijjo, nga ntendereza;\n" +
               "Eyanfiirira, ku musalaba\n" +
               "Ndimulaba Ka - - - baka.\n\nMu ns(i) ey’ennyimba,\n" +
               "Ey’ekitiibwa, Eteri kizikiza;\n" +
               "Ndifugir(a) eyo, wamu ne Yesu,\n" +
               "Eyafa ku lwange nze.\n\nNdimulaba n’amaaso Kabaka,\n" +
               "Nze ndimutendereza;\n" +
               "Ndiyimba ku kwagal(a) okwamussa,\n" +
               "Ekisa kye kimala.'),"+
               "(215,'Ekisa Ekyewuunyisa…','(E)kisa kya Yesu kyewuunyisa,\n" +
               "Kisinga nnyo ekibi kyaffe;\n" +
               "Kyalagibwa ku musaalaba,\n" +
               "Omusaayi gwe gye gwayiika.\n\n" +
               "Chorus:\n" +
               "E – ki – sa – kye, \nKingi ddal(a) era kitukuza,\n[Kyewunyisa, Tekikoma]\n" +
               "E – ki – sa – kye,\n" +
               "Kisonyiya ekibi kyaffe.\n" +
               "[Kyewunyisa, Tekikoma]\n\nEkibi n’okuggwam(u) essuubi,\n" +
               "Bitiisa nnyo emyoyo gyaffe;\n" +
               "Ekisa ekitagambika,\n" +
               "Kitulaga omusalaba\n\nTetuyinza kukisa bbala,\n" +
               "Kik(i) ekiyinz(a) okulyozaawo?\n" +
               "Laba ensul(o) ey’omusaayi,\n" +
               "Oyinz(a) okutukula leero.\n\nEkisa ekitenkanika,\n" +
               "Kya bwereere er(i) akkiriza;\n" +
               "Mwe abaagal(a) okumulaba,\n" +
               "Mwetag(a) ekisaky(e) olwa leero?'),"+
               "(216,'Muzaalibwe " +
               "Buggya…\n','Nikodemu ya~jja eri Yesu,\n" +
               "Namubuuz(a) ekkubo ly’obulokozi;\n" +
               "Yamuddamu, “O~kulokolebwa,\n" +
               "Ggwe zaalibwa buggya!”\n\nChorus:" +
               "\n" +
               "(Muzaalibwe~ buggya) x2 \n" +
               "Ddala ddala mbagamba kino kyokka,\n" +
               "Mu - - - zaalibwe buggya.\n\nAbantu mwenna~ mukiwulire,\n" +
               "Ekigambo Yesu kyeyayogera;\n" +
               "Temugaya o~bubak(a) obwo\n" +
               "Muzaalibwe buggya.\n\nBwoba onooyingi~r(a) ekiwummulo,\n" +
               "Oyimb(o) oluyimba lw’abanunule;\n" +
               "Ng’oyagala obu~lam(u) obutaggwawo\n" +
               "Gwe zaalibwa buggya.'),"+
               "(217,'Tunula Obe " +
               "Mulamu…','Tunula ku musalab(a) owone\n" +
               "Yes(u) agamba, “Ntunuulira!”\n" +
               "(O)bugagga bw’ensi bwo temuli\n" +
               "Ndab(e) obugagga mu musalaba.\n\n" +
               "Chorus:\n" +
               "Tunul(a) o – be mulamu\n" +
               "Tunul(a) e – Gologoosa\n" +
               "(O)bulokozi bwa buwa\n" +
               "Tunul(a) e – Gologooza. \n" +
               "In a look there’s life for thee,\n\nBwennatunuulir(a) Omulokozi,\n" +
               "N’alab(a) akamwenyumwenyu,\n" +
               "(E)bizibu bw’ebijja nga bingi;\n" +
               "Nfuuna amaanyi mu musalaba.\n\nKa ngutunuulirenga bulijjo,\n" +
               "Nga nneesig(a) ekisuubizo;\n" +
               "Nti tewali aliwangulwa,\n" +
               "Eyeesiga amaanyi g’eggulu.'),"+
               "(218,'Nnyigiriza Okutuuka…','Nnyigiriza okutuuka,\n" +
               "Ku ntikko y’okukkiriza\n" +
               "Nga nsaba ng’ende mu maaso,\n" +
               "Mukama ntuusa mu ggulu.\n\nChorus:\n" +
               "(O)Nsitula onnyimirize,\n" +
               "Mu kibug(a) eky’omuggulu;\n" +
               "Kyenjagala ekisinga,\n" +
               "Mukam(a) ontuuse mu ggulu.\n\nSeegomba kubeera wano,\n" +
               "(O)kubuusabuusa n’okutya;\n" +
               "Wadd(e) abamu bali mu byo,\n" +
               "Mukama ntuusa mu ggulu.\n\nNjagala mbere mu ggulu,\n" +
               "Wadde Setaan(i) anwanyisa;\n" +
               "Mpulidde ennyimb(a) ennungi,\n" +
               "Ng’abo’mu ggulu bayimba.\n\nNdubirir(a) okutuuk(a) eyo,\n" +
               "Mu kwakaayakan(a) okungi;\n" +
               "Nze kye nsaba ontuus(e) eyo,\n" +
               "Mukama ntuusa mu ggulu.'),"+
               "(219,'Mu Mikono " +
               "Gye Yesu…','Mu mikono gye Ye~su, ne mu kifuba kye,\n" +
               "Nfuun(a) emirembe mi~ngi,\n" +
               "E~ra n’empummula;\n" +
               "Nga bamalayika be, Bayimba n’essanyu,~\n" +
               "Ku nnimiro n’ennyanja, ebimasamasa.~\n\nChorus:" +
               "\n" +
               "Mu mikono gye Ye~su,\n" +
               "Ne mu kifuba kye;\n" +
               "Nfun(a) emirembe mi~ngi,\n" +
               "E~ra n’empummula.\n\nMu mikono gya Ye~su,\n" +
               "Mwemponer(a) okufa;\n" +
               "Nebikemo by’omu~ nsi,Mbi~wonera ddala,\n" +
               "Ekibi tekinnyinza, N’okunakuwala;~\n" +
               "Okunnumya omwoyo (E)bigezo n’okutya.~\n\nYesu ggw(e) eyanfiiri~ra, Kiddukiro kyange,\n" +
               "Nyweredde kuggwe Ye~su,\n" +
               "E~ra nga nkwesiga;\n" +
               "Ka n’gumirenga byonna, Ekiro kiyita,~\n" +
               "Obudde lwebulikya, Lwe tulisomoka.~'),"+
               "(220,'Ba Mukisa.…','Wulir(a) ebigambo bya Yesu,\n" +
               "Bya bulamu bya mazima;\n" +
               "Gw(e) ataty(a), atasaba,Wulira leero,\n" +
               "Ba mukis(a) abakwata ebyo.\n\nChorus:\n" +
               "Ba mukis(a) abakwat(a) amateeka,\n" +
               "Ba mukisa~ Ba mukisa;\n" +
               "Ba mukis(a) abakwat(a) amateeka,\n" +
               "Ba mukisa, Nga besiimye!\n\nOkuwulira nga tokola,\n" +
               "(E)bisuubizo bye tofuna;\n" +
               "Okubiwulira kyokka tekiyamba,\n" +
               "Ba mukis(a) abakola ebyo\n\nBaliyingira mu kibuga,\n" +
               "Teri kibi teri nnaku;\n" +
               "Nga batukuziddw(a)\n" +
               " emirembe gyonna,\n" +
               "Balye ku muti (o)gw’obulamu.'),"+
               "(221,'Mmanyi Gwenakkiriza…','Simanyi lwa~ki~ Katonda\n" +
               "Yanjagala~ bwa~tyo,\n" +
               "Nz(e) omubi a~ta~sanira\n" +
               "Nangu-la mbe~ wu~we\n\nChorus:" +
               "\n" +
               "Nze mmany(i) oyo, Gwennakkiriza,\n" +
               "Era mmanyi nti afaayo gyendi,\n" +
               "Akuuma byeyasuubiza;\n" +
               "Okutuusa lwalidda.\n\nSimanyi lwa~ki~ yampa nze\n" +
               "(E)kis(a) ekindo~ko~la,\n" +
               "(O)kukkiriz(a) e~ki~gambo kye, \n" +
               "Kwampa emi~re~mbe.\n\nSimanyi (O)mwo~yo~ bwakola\n" +
               "Ng’alung’amy(a) a~ba~ntu,\n" +
               "Nga babikku~li~ra Yesu,\n" +
               "Nebamukki~ri~za.\n\nSimanyi bi~nni~ndiridde -\n" +
               "Bib(i) oba bi~ru~ngi;\n" +
               "(O)luvannyuma~ lw’okukoowa,\n" +
               "Ndirab(a) amaa~so~ ge.\nSimanyi Ye~su~ lwalidda,\n" +
               "Kir(o) o~ba mi~sana,\n" +
               "Katambule na~ye wano\n" +
               "Era ne mu~ns(i) e~mpya.'),"+
               "(222,'Ka Ng’ambe Yesu…','Kang’ambe Yesu, \n" +
               "(E)bikemo byonna,\n" +
               "(O)mugugu siguyinze nzekka;\n" +
               "Mu bizibu byange anannyamba,\n" +
               "Alabirira abantu be.\n\nChorus:" +
               "\n" +
               "Ka ng’ambe Yesu, Ka ng’ambe Yesu;\n" +
               "(O)mugugu si guyinze nzekka\n" +
               "Ka ng’ambe Yesu, Ka ng’ambe Yesu\n" +
               "Yesu y’annyamba – Yesu yekka!\n\nKa ng’ambe Yesu, Emitawaana;\n" +
               "Mukama musaasiz(i) afaayo,\n" +
               "Bwe mmutegeeza anandokola,\n" +
               "Emitawaana, agikomye.\n\nEnsi ensikiriza n’ebibi,\n" +
               "Nkemebwa mu mwoy(o) okwonoona;\n" +
               "Kangambe Yesu, Ddal(a) anannyamba,\n" +
               "Mbeere muwanguzi, w’ens(i) eno.'),"+
               "(223,'Mukama Omuyaga Mungi.…','Mukam(a) omuyaga mungi! \n" +
               "Gukunta nnyo ku nnyanja!\n" +
               "Ekizikiza kunsi kingi\n" +
               " sirina kiddukiro, \nTofayo nga tufa ffena, \n" +
               "Lwaki gwe webase?\n" +
               "Twelalikiridde ennyanj(a) eno,\n" +
               "Eyinz(a) okutumira.\n\nChorus:\n" +
               "Temutya mayengo na muyaga –  \n" +
               "mu - - gume!\n" +
               "Ennyanja nebwenesiikuka, \n" +
               "Ba dayimon(i) oba bantu wadde kiki!\n" +
               "Ennyanja teyinza kusanyawo, \n" +
               "Ekyombo Mukama ng’ali mukyo.\n“Byonna nze binfukamirira, \n" +
               " Mugume, mugume;\n" +
               "Bigonder(a) eddoboozi lyange,\n" +
               "mmwe temutya\n\nMukama nze nzize wooli n’obuyinike bungi;\n" +
               "Omutima gwange gukooye zuukuka ondokole;\nEbibi binnakuwazza,\n" +
               "Bigenda kunzita\n" +
               "Omulokozi wange Mukama\n" +
               "Gwe wekka ggwe nneesiga;\n\nMukama entiis(a) egenze n’ennyanja yonna nteefu,\n" +
               "Lab(a) enjuba yange etuuse, \n" +
               "n’ens(i) etangadde yonna, \nMununuzzi beera nange,\n" +
               "Era tonvangako\n" +
               "Mu ssanyu ndituuka emitala,\n" +
               "Mu makaago ggulu.'),"+
               "(224,'Obwesigwa Bwo Bungi.…','(O)bwesigwa bwo bungi,\nAyi Kitaffe;" +
               "\nGwe tokyukakyuka lubeerera," +
               "\nOkusaasirakwo tekuliremwa;" +
               "\nGwe waliwo era olibawo\n\n" +
               "Chorus:\n" +
               "(O)bwesigwa bwo bungi,\n" +
               "(O)bwesigwa bwo bungi,\n" +
               "Buli lukya ndaba ekisa kyo;\n" +
               "(O)mukono gwo gumpadde byenetaaga\n(O)bwesigwa bwo bungi gyendi Yesu.\n\n" +
               "(O)musana n’enkuba,\nn’amakungula;" +
               "\nEnjuba, omwezi n’emmunyeenye," +
               "\nBikuwaako byona obujulirwa" +
               "\nKu bwesigwa kwo n’okwagala kwo\n\n" +
               "Onsonyiw(a) ebibi,\nomp(a) emirembe;\n" +
               "Obaaw(o) onsanyusa onnung’amya,\n" +
               "Omp(a) amaanyi leero,\nn’essuub(i) ery’enkya;\n(E)mikisa gyo gyange, n’abalala.'),"+
               "(225,'Lya kitiibwa Erinnya Lyo.…','(O)mulokozi tukusinza,\nTubuulir(a) e~kisa kyo;" +
               "\nGwe (O)wamaanyi (O)mutukuvu," +
               "\nLya kitiibw(a) e~rinnya lyo.\n\nChorus:\n" +
               "Lya ~------ ki—tiibwa x2\nLya kitiibw(a) e~rinnya lyo \n" +
               "[Lya kitiibw(a) erinnya lyo] x2 \n" +
               "Lya ~------ ki—tiibwa x2\nLya kitiibw(a) e~rinnya lyo\n" +
               " [Lya kitiibw(a) erinnya lyo] x2\n\n" +
               "(O)mununuz(i) era Mukama,\n(O)musan(a) ogu~takoma;" +
               "\n(A)batukuvu mu nsi zonna,\nBayimbe ng(a) e~ttendo lyo.\n\n" +
               "Walek(a) entebe mu ggulu,\nN’ojja ku mu~saalaba;" +
               "\nN’ofa nga ssaddaaka yaffe,\n(A)bonoonyi tu~be babo.\n\n" +
               "Jjang(u) Omulokoz(i) atafa,\nOtuule ku ~ntebe yo;\nOfug(e) emirembe gyonna,\nObwakaba~ka bubwo.'),"+
               "(226,'Mukama Omulokozi.…','Yesu ye Mulokoz(i) ow’ekitalo,\n" +
               "(O)mulokoz(i) eyewuunyisa;\n" +
               "Akwek(a) obulamu bwange mu lwazi,\n" +
               "Mwendab(a) emigg(a) egy’essanyu.\n\nChorus:\n" +
               "Akwek(a) obulamu bwange mu Lwazi;\n" +
               "(E)kisiikirize mu ddungu,\n" +
               "Ankweka mu kwagala kwe okungi\n" +
               "(N’ankuuma n’omukono gwe.) x2\n\nYesu ye mulokoz(i) ow’ekitalo,\n" +
               "Aggyaw(o) omugugu gwange;\n" +
               "Ampanirira n’esinyenyezebwa,\n" +
               "Ampa amaanyi bulijjo.\n\nAmpa emikisa buli kiseera,\n" +
               "Anzijuz(a) ekitibwa kye;\n" +
               "Ndiyimba nga nzuukidde \n" +
               "Mu kitiibwa,\n" +
               "Ku Mununuz(i) omwagalwa.\n\nBwendyambazidwa obutukuvu bwe,\n" +
               "Mmusisinkane ku bire,\n" +
               "Ndiyimba n’abanunule abangi,\n" +
               "Ku bulokoz(i) obw’ekisa.'),"+
               "(227,'Twala Obulamu Bwange.…','Twal(a) obu~la~mu bwange,\n" +
               "Obutu~ku~ze bwo~nna;\n" +
               "Twal(a) emiko~no gyange~,\n" +
               "Gikozese byo~ya~gala,\n" +
               "Gikole byo~yagala.\n\nTwal(a) ebi~ge~re byange,\n" +
               "Bitambu~le~ ku lu~lwo;\n" +
               "Twal(a) eddoboo~zi lyange~,\n" +
               "Likuyimbire~ Ka~baka,\n" +
               "Likuyimbi~re wekka!\n\nTwala na~ka~mwa kange,\n" +
               "Kajjuz(e) o~bu~baka bwo;\n" +
               "(E)bintu byange~ (e)by’omunsi~,\n" +
               "Bikozese by’o~ya~gala,\n" +
               "Bikole byo~yagala.\n\nTwal(a) ebyo~bye~njagala,\n" +
               "Byonna bi~fuu~ke bi~byo,\n" +
               "Twal(a) omuti~ma gwange~,\n" +
               "Ogufuule e~nte~be yo,\n" +
               "Entebe kwo~fugira.\n\nTwal(a) okwa~ga~la kwange,\n" +
               "Kwonna ku~bee~re kukwo;\n" +
               "Ntwala nzenna~ mbe wuwo~,\n" +
               "Emiremb(e) egi~ta~ggwawo;\n" +
               "(E)miremb(e) egi~takoma.'),"+
               "(228,'Anoonya N’ekisa.…','Ayita n’ekisa, abaabula;\n" +
               "Abawabira ku busozi;\n" +
               "“Mujje gy’endi,” \n" +
               "bwatyo bw’abayita,\n" +
               "N’olwa leero Yesu ayita.\n\n" +
               "Chorus:\n" +
               "Gend(a) e wa la ku nso – zi zo - nna zo -  nna;\n" +
               "[GEND(A) EWA LA KU NSO ~ ZI ZO - NNA]\n" +
               "Ko mya wo a\tba\t\twa ba\t\tbo nna\tbo\tnna;\n" +
               "[KOMYAWO A \t\tBA WA BA~\t\tBO\tNNA]\n" +
               "Mu ki si bo\t\tky’O \t\tmu\tlo ko\tzi\twa\t\tffe;\n" +
               "[MU\tKI\tSI\tBO\t\t\tKY’OMU~\tLO\tKO\t\t-\tZI]\n" +
               "Ye\tsu\te\tya\t\tfa\t\tku\t\tlw’a bo\tnoo nyi.\n" +
               "[YES(U)E\tYA\tFA\t\t\tKU LWABOO~ NOO NYI.]\n\n" +
               "Gend(a) obanoonye, Balage Yesu;\n" +
               "Abalwadde n’abanafuye;\n" +
               "Baleete eri obulokozi,\n" +
               "Mu bulamu obutaggwaawo.\n\n" +
               "Kang’ende eri Yesu ampise,\n" +
               "Mmugobere-re-nga bulijjo;\n" +
               "Nnyambe abanafu n’abagudde,\n" +
               "Mbalage Yesu Ye ly’ekkubo.'),"+
               "(229,'Nnaagenga " +
               "Gy’oyagala…','Ku nsozi ennungi ennyo,\n" +
               "Oba ku nnyanja embi ennyo,\n" +
               "Oba mu ntalo ez’amaanyi,\n" +
               "Wonna w’onjagaliza;\nBwe mpulira ng~ Gwe ompita,\n" +
               "Mu kkubo lye si~manyi,\n" +
               "Bw’ononkwata ku mukono~ gwange,\n" +
               "Nagenda gy’oyagala\n\nChorus:\n" +
               "Nagenda gy’oyagala, Mukama;\n" +
               "Ku nsozi; oba ku~ nnyanja;\n" +
               "Nayongeranga Gwe by’oya~gala,\n" +
               "Nze – Nnaabeera ky’oyagala.\n\n" +
               "Oba waliwo ebigambo, \n" +
               "By’oyagala njogere,\n" +
               "Oba waliw(o) ali mu kibi,\n" +
               "Gw’oyagala nkomyewo;\nNga Ggwe mukule~mbeze wange,\n" +
               "Ekkubo wadde~ nga bbi;\n" +
               "(O)bubaka bwo nze nnaabwoge~ranga,\n" +
               "Njogere ky’oyagala.\n\nOba waliw(o) ekifo kyonna\n" +
               "Mu nnimiro zo, Yesu,\n" +
               "Mw’oyagala nze nkukolere,\n" +
               "Ggw(e) eyakomererwa;\nNga nesiga o~bukuumi bwo,\n" +
               "Kubanga onja~gala,\n" +
               "Nka nkukolere nga ndi mwe~sigwa,\n" +
               "Mbeere nga bw’oyagala.'),"+
               "(230,'Yogera Nange Yesu…','Yogera nange Yesu mu ddobooz(i) eddungi,\n" +
               "Mpulire ng’ong’amba nti, \n" +
               "“Guma toli wekka.”\n" +
               "Nnongoosa omutima mpulir(e) eddoboozi,\n" +
               "Nyimbeng(a) amatendo go,\n" +
               "Nsanyukire mu Ggwe.\n\nChorus:\n" +
               "Ontegeeze n’ekisa, Mu kisa ky(o) ondage\n" +
               "Nti mu Gggwe ndiwangula, Ndifuna eddembe,\n" +
               "Ontegeeze kakano, Mu kisa kyo (e)kingi;\n" +
               "Mpulire bw’ong’amba nti\n" +
               "“Guma toli wekka”\n\nTegeez(a) ababo bonna\n" +
               "Balag(e) ekkubo lyo;\n" +
               "Obajjuz(e) essanyu lyo Bayig(e) okusaba.\n" +
               "Bawengay(o) obulamu \n" +
               "Bwabwe bonna gy’oli\n" +
               "Bakol(e) omulimu gwo (O)kutuusa lw’olijja\n\nMukama mbikkulira \n" +
               "Nga banabbi (a)b’edda\n" +
               "Kye nsana okukola Ntuuse (a)mateeka go;\n" +
               "Ka nkugulumizenga, Nate ka nnyimbenga,\n" +
               "Nkolenga by’oyagala, Nkutenderezenga.'),"+
               "(231,'Kristo Oba Balabba…','Nakola ntya Yes(u) ono, \n" +
               "(O)mulokozi wange?\n" +
               "Ayambadde (e)fulungu \n" +
               "N’engule (e)y’amaggwa?\n\nChorus:\n" +
               "(E)kibuuzo kye kino, \n" +
               "(E)ky’okuddamu kiki:\n" +
               "Nkomerere Yesu Kri-sto, \n" +
               "Balabba ateebwe?\n\nNnalek(a) omubb(i) agende,\n" +
               "Omunt(u) ow’ekibi?\n" +
               "Oba Krist(o) Oyo Yesu, \n" +
               "atalina kibi?\n\nKibuuzo nga kikulu! \n" +
               "Kizibu nnyo ddala!\n" +
               "Ekisakye nga kingi,\n" +
               "Nzenna kinkankanya!\n\n(E)nkomerero ng’etuuse \nEns(i) ery’egaan(a) etya?\n" +
               "(E)bigambo nti,\n" +
               "“Twala eri, Twal(a) okomerere!”\n\n(O)mukristayo wulira, \n" +
               "era n’omwonoonyi,\n" +
               "Ekibuuz(o) eky’entiisa, \n" +
               "onokiddam(u) otya?'),"+
               "(232,'Netaaga Okuwulira…','Netaaga okuwulira Ku by’obulokozi~;\n" +
               "Nnyongere okubimanya \n" +
               "(E)bigambo bya Yesu;\n" +
               "Bye biga~mbo ddala Eby’obu~loko~zi.\n\nChorus:\n" +
               "(E)bigambo byo birungi nnyo, Eby’obulokozi~;\n" +
               "(E)bigambo byo birungi nnyo,\n" +
               "Eby’obulokozi.\n\nMukama yekka atuwa\n" +
               "(E)bigambo by’essanyu~;\n" +
               "Ebireeta omwonoonyi, Eri obulamu;\n" +
               "Mukama~ by’atuwa Bitutu~se gya-li.\n\nEbigambo bya Mukama,\n" +
               "Mwe mul(i) obulamu~;\n" +
               "Era bituwa eddembe, \n" +
               "N’amaanyi g’omwoyo;\n" +
               "Ebibi bi~gwawo, Mu linya~ lya Ye-su.'),"+
               "(233,'Nkwagala, Nkwagala…','Nkwagala, nkwagala, nkwa~gala Yesu,\n" +
               "Mulokozi wange, Ka~tonda wange;\n" +
               "Obanga nkwagala, kino (o)kimanyi!\n" +
               "Ebikolwa byange, bi~naakakasa.\n\nNsanyuka, nsanyuka, nga~ kyakitalo!\n" +
               "Nnengera, nnengera, e~nsi ennungi;\n" +
               "Njagal(a) okubeera (a)wamu ne Yesu,\n" +
               "Era n’okulaba ba~malayika.\n\nMulokozi wange, O~mpadd(e) essanyu;\n" +
               "(O)bulamu, kuwummula~ n’emirembe,\n" +
               "Kwagalakwo kungi, nnaakwebazanga,\n" +
               "(E)kisakyo kinsanyusa~ omutima\n\nAni afaanana Ye~su Kabaka,\n" +
               "Gwennayimbangako e~nnaku zonna?\n" +
               "Kammutenderereze, muyimbire nnyo,\n" +
               "Kubanga njijudde e~ssanyu lingi.'),"+
               "(234,'Mu Ssanyu N’okukwebaza…','Mu ssanyu n’okumwebaza,\n" +
               "Nyimus(a) eddoboozi lyange;\n" +
               "Nnaayimba ntya okwagala \n" +
               "Kwa Yesu okw’ekitalo.\n\nChorus:\n" +
               "Kwagala kwo, kwa kitalo,\n" +
               "Okwagala kwo Ye-su,\n" +
               "Kwagala kwo, kwa kitalo,\n" +
               "Okwagala kwo Ye-su\n\nEmisan(a) era n’ekiro, \n" +
               "Mu muyaga, Mu nzikiza;\n" +
               "Mu bulumi, mu bunafu,\n" +
               "Nnaayimbang(a) okwagala kwo.\n\nBwenasabang(a) onsonyiwe,\n" +
               "Bwenagwanga onsitule;\n" +
               "Mu bulamu ne mu kufa,\n" +
               "Nnaayimbang(a) okwagala kwo.'),"+
               "(235,'Nsembeza, Nsembeza…','Yesu omugabo gwange, \n" +
               "obulamu bwange nze\n" +
               "Mu lugendo lwange lwonna,\n" +
               "Ka ntambulenga naawe.\nNsembeza, Nsembeza, \n" +
               "Nsembeza, Nsembeza\n" +
               "Mu lugendo lwange lwonna, \n" +
               "ka ntambulenga naawe\n\nAmasanyu g’ensi eno, \n" +
               "n’ebitiibwa saagala\n" +
               "Nebwenabonabonanga,\n" +
               "Kantambulenga naawe.\nNsembeza, Nsembeza,\n" +
               "Nsembeza, Nsembeza;\n" +
               "Nebwenabonabonanga,\n" +
               "Kantambulenga naawe.\n\nYesu onkulemberenga,\n" +
               "Mu muyengo gw’ensi eno,\n" +
               "Onzigulire oluggi,\n" +
               "lw’obulam(u) obutaggwawo.\nNsembeza, Nsembeza, \n" +
               "Nsembeza, Nsembeza;\n" +
               "Nebwenabonabonanga,\n" +
               "Kantambulenga naawe.'),"+
               "(236,'Ettabaaza Zammwe Zaake…','Ttabaaza zammwe zaake nnyo,\n" +
               "E~kiro kisembedde;\n" +
               "Eky’enzikiz(a) ekutt(e) ennyo,\n" +
               "Ye~su nga akomawo.\n\nChorus:" +
               "\n" +
               "Twetegek(e) ab’oluganda,\n" +
               "Ttabaaza zaffe zijjule;\n" +
               "Mu~kama waffe wuuy(o) ajja,\n" +
               "Tu~koleez(e) ettabaaza.\n\nWadde bangi tebafaayo,\n" +
               "Ku~ bya kudda kwa Yesu;\n" +
               "Okudda kwe kukakafu,\n" +
               "E~ryo ly’essuubi lyaffe.\n\n(A)mazima g’ekigambo kye,\n" +
               "Ye~ttabaaza gye tuli;\n" +
               "Ne bwetwetoloolw(a) akabi,\n" +
               "Ye~su abeera naffe.\n\n(O)kukkiriza n’ebikolwa,\n" +
               "Bi~rabikenga mu ffe;\n" +
               "Ggwe kkiriz(a) ekigambo kye,\n" +
               "Ye~su abeere naawe.'),"+
               "(237,'Tulina Obubaka…','Tulin(a) obubak(a) er(i) amawanga,\n" +
               "Obunakyus(a) emitima,\n" +
               "Obw’amazima n’e~kisa,\n" +
               "Bwaddembe bwa musana~~\n" +
               "Bwa mirembe bwa ssuubi.\n\nChorus:\n" +
               "Enkya ennungi ejja kunsi,\n" +
               "Omusana gweyongere,\n" +
               "(O)bwakabaka bwa Yesu bujje,\n" +
               "Obw’essanyu ne ddembe.\n\nTulin(a) oluyimb(a) er(i) amawanga,\n" +
               "(O)lubasitul(a) emitima;\n" +
               "Oluwangula e~kibi,\n" +
               "Olunagyaw(o) entalo,~~\n" +
               "Olunagyaw(o) entalo.\n\nTulin(a) Obubak(a) er(i) amawanga,\n" +
               "Nti kabak(a) ow’omuggulu,\n" +
               "Yatuwerez(a) o~mwana we, \n" +
               "Atulag(e) okwagala,~~\n" +
               "Kwagala kwa Katonda\n\nKatulag(e) ensi Omulokozi\n" +
               "(E)yabonaabona ku lwaffe,\n" +
               "Abantu bonna, (a)b’o~mu nsi,\n" +
               "Badde er(i) amazima,~~\n" +
               "Badde eri Katonda.'),"+
               "(238,'Mukama Ali Mu Yekaalu…','Muka-m(a) ali mu yekaalu~ ye;\n" +
               "Muka-m(a) ali mu yekaalu~ ye,\n" +
               "Ensi zonna zisinze,\n" +
               "Zonna zivunname mu maaso ge;\n" +
               "Sirika! Sirika! Mu maaso ge;\n" +
               "A – mii – na!'),"+
               "(239,'Ekisa Ekyandokola…','Ne~wuuny(a)~ ekisa ekingi,\n" +
               "E~kyando~kola~ nze;\n" +
               "Nna~li mbu~ze, ne ne~kinzuula,\n" +
               "(O)mu~zibe~ ne ndaba.\n\nE~kisa~ kyanjigiriza,\n" +
               "(O)ku~gonde~ra Ye~su;\n" +
               "Na~lyoka~ ne nki~kkiriza,\n" +
               "Bwe~ naki~wulira.\n\n(O)ku~tega~na n’emitego,\n" +
               "Ki~bimpi~sizzaa~mu;\n" +
               "(E)ki~sa e~kyo, ki~rintuusa,\n" +
               "Mu~maka~ ga Yesu.\n\nMu~kama~ ye yansuubiza,\n" +
               "E~ra nze~ mmwesi~ga;\n" +
               "A~nanku~ma, A~nantaasa,\n" +
               "Nga~ ntambu~la ku nsi.\n\nMu~ ggulu~ tulibeerayo,\n" +
               "E~myaka~ luku~mi;\n" +
               "Tu~liyi~mba, Tu~musinze,\n" +
               "Ye~su (e)nna~ku zonna.'),"+
               "(240,'Katonda Musumba " +
               "Wange…','Katonda~ Musu~mba wange,\n" +
               "Era~ Ye andiisa:\n" +
               "Nze ndi~ wuwe, naye~ wange;\n" +
               "Byonn(a) e~byange bibye.\n\nAndis(a) o~muddo~ (o)mulungi,\n" +
               "Nziku~ta, mpummula;\n" +
               "Awa~l(i) emigg(a) emi~rungi,\n" +
               "Anywe~sa lwa kisa.\n\nBwe nkyama~ Ye a~nkomyawo,\n" +
               "N’ang’u~mya omwoyo.\n" +
               "So si~lwa bulungi~ bwange,\n" +
               "Lwa li~nnya lye lyokka.\n\nMu kiwo~nvu e~ky’o kufa,\n" +
               "Ndiyi~ta nga sitya;\n" +
               "Olu~gga lwe n’omu~ggo gwe, \n" +
               "Bye bi~nankuumanga.\n\n(O)kwagala~ kwe o~kungi,\n" +
               "Kunna~banga nange;\n" +
               "N’oku~tendereza~ kwange,\n" +
               "Kwo te~kulikoma.'),"+
               "(241,'Akimanyi…','Simanyi binanmbaako,\n" +
               "Katond(a) abinkweka;\n" +
               "Nga ntambula ngenda mu maaso,\n" +
               "Andaga e~bipya,\n" +
               "Era buli ssanyu lyampa,\n" +
               "Kibera kyewuunyo\n\nChorus:\n" +
               "Ka mmu~gobererenga, \n" +
               "Mwesi~ge sityenga;\n" +
               "Buli ssaawa mmuyimbira,\n" +
               "Ekyo akimanyi~\n" +
               "Buli ssaawa mmuyimbira, - - -\n" +
               "Ekyo akimanyi.\n\nEby’okumpi byendaba,\n" +
               "Byokka byenetaaga;\n" +
               "(O)musana gwe ggulu gwaka nyo,\n" +
               "Ng(a) eby’ensi bi~genze;\n" +
               "Era mmuwu~lir(a) ang’amba - “Ngoberera totya!”\n\nKirung(i) obutamanya,\n" +
               "Kya mukisa gyendi;\n" +
               "Ankwata ku mukono gwange,\n" +
               "Tayinza ku~ndeka,\n" +
               "Awummuz(a) o~mwoyo gwange,\n" +
               "Er(a) anjagala nnyo!\n\nN’olw’ekyo ng’enda naye,\n" +
               "Sikola kirala;\n" +
               "Mu bizibu nga ndi ne Yesu,\n" +
               "Kinsingir(a) e~ssanyu,\n" +
               "Ka mmukkiri~ze mmwesige,\n" +
               "So si maaso gange.'),"+
               "(242,'Waggulu Mu Bwengula…','Waggul(u) ennyo, \n" +
               "Mu bwe~ngu~la~;\n" +
               "E~bi~ri~yo biru~ngi~ nnyo~\n" +
               "(E)ggulu eritema~ga~na,\n" +
               "Byo~nna~ bi~raga gye~bya~va;\nEnjuba buli lunaku,\n" +
               "Eyo~les(a) e~kitti~bwa kye,\n" +
               "Neraga buli nsi yonna,\n" +
               "(E)miri~mu gy’e~mikono gye.\n\nAkawungeezi bwe~ ka~jja,~\n" +
               "(O)mwe~zi~ gu~vaayo ne~ gwa~ka;~\n" +
               "Ensi bweyakirw(a) o~mwe~zi,~\n" +
               "Ki~ra~ga~ obuto~nzi~ bwe,\nEmmunyeenye nga zaaka nnyo,\n" +
               "Ng(a) ensi~ mu bba~nga ze~kyusa;\n" +
               "Byonna birag(a) amaanyi ge,\n" +
               "N’ama~zima~ mu nsi yonna.\n\nBitambula kasi~ri~se,~\n" +
               "O~kwe~to~lool(a) \n" +
               "e~nsi~ yo~nna;~\n" +
               "Wadde nga tebiree~kaa~na,~\n" +
               "Bi~mu~lisa buli~ wa~ntu;\nBw’obirowozaako byonna,\n" +
               "Biba~ bigu~lumi~za ye,\n" +
               "Byaka nga bwe biyimba nti,\n" +
               "“Eya~ tuto~nda wa maanyi!”'),"+
               "(243,'Bwetulituuka Mu Ggulu.…','Bwetulituuka mu ggulu \n" +
               "netwegatta wamu, \u000BTuliyimba ku  kwagala \n" +
               "kwa Yesu gyetuli;\nNga tuyise mu milyango \n" +
               "giri egya zaabu,\n" +
               "Fenna aba~nunulibwa \n" +
               "tuliyimba wamu.\n\nChorus:\n" +
               "Ssanyu [ssanyu], Ssanyu [ssanyu], \n" +
               "Yesu ali~ kumpi (ddala)\n" +
               "Ddala atwagala (Yesu), \u000B(E)ddoboozi lye ddungi (gyendi) \n" +
               "Era [era], lumu [lumu] Tulisisinkana [naye]\n" +
               "Netuyimba ku kwagala  kwe Yesu gyetuli\n\nEyo tuliba mu ssanyu ery’olubeerera,\n" +
               "Nga tutendereza Yesu olw’obuwanguzi;\nTulituuka ku mugga guli ogw’obulamu,\n" +
               "Tewaliba~ nnaku wadde okukaaba kwonna.\n\nTuliraba tulimanya \n" +
               "buli kintu kyonna, \n" +
               "Tutambule mu nnimiro \n" +
               "nga tulaba Yesu;\nMu kutendereza n’ennang(a) ezakolwa zaabu, \n" +
               "Yesu ali~tikkirwa \n" +
               "engule nga Kabaka.\n\nTetulizimba nnyumba netutazisulamu; \n" +
               "Tetulisimba mmere \n" +
               "omulala n’agirya;\n" +
               "Naye tulibanga wamu n’omwagalwa waffe, \n" +
               "Nnga tumweba~za \nolw’okutuwa  obulamu'),"+
               "(244,'Ku Lunaku Olw’emirembe…','Ku lunaku (o)lw’emirembe,\n" +
               "Ka tuyimb(e) ekitiibwa kyo;\n" +
               "Olutujuukiza Yesu,\n" +
               "Lweyatonda ensi zonna,\n" +
               "Yalutuwa okulega,\n" +
               "Ku ssanyu ery’omu ggulu.\n\n(E)nnyimba z’okutendereza,\n" +
               "Ziwulirw(a) eyo mu ggulu;\n" +
               "Ba seraafi bakusinza,\n" +
               "Bavunnama mu maaso go,\n" +
               "Ensi zonna tuyimbire,\n" +
               "Yesu eyatonda byonna.\n\n(O)lunaku lulituuka ddi,\n" +
               "Tusinze mu yekaalu yo!\n" +
               "Mu bwakabaka bwo Yesu,\n" +
               "Olifuga ensi zonna,\n" +
               "Emirembe n’emirembe,\n" +
               "Mu Adeni ensi empya.'),"+
               "(245,'Emikisa Emingi…','“Walibawo emikisa”, \n" +
               "Kisuubizo kya Yesu;\n" +
               "Walibaw[o] okudd[a] obuggya,\n" +
               "Okuva eri Yesu.\n\nChorus:\n" +
               "E-mi-kisa yo, \n" +
               "Yesu ffe gyetwetaaga;\n" +
               "(E)mikis(a) egy’okudd(a) obuggya,\n" +
               "Tusab(a) ogitwongere.\n\n“Walibaawo emikisa;”\n" +
               "Egituzza obuggya;\n" +
               "Ku nsozi ne mu biwonvu,\n" +
               "(E)mikisa mingi gijje.\n\n“Walibawo emikisa;”\n" +
               "Tusaba gikke ku ffe,\n" +
               "Otuzz(e) obuggy(a) olwa leero,\n" +
               "(E)kisuubizo kyo kijje.\n\n“Walibawo emikisa;”\n" +
               "Singa leer(o) ogituwa!\n" +
               "Ka tweneny(e) ebibi byaffe,\n" +
               "Yesu otusonyiwe!'),"+
               "(246,'Tambulira Mu Musana…','Tambulira mu musana~\n" +
               "Yesu gwe Musana~\n" +
               "Omwoyo Omutukuvu~\n" +
               "Anaakusanyusa.\n\nChorus:\n" +
               "Ta ~ m b u li ra~\n" +
               "[Tambulira mu musana gwa Katonda]\n" +
               "Mu ~ musana~\n" +
               "[Tambulira mu musana gwa Katonda]\n" +
               "Ta ~ m b u li ra~\n" +
               "[Tambulira mu musana gwa Katonda]\n" +
               "Mu ~ musana gwa Katonda\n\nTambulira mu musana~\n" +
               "Ogw’Ekigambo  kye~\n" +
               "[E]ttabaza y’abavubuka~\n" +
               "Abeesiga Yesu.\n\nTambulira mu musana~\n" +
               "Ogw’Ekigambo  kye~\n" +
               "[E]ttabaza y’abavubuka~\n" +
               "Abeesiga Yesu.\n\nTambulira mu musana~\n" +
               "Katond[a] akwagala~\n" +
               "Ye Mukwano gw(o) ow’oku nsi~\n" +
               "Era ne mu ggulu.'),"+
               "(247,'Katumusuute " +
               "Yesu…','Tegeeza amawanga g’omu nsi,\n" +
               "Tegeeza wonna;\n" +
               "Obudde bunaatera okukya,\n" +
               "Yesu alabike.\n\nChorus:\n" +
               "Kabak(a) ow’ekitiibwa;\n" +
               "Eyattibwa ku lwaffe,\n" +
               "Tegeeza buli muntu,\n" +
               "Ajj(a) okufuga.\n\n(A)mawanga mangi gali mu ntalo,\n" +
               "Entiisa nnyingi;\n" +
               "(O)bubonero buli wantu wonna,\n" +
               "Bulag(a) okudda kwe.\n\nAbaana be muyimbe n’essanyu,\n" +
               "N’okujaguza;\n" +
               "Ba mukisa abo abalinda,\n" +
               "Okudda kwa Yesu.'),"+
               "(248,'Yita Abalwanyi.…','Yit[a] abalwanyi, Lab[a] omulabe!\n" +
               "Lag[a] ebbendera ya Ye~su;\n" +
               "Mwesibe byonna, munywere mwenna,\n" +
               "Mulwanirir[e] Ekigambo kye.\n\nChorus:\n" +
               "Mu – zuu – ku – ke,  Mukungaane mwenna,\n" +
               "Mwetegeke n’Ekigambo kye;\n" +
               "Mu – ge – nde Nga mwogera “Ozaana!”\n" +
               "Kristo ye Muduumizi waffe.\n\nKa tutambule, tumwolekere,\n" +
               "Tuteekwa okuwangu~la;\n" +
               "[E]ngabo, [e]bbendera, bimasemase;\n" +
               "Amazima ge tegalemwa.\n\nKatonda waffe, otuwulire,\n" +
               "Otuyambe n’ekisa~ kyo,\n" +
               "[O]lutalo luggwe nga tuwangudde,\n" +
               "Twambazibe[e] engule mu ggulu!'),"+
               "(249,'Omusalaba Lye kkubo','(O)musalaba kkub(o) erintwala eka,\n" +
               "Tewali kkubo ddala\n" +
               "Siyinza nze kutuuka mu ggulu, Bwensubwa omusalaba.\n\nChorus:\n" +
               "(O)mu~salaba lye kkubo (lye kkubo)\n" +
               "E~ritutuusa eka; (eka)\n" +
               "Kinsanyusa nga ntambula ngenda, (O)musalaba lye kkubo\n\nLye kkubo omuli omusaayi gwe,\n" +
               "Mukama mweyayita;\n" +
               "Singa ampit(a) omwo ntuuka mu ggulu,\n" +
               "Mberanga wamu ne Yesu.\n\nEkkubo ly`ensi leero nze ndikyaye,\n" +
               "Sitambulire mu lyo;\n" +
               "Yesu ampita tugende eka, Annindiridde ku luggi.'),"+
               "(250,'Ye Yanzigya Mu bitosi…','(O)mutima gwange ggwajjula ennaku,\n" +
               "(E)kibi nga kinsudde wala mu bunnya\n" +
               "Nga ndi mu ttosi nakowoola Yesu Eyanzigyayo n`amp(a) essanyu lingi\n\nChorus:\n" +
               "Yanzigya mu bitosi wansi,\n" +
               "N`anteeka ku lwazi Yesu~\n" +
               "Antaddem(u) oluyimba nnyimbe,\n" +
               "Ka nnyimbe nnyo, Aleru-ya!\n\nYanteeka ku lwaz(i) olugumu ennyo,\n" +
               "Kwennyimiridde era siivengako;\n" +
               "Nga ndi ku Yesu sirina kya kutya \n" +
               "Mu kisa kye nnindirira engule\n\nYe y`amp(a) olupya nnyimbenga,\n" +
               "(E)misana n`ekiro mutendereze\n" +
               "(O)mutima gwange gujjud(e) emirembe,\n" +
               "Ka ntendereze Yes(u) eyannunula.\n\nKa nnyimbe mmutende olw`ekisa  kye,\n" +
               "(A)bantu bonna balab(e) obulungi bwe,\n" +
               "Ka nnyimbe ku bulokozi bwe wonna, abantu bonna badde eri Yesu.')";


        sqLiteDatabase.execSQL(hyms);
        sqLiteDatabase.execSQL(secondBanch);
        sqLiteDatabase.execSQL(secondBancht);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
