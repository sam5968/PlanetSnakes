package com.example.android.venmoussnakes;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.android.venmoussnakes.snakeInformations.ArubaRattlesnakeInfo;
import com.example.android.venmoussnakes.snakeInformations.BandedRockRattlesnake;
import com.example.android.venmoussnakes.snakeInformations.BandedWaterCobraInfo;
import com.example.android.venmoussnakes.snakeInformations.BlackBandedSeaKrait;
import com.example.android.venmoussnakes.snakeInformations.BlackDesertCobra;
import com.example.android.venmoussnakes.snakeInformations.BlackNeckedSpittingCobra;
import com.example.android.venmoussnakes.snakeInformations.BlackSpeckledPalmPitViper;
import com.example.android.venmoussnakes.snakeInformations.BoomslangInfo;
import com.example.android.venmoussnakes.snakeInformations.BrazilLancehead;
import com.example.android.venmoussnakes.snakeInformations.BroadBandedCopperheadInfo;
import com.example.android.venmoussnakes.snakeInformations.CapeCobraInfo;
import com.example.android.venmoussnakes.snakeInformations.CaspianCobraInfo;
import com.example.android.venmoussnakes.snakeInformations.CentralAmericanJumpingPitViper;
import com.example.android.venmoussnakes.snakeInformations.ChineseCobraInfo;
import com.example.android.venmoussnakes.snakeInformations.CoastalTaipanInfo;
import com.example.android.venmoussnakes.snakeInformations.CommonDeathAdderInfo;
import com.example.android.venmoussnakes.snakeInformations.CommonKraitInfo;
import com.example.android.venmoussnakes.snakeInformations.CommonLanceheadInfo;
import com.example.android.venmoussnakes.snakeInformations.CongoWaterCobraInfo;
import com.example.android.venmoussnakes.snakeInformations.DugiteInfo;
import com.example.android.venmoussnakes.snakeInformations.EasternBrownSnakeInfo;
import com.example.android.venmoussnakes.snakeInformations.EasternCottonmouthInfo;
import com.example.android.venmoussnakes.snakeInformations.EasternDiamondbackRattlesnakeInfo;
import com.example.android.venmoussnakes.snakeInformations.EasternGreenMambaInfo;
import com.example.android.venmoussnakes.snakeInformations.EgyptianCobraInfo;
import com.example.android.venmoussnakes.snakeInformations.EquatorialSpittingCobraInfo;
import com.example.android.venmoussnakes.snakeInformations.EyelashViperInfo;
import com.example.android.venmoussnakes.snakeInformations.FloridaCottonmouthInfo;
import com.example.android.venmoussnakes.snakeInformations.ForestCobraInfo;
import com.example.android.venmoussnakes.snakeInformations.GaboonViperInfo;
import com.example.android.venmoussnakes.snakeInformations.GoldenLanceheadInfo;
import com.example.android.venmoussnakes.snakeInformations.GrandCanyonRattlesnakeInfo;
import com.example.android.venmoussnakes.snakeInformations.GuatemalanPalmPitViper;
import com.example.android.venmoussnakes.snakeInformations.GuifarrosPalmViper;
import com.example.android.venmoussnakes.snakeInformations.IndianCobraInfo;
import com.example.android.venmoussnakes.snakeInformations.IndoChineseSpittingCobraInfo;
import com.example.android.venmoussnakes.snakeInformations.InlandTaipanInfo;
import com.example.android.venmoussnakes.snakeInformations.JamesonsMambaInfo;
import com.example.android.venmoussnakes.snakeInformations.JararacaInfo;
import com.example.android.venmoussnakes.snakeInformations.JararacussuInfo;
import com.example.android.venmoussnakes.snakeInformations.JavanSpittingCobraInfo;
import com.example.android.venmoussnakes.snakeInformations.KatianSpittingCobraInfo;
import com.example.android.venmoussnakes.snakeInformations.KingBrownSnakeInfo;
import com.example.android.venmoussnakes.snakeInformations.KingCobraInfo;
import com.example.android.venmoussnakes.snakeInformations.MalayanKraitInfo;
import com.example.android.venmoussnakes.snakeInformations.MalayanPitViperInfo;
import com.example.android.venmoussnakes.snakeInformations.ManyBrandedKraitInfo;
import com.example.android.venmoussnakes.snakeInformations.MassasaugaRattlesnakeInfo;
import com.example.android.venmoussnakes.snakeInformations.MerendonPalmPitViperInfo;
import com.example.android.venmoussnakes.snakeInformations.MexicanCantilInfo;
import com.example.android.venmoussnakes.snakeInformations.MexicanPalmPitViperInfo;
import com.example.android.venmoussnakes.snakeInformations.MexicanRattlesnakeInfo;
import com.example.android.venmoussnakes.snakeInformations.MojaveRattlesnakeInfo;
import com.example.android.venmoussnakes.snakeInformations.MonocledCobraInfo;
import com.example.android.venmoussnakes.snakeInformations.MozambiqueSpittingCobraInfo;
import com.example.android.venmoussnakes.snakeInformations.NorthernCopperheadInfo;
import com.example.android.venmoussnakes.snakeInformations.OsageCopperheadInfo;
import com.example.android.venmoussnakes.snakeInformations.PatagonianLanceheadInfo;
import com.example.android.venmoussnakes.snakeInformations.PhilippineCobraInfo;
import com.example.android.venmoussnakes.snakeInformations.PrairieRattlesnakeInfo;
import com.example.android.venmoussnakes.snakeInformations.PuffAdderInfo;
import com.example.android.venmoussnakes.snakeInformations.RedBelliedBlackSnakeInfo;
import com.example.android.venmoussnakes.snakeInformations.RedDiamondRattlesnakeInfo;
import com.example.android.venmoussnakes.snakeInformations.RedHeadedKraitInfo;
import com.example.android.venmoussnakes.snakeInformations.RedSpittingCobraInfo;
import com.example.android.venmoussnakes.snakeInformations.RhinocerosViperInfo;
import com.example.android.venmoussnakes.snakeInformations.RingNeckedSpittingCobraInfo;
import com.example.android.venmoussnakes.snakeInformations.RockRattlesnakeInfo;
import com.example.android.venmoussnakes.snakeInformations.RoughScaledBushViperInfo;
import com.example.android.venmoussnakes.snakeInformations.RussellsViperInfo;
import com.example.android.venmoussnakes.snakeInformations.SamarCobraInfo;
import com.example.android.venmoussnakes.snakeInformations.SawScaledViper;
import com.example.android.venmoussnakes.snakeInformations.SharpNosedPitViper;
import com.example.android.venmoussnakes.snakeInformations.SideStripedPalmPitViper;
import com.example.android.venmoussnakes.snakeInformations.SidewinderInfo;
import com.example.android.venmoussnakes.snakeInformations.SouthAmericanBushMasterInfo;
import com.example.android.venmoussnakes.snakeInformations.SpeckledForestPitViper;
import com.example.android.venmoussnakes.snakeInformations.TerciopeloInfo;
import com.example.android.venmoussnakes.snakeInformations.TigerRattlesnakeInfo;
import com.example.android.venmoussnakes.snakeInformations.TigerSnakeInfo;
import com.example.android.venmoussnakes.snakeInformations.TimberRattlesnakeInfo;
import com.example.android.venmoussnakes.snakeInformations.TransPecosCopperhead;
import com.example.android.venmoussnakes.snakeInformations.TwoStripedForestPitViperInfo;
import com.example.android.venmoussnakes.snakeInformations.UracoanRattlesnakInfo;
import com.example.android.venmoussnakes.snakeInformations.UrutuInfo;
import com.example.android.venmoussnakes.snakeInformations.VenezuelanRattlesnakeInfo;
import com.example.android.venmoussnakes.snakeInformations.WesternBrownSnakeInfo;
import com.example.android.venmoussnakes.snakeInformations.WesternCottonmouthInfo;
import com.example.android.venmoussnakes.snakeInformations.WesternDiamondbackRattlesnakeInfo;
import com.example.android.venmoussnakes.snakeInformations.WesternGreenMambaInfo;
import com.example.android.venmoussnakes.snakeInformations.WesternRattlesnakeInfo;
import com.example.android.venmoussnakes.snakeInformations.YellowBelliedSeaSnakeInfo;
import com.example.android.venmoussnakes.snakeInformations.YellowBlotchedPalmPitViper;
import com.example.android.venmoussnakes.snakeInformations.ZebraSpittingCobraInfo;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set and find the grid view
        GridView gridView = (GridView) findViewById(R.id.grid_view);
        gridView.setAdapter(new MyAdapter(this));
        int index = gridView.getFirstVisiblePosition();
        gridView.smoothScrollToPosition(index);

        // Create onItemClickListener to open new activities for each snakes/images
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long item) {

                //Log.d("onItemClick", "position [" + position + "]");

                Intent intent = null;

                // Using Switch case, go from one activity to another through intent
                switch (position) {

                    // For Inland Taipan

                    case 0:
                        intent = new Intent(getApplicationContext(), InlandTaipanInfo.class);
                        intent.putExtra("id", position);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                        break;

                    // For Eastern Brown Snake

                    case 1:
                        intent = new Intent(getApplicationContext(), EasternBrownSnakeInfo.class);
                        intent.putExtra("id", position);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                        break;

                    // For Yellow Bellied Sea Snake

                    case 2:
                        intent = new Intent(getApplicationContext(), YellowBelliedSeaSnakeInfo.class);
                        intent.putExtra("id", position);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                        break;

                    // For Many-Branded Krait (also knows as Taiwanese Krait or Chinese Krait)

                    case 3:
                        intent = new Intent(getApplicationContext(), ManyBrandedKraitInfo.class);
                        intent.putExtra("id", position);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                        break;

                    // For Black Mamba

                    case 4:
                        intent = new Intent(getApplicationContext(), Info.class);
                        intent.putExtra("id", position);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                        break;

                    // For Common Krait

                    case 5:
                        intent = new Intent(getApplicationContext(), CommonKraitInfo.class);
                        intent.putExtra("id", position);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                        break;

                    // For Coastal Taipan

                    case 6:
                        intent = new Intent(getApplicationContext(), CoastalTaipanInfo.class);
                        intent.putExtra("id", position);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                        break;

                    // For Indian Cobra

                    case 7:
                        intent = new Intent(getApplicationContext(), IndianCobraInfo.class);
                        intent.putExtra("id", position);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                        break;

                    // For King Cobra

                    case 8:
                        intent = new Intent(getApplicationContext(), KingCobraInfo.class);
                        intent.putExtra("id", position);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                        break;

                    // For Russells's Viper

                    case 9:
                        intent = new Intent(getApplicationContext(), RussellsViperInfo.class);
                        intent.putExtra("id", position);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                        break;

                    // For Saw Scaled Viper

                    case 10:
                        intent = new Intent(getApplicationContext(), SawScaledViper.class);
                        intent.putExtra("id", position);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                        break;

                    // For Black - Banded Sea Krait

                    case 11:
                        intent = new Intent(getApplicationContext(), BlackBandedSeaKrait.class);
                        intent.putExtra("id", position);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                        break;

                    // For Tiger Snake

                    case 12:
                        intent = new Intent(getApplicationContext(), TigerSnakeInfo.class);
                        intent.putExtra("id", position);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                        break;

                    // For Common Death Adder

                    case 13:
                        intent = new Intent(getApplicationContext(), CommonDeathAdderInfo.class);
                        intent.putExtra("id", position);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                        break;


                    // For Red Headed Krait

                    case 14:
                        intent = new Intent(getApplicationContext(), RedHeadedKraitInfo.class);
                        intent.putExtra("id", position);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                        break;

                    // For Malayan Krait

                    case 15:
                        intent = new Intent(getApplicationContext(), MalayanKraitInfo.class);
                        intent.putExtra("id", position);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                        break;

                    // For Western Green Mamba

                    case 16:
                        intent = new Intent(getApplicationContext(), WesternGreenMambaInfo.class);
                        intent.putExtra("id", position);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                        break;

                    // For Eastern Green Mamba

                    case 17:
                        intent = new Intent(getApplicationContext(), EasternGreenMambaInfo.class);
                        intent.putExtra("id", position);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                        break;

                    // For Jameson's Mamba

                    case 18:
                        intent = new Intent(getApplicationContext(), JamesonsMambaInfo.class);
                        intent.putExtra("id", position);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                        break;

                    // For Caspian Cobra

                    case 19:
                        intent = new Intent(getApplicationContext(), CaspianCobraInfo.class);
                        intent.putExtra("id", position);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                        break;

                    // For Forest Cobra

                    case 20:
                        intent = new Intent(getApplicationContext(), ForestCobraInfo.class);
                        intent.putExtra("id", position);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                        break;

                    // For Philippine Cobra

                    case 21:
                        intent = new Intent(getApplicationContext(), PhilippineCobraInfo.class);
                        intent.putExtra("id", position);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                        break;

                    // For Cape Cobra

                    case 22:
                        intent = new Intent(getApplicationContext(), CapeCobraInfo.class);
                        intent.putExtra("id", position);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                        break;

                    // For jararaca

                    case 23:
                        intent = new Intent(getApplicationContext(), JararacaInfo.class);
                        intent.putExtra("id", position);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                        break;

                    // For South American Bush Master

                    case 24:
                        intent = new Intent(getApplicationContext(), SouthAmericanBushMasterInfo.class);
                        intent.putExtra("id", position);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                        break;

                    // For Gaboon Viper

                    case 25:
                        intent = new Intent(getApplicationContext(), GaboonViperInfo.class);
                        intent.putExtra("id", position);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                        break;

                    // For Chinese Cobra

                    case 26:
                        intent = new Intent(getApplicationContext(), ChineseCobraInfo.class);
                        intent.putExtra("id", position);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                        break;

                    // For Monocled Cobra

                    case 27:
                        intent = new Intent(getApplicationContext(), MonocledCobraInfo.class);
                        intent.putExtra("id", position);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                        break;

                    // For Egyptian Cobra

                    case 28:
                        intent = new Intent(getApplicationContext(), EgyptianCobraInfo.class);
                        intent.putExtra("id", position);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                        break;

                    // For Banded Water Cobra

                    case 29:
                        intent = new Intent(getApplicationContext(), BandedWaterCobraInfo.class);
                        intent.putExtra("id", position);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                        break;

                    // For Congo Water Cobra

                    case 30:
                        intent = new Intent(getApplicationContext(), CongoWaterCobraInfo.class);
                        intent.putExtra("id", position);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                        break;

                    // For Black Desert Cobra

                    case 31:
                        intent = new Intent(getApplicationContext(), BlackDesertCobra.class);
                        intent.putExtra("id", position);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                        break;

                    // For Mali Cobra (Katian Spitting Cobra)

                    case 32:
                        intent = new Intent(getApplicationContext(), KatianSpittingCobraInfo.class);
                        intent.putExtra("id", position);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                        break;

                    // For Mozambique Spitting Cobra

                    case 33:
                        intent = new Intent(getApplicationContext(), MozambiqueSpittingCobraInfo.class);
                        intent.putExtra("id", position);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                        break;

                    // For Zebra Spitting Cobra

                    case 34:
                        intent = new Intent(getApplication(), ZebraSpittingCobraInfo.class);
                        intent.putExtra("id", position);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                        break;

                    // For Black-Necked Spitting Cobra

                    case 35:
                        intent = new Intent(getApplicationContext(), BlackNeckedSpittingCobra.class);
                        intent.putExtra("id", position);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                        break;

                    // For Red Spitting Cobra

                    case 36:
                        intent = new Intent(getApplicationContext(), RedSpittingCobraInfo.class);
                        intent.putExtra("id", position);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                        break;

                    // For Samar Cobra

                    case 37:
                        intent = new Intent(getApplicationContext(), SamarCobraInfo.class);
                        intent.putExtra("id", position);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                        break;

                    // For Indo Chinese Cobra

                    case 38:
                        intent = new Intent(getApplicationContext(), IndoChineseSpittingCobraInfo.class);
                        intent.putExtra("id", position);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                        break;

                    // For Javan Spitting Cobra

                    case 39:
                        intent = new Intent(getApplicationContext(), JavanSpittingCobraInfo.class);
                        intent.putExtra("id", position);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                        break;

                    // For Equatorial Spitting Cobra

                    case 40:
                        intent = new Intent(getApplicationContext(), EquatorialSpittingCobraInfo.class);
                        intent.putExtra("id", position);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                        break;

                    // For Ring-Necked Spitting Cobra

                    case 41:
                        intent = new Intent(getApplicationContext(), RingNeckedSpittingCobraInfo.class);
                        intent.putExtra("id", position);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                        break;

                    // For Puff Adder (African Puff Adder)

                    case 42:
                        intent = new Intent(getApplicationContext(), PuffAdderInfo.class);
                        intent.putExtra("id", position);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                        break;

                    // For Rhinoceros viper

                    case 43:
                        intent = new Intent(getApplicationContext(), RhinocerosViperInfo.class);
                        intent.putExtra("id", position);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                        break;

                    // For King Brown Snake

                    case 44:
                        intent = new Intent(getApplicationContext(), KingBrownSnakeInfo.class);
                        intent.putExtra("id", position);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                        break;

                    // For Red-bellied black snake

                    case 45:
                        intent = new Intent(getApplicationContext(), RedBelliedBlackSnakeInfo.class);
                        intent.putExtra("id", position);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                        break;

                    // For Dugite

                    case 46:
                        intent = new Intent(getApplicationContext(), DugiteInfo.class);
                        intent.putExtra("id", position);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                        break;

                    // For Western Brown Snake

                    case 47:
                        intent = new Intent(getApplicationContext(), WesternBrownSnakeInfo.class);
                        intent.putExtra("id", position);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                        break;

                    // For Tiger Rattlesnake

                    case 48:
                        intent = new Intent(getApplicationContext(), TigerRattlesnakeInfo.class);
                        intent.putExtra("id", position);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                        break;

                    // For Venezuelan Rattlesnake

                    case 49:
                        intent = new Intent(getApplicationContext(), VenezuelanRattlesnakeInfo.class);
                        intent.putExtra("id", position);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                        break;

                    // For Uracoan Rattlesnake

                    case 50:
                        intent = new Intent(getApplicationContext(), UracoanRattlesnakInfo.class);
                        intent.putExtra("id", position);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                        break;

                    // For Aruba Rattlesnake

                    case 51:
                        intent = new Intent(getApplicationContext(), ArubaRattlesnakeInfo.class);
                        intent.putExtra("id", position);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                        break;

                    // For Banded Rock Rattlesnake

                    case 52:
                        intent = new Intent(getApplicationContext(), BandedRockRattlesnake.class);
                        intent.putExtra("id", position);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                        break;

                    // For Rock Rattlesnake

                    case 53:
                        intent = new Intent(getApplicationContext(), RockRattlesnakeInfo.class);
                        intent.putExtra("id", position);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                        break;

                    // For Mojave Rattlesnake

                    case 54:
                        intent = new Intent(getApplicationContext(), MojaveRattlesnakeInfo.class);
                        intent.putExtra("id", position);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                        break;

                    // For Malayan Pit Viper

                    case 55:
                        intent = new Intent(getApplicationContext(), MalayanPitViperInfo.class);
                        intent.putExtra("id", position);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                        break;

                    // For Sharp-Nosed Pit Viper

                    case 56:
                        intent = new Intent(getApplicationContext(), SharpNosedPitViper.class);
                        intent.putExtra("id", position);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                        break;

                    // For Mexican Rattlesnake

                    case 57:
                        intent = new Intent(getApplicationContext(), MexicanRattlesnakeInfo.class);
                        intent.putExtra("id", position);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                        break;

                    // For Rough-scaled Bush Viper

                    case 58:
                        intent = new Intent(getApplicationContext(), RoughScaledBushViperInfo.class);
                        intent.putExtra("id", position);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                        break;

                    // For Western Diamondback Rattlesnake

                    case 59:
                        intent = new Intent(getApplicationContext(), WesternDiamondbackRattlesnakeInfo.class);
                        intent.putExtra("id", position);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                        break;

                    // For Eastern Diamondback Rattlesnake

                    case 60:
                        intent = new Intent(getApplicationContext(), EasternDiamondbackRattlesnakeInfo.class);
                        intent.putExtra("id", position);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                        break;

                    // For Grand Canyon Rattlesnake

                    case 61:
                        intent = new Intent(getApplicationContext(), GrandCanyonRattlesnakeInfo.class);
                        intent.putExtra("id", position);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                        break;

                    // For Western Rattlesnake

                    case 62:
                        intent = new Intent(getApplicationContext(), WesternRattlesnakeInfo.class);
                        intent.putExtra("id", position);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                        break;

                    // For Red Diamond Rattlesnake

                    case 63:
                        intent = new Intent(getApplicationContext(), RedDiamondRattlesnakeInfo.class);
                        intent.putExtra("id", position);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                        break;

                    // For Boomslang

                    case 64:
                        intent = new Intent(getApplicationContext(), BoomslangInfo.class);
                        intent.putExtra("id", position);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                        break;

                    // For Timber Rattlesnake

                    case 65:
                        intent = new Intent(getApplicationContext(), TimberRattlesnakeInfo.class);
                        intent.putExtra("id", position);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                        break;

                    // For Prairie Rattlesnake

                    case 66:
                        intent = new Intent(getApplicationContext(), PrairieRattlesnakeInfo.class);
                        intent.putExtra("id", position);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                        break;

                    // For Massasauga Rattlesnake

                    case 67:
                        intent = new Intent(getApplicationContext(), MassasaugaRattlesnakeInfo.class);
                        intent.putExtra("id", position);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                        break;

                    // For Mexican Cantil

                    case 68:
                        intent = new Intent(getApplicationContext(), MexicanCantilInfo.class);
                        intent.putExtra("id", position);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                        break;

                    // For Broad-banded Copperhead

                    case 69:
                        intent = new Intent(getApplicationContext(), BroadBandedCopperheadInfo.class);
                        intent.putExtra("id", position);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                        break;

                    // For Northern Copperhead

                    case 70:
                        intent = new Intent(getApplicationContext(), NorthernCopperheadInfo.class);
                        intent.putExtra("id", position);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                        break;

                    // For Osage Copperhead

                    case 71:
                        intent = new Intent(getApplicationContext(), OsageCopperheadInfo.class);
                        intent.putExtra("id", position);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                        break;

                    // For Trans-Pecos Copperhead

                    case 72:
                        intent = new Intent(getApplicationContext(), TransPecosCopperhead.class);
                        intent.putExtra("id", position);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                        break;

                    // For Florida Cottonmouth

                    case 73:
                        intent = new Intent(getApplicationContext(), FloridaCottonmouthInfo.class);
                        intent.putExtra("id", position);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                        break;

                    // For Western Cottonmouth

                    case 74:
                        intent = new Intent(getApplicationContext(), WesternCottonmouthInfo.class);
                        intent.putExtra("id", position);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                        break;

                    // For Eastern Cottonmouth

                    case 75:
                        intent = new Intent(getApplicationContext(), EasternCottonmouthInfo.class);
                        intent.putExtra("id", position);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                        break;

                    // For Central American Jumping Pit Viper

                    case 76:
                        intent = new Intent(getApplicationContext(), CentralAmericanJumpingPitViper.class);
                        intent.putExtra("id", position);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                        break;

                    // For Yellow-Blotched Palm-Pitviper

                    case 77:
                        intent = new Intent(getApplicationContext(), YellowBlotchedPalmPitViper.class);
                        intent.putExtra("id", position);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                        break;

                    // For Guatemalan Palm Pit Viper

                    case 78:
                        intent = new Intent(getApplicationContext(), GuatemalanPalmPitViper.class);
                        intent.putExtra("id", position);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                        break;

                    // For Guifarro's Palm-pitviper

                    case 79:
                        intent = new Intent(getApplicationContext(), GuifarrosPalmViper.class);
                        intent.putExtra("id", position);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                        break;

                    // For Side-striped Palm-pit Viper

                    case 80:
                        intent = new Intent(getApplicationContext(), SideStripedPalmPitViper.class);
                        intent.putExtra("id", position);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                        break;

                    // For Black-speckled Palm-pit Viper

                    case 81:
                        intent = new Intent(getApplicationContext(), BlackSpeckledPalmPitViper.class);
                        intent.putExtra("id", position);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                        break;

                    // For Mexican Palm-pit Viper

                    case 82:
                        intent = new Intent(getApplicationContext(), MexicanPalmPitViperInfo.class);
                        intent.putExtra("id", position);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                        break;

                    // For Eyelash Viper

                    case 83:
                        intent = new Intent(getApplicationContext(), EyelashViperInfo.class);
                        intent.putExtra("id", position);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                        break;

                    // For Merendon Palm Pit Viper

                    case 84:
                        intent = new Intent(getApplicationContext(), MerendonPalmPitViperInfo.class);
                        intent.putExtra("id", position);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                        break;

                    // For Two-striped Forest-pit Viper

                    case 85:
                        intent = new Intent(getApplicationContext(), TwoStripedForestPitViperInfo.class);
                        intent.putExtra("id", position);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                        break;

                    // For Speckled Forest Pit Viper

                    case 86:
                        intent = new Intent(getApplicationContext(), SpeckledForestPitViper.class);
                        intent.putExtra("id", position);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                        break;

                    // For Urutu

                    case 87:
                        intent = new Intent(getApplicationContext(), UrutuInfo.class);
                        intent.putExtra("id", position);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                        break;

                    // For Patagonian Lancehead

                    case 88:
                        intent = new Intent(getApplicationContext(), PatagonianLanceheadInfo.class);
                        intent.putExtra("id", position);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                        break;

                    // For Terciopelo

                    case 89:
                        intent = new Intent(getApplicationContext(), TerciopeloInfo.class);
                        intent.putExtra("id", position);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                        break;

                    // For Common Lancehead

                    case 90:
                        intent = new Intent(getApplicationContext(), CommonLanceheadInfo.class);
                        intent.putExtra("id", position);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                        break;

                    // For Brazil's Lancehead

                    case 91:
                        intent = new Intent(getApplicationContext(), BrazilLancehead.class);
                        intent.putExtra("id", position);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                        break;

                    // For Golden Lancehead

                    case 92:
                        intent = new Intent(getApplicationContext(), GoldenLanceheadInfo.class);
                        intent.putExtra("id", position);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                        break;

                    // For Jararacussu

                    case 93:
                        intent = new Intent(getApplicationContext(), JararacussuInfo.class);
                        intent.putExtra("id", position);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                        break;

                    // For Sidewinder

                    case 94:
                        intent = new Intent(getApplicationContext(), SidewinderInfo.class);
                        intent.putExtra("id", position);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                        break;

                    default:
                        break;

                }

                //Toast.makeText(MainActivity.this, "" + position, Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.action_bar_main, menu);

        /*// Associate searchable configuration with the SearchView
        SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        SearchView searchView = (SearchView) findViewById(R.id.search);
        searchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));

        searchView.setSubmitButtonEnabled(true);*/

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {

            // For First Aid for Snake Bite

            case R.id.first_aid :
                Intent search = new Intent(this, FirstAidForSnakebite.class);
                this.startActivity(search);
                break;

            // About the App

            case R.id.about :
                Intent about = new Intent(this, About.class);
                this.startActivity(about);
                break;

            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

    }

}

