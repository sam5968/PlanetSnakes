package com.example.android.venmoussnakes;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sampath on 14-Oct-16.
 */

public class MyAdapter extends BaseAdapter  {

    final static List<Item> snakes = new ArrayList<Item>();
    private final LayoutInflater mInflater;

    private Context context;

    public MyAdapter(Context context)  {
        this.context = context;

        mInflater = LayoutInflater.from(context);

        // Adding list of snakes as an array list in adapter
        snakes.add(new Item("Inland Taipan", R.drawable.inland_taipan));
        snakes.add(new Item("Eastern Brown Snake", R.drawable.eastern_brown_snake));
        snakes.add(new Item("Yellow Bellied Sea Snake", R.drawable.yellow_bellied_sea_snake));
        snakes.add(new Item("Many-Branded Krait", R.drawable.many_branded_krait));
        snakes.add(new Item("Black Mamba", R.drawable.black_mamba));
        snakes.add(new Item("Common Krait", R.drawable.bungarus_caerulus));
        snakes.add(new Item("Coastal Taipan", R.drawable.coastal_tiapan));
        snakes.add(new Item("Indian Cobra", R.drawable.indian_cobra));
        snakes.add(new Item("King Cobra", R.drawable.king_cobra));
        snakes.add(new Item("Russell's Viper", R.drawable.russells_viper));
        snakes.add(new Item("Saw-Scaled-Viper", R.drawable.saw_scaled_viper));
        snakes.add(new Item("Black-Branded Sea Krait", R.drawable.black_branded_sea_krait));
        snakes.add(new Item("Tiger Snake", R.drawable.tiger_snake));
        snakes.add(new Item("Common Death Adder", R.drawable.common_death_adder));
        snakes.add(new Item("Red Headed krait", R.drawable.red_headed_krait));
        snakes.add(new Item("Malayan Krait", R.drawable.malayan_krait));
        snakes.add(new Item("Western Green Mamba", R.drawable.western_green_mamba_img));
        snakes.add(new Item("Eastern Green Mamba", R.drawable.eastern_green_mamba));
        snakes.add(new Item("Jameson's mamba", R.drawable.jamesons_mamba));
        snakes.add(new Item("Caspian Cobra", R.drawable.caspian_cobra));
        snakes.add(new Item("Forest Cobra", R.drawable.forest_cobra));
        snakes.add(new Item("Philippine cobra", R.drawable.philippine_cobra));
        snakes.add(new Item("Cape Cobra", R.drawable.cape_cobra));
        snakes.add(new Item("Jararaca", R.drawable.bothrops_jararaca));
        snakes.add(new Item("South American Bushmaster", R.drawable.southamerican_bushmaster));
        snakes.add(new Item("Gaboon Viper", R.drawable.gaboon_viper));
        snakes.add(new Item("Chinese Cobra", R.drawable.chinese_cobra));
        snakes.add(new Item("Monocled Cobra", R.drawable.monocled_cobra));
        snakes.add(new Item("Egyptian Cobra", R.drawable.egyptian_cobra));
        snakes.add(new Item("Banded Water Cobra", R.drawable.banded_water_cobra_2));
        snakes.add(new Item("Congo Water Cobra", R.drawable.congo_water_cobra));
        snakes.add(new Item("Black Desert Cobra", R.drawable.black_desert_cobra));
        snakes.add(new Item("Katian spitting cobra (Mali Cobra)", R.drawable.katian_spitting_cobra));
        snakes.add(new Item("Mozambique Spitting Cobra", R.drawable.mozambique_spitting_cobra));
        snakes.add(new Item("Zebra Spitting Cobra", R.drawable.zebra_spitting_cobra));
        snakes.add(new Item("Black-Necked Spitting Cobra", R.drawable.black_necked_spitting_cobra));
        snakes.add(new Item("Red Spitting Cobra", R.drawable.red_spitting_cobra));
        snakes.add(new Item("Samar Cobra", R.drawable.samar_cobra));
        snakes.add(new Item("Indo Chinese Spitting Cobra", R.drawable.indo_chinese_spitting_cobra));
        snakes.add(new Item("Javan Spitting Cobra", R.drawable.javan_spitting_cobra));
        snakes.add(new Item("Equatorial spitting cobra", R.drawable.equatrorial_spitting_cobra));
        snakes.add(new Item("Ring-Necked Spitting Cobra", R.drawable.ring_necked_spitting_cobra));
        snakes.add(new Item("Puff Adder", R.drawable.puff_adder));
        snakes.add(new Item("Rhinoceros Viper", R.drawable.rhinoceros_viper));
        snakes.add(new Item("King Brown Snake", R.drawable.king_brown_snake));
        snakes.add(new Item("Red-bellied black snake", R.drawable.red_bellied_black_snake));
        snakes.add(new Item("Dugite", R.drawable.dugite));
        snakes.add(new Item("Western Brown Snake", R.drawable.western_brown_snake));
        snakes.add(new Item("Tiger Rattlesnake", R.drawable.tiger_rattlesnake));
        snakes.add(new Item("Venezuelan Rattlesnake", R.drawable.venezuelan_rattlesnake));
        snakes.add(new Item("Uracoan Rattlesnake", R.drawable.uracoan_rattlesnake));
        snakes.add(new Item("Aruba Rattlesnake", R.drawable.aruba_rattlesnake));
        snakes.add(new Item("Banded Rock Rattlesnake", R.drawable.banded_rock_rattlesnake));
        snakes.add(new Item("Rock Rattlesnake", R.drawable.rock_rattlesnake));
        snakes.add(new Item("Mojave Rattlesnake", R.drawable.mojave_rattlesnake));
        snakes.add(new Item("Malayan Pit Viper", R.drawable.malayan_pit_viper));
        snakes.add(new Item("Sharp-nosed Pit Viper", R.drawable.sharp_nosed_viper));
        snakes.add(new Item("Mexican Rattlesnake", R.drawable.mexican_rattlesnake));
        snakes.add(new Item("Rough-scaled Bush Viper", R.drawable.rough_scaled_bush_viper));
        snakes.add(new Item("Western Diamondback Rattlesnake", R.drawable.western_diamondback_rattlesnake));
        snakes.add(new Item("Eastern Diamondback Rattlesnake", R.drawable.eastern_diamondback_rattlesnake));
        snakes.add(new Item("Grand Canyon Rattlesnake", R.drawable.grand_canyon_rattlesnake));
        snakes.add(new Item("Western Rattlesnake", R.drawable.western_rattlesnake));
        snakes.add(new Item("Red Diamond Rattlesnake", R.drawable.red_diamond_rattlesnake));
        snakes.add(new Item("Boomslang", R.drawable.boomslang));
        snakes.add(new Item("Timber Rattlesnake", R.drawable.timber_rattlesnake));
        snakes.add(new Item("Prairie Rattlesnake", R.drawable.prairie_rattlesnake));
        snakes.add(new Item("Massasauga Rattlesnake", R.drawable.massasauga_rattlesnake));
        snakes.add(new Item("Mexican Cantil", R.drawable.mexican_cantil));
        snakes.add(new Item("Broad-banded Copperhead", R.drawable.broad_banded_copperhead));
        snakes.add(new Item("Northern Copperhead", R.drawable.northern_copperhead));
        snakes.add(new Item("Osage Copperhead", R.drawable.osage_copperhead));
        snakes.add(new Item("Trans-Pecos Copperhead", R.drawable.trans_pecos_copperhead));
        snakes.add(new Item("Florida Cottonmouth", R.drawable.florida_cottonmouth));
        snakes.add(new Item("Western Cottonmouth", R.drawable.western_cottonmouth));
        snakes.add(new Item("Eastern Cottonmouth", R.drawable.eastern_cottonmouth));
        snakes.add(new Item("Jumping Pit Viper", R.drawable.central_american_jumping_pitviper));
        snakes.add(new Item("Yellow-Blotched Palm-Pitviper", R.drawable.yellow_blotched_palm_pitviper));
        snakes.add(new Item("Guatemalan Palm-Pit Viper", R.drawable.guatemalan_palm_pit_viper));
        snakes.add(new Item("Guifarro's Palm-pitviper", R.drawable.bothriechis_guifarroi));
        snakes.add(new Item("Side-striped Palm-pit Viper", R.drawable.side_striped_palm_viper));
        snakes.add(new Item("Black-speckled Palm-pit Viper", R.drawable.black_speckled_palm_pit_viper));
        snakes.add(new Item("Mexican Palm-pit Viper", R.drawable.mexican_palm_pit_viper));
        snakes.add(new Item("Eyelash Viper", R.drawable.eyelash_viper));
        snakes.add(new Item("Merendon Palm-pit Viper", R.drawable.merendon_palm_pit_viper));
        snakes.add(new Item("Two-striped Forest-pit Viper", R.drawable.two_striped_forest_pit_viper));
        snakes.add(new Item("Speckled Forest Pit Viper", R.drawable.speckled_forest_pitviper));
        snakes.add(new Item("Urutu", R.drawable.urutu));
        snakes.add(new Item("Patagonian Lancehead", R.drawable.patagonian_lancehead));
        snakes.add(new Item("Terciopelo", R.drawable.terciopelo));
        snakes.add(new Item("Common Lancehead", R.drawable.common_lancehead));
        snakes.add(new Item("Brazil's Lancehead", R.drawable.brazil_lancehead));
        snakes.add(new Item("Golden Lancehead", R.drawable.golden_lancehead));
        snakes.add(new Item("Jararacussu", R.drawable.jararacussu));
        snakes.add(new Item("Sidewinder", R.drawable.sidewinder));

    }

    // Returns the number of images
    @Override
    public int getCount() {
        return snakes.size();
    }

    // Returns the ID of an image
    @Override
    public Item getItem(int position) {
        return snakes.get(position);
    }

    // To get ItemId
    @Override
    public long getItemId(int position) {
        return snakes.get(position).drawableId;
    }

    @Override
    public View getView(int i,  View convertView, ViewGroup viewGroup) {
        View v;
        ImageView picture;
        TextView name;
        
        if (convertView == null) {

            // To calculate image view density independent
            //Resources r = Resources.getSystem();
            //float fx = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 60, r.getDisplayMetrics());

            v = mInflater.inflate(R.layout.grid_item, viewGroup, false);
            //v.setLayoutParams(new LinearLayout.LayoutParams(85,85));// Redundant code since it makes the grid view small
            v.setPadding(12, 12, 12, 8);
            v.setBackgroundColor(Color.TRANSPARENT);
            v.setMinimumHeight(100);
            v.setMinimumWidth(50);
            //v.setId(Integer.parseInt("id"));
        } else {
            v = convertView;
        }

        v.setTag(R.id.picture, v.findViewById(R.id.picture));
        v.setTag(R.id.text, v.findViewById(R.id.text));
        picture = (ImageView) v.getTag(R.id.picture);
        name = (TextView) v.getTag(R.id.text);
        name.setTextColor(Color.parseColor("#D6CCB0")); // Default #D6CCB0

        Item item = getItem(i);

        picture.setImageResource(item.drawableId);
        name.setText(item.name);
        return v;
    }


    private class Item  {
        public final String name;
        public final int drawableId;

        Item(String name, int drawableId) {
            this.name = name;
            this.drawableId = drawableId;
        }
    }
}


////////////////////// To get Filter for search query ////////////////////////////
/*
@Override
public Filter getFilter() {
    if (filter == null) {
        filter = new CustomFilter();
    }
    return filter;
}

// Inner Class
class CustomFilter extends Filter {

    @Override
    protected FilterResults performFiltering(CharSequence query) {
        FilterResults results = new FilterResults();

        if (query != null && query.length() > 0) {
            // To Uppercase
            query = query.toString().toUpperCase();

            ArrayList<Item> snakes = new ArrayList<>();

            // To filter based on Search Query

            for (int i = 0; i < filterList.size(); i++) {
                if (filterList.get(i).name.toUpperCase().contains(query)) {
                    Item s = new Item(filterList.get(i).name, filterList.get(i).drawableId);
                    snakes.add(s);
                }
            }
            results.count = snakes.size();
            results.values = snakes;
        } else {
            results.count = filterList.size();
            results.values = snakes;
        }
        return results;
    }

    @Override
    protected void publishResults(CharSequence query, FilterResults results) {
        filterList = (ArrayList<Item>) results.values;
        notifyDataSetChanged();
    }
}*/
