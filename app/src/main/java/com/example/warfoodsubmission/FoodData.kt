package com.example.warfoodsubmission

object FoodData {
    private val foodName = arrayOf("Ayam Bakar",
            "Ayam Penyet",
            "Bakso",
            "Bubur Ayam",
            "Ayam Goreng",
            "Magelangan",
            "Mie Ayam",
            "Nasi Padang",
            "Pecel",
            "Soto Ayam",
    )
    private val foodDetail = arrayOf("Jaya Abadi",
            "Mbak Dian",
            "Bakso Kidul Pasar",
            "Bubur Bang Jo",
            "OTI Fried Chicken",
            "Burjo SS",
            "Mi Ayam Bang Mail",
            "Putra Bungsu",
            "Pecel Mak E",
            "Soto Ayam Mak Ikem"
    )
    private val foodPrice = arrayOf("RP 15.000",
            "RP 22.000",
            "RP 17.000",
            "RP 12.000",
            "RP 16.000",
            "RP 11.000",
            "RP 9.000",
            "RP 12.000",
            "RP 10.000",
            "RP 10.500"
    )
    private val foodPic = arrayOf(R.drawable.food_ayam_bakar,
            R.drawable.food_ayam_penyet,
            R.drawable.food_bakso,
            R.drawable.food_bubur_ayam,
            R.drawable.food_fried_chicken,
            R.drawable.food_magelangan_burjo,
            R.drawable.food_mie_ayam,
            R.drawable.food_nasi_padang,
            R.drawable.food_pecel,
            R.drawable.food_sotoa_ayam
    )
    val listData: ArrayList<Food>
        get() {
            val list = arrayListOf<Food>()
            for(position in foodName.indices){
                val food = Food()
                food.name = foodName[position]
                food.detail = foodDetail[position]
                food.price = foodPrice[position]
                food.pic = foodPic[position]
                list.add(food)
            }
            return list
        }
}