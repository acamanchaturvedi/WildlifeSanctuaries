package com.example.wildlifesanctuaries;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;

        import android.widget.TextView;
        import android.widget.Toast;

        import androidx.appcompat.app.AppCompatActivity;
        import androidx.cardview.widget.CardView;

        import java.util.ArrayList;

public class Sanctuary_Information_Activity extends AppCompatActivity {

    ArrayList<Sanctuary_Information> sanctuary_informations;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sanctuary_information);
        sanctuary_informations = new ArrayList<>();
        
        /*
        sanctuary_informations.add(new Sanctuary_Information("Asola Bhatti (Indira Priyadarshini) Wildlife Sanctuary" ,null,"Asola",null, "1992", "27.82 km²"));
        sanctuary_informations.add(new Sanctuary_Information("Aralam Wildlife Sanctuary",null,null,null,"1984","55 km²"));
        sanctuary_informations.add(new Sanctuary_Information("Anshi National Park", "Tigers, Indian Bison, Bonnet Macaque, Deer, Mouse Deer, Spotted Deer, Malabar Civet, Malabar Giant Squirrel, Pangolin, Sloth Bear, Black Panther, Elephants, Adjutant Stork, Ashy Woodswallow, Black-crested Bulbul, Blue-headed Pitta, Brahminy Kite, Broad-billed Roller, Crested Serpent Eagle, Great Hornbill, Golden-backed Woodpecker, Malabar Pied Hornbill, Sri Lanka Frogmouth and Yellow-footed Green Pigeon", "Uttara Kannada", "Trekking", "1987", "340 km²"));
        sanctuary_informations.add(new Sanctuary_Information("Aner Dam Wildlife Sanctuary" ,"Barking Deer, Chinkaras, Hares, Porcupines, Jungle Cats","Satpura range",null, "1986", "82.94 km²"));
        sanctuary_informations.add(new Sanctuary_Information("Andhari Wildlife Sanctuary" ,null,"Chandrapur",null, "1986", "509.27 km²"));
        sanctuary_informations.add(new Sanctuary_Information("Amba Barwa Wildlife Sanctuary" ,null,"Buldhana",null, "1997", "12711 km²"));
        sanctuary_informations.add(new Sanctuary_Information("BR Hills Wildlife Sanctuary","Panthers, Gaurs, Chitals, Sambars, Bears, Elephants, Tigers, Leopards, Wild dogs, Jungle cat, Sloth bears, Civet, Mongoose, Giant squirrel, Porcupine, Common langur, Bonnet macaque, Wild pig, Spotted deer and Four-horned antelope, Malabar whistling thrush","Biligiriranga Hills, Kemmannagundi","Amateur fishing, River rafting, Trekking, Camping","1974","540 km²"));
        sanctuary_informations.add(new Sanctuary_Information("Balphakram National Park","Indian Elephant, Bengal Tiger, Leopard, Clouded Leopard, Wild Buffalo, Hoolock (White-browed) Gibbon, Assamese Macaque, Pig-tailed Macaque","Balphakram","Trekking","1987","220 km²"));
        //sanctuary_informations.add(new Sanctuary_Information("Bandhavgarh National Park","Rhesus Macaque, Hanuman Langur, Golden Jackal, Wolf Bengal, Fox Dhole Sloth Bear Ratel, Small Indian Civet, Common Palm Civet, Small Indian Mongoose","Sahdol","Jeep Safari, Elephant Safari","1968","437 km²"));
        sanctuary_informations.add(new Sanctuary_Information("Bandhavgarh National Park","Rhesus Macaque, Hanuman Langur, Golden Jackal, Wolf Bengal, Fox Dhole Sloth Bear Ratel, Small Indian Civet, Common Palm Civet, Small Indian Mongoose","Sahdol","Jeep Safari, Elephant Safari","1968","437 km²","23.6887","81.0287"));
        sanctuary_informations.add(new Sanctuary_Information("Bandipur National Park","Tigers, Leopards, Elephants, Gaurs, Sambar, Chital, Barking Deer, Mouse Deer, Black Napped Hare, Sloth Beer, Wild dog (Dhole), Langur, Bonnet Macaque, Indian Giant Red Squirrel, Horned Antelope","Chamarajanagar","Jeep Safari, Elephant Safari, Horse Safari","1974","874 km²"));
        sanctuary_informations.add(new Sanctuary_Information("Bannerghatta National Park","Wild Boars, Leopards, Sloth Bears, Jackal, Porcupine, Pangolin, Slender Loris, Sambar, Spotted Deer, Monitor Lizards, Cobras, Pythons, Kraits","Bangalore",null,"1971","104 km²"));
        sanctuary_informations.add(new Sanctuary_Information("Kanha National Park", "Tiger, Bison, Gaur, Sambar, Chital, Barasingha, Barking Deer, Black Deer, Black Buck, Chousingha, Nilgai, Mouse Deer, Sloth Bear, Jackal Fox, Porcupine, Hyena, Jungle Cat, Python, Pea Fowl, Hare, Monkey, Ongoose, Tiger, and Leopard, Storks, Teals, Pintails, Pond Herons, Egrets, Peacock, Pea Fowl, Jungle Fowl, Spur Fowl, Partridges, Quails, Ring Doves, Spotted Parakeets, Green Pigeons, Rock Pigeons, Cuckoos, Papihas, Rollers, Bee-eater, Hoopoes, Drongos, Warblers, Kingfishers, Woodpeckers, Finches, Orioles, Owls, and Flycatchers", "Mandla District", "Elephant Safari, Kanha Museum", "1955", "940 km²"));
        sanctuary_informations.add(new Sanctuary_Information("Buxa Tiger Reserve","Boar, Sambar, Leopard Cat, Bengal Florican,Black Stork, Asian Elephant, Tiger, Gaur, Wild Regal Python, Chinese Pangolin, Hispid Hare, Migratory Goosanders, Red-stars, Wagtails, the rare black necked Crane, migratory common Teal, Large Whistling Teal, Minivets" ,"Jalpaiguri","Trekking, Jeep Safari","1986","426 km²"));
        sanctuary_informations.add(new Sanctuary_Information("Brahmagiri Wildlife Sanctuary","Lion-tailed Macaque, Elephant, Gaur, Tiger, Jungle Cat, Leopard Cat, Wild Dog, Sloth Bear, Wild Pig, Sambar, Spotted Deer, Nilgiri Langur, Slender Loris, Bonnet Macaque, Common Langur, Barking Deer, Mouse Deer, Malabar Giant Squirrel, Giant Flying Squirrel, Nilgiri Marten, Common Otter, Brown Mongoose, Civets, Porcupine, Pangolin, Python, Cobra, King Cobra, Emerald Dove, Black Bulbul and Malabar Trogon","Kodagu District","Trekking, Bird safari, Jungle safari, Climbing","1974","181 km²"));
        sanctuary_informations.add(new Sanctuary_Information("Bor Wildlife Sanctuary","Bengal tiger, Indian leopard, Indian bison, blue bull, chital, sambar deer, peacock, barking deer, mouse deer, monkey, wild boar, sloth bear, and wild dog","Hingani, Wardha",null,"1979","61.1 km²"));
        sanctuary_informations.add(new Sanctuary_Information("Binsar Wildlife Sanctuary","Leopard, Nemorhaedus Goral, Chital, Musk Deer, Serow, Jungle Cat, Sus Scrofa, Black Bear, Red Fox, Pine Marten, Fox, Langur, Monkey, Porcupine, Tits, Forktail, Nuthatches, Blackbirds, Flying Squirrel, Parakeets, Laughingthrush, Magpies, Kalij Pheasant, Eagles, Monal, Koklas Barking Deer, Woodpeckers and Butterflies","Almora District","Trekking","1988","47.7 km²"));
        sanctuary_informations.add(new Sanctuary_Information("Bhitarkanika National Park","Ridley Sea Turtles, Estuarine Crocodile, King Cobra, Indian Python and Water Monitor Lizard","Kendrapara","Park Safari, Jungle safari","1975","145 km²"));
        sanctuary_informations.add(new Sanctuary_Information("Bhindawas Bird Sanctuary","Blue Peafowl, Gray Francolin, Black Francolin, Shikra, Black Kite, Oriental Honey Buzzard, Eurasian Thick-knee, Bronze-winged Jacana, Purple Swamphen, Greater Coucal, Little Grebe, Yellow-crowned Woodpecker, Black-rumped Flameback, White-throated Kingfisher, Coppersmith Barbet, Indian Roller, Common Hoopoe, Black Drongo, Rose-ringed Parakeet, Plum-headed Parakeet, Spotted Owlet, Rock Pigeon, Eurasian Collared Dove, Laughing Dove, Jungle Babbler, Oriental Darter, Spot-billed Duck, Greater Flamingo, Pallas's Gull, Whiskered Tern, Osprey, Eurasian Marsh Harrier, Graylag Goose, Bar-headed Goose, Comb Duck, Ruddy Shelduck, Mallard, Gadwall, Eurasian Wigeon, Great Cormorant, Common Teal, Northern Pintail, Northern Shoveler, Common Pochard, Green Bee-eater, Pied Cuckoo, Common Hawk Cuckoo, Great Egret, Crested Lark, Ashy Prinia, Oriental Pratincole, Small Pratincole, Kentish Plover, Northern Lapwing, Yellow Bittern, the antelope Neelgai (Blue Bull), Jungle Cat, and Jackals","Jhajjar District","Bird safari","1986","4.12 km²"));
        sanctuary_informations.add(new Sanctuary_Information("Bhimashankar Wildlife Sanctuary","Greater Spotted Eagle, Jerdon's Baza, Lesser Kestrel and Nilgiri Wood Pigeon as well as a number of restricted range species like the Malabar Parakeet, Small Sunbird, Malabar Grey Hornbill and Southern Tree Pie.","Ambegaon & Khed Taluka",null,"1985","130.78 km²"));
        sanctuary_informations.add(new Sanctuary_Information("Bhamragarh Wildlife Sanctuary",null,"Chandrapur",null,"1997","104.38 km²"));
        sanctuary_informations.add(new Sanctuary_Information("Bhadra Wildlife Sanctuary","Gaur, Elephants, Tiger, Leopard, Sambar, Chital spotted deer, Boar, Porcupine, Muntjac,Peacock, Parrot, Partridge, Pigeon, Munia and Bee eaters, Marsh crocodile, Flying lizard, Monitor lizard, King Cobras and Indian Rock Pythons","Chikmagalur District and Shimoga District","Jungle Safari, Boating","1974","492 km²"));
        sanctuary_informations.add(new Sanctuary_Information("Betla National Park","Tigers, Elephant, Gaur, Cheetal, Sloth Bear, Mouse Deer, Pangolin, four horned Antelope, Sambar, Civet Wolf, Forest Owls, Drongos, Civets and the Rhesus Monkey","Daltonganj","Jeep Safari","1989","232 km²"));
        sanctuary_informations.add(new Sanctuary_Information("Battimalv Island Wildlife Sanctuary",null,null,null,"1987","2.23 km²"));
        sanctuary_informations.add(new Sanctuary_Information("Barsey Rhododendron Sanctuary","Leopard, Leopard Cat, Marbled Cat, Himalayan Yellow Throated Marten, Common Otter, Himalayan Palm Civet, Cannidae Wild dog, Indian Fox, Jackal, Himalayan Black Bear, Wild Boar, Red Panda, Barking Deer, Serow, Assamese Macaque, Rhesus Macaque, Himalayan Langur, Crimson Horned Pheasant, Monal Pheasant and Kaleej Pheasant, Crestless Porcupine, Rufous Tailed Hare, Chinese Pangolin, Flying Squirrel, Giant Squirrel and Himalayan Mouse Hare","Barsey, West Sikkim District","Trekking, Jungle Safari","1998","104 km²"));
        sanctuary_informations.add(new Sanctuary_Information("Barren Island Wildlife Sanctuary",null,null,null,"1987","8.1 km²"));
        sanctuary_informations.add(new Sanctuary_Information("Barnawapara Wildlife Sanctuary",null,null,null,"1984","55 km²"));
        sanctuary_informations.add(new Sanctuary_Information("Barda Wildlife Sanctuary",null,null,null,"1979","192.31 km²"));
        sanctuary_informations.add(new Sanctuary_Information("Cotigaon Wildlife Sanctuary","Flying Squirrel, Slender Loris, Indian Pangolin, Mouse Deer, Four-horned Antelope, Malabar Pit Viper, Hump-Nosed Pit Viper, White-bellied Woodpecker, Malabar Trogon, Velvet-fronted Nuthatch, Heart-spotted Woodpecker, Speckled Piculet, Malayan Bittern, Draco or Flying Lizard, Golden-back Gliding Snake, and Malabar Tree Toad","Canacona taluka (or South Goa District)",null,"1968","85.65 km²"));
        sanctuary_informations.add(new Sanctuary_Information("Corbett National Park","Tiger, Leopard, Elephant, Cheetal Sambar Hog Deer, Barking Deer Wildboar Langoor, Rhesus Monkey, Peacock, Jungle Fowl, Partridges, Kaleej, Crow, Vulture, Parakeets, Laughing Thrush, Orioles, King Fishers, Drongo, Doves, Woodpeckers, Ducks, Teals, Storks, Cormorants, Seagulls, Indian Marsh Crocodiles (Mugger), Gharials King Cobra, Common Krait Cobra, Russel Python, Monitor Lizard, Mahaseer Kalimuchi Kalabasu Chilwa and Goonch","Uttaranchal","Elephant Safari, Jeep Safari, Fishing, Bird Safari","1936","1319 km²"));
        sanctuary_informations.add(new Sanctuary_Information("Chinnar Wildlife Sanctuary","Elephant, Gaur, Spotted Deer, Panther, Sambar, The Endangered Giant Grizzled Squirrel, Hanuman Langur, Rabbit, Black Eagles, and Peacocks","Devikulam taluk, Idukki District","Trekking, Boating, Camping, Bird safari, Jungle safari","1984","90.44 km²"));
        sanctuary_informations.add(new Sanctuary_Information("Chimmony Wildlife Sanctuary","Malabar Whistling Thrush, Tiger, Leopard, Sloth Bear, Dhole, Nilgiri Langur, Bonnet Macaque, Elephant, Gaur, Sambar, Spotted Deer, Wild Boar, and Malabar Giant Squirrel, Darter, Dabchick, Malabar Grey Hornbill, Sri Lankan Frogmouth, Raquet Tailed Drongo, Malabar Trogon, Ruby Throated Bulbul, Crested Serpent Eagle, Spot Bellied Forest Owl, Paradise Flycatcher, and Indian Pitta","Mukundapuram Taluk of Thrissur District","Bird safari, Jungle safari, Bamboo Rafting, Birding Trail, Butterfly Safari, Nature Walk for Children, Jungle Craft, Animal Tracking, Moonlight Sonata","1984","85 km²"));
        sanctuary_informations.add(new Sanctuary_Information("Chilika Lagoon","Sand Pipers, White Bellied Sea Eagles, Ospreys, Golden Plover, Pelicans, Shovellers, Gulls, and Flamingos","Puri and Khurda Districts","Bird safari, Boating, Fishing","1981","1165 km²"));
        sanctuary_informations.add(new Sanctuary_Information("Chaprala Wildlife Sanctuary","Tiger, Leopard, Jungle cat, Sloth Bear, Wild dog, Indian Python, Common Indian Monitar, Black Buck, Wild Boar, Spotted Deer, Sambar, Barking Deer, Blue Bull, Common Langoor, Harep, Jackal, Mungoose, Peacock, Jungle Fowl, and Flying Squirrel","Chandrapur District","Jeep Safari, Boating","1986","134.78 km²"));
        sanctuary_informations.add(new Sanctuary_Information("Changthang Cold Desert Wildlife Sanctuary","Black-necked Crane, Brahminy Ducks, Brown-headed Gulls","Leh",null,"1987","40000 km²"));
        sanctuary_informations.add(new Sanctuary_Information("Chandraprabha Wildlife Sanctuary",null,null,null,"1957","78 km²"));
        sanctuary_informations.add(new Sanctuary_Information("Chandoli National Park","Tigers, Indian Bison or Gaur Bos Gaurus, Sambar Cervus unicolor, Leopard Cats Prionailurus Bengalensis, Sloth Bears Melursus Ursinus and Indian giant Squirrels Ratufa Indica","Chandoli Dam, Sangli",null,"2004","309 km²"));
        sanctuary_informations.add(new Sanctuary_Information("Chandaka Elephant Reserve","Elephants, Chital, Bear, Pea-Fowl and Sambar","Bhubaneshwar","Trekking, Elephant Safari","1982","175.79 km²"));
        sanctuary_informations.add(new Sanctuary_Information("Cauvery Wildlife Sanctuary",null,null,null,"1987","1027.53 km²"));
        sanctuary_informations.add(new Sanctuary_Information("Campbell Bay National Park","Nicobar Pigeon, Crab eating Macaque, Giant Robber Crab, Megopode","Campbell Bay, Nicobar District","Jungle safari","1992","426 km²"));
        sanctuary_informations.add(new Sanctuary_Information("Dachigam National Park","Musk Deer, Kashmir Stag, Hangul, Leopards, Himalayan Brown Bear, Jackals, Yellow-throated Martens, Hill Fox, Himalayan Gray Langurs, Long-tailed Marmots, Leopard Cats, Himalayan Black Bear, Himalayan Weasel, Jungle Cats, Himalayan Monals, Cinnamon Sparrows, Black Bulbuls, Woodpeckers, Minivets, Pygmy Owlets, Babblers, Black-and-Yellow Grosbeaks, Himalayan Griffons, Redstarts, Bearded Vultures, Red-billed Blue Magpies Choughs, Orange Bullfinch, Tits, Golden Orioles, Kashmir Flycatcher, Tytler's Leaf Warbler, Wagtails, Koklass Pheasants, Himalayan Rubythroats, Wallcreepers, and Streaked Laughing thrushs","Srinagar","Nature walks, Trekking","1981","141 km²"));
        sanctuary_informations.add(new Sanctuary_Information("Dandeli Wildlife Sanctuary","Deer, Mouse Deer, Barking Deer, Sloth Bear, Wild Boar, Wild Dog, Mongoose, Porcupine, Jackal, and Common langur, Golden-backed Woodpecker, Elephant, Gaur, Tiger, Panther, Sambar, Spotted Pied Hornbill and Crocodiles Crested Serpent Eagle, White Breasted Kingfisher, Grey Hornbill, Great Pied Hornbill, the Malabar","Uttara Kannada District","Jungle safari, Canoe Tours, Elephant Rides, Boat, Coracle Rides, White-Water Rafting, snorkeling, Parasailing, Trekking, Picnic Spots","1971","8861.41 km²"));
        sanctuary_informations.add(new Sanctuary_Information("Daroji Sloth Bear Sanctuary","Indian Sloth Bear, leopards, monitor lizards, mongoose, pangolins, star tortoises","Ballari district",null,"1992","82.72 km²"));
        sanctuary_informations.add(new Sanctuary_Information("Deepor Beel Wildlife Sanctuary",null,null,null,"2002","4.14 km²"));
        sanctuary_informations.add(new Sanctuary_Information("Dibru-Saikhowa National Park","Bengal Tiger, Leopard, Clouded Leopard, Jungle Cat, Sloth Bear, Dhole, Small Indian Civet, Malayan Giant Squirrel, Chinese Pangolin, Gangetic Dolphin, Slow Loris, Pig Tailed Macaque, Assamese Macaque, Rhesus Macaque, Capped Langur, Hollock Gibbon, Asian Elephant, Wild Boar, Samber, Hog Deer, barking Deer, Asiatic Water Buffalo, and Feral Horses, Greater Adjutant Stork, Lesser Adjutant Stork, Great Grebe, Indian Shag, Grey Heron, Purple Heron, Night Heron, Yellow Bittern, Openbill Stork, Black Stork, Large Whisstling Teal, Greylag Groose, Common Pintail, Pallas's Fishing Eagle, Spot Billed Pelican, White Winged Duck, Bear's Poachard, Greater Spotted Eagle, Bengal Florican, Pale Capped Pigon, Great Pied Hornbill, March Babbler, Jardon's Babbler, and Black Breasted Parrotbill Eagle, Griffon Vulture, Osprey, Crested Serpent","Tinsukia","Jungle Safari, Jeep Safari","1999","340 km²"));
        sanctuary_informations.add(new Sanctuary_Information("Dudhwa National Park","Tiger, Leopard, Swamp Deer, Rhinoceros, Chital, Hog Deer, Barking Deer, Sambar, Wild Boar, Ratel, Bara Singha, Wamp Deer, One-horned Rhino, Owls, Storks, Hornbills, Kingfishers, Woodpecker","India-Nepal border","Jeep safaris, Elephant safaris","1977","490 km²"));
        sanctuary_informations.add(new Sanctuary_Information("Eravikulam National Park","Indian Muntjac, Sambar Deer, Golden Jackal, Jungle Cat, Wild Dog, Dhole, Leopard, Tiger, Nilgiri Langur, Stripe-necked Mongoose, Indian Porcupine, Nilgiri Marten, Small Clawed Otter, Ruddy Mongoose, and Funambulus Sublineatus, Dusky Striped Squirrel, Black-and-Orange Flycatcher, Nilgiri Pipit, Nilgiri Wood Pigeon, Yellow-Throated Marten, White Bellied Shortwing, Nilgiri Verditer Flycatcher and Kerala Laughing thrush","Idukki District","Trekking","1978","97 km²"));
        sanctuary_informations.add(new Sanctuary_Information("Desert National Park","Desert Fox, Bengal Fox, Desert Cat, Wolf, Hedgehog, Black Buck and Chinkara, Spiny Tail Lizard, Monitor Lizard, Russel's Viper, Chameleons and Sind Krait, Sand Grouse, Partridges, Bee Eaters, Larks, Shrikes, Harriers, Falcons, Buzzards, Kestrel, Vultures, Short-toed Eagles, Tawny Eagles, Spotted Eagles, Lagger, Demoiselle Cranes and Houbara","Jaisalmer","Jeep safari, Camping, Bonfire, Bird safari","1980","3162 km²"));
        sanctuary_informations.add(new Sanctuary_Information("Fambong Lho Wildlife Sanctuary",null,null,null,"1984","51.76 km²"));
        sanctuary_informations.add(new Sanctuary_Information("Fudam Bird Sanctuary",null,"Diu",null,"1991","2.18 km²"));
        sanctuary_informations.add(new Sanctuary_Information("Gahirmatha Marine Sanctuary", "Olive Ridley Turtle, Dolphins, Porpoises, Seagulls, Turns", "Kendrapara district", null, "1979", "1435  km²"));

        sanctuary_informations.add(new Sanctuary_Information("Galathea National Park", "Giant Robber Crab, Megapode and Nicobar Pigeon", "Great Nicobar", null, "1992", "110  km²"));

        sanctuary_informations.add(new Sanctuary_Information("Gangotri National Park", "Snow Leopard, Bla Bear, Brown Bear, Musk Deer, Blue Sheep or Bharal, Himalayan Tahr, Himalayan Monal, Koklass and Himalayan Snowcock, Ibex, Thar, Himalayan Barbet, Tiger, Serow, Pheasants, Partridges, Doves, Pigeons, Parakeet and Bulbul", "Uttarkashi", "Jeep Safari, Trekking, Mountaineering, Hiking, River rafting, Paragliding, Hang gliding, Skiing", "1989", "1553  km²"));

        sanctuary_informations.add(new Sanctuary_Information("Gautala Autramghat Wildlife Sanctuary", null, "Satmala & Ajantha hill ranges, Aurangabad", null, "1986", "260.61  km²"));

        sanctuary_informations.add(new Sanctuary_Information("Gir National Park", "Lion, Antelope, Deer, Leopard, Hyena, Crocodile", "SE of Junagadh District", "Jeep Safari, Jungle safari, Asiatic lion spotting, Bird safari, Nature walks", "1965", "1412 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Gorumara National Park", "Indian Rhinoceros, One horned rhinoceros, Gaur, Asian Elephant, Sloth bear, Chital, Bengal Tigers, Indian Wild Dogs, Indian Wolf, Pygmy Hog, Giant Squirrels, Hispid Hare and Sambar Deer, Barking deer, Hog deer and Wild boar, Scarlet Minivet, Sunbird, Asian Paradise Flycatcher, Spangled Drongo, Great Indian Hornbill, Woodpeckers, Pheasants, Peafowls, Brahminy Duck, Indian Python, and King Cobra", "Malbazar subdivision of Jalpaiguri District", "Elephants safaris, Hiking, Bird safari, Jungle safari", "1994", "74 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Govind National Park", "Snow Leopard, ck Bear, Brown Bear, Musk Deer, Bharal, Himalayan Thar, Serow, Common Leopard, Monal Pheasant, Koklas Pheasant, Western Tragopan, Himalayan Snow Cock, Golden Eagle, Steppe Eagle, Black Eagle, Bearded Vulture, Pigeons, Parakeets, Cuckoos, Owls, Minivets, Bulbuls, Tits, Warblers, Thrushe, Finches, and Buntings", " Uttarkashi", "Trekking", "1955", "958 km²"));

                sanctuary_informations.add(new Sanctuary_Information("Govind Pashu Vihar Wildlife Sanctuary", "Red Panda, Sambar, Musk Deer, Brown Bear, Bharal, Serow, Snow Leopard, Indian Porcupine, Common Otter, Barking, Deer, Goral, Himalayan Palm Civet, Hedgehog, Sikkim Vole, Himalayan Rat, Hodgson's Fly Squirrel, and Wild Boar, Monal Pheasant, Koklas Pheasant, Western Tragopan, Himalayan Snow Cock, Golden Eagle, Steppe Eagle, Black Eagle, Bearded Vulture, Pigeons, Parakeets, Cuckoos, Owls, Minivets, Bulbuls, Tits, Warblers, Thrushes, Finches, and Buntings", "Uttarkashi", "Trekking", "1955", "485.89 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Great Himalayan National Park", "Bharal, Goral, Serow, Brown Bear, Leopard, Tiger, Snow Leopard, Monal, Khalij Cheer and Tragopan", "Kullu", "Trekking, Camping", "1984", "765 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Great Indian Bustard Wildlife Sanctuary", "Great indina bustard", "Nannaj, Solapur", null, "1979", "1222.61 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Gugamal National Park", "Tiger, Panther, Slo Bear, Wild Dog, Jackal, Hyena, Chausinga, Sambar, Gaur, Barking Deer, Ratel, Flying squirrel, Cheetal, Nilgai, Wild Boar, Langur, Rhesus Monkey, and Macaque", "Chikhaldara and Dharni Tehsils Of Amaravati District", "Melghat jungle safari, Trekking, Bird safari, Meditation", "1987", "361 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Guindy National Park", "Antelope, Black buck, Chital, Jackal, Pangolin, Spotted deer, Jungle cat, Large Indian Civet, River otter, Hyena, Fox, Kingfisher, Golden Backed Woodpecker, Blue Jay, Yellow Wattled Lapwing, Crow Pheasant, Red Wattled Lapwing, Blue Faced Malkoha, Koels, Shrikes, Doves, Munias, Minivets, Barkets, Gray Partridge, Parakeets, Tailor Birds, Drongos, Robins, Quails, Flycatcher, Beak Paradise, Stone Curlew, Teals, Garganeys, Pochards, Medium Egrets, Large Egrets, Night Herons, Pond Herons and Open-billed Storks", "Guindy Taluk, Chennai District", "Bird safari, Jungle safari", "1976", "3 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Gulf of Mannar Marine National Park", "Turtles, Coral Reefs, Dugong, Dolphins and Balano-glossus", "Tuticorin and Ramanathapuram Districts near Mandapam", null, "1986", "6 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Gumti Wildlife Sanctuary", null, "South Tripura", null, "1988", "389.54 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Harike Lake and Wetland Wildlife Sanctuary", "White-winged Tern, Hen Harrier, Yellow-eyed Pigeon, Pallas's Gull, Cotton Pygmy Goose, Tufted Duck, Yellow-crowned Woodpecker, Watercock, Brown-headed Gull, Great Crested Grebe, White-browed Fantail, Black-headed Gull, Yellow-legged Gull, Indian Skimmer, White-rumped Vulture, Eurasian Sparrow hawk, Eurasian Hobby, Horned Grebe, Black-necked Grebe, Brown Shrike, Common Wood shrike, White-tailed Stonechat, White-crowned Penduline Tit, Rufous-vented Prinia, Striated Grass bird, Cetti's Bush Warbler and the Sulphur-bellied Warbler, Jungle cat, Smooth Indian Otter, Mongoose, Jackal and Indian wild Boar", "Firozpur", "Jeep Safari", "1982", "86 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Hazaribagh National Park", "Tiger, Panther, Wild Boar, Sambar, Nilgai, Chital and Sloth Bear", "Jharkhand", "Sanctuary takes motorists to the remotest corners, to masonry towers, watchtowers that provide perfect hideouts to see the wildlife", "1976", "186.25 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Hemis National Park", "Snow Leopard, Ibex, Bharals, Wolf, Wild Dogs, Marmots, Tibetan Wild Ass, Wooly Hares, and Stone Martens", "Eastern part of Ladakh", "Trekking, Hiking, Camping, Jeep Safari, biking, Home Stay in village homes", "1981", "600 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Indira Gandhi Wild Life Sanctuary", "Tiger, Leopard, Sloth Bear, Dhole or the Asiatic Wild Dog, Golden Jackal, Leopard Cat, Jungle Cat, Rusty-spotted Cat, Elephant, Gaur, Sambar, Spotted Deer, Barking Deer, Mouse Deer, Wild Pig, Nilgiri Langur, Common Langur, Bonnet Macaque, Lion-tailed Macaque, Common Palm Civet, Small Indian Civet, Common Mongoose, Striped-necked Mongoose, Ruddy Mongoose, Smooth Indian Otter, Slender Loris, Indian Giant Squirrel, Spiny Dormouse, Porcupine, Indian Pangolin, Giant Flying Squirrel and Three-striped Palm Squirrel, Cormorants, Ducks, Teal, Darter, Partridge, Quail, Jungle Fowl, Spur Fowl, Pea Fowl, Parakeets, Hornbills, Barbets, Drongos, Orioles, Shrikes, Warblers, Flycatchers, Woodpeckers, Chloropsis, Trogons, Kingfishers, Storks, Egrets, Fish Eagle, Hawk Eagles, Harriers, Falcons, Kites, Owls, Nightjars, Toads, Leaping Frogs, Torrent Frogs, Tree Frogs, Pythons, Cobras, Kraits, Vipers, Grass Snakes, Forest Cane Turtles, Travancore Tortoises, Flapshells, Star Tortoises, Flying Lizards, Chameleons and Forest Calotes", "Anamalai Ranges in Coimbatore District", "Trekking, Elephant safaris", "1972", "841.49 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Indravati National Park", "Wild Buffalos, Barasinghas, Tigers, Leopards, Gaurs (Indian Bison), Nilgai, Sambar, Chausingha (four-horned Antelope), Sloth Bear, Dhole (Wild Dog), Striped Hyena, Muntjac, Wild Boar, Flying Squirrel, Porcupine, Pangolins, Monkeys and Langurs, Freshwater Crocodile, Monitor Lizard, Indian Chameleon, Common Krait, Indian Rock Python, Cobra, Russell's Viper, Hill Maina", "Jagdalpur - Bhopalpattanam road", "Trekking", "1981", "2799 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Intanki National Park", "Elephant, Hoolock Gibbon, Mithun, Sambar, Barking Deer, Goral, Flying Squirrel, Wild Dog, Tiger, Sloth Bear, Kaleej and common pheasant, Hornbill and Black Stor", "Intanki", "Adventure Bird safari, Jungle safari", "1993", "202 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Jaikwadi Wildlife Sanctuary", null, "Aurangabad & Ahmednagar districts", null, "1986", "361.05 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Jaldapara Wildlife Sanctuary", "Leopard, Asiatic one horned Rhino, Elephant, Indian Bison, Royal Bengal Tiger, Spotted Deer, Hog Deer, Pied Hornbill, Racket-tailed Drongo, Paradise Flycatcher, Crested Eagle, Pallas's Fishing Eagle, Shikra, Jungle Fowl, Peafowl, and Partridges", "Alipurduar", "Elephant ride, Jeep safari", "1941", "217 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Kalatop-Khajjiar Wildlife Sanctuary", "Leopard, Bear, Himalayan Black Marten, Deer, Barking Goral, Squirrel, Serow, Jackal, Langur, and Blackbird", "Chamba District", "Trekking, Jungle Safari", "1958", "17.17 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Kalesar National Park", "Leopard, Bear, Chital, Sambar, Wild Goat, Deer, Wild bore Baking, Red Jungle, Grey-hooded Warbler, Red-billed Blue Magpie, Crested Serpent Eagle, Bar-tailed Treecreeper, Chestnut-bellied Nuthatch, Grey-capped Pygmy Woodpecker, Blue-bearded Bee-eater", "Chhachhrauli, Yamunanagar", "Bird safari", "1996", "54.06 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Kalsubai Harishchandragad Wildlife Sanctuary", null, "Ahmadnagar", null, "1986", "361.71 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Kamlang Wildlife Sanctuary", null, null, null, "1989", "783 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Kanger Ghati National Park", "Panther, Chital, Chousing, Sambar, Chinkara Tiger, Barking Dear, Mouse Deer, Wild Boar, Wild Dogs, Jungle Cat, Langoor, Black buck, Jackals, Wolf, Hyena, Fox, Hare, Kobra, Kraits, Python, Monitor lizards, Steppe eagle, Blue bearded lace eater, Peacock, Jangli Murgi, Red Spur Fall, Phakta, Bhura Teetar, Kala Teetar, Tree Pie, Drongo, Hill Myna, Spotted Owlet, Red Jungle Fowls, Racket-tailed Drongos, Parrots, Steppe Eagles, Red Spur Fall, Phakta, Bhura Teeter, Tree Pie and Heron, Python, Cobra, Karait, Dhaman, Flying Snake, Green Snake", "Bastar District", "Bird safari, Jungle safari", "1982", "200 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Kanha National Park", "Tiger, Bison, Gaur, Sambar, Chital, Barasingha, Barking Deer, Black Deer, Black Buck, Chousingha, Nilgai, Mouse Deer, Sloth Bear, Jackal Fox, Porcupine, Hyena, Jungle Cat, Python, Pea Fowl, Hare, Monkey, Ongoose, Tiger, and Leopard, Storks, Teals, Pintails, Pond Herons, Egrets, Peacock, Pea Fowl, Jungle Fowl, Spur Fowl, Partridges, Quails, Ring Doves, Spotted Parakeets, Green Pigeons, Rock Pigeons, Cuckoos, Papihas, Rollers, Bee-eater, Hoopoes, Drongos, Warblers, Kingfishers, Woodpeckers, Finches, Orioles, Owls, and Flycatchers", "Mandla District", "Elephant Safari, Kanha Museum", "1955", "940 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Karanja Sohal Blackbuck Wildlife Sanctuary", "Blackbuck", "Karanja", null, "2000", "18.32 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Karikili Bird Sanctuary", "Cormorants, Egrets, Grey Heron, Open-billed stork, Darter, Spoonbill, White lbris, Night Herons, Grebes, Grey Pelican, Shovellers, Pintails, Stilts and Sandpipers", "Kanchipuram District", "Picnic spots, Bird safari", "1989", "0.61 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Karnala Wildlife Sanctuary", "Four-horned antelope, wild boar, common langur, Grey-fronted Green-pigeon, Nilgiri Woodpigeon, Malabar (Blue-winged) Parakeet, Malabar Grey Hornbill, White-cheeked Barbet, Malabar Lark, Small Sunbird, Vigor's Sunbird, Ashy minivet, three-toed kingfisher, Malabar trogon, Slaty-legged Crake, and Rufous-bellied Eagle", "Panvel, Raigad", null, "1968", "4.48 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Kasu Brahmananda Reddy National Park", "Pangolin, Small Indian Civet, Peacock, Jungle Cat, Civets, Wild Boars, Hares, Porcupines, Mongooses, Monitor Lizards, Peafowls, Partridges, Quails, Pythons and Cobras", "Jubilee hills in Hyderabad", "Bird safari, Jungle safari, Nature walks, Jogging, Photography", "1994", "1 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Katepurna Wildlife Sanctuary", null, "Kothali, Akola", null, "1988", "73.63 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Kawal Wildlife Sanctuary", null, "Adilabad", null, "1965", "892.23 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Kaziranga National Park", "One Horned Indian Rhino, Indian Elephants, Indian Bison, Swamp Deer or Barasingha, Hog Deer, Sloth Bears, Tigers, Leopard Cats, Jungle Cats, Otters, Hog Badgers, Capped Langurs, Hoolock Gibbons, Wild Boar, Jackal, Wild Buffalo, Pythons, Monitor Lizards, Oriental Honey Buzzard, Black-Shouldered Kite, Black Kite, Brahminy Kite, Pallas's Fishing Eagle, White Tailed Eagle, Grey-Headed Fishing Eagle, Himalayan Griffon, Greylag Geese, Bar-Headed Geese, Ruddy Shelduck, Gadwall, Falcated Duck, Red-Crested Pochard and Northern Shoveller", "Bokakhat", "Elephant Safari, Sightseeing in Kaziranga, Jeep Safari", "1974", "430 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Keibul Lamjao National Park", "Sangai, Thamin Deer, Assamese Macaques, Stump-Tailed Macaques, Hoolock Gibbon, Hog Deer, Sambar, Muntjac, Viverra Zibetha, Indian Civet Viverricula indica, common otter, wild boar, Hooded Crane, Black Eagle, Shaheen Falcon, Brown-backed Hornbill, Rufousnecked Hornbill, Wreathed Hornbill, the Pied Hornbil, Great Pied Hornbill, Tortoise, Viper, Krait, Cobra, Python, Common Lizard", "Keibul Lamjao, Bishnupur District", "Bird safari, Jungle safari", "1977", "40 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Ken Gharial Sanctuary", "Gharial, Chinkara, Chital, Wild Boar, Blue Bull and Peacock", "Chhatarpur District", "Boating, Jungle Safari", "1981", "45.2 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Keoladeo National Park", "Golden Jackal, Striped Hyaena, Fishing Cat, Jungle Cat, Nilgai, Sambar, Blackbuck, Wild Boar, Pythons, Spotted Deer, Sambars, Blue Bull, Black Buck, Jackals, Otters, Fishing Cats, Monitor Lizards, Solitary Lapwing, Indian Courser, Imperial, White-tailed, Greater and Indian Spotted Eagles, Darters, Black-necked, Painted and Asian Openbill Storks, Common, Sarus and Demoiselle Cranes, Dalmatian Pelicans, Black Bittern, Greater Painted Snipe, Large-tailed, Indian and Grey Nightjars, Dusky Eagle Owls, Marshall's lora, Siberian Rubythroat and Brook's Leaf Warblers", "Bharatpur", "Elephant Safari, Bird safari", "1981", "232 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Khangchendzonga National Park", "Musk Deer, Snow Leopard, Himalayan Tahr, Wild dog, Sloth bear, Civet, Himalayan black bear, Red panda, Tibetan wild ass, Blue sheep, Serow, Goral, Takin, snake, Russels viper, Blood Pheasants and Satyr Trago", "North Sikkim District", "Bird safari, Jungle safari, Trekking", "1977", "850 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Khokhan Wildlife Sanctuary", "Himalayan Black Bear, Himalayan Tahr, Barking Deer, Leopard, Musk Deer, Wolf, Blue Sheep, Indian Giant Squirrel, Monal, Khaleej, Ducks, Hornbills, Stripped Parrots and various pheasants", "Kullu District", null, "1954", "14.94 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Kishanpur Wildlife Sanctuary", null, null, null, "1972", "227 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Kishtwar National Park", "Brown Bear, Leopard, Snow Leopard, Himalayan Musk Deer, Hangul Cervus and Ibex Capra ", "Kishtawar District", "Waterfalls, Trekking, Sapphire Mines Of Paddar", "1981", "310 km²"));

                sanctuary_informations.add(new Sanctuary_Information("Koyana Wildlife Sanctuary", "Bengal tigers, Indian leopards, Indian bison, sloth bears, sambar deer, barking deer, mouse deer, common gray langurs, smooth-coated otters and Indian giant squirrels, heart-spotted woodpecker, rufous woodpecker, and brown-capped pygmy woodpecker, Asian fairy bluebird, long-tailed nightjar and crested goshawk.", "Koyana Nagar, Satara District", null, "1985", "423.55 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Kudremukh National Park", "Tiger, Leopard, Wild Dog, Jackal, Lion-tailed Macaque, Common Langur, Sloth Bear, Gaur, Sambar, Spotted Deer, Barking Deer, Malabar Giant Squirrel, Giant Flying Squirrel, Porcupine, and the Mongoose, Malabar trogon, Great Pied Hornbill, Malabar Whistling Thrush, Imperial Pigeon, Snakes and Tortoises", "Chikmagalur District", "Bird safari, Jungle safari, Trekking", "1987", "600 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Kumbhalgarh Wildlife Sanctuary", "Wolf, Leopards, Sloth Bear, Hyena, Jackal, Jungle Cat, Smabhar, Nilgai, Chaisingh (the four horned Antelope), Chinkara and Hare,Red Spur Owls, Parakeets, Golden Oriole, Bulbul, Peacock, Dove, Grey Pigeons and White Breasted Kingfisher are traceable near the water holes", "Rajsamand District", "Bird safari, Jungle safari, Swimming, Trekking, Foot tracking, Jeep, Horse safari", "1971", "608.58 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Lakshadweep Islands", "Tharathasi (Sterna fuscata) and Karifetu (Anous solidus), Parrot Fish (Callyedon sordidus), Butterfly Fish (Chaetodon auriga) and Surgeon Fish (Acanthurus lineotus)", "Arabian Sea", "Boating, Swimming, Wind-surfing, Scuba Diving, Snorkeling, Kayaking", "1956", "32 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Little Rann of Kutch", "Pelicans, Asiatic Wild Ass, Gazelle, Blue Bull, Wolf, Indian Foxes, Jackal, Jungle Cat, Hare, Chinkaras, Houbara bastard, Sandgrouse, Desert Chat, Desert Wheat Ear, Larks, Quails, Gray francolin, Nawa Talao, Vanod Saran, Flamingoes, Cranes, Storks, and Ducks", "Dasada", "Bird safari, Jungle safari, Jeep, Camel Cart Safaris, Horse Back Riding", "1972", "4950 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Lonar Wildlife Sanctuary", null, "Nagpur", null, "2000", "1.17 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Madhav National Park", "Tiger, Leopard, Chital, Sambar, Blue Bull, Chinkara, four-horned Antelope (Chousingha), Wild Boar, and Monkey", "Gwalior", "Park Safaris, Tiger Safari, Bird safari", "1959", "354 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Maenam Wildlife Sanctuary", "Red Panda, Goral, Serow, Barking Deer, Marbled-Cat, Leopard-Cat, Civet-Cats, Blood Pheasant, Common Hill Partridge, Magpies, Black Eagle, Blue necked Pitta, Woodcock, Crested Serpent Eagle, Crimson Horned Pheasant, Green Pigeon, Speckled Wood Pigeon, Spotted Dove, Rufous Turtle Dove, Common Hawk Cuckoo, Warbler, Tree Sparrow, Common Rose Finch, Redheaded Bullfinch, Goldheaded Black Finch, and Sunbirds", "Maenam, South Sikkim District", "Trekking", "1969", "35.34 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Mahananda Wildlife Sanctuary", "Himalayan black bear, leopards, rare mountain goats (serow), porcupines, golden cats, sambar, spotted & barking deer, Indian bison (gaur), wild boars, black capped languor, Himalayan pied hornbills, peafowls, peacocks, fouls, egrets, king fishers, fly catchers, racket tail drongo, Assamese macaque, robins, woodpeckers", "Darjeeling & Jalpaiguri", null, "1976", "158.04 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Mahatma Gandhi Marine National Park", "Wild Boar, Spotted Deer, Civet, Fruit Bat, Krait, Cobra, King Cobra, Vine Snake and Python, Serpent Eagle, White Bellied Sea Eagle, Local Teal, Whistling Teal, Pigeon, Dove, Tern, Kingfisher, Wader, Swift, Reef Heron and Parakeet", "Wandoor", "Boating, Diving, Snorkeling, Camping", "1983", "282 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Mahavir Harina Vanasthali National Park", "Black Buck, Cheetahs, Wild Boar, Monitor Lizards, Mongooses and Porcupines, Partridges, Quails, Peacocks, Doves, Pond Herons, Egrets, Kingfishers, Cormorants, Kites, and Vultures", "Vanasthalipuram", "Bird safari, Jungle safari, Jungle safari", "1975", "15 km²"));


        sanctuary_informations.add(new Sanctuary_Information("Malvan Marine Wildlife Sanctuary", "Black- headed gulls,terns, plovers, water-fowl, ducks, egrets", "Sindhudurg", null, "1987", "29.122 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Manas National Park", "Tiger, Golden Langur, Wild Buffalo, Hispid Hare, Pigmy Hog, Capped Langur, Indian one-horned Rhinoceros, Elephant, Gaur, Hog Deer", "Kamrup-Golapara District", "Jeep Safaris, Boat safaris, Elephant safaris", "1990", "391 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Mansingdeo Wildlife Sanctuary", "Tiger, Sloth Bear, Leopard, Bison, Sambhar Deer, Nilgai, Wild Boar, Jungle Cats, Barking Deer & Birds", "Nagpur", null, "2010", "182.59 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Marine National Park", "Dugong, Gangetic Dolphin, Jackal, Jungle Cat, Black-naped Hare, Green Sea-turtle, Leatherback Turtle, Common Monitor, White-tailed Eagle, Imperial Eagle, Steppe Eagle, Montagu's Harrier, Pallid Harrier, Black-shouldered Kite, Common Kestrel, Laggar Falcon, and Peregrine Falcon", "The Gulf of Kutch, Jamnagar District", "Coral Reef Formations", "1982", "1186 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Mathikettan Shola National Park", "Asiatic Elephant, Indian Gaur", "Poopara Village, Idukki District", null, "2003", "13 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Mayureshwar Wildlife Sanctuary", "Chinkara, Wolf, Indian fox", "Supe, Baramati", null, "1997", "5.15 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Melghat Tiger Reserve", "Tiger, Leopard, Sloth Bear, Wild Dog, Jackal, Sambar, Gaur, Barking Deer, Nilgai, Chital, Chausingha, Ratel, Flying Squirrel, Wild Boar, Langur, Rhesus Monkey, Porcupine, Pangolin, Mouse Deer, Python, Otter, Caracal, Blacknaped Hare", "Amravati District", "Bird safari, Jungle safari", "1974", "778.75 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Middle Button Island National Park", "Dugong, Dolphin, Water monitor, Lizard, Blue Whale", "Andaman District", "Scuba Diving, Snorkeling", "1979", "62 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Mollem National Park", "Tiger, Black panther, Leopard, King Cobra, Deer, Gaur, Monkeys, Elephant, Sloth bear, Flying squirrel, Malayan Giant squirrel, Porcupine, Civet, Cat, Jungle fowl, Indian Black Woodpecker, the Malabar Pied Hornbill, Paradise Flycatcher, Fairy Blue Bird, Drongo, Wag tails, Barbets, Great Indian Horn Bill, Kingfishers, Shrikes, Emerald Dove and Grey Jungle Fowl", "North Goa District, Sanguem Taluk", "Bird safari, Jungle safari, Jeep Safari", "1978", "107 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Mouling National Park", "Takin, Coral, Serow, Wild buffalo, Tiger, Panther, Red panda, Elephant, Hog dear, Barking deer, Sambar, Python", "Upper Siang District", "Trekking, Hiking, Angling at river Siyom.", "1986", "483 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Mount Abu Wildlife Sanctuary", "Panther, Sambar, Jungle Cat, Small Indian Civet, Wolf, Hyaena, Jackal, Indian Fox, Common Langoor, Wild Boar, Pangolin, Common Mongoose, Indian Hare, Porcupine, Hedgehog, Sloth Bear", "Aravali Ranges", "Sightseeing, Trekking, Eco-Tourism, Rowboats, Motorboats, Boats shaped like swans.", "1960", "112.98 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Mount Harriet National Park", "Crocodile, Andaman Wild Pig, Salt Sater, Turtle, Robber, and Crab", "Andaman District", null, "1979", "47 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Mrugavani National Park", "Wild Boar, Jackals, Foxes, Porcupines, Black naped Hare, Monitor lizards, Forest Cat, Civet Cat, Mongoose, Cheetal or Spotted deer, Sambar, Pythons, Cobra, Rat Snakes, Russell s Viper, Monitor Lizard, Peacocks, Quails, Warblers, Babblers, Flower Peckers, Partridges, Lapwings, Ducks and Curlews", "Chilkur", "Nature Walk, Bird safari, Safari Ride", "1994", "4 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Mudumalai Wildlife Sanctuary", "Elephants, Gaur, Banner, Macaque, Common Langur, Tigers, Leopards, Chital, Panther, Sloth Bear, Python, Barking Deer, Four Horned Antelope, Otter, Crocodiles (Mugger), Giant Flying Squirrel, Sambar, Hyena, Wild Dog, Wild Boar, Mouse Deer, Spotted Deer, Jackal, Hare, Porcupine, Mongoose, Peacock, Grey Jungle Fowl, Red Spur Fowl, Grey Partridge Quails, Goggle Eyed Plower, Malabar Whistling Thrush, Large Racket-Tailed Dronge, The Magpie-robin, Spotted Babbler, Small Green Barbet, Green Pigeons, Brown Dove, Malabar Grey Hornbill, Bulbuls, Mynahs, Eagles, Hawks, Buzzards, Harriers, Falcons and King Vulture", "Nilgiri District", "Elephant Safaris, Trekking, Bird safari, Jungle safari", "1942", "217.76km²"));

        sanctuary_informations.add(new Sanctuary_Information("Mukurthi National Park", "Nilgiri Tahr, Indian Elephant, Bengal Tiger, Nilgiri Marten, Nilgiri Langur, Bonhote's Mouse, Leopard, Bonnet Macaque, Sambar Deer, Barking Deer, Mouse Deer, Otter, Jungle Cat, Small Indian Civet, Wild Dog, Jackal, Black-naped Hare, Common Rat, Shrew, Malabar Spiny Dormouse and Soft-furred Rat, Laughing Thrush, Whistling Thrush, Woodcock, Wood Pigeon, Black-and-orange Flycatcher, Nilgiri Flycatcher, Grey Headed Flycatcher Black Bulbul, White-eye, Nilgiri Pipit, blue admiral butterfly, Indian red admiral butterfly and Rainbow trouts", "Nilgiri District", "Trekking, Camping", "2001", "78 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Mukurthi National Park", "Nilgiri Tahr, Indian Elephant, Bengal Tiger, Nilgiri Marten, Nilgiri Langur, Bonhote's Mouse, Leopard, Bonnet Macaque, Sambar Deer, Barking Deer, Mouse Deer, Otter, Jungle Cat, Small Indian Civet, Wild Dog, Jackal, Black-naped Hare, Common Rat, Shrew, Malabar Spiny Dormouse and Soft-furred Rat, Laughing Thrush, Whistling Thrush, Woodcock, Wood Pigeon, Black-and-orange Flycatcher, Nilgiri Flycatcher, Grey Headed Flycatcher Black Bulbul, White-eye, Nilgiri Pipit, blue admiral butterfly, Indian red admiral butterfly and Rainbow trouts", "Nilgiri District", "Trekking, Camping", "2001", "78 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Murlen National Park", "Tiger, Leopard, Sambar, Barking Deer, Himalayan Black Bear, Serow, Hoolock Gibbon, Rhesus Macaque, Malayan Giant, Squirrel, Hume's Pheasant, Kallej Pheasant, Common Patridges, Hill Myana, Dark Rumped Swift", "Champhai District", "Bird safari, Jungle safari, Trekking", "1991", "100 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Nagarhole National Park", "Sambar, Chital or Spotted Deer, Muntjac or Barking Deer and Mouse Deer, Tiger, Leopard, India Wild Dog, Sloth Bear and the Hyena, Aquatic and terrestrial Tortoises, Frogs, Toads and Tree Frogs and Myriad insects, including some very colourful butterflies, Grey-headed Fishing Eagle, Crested Hawk Eagle, Serpent Eagle, Honey Buzzard, Shaheen Falcon, Hobby Falcon and the King Vulture, Malabar Trogon, Blue-bearded Bee-eater, Malabar Pied Hornbill, Great Black Wood Pecker, Alexandrine Parakeet, Lesser Coucal, Scarlet Minivet, Indian Pitta, Fairy Blue Bird, Scimitar Babbler, Paradise Flycatcher, Malabar Whistling Thrush, Green Imperial Pigeon, Yellow-legged Green Pigeon and Racket-tailed Drongo", "Kodagu and Mysore", "Brahmagiri Mountains for trekking", "1988", "643km²"));

        sanctuary_informations.add(new Sanctuary_Information("Nagzira Wildlife Sanctuary", "Tiger, Indian gaur, sambar, nilgai, chital, wild boar, sloth bear, Barking Deer, Mouse Deer and wild dog", "Gondia District", null, "1970", "152.81 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Naigaon Peacock Wildlife Sanctuary", null, "Patoda, Beed", null, "1994", "28.89 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Namdapha National Park", "Tiger, Leopard, Clouded Leopard, Snow Leopard, Satyr Tragopan, Kalij, Monal Pheasants, Giant Hornbill, Forest Eagle Owl, White-winged Wood Duck, Indian Python, Reticulated Python, King Cobra", "Margherita", "Jungle safari, Elephant ride, Trek", "1972", "1985 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Nameri National Park", "Leopard, Elephant, Bison, Assamese Macaque, Bengal Fox, Civet Cat, Mouse Deer, Tiger, Jungle Cat, Indian Porcupine, Indian Pangolin, Sambar, Dhole(wild dog), Hog Deer, Muntjac, Wild Boar, Sloth Bear, Himalayan Black Bear, Capped Langur, Malayam Giant Squirrel, White winged wood duck, Great Pied Hornbill, Wreathed Hornbill, Rufous Necked Hornbill, Black Stork, Ibis Bill, Large Whistling Teal, Common Mergernser, King Vulture, Long Billed Ring Plover, Khallej Pheasant, Hill Myna Pin tailed green Pigeon, Himalayan pied Kingfisher, Three Toed kingfisher, Fairly Blue Bird, King cobra, cobra, Pit Viper, Russels Viper, Banded Krait, Python, Rat Snake, Assam Roof Turtle, Malayan Box Turtle, Keeled Box turtle, Asian Leaf Turtle, Narrow Headed soft Shelled Turtle, Indian soft Shelled Turtle", "Sonitpur District", "Bird safari, Jungle safari, Elephant Ride, Boat ride, Picnic to Bhalukpung on the sandy beaches of Jia Bhoroli River, Tipi", "1998", "200 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Nanda Devi National Park", "Bharal, Himalayan Tahr, Serow, Goral, Snow Leopard, Himalayan Black Bear, Brown Bear, Leopard, Common Langur, Himalayan Musk Deer, Brown Beer, Warblers, Gresbreaks, Rose Finches and Ruby Throat", "Chamoli", "Mountaineering, trekking", "1980", "630 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Nandankanan National Park", "White Tigers, Asiatic Lion, Gharial Crocodiles, Lion-tailed Macaque, Nilgiri Langur, Indian Pangolin, Mouse Deer", "Bhubaneshwar", "Boating, white tiger, lion safaris, nocturnal animal house, reptile park, aerial ropeway, cable car", "1960", "14.16 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Nandur Madhameshwar Wildlife Sanctuary", null, "Nashik", null, "1986", "100.12 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Narnala Bird Wildlife Sanctuary", null, "Akola", null, "1997", "12.35 km²"));

        sanctuary_informations.add(new Sanctuary_Information("National Chambal Sanctuary", "Dolphin, Crocodile, Alligator (Gharial), Chinkara, Sambar, Nilgai, Leopard, Chital, Hyena, Wolf, Wild Boar, Bar-headed Goose, Ruddy Shelduck, Bar-headed Goose, Ruddy Shelduck, Gadwall, Red-crested Pochard, Brown-headed Barbet, Lesser Coucal, Brown Hawk Owl, Green Sandpiper, Kentish Plover, River Lapwing, Great Thick-knee and Lapwing, Osprey, Booted Eagle, Black-bellied Tern, River Tern, Black Ibis, Jungle Babbler and White Wagtail", "Etawah, Agra District", "Bird safari", "1979", "635 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Navegaon National Park", null, "Gondia District, Nishani", null, "2012", "122.76 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Neora Valley National Park", "Clouded Leopard, Red Panda, Musk Deer, Leopard, Civet, Black bear, Sloth bear, Golden cat, Wild boar, Leopard cat, Goral, Serow, Barking deer, Sambar, Himalayan flying squirrel, King cobra, common cobra krait, green pit viper, blind snake, Butterflies, Rufous-throated Partridge, Satyr Tragopan, Crimson-breasted Woodpecker, Darjeeling Woodpecker, Bay Woodpecker, Golden-throated Barbet, Hodgson's Hawk Cuckoo, Lesser Cuckoo, Brown Wood Owl, Ashy Wood Pigeon, Mountain Imperial Pigeon, Jerdon's Baza, Black Eagle, Mountain Hawk Eagle, Dark-throated Thrush, Rufous-gorgeted Flycatcher, White-gorgeted Flycatcher, White-browed Bush Robin, White-tailed Robin, Yellow-browed Tit, Striated Bulbul, Chestnut-headed Tesia, Chestnut-crowned Warbler, Black-faced Warbler, Black-faced Laughingthrush, Chestnut-crowned Laughingthrush, Streak-breasted Scimitar Babbler, Scaly-breasted Wren Babbler, Pygmy Wren Babbler, Rufous-fronted Babbler, Black-headed Shrike Babbler, White-browed Shrike Babbler, Rusty-fronted Barwing, Rufous-winged Fulvetta, Brown Parrotbill, Fire-breasted Flowerpecker, Fire-tailed Sunbird, Maroon-backed Accentor, Dark-breasted Rosefinch, Red-headed Bullfinch and Gold-naped Finch", "Kalimpong, Darjeeling District", "Bird safari, Jungle safari", "1986", "88 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Netravali Wildlife Sanctuary", null, null, null, "1999", "211.05 km²"));

        sanctuary_informations.add(new Sanctuary_Information("New Bor Wildlife Sanctuary", null, "Hingani, Wardha", null, "2012", "60.7 km²"));

        sanctuary_informations.add(new Sanctuary_Information("New Nagzira Wildlife Sanctuary", null, "Nagpur", null, "2012", "151.33 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Neyyar Wildlife Sanctuary", "Tiger, Leopard, Sloth bear, Elephant, Sambar, Barking deer, Bonnet macaque, Nilgiri Langur, Nilgiri tahr, Gaur, Jungle Cat, Wild Boar, Cobras, Vipers, Pythons, Rat Snakes, Flying Snakes and Lizards,King Fishers, White-breasted Water Hen, Little Green Heron, Woodpeckers, Indian Cuckoos, Gray Jungle Fowl, Common Mynas, Indian Hill Mynas, Darters, Little Cormorants, Little Egrets and Brahminy Kites", "Thiruvananthapuram", "Trekking, Lion Safari, Boating", "1958", "128 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Nokrek National Park", "Languor, Clouded Leopard, Leopard Cat, Fishing-Cat, Golden Cat, Pangolin, Wild Buffalo, Elephant, Serow, Tiger, Python, Hornbill, Peacock, Pheasant, Hollock", "West Garo Hills District", "Trekking, Rock Climbing", "NA", "68 km²"));

        sanctuary_informations.add(new Sanctuary_Information("North Button Island National Park", "Dugong, Dolphin, Water Monitor, Lizard, Blue Whale", "Andaman District", "Scuba Diving, Snorkeling", "1979", "114 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Orang National Park",
                "Royal Bengal Tiger, Asiatic Elephant, Hog Deer, Wild Boar, Civets, Leopards, Hare, Porcupines, One-horned rhinoceros, Sambar, Barking deer, Tiger, Spot-billed Pelican (Pelicanus philippensis), Black-necked Stork (Ephippiorhynchus asiaticus), Greater Adjutant Stork (Leptoptilos dubius), Lesser Adjutant (Leptoptilos javanicus), Wooly-necked Stork (Ciconia episcopus), Rudy Shelduck (Tadorna ferruginea), Gadwall (Anas strepera), Mallard (Anas platyrhynchos), Pintail (Anas acuta), Pallas's Fishing Eagle, Lissemys punctata, Pythons and Cobras",
        "Near Darrang and Sonitpur, on the north bank of the Brahmaputra","Elephant Safari","1999" ,"72km²"));

        sanctuary_informations.add(new Sanctuary_Information("Ousudu Wildlife sanctuary", null, null, null, "2008", "3.9km²"));

        sanctuary_informations.add(new Sanctuary_Information("Painganaga Wildlife sanctuary", null, null, "Umarkhed,Yavatmal", "1986", "324.62km²"));

        sanctuary_informations.add(new Sanctuary_Information("Pakhui/Pakke Wildlife sanctuary", null, null, null, "1997", "861.95km²"));

        sanctuary_informations.add(new Sanctuary_Information("Palamu Tiger Reserve", "Chital, Chinkara, Common Langur, Dhole (wild dogs), Elephants, Gaur, Hares, Indian Porcupine, Nilgai, Monkey, Mouse Deer, Leopard, Pangolin, Panther, Sambar, Sloth Bear, Tiger, Wild Boar, Wolves, Peafowl, Red Jungle Fowl and Partridges", "Latehar", "There are elephants of the Department of Tourism, one jeep of the Forest Department to take the tourists around the park with guide, spotlight. Five Watch Towers from where animals can be observed, photographs taken", "1973", "752.94km²"));

        sanctuary_informations.add(new Sanctuary_Information("Palani Hills National Park", "Wild Boar, Indian Elephant, Gaur (Wild Ox), Nilgiri Tahr and Grizzled Giant Squirrel", "Dindigul District", "Bird safari", "Bird safari", "737 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Panna National Park", "Tiger, Wolf, Chital, Sloth Bear, Chinkara, and Sambar", "Districts of Panna and Chhatarpur", "Jeep Safari, Elephant Safari, Night Safari", "1979", "68.14 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Parambikulam Wildlife Sanctuary", "Lion-tailed Macaque, Nilgiri Tahr, Elephant, Tiger, Panther, Wild boar, Sambar, Bonnet Macaque, Nilgiri Langur, Sloth Bear, Nilgiri Marten Small Travancore Flying Squirrel and Gaur, King cobra, Kerala sheildtail, Travancore kukri snake, Travancore wolf snake, Cochin cane turtle, Travancore tortoise, Indian day gecko, Western Ghats flying lizard, Indian rock python, Malabar pit viper, Travancore tortoise, South Indian forest ground gecko, South Indian rock lizard, Mountain skink, Mugger crocodile, Varanus, Pond terapin, Chameleon, Spectacled Cobra, Krait, Green keelback, Olivaceous keelback, Western Rat snake and Vine snake, Lesser adjutant stork, Grey-headed Fish-eagle Peninsular bay owl, Broad-billed roller and Great pied hornbill, Darter, Little Cormorant, Black eagle, Black-capped kingfisher, Great Indian hornbill, and Black woodpecker", "Chittur taluk, Palakkad District", "Trekking, Boating, Bird safari, Jungle safar", "1973", "285 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Patna Bird Sanctuary", "Fishing cat, Jackal, Mongoose, Hare, Nilgai, Monkey and Fox", "Jalesar, Etah District", "Bird safari, Wild Animal Watching", "1990", "1.09 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Pench National Park", "Tigers, Leopards, Jungle Cats, Leopard Cats, small Indian Civets, palm Civets, Sambar, Cheetal, Nilgai, Jackals, Wild Dogs, Sloth Bear, Chinkara, Langoors, Rhesus and Monkeys", "Seoni", "Jeep safari, Elephant safaris", "1975", "118.47 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Periyar Tiger Reserve", "Elephants, Tigers, Otters, Nilgiri Langurs, Common Langurs, Bonnet Macaques, Lion Tailed Macaque, Malabar Squirrel, Wild Boar, Sambar, Barking Deer, Mouse Deer, Nilgiri Tahr, Dhole, porcupines, Gaur and Sloth Bears, Flying Snake, Flying Lizard, Flying Squirrel and the Flying Frog, Pythons, King Cobras, Darters, Cormorants, Ospreys, Kingfishers, Racket Tailed Drongos, fish oWildlife sanctuary, Kites, Great Hornbills, Gray Hornbills, Hill Mynahs, Grey Herons, White Egrets and Orioles", "Thekkady, Idukki District", "Boat rides offered on the Periyar lake provide you with the best chance of observing wild life. Sightings of large herds of elephants, other animals are quite frequent during boat rides", "1950", "427 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Phansad Wildlife sanctuary", "Malbar giant squirrel, Leopard, Jungle Cat, Mouse deer, Small Indian civet, porcupine, Langoor, Bonnet, Macaque, Sambar, Barking deer", "Murud, Raigad, Roha", null, "1986", "69.79"));

        sanctuary_informations.add(new Sanctuary_Information("Phawngpui Blue Mountain National Park", "Goral, Serow, Barking Deer, Sambar, Leopard, Blyth s Tragopan, Kaleej Pheasant, Hoolock Gibbon, Common Langur, Rhesus Macaque, Stump tailed Macaqu", "Chhimtuipui District", "Trekking, Camping, Picnic", "1992", "50 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Pin Valley National Park", "Siberian Ibex, Snow Leopard, Bharal, Wooly Hare, Tibetan Wolf, Red Fox and Snow Cock, Himalayan Snowcock, Chukor, Snow Partridge and the Tibet Snow Finch, Kestrels, Bearded Vulture and Golden Eagle", "Pin Valley", "Trekking", "1987", "675 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Pong Dam Wetlands", "Nilgai, Samber, Barking Deer; Wild Boar, Clawless Otter and Leopard, Black Headed Gulls, Brahminy Ducks, Bar Headed Geese, Plovers, Grebes, Cormorants, Daters, Herons, Moorhens, Egrets and Storks", "Kangra", "Boating, Bird safari, Fishing, Jeep Drive", "1982", "207.59 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Pulicat Lake Bird Sanctuary", "Flamingo, Squat, Flocks, Spotbilled Pelican, Curlews, Stilts, Plovers, Sand Pipers, Lapwings, Redshank, Egrets, Herons, and Kites", null, "Trekking, Bird safari, Aquqtic sports", "1976", "153.67 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Radhanagari Wildlife sanctuary", "Wildlife Indian bison or gaur, Indian leopard, sloth bear, wild boar, barking deer, mouse deer, sambar, giant squirrel, wild dogs, vultures, eagles, jungle fowl, quails, plovers, sandpipers, owlets, doves, oWildlife sanctuary, nightjars, kingfishers, bee-eater, hornbills, woodpeckers, bulbul, flycatchers, warblers, wagtails, sunbirds", "Radhanagari, Kolhapur District", null, "1958", "351.16 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Rajaji National Park", "Leopard, Jungle Cat, Elephants, Himalayan Yellow Throated Marten, Sambar, Cheetal, Barking Deer, Wild Boar, Slothy Bear, Langoor, Goral, Monitori Lizard, Python, Civet, King Cobra, Pea Fowl, Jungle fowl, Kaleej Phaeasant, Horn-Bill, Wood Pecker, Thrushes King Fisher, Parakeet, Warbler, Barbet finch, Indian Roller, and Oriole", "Shivalik hills of Dehradun, Haridwar and Pauri Garhwal Districts", "Wildlife Jeep Safaris, Elephant Safari, Bird safari", "1983", "820 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Rajiv Gandhi National Park", "Elephant, Jackal,Tiger, Panther, Gaur, Muntjac, Sambar, Spotted deer, Elephant, Mongoose, Civet cat, Hyena, King Cobra, Krait, Python, Viper, Tortoise, Monitor Lizard,Toads, bee-eater, bulbul, dove, moorhens, Brahmini Kites, Crested Hoopoe and Serpant, Malabar pied Hornbills, Alexandrine, Peacock, paradise Flycatcher, Minivets, Woodpecker, Warbler, Great Indian Reed, Eagle, Crested Hawk and Golden-back Parakeet", "Kodagu, Mysore District", "Bird safari, Jungle safari, Elephant Safari, Jeep safari, Trekking", "1975", "643 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Rani Jhansi Marine National Park", "Crocodile and Dugong", "Andaman District", null, "1986", "256 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Ranthambore National Park", "Tigers, Leopards, Striped Hyenas, Sambar Deer, Chital, Nilgai, Common or Hanuman Langurs, Macaques, Jackals, Jungle Cats, Caracals, Sloth Bears, Black Bucks, Rufoustailed Hare, Indian Wild Boar, Chinkara, Common Palm Civets or Toddy Cat, Coomon Yellow Bats, Desert Cats, Fivestriped Palm Squirels, Indian False Vampires, Indian Flying Foxes, Indian Foxes, Indian Gerbilles, Indian Mole Rats, Indian Porcupines, Longeared Hedgehogs, Ratels, Small Indian Mongoose, Small Indian Civets, Common mongoose, Snub Nosed Marsh Crocodiles, Desert Monitor Lizards, Tortoise, Banded Kraits, Cobras, Common Kraits, Ganga Soft Shelled Turtles, Indian Pythons, North Indian Flap Shelled Turtles, Rat Snakes, Russel's Vipers, Saw-scaled Vipers, the Indian Chameleon", "Sawai Madhopur", "Jeep safari, Canter Trips", "1981", "400 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Rehekuri Blackbuck Sanctuary", "Blackbuck, Chinkara, Wolf, Indian Fox", "Karjat, Ahmednagar", null, "1980", "2.17 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Rupi Bhaba Wildlife Sanctuary", "Musk Deer, Himalayan Black Bear, Himalayan Tahr, Brown Bear, Snow Leopard, Fox, Blue Sheep, Ghoral Birds Yellow-billed Chough, Nutcracker, Black-throated Jay, Streaked Laughing Thrush, White-capped Redstart, Orange-flanked Bush Robin, Wren, Black Tit, Wall Creeper, Crested Black Tit, Wagtail and Western Ttragopan", "Kinnaur", "Trekking, Camping", "1982", "503 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Saddle Peak National Park", "Whales, Andaman Wild Pig, Saltwater Crocodile, Andaman Hill Myna, Andaman Imperial Pigeon, Dolphins, Water Monitor Lizard", "Andaman District", null, "1979", "33 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Sagareshwar Wildlife sanctuary", "Sambar Deer, Blackbucks, Barking Deer, Chital, wild boar and peacocks", "Karad", null, "1985", "10.87 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Salim Ali Bird Sanctuary", "Elephant, Leopard, Sloth Bear, Porcupine, Indian Swiftlet (Collocalia unicolor), Malabar Grey-Hornbill (Ocyceros griseus), Changeable Hawk-Eagle (Spizaetus cirrhatus), Oriental Darter (Anhinga melanogaster), Grey Heron (Ardea cinerea), Rufous Woodpecker (Celeus brachyurus) and Great Eared-Nightjar", "Kothamangalam Taluk, Ernakulam district", "Bird safari, Wild Animals Watching", "1983", "25 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Saman Bird Sanctuary", "Jackal, Mongoose, Hare and various local and migratory birds", "Mainpuri District", "Bird safari", "1990", "5.26 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Sambar Salt Lake National Park and Wildlife Sanctuary", "Flamingoes, Northern Shoveller, Blackheaded Gull, Ducks, Geese and Shorebirds", "Sambar Basin", "Bird safari, Jungle safari", null, "190 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Sanjay Gandhi National Park", "Crocodiles, Chital, Rhesus Macaque, Bonnet Macaque, Black Naped or Indian Hare, Muntjac (Barking Deer), Porcupine, Asian Palm Civet, Chevrotain (Mouse Deer), Hanuman or Gray Langur, Indian Flying-fox, Sambar Deer, Pythons, Cobras, Monitor lizards, Daboia (Russell's Viper), Bamboo Pit Viper and Ceylonese Cat Snake", "Borivali, Mumbai", "Lion Safari, Tiger Safari, Trekking", "1969", "104 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Sariska National Park", "Tiger, Leopard, Jungle Cat, Striped Hyena, Wild Dog (Dhole), Jackal, Patel, Sambar, Spotted Deer (Chital), Nilgai (Blue Bull), Chinkara (Indian Gazelle), Chowsingha (Four-horned Antelope), Common Langu, Oriental Honey-buzzard, Lesser Spotted Eagle, Imperial Eagle, Short-toed Eagle, Common Kestrel, Shikra, Dusky Eagle Owl, and Eurasian Eagle Owl", "Alwar", "Jeep Safari, Camel safaris", "1955", "219 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Satkosia Basipalli Sanctuary", "Leopard, Tiger, Striped Hyena, Sambar, Wild Dog or Dhole, Indian Wolf, Sloth Bear, Chital, Barking Deer, Mouse Deer, Chowsingha (Four-Horned Antelope), Nilgai, Wildpig, Gaur, Elephant, Monitor Lizard, Chameleon, Terrapins, Snakes, Gharial, Mugger Crocodile, Fresh water turtle and poisonous and non-poisonous snakes", "North from Phulboni District", "Bird safari, Jungle safari, Gharial breeding, Trekking", "1976", "745.52 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Satmaliya Deer Park", null, "Dapada", null, "2000", "92.16 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Satpura National Park", "Tiger, Leopard, Gaur, Cheetal, Sambar, Bhedki, Nilgai, Four-horned Antelope, Chinkara, Bison (gour), Wild boar, Wild dog, Bear, Black buck, Fox, Porcupine, Flying squirrel, Mouse deer, and Indian joint Barking deer, Crested Serpent Eagles, Crested Hawk Eagles, Honey Buzzards, Paradise Flycatchers, Pittas, Thrushes, Peafowl, Pheasants, Hornbill, Peafowl, Cuckoo, Woodpecker, Kingfisher, Parakeet, Owl, Cormorant, and Heron", "Hoshangabad District", "Bird safari, Jungle safari", "1983", "524 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Senchal Wildlife Sanctuary", "Barking Deer, Wild Pigs, Himalayan Black Bear, Leopards, Jungle Cats, Common Rhesus Monkeys, Assamese Macaque, Himalayan Flying Squirrels", "Senchal, Darjeeling District", "Bird safari, Jungle safari, Picnic spot", "1915", "38.88 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Shoolpaneswar (Dhumkhal) Wildlife sanctuary", null, null, null, "1982", "607.7 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Silent Valley National Park", "Tiger, Leopard, Leopard Cat, Jungle Cat, Fishing Cat, Common Palm Civet, Small Indian Civet,Brown Palm Civet, Ruddy Mongoose, Stripe-necked Mongoose, Dhole, Clawless Otter, Sloth Bear, Flying Squirrel, Indian Pangolin, Porcupine, Wild Boar, Sambar, Spotted Deer, Barking Deer, Mouse Deer and Gaur, Nilgiri Wood-Pigeon, Malabar Parakeet, Malabar Grey Hornbill, White-bellied Treepie, Grey-headed Bulbul, Broad-tailed Grassbird, Rufous Babbler, Wynaad Laughing Thrush, Nilgiri Laughing Thrush, White-bellied Shortwing, Black-and-Rufous Flycatcher, Nilgiri Flycatcher, White-bellied Blue-flycatcher, Crimson-backed Sunbird and Nilgiri pipit", "Palakkad", "Trekking", "1984", "90 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Simlipal Tiger Reserve", "Chausingha, Sambar, Mouse Deer, Chital, Leopards,Elephants, Langurs, Spotted Deer, Barking Deer or Munjtac, Wild Dogs, Wild Boars, Sloth Bears, Gazelles, Nilgai, Ratels, Rhesus Macaque, Chinkaras, Chevrotains, Jungle Cat, Elephants, Hyenas, Porcupines, Monkeys, Jackals, Gaurs, Black-faced Langur Monkey, Crocodiles, Turtles, Snakes, Bison, Monitor Lizards, Panthers, Flying Squirrels, Mongooses, Indian Skimmer, Egrets, Great Cormorants, Red Necked Falcon, Darters, Asian open bill, Black Ibis, Grey Pelicans, Storks, Peafowl, Red Jungle Fowl, Spur Fowl, Indian Pied Hornbill, Hill Myna, Alexandrine Parakeet, Crested Serpent Eagle, Cranes, Flamingoes, and Teals", "Mayurbhanj", "Jeep jungle safaris, tiger tracking, Bird safari, nature walks", "1979", "1354.3 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Sirohi National Park", "Tiger, Leopard, Wild Boar, Deer, Antelopes, Eagles, Vultures, Tits, Warblers, OWildlife sanctuary, and Pheasants", "Sirohi", null, "1982", "41 km²"));

        sanctuary_informations.add(new Sanctuary_Information("South Button Island National","Dugong, Dolphin, Water Monitor, Lizard, Blue Whale","Andaman District", "Scuba Diving, Snorkeling", "1977", "5 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Sri Venkateswara National Park", "Tiger, Panther, Spotted Deer, Ibex, Sloth Bear, Pig, Bear, Bonnet Monkey, Mongoose, Wild Dogs, Sambar, Black Buck, Bison, Jackal, Fox, Civet Cat, Jungle Cat, Rare and Scarce Golden Gecko, Peacock, Jungle Fowl Indian Giant Squirrel, Tree Shrew, Lizards, Partridges, Quail, Crested Serpant Eagle, Ashy Crowned Finch Lark, Indian Roller, Kingfishers, White Bellied Woodpecker", "Chittoor and Cuddapah District", "Jungle safari", "1989","354 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Sukhna Lake Wildlife sanctuary", null, null, null, "1986","25.98 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Sultanpur National Park", "Blackbuck, Blue Bull, Nilgai, Hog Deer, Sambar, Wild Dog or Dhole, Caracal, Wild Cat, Hedgehog, Mongoose, Striped Hyena, Indian Porcupine, Rattle/ Honey Badger, Leopard, Wild Pig, four horned Antelope, Common hoopoe, Paddyfield pipit, Purple sunbird, Little cormorant, Indian Cormorant, Common Spoonbill, Gray Francolin, Black francolin, Indian roller, White-throated kingfisher, Spotbill, Painted stork, Black-necked stork, White ibis, Black-headed ibis, Little egret, Great egret, Cattle egret, Crested lark, Red-vented bulbul, Rose-ringed parakeet, Red-wattled lapwing, Shikra, Eurasian collared dove, Red-collared dove, Laughing dove, Spotted owlet, Rock pigeon, Magpie robin, Greater coucal, Weaver bird, Bank Mynah, Common Mynah and Green Bee-eater, Siberian Crane, Greater Flamingo, Ruff, Black-winged Stilt, Common Teal, Common Greenshank, Northern Pintail, Yellow Wagtail, White Wagtail, Northern Shoveler, Rosy Pelican, Spot-billed Pelican, Gadwall, Wood Sandpiper, Spotted Sandpiper, Eurasian Wigeon, Black-tailed Godwit, Spotted Redshank, Starling, Bluethroat and Long-billed Pipit, Asian Koel, Black-crowned Night Heron, Grey heron, Eurasian Golden Oriole, Comb duck, Blue-cheeked Bee-eater, Blue-tailed Bee-eater and Cuckoos,", "Sultanpur", "Bird safari, Picnic", "1991","1 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Sunderbans Tiger Reserve", "Royal Bengal Tiger, Fishing Cats, Macaques, Wild Boar, Common Grey Mongoose, Fox, Jungle Cat, Flying Fox, Pangolin, Chital Deer, Rhesus Monkey, King Cobra, Rock Python, Water Monitorseven, Kingfisher, White bellied Sea Eagle, Plovers, Lap-Wings, Curfews, Whimbrels, Sandpipers and Pelican", "Piyali", "The Boat Cruise", "1978","1330 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Tadoba Andhari Tiger Reserve", "Bengal Tigers, Sambar, Gaur, Chinkara, Leopard cat, Pangolin, Panther, Spotted deer, Sloth bear, Chausinga, Nilgai, Barking deer, Indian bison, Wild dog, Hyena, Jackals", "Chandrapur", "Jungle Safari", "1955","625 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Tadoba National Park", "Tiger, large herds of Chitals, Asiatic Lion, Marsh crocodile, Salt-water crocodile, Gharial, Jackals, Sambars, Barking Deers, Hyaena, Spotted Deer, Chausingas, Neel Gais, Sloth Bears, Indian Bisons, Wild Dogs, Wild dog, Blue bull, Wild Boars, Langurs, and Leopards", "Chandrapur District", "Jungle Safari", "1955","117 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Talakavery and Pushpagiri Wildlife Sanctuary", "Elephants, Leopards, Jungle Cats, Wild Pigs, Spotted Deer, Sambar Deer, Barking Deer, Mouse Deer, Jackals, Hare, Common Mongoose, Common Otter, Small Indian Civet, Common Palm Civet and Porcupine", "Kodagu District", "Trekking, Jeep Safari", "1987","105.01 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Tansa Wildlife sanctuary", null, "Wada, Shahapur", null, "1970","304.81 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Thane Creek Flamingo Wildlife sanctuary", null, "Mumbai", null, "2015","16.9 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Tipeshwar Wildlife sanctuary", null, "Tipeshwar", null, "1997","148.63 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Tungareshwar Wildlife sanctuary", null, "Vasai", null, "2003","85 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Umred Karhandla Wildlife Sanctuary", "Bengal tiger, Indian leopard, Indian bison, blue bull, chital, sambar deer, peacock, barking deer, mouse deer, monkey, wild boar, sloth bear, and wild dog", "Bhandara", "Jungle Safari", "2012","189.3 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Valley of Flowers National Park", "Leopard, Himalayan Tahr, Musk Deer, Red Fox, Himalayan Weasel, Yellow-throated Marten, Himalayan Black Bear, Brown Bear, Himalayan Mouse-hare, Bharal (Blue Sheep), Indian Flying Squirrel, Lammergeier, Himalayan Griffon, Common Kestrel, Golden Eagle, and Black Eagle", "Bhyundar Ganga in Chamoli District", "Trekking", "1982","88"));

        sanctuary_informations.add(new Sanctuary_Information("Valmiki National Park", "Tiger, Sloth Bear, Wolf, Deer, Serow, Leopard, Python, Peafowl, Chitals, Sambars, Nilgais, Leopards, Hyenas, Indian Civets, Jungle cats, F deer, Wild dogs One horned rhinoceros and In bison often migrate from Chitwan to Valmikin", "Valmiki Nagar, West Champaran District", "Jungle safari", "1978","336 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Vansda National Park", "Leopards, Python, four-horned Antelope, Pangolin, Rusty-spotted Cats, Jungle Cat, Civets, Mongooses, Macaques, Barking Deer, Giant Squirrels, Hyenas, Great Black Woodpecker, Malabar Trogon, Shama and Emerald Dove, Grey Hornbill, Racket-Tailed Drongo, Paradise Flycatcher, Leaf birds, Thrushes, Sunbirds, and PeafoWildlife sanctuary", "Navsari", "Jeep Safari", "1979","24 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Vedanthangal Bird Sanctuary", "Cormorants, Darter, Grebes, Large Egret, Little Egrets, Moorhen, Night Herons, Paddy Bird, Painted Stork, Pintails, Pond Heron, Sandpiper, Shovellers, Terns, White Ibis, Garganey Teals, Snake Bird, Grey Pelican, Grey Heron, Open-billed Stork, Glossy Ibis, Painted Stork, Spoonbill Burma and Spot Bill Duck", "Vedanthangal Karikili, Kanchipuram District", "Picnic spots, Bird safari", "1936","0.3 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Velavadar National Park", "Blackbucks, Wolves, Houbara bustard and Lesser Floricans, with Foxes, Jackals, Jungle Cats, Wild Pigs, Hares and Rodents", "Bhavnagar", "Jungle Safari", "1976","34 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Wandur National Park", "Olive Ridley Turtle, Hawskbill Turtle (Eretmochelys imbricata), Leatherback Turtle (Dermochelys coriacea), Green Turtles (Chelonia mydas), Black-naped Tern (Sterna sumatrana), Roseate Tern (Sterna dougallii), Sooty Tern (Sterna fuscata), gulls, swifts, serpent crested eagles, and ospreys", "Southwest of Port Blair", null, "1983","282 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Wayanad Wildlife Sanctuary", "Elephant,Tiger, Leopards, Panthers, Jungle Cats, Civet Cats, Giant Squirrels, Nilgiri Langur Monkeys, Wild Dogs, Bisons, Deer, Bears, Moni Lizards, Peacock, Babblers, Cuckoos, Owl, Myr Woodpecker and Jungle Fowl", "Muthanga", "Jeep Safari, Bird safari, Trekking", "1973","344.44 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Yawal Wildlife sanctuary", null, "Jalgaon", null, "1969","177.52 km²"));

        sanctuary_informations.add(new Sanctuary_Information("Yedshi Ramling Wildlife Sanctuary", null, "Osmanabad", null, "1997","22.38 km²"));

*/

        sanctuary_informations.add(new Sanctuary_Information("Asola Bhatti (Indira Priyadarshini) Wildlife Sanctuary" ,null,"Asola",null, "1992", "27.82 km²","28.4941","77.2675"));
        sanctuary_informations.add(new Sanctuary_Information("Aralam Wildlife Sanctuary",null,null,null,"1984","55 km²","28.4941","77.2675"));
        sanctuary_informations.add(new Sanctuary_Information("Anshi National Park", "Tigers, Indian Bison, Bonnet Macaque, Deer, Mouse Deer, Spotted Deer, Malabar Civet, Malabar Giant Squirrel, Pangolin, Sloth Bear, Black Panther, Elephants, Adjutant Stork, Ashy Woodswallow, Black-crested Bulbul, Blue-headed Pitta, Brahminy Kite, Broad-billed Roller, Crested Serpent Eagle, Great Hornbill, Golden-backed Woodpecker, Malabar Pied Hornbill, Sri Lanka Frogmouth and Yellow-footed Green Pigeon", "Uttara Kannada", "Trekking", "1987", "340 km²","14.9981","74.3587"));
        sanctuary_informations.add(new Sanctuary_Information("Aner Dam Wildlife Sanctuary" ,"Barking Deer, Chinkaras, Hares, Porcupines, Jungle Cats ","Satpura range",null, "1986", "82.94 km²","21.3250","75.1443"));
        sanctuary_informations.add(new Sanctuary_Information("Andhari Wildlife Sanctuary" ,null,"Chandrapur",null, "1986", "509.27 km²","20.2484","79.3607"));
        sanctuary_informations.add(new Sanctuary_Information("Amba Barwa Wildlife Sanctuary" ,null,"Buldhana",null, "1997", "12711 km²","21.2203","76.6470"));
        sanctuary_informations.add(new Sanctuary_Information("BR Hills Wildlife Sanctuary","Panthers, Gaurs, Chitals, Sambars, Bears, Elephants, Tigers, Leopards, Wild dogs, Jungle cat, Sloth bears, Civet, Mongoose, Giant squirrel, Porcupine, Common langur, Bonnet macaque, Wild pig, Spotted deer and Four-horned antelope, Malabar whistling thrush","Biligiriranga Hills, Kemmannagundi","Amateur fishing, River rafting, Trekking, Camping","1974","540 km²","11.993889","77.140556"));
        sanctuary_informations.add(new Sanctuary_Information("Balphakram National Park","Indian Elephant, Bengal Tiger, Leopard, Clouded Leopard, Wild Buffalo, Hoolock (White-browed) Gibbon, Assamese Macaque, Pig-tailed Macaque","Balphakram","Trekking","1987","220 km²","25.2626","90.8644"));
        sanctuary_informations.add(new Sanctuary_Information("Bandhavgarh National Park","Rhesus Macaque, Hanuman Langur, Golden Jackal, Wolf Bengal, Fox Dhole Sloth Bear Ratel, Small Indian Civet, Common Palm Civet, Small Indian Mongoose","Sahdol","Jeep Safari, Elephant Safari","1968","437 km²","23.6887","81.0287"));
        sanctuary_informations.add(new Sanctuary_Information("Bandipur National Park","Tigers, Leopards, Elephants, Gaurs, Sambar, Chital, Barking Deer, Mouse Deer, Black Napped Hare, Sloth Beer, Wild dog (Dhole), Langur, Bonnet Macaque, Indian Giant Red Squirrel, Horned Antelope","Chamarajanagar","Jeep Safari, Elephant Safari, Horse Safari","1974","874 km²","11.7788","76.4647"));
        sanctuary_informations.add(new Sanctuary_Information("Bannerghatta National Park","Wild Boars, Leopards, Sloth Bears, Jackal, Porcupine, Pangolin, Slender Loris, Sambar, Spotted Deer, Monitor Lizards, Cobras, Pythons, Kraits","Bangalore",null,"1971","104 km²","12.7986","77.5678"));
        //sanctuary_informations.add(new Sanctuary_Information("Kanha National Park", "Tiger, Bison, Gaur, Sambar, Chital, Barasingha, Barking Deer, Black Deer, Black Buck, Chousingha, Nilgai, Mouse Deer, Sloth Bear, Jackal Fox, Porcupine, Hyena, Jungle Cat, Python, Pea Fowl, Hare, Monkey, Ongoose, Tiger, and Leopard, Storks, Teals, Pintails, Pond Herons, Egrets, Peacock, Pea Fowl, Jungle Fowl, Spur Fowl, Partridges, Quails, Ring Doves, Spotted Parakeets, Green Pigeons, Rock Pigeons, Cuckoos, Papihas, Rollers, Bee-eater, Hoopoes, Drongos, Warblers, Kingfishers, Woodpeckers, Finches, Orioles, Owls, and Flycatchers", "Mandla District", "Elephant Safari, Kanha Museum", "1955", "940 km²"));
        sanctuary_informations.add(new Sanctuary_Information("Buxa Tiger Reserve","Boar, Sambar, Leopard Cat, Bengal Florican,Black Stork, Asian Elephant, Tiger, Gaur, Wild Regal Python, Chinese Pangolin, Hispid Hare, Migratory Goosanders, Red-stars, Wagtails, the rare black necked Crane, migratory common Teal, Large Whistling Teal, Minivets" ,"Jalpaiguri","Trekking, Jeep Safari","1986","426 km²","26.6473","89.5483"));
        sanctuary_informations.add(new Sanctuary_Information("Brahmagiri Wildlife Sanctuary","Lion-tailed Macaque, Elephant, Gaur, Tiger, Jungle Cat, Leopard Cat, Wild Dog, Sloth Bear, Wild Pig, Sambar, Spotted Deer, Nilgiri Langur, Slender Loris, Bonnet Macaque, Common Langur, Barking Deer, Mouse Deer, Malabar Giant Squirrel, Giant Flying Squirrel, Nilgiri Marten, Common Otter, Brown Mongoose, Civets, Porcupine, Pangolin, Python, Cobra, King Cobra, Emerald Dove, Black Bulbul and Malabar Trogon","Kodagu District","Trekking, Bird safari, Jungle safari, Climbing","1974","181 km²","12.1726","75.6441"));
        sanctuary_informations.add(new Sanctuary_Information("Bor Wildlife Sanctuary","Bengal tiger, Indian leopard, Indian bison, blue bull, chital, sambar deer, peacock, barking deer, mouse deer, monkey, wild boar, sloth bear, and wild dog","Hingani, Wardha",null,"1979","61.1 km²","20.9775","78.675833"));
        sanctuary_informations.add(new Sanctuary_Information("Binsar Wildlife Sanctuary","Leopard, Nemorhaedus Goral, Chital, Musk Deer, Serow, Jungle Cat, Sus Scrofa, Black Bear, Red Fox, Pine Marten, Fox, Langur, Monkey, Porcupine, Tits, Forktail, Nuthatches, Blackbirds, Flying Squirrel, Parakeets, Laughingthrush, Magpies, Kalij Pheasant, Eagles, Monal, Koklas Barking Deer, Woodpeckers and Butterflies","Almora District","Trekking","1988","47.7 km²","29.632222","79.3375"));
        sanctuary_informations.add(new Sanctuary_Information("Bhitarkanika National Park","Ridley Sea Turtles, Estuarine Crocodile, King Cobra, Indian Python and Water Monitor Lizard","Kendrapara","Park Safari, Jungle safari","1975","145 km²","20.7489","87.0008"));
        sanctuary_informations.add(new Sanctuary_Information("Bhindawas Bird Sanctuary","Blue Peafowl, Gray Francolin, Black Francolin, Shikra, Black Kite, Oriental Honey Buzzard, Eurasian Thick-knee, Bronze-winged Jacana, Purple Swamphen, Greater Coucal, Little Grebe, Yellow-crowned Woodpecker, Black-rumped Flameback, White-throated Kingfisher, Coppersmith Barbet, Indian Roller, Common Hoopoe, Black Drongo, Rose-ringed Parakeet, Plum-headed Parakeet, Spotted Owlet, Rock Pigeon, Eurasian Collared Dove, Laughing Dove, Jungle Babbler, Oriental Darter, Spot-billed Duck, Greater Flamingo, Pallas's Gull, Whiskered Tern, Osprey, Eurasian Marsh Harrier, Graylag Goose, Bar-headed Goose, Comb Duck, Ruddy Shelduck, Mallard, Gadwall, Eurasian Wigeon, Great Cormorant, Common Teal, Northern Pintail, Northern Shoveler, Common Pochard, Green Bee-eater, Pied Cuckoo, Common Hawk Cuckoo, Great Egret, Crested Lark, Ashy Prinia, Oriental Pratincole, Small Pratincole, Kentish Plover, Northern Lapwing, Yellow Bittern, the antelope Neelgai (Blue Bull), Jungle Cat, and Jackals","Jhajjar District","Bird safari","1986","4.12 km²","28.53258","76.551511"));
        sanctuary_informations.add(new Sanctuary_Information("Bhimashankar Wildlife Sanctuary","Greater Spotted Eagle, Jerdon's Baza, Lesser Kestrel and Nilgiri Wood Pigeon as well as a number of restricted range species like the Malabar Parakeet, Small Sunbird, Malabar Grey Hornbill and Southern Tree Pie.","Ambegaon & Khed Taluka",null,"1985","130.78 km²","19.132","73.554"));
        sanctuary_informations.add(new Sanctuary_Information("Bhamragarh Wildlife Sanctuary",null,"Chandrapur",null,"1997","104.38 km²","15.544167","74.350833"));
        sanctuary_informations.add(new Sanctuary_Information("Bhadra Wildlife Sanctuary","Gaur, Elephants, Tiger, Leopard, Sambar, Chital spotted deer, Boar, Porcupine, Muntjac,Peacock, Parrot, Partridge, Pigeon, Munia and Bee eaters, Marsh crocodile, Flying lizard, Monitor lizard, King Cobras and Indian Rock Pythons","Chikmagalur District and Shimoga District","Jungle Safari, Boating","1974","492 km²","13.6949","13.6949"));
        sanctuary_informations.add(new Sanctuary_Information("Betla National Park","Tigers, Elephant, Gaur, Cheetal, Sloth Bear, Mouse Deer, Pangolin, four horned Antelope, Sambar, Civet Wolf, Forest Owls, Drongos, Civets and the Rhesus Monkey","Daltonganj","Jeep Safari","1989","232 km²","23.8856","84.1924"));
        sanctuary_informations.add(new Sanctuary_Information("Battimalv Island Wildlife Sanctuary",null,null,null,"1987","2.23 km²","8.83","92.86"));
        sanctuary_informations.add(new Sanctuary_Information("Barsey Rhododendron Sanctuary","Leopard, Leopard Cat, Marbled Cat, Himalayan Yellow Throated Marten, Common Otter, Himalayan Palm Civet, Cannidae Wild dog, Indian Fox, Jackal, Himalayan Black Bear, Wild Boar, Red Panda, Barking Deer, Serow, Assamese Macaque, Rhesus Macaque, Himalayan Langur, Crimson Horned Pheasant, Monal Pheasant and Kaleej Pheasant, Crestless Porcupine, Rufous Tailed Hare, Chinese Pangolin, Flying Squirrel, Giant Squirrel and Himalayan Mouse Hare","Barsey, West Sikkim District","Trekking, Jungle Safari","1998","104 km²","27.194167","88.118333"));
        sanctuary_informations.add(new Sanctuary_Information("Barren Island Wildlife Sanctuary",null,null,null,"1987","8.1 km²","12.2792","93.8604"));
        sanctuary_informations.add(new Sanctuary_Information("Barnawapara Wildlife Sanctuary",null,null,null,"1984","55 km²","21.4797","82.5314"));
        sanctuary_informations.add(new Sanctuary_Information("Barda Wildlife Sanctuary",null,null,null,"1979","192.31 km²","21.851","69.699"));
        sanctuary_informations.add(new Sanctuary_Information("Cotigaon Wildlife Sanctuary","Flying Squirrel, Slender Loris, Indian Pangolin, Mouse Deer, Four-horned Antelope, Malabar Pit Viper, Hump-Nosed Pit Viper, White-bellied Woodpecker, Malabar Trogon, Velvet-fronted Nuthatch, Heart-spotted Woodpecker, Speckled Piculet, Malayan Bittern, Draco or Flying Lizard, Golden-back Gliding Snake, and Malabar Tree Toad","Canacona taluka (or South Goa District)",null,"1968","85.65 km²","14.976","74.206"));
        sanctuary_informations.add(new Sanctuary_Information("Corbett National Park","Tiger, Leopard, Elephant, Cheetal Sambar Hog Deer, Barking Deer Wildboar Langoor, Rhesus Monkey, Peacock, Jungle Fowl, Partridges, Kaleej, Crow, Vulture, Parakeets, Laughing Thrush, Orioles, King Fishers, Drongo, Doves, Woodpeckers, Ducks, Teals, Storks, Cormorants, Seagulls, Indian Marsh Crocodiles (Mugger), Gharials King Cobra, Common Krait Cobra, Russel Python, Monitor Lizard, Mahaseer Kalimuchi Kalabasu Chilwa and Goonch","Uttaranchal","Elephant Safari, Jeep Safari, Fishing, Bird Safari","1936","1319 km²","29.5300","78.7747"));
        sanctuary_informations.add(new Sanctuary_Information("Chinnar Wildlife Sanctuary","Elephant, Gaur, Spotted Deer, Panther, Sambar, The Endangered Giant Grizzled Squirrel, Hanuman Langur, Rabbit, Black Eagles, and Peacocks","Devikulam taluk, Idukki District","Trekking, Boating, Camping, Bird safari, Jungle safari","1984","90.44 km²","10.3068","77.2060"));
        sanctuary_informations.add(new Sanctuary_Information("Chimmony Wildlife Sanctuary","Malabar Whistling Thrush, Tiger, Leopard, Sloth Bear, Dhole, Nilgiri Langur, Bonnet Macaque, Elephant, Gaur, Sambar, Spotted Deer, Wild Boar, and Malabar Giant Squirrel, Darter, Dabchick, Malabar Grey Hornbill, Sri Lankan Frogmouth, Raquet Tailed Drongo, Malabar Trogon, Ruby Throated Bulbul, Crested Serpent Eagle, Spot Bellied Forest Owl, Paradise Flycatcher, and Indian Pitta","Mukundapuram Taluk of Thrissur District","Bird safari, Jungle safari, Bamboo Rafting, Birding Trail, Butterfly Safari, Nature Walk for Children, Jungle Craft, Animal Tracking, Moonlight Sonata","1984","85 km²","10.4310","76.4910"));
        sanctuary_informations.add(new Sanctuary_Information("Chilika Lagoon","Sand Pipers, White Bellied Sea Eagles, Ospreys, Golden Plover, Pelicans, Shovellers, Gulls, and Flamingos","Puri and Khurda Districts","Bird safari, Boating, Fishing","1981","1165 km²","19.8450","85.4788"));
        sanctuary_informations.add(new Sanctuary_Information("Chaprala Wildlife Sanctuary","Tiger, Leopard, Jungle cat, Sloth Bear, Wild dog, Indian Python, Common Indian Monitar, Black Buck, Wild Boar, Spotted Deer, Sambar, Barking Deer, Blue Bull, Common Langoor, Harep, Jackal, Mungoose, Peacock, Jungle Fowl, and Flying Squirrel","Chandrapur District","Jeep Safari, Boating","1986","134.78 km²","19.665","79.828611"));
        sanctuary_informations.add(new Sanctuary_Information("Changthang Cold Desert Wildlife Sanctuary","Black-necked Crane, Brahminy Ducks, Brown-headed Gulls","Leh",null,"1987","40000 km²","33.4336","78.4777"));
        sanctuary_informations.add(new Sanctuary_Information("Chandraprabha Wildlife Sanctuary",null,null,null,"1957","78 km²","25.7","83.27"));
        sanctuary_informations.add(new Sanctuary_Information("Chandoli National Park","Tigers, Indian Bison or Gaur Bos Gaurus, Sambar Cervus unicolor, Leopard Cats Prionailurus Bengalensis, Sloth Bears Melursus Ursinus and Indian giant Squirrels Ratufa Indica","Chandoli Dam, Sangli",null,"2004","309 km²","17.1261","73.8593"));
        sanctuary_informations.add(new Sanctuary_Information("Chandaka Elephant Reserve","Elephants, Chital, Bear, Pea-Fowl and Sambar","Bhubaneshwar","Trekking, Elephant Safari","1982","175.79 km²","20.3488","85.6640"));
        sanctuary_informations.add(new Sanctuary_Information("Cauvery Wildlife Sanctuary",null,null,null,"1987","1027.53 km²","12.17","77.543"));
        sanctuary_informations.add(new Sanctuary_Information("Campbell Bay National Park","Nicobar Pigeon, Crab eating Macaque, Giant Robber Crab, Megopode","Campbell Bay, Nicobar District","Jungle safari","1992","426 km²","7.1166","93.7304"));
        sanctuary_informations.add(new Sanctuary_Information("Dachigam National Park","Musk Deer, Kashmir Stag, Hangul, Leopards, Himalayan Brown Bear, Jackals, Yellow-throated Martens, Hill Fox, Himalayan Gray Langurs, Long-tailed Marmots, Leopard Cats, Himalayan Black Bear, Himalayan Weasel, Jungle Cats, Himalayan Monals, Cinnamon Sparrows, Black Bulbuls, Woodpeckers, Minivets, Pygmy Owlets, Babblers, Black-and-Yellow Grosbeaks, Himalayan Griffons, Redstarts, Bearded Vultures, Red-billed Blue Magpies Choughs, Orange Bullfinch, Tits, Golden Orioles, Kashmir Flycatcher, Tytler's Leaf Warbler, Wagtails, Koklass Pheasants, Himalayan Rubythroats, Wallcreepers, and Streaked Laughing thrushs","Srinagar","Nature walks, Trekking","1981","141 km²","34.1372","75.0377"));
        sanctuary_informations.add(new Sanctuary_Information("Dandeli Wildlife Sanctuary","Deer, Mouse Deer, Barking Deer, Sloth Bear, Wild Boar, Wild Dog, Mongoose, Porcupine, Jackal, and Common langur, Golden-backed Woodpecker, Elephant, Gaur, Tiger, Panther, Sambar, Spotted Pied Hornbill and Crocodiles Crested Serpent Eagle, White Breasted Kingfisher, Grey Hornbill, Great Pied Hornbill, the Malabar","Uttara Kannada District","Jungle safari, Canoe Tours, Elephant Rides, Boat, Coracle Rides, White-Water Rafting, snorkeling, Parasailing, Trekking, Picnic Spots","1971","8861.41 km²","15.50639","74.39167"));
        sanctuary_informations.add(new Sanctuary_Information("Daroji Sloth Bear Sanctuary","Indian Sloth Bear, leopards, monitor lizards, mongoose, pangolins, star tortoises","Ballari district",null,"1992","82.72 km²","15.233333","76.516667"));
        sanctuary_informations.add(new Sanctuary_Information("Deepor Beel Wildlife Sanctuary",null,null,null,"2002","4.14 km²","26.1177","91.6494"));
        sanctuary_informations.add(new Sanctuary_Information("Dibru-Saikhowa National Park","Bengal Tiger, Leopard, Clouded Leopard, Jungle Cat, Sloth Bear, Dhole, Small Indian Civet, Malayan Giant Squirrel, Chinese Pangolin, Gangetic Dolphin, Slow Loris, Pig Tailed Macaque, Assamese Macaque, Rhesus Macaque, Capped Langur, Hollock Gibbon, Asian Elephant, Wild Boar, Samber, Hog Deer, barking Deer, Asiatic Water Buffalo, and Feral Horses, Greater Adjutant Stork, Lesser Adjutant Stork, Great Grebe, Indian Shag, Grey Heron, Purple Heron, Night Heron, Yellow Bittern, Openbill Stork, Black Stork, Large Whisstling Teal, Greylag Groose, Common Pintail, Pallas's Fishing Eagle, Spot Billed Pelican, White Winged Duck, Bear's Poachard, Greater Spotted Eagle, Bengal Florican, Pale Capped Pigon, Great Pied Hornbill, March Babbler, Jardon's Babbler, and Black Breasted Parrotbill Eagle, Griffon Vulture, Osprey, Crested Serpent","Tinsukia","Jungle Safari, Jeep Safari","1999","340 km²","27.6690","95.3626"));
        sanctuary_informations.add(new Sanctuary_Information("Dudhwa National Park","Tiger, Leopard, Swamp Deer, Rhinoceros, Chital, Hog Deer, Barking Deer, Sambar, Wild Boar, Ratel, Bara Singha, Wamp Deer, One-horned Rhino, Owls, Storks, Hornbills, Kingfishers, Woodpecker","India-Nepal border","Jeep safaris, Elephant safaris","1977","490 km²","28.5406","80.6159"));
        sanctuary_informations.add(new Sanctuary_Information("Eravikulam National Park","Indian Muntjac, Sambar Deer, Golden Jackal, Jungle Cat, Wild Dog, Dhole, Leopard, Tiger, Nilgiri Langur, Stripe-necked Mongoose, Indian Porcupine, Nilgiri Marten, Small Clawed Otter, Ruddy Mongoose, and Funambulus Sublineatus, Dusky Striped Squirrel, Black-and-Orange Flycatcher, Nilgiri Pipit, Nilgiri Wood Pigeon, Yellow-Throated Marten, White Bellied Shortwing, Nilgiri Verditer Flycatcher and Kerala Laughing thrush","Idukki District","Trekking","1978","97 km²","10.1356","77.0597"));
        sanctuary_informations.add(new Sanctuary_Information("Desert National Park","Desert Fox, Bengal Fox, Desert Cat, Wolf, Hedgehog, Black Buck and Chinkara, Spiny Tail Lizard, Monitor Lizard, Russel's Viper, Chameleons and Sind Krait, Sand Grouse, Partridges, Bee Eaters, Larks, Shrikes, Harriers, Falcons, Buzzards, Kestrel, Vultures, Short-toed Eagles, Tawny Eagles, Spotted Eagles, Lagger, Demoiselle Cranes and Houbara","Jaisalmer","Jeep safari, Camping, Bonfire, Bird safari","1980","3162 km²","26.9101","70.8086"));
        sanctuary_informations.add(new Sanctuary_Information("Fambong Lho Wildlife Sanctuary",null,null,null,"1984","51.76 km²","27.3113","88.533667"));
        sanctuary_informations.add(new Sanctuary_Information("Fudam Bird Sanctuary",null,"Diu",null,"1991","2.18 km²","20.7174","70.9602"));

        sanctuary_informations.add(new Sanctuary_Information("Gahirmatha Marine Sanctuary", "Olive Ridley Turtle, Dolphins, Porpoises, Seagulls, Turns", "Kendrapara district", null, "1979", "1435  km²","20.57","86.84"));

        sanctuary_informations.add(new Sanctuary_Information("Galathea National Park", "Giant Robber Crab, Megapode and Nicobar Pigeon", "Great Nicobar", null, "1992", "110  km²","6.8392","93.8484"));

        sanctuary_informations.add(new Sanctuary_Information("Gangotri National Park", "Snow Leopard, Bla Bear, Brown Bear, Musk Deer, Blue Sheep or Bharal, Himalayan Tahr, Himalayan Monal, Koklass and Himalayan Snowcock, Ibex, Thar, Himalayan Barbet, Tiger, Serow, Pheasants, Partridges, Doves, Pigeons, Parakeet and Bulbul", "Uttarkashi", "Jeep Safari, Trekking, Mountaineering, Hiking, River rafting, Paragliding, Hang gliding, Skiing", "1989", "1553  km²","30.9426","79.1549"));

        sanctuary_informations.add(new Sanctuary_Information("Gautala Autramghat Wildlife Sanctuary", null, "Satmala & Ajantha hill ranges, Aurangabad", null, "1986", "260.61  km²","20.1957","75.0827"));

        sanctuary_informations.add(new Sanctuary_Information("Gir National Park", "Lion, Antelope, Deer, Leopard, Hyena, Crocodile", "SE of Junagadh District", "Jeep Safari, Jungle safari, Asiatic lion spotting, Bird safari, Nature walks", "1965", "1412 km²","21.1243","70.8242"));

        sanctuary_informations.add(new Sanctuary_Information("Gorumara National Park", "Indian Rhinoceros, One horned rhinoceros, Gaur, Asian Elephant, Sloth bear, Chital, Bengal Tigers, Indian Wild Dogs, Indian Wolf, Pygmy Hog, Giant Squirrels, Hispid Hare and Sambar Deer, Barking deer, Hog deer and Wild boar, Scarlet Minivet, Sunbird, Asian Paradise Flycatcher, Spangled Drongo, Great Indian Hornbill, Woodpeckers, Pheasants, Peafowls, Brahminy Duck, Indian Python, and King Cobra", "Malbazar subdivision of Jalpaiguri District", "Elephants safaris, Hiking, Bird safari, Jungle safari", "1994", "74 km²","26.7564","88.7975"));

        sanctuary_informations.add(new Sanctuary_Information("Govind National Park", "Snow Leopard, ck Bear, Brown Bear, Musk Deer, Bharal, Himalayan Thar, Serow, Common Leopard, Monal Pheasant, Koklas Pheasant, Western Tragopan, Himalayan Snow Cock, Golden Eagle, Steppe Eagle, Black Eagle, Bearded Vulture, Pigeons, Parakeets, Cuckoos, Owls, Minivets, Bulbuls, Tits, Warblers, Thrushe, Finches, and Buntings", "Uttarkashi", "Trekking", "1955", "958 km²","31.1425","78.3387"));

        sanctuary_informations.add(new Sanctuary_Information("Govind Pashu Vihar Wildlife Sanctuary", "Red Panda, Sambar, Musk Deer, Brown Bear, Bharal, Serow, Snow Leopard, Indian Porcupine, Common Otter, Barking, Deer, Goral, Himalayan Palm Civet, Hedgehog, Sikkim Vole, Himalayan Rat, Hodgson's Fly Squirrel, and Wild Boar, Monal Pheasant, Koklas Pheasant, Western Tragopan, Himalayan Snow Cock, Golden Eagle, Steppe Eagle, Black Eagle, Bearded Vulture, Pigeons, Parakeets, Cuckoos, Owls, Minivets, Bulbuls, Tits, Warblers, Thrushes, Finches, and Buntings", "Uttarkashi", "Trekking", "1955", "485.89 km²","31.10","78.29"));

        sanctuary_informations.add(new Sanctuary_Information("Great Himalayan National Park", "Bharal, Goral, Serow, Brown Bear, Leopard, Tiger, Snow Leopard, Monal, Khalij Cheer and Tragopan", "Kullu", "Trekking, Camping", "1984", "765 km²","31.8918","77.1429"));

        sanctuary_informations.add(new Sanctuary_Information("Great Indian Bustard Wildlife Sanctuary", "Great indina bustard", "Nannaj, Solapur", null, "1979", "1222.61 km²","17.4936","75.5210"));

        sanctuary_informations.add(new Sanctuary_Information("Gugamal National Park", "Tiger, Panther, Slo Bear, Wild Dog, Jackal, Hyena, Chausinga, Sambar, Gaur, Barking Deer, Ratel, Flying squirrel, Cheetal, Nilgai, Wild Boar, Langur, Rhesus Monkey, and Macaque", "Chikhaldara and Dharni Tehsils Of Amaravati District", "Melghat jungle safari, Trekking, Bird safari, Meditation", "1987", "361 km²","21.3532","77.0222"));

        sanctuary_informations.add(new Sanctuary_Information("Guindy National Park", "Antelope, Black buck, Chital, Jackal, Pangolin, Spotted deer, Jungle cat, Large Indian Civet, River otter, Hyena, Fox, Kingfisher, Golden Backed Woodpecker, Blue Jay, Yellow Wattled Lapwing, Crow Pheasant, Red Wattled Lapwing, Blue Faced Malkoha, Koels, Shrikes, Doves, Munias, Minivets, Barkets, Gray Partridge, Parakeets, Tailor Birds, Drongos, Robins, Quails, Flycatcher, Beak Paradise, Stone Curlew, Teals, Garganeys, Pochards, Medium Egrets, Large Egrets, Night Herons, Pond Herons and Open-billed Storks", "Guindy Taluk, Chennai District", "Bird safari, Jungle safari", "1976", "3 km²","13.0049","80.2379"));

        sanctuary_informations.add(new Sanctuary_Information("Gulf of Mannar Marine National Park", "Turtles, Coral Reefs, Dugong, Dolphins and Balano-glossus", "Tuticorin and Ramanathapuram Districts near Mandapam", null, "1986", "6 km²","9.1278","79.4662"));

        sanctuary_informations.add(new Sanctuary_Information("Gumti Wildlife Sanctuary", null, "South Tripura", null, "1988", "389.54 km²","23.45","91.83"));

        sanctuary_informations.add(new Sanctuary_Information("Harike Lake and Wetland Wildlife Sanctuary", "White-winged Tern, Hen Harrier, Yellow-eyed Pigeon, Pallas's Gull, Cotton Pygmy Goose, Tufted Duck, Yellow-crowned Woodpecker, Watercock, Brown-headed Gull, Great Crested Grebe, White-browed Fantail, Black-headed Gull, Yellow-legged Gull, Indian Skimmer, White-rumped Vulture, Eurasian Sparrow hawk, Eurasian Hobby, Horned Grebe, Black-necked Grebe, Brown Shrike, Common Wood shrike, White-tailed Stonechat, White-crowned Penduline Tit, Rufous-vented Prinia, Striated Grass bird, Cetti's Bush Warbler and the Sulphur-bellied Warbler, Jungle cat, Smooth Indian Otter, Mongoose, Jackal and Indian wild Boar", "Firozpur", "Jeep Safari", "1982", "86 km²","31.15","74.97"));

        sanctuary_informations.add(new Sanctuary_Information("Hazaribagh National Park", "Tiger, Panther, Wild Boar, Sambar, Nilgai, Chital and Sloth Bear", "Jharkhand", "Sanctuary takes motorists to the remotest corners, to masonry towers, watchtowers that provide perfect hideouts to see the wildlife", "1976", "186.25 km²","24.1430","85.3822"));

        sanctuary_informations.add(new Sanctuary_Information("Hemis National Park", "Snow Leopard, Ibex, Bharals, Wolf, Wild Dogs, Marmots, Tibetan Wild Ass, Wooly Hares, and Stone Martens", "Eastern part of Ladakh", "Trekking, Hiking, Camping, Jeep Safari, biking, Home Stay in village homes", "1981", "600 km²","33.7187","77.3882"));

        sanctuary_informations.add(new Sanctuary_Information("Indira Gandhi Wild Life Sanctuary", "Tiger, Leopard, Sloth Bear, Dhole or the Asiatic Wild Dog, Golden Jackal, Leopard Cat, Jungle Cat, Rusty-spotted Cat, Elephant, Gaur, Sambar, Spotted Deer, Barking Deer, Mouse Deer, Wild Pig, Nilgiri Langur, Common Langur, Bonnet Macaque, Lion-tailed Macaque, Common Palm Civet, Small Indian Civet, Common Mongoose, Striped-necked Mongoose, Ruddy Mongoose, Smooth Indian Otter, Slender Loris, Indian Giant Squirrel, Spiny Dormouse, Porcupine, Indian Pangolin, Giant Flying Squirrel and Three-striped Palm Squirrel, Cormorants, Ducks, Teal, Darter, Partridge, Quail, Jungle Fowl, Spur Fowl, Pea Fowl, Parakeets, Hornbills, Barbets, Drongos, Orioles, Shrikes, Warblers, Flycatchers, Woodpeckers, Chloropsis, Trogons, Kingfishers, Storks, Egrets, Fish Eagle, Hawk Eagles, Harriers, Falcons, Kites, Owls, Nightjars, Toads, Leaping Frogs, Torrent Frogs, Tree Frogs, Pythons, Cobras, Kraits, Vipers, Grass Snakes, Forest Cane Turtles, Travancore Tortoises, Flapshells, Star Tortoises, Flying Lizards, Chameleons and Forest Calotes", "Anamalai Ranges in Coimbatore District", "Trekking, Elephant safaris", "1972", "841.49 km²","10.4241","77.1256"));

        sanctuary_informations.add(new Sanctuary_Information("Indravati National Park", "Wild Buffalos, Barasinghas, Tigers, Leopards, Gaurs (Indian Bison), Nilgai, Sambar, Chausingha (four-horned Antelope), Sloth Bear, Dhole (Wild Dog), Striped Hyena, Muntjac, Wild Boar, Flying Squirrel, Porcupine, Pangolins, Monkeys and Langurs, Freshwater Crocodile, Monitor Lizard, Indian Chameleon, Common Krait, Indian Rock Python, Cobra, Russell's Viper, Hill Maina", "Jagdalpur - Bhopalpattanam road", "Trekking", "1981", "2799 km²","19.2059","81.0313"));

        sanctuary_informations.add(new Sanctuary_Information("Intanki National Park", "Elephant, Hoolock Gibbon, Mithun, Sambar, Barking Deer, Goral, Flying Squirrel, Wild Dog, Tiger, Sloth Bear, Kaleej and common pheasant, Hornbill and Black Stor", "Intanki", "Adventure Bird safari, Jungle safari", "1993", "202 km²","25.5497","93.5206"));

        sanctuary_informations.add(new Sanctuary_Information("Jaikwadi Wildlife Sanctuary", null, "Aurangabad & Ahmednagar districts", null, "1986", "361.05 km²","19.2987","75.2212"));

        sanctuary_informations.add(new Sanctuary_Information("Jaldapara Wildlife Sanctuary", "Leopard, Asiatic one horned Rhino, Elephant, Indian Bison, Royal Bengal Tiger, Spotted Deer, Hog Deer, Pied Hornbill, Racket-tailed Drongo, Paradise Flycatcher, Crested Eagle, Pallas's Fishing Eagle, Shikra, Jungle Fowl, Peafowl, and Partridges", "Alipurduar", "Elephant ride, Jeep safari", "1941", "217 km²","26.6908","89.2770"));

        sanctuary_informations.add(new Sanctuary_Information("Kalatop-Khajjiar Wildlife Sanctuary", "Leopard, Bear, Himalayan Black Marten, Deer, Barking Goral, Squirrel, Serow, Jackal, Langur, and Blackbird", "Chamba District", "Trekking, Jungle Safari", "1958", "17.17 km²", "32.5529", "76.0174"));

        sanctuary_informations.add(new Sanctuary_Information("Kalesar National Park", "Leopard, Bear, Chital, Sambar, Wild Goat, Deer, Wild bore Baking, Red Jungle, Grey-hooded Warbler, Red-billed Blue Magpie, Crested Serpent Eagle, Bar-tailed Treecreeper, Chestnut-bellied Nuthatch, Grey-capped Pygmy Woodpecker, Blue-bearded Bee-eater", "Chhachhrauli, Yamunanagar", "Bird safari", "1996", "54.06 km²", "30.3915", "77.5169"));

        sanctuary_informations.add(new Sanctuary_Information("Kalsubai Harishchandragad Wildlife Sanctuary", null, "Ahmadnagar", null, "1986", "361.71 km²", "19.601111", "73.709167"));

        sanctuary_informations.add(new Sanctuary_Information("Kamlang Wildlife Sanctuary", null, null, null, "1989", "783 km²", "27.9173", "96.1878"));

        sanctuary_informations.add(new Sanctuary_Information("Kanger Ghati National Park", "Panther, Chital, Chousing, Sambar, Chinkara Tiger, Barking Dear, Mouse Deer, Wild Boar, Wild Dogs, Jungle Cat, Langoor, Black buck, Jackals, Wolf, Hyena, Fox, Hare, Kobra, Kraits, Python, Monitor lizards, Steppe eagle, Blue bearded lace eater, Peacock, Jangli Murgi, Red Spur Fall, Phakta, Bhura Teetar, Kala Teetar, Tree Pie, Drongo, Hill Myna, Spotted Owlet, Red Jungle Fowls, Racket-tailed Drongos, Parrots, Steppe Eagles, Red Spur Fall, Phakta, Bhura Teeter, Tree Pie and Heron, Python, Cobra, Karait, Dhaman, Flying Snake, Green Snake", "Bastar District", "Bird safari, Jungle safari", "1982", "200 km²", "18.7787", "81.9971"));

        sanctuary_informations.add(new Sanctuary_Information("Kanha National Park", "Tiger, Bison, Gaur, Sambar, Chital, Barasingha, Barking Deer, Black Deer, Black Buck, Chousingha, Nilgai, Mouse Deer, Sloth Bear, Jackal Fox, Porcupine, Hyena, Jungle Cat, Python, Pea Fowl, Hare, Monkey, Ongoose, Tiger, and Leopard, Storks, Teals, Pintails, Pond Herons, Egrets, Peacock, Pea Fowl, Jungle Fowl, Spur Fowl, Partridges, Quails, Ring Doves, Spotted Parakeets, Green Pigeons, Rock Pigeons, Cuckoos, Papihas, Rollers, Bee-eater, Hoopoes, Drongos, Warblers, Kingfishers, Woodpeckers, Finches, Orioles, Owls, and Flycatchers", "Mandla District", "Elephant Safari, Kanha Museum", "1955", "940 km²", "22.3345", "80.6115"));

        sanctuary_informations.add(new Sanctuary_Information("Karanja Sohal Blackbuck Wildlife Sanctuary", "Blackbuck", "Karanja", null, "2000", "18.32 km²", "20.4", "77.5"));

        sanctuary_informations.add(new Sanctuary_Information("Karikili Bird Sanctuary", "Cormorants, Egrets, Grey Heron, Open-billed stork, Darter, Spoonbill, White lbris, Night Herons, Grebes, Grey Pelican, Shovellers, Pintails, Stilts and Sandpipers", "Kanchipuram District", "Picnic spots, Bird safari", "1989", "0.61 km²", "12.5999", "79.8406"));

        sanctuary_informations.add(new Sanctuary_Information("Karnala Wildlife Sanctuary", "Four-horned antelope, wild boar, common langur, Grey-fronted Green-pigeon, Nilgiri Woodpigeon, Malabar (Blue-winged) Parakeet, Malabar Grey Hornbill, White-cheeked Barbet, Malabar Lark, Small Sunbird, Vigor's Sunbird, Ashy minivet, three-toed kingfisher, Malabar trogon, Slaty-legged Crake, and Rufous-bellied Eagle", "Panvel, Raigad", null, "1968", "4.48 km²", "18.891038", "73.121918"));

        sanctuary_informations.add(new Sanctuary_Information("Kasu Brahmananda Reddy National Park", "Pangolin, Small Indian Civet, Peacock, Jungle Cat, Civets, Wild Boars, Hares, Porcupines, Mongooses, Monitor Lizards, Peafowls, Partridges, Quails, Pythons and Cobras", "Jubilee hills in Hyderabad", "Bird safari, Jungle safari, Nature walks, Jogging, Photography", "1994", "1 km²", "17.4200", "78.4231"));

        sanctuary_informations.add(new Sanctuary_Information("Katepurna Wildlife Sanctuary", null, "Kothali, Akola", null, "1988", "73.63 km²", "20.3530738", "75.0101809"));

        sanctuary_informations.add(new Sanctuary_Information("Kawal Wildlife Sanctuary", null, "Adilabad", null, "1965", "892.23 km²", "19.1189", "78.9990"));

        sanctuary_informations.add(new Sanctuary_Information("Kaziranga National Park", "One Horned Indian Rhino, Indian Elephants, Indian Bison, Swamp Deer or Barasingha, Hog Deer, Sloth Bears, Tigers, Leopard Cats, Jungle Cats, Otters, Hog Badgers, Capped Langurs, Hoolock Gibbons, Wild Boar, Jackal, Wild Buffalo, Pythons, Monitor Lizards, Oriental Honey Buzzard, Black-Shouldered Kite, Black Kite, Brahminy Kite, Pallas's Fishing Eagle, White Tailed Eagle, Grey-Headed Fishing Eagle, Himalayan Griffon, Greylag Geese, Bar-Headed Geese, Ruddy Shelduck, Gadwall, Falcated Duck, Red-Crested Pochard and Northern Shoveller", "Bokakhat", "Elephant Safari, Sightseeing in Kaziranga, Jeep Safari", "1974", "430 km²", "26.5775", "93.1711"));

        sanctuary_informations.add(new Sanctuary_Information("Keibul Lamjao National Park", "Sangai, Thamin Deer, Assamese Macaques, Stump-Tailed Macaques, Hoolock Gibbon, Hog Deer, Sambar, Muntjac, Viverra Zibetha, Indian Civet Viverricula indica, common otter, wild boar, Hooded Crane, Black Eagle, Shaheen Falcon, Brown-backed Hornbill, Rufousnecked Hornbill, Wreathed Hornbill, the Pied Hornbil, Great Pied Hornbill, Tortoise, Viper, Krait, Cobra, Python, Common Lizard", "Keibul Lamjao, Bishnupur District", "Bird safari, Jungle safari", "1977", "40 km²", "24.4788", "93.8395"));

        sanctuary_informations.add(new Sanctuary_Information("Ken Gharial Sanctuary", "Gharial, Chinkara, Chital, Wild Boar, Blue Bull and Peacock", "Chhatarpur District", "Boating, Jungle Safari", "1981", "45.2 km²", "24.84748", "79.91932"));

        sanctuary_informations.add(new Sanctuary_Information("Keoladeo National Park", "Golden Jackal, Striped Hyaena, Fishing Cat, Jungle Cat, Nilgai, Sambar, Blackbuck, Wild Boar, Pythons, Spotted Deer, Sambars, Blue Bull, Black Buck, Jackals, Otters, Fishing Cats, Monitor Lizards, Solitary Lapwing, Indian Courser, Imperial, White-tailed, Greater and Indian Spotted Eagles, Darters, Black-necked, Painted and Asian Openbill Storks, Common, Sarus and Demoiselle Cranes, Dalmatian Pelicans, Black Bittern, Greater Painted Snipe, Large-tailed, Indian and Grey Nightjars, Dusky Eagle Owls, Marshall's lora, Siberian Rubythroat and Brook's Leaf Warblers", "Bharatpur", "Elephant Safari, Bird safari", "1981", "232 km²", "27.1593", "77.5232"));

        sanctuary_informations.add(new Sanctuary_Information("Khangchendzonga National Park", "Musk Deer, Snow Leopard, Himalayan Tahr, Wild dog, Sloth bear, Civet, Himalayan black bear, Red panda, Tibetan wild ass, Blue sheep, Serow, Goral, Takin, snake, Russels viper, Blood Pheasants and Satyr Trago", "North Sikkim District", "Bird safari, Jungle safari, Trekking", "1977", "850 km²", "27.6672", "88.3246"));

        sanctuary_informations.add(new Sanctuary_Information("Khokhan Wildlife Sanctuary", "Himalayan Black Bear, Himalayan Tahr, Barking Deer, Leopard, Musk Deer, Wolf, Blue Sheep, Indian Giant Squirrel, Monal, Khaleej, Ducks, Hornbills, Stripped Parrots and various pheasants", "Kullu District", null, "1954", "14.94 km²", "32.031945", "76.927843"));

        sanctuary_informations.add(new Sanctuary_Information("Kishanpur Wildlife Sanctuary", null, null, null, "1972", "227 km²", "28.4002", "80.367"));

        sanctuary_informations.add(new Sanctuary_Information("Kishtwar National Park", "Brown Bear, Leopard, Snow Leopard, Himalayan Musk Deer, Hangul Cervus and Ibex Capra ", "Kishtawar District", "Waterfalls, Trekking, Sapphire Mines Of Paddar", "1981", "310 km²", "33.6187", "75.9933"));

        sanctuary_informations.add(new Sanctuary_Information("Koyana Wildlife Sanctuary", "Bengal tigers, Indian leopards, Indian bison, sloth bears, sambar deer, barking deer, mouse deer, common gray langurs, smooth-coated otters and Indian giant squirrels, heart-spotted woodpecker, rufous woodpecker, and brown-capped pygmy woodpecker, Asian fairy bluebird, long-tailed nightjar and crested goshawk.", "Koyana Nagar, Satara District", null, "1985", "423.55 km²", "17.7691", "73.7421"));

        sanctuary_informations.add(new Sanctuary_Information("Kudremukh National Park", "Tiger, Leopard, Wild Dog, Jackal, Lion-tailed Macaque, Common Langur, Sloth Bear, Gaur, Sambar, Spotted Deer, Barking Deer, Malabar Giant Squirrel, Giant Flying Squirrel, Porcupine, and the Mongoose, Malabar trogon, Great Pied Hornbill, Malabar Whistling Thrush, Imperial Pigeon, Snakes and Tortoises", "Chikmagalur District", "Bird safari, Jungle safari, Trekking", "1987", "600 km²", "13.2226", "75.2508"));

        sanctuary_informations.add(new Sanctuary_Information("Kumbhalgarh Wildlife Sanctuary", "Wolf, Leopards, Sloth Bear, Hyena, Jackal, Jungle Cat, Smabhar, Nilgai, Chaisingh (the four horned Antelope), Chinkara and Hare,Red Spur Owls, Parakeets, Golden Oriole, Bulbul, Peacock, Dove, Grey Pigeons and White Breasted Kingfisher are traceable near the water holes", "Rajsamand District", "Bird safari, Jungle safari, Swimming, Trekking, Foot tracking, Jeep, Horse safari", "1971", "608.58 km²", "25.12286", "73.59109"));

        sanctuary_informations.add(new Sanctuary_Information("Lakshadweep Islands", "Tharathasi (Sterna fuscata) and Karifetu (Anous solidus), Parrot Fish (Callyedon sordidus), Butterfly Fish (Chaetodon auriga) and Surgeon Fish (Acanthurus lineotus)", "Arabian Sea", "Boating, Swimming, Wind-surfing, Scuba Diving, Snorkeling, Kayaking", "1956", "32 km²", "10.57", "72.64"));

        sanctuary_informations.add(new Sanctuary_Information("Little Rann of Kutch", "Pelicans, Asiatic Wild Ass, Gazelle, Blue Bull, Wolf, Indian Foxes, Jackal, Jungle Cat, Hare, Chinkaras, Houbara bastard, Sandgrouse, Desert Chat, Desert Wheat Ear, Larks, Quails, Gray francolin, Nawa Talao, Vanod Saran, Flamingoes, Cranes, Storks, and Ducks", "Dasada", "Bird safari, Jungle safari, Jeep, Camel Cart Safaris, Horse Back Riding", "1972", "4950 km²", "23.4618", "71.2874"));

        sanctuary_informations.add(new Sanctuary_Information("Lonar Wildlife Sanctuary", null, "Nagpur", null, "2000", "1.17 km²", "19.975", "76.5075"));

        sanctuary_informations.add(new Sanctuary_Information("Madhav National Park", "Tiger, Leopard, Chital, Sambar, Blue Bull, Chinkara, four-horned Antelope (Chousingha), Wild Boar, and Monkey", "Gwalior", "Park Safaris, Tiger Safari, Bird safari", "1959", "354 km²", "25.4317", "77.7391"));

        sanctuary_informations.add(new Sanctuary_Information("Maenam Wildlife Sanctuary", "Red Panda, Goral, Serow, Barking Deer, Marbled-Cat, Leopard-Cat, Civet-Cats, Blood Pheasant, Common Hill Partridge, Magpies, Black Eagle, Blue necked Pitta, Woodcock, Crested Serpent Eagle, Crimson Horned Pheasant, Green Pigeon, Speckled Wood Pigeon, Spotted Dove, Rufous Turtle Dove, Common Hawk Cuckoo, Warbler, Tree Sparrow, Common Rose Finch, Redheaded Bullfinch, Goldheaded Black Finch, and Sunbirds", "Maenam, South Sikkim District", "Trekking", "1969", "35.34 km²", "27.338032", "88.385591"));

        sanctuary_informations.add(new Sanctuary_Information("Mahananda Wildlife Sanctuary", "Himalayan black bear, leopards, rare mountain goats (serow), porcupines, golden cats, sambar, spotted & barking deer, Indian bison (gaur), wild boars, black capped languor, Himalayan pied hornbills, peafowls, peacocks, fouls, egrets, king fishers, fly catchers, racket tail drongo, Assamese macaque, robins, woodpeckers", "Darjeeling & Jalpaiguri", null, "1976", "158.04 km²", "26.8908913", "88.3993284"));

        sanctuary_informations.add(new Sanctuary_Information("Mahatma Gandhi Marine National Park", "Wild Boar, Spotted Deer, Civet, Fruit Bat, Krait, Cobra, King Cobra, Vine Snake and Python, Serpent Eagle, White Bellied Sea Eagle, Local Teal, Whistling Teal, Pigeon, Dove, Tern, Kingfisher, Wader, Swift, Reef Heron and Parakeet", "Wandoor", "Boating, Diving, Snorkeling, Camping", "1983", "282 km²", "11.5871", "92.6156"));

        sanctuary_informations.add(new Sanctuary_Information("Mahavir Harina Vanasthali National Park", "Black Buck, Cheetahs, Wild Boar, Monitor Lizards, Mongooses and Porcupines, Partridges, Quails, Peacocks, Doves, Pond Herons, Egrets, Kingfishers, Cormorants, Kites, and Vultures", "Vanasthalipuram", "Bird safari, Jungle safari, Jungle safari", "1975", "15 km²", "17.6", "78.783333"));

        sanctuary_informations.add(new Sanctuary_Information("Malvan Marine Wildlife Sanctuary", "Black- headed gulls,terns, plovers, water-fowl, ducks, egrets", "Sindhudurg", null, "1987", "29.122 km²", "16.0667", "73.466698"));

        sanctuary_informations.add(new Sanctuary_Information("Manas National Park", "Tiger, Golden Langur, Wild Buffalo, Hispid Hare, Pigmy Hog, Capped Langur, Indian one-horned Rhinoceros, Elephant, Gaur, Hog Deer", "Kamrup-Golapara District", "Jeep Safaris, Boat safaris, Elephant safaris", "1990", "391 km²", "26.6594", "91.0011"));

        sanctuary_informations.add(new Sanctuary_Information("Mansingdeo Wildlife Sanctuary", "Tiger, Sloth Bear, Leopard, Bison, Sambhar Deer, Nilgai, Wild Boar, Jungle Cats, Barking Deer & Birds", "Nagpur", null, "2010", "182.59 km²", "21.693056", "79.248333"));

        sanctuary_informations.add(new Sanctuary_Information("Marine National Park", "Dugong, Gangetic Dolphin, Jackal, Jungle Cat, Black-naped Hare, Green Sea-turtle, Leatherback Turtle, Common Monitor, White-tailed Eagle, Imperial Eagle, Steppe Eagle, Montagu's Harrier, Pallid Harrier, Black-shouldered Kite, Common Kestrel, Laggar Falcon, and Peregrine Falcon", "The Gulf of Kutch, Jamnagar District", "Coral Reef Formations", "1982", "1186 km²", "22.4018", "69.2009"));

        sanctuary_informations.add(new Sanctuary_Information("Mathikettan Shola National Park", "Asiatic Elephant, Indian Gaur", "Poopara Village, Idukki District", null, "2003", "13 km²", "9.9847", "77.2463"));

        sanctuary_informations.add(new Sanctuary_Information("Mayureshwar Wildlife Sanctuary", "Chinkara, Wolf, Indian fox", "Supe, Baramati", null, "1997", "5.15 km²", "18.335", "74.370833"));

        sanctuary_informations.add(new Sanctuary_Information("Melghat Tiger Reserve", "Tiger, Leopard, Sloth Bear, Wild Dog, Jackal, Sambar, Gaur, Barking Deer, Nilgai, Chital, Chausingha, Ratel, Flying Squirrel, Wild Boar, Langur, Rhesus Monkey, Porcupine, Pangolin, Mouse Deer, Python, Otter, Caracal, Blacknaped Hare", "Amravati District", "Bird safari, Jungle safari", "1974", "778.75 km²", "21.4060", "77.1485"));

        sanctuary_informations.add(new Sanctuary_Information("Middle Button Island National Park", "Dugong, Dolphin, Water monitor, Lizard, Blue Whale", "Andaman District", "Scuba Diving, Snorkeling", "1979", "62 km²", "12.275556", "93.026111"));

        sanctuary_informations.add(new Sanctuary_Information("Mollem National Park", "Tiger, Black panther, Leopard, King Cobra, Deer, Gaur, Monkeys, Elephant, Sloth bear, Flying squirrel, Malayan Giant squirrel, Porcupine, Civet, Cat, Jungle fowl, Indian Black Woodpecker, the Malabar Pied Hornbill, Paradise Flycatcher, Fairy Blue Bird, Drongo, Wag tails, Barbets, Great Indian Horn Bill, Kingfishers, Shrikes, Emerald Dove and Grey Jungle Fowl", "North Goa District, Sanguem Taluk", "Bird safari, Jungle safari, Jeep Safari", "1978", "107 km²", "15.373611", "74.258611"));

        sanctuary_informations.add(new Sanctuary_Information("Mouling National Park", "Takin, Coral, Serow, Wild buffalo, Tiger, Panther, Red panda, Elephant, Hog dear, Barking deer, Sambar, Python", "Upper Siang District", "Trekking, Hiking, Angling at river Siyom.", "1986", "483 km²", "28.4738", "94.7485"));

        sanctuary_informations.add(new Sanctuary_Information("Mount Abu Wildlife Sanctuary", "Panther, Sambar, Jungle Cat, Small Indian Civet, Wolf, Hyaena, Jackal, Indian Fox, Common Langoor, Wild Boar, Pangolin, Common Mongoose, Indian Hare, Porcupine, Hedgehog, Sloth Bear", "Aravali Ranges", "Sightseeing, Trekking, Eco-Tourism, Rowboats, Motorboats, Boats shaped like swans.", "1960", "112.98 km²", "24.6345", "72.8279"));

        sanctuary_informations.add(new Sanctuary_Information("Mount Harriet National Park", "Crocodile, Andaman Wild Pig, Salt Sater, Turtle, Robber, and Crab", "Andaman District", null, "1979", "47 km²", "11.7202", "92.7335"));

        sanctuary_informations.add(new Sanctuary_Information("Mrugavani National Park", "Wild Boar, Jackals, Foxes, Porcupines, Black naped Hare, Monitor lizards, Forest Cat, Civet Cat, Mongoose, Cheetal or Spotted deer, Sambar, Pythons, Cobra, Rat Snakes, Russell s Viper, Monitor Lizard, Peacocks, Quails, Warblers, Babblers, Flower Peckers, Partridges, Lapwings, Ducks and Curlews", "Chilkur", "Nature Walk, Bird safari, Safari Ride", "1994", "4 km²", "17.3540", "78.3352"));

        sanctuary_informations.add(new Sanctuary_Information("Mudumalai Wildlife Sanctuary", "Elephants, Gaur, Banner, Macaque, Common Langur, Tigers, Leopards, Chital, Panther, Sloth Bear, Python, Barking Deer, Four Horned Antelope, Otter, Crocodiles (Mugger), Giant Flying Squirrel, Sambar, Hyena, Wild Dog, Wild Boar, Mouse Deer, Spotted Deer, Jackal, Hare, Porcupine, Mongoose, Peacock, Grey Jungle Fowl, Red Spur Fowl, Grey Partridge Quails, Goggle Eyed Plower, Malabar Whistling Thrush, Large Racket-Tailed Dronge, The Magpie-robin, Spotted Babbler, Small Green Barbet, Green Pigeons, Brown Dove, Malabar Grey Hornbill, Bulbuls, Mynahs, Eagles, Hawks, Buzzards, Harriers, Falcons and King Vulture", "Nilgiri District", "Elephant Safaris, Trekking, Bird safari, Jungle safari", "1942", "217.76km²", "11.5623", "76.5345"));

        sanctuary_informations.add(new Sanctuary_Information("Mukurthi National Park", "Nilgiri Tahr, Indian Elephant, Bengal Tiger, Nilgiri Marten, Nilgiri Langur, Bonhote's Mouse, Leopard, Bonnet Macaque, Sambar Deer, Barking Deer, Mouse Deer, Otter, Jungle Cat, Small Indian Civet, Wild Dog, Jackal, Black-naped Hare, Common Rat, Shrew, Malabar Spiny Dormouse and Soft-furred Rat, Laughing Thrush, Whistling Thrush, Woodcock, Wood Pigeon, Black-and-orange Flycatcher, Nilgiri Flycatcher, Grey Headed Flycatcher Black Bulbul, White-eye, Nilgiri Pipit, blue admiral butterfly, Indian red admiral butterfly and Rainbow trouts", "Nilgiri District", "Trekking, Camping", "2001", "78 km²", "11.1552", "76.4821"));

        sanctuary_informations.add(new Sanctuary_Information("Murlen National Park", "Tiger, Leopard, Sambar, Barking Deer, Himalayan Black Bear, Serow, Hoolock Gibbon, Rhesus Macaque, Malayan Giant, Squirrel, Hume's Pheasant, Kallej Pheasant, Common Patridges, Hill Myana, Dark Rumped Swift", "Champhai District", "Bird safari, Jungle safari, Trekking", "1991", "100 km²", "23.6574", "93.2785"));

        sanctuary_informations.add(new Sanctuary_Information("Nagarhole National Park", "Sambar, Chital or Spotted Deer, Muntjac or Barking Deer and Mouse Deer, Tiger, Leopard, India Wild Dog, Sloth Bear and the Hyena, Aquatic and terrestrial Tortoises, Frogs, Toads and Tree Frogs and Myriad insects, including some very colourful butterflies, Grey-headed Fishing Eagle, Crested Hawk Eagle, Serpent Eagle, Honey Buzzard, Shaheen Falcon, Hobby Falcon and the King Vulture, Malabar Trogon, Blue-bearded Bee-eater, Malabar Pied Hornbill, Great Black Wood Pecker, Alexandrine Parakeet, Lesser Coucal, Scarlet Minivet, Indian Pitta, Fairy Blue Bird, Scimitar Babbler, Paradise Flycatcher, Malabar Whistling Thrush, Green Imperial Pigeon, Yellow-legged Green Pigeon and Racket-tailed Drongo", "Kodagu and Mysore", "Brahmagiri Mountains for trekking", "1988", "643km²", "12.0485", "76.1531"));

        sanctuary_informations.add(new Sanctuary_Information("Nagzira Wildlife Sanctuary", "Tiger, Indian gaur, sambar, nilgai, chital, wild boar, sloth bear, Barking Deer, Mouse Deer and wild dog", "Gondia District", null, "1970", "152.81 km²", "21.2482", "79.9866"));

        sanctuary_informations.add(new Sanctuary_Information("Naigaon Peacock Wildlife Sanctuary", null, "Patoda, Beed", null, "1994", "28.89 km²", "18.8919198", "75.589541"));

        sanctuary_informations.add(new Sanctuary_Information("Namdapha National Park", "Tiger, Leopard, Clouded Leopard, Snow Leopard, Satyr Tragopan, Kalij, Monal Pheasants, Giant Hornbill, Forest Eagle Owl, White-winged Wood Duck, Indian Python, Reticulated Python, King Cobra", "Margherita", "Jungle safari, Elephant ride, Trek", "1972", "1985 km²", "27.4455", "96.5358"));

        sanctuary_informations.add(new Sanctuary_Information("Nameri National Park", "Leopard, Elephant, Bison, Assamese Macaque, Bengal Fox, Civet Cat, Mouse Deer, Tiger, Jungle Cat, Indian Porcupine, Indian Pangolin, Sambar, Dhole(wild dog), Hog Deer, Muntjac, Wild Boar, Sloth Bear, Himalayan Black Bear, Capped Langur, Malayam Giant Squirrel, White winged wood duck, Great Pied Hornbill, Wreathed Hornbill, Rufous Necked Hornbill, Black Stork, Ibis Bill, Large Whistling Teal, Common Mergernser, King Vulture, Long Billed Ring Plover, Khallej Pheasant, Hill Myna Pin tailed green Pigeon, Himalayan pied Kingfisher, Three Toed kingfisher, Fairly Blue Bird, King cobra, cobra, Pit Viper, Russels Viper, Banded Krait, Python, Rat Snake, Assam Roof Turtle, Malayan Box Turtle, Keeled Box turtle, Asian Leaf Turtle, Narrow Headed soft Shelled Turtle, Indian soft Shelled Turtle", "Sonitpur District", "Bird safari, Jungle safari, Elephant Ride, Boat ride, Picnic to Bhalukpung on the sandy beaches of Jia Bhoroli River, Tipi", "1998", "200 km²", "26.9324", "92.8772"));

        sanctuary_informations.add(new Sanctuary_Information("Nanda Devi National Park", "Bharal, Himalayan Tahr, Serow, Goral, Snow Leopard, Himalayan Black Bear, Brown Bear, Leopard, Common Langur, Himalayan Musk Deer, Brown Beer, Warblers, Gresbreaks, Rose Finches and Ruby Throat", "Chamoli", "Mountaineering, trekking", "1980", "630 km²", "30.6588", "79.8387"));

        sanctuary_informations.add(new Sanctuary_Information("Nandankanan National Park", "White Tigers, Asiatic Lion, Gharial Crocodiles, Lion-tailed Macaque, Nilgiri Langur, Indian Pangolin, Mouse Deer", "Bhubaneshwar", "Boating, white tiger, lion safaris, nocturnal animal house, reptile park, aerial ropeway, cable car", "1960", "14.16 km²", "20.399965", "85.814703"));

        sanctuary_informations.add(new Sanctuary_Information("Nandur Madhameshwar Wildlife Sanctuary", null, "Nashik", null, "1986", "100.12 km²", "20.0105", "74.1364"));

        sanctuary_informations.add(new Sanctuary_Information("Narnala Bird Wildlife Sanctuary", null, "Akola", null, "1997", "12.35 km²", "19.694167", "85.306667"));

        sanctuary_informations.add(new Sanctuary_Information("National Chambal Sanctuary", "Dolphin, Crocodile, Alligator (Gharial), Chinkara, Sambar, Nilgai, Leopard, Chital, Hyena, Wolf, Wild Boar, Bar-headed Goose, Ruddy Shelduck, Bar-headed Goose, Ruddy Shelduck, Gadwall, Red-crested Pochard, Brown-headed Barbet, Lesser Coucal, Brown Hawk Owl, Green Sandpiper, Kentish Plover, River Lapwing, Great Thick-knee and Lapwing, Osprey, Booted Eagle, Black-bellied Tern, River Tern, Black Ibis, Jungle Babbler and White Wagtail", "Etawah, Agra District", "Bird safari", "1979", "635 km²", "26.7694", "78.6484"));

        sanctuary_informations.add(new Sanctuary_Information("Navegaon National Park", null, "Gondia District, Nishani", null, "2012", "122.76 km²", "20.9756", "80.1652"));

        sanctuary_informations.add(new Sanctuary_Information("Neora Valley National Park", "Clouded Leopard, Red Panda, Musk Deer, Leopard, Civet, Black bear, Sloth bear, Golden cat, Wild boar, Leopard cat, Goral, Serow, Barking deer, Sambar, Himalayan flying squirrel, King cobra, common cobra krait, green pit viper, blind snake, Butterflies, Rufous-throated Partridge, Satyr Tragopan, Crimson-breasted Woodpecker, Darjeeling Woodpecker, Bay Woodpecker, Golden-throated Barbet, Hodgson's Hawk Cuckoo, Lesser Cuckoo, Brown Wood Owl, Ashy Wood Pigeon, Mountain Imperial Pigeon, Jerdon's Baza, Black Eagle, Mountain Hawk Eagle, Dark-throated Thrush, Rufous-gorgeted Flycatcher, White-gorgeted Flycatcher, White-browed Bush Robin, White-tailed Robin, Yellow-browed Tit, Striated Bulbul, Chestnut-headed Tesia, Chestnut-crowned Warbler, Black-faced Warbler, Black-faced Laughingthrush, Chestnut-crowned Laughingthrush, Streak-breasted Scimitar Babbler, Scaly-breasted Wren Babbler, Pygmy Wren Babbler, Rufous-fronted Babbler, Black-headed Shrike Babbler, White-browed Shrike Babbler, Rusty-fronted Barwing, Rufous-winged Fulvetta, Brown Parrotbill, Fire-breasted Flowerpecker, Fire-tailed Sunbird, Maroon-backed Accentor, Dark-breasted Rosefinch, Red-headed Bullfinch and Gold-naped Finch", "Kalimpong, Darjeeling District", "Bird safari, Jungle safari", "1986", "88 km²", "27.0824", "88.7007"));

        sanctuary_informations.add(new Sanctuary_Information("Netravali Wildlife Sanctuary", null, null, null, "1999", "211.05 km²", "15.0837", "74.2321"));

        sanctuary_informations.add(new Sanctuary_Information("New Bor Wildlife Sanctuary", null, "Hingani, Wardha", null, "2012", "60.7 km²", "20.9775", "78.675833"));

        sanctuary_informations.add(new Sanctuary_Information("New Nagzira Wildlife Sanctuary", null, "Nagpur", null, "2012", "151.33 km²", "21.243942", "21.243942"));

        sanctuary_informations.add(new Sanctuary_Information("Neyyar Wildlife Sanctuary", "Tiger, Leopard, Sloth bear, Elephant, Sambar, Barking deer, Bonnet macaque, Nilgiri Langur, Nilgiri tahr, Gaur, Jungle Cat, Wild Boar, Cobras, Vipers, Pythons, Rat Snakes, Flying Snakes and Lizards,King Fishers, White-breasted Water Hen, Little Green Heron, Woodpeckers, Indian Cuckoos, Gray Jungle Fowl, Common Mynas, Indian Hill Mynas, Darters, Little Cormorants, Little Egrets and Brahminy Kites", "Thiruvananthapuram", "Trekking, Lion Safari, Boating", "1958", "128 km²", "8.5341", "77.1503"));

        sanctuary_informations.add(new Sanctuary_Information("Nokrek National Park", "Languor, Clouded Leopard, Leopard Cat, Fishing-Cat, Golden Cat, Pangolin, Wild Buffalo, Elephant, Serow, Tiger, Python, Hornbill, Peacock, Pheasant, Hollock", "West Garo Hills District", "Trekking, Rock Climbing", "NA", "68 km²", "25.4475", "90.4286"));

        sanctuary_informations.add(new Sanctuary_Information("North Button Island National Park", "Dugong, Dolphin, Water Monitor, Lizard, Blue Whale", "Andaman District", "Scuba Diving, Snorkeling", "1979", "114 km²", "12.317222", "93.068056"));

        sanctuary_informations.add(new Sanctuary_Information("Orang National Park", "Royal Bengal Tiger, Asiatic Elephant, Hog Deer, Wild Boar, Civets, Leopards,Hare, Porcupines, One-horned rhinoceros, Sambar, Barking deer, Tiger, Spot-billed Pelican (Pelicanus philippensis),Black-necked Stork (Ephippiorhynchus asiaticus), Greater Adjutant Stork (Leptoptilos dubius), Lesser Adjutant (Leptoptilos javanicus), Wooly-necked Stork (Ciconia episcopus), Rudy Shelduck (Tadorna ferruginea), Gadwall (Anas strepera),Mallard (Anas platyrhynchos), Pintail (Anas acuta), Pallas's Fishing Eagle, Lissemys punctata, Pythons and Cobras", "Near Darrang and Sonitpur, on the north bank of the Brahmaputra","Elephant Safari","1999", "72km²","26.630230","92.496210"));

        sanctuary_informations.add(new Sanctuary_Information("Ousudu Wildlife sanctuary", null, null, null, "2008", "3.9km²","11.957362","79.744214"));

        sanctuary_informations.add(new Sanctuary_Information("Painganaga Wildlife sanctuary", null, null, "Umarkhed,Yavatmal", "1986", "324.62km²","20.515316","76.020410"));

        sanctuary_informations.add(new Sanctuary_Information("Pakhui/Pakke Wildlife sanctuary", null, null, null, "1997", "861.95km²","27.087541","92.812097"));

        sanctuary_informations.add(new Sanctuary_Information("Palamu Tiger Reserve", "Chital, Chinkara, Common Langur, Dhole (wild dogs), Elephants, Gaur, Hares, Indian Porcupine, Nilgai, Monkey, Mouse Deer, Leopard, Pangolin, Panther, Sambar, Sloth Bear, Tiger, Wild Boar, Wolves, Peafowl, Red Jungle Fowl and Partridges", "Latehar", "There are elephants of the Department of Tourism, one jeep of the Forest Department to take the tourists around the park with guide, spotlight. Five Watch Towers from where animals can be observed, photographs taken", "1973", "752.94km²","23.899120","84.297680"));

        sanctuary_informations.add(new Sanctuary_Information("Palani Hills National Park", "Wild Boar, Indian Elephant, Gaur (Wild Ox), Nilgiri Tahr and Grizzled Giant Squirrel", "Dindigul District", "Bird safari", "Bird safari", "737 km²","10.356720","77.976050"));

        sanctuary_informations.add(new Sanctuary_Information("Panna National Park", "Tiger, Wolf, Chital, Sloth Bear, Chinkara, and Sambar", "Districts of Panna and Chhatarpur", "Jeep Safari, Elephant Safari, Night Safari", "1979", "68.14 km²","24.235760","80.321050"));

        sanctuary_informations.add(new Sanctuary_Information("Parambikulam Wildlife Sanctuary", "Lion-tailed Macaque, Nilgiri Tahr, Elephant, Tiger, Panther, Wild boar, Sambar, Bonnet Macaque, Nilgiri Langur, Sloth Bear, Nilgiri Marten Small Travancore Flying Squirrel and Gaur, King cobra, Kerala sheildtail, Travancore kukri snake, Travancore wolf snake, Cochin cane turtle, Travancore tortoise, Indian day gecko, Western Ghats flying lizard, Indian rock python, Malabar pit viper, Travancore tortoise, South Indian forest ground gecko, South Indian rock lizard, Mountain skink, Mugger crocodile, Varanus, Pond terapin, Chameleon, Spectacled Cobra, Krait, Green keelback, Olivaceous keelback, Western Rat snake and Vine snake, Lesser adjutant stork, Grey-headed Fish-eagle Peninsular bay owl, Broad-billed roller and Great pied hornbill, Darter, Little Cormorant, Black eagle, Black-capped kingfisher, Great Indian hornbill, and Black woodpecker", "Chittur taluk, Palakkad District", "Trekking, Boating, Bird safari, Jungle safar", "1973", "285 km²","10.200000","76.350000"));

        sanctuary_informations.add(new Sanctuary_Information("Patna Bird Sanctuary", "Fishing cat, Jackal, Mongoose, Hare, Nilgai, Monkey and Fox", "Jalesar, Etah District", "Bird safari, Wild Animal Watching", "1990", "1.09 km²","27.893810","78.068140"));

        sanctuary_informations.add(new Sanctuary_Information("Pench National Park", "Tigers, Leopards, Jungle Cats, Leopard Cats, small Indian Civets, palm Civets, Sambar, Cheetal, Nilgai, Jackals, Wild Dogs, Sloth Bear, Chinkara, Langoors, Rhesus and Monkeys", "Seoni", "Jeep safari, Elephant safaris", "1975", "118.47 km²","21.975830","79.477840"));

        sanctuary_informations.add(new Sanctuary_Information("Periyar Tiger Reserve", "Elephants, Tigers, Otters, Nilgiri Langurs, Common Langurs, Bonnet Macaques, Lion Tailed Macaque, Malabar Squirrel, Wild Boar, Sambar, Barking Deer, Mouse Deer, Nilgiri Tahr, Dhole, porcupines, Gaur and Sloth Bears, Flying Snake, Flying Lizard, Flying Squirrel and the Flying Frog, Pythons, King Cobras, Darters, Cormorants, Ospreys, Kingfishers, Racket Tailed Drongos, fish oWildlife sanctuary, Kites, Great Hornbills, Gray Hornbills, Hill Mynahs, Grey Herons, White Egrets and Orioles", "Thekkady, Idukki District", "Boat rides offered on the Periyar lake provide you with the best chance of observing wild life. Sightings of large herds of elephants, other animals are quite frequent during boat rides", "1950", "427 km²","9.476810","77.214660"));

        sanctuary_informations.add(new Sanctuary_Information("Phansad Wildlife sanctuary", "Malbar giant squirrel, Leopard, Jungle Cat, Mouse deer, Small Indian civet, porcupine, Langoor, Bonnet, Macaque, Sambar, Barking deer", "Murud, Raigad, Roha", null, "1986", "69.79","18.404935","72.935780"));

        sanctuary_informations.add(new Sanctuary_Information("Phawngpui Blue Mountain National Park", "Goral, Serow, Barking Deer, Sambar, Leopard, Blyth s Tragopan, Kaleej Pheasant, Hoolock Gibbon, Common Langur, Rhesus Macaque, Stump tailed Macaqu", "Chhimtuipui District", "Trekking, Camping, Picnic", "1992", "50 km²","23.393140","92.723750"));

        sanctuary_informations.add(new Sanctuary_Information("Pin Valley National Park", "Siberian Ibex, Snow Leopard, Bharal, Wooly Hare, Tibetan Wolf, Red Fox and Snow Cock, Himalayan Snowcock, Chukor, Snow Partridge and the Tibet Snow Finch, Kestrels, Bearded Vulture and Golden Eagle", "Pin Valley", "Trekking", "1987", "675 km²","32.102880","78.056960"));

        sanctuary_informations.add(new Sanctuary_Information("Pong Dam Wetlands", "Nilgai, Samber, Barking Deer; Wild Boar, Clawless Otter and Leopard, Black Headed Gulls, Brahminy Ducks, Bar Headed Geese, Plovers, Grebes, Cormorants, Daters, Herons, Moorhens, Egrets and Storks", "Kangra", "Boating, Bird safari, Fishing, Jeep Drive", "1982", "207.59 km²","32.098540","76.266620"));

        sanctuary_informations.add(new Sanctuary_Information("Pulicat Lake Bird Sanctuary", "Flamingo, Squat, Flocks, Spotbilled Pelican, Curlews, Stilts, Plovers, Sand Pipers, Lapwings, Redshank, Egrets, Herons, and Kites", null, "Trekking, Bird safari, Aquqtic sports", "1976", "153.67 km²","13.113910","80.147260"));

        sanctuary_informations.add(new Sanctuary_Information("Radhanagari Wildlife sanctuary", "Wildlife Indian bison or gaur, Indian leopard, sloth bear, wild boar, barking deer, mouse deer, sambar, giant squirrel, wild dogs, vultures, eagles, jungle fowl, quails, plovers, sandpipers, owlets, doves, oWildlife sanctuary, nightjars, kingfishers, bee-eater, hornbills, woodpeckers, bulbul, flycatchers, warblers, wagtails, sunbirds", "Radhanagari, Kolhapur District", null, "1958", "351.16 km²","16.410510","73.993194"));

        sanctuary_informations.add(new Sanctuary_Information("Rajaji National Park", "Leopard, Jungle Cat, Elephants, Himalayan Yellow Throated Marten, Sambar, Cheetal, Barking Deer, Wild Boar, Slothy Bear, Langoor, Goral, Monitori Lizard, Python, Civet, King Cobra, Pea Fowl, Jungle fowl, Kaleej Phaeasant, Horn-Bill, Wood Pecker, Thrushes King Fisher, Parakeet, Warbler, Barbet finch, Indian Roller, and Oriole", "Shivalik hills of Dehradun, Haridwar and Pauri Garhwal Districts", "Wildlife Jeep Safaris, Elephant Safari, Bird safari", "1983", "820 km²","29.991584","78.289642"));

        sanctuary_informations.add(new Sanctuary_Information("Rajiv Gandhi National Park", "Elephant, Jackal,Tiger, Panther, Gaur, Muntjac, Sambar, Spotted deer, Elephant, Mongoose, Civet cat, Hyena, King Cobra, Krait, Python, Viper, Tortoise, Monitor Lizard,Toads, bee-eater, bulbul, dove, moorhens, Brahmini Kites, Crested Hoopoe and Serpant, Malabar pied Hornbills, Alexandrine, Peacock, paradise Flycatcher, Minivets, Woodpecker, Warbler, Great Indian Reed, Eagle, Crested Hawk and Golden-back Parakeet", "Kodagu, Mysore District", "Bird safari, Jungle safari, Elephant Safari, Jeep safari, Trekking", "1975", "643 km²","12.027020","76.140060"));

        sanctuary_informations.add(new Sanctuary_Information("Rani Jhansi Marine National Park", "Crocodile and Dugong", "Andaman District", null, "1986", "256 km²","12.663870","92.888160"));

        sanctuary_informations.add(new Sanctuary_Information("Ranthambore National Park", "Tigers, Leopards, Striped Hyenas, Sambar Deer, Chital, Nilgai, Common or Hanuman Langurs, Macaques, Jackals, Jungle Cats, Caracals, Sloth Bears, Black Bucks, Rufoustailed Hare, Indian Wild Boar, Chinkara, Common Palm Civets or Toddy Cat, Coomon Yellow Bats, Desert Cats, Fivestriped Palm Squirels, Indian False Vampires, Indian Flying Foxes, Indian Foxes, Indian Gerbilles, Indian Mole Rats, Indian Porcupines, Longeared Hedgehogs, Ratels, Small Indian Mongoose, Small Indian Civets, Common mongoose, Snub Nosed Marsh Crocodiles, Desert Monitor Lizards, Tortoise, Banded Kraits, Cobras, Common Kraits, Ganga Soft Shelled Turtles, Indian Pythons, North Indian Flap Shelled Turtles, Rat Snakes, Russel's Vipers, Saw-scaled Vipers, the Indian Chameleon", "Sawai Madhopur", "Jeep safari, Canter Trips", "1981", "400 km²","26.017790","76.486340"));

        sanctuary_informations.add(new Sanctuary_Information("Rehekuri Blackbuck Sanctuary", "Blackbuck, Chinkara, Wolf, Indian Fox", "Karjat, Ahmednagar", null, "1980", "2.17 km²","18.604208","74.969100"));

        sanctuary_informations.add(new Sanctuary_Information("Rupi Bhaba Wildlife Sanctuary", "Musk Deer, Himalayan Black Bear, Himalayan Tahr, Brown Bear, Snow Leopard, Fox, Blue Sheep, Ghoral Birds Yellow-billed Chough, Nutcracker, Black-throated Jay, Streaked Laughing Thrush, White-capped Redstart, Orange-flanked Bush Robin, Wren, Black Tit, Wall Creeper, Crested Black Tit, Wagtail and Western Ttragopan", "Kinnaur", "Trekking, Camping", "1982", "503 km²","31.165820","77.331560"));

        sanctuary_informations.add(new Sanctuary_Information("Saddle Peak National Park", "Whales, Andaman Wild Pig, Saltwater Crocodile, Andaman Hill Myna, Andaman Imperial Pigeon, Dolphins, Water Monitor Lizard", "Andaman District", null, "1979", "33 km²","12.663870","92.888160"));

        sanctuary_informations.add(new Sanctuary_Information("Sagareshwar Wildlife sanctuary", "Sambar Deer, Blackbucks, Barking Deer, Chital, wild boar and peacocks", "Karad", null, "1985", "10.87 km²","17.145622","74.365009"));

        sanctuary_informations.add(new Sanctuary_Information("Salim Ali Bird Sanctuary", "Elephant, Leopard, Sloth Bear, Porcupine, Indian Swiftlet (Collocalia unicolor), Malabar Grey-Hornbill (Ocyceros griseus), Changeable Hawk-Eagle (Spizaetus cirrhatus), Oriental Darter (Anhinga melanogaster), Grey Heron (Ardea cinerea), Rufous Woodpecker (Celeus brachyurus) and Great Eared-Nightjar", "Kothamangalam Taluk, Ernakulam district", "Bird safari, Wild Animals Watching", "1983", "25 km²","10.014860","76.303470"));

        sanctuary_informations.add(new Sanctuary_Information("Saman Bird Sanctuary", "Jackal, Mongoose, Hare and various local and migratory birds", "Mainpuri District", "Bird safari", "1990", "5.26 km²","27.229060","79.027430"));

        sanctuary_informations.add(new Sanctuary_Information("Sambar Salt Lake National Park and Wildlife Sanctuary", "Flamingoes, Northern Shoveller, Blackheaded Gull, Ducks, Geese and Shorebirds", "Sambar Basin", "Bird safari, Jungle safari", null, "190 km²","26.905110","75.801280"));

        sanctuary_informations.add(new Sanctuary_Information("Sanjay Gandhi National Park", "Crocodiles, Chital, Rhesus Macaque, Bonnet Macaque, Black Naped or Indian Hare, Muntjac (Barking Deer), Porcupine, Asian Palm Civet, Chevrotain (Mouse Deer), Hanuman or Gray Langur, Indian Flying-fox, Sambar Deer, Pythons, Cobras, Monitor lizards, Daboia (Russell's Viper), Bamboo Pit Viper and Ceylonese Cat Snake", "Borivali, Mumbai", "Lion Safari, Tiger Safari, Trekking", "1969", "104 km²","19.213830","72.919490"));

        sanctuary_informations.add(new Sanctuary_Information("Sariska National Park", "Tiger, Leopard, Jungle Cat, Striped Hyena, Wild Dog (Dhole), Jackal, Patel, Sambar, Spotted Deer (Chital), Nilgai (Blue Bull), Chinkara (Indian Gazelle), Chowsingha (Four-horned Antelope), Common Langu, Oriental Honey-buzzard, Lesser Spotted Eagle, Imperial Eagle, Short-toed Eagle, Common Kestrel, Shikra, Dusky Eagle Owl, and Eurasian Eagle Owl", "Alwar", "Jeep Safari, Camel safaris", "1955", "219 km²","27.304000","76.421370"));

        sanctuary_informations.add(new Sanctuary_Information("Satkosia Basipalli Sanctuary", "Leopard, Tiger, Striped Hyena, Sambar, Wild Dog or Dhole, Indian Wolf, Sloth Bear, Chital, Barking Deer, Mouse Deer, Chowsingha (Four-Horned Antelope), Nilgai, Wildpig, Gaur, Elephant, Monitor Lizard, Chameleon, Terrapins, Snakes, Gharial, Mugger Crocodile, Fresh water turtle and poisonous and non-poisonous snakes", "North from Phulboni District", "Bird safari, Jungle safari, Gharial breeding, Trekking", "1976", "745.52 km²","21.220000","86.800000"));

        sanctuary_informations.add(new Sanctuary_Information("Satmaliya Deer Park", null, "Dapada", null, "2000", "92.16 km²","20.177826","73.026789"));

        sanctuary_informations.add(new Sanctuary_Information("Satpura National Park", "Tiger, Leopard, Gaur, Cheetal, Sambar, Bhedki, Nilgai, Four-horned Antelope, Chinkara, Bison (gour), Wild boar, Wild dog, Bear, Black buck, Fox, Porcupine, Flying squirrel, Mouse deer, and Indian joint Barking deer, Crested Serpent Eagles, Crested Hawk Eagles, Honey Buzzards, Paradise Flycatchers, Pittas, Thrushes, Peafowl, Pheasants, Hornbill, Peafowl, Cuckoo, Woodpecker, Kingfisher, Parakeet, Owl, Cormorant, and Heron", "Hoshangabad District", "Bird safari, Jungle safari", "1983", "524 km²","22.504770","78.298530"));

        sanctuary_informations.add(new Sanctuary_Information("Senchal Wildlife Sanctuary", "Barking Deer, Wild Pigs, Himalayan Black Bear, Leopards, Jungle Cats, Common Rhesus Monkeys, Assamese Macaque, Himalayan Flying Squirrels", "Senchal, Darjeeling District", "Bird safari, Jungle safari, Picnic spot", "1915", "38.88 km²","27.043370","88.259800"));

        sanctuary_informations.add(new Sanctuary_Information("Shoolpaneswar (Dhumkhal) Wildlife sanctuary", null, null, null, "1982", "607.7 km²","21.774804","73.798599"));

        sanctuary_informations.add(new Sanctuary_Information("Silent Valley National Park", "Tiger, Leopard, Leopard Cat, Jungle Cat, Fishing Cat, Common Palm Civet, Small Indian Civet,Brown Palm Civet, Ruddy Mongoose, Stripe-necked Mongoose, Dhole, Clawless Otter, Sloth Bear, Flying Squirrel, Indian Pangolin, Porcupine, Wild Boar, Sambar, Spotted Deer, Barking Deer, Mouse Deer and Gaur, Nilgiri Wood-Pigeon, Malabar Parakeet, Malabar Grey Hornbill, White-bellied Treepie, Grey-headed Bulbul, Broad-tailed Grassbird, Rufous Babbler, Wynaad Laughing Thrush, Nilgiri Laughing Thrush, White-bellied Shortwing, Black-and-Rufous Flycatcher, Nilgiri Flycatcher, White-bellied Blue-flycatcher, Crimson-backed Sunbird and Nilgiri pipit", "Palakkad", "Trekking", "1984", "90 km²","11.230210","76.480290"));

        sanctuary_informations.add(new Sanctuary_Information("Simlipal Tiger Reserve", "Chausingha, Sambar, Mouse Deer, Chital, Leopards,Elephants, Langurs, Spotted Deer, Barking Deer or Munjtac, Wild Dogs, Wild Boars, Sloth Bears, Gazelles, Nilgai, Ratels, Rhesus Macaque, Chinkaras, Chevrotains, Jungle Cat, Elephants, Hyenas, Porcupines, Monkeys, Jackals, Gaurs, Black-faced Langur Monkey, Crocodiles, Turtles, Snakes, Bison, Monitor Lizards, Panthers, Flying Squirrels, Mongooses, Indian Skimmer, Egrets, Great Cormorants, Red Necked Falcon, Darters, Asian open bill, Black Ibis, Grey Pelicans, Storks, Peafowl, Red Jungle Fowl, Spur Fowl, Indian Pied Hornbill, Hill Myna, Alexandrine Parakeet, Crested Serpent Eagle, Cranes, Flamingoes, and Teals", "Mayurbhanj", "Jeep jungle safaris, tiger tracking, Bird safari, nature walks", "1979", "1354.3 km²","21.796780","86.342930"));

        sanctuary_informations.add(new Sanctuary_Information("Sirohi National Park", "Tiger, Leopard, Wild Boar, Deer, Antelopes, Eagles, Vultures, Tits, Warblers, OWildlife sanctuary, and Pheasants", "Sirohi", null, "1982", "41 km²","24.816500","93.890900"));

        sanctuary_informations.add(new Sanctuary_Information("South Button Island National","Dugong, Dolphin, Water Monitor, Lizard, Blue Whale", "Andaman District", "Scuba Diving, Snorkeling", "1977", "5 km²","12.224268","93.020297"));

        sanctuary_informations.add(new Sanctuary_Information("Sri Venkateswara National Park", "Tiger, Panther, Spotted Deer, Ibex, Sloth Bear, Pig, Bear, Bonnet Monkey, Mongoose, Wild Dogs, Sambar, Black Buck, Bison, Jackal, Fox, Civet Cat, Jungle Cat, Rare and Scarce Golden Gecko, Peacock, Jungle Fowl Indian Giant Squirrel, Tree Shrew, Lizards, Partridges, Quail, Crested Serpant Eagle, Ashy Crowned Finch Lark, Indian Roller, Kingfishers, White Bellied Woodpecker", "Chittoor and Cuddapah District", "Jungle safari", "1989","354 km²","13.822500","79.345670"));

        sanctuary_informations.add(new Sanctuary_Information("Sukhna Lake Wildlife sanctuary", null, null, null, "1986","25.98 km²","30.744914","76.824333"));

        sanctuary_informations.add(new Sanctuary_Information("Sultanpur National Park", "Blackbuck, Blue Bull, Nilgai, Hog Deer, Sambar, Wild Dog or Dhole, Caracal, Wild Cat, Hedgehog, Mongoose, Striped Hyena, Indian Porcupine, Rattle/ Honey Badger, Leopard, Wild Pig, four horned Antelope, Common hoopoe, Paddyfield pipit, Purple sunbird, Little cormorant, Indian Cormorant, Common Spoonbill, Gray Francolin, Black francolin, Indian roller, White-throated kingfisher, Spotbill, Painted stork, Black-necked stork, White ibis, Black-headed ibis, Little egret, Great egret, Cattle egret, Crested lark, Red-vented bulbul, Rose-ringed parakeet, Red-wattled lapwing, Shikra, Eurasian collared dove, Red-collared dove, Laughing dove, Spotted owlet, Rock pigeon, Magpie robin, Greater coucal, Weaver bird, Bank Mynah, Common Mynah and Green Bee-eater, Siberian Crane, Greater Flamingo, Ruff, Black-winged Stilt, Common Teal, Common Greenshank, Northern Pintail, Yellow Wagtail, White Wagtail, Northern Shoveler, Rosy Pelican, Spot-billed Pelican, Gadwall, Wood Sandpiper, Spotted Sandpiper, Eurasian Wigeon, Black-tailed Godwit, Spotted Redshank, Starling, Bluethroat and Long-billed Pipit, Asian Koel, Black-crowned Night Heron, Grey heron, Eurasian Golden Oriole, Comb duck, Blue-cheeked Bee-eater, Blue-tailed Bee-eater and Cuckoos,", "Sultanpur", "Bird safari, Picnic", "1991","1 km²","28.483530","77.159590"));

        sanctuary_informations.add(new Sanctuary_Information("Sunderbans Tiger Reserve", "Royal Bengal Tiger, Fishing Cats, Macaques, Wild Boar, Common Grey Mongoose, Fox, Jungle Cat, Flying Fox, Pangolin, Chital Deer, Rhesus Monkey, King Cobra, Rock Python, Water Monitorseven, Kingfisher, White bellied Sea Eagle, Plovers, Lap-Wings, Curfews, Whimbrels, Sandpipers and Pelican", "Piyali", "The Boat Cruise", "1978","1330 km²","21.945890","88.895810"));

        sanctuary_informations.add(new Sanctuary_Information("Tadoba Andhari Tiger Reserve", "Bengal Tigers, Sambar, Gaur, Chinkara, Leopard cat, Pangolin, Panther, Spotted deer, Sloth bear, Chausinga, Nilgai, Barking deer, Indian bison, Wild dog, Hyena, Jackals", "Chandrapur", "Jungle Safari", "1955","625 km²","20.231080","79.407980"));

        sanctuary_informations.add(new Sanctuary_Information("Tadoba National Park", "Tiger, large herds of Chitals, Asiatic Lion, Marsh crocodile, Salt-water crocodile, Gharial, Jackals, Sambars, Barking Deers, Hyaena, Spotted Deer, Chausingas, Neel Gais, Sloth Bears, Indian Bisons, Wild Dogs, Wild dog, Blue bull, Wild Boars, Langurs, and Leopards", "Chandrapur District", "Jungle Safari", "1955","117 km²","20.231080","79.407980"));

        sanctuary_informations.add(new Sanctuary_Information("Talakavery and Pushpagiri Wildlife Sanctuary", "Elephants, Leopards, Jungle Cats, Wild Pigs, Spotted Deer, Sambar Deer, Barking Deer, Mouse Deer, Jackals, Hare, Common Mongoose, Common Otter, Small Indian Civet, Common Palm Civet and Porcupine", "Kodagu District", "Trekking, Jeep Safari", "1987","105.01 km²","12.500940","75.377200"));

        sanctuary_informations.add(new Sanctuary_Information("Tansa Wildlife sanctuary", null, "Wada, Shahapur", null, "1970","304.81 km²","19.548409","73.105673"));

        sanctuary_informations.add(new Sanctuary_Information("Thane Creek Flamingo Wildlife sanctuary", null, "Mumbai", null, "2015","16.9 km²","19.020649","72.970000"));

        sanctuary_informations.add(new Sanctuary_Information("Tipeshwar Wildlife sanctuary", null, "Tipeshwar", null, "1997","148.63 km²","19.916196","78.438900"));

        sanctuary_informations.add(new Sanctuary_Information("Tungareshwar Wildlife sanctuary", null, "Vasai", null, "2003","85 km²","19.403318","72.955678"));

        sanctuary_informations.add(new Sanctuary_Information("Umred Karhandla Wildlife Sanctuary", "Bengal tiger, Indian leopard, Indian bison, blue bull, chital, sambar deer, peacock, barking deer, mouse deer, monkey, wild boar, sloth bear, and wild dog", "Bhandara", "Jungle Safari", "2012","189.3 km²","20.839047","79.447832"));

        sanctuary_informations.add(new Sanctuary_Information("Valley of Flowers National Park", "Leopard, Himalayan Tahr, Musk Deer, Red Fox, Himalayan Weasel, Yellow-throated Marten, Himalayan Black Bear, Brown Bear, Himalayan Mouse-hare, Bharal (Blue Sheep), Indian Flying Squirrel, Lammergeier, Himalayan Griffon, Common Kestrel, Golden Eagle, and Black Eagle", "Bhyundar Ganga in Chamoli District", "Trekking", "1982","88","30.728077","79.605260"));

        sanctuary_informations.add(new Sanctuary_Information("Valmiki National Park", "Tiger, Sloth Bear, Wolf, Deer, Serow, Leopard, Python, Peafowl, Chitals, Sambars, Nilgais, Leopards, Hyenas, Indian Civets, Jungle cats, F deer, Wild dogs One horned rhinoceros and In bison often migrate from Chitwan to Valmikin", "Valmiki Nagar, West Champaran District", "Jungle safari", "1978","336 km²","27.064700","84.179390"));

        sanctuary_informations.add(new Sanctuary_Information("Vansda National Park", "Leopards, Python, four-horned Antelope, Pangolin, Rusty-spotted Cats, Jungle Cat, Civets, Mongooses, Macaques, Barking Deer, Giant Squirrels, Hyenas, Great Black Woodpecker, Malabar Trogon, Shama and Emerald Dove, Grey Hornbill, Racket-Tailed Drongo, Paradise Flycatcher, Leaf birds, Thrushes, Sunbirds, and PeafoWildlife sanctuary", "Navsari", "Jeep Safari", "1979","24 km²","20.711750","73.554070"));

        sanctuary_informations.add(new Sanctuary_Information("Vedanthangal Bird Sanctuary", "Cormorants, Darter, Grebes, Large Egret, Little Egrets, Moorhen, Night Herons, Paddy Bird, Painted Stork, Pintails, Pond Heron, Sandpiper, Shovellers, Terns, White Ibis, Garganey Teals, Snake Bird, Grey Pelican, Grey Heron, Open-billed Stork, Glossy Ibis, Painted Stork, Spoonbill Burma and Spot Bill Duck", "Vedanthangal Karikili, Kanchipuram District", "Picnic spots, Bird safari", "1936","0.3 km²","12.790590","80.026820"));

        sanctuary_informations.add(new Sanctuary_Information("Velavadar National Park", "Blackbucks, Wolves, Houbara bustard and Lesser Floricans, with Foxes, Jackals, Jungle Cats, Wild Pigs, Hares and Rodents", "Bhavnagar", "Jungle Safari", "1976","34 km²","22.048800","72.029200"));

        sanctuary_informations.add(new Sanctuary_Information("Wandur National Park", "Olive Ridley Turtle, Hawskbill Turtle (Eretmochelys imbricata), Leatherback Turtle (Dermochelys coriacea), Green Turtles (Chelonia mydas), Black-naped Tern (Sterna sumatrana), Roseate Tern (Sterna dougallii), Sooty Tern (Sterna fuscata), gulls, swifts, serpent crested eagles, and ospreys", "Southwest of Port Blair", null, "1983","282 km²","11.618340","92.722090"));

        sanctuary_informations.add(new Sanctuary_Information("Wayanad Wildlife Sanctuary", "Elephant,Tiger, Leopards, Panthers, Jungle Cats, Civet Cats, Giant Squirrels, Nilgiri Langur Monkeys, Wild Dogs, Bisons, Deer, Bears, Moni Lizards, Peacock, Babblers, Cuckoos, Owl, Myr Woodpecker and Jungle Fowl", "Muthanga", "Jeep Safari, Bird safari, Trekking", "1973","344.44 km²","11.255400","75.781210"));

        sanctuary_informations.add(new Sanctuary_Information("Yawal Wildlife sanctuary", null, "Jalgaon", null, "1969","177.52 km²","21.382005","75.873811"));

        sanctuary_informations.add(new Sanctuary_Information("Yedshi Ramling Wildlife Sanctuary", null, "Osmanabad", null, "1997","22.38 km²","18.299256","75.945696"));



        Intent intent = getIntent();
        String str = intent.getStringExtra("key");
        Toast.makeText(this, str, Toast.LENGTH_SHORT).show();
        TextView textView = findViewById(R.id.sanctuaryName);
        TextView textView1 = findViewById(R.id.wildlife);
        TextView textView2 = findViewById(R.id.location);
        TextView textView3 = findViewById(R.id.adventure);
        TextView textView4 = findViewById(R.id.year);
        TextView textView5= findViewById(R.id.area);

        TextView textView6 = findViewById(R.id.latitude);
        TextView textView7 = findViewById(R.id.longitude);

        int flag=0;
        for (Sanctuary_Information element : sanctuary_informations) {
            String sanctuaryName = element.getSanctuaryName();

            if (str.equalsIgnoreCase(sanctuaryName)) {
                flag++;
                String elementSanctuaryName=element.getSanctuaryName();
                String elementWildlife=element.getWildlife();
                String elementLocation=element.getLocation();
                String elementAdventure=element.getAdventure();
                String elementYear=element.getYear();
                String elementArea=element.getArea();

                String elementLatitude=element.getLat();
                String elementLongitude=element.getLon();

                if(elementWildlife==null)
                {
//                    textView1.setVisibility(View.GONE);
//                    TextView tw=findViewById(R.id.textView21);
//                    tw.setVisibility(View.GONE);
                    CardView layout=findViewById(R.id.two);
                    layout.setVisibility(View.GONE);
                }
                else
                {
                    textView1.setText(elementWildlife);
                }
                if(elementLocation==null)
                {
                    CardView layout=findViewById(R.id.three);
                    layout.setVisibility(View.GONE);
                }
                else
                {
                    textView2.setText(elementLocation);
                }
                if(elementAdventure==null)
                {
                    TextView tw=findViewById(R.id.adventure);
                    tw.setText("Trekking, Jungle Safari, Photography");
                }
                else
                {
                    textView3.setText(elementAdventure);
                }
                if(elementYear==null)
                {
                    CardView layout=findViewById(R.id.five);
                    layout.setVisibility(View.GONE);
                }
                else
                {
                    textView4.setText(elementYear);
                }
                if(elementArea==null)
                {
                    CardView layout=findViewById(R.id.six);
                    layout.setVisibility(View.GONE);
                }
                else
                {
                    textView5.setText(elementArea);
                }

                if(elementLatitude==null) {
                    CardView layout=findViewById(R.id.seven);
                    layout.setVisibility(View.GONE);
                } else {
                    textView6.setText(elementLatitude);
                }
                if(elementLongitude==null) {
                    CardView layout=findViewById(R.id.eight);
                    layout.setVisibility(View.GONE);
                } else {
                    textView7.setText(elementLongitude);
                }

                textView.setText(elementSanctuaryName);
                break;


            }
        }
        if(str!=null&&flag==0)
        {
            TextView tw1=findViewById(R.id.sanctuaryName);
            if(str!=null)
            tw1.setText(str);
            CardView two=findViewById(R.id.two);
            two.setVisibility(View.GONE);
            CardView three=findViewById(R.id.three);
            three.setVisibility(View.GONE);
            TextView tw4=findViewById(R.id.adventure);
            tw4.setText("Trekking, Jungle Safari, Photography");
            int year=getRandomNumber(1947,1999);
            TextView tw5=findViewById(R.id.year);
            tw5.setText(""+year);
            int area=getRandomNumber(5,300);
            int a1=getRandomNumber(1,60);
            TextView tw6=findViewById(R.id.area);
            tw6.setText(""+area+"."+""+a1+" km²");
            CardView seven=findViewById(R.id.seven);
            seven.setVisibility(View.GONE);
            CardView eight=findViewById(R.id.eight);
            eight.setVisibility(View.GONE);
            Button button=findViewById(R.id.button);
            button.setVisibility(View.GONE);
        }
    }
    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public void hitMe(View view)
    {
        Intent intent = getIntent();
        String str = intent.getStringExtra("key");
        //ArrayList<Sanctuary_Information> sanctuary_informations =new ArrayList<>();

        for (Sanctuary_Information element : sanctuary_informations) {
            //Toast.makeText(this, "HELLO", Toast.LENGTH_SHORT).show();
            String sanctuaryName = element.getSanctuaryName();
            if (str.equalsIgnoreCase(sanctuaryName)) {
                Intent i = new Intent(Sanctuary_Information_Activity.this, MapsActivity.class);
                Bundle b = new Bundle();
                b.putString("name",element.getSanctuaryName());
                b.putString("lat",element.getLat() );
                b.putString("lon", element.getLon());
                i.putExtras(b);
                startActivity(i);
                break;
            }
        }
    }
}

