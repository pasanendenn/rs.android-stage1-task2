package subtask5

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import kotlin.reflect.KClass
import kotlin.reflect.full.isSubclassOf

class Blocks {

    // TODO: Complete the following function
    fun getData(blockA: Array<Any>, blockB: KClass<*>): Any {

        var s = ""
        var s1 = 0
        var finDate = LocalDate.parse("1924-06-16")
        val list = arrayListOf<LocalDate>(finDate)

        for (i in blockA){
            when (i) {
                is String -> {
                    s += i
                }
                is Int -> {
                    s1 += i
                }
                else -> {
                    if (i is LocalDate){
                        list.add(i)
                    }
                    var d = 0
                    for (i1 in list.indices){
                        if (list[d]>finDate){
                            finDate=list[d]
                        }
                        d+=1
                    }
                }
            }
            }

        return when(blockB) {
            String::class -> { s }
            Int::class -> { s1 }
            else -> { finDate.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")) }
        }
    }
}

