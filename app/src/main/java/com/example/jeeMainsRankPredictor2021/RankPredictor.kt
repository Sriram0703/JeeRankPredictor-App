package com.example.jeeMainsRankPredictor2021

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class RankPredictor:AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.rank_pred)
        val BtnGetRank = findViewById(R.id.rank_button) as Button
        val RankArray = arrayOf(
            arrayOf(0, "1023000 - 1150000"),
            arrayOf(1, "1012770 - 1138500"),
            arrayOf(2, "1002540 - 1127000"),
            arrayOf(3, "992310 - 1115500"),
            arrayOf(4, "982080 - 1104000"),
            arrayOf(5, "971850 - 1092500"),
            arrayOf(6, "961620 - 1081000"),
            arrayOf(7, "951390 - 1069500"),
            arrayOf(8, "941160 - 1058000"),
            arrayOf(9, "930930 - 1046500"),
            arrayOf(10, "920700 - 1035000"),
            arrayOf(11, "910470 - 1023500"),
            arrayOf(12, "900240 - 1012000"),
            arrayOf(13, "890010 - 1000500"),
            arrayOf(14, "879780 - 989000"),
            arrayOf(15, "869550 - 977500"),
            arrayOf(16, "859320 - 966000"),
            arrayOf(17, "849090 - 954500"),
            arrayOf(18, "838860 - 943000"),
            arrayOf(19, "828630 - 931500"),
            arrayOf(20, "818400 - 920000"),
            arrayOf(21, "808170 - 908500"),
            arrayOf(22, "797940 - 897000"),
            arrayOf(23, "787710 - 885500"),
            arrayOf(24, "777480 - 874000"),
            arrayOf(25, "767250 - 862500"),
            arrayOf(26, "757020 - 851000"),
            arrayOf(27, "746790 - 839500"),
            arrayOf(28, "736560 - 828000"),
            arrayOf(29, "726330 - 816500"),
            arrayOf(30, "716100 - 805000"),
            arrayOf(31, "705870 - 793500"),
            arrayOf(32, "695640 - 782000"),
            arrayOf(33, "685410 - 770500"),
            arrayOf(34, "675180 - 759000"),
            arrayOf(35, "664950 - 747500"),
            arrayOf(36, "654720 - 736000"),
            arrayOf(37, "644490 - 724500"),
            arrayOf(38, "634260 - 713000"),
            arrayOf(39, "624030 - 701500"),
            arrayOf(40, "613800 - 690000"),
            arrayOf(41, "603570 - 678500"),
            arrayOf(42, "593340 - 667000"),
            arrayOf(43, "583110 - 655500"),
            arrayOf(44, "572880 - 644000"),
            arrayOf(45, "562650 - 632500"),
            arrayOf(46, "552420 - 621000"),
            arrayOf(47, "542190 - 609500"),
            arrayOf(48, "531960 - 598000"),
            arrayOf(49, "521730 - 586500"),
            arrayOf(50, "511500 - 575000"),
            arrayOf(51, "501270 - 563500"),
            arrayOf(52, "491040 - 552000"),
            arrayOf(53, "480810 - 540500"),
            arrayOf(54, "470580 - 529000"),
            arrayOf(55, "460350 - 517500"),
            arrayOf(56, "450120 - 506000"),
            arrayOf(57, "439890 - 494500"),
            arrayOf(58, "429660 - 483000"),
            arrayOf(59, "419430 - 471500"),
            arrayOf(60, "409200 - 460000"),
            arrayOf(61, "398970 - 448500"),
            arrayOf(62, "388740 - 437000"),
            arrayOf(63, "378510 - 425500"),
            arrayOf(64, "368280 - 414000"),
            arrayOf(65, "358050 - 402500"),
            arrayOf(66, "347820 - 391000"),
            arrayOf(67, "337590 - 379500"),
            arrayOf(68, "327360 - 368000"),
            arrayOf(69, "317130 - 356500"),
            arrayOf(70, "306900 - 345000"),
            arrayOf(71, "296670 - 333500"),
            arrayOf(72, "286440 - 322000"),
            arrayOf(73, "276210 - 310500"),
            arrayOf(74, "265980 - 299000"),
            arrayOf(75, "255750 - 287500"),
            arrayOf(76, "245520 - 276000"),
            arrayOf(77, "235290 - 264500"),
            arrayOf(78, "225060 - 253000"),
            arrayOf(79, "214830 - 241500"),
            arrayOf(80, "204600 - 230000"),
            arrayOf(81, "194370 - 218500"),
            arrayOf(82, "184140 - 207000"),
            arrayOf(83, "173910 - 195500"),
            arrayOf(84, "163680 - 184000"),
            arrayOf(85, "153450 - 172500"),
            arrayOf(86, "143220 - 161000"),
            arrayOf(87, "132990 - 149500"),
            arrayOf(88, "122760 - 138000"),
            arrayOf(89, "112530 - 126500"),
            arrayOf(90, "102300 - 115000"),
            arrayOf(91, "92070 - 103500"),
            arrayOf(92, "81840 - 92000"),
            arrayOf(93, "71610 - 80500"),
            arrayOf(94, "61380 - 69000"),
            arrayOf(95, "51150 - 57500"),
            arrayOf(96, "40920 - 46000"),
            arrayOf(97, "30690 - 34500"),
            arrayOf(98, "20460 - 23000"),
            arrayOf(99, "10230 - 11500"),
            arrayOf(100, "1"),
        )

        BtnGetRank.setOnClickListener{
            val perView = findViewById<EditText>(R.id.percentile_input)
            val display = findViewById<TextView>(R.id.rank_display)
            val percentile: String = perView.text.toString()
            val percentileValue: Int = percentile.toInt()
            for (i in RankArray){
                if(percentileValue==i[0]){
                    val res:String = i[1] as String
                    display.setText("\t \t \t \t \t \t \t \t \t \t \t \t \t \t \t  YOUR RANK IS \n \n \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t $res").toString()
                    break
                }
                else if(percentileValue>100){
                    Toast.makeText(this,"ENTERED PERCENTILE SHOULD BE LESS THAN 100", Toast.LENGTH_LONG).show()
                    break
                }
            }
        }
    }
}