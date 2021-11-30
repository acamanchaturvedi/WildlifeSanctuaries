package com.example.wildlifesanctuaries;

        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.util.Log;
        import android.view.View;
        import android.widget.AdapterView;
        import android.widget.ArrayAdapter;
        import android.widget.ListView;
        import android.widget.TextView;
        import android.widget.Toast;

        import java.util.ArrayList;

public class Sanctuary_Detail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sanctuary_detail);
        Bundle bundle = getIntent().getExtras();
        String message = bundle.getString("key");
        ArrayList<Sanctuary>sanctuaries=new ArrayList<>();
        sanctuaries.add(new Sanctuary("Amba Barwa Wildlife Sanctuary","Buldhana, Andhra Pradesh",R.drawable.a));
        //   sanctuaries.add(new Sanctuary("Amba Barwa Wildlife Sanctuary","Buldhana, Maharashtra",R.drawable.a));
        sanctuaries.add(new Sanctuary("BR Hills Wildlife Sanctuaryildlife Sanctuary","Chandrapur, Maharashtra",R.drawable.a));
        sanctuaries.add(new Sanctuary("Aner Dam Wildlife Sanctuary","Satpura range, Maharashtra",R.drawable.a));
        sanctuaries.add(new Sanctuary("Anshi National Park","Uttara Kannada, Karnataka",R.drawable.a));
        sanctuaries.add(new Sanctuary("Aralam Wildlife Sanctuary","Kerela",R.drawable.a));
        sanctuaries.add(new Sanctuary("Asola Bhatti (Indira Priyadarshini) Wildlife Sanctuary","Asola, Delhi",R.drawable.a));
        sanctuaries.add(new Sanctuary("BR Hills Wildlife Sanctuary","Biligiriranga Hills, Kemmannagundi, Karnataka",R.drawable.a));
        sanctuaries.add(new Sanctuary("Balphakram National Park","Balphakram, Meghalaya",R.drawable.b));
        sanctuaries.add(new Sanctuary("Bandhavgarh National Park","Sahdol, Madhya Pradesh",R.drawable.b));
        sanctuaries.add(new Sanctuary("Bandipur National Park","Chamarajanagar, Karnataka",R.drawable.b));
        sanctuaries.add(new Sanctuary("Bannerghatta National Park","Banglore, Karnataka",R.drawable.b));
        sanctuaries.add(new Sanctuary("Barda Wildlife Sanctuary","Gujarat",R.drawable.b));
        sanctuaries.add(new Sanctuary("Barnawapara Wildlife Sanctuary","Chattisgarh",R.drawable.b));
        sanctuaries.add(new Sanctuary("Barren Islands Wildlife Sanctuary","Andaman & Nicober Islands",R.drawable.b));
        sanctuaries.add(new Sanctuary("Barsey Rhododendron Sanctuary","Barsey, West Sikkim District, Sikkim",R.drawable.b));
        sanctuaries.add(new Sanctuary("Battimalv Island Wildlife Sanctuary","Andaman & Nicobrt Islands",R.drawable.a));
        sanctuaries.add(new Sanctuary("Betla National Park","Daltonganj, Jharkhand",R.drawable.a));
        sanctuaries.add(new Sanctuary("Bhadra Wildlife Sanctuary","Chikmagalur District and Shimoga District, Karnataka",R.drawable.a));
        sanctuaries.add(new Sanctuary("Bhamragarh Wildlife Sanctuary","Chandrapur, Maharashtra",R.drawable.a));
        sanctuaries.add(new Sanctuary("Bhimashankar Wildlife Sanctuary","Ambegaon & Khed Taluka, Maharashtra",R.drawable.a));
        sanctuaries.add(new Sanctuary("Bhindawas Bird Sanctuary","Jhajjar District, Harayana",R.drawable.a));
        sanctuaries.add(new Sanctuary("Bhitarkanika National Park","Kendrapara, Odisha",R.drawable.a));
        sanctuaries.add(new Sanctuary("Binsar Wildlife Sanctuary","Almora District, Uttarakhand",R.drawable.a));
        sanctuaries.add(new Sanctuary("Bor Wildlife Sanctuary","Hingani, Wardha, Maharashtra",R.drawable.a));
        sanctuaries.add(new Sanctuary("Brahmagiri Wildlife Sanctuary","Kodagu District, Karnataka",R.drawable.a));
        sanctuaries.add(new Sanctuary("Buxa Tiger Reserve","Jalpaiguri, West Bengal",R.drawable.a));
        sanctuaries.add(new Sanctuary("Campbell Bay National Park","Campbell Bay, Nicobar District, Andaman & Nicobar Islands",R.drawable.a));
        sanctuaries.add(new Sanctuary("Cauvery Wildlife Sanctuary","Karnataka",R.drawable.a));
        sanctuaries.add(new Sanctuary("Chandaka Elephant Reserve","Bhubaneshwar, Odisha",R.drawable.a));
        sanctuaries.add(new Sanctuary("Chandoli National Park","Chandoli Dam, Sangli, Maharashtra",R.drawable.a));
        sanctuaries.add(new Sanctuary("Chandraprabha Wildlife Sanctuary","Uttar Pradesh",R.drawable.a));
        sanctuaries.add(new Sanctuary("Changthang Cold Desert Wildlife Sanctuary","Leh, Jammu & Kashmir",R.drawable.a));
        sanctuaries.add(new Sanctuary("Chaprala Wildlife Sanctuary Wildlife Sanctuary","Chandrapur District, Maharashtra",R.drawable.a));
        sanctuaries.add(new Sanctuary("Chilika Lagoon","Puri and Khurda Districts, Odisha",R.drawable.a));
        sanctuaries.add(new Sanctuary("Chimmony Wildlife Sanctuary","Mukundapuram Taluk of Thrissur District, Kerela",R.drawable.a));
        sanctuaries.add(new Sanctuary("Chinnar Wildlife Sanctuary","Devikulam taluk, Idukki District, Kerela",R.drawable.a));
        sanctuaries.add(new Sanctuary("Corbett National Park","Uttaranchal, Uttarakhand",R.drawable.a));
        sanctuaries.add(new Sanctuary("Cotigaon Wildlife Sanctuary","Canacona taluka (or South Goa District), Goa",R.drawable.a));
        sanctuaries.add(new Sanctuary("Dachigam National Park","Srinagar, Jammu & Kashmir",R.drawable.a));
        sanctuaries.add(new Sanctuary("Dandeli Wildlife Sanctuary","Daroji Sloth Bear Sanctuary",R.drawable.a));
        sanctuaries.add(new Sanctuary("Daroji Sloth Bear Sanctuary","Ballari district, Karnataka",R.drawable.a));
        sanctuaries.add(new Sanctuary("Deepor Beel Wildlife Sanctuary","Assam",R.drawable.a));
        sanctuaries.add(new Sanctuary("Desert National Park","Jaisalmer, Rajasthan",R.drawable.a));
        sanctuaries.add(new Sanctuary("Dibru-Saikhowa National Park","Tinsukia, Assam",R.drawable.a));
        sanctuaries.add(new Sanctuary("Dudhwa National Park","India-Nepal border, Uttar Pradesh",R.drawable.a));
        sanctuaries.add(new Sanctuary("Eravikulam National Park","Idukki District, Kerela",R.drawable.a));
        sanctuaries.add(new Sanctuary("Fambong Lho Wildlife Sanctuary","Sikkim",R.drawable.a));
        sanctuaries.add(new Sanctuary("Fudam Bird Sanctuary","Diu, Daman and Diu",R.drawable.a));
        sanctuaries.add(new Sanctuary("Gahirmatha Marine Sanctuary","Kendrapara District, Odisha",R.drawable.a));
        sanctuaries.add(new Sanctuary("Galathea National Park","Great Nicobar, Andaman & Nicobar Islands",R.drawable.a));
        sanctuaries.add(new Sanctuary("Gangotri National Park","Uttarkashi, Uttarakhand",R.drawable.a));
        sanctuaries.add(new Sanctuary("Gautala Autramghat Wildlife Sanctuary","Satmala & Ajantha hill ranges, Aurangabad, Maharashtra",R.drawable.a));
        sanctuaries.add(new Sanctuary("Gir National Park","SE of Junagadh District, Gujarat",R.drawable.a));
        sanctuaries.add(new Sanctuary("Gorumara National Park","Malbazar subdivision of Jalpaiguri District, West Bengal",R.drawable.a));
        sanctuaries.add(new Sanctuary("Govind National Park","Uttarkashi, Uttarakhand",R.drawable.a));
        sanctuaries.add(new Sanctuary("Govind Pashu Vihar Wildlife Sanctuary","Uttarkashi, Uttarakhand",R.drawable.a));
        sanctuaries.add(new Sanctuary("Great Himalayan National Park","Kullu, Himachal Pradesh",R.drawable.a));
        sanctuaries.add(new Sanctuary("Great Indian Bustard Wildlife Sanctuary","Nannaj, Solapur, Maharashtra",R.drawable.a));
        sanctuaries.add(new Sanctuary("Gugamal National Park","Chikhaldara and Dharni Tehsils Of Amaravati District, Maharashtra",R.drawable.a));
        sanctuaries.add(new Sanctuary("Guindy National Park","Guindy Taluk, Chennai District, Tamil Nadu",R.drawable.a));
        sanctuaries.add(new Sanctuary("Gulf of Mannar Marine National Park","Tuticorin and Ramanathapuram Districts near Mandapam, Tamil Nadu",R.drawable.a));
        sanctuaries.add(new Sanctuary("Gumti Wildlife Sanctuary","South Tripura, Tripura",R.drawable.a));
        sanctuaries.add(new Sanctuary("Harike Lake and Wetland Wildlife Sanctuary","Firozpur, Punjab",R.drawable.a));
        sanctuaries.add(new Sanctuary("Hemis National Park","Eastern part of Ladakh, Jammu & Kashmir",R.drawable.a));
        sanctuaries.add(new Sanctuary("Indira Gandhi Wild Life Sanctuary","Anamalai Ranges in Coimbatore District, Tamil Nadu",R.drawable.a));
        sanctuaries.add(new Sanctuary("Indravati National Park","Jagdalpur - Bhopalpattanam road, Chattisgarh",R.drawable.a));
        sanctuaries.add(new Sanctuary("Intaki National Park","Intaki, Nagaland",R.drawable.i));
        sanctuaries.add(new Sanctuary("Jaikwadi Wildlife Sanctuary","Aurangabad & Ahmednagar districts, Maharashtra",R.drawable.j));
        sanctuaries.add(new Sanctuary("Jaldapara Wildlife Sanctuary","Alipurduar, West Bengal",R.drawable.j));
        sanctuaries.add(new Sanctuary("Kalatop-Khajjiar Wildlife Sanctuary","Chamba District, Himachal Pradesh",R.drawable.a));
        sanctuaries.add(new Sanctuary("Kalesar National Park","ChhaChhrauli, Yamunanagar, Haryana",R.drawable.a));
        sanctuaries.add(new Sanctuary("Kalsubai Harishchandragad Wildlife Sanctuary","Ahmadnagar, Maharashtra",R.drawable.a));
        sanctuaries.add(new Sanctuary("Kamalang Wildlife Sanctuary","Arunachal Pradesh",R.drawable.a));
        sanctuaries.add(new Sanctuary("Kanger Ghati National Park","Bastar District, Chattisgarh",R.drawable.a));
        sanctuaries.add(new Sanctuary("Kanha National Park","Mandla District, Madhya Pradesh",R.drawable.a));
        sanctuaries.add(new Sanctuary("Karanja Sohal Blackbuck Wildlife Sanctuary","Karanja, Maharashtra",R.drawable.a));
        sanctuaries.add(new Sanctuary("Karikili Bird Sanctuary","Kanchipuram District, Tamil Nadu",R.drawable.a));
        sanctuaries.add(new Sanctuary("Karnala Wildlife Sanctuary","Panvel, Raigad, Maharashtra",R.drawable.a));
        sanctuaries.add(new Sanctuary("Kasu Brahmananda Reddy National Park","Jubilee hills in Hyderabad, Andhra Pradesh",R.drawable.a));
        sanctuaries.add(new Sanctuary("Katepurna Wildlife Sanctuary","Kothali, Akola, Maharashtra",R.drawable.a));
        sanctuaries.add(new Sanctuary("Kawal Wildlife Sanctuary","Adilabad, Telangana",R.drawable.a));
        sanctuaries.add(new Sanctuary("Kaziranga National Park","Bokahat, Assam",R.drawable.a));
        sanctuaries.add(new Sanctuary("Keibul Lamjao National Park","Keibul Lamjao, Bishnupur District, Manipur",R.drawable.a));
        sanctuaries.add(new Sanctuary("Ken Gharial Sanctuary","Chattarpur District, Madhya Pradesh",R.drawable.a));
        sanctuaries.add(new Sanctuary("Keoladeo National Park","Bharatpur, Rajasthan",R.drawable.a));
        sanctuaries.add(new Sanctuary("Khangchendzonga National Park","North Sikkim District, Sikkim",R.drawable.a));
        sanctuaries.add(new Sanctuary("Khokhan Wildlife Sanctuary","Kullu District, Himachal Pradesh",R.drawable.a));
        sanctuaries.add(new Sanctuary("Kishanpur Wildlife Sanctuary","Uttar Pradesh",R.drawable.a));
        sanctuaries.add(new Sanctuary("Kishtwar National Park","Kishtawar District, Jammu & Kashmir",R.drawable.a));
        sanctuaries.add(new Sanctuary("Koyana Wildlife Sanctuary","Koyana Nagar, Satara District, Maharashtra",R.drawable.a));
        sanctuaries.add(new Sanctuary("Kudremukh National Park","Chikmagalur Districtm Karnataka",R.drawable.a));
        sanctuaries.add(new Sanctuary("Kumbhalgarh Wildlife Sanctuary","Rajsamand District, Rajasthan",R.drawable.k));
        sanctuaries.add(new Sanctuary("Lakshadweep Islands","Arabian Sea, Lakshadweep",R.drawable.a));
        sanctuaries.add(new Sanctuary("Little Rann of Kutch","Dasada, Gujarat",R.drawable.a));
        sanctuaries.add(new Sanctuary("Mehao Wildlife Sanctuary" ,"Lower Dibang Valley, Arunachal Pradesh",R.drawable.l));

        sanctuaries.add(new Sanctuary("Madei Wildlife Sanctuary" ,"Valpo, Goa",R.drawable.l));

        sanctuaries.add(new Sanctuary("Manali WLS" ,"Manali,Himachal Pradesh",R.drawable.l));

        sanctuaries.add(new Sanctuary("Malai Mahadeshwara Wildlife Sanctuary", "Chamarajanagar,karnataka",R.drawable.l));

        sanctuaries.add(new Sanctuary("Melkote Temple Wildlife Sanctuary", "Mandya ,karnataka",R.drawable.l));

        sanctuaries.add(new Sanctuary("Malabar Wildlife Sanctuary", "Kozhikode , Kerala",R.drawable.l));

        sanctuaries.add(new Sanctuary("Mangalavanam Bird Sanctuary", "Kochi, Kerala",R.drawable.l));

        sanctuaries.add(new Sanctuary("Mayani Bird Sanctuary", "Mayani, Maharashtra",R.drawable.l));

        sanctuaries.add(new Sanctuary("Mayureshwar Wildlife Sanctuary", " Pune , Maharashtra",R.drawable.l));

        sanctuaries.add(new Sanctuary("Melghat Wildlife Sanctuary", "Amaravati, Maharashtra",R.drawable.l));

        sanctuaries.add(new Sanctuary("Maenam Wildlife Sanctuary", "South Sikkim,Sikkim ",R.drawable.l));

        sanctuaries.add(new Sanctuary("Megamalai Wildlife Sanctuary", "Megamalai,Tamil Nadu",R.drawable.l));

        sanctuaries.add(new Sanctuary("Manjira Wildlife Sanctuary", " Sangareddy , Telangana",R.drawable.l));

        sanctuaries.add(new Sanctuary("Mussoorie Wildlife Sanctuary", " Mussorie , Uttarakhand",R.drawable.l));

        sanctuaries.add(new Sanctuary("Nagarjunsagar-Srisailam Tiger Reserve" ," Kurnool,Andhra Pradesh",R.drawable.l));

        sanctuaries.add(new Sanctuary("Nambor Wildlife Sanctuary" ,"Anglong , Assam",R.drawable.l));

        sanctuaries.add(new Sanctuary("Nambor - Doigrung Wildlife Sanctuary" ,"Golagha,Assam",R.drawable.l));

        sanctuaries.add(new Sanctuary("Nakti Dam Wildlife Sanctuary" ,"Jamui, Bihar‎",R.drawable.l));

        sanctuaries.add(new Sanctuary("Nagi Dam Wildlife Sanctuary" ,"Jamui, Bihar‎",R.drawable.l));

        sanctuaries.add(new Sanctuary("Netravali Wildlife Sanctuary" ,"South-Eastern Goa,Goa",R.drawable.l));

        sanctuaries.add(new Sanctuary("Nahar Wildlife Sanctuary" ,"Rewari ,Haryana",R.drawable.l));

        sanctuaries.add(new Sanctuary("Narayan Sarovar Sanctuary" ,"Kutch, Gujarat",R.drawable.l));

        sanctuaries.add(new Sanctuary("Nargu WLS" ,"Mandi , Himachal Pradesh",R.drawable.l));

        sanctuaries.add(new Sanctuary("Nandni WLS" ,"Jammu and Kashmir",R.drawable.l));

        sanctuaries.add(new Sanctuary("Nugu WLS" ,"Mysore,karnataka",R.drawable.l));

        sanctuaries.add(new Sanctuary("Neyyar Wildlife Sanctuary" ,"Thiruvananthapuram ,kerala",R.drawable.l));

        sanctuaries.add(new Sanctuary("Narsinghgarh Wildlife Sanctuary" ,"Rajgarh,Madhya Pradesh",R.drawable.l));

        sanctuaries.add(new Sanctuary("Nagzira Wildlife Sanctuary" ,"Bhandara-Gondia,Maharastra",R.drawable.l));

        sanctuaries.add(new Sanctuary("Naigaon Mayur Wildlife Sanctuary" ,"Beed, Maharashtra",R.drawable.l));

        sanctuaries.add(new Sanctuary("Nandur Madhameshwar Wildlife Sanctuary" ,"Nashik ,Maharastra",R.drawable.l));

        sanctuaries.add(new Sanctuary("New Nagzira Wildlife Sanctuary" ,"Bhandara,Maharastra",R.drawable.l));

        sanctuaries.add(new Sanctuary("Nongkhyllem WLS" ,"Ri-Bhoi ,Meghalaya",R.drawable.l));

        sanctuaries.add(new Sanctuary("Ngengpui WLS" ,"Ngengpui ,Mizoram",R.drawable.l));

        sanctuaries.add(new Sanctuary("Nalbana Bird Sanctuary" ,"Nalabana ,Odisha",R.drawable.l));

        sanctuaries.add(new Sanctuary("Nangal WLS" ,"Ropar,Punjab",R.drawable.l));

        sanctuaries.add(new Sanctuary("Nahargarh Wildlife Sanctuary" ,"Jaipur,Rajasthan",R.drawable.l));

        sanctuaries.add(new Sanctuary("Nagarjunsagar-Srisailam Tiger Reserve" ,"Kurnool,Telangana",R.drawable.l));

        sanctuaries.add(new Sanctuary("nawabganj bird sanctuary" ," Unnao ,Uttar Pradesh",R.drawable.l));

        sanctuaries.add(new Sanctuary("Nandhaur Wildlife Sanctuary" ,"Nandhaur , Uttarakhand",R.drawable.l));



        sanctuaries.add(new Sanctuary("Overa-Aru Wildlife Sanctuary" ," Aru Valley, ‎Jammu and Kashmir‎",R.drawable.l));

        sanctuaries.add(new Sanctuary("Orcha Wildlife Sanctuary" ,"Orchha,Madhya Pradesh",R.drawable.l));

        sanctuaries.add(new Sanctuary("Oussudu Lake Bird Sanctuary" ,"Villupuram ,Puducherry",R.drawable.l));

        sanctuaries.add(new Sanctuary("Okhla Sanctuary" ,"Noida,Uttar Pradesh",R.drawable.l));
        sanctuaries.add(new Sanctuary("Pamed Wild Buffalo WLS" ,"Bastar,Chhattisgarh",R.drawable.l));

        sanctuaries.add(new Sanctuary("Purna Wildlife Sanctuary" ,"Jamlapada, Gujarat",R.drawable.l));

        sanctuaries.add(new Sanctuary("Paniya Wildlife Sanctuary" ,"Paniya Dungri, Gujarat",R.drawable.l));

        sanctuaries.add(new Sanctuary("Pong Dam Lake WLS" ,"Kangra , Himachal Pradesh",R.drawable.l));

        sanctuaries.add(new Sanctuary("Palkot Wildlife Sanctuary" ,"Banaidega, Jharkhand",R.drawable.l));

        sanctuaries.add(new Sanctuary("Parasnath Wildlife Sanctuary" ,"Giridih ,Jharkhand",R.drawable.l));

        sanctuaries.add(new Sanctuary("Pushpagiri Wildlife Sanctuary" ,"Kodagu,karnataka",R.drawable.l));

        sanctuaries.add(new Sanctuary("Parambikulam Wildlife Sanctuary,Anappady, Kerala" ,"",R.drawable.l));

        sanctuaries.add(new Sanctuary("Pathiramanal Bird Sanctuary" ,"Alappuzha ,Kerala",R.drawable.l));

        sanctuaries.add(new Sanctuary("Periyar Wildlife Sanctuary" ," ‎Kochi,kerala",R.drawable.l));

        sanctuaries.add(new Sanctuary("Panpatha Wildlife Sanctuary" ,"Panpatha, Madhya Pradesh",R.drawable.l));

        sanctuaries.add(new Sanctuary("Phen Wildlife Sanctuary" ,"Mandla, Madhya Pradesh",R.drawable.l));

        sanctuaries.add(new Sanctuary("Painganga Wildlife Sanctuary" ,"Morchandi, Maharashtra",R.drawable.l));

        sanctuaries.add(new Sanctuary("Phansad Wildlife Sanctuary" ,"Raigad , Maharashtra ",R.drawable.l));

        sanctuaries.add(new Sanctuary("Pualreng WLS" ,"Mizoram",R.drawable.l));

        sanctuaries.add(new Sanctuary("Pangolakha Wildlife Sanctuary" ,"Pakyong ,Sikkim ",R.drawable.l));

        sanctuaries.add(new Sanctuary("Pocharam Wildlife Sanctuary", "Nizamabad, Telangana",R.drawable.l));

        sanctuaries.add(new Sanctuary("Pakhal Wildlife Sanctuary" ," Warangal, Telangana",R.drawable.l));

        sanctuaries.add(new Sanctuary("Pranahita Wildlife Sanctuary" ,"Kotapalle, Telangana ",R.drawable.l));

        sanctuaries.add(new Sanctuary("Parvati Arga Bird Sanctuary" ," Gonda ,Uttar Pradesh",R.drawable.l));

        sanctuaries.add(new Sanctuary("Rajauli Wildlife Sanctuary" ," nawada , bihar",R.drawable.l));

        sanctuaries.add(new Sanctuary("Ratanmahal Sloth Bear Sanctuary," ," Kanjeta, Gujarat",R.drawable.l));

        sanctuaries.add(new Sanctuary("Rampara Vidi Wildlife Sanctuary" ,"Bhojpara Vidi, Gujara ",R.drawable.l));

        sanctuaries.add(new Sanctuary("Rupi Bhaba WLS" ,"Shamnu, Himachal Pradesh ",R.drawable.l));

        sanctuaries.add(new Sanctuary("Ramnagar Rakha WLS" ," Jammu ,Jammu and Kashmir",R.drawable.l));

        sanctuaries.add(new Sanctuary("Rajparian Wildlife Sanctuary" ," Anantnag, Jammu and Kashmir ",R.drawable.l));

        sanctuaries.add(new Sanctuary("Ranganathittu Bird Sanctuary" ,"Mandya,Karnataka ",R.drawable.l));

        sanctuaries.add(new Sanctuary("Ramadevara Betta Vulture WLS" ,"Ramanagara,Karnataka ",R.drawable.l));

        sanctuaries.add(new Sanctuary("Rangayyanadurga Four-horned antelope" ,"Davanagere,Karnataka ",R.drawable.l));

        sanctuaries.add(new Sanctuary("Ralamandal Wildlife Sanctuary" ,"Indore, Madhya Pradesh ",R.drawable.l));

        sanctuaries.add(new Sanctuary("Radhanagari Wildlife Sanctuary" ," Kolhapur, Maharashtra",R.drawable.l));

        sanctuaries.add(new Sanctuary("Rangapahar WLS" ," Daroga Pathar,Nagaland",R.drawable.l));

        sanctuaries.add(new Sanctuary("Ramgarh Vishdhari Wildlife Sanctuary" ," Bherupura Antri, Rajasthan",R.drawable.l));

        sanctuaries.add(new Sanctuary("Ramsagar Wildlife Sanctuary" ," Dholpur , Rajasthan ",R.drawable.l));

        sanctuaries.add(new Sanctuary("Rowa Wildlife Sanctuary" ,"Roa, Tripura",R.drawable.l));

        sanctuaries.add(new Sanctuary("Raiganj Wildlife Sanctuary" ," Raiganj, West Bengal",R.drawable.l));

        sanctuaries.add(new Sanctuary("Sri Lankamalleswara Wildlife Sanctuary " ,"Kadapa, Andhra Pradesh",R.drawable.l));

        sanctuaries.add(new Sanctuary("Sri Venkateswara National Park" ,"Chittoor and Kadapa , Andhra Pradesh,",R.drawable.l));

        sanctuaries.add(new Sanctuary("Sri Penusila Narasimha Wildlife Sanctuary" ,"PJR, Andhra Pradesh ",R.drawable.l));

        sanctuaries.add(new Sanctuary("Sarangarh-Gomardha WLS" ,"Sarangarh,Chhattisgarh",R.drawable.l));

        sanctuaries.add(new Sanctuary("Salim Ali Bird Sanctuary" ,"Chorão, ‎Goa‎",R.drawable.l));

        sanctuaries.add(new Sanctuary("Shikari Devi WLS" ,"Janjehli,Himachal Pradesh",R.drawable.l));

        sanctuaries.add(new Sanctuary("Shimla Water Catchment WLS" ,"Charabra Mashobra, Himachal Pradesh",R.drawable.l));

        sanctuaries.add(new Sanctuary("Sharavati Valley Wildlife Sanctuary" ,"Halethota, Karnataka ",R.drawable.l));

        sanctuaries.add(new Sanctuary("Shettihalli WLS" ,"Adinasara, Karnataka",R.drawable.l));

        sanctuaries.add(new Sanctuary("Someshwara Wildlife Sanctuary" ,"Nadpal, Karnataka",R.drawable.l));

        sanctuaries.add(new Sanctuary("Shendurney Wildlife Sanctuary" ,"Thenmala,Kerala",R.drawable.l));

        sanctuaries.add(new Sanctuary("Sailana Wildlife Sanctuary" ,"Ratlam , Madhya Pradesh",R.drawable.l));

        sanctuaries.add(new Sanctuary("Sardarpur Wildlife Sanctuary" ,"Dhar , Madhya Pradesh",R.drawable.l));

        sanctuaries.add(new Sanctuary("Singhori Wildlife Sanctuary" ,"Kartoli, Madhya Pradesh",R.drawable.l));

        sanctuaries.add(new Sanctuary("Sagareshwar Wildlife Sanctuary" ,"Tupari, Maharashtra ",R.drawable.l));

        sanctuaries.add(new Sanctuary("Sudhagad Wildlife Sanctuary" ,"Avandhe, Maharashtra ",R.drawable.l));

        sanctuaries.add(new Sanctuary("Siju WLS" ,"South Garo Hills,Meghalaya",R.drawable.l));

        sanctuaries.add(new Sanctuary("Singphan WLS" ,"Mon , Nagaland ",R.drawable.l));

        sanctuaries.add(new Sanctuary("Sunabeda Tiger Reserve " ,"Upkapani, Odisha",R.drawable.l));

        sanctuaries.add(new Sanctuary("Sawaimadhopur Wildlife Sanctuary" ,"sawai madhopur,Rajasthan",R.drawable.l));

        sanctuaries.add(new Sanctuary("Shergarh Wildlife Sanctuary" ,"Baran,Rajasthan",R.drawable.l));

        sanctuaries.add(new Sanctuary("Sakkarakottai WLS" ,"Sakkarakottai,Tamil Nadu",R.drawable.l));

        sanctuaries.add(new Sanctuary("Saman Bird Sanctuary," ,"Mainpuri ,Uttar Pradesh",R.drawable.l));

        sanctuaries.add(new Sanctuary("Sandi Bird Sanctuary" ,"Koilaee, Uttar Pradesh",R.drawable.l));

        sanctuaries.add(new Sanctuary("Shivaram Wildlife Sanctuary" ,"Sivaram ,Telangana",R.drawable.l));


        sanctuaries.add(new Sanctuary("Talley Valley Wildlife Sanctuary" ," Ziro, Arunachal Pradesh",R.drawable.l));

        sanctuaries.add(new Sanctuary("Tamor Pingla Wildlife Sanctuary" ,"Surajpur , Chhattisgarh",R.drawable.l));

        sanctuaries.add(new Sanctuary("Talra WLS" ," Talra,Himachal Pradesh",R.drawable.l));

        sanctuaries.add(new Sanctuary("Tirthan WLS" ,"Kullu,Himachal Pradesh",R.drawable.l));

        sanctuaries.add(new Sanctuary("Topchanchi Wildlife Sanctuary" ,"Dhanbad ,Jharkhand",R.drawable.l));

        sanctuaries.add(new Sanctuary("Talakaveri Wildlife Sanctuary" ,"Karike, Karnataka",R.drawable.l));

        sanctuaries.add(new Sanctuary("Tamhini Wildlife Sanctuary" ,"Pune,Maharastra",R.drawable.l));

        sanctuaries.add(new Sanctuary("Tansa Wildlife Sanctuary" ,"Tanasa, Maharashtra ",R.drawable.l));

        sanctuaries.add(new Sanctuary("thillari wildlife sanctuary" ,"Sindhudurg ,Maharastra",R.drawable.l));

        sanctuaries.add(new Sanctuary("Thinungei Bird Sanctuary" ," Bishnupur,Manipur",R.drawable.l));

        sanctuaries.add(new Sanctuary("Tawi WLS" ," Aizawl,Mizoram",R.drawable.l));

        sanctuaries.add(new Sanctuary("Tikarpada Wildlife Sanctuary" ,"Angul ,Odisha",R.drawable.l));

        sanctuaries.add(new Sanctuary("Takhni-Rehampur WLS" ,"Hoshiarpur, Punjab",R.drawable.l));

        sanctuaries.add(new Sanctuary("Theerthangal WLS" ,"Theerthangal , TamilNadu",R.drawable.l));
        sanctuaries.add(new Sanctuary("Turtle WLS" ,"Varanasi ,Uttar Pradesh",R.drawable.l));
        sanctuaries.add(new Sanctuary("Lonar Wildlife Sanctuary","Nagpur, Maharashtra",R.drawable.l));
        ArrayList<String> res=new ArrayList<>();
        for(Sanctuary element:sanctuaries)
        {
            String res1=element.getSanctuaryAddress();
            // Log.e("MANU",res1);
            if(res1.contains(message))
            {
                // Log.e("MANU",res1);
                //  Toast.makeText(this,"HELLO",Toast.LENGTH_SHORT).show();
                res.add(element.getSanctuaryName());
            }
        }

        ArrayAdapter<String>arrayAdapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,res);
        ListView listView=findViewById(R.id.listView1);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent i1 = new Intent(Sanctuary_Detail.this,Sanctuary_Information_Activity.class);
                Bundle b = new Bundle();
                String name = (String) adapterView.getItemAtPosition(i);
//                b.putString("key", name);
//                i.putExtras(b);
                i1.putExtra("key",name);
                startActivity(i1);
            }
        });
    }
}

