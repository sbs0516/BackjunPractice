package calcTest

class Text {
    val areaMapBaseHa = mapOf(Pair("ac",2.4710538147),Pair("a",100),Pair("ha",1),Pair("cm2",100000000),
            Pair("ft2",107639.1041671),Pair("in2",15500031.000062),Pair("m2",10000),Pair("평",3025.0001134375))
    val lengthMapBaseNM = mapOf(Pair("mm",1852000),Pair("cm",185200),Pair("m",1852),Pair("km",1.852),Pair("in",72913.385826772),
            Pair("ft",6076.1154855643),Pair("yd",2025.3718285214),Pair("mi",1.150779448),Pair("NM",1),
            Pair("mil",72913385.826772),Pair("자",6111.6061116061),Pair("리",4.7157407375))
    val tempMapBaseC = mapOf(Pair("℃",1),Pair("℉",33.8),Pair("K",274.15))

    // 영국 갤런, 미국 갤런 구분 필요
    val volumeMapBaseCm3 = mapOf(Pair("gal",219.9692482991),Pair("gal",264.1720523581),Pair("l",1000),Pair("ml",1000000),Pair("cm3",1000000),
            Pair("m3",1),Pair("in3",61023.744094732),Pair("ft3",35.3146667215),Pair("말",55.4354454238),Pair("되",554.3237250554))

    // 일반 톤, 영국 톤, 미국 톤 구분 필요
    val weightMapBaseT = mapOf(Pair("t",1.0160469088),Pair("t",1),Pair("t",1.12),Pair("lb",2240),Pair("oz",35840),
            Pair("kg",1016.0469088),Pair("g",1016046.9088),Pair("근",1693.4115146667),Pair("돈",270945.84234667))
    val dataMapBaseTB = mapOf(Pair<String,Long>("bit",8796093022208),Pair("B",1099511627776),Pair("KB",1073741824),Pair("MB",1048576),Pair("GB",1024),Pair("TB",1))
    val speedMapBaseMi = mapOf(Pair("m/s",1609.344),Pair("m/h",5793638.4),Pair("km/s",1.609344),Pair("km/h",5793.6384),Pair("in/s",63360),
            Pair("in/h",228096000),Pair("ft/s",5280),Pair("ft/h",19008000),Pair("mi/s",1),Pair("mi/h",3600),Pair("kn",3128.3144708423))
    val timeBaseWeek = mapOf(Pair("ms",604800000),Pair("s",604800),Pair("min",10080),Pair("h",168),Pair("d",7),Pair("wk",1))



}

fun main() {
    val a = "Hello"
    val b = "World"
    println("$a $b")

}