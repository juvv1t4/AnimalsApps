package com.example.animalsapps.halaman

import com.example.animalsapps.R

data class DetailRas(
    var ras : String,
    var negara : String,
    var foto : Int,
)

fun getAllRas() : List<DetailRas> {
    return listOf<DetailRas>(
        DetailRas("Kucing Birman", "Myanmar/Prancis", R.drawable.kucingbirman),
        DetailRas("Kucing Abyssinian", "Etiopia", R.drawable.kucingabyssinian),
        DetailRas("Kucing Balinese", "Amerika", R.drawable.kucingbalinese),
        DetailRas("Kucing Japanese Bobtail", "Jepang", R.drawable.kucingjapanesebobtail),
        DetailRas("Kucing Ocicat", "Amerika", R.drawable.kucingocicat),
        DetailRas("Kucing Scottish Fold", "Skotlandia", R.drawable.kucingscottishfold),
        DetailRas("Kucing Siberian", "Rusia", R.drawable.kucingsiberian),
        DetailRas("Kucing Snowshoe", "Amerika", R.drawable.kucingsnowshoe),
        DetailRas("Kucing Singapura", "Singapura", R.drawable.kucingsingapura),
        DetailRas("Kucing Somali", "Somalia", R.drawable.kucingsomali),
        DetailRas("Kucing American Shorthair", "Eropa", R.drawable.kucingamericanshorthair),
        DetailRas("Kucing Burma", "Myanmar", R.drawable.kucingburma),
        DetailRas("Kucing Kampung", "Afrika", R.drawable.kucingkampung),
        DetailRas("Kucing Persia", "Iran", R.drawable.kucingpersia),
        DetailRas("Kucing Exotic Shorthair", "Amerika", R.drawable.kucingexoticshorthair),
        DetailRas("Kucing Maine Coon", "Amerika", R.drawable.kucingmainecoon),
        DetailRas("Kucing Bengal", "Amerika", R.drawable.kucingbengal),
        DetailRas("Kucing Sphynx", "Canada", R.drawable.kucingsphinx),
        DetailRas("Kucing Munchkin", "Amerika", R.drawable.kucingmunchkin),
        DetailRas("Kucing Devon Rex", "Inggris", R.drawable.kucingdevonrex),
        DetailRas("Kucing Ragdoll", "California", R.drawable.kucingragdoll),
        DetailRas("Kucing Siam", "Thailand", R.drawable.kucingsiam)
    )
}

fun getPopularRas() : List<DetailRas> {
    return listOf<DetailRas>(
        DetailRas("Kucing Kampung", "Afrika", R.drawable.kucingkampung),
        DetailRas("Kucing Persia", "Iran", R.drawable.kucingpersia),
        DetailRas("Kucing Exotic Shorthair", "Amerika", R.drawable.kucingexoticshorthair),
        DetailRas("Kucing Maine Coon", "Amerika", R.drawable.kucingmainecoon),
        DetailRas("Kucing Bengal", "Amerika", R.drawable.kucingbengal),
        DetailRas("Kucing Sphynx", "Canada", R.drawable.kucingsphinx),
        DetailRas("Kucing Munchkin", "Amerika", R.drawable.kucingmunchkin),
        DetailRas("Kucing Devon Rex", "Inggris", R.drawable.kucingdevonrex),
        DetailRas("Kucing Ragdoll", "California", R.drawable.kucingragdoll),
        DetailRas("Kucing Siam", "Thailand", R.drawable.kucingsiam)
        )
}
