package kz.homebank.base.presentation.text

/*
* КАСЫМ-ЖОМАРТ will be converted to -> Касым-Жомарт
* delimiter = "-"
* */
fun String.nameCapitalize(
    delimiter: String = "-",
): String {
    val names = this.split(delimiter).toMutableList()
    for (i in names.withIndex()) {
        names[i.index] = names[i.index].lowercase().replaceFirstChar { it.uppercase() }
    }
    return names.joinToString(delimiter)
}


/*
* ТОКАЕВ КАСЫМ-ЖОМАРТ КЕМЕЛЕВИЧ will be converted to -> Токаев Касым-Жомарт Кемелевич
* delimiter = "-"
* */
fun String.fullNameCapitalize(): String {
    val names = this.lowercase().split(" ")
    val capitalizedName = buildList<String> {
        names.forEach { name ->
            add(name.nameCapitalize())
        }
    }
    return capitalizedName.joinToString(" ")
}