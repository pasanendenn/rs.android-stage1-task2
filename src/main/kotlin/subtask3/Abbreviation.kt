package subtask3

class Abbreviation {

    // TODO: Complete the following function
    fun abbreviationFromA(a: String, b: String): String {
        var s="YES"
        val newStr = StringBuilder(a)
        val newStr2 = StringBuilder(b)
        for (i2 in newStr2.indices){
            if (!newStr.toString().substring(i2).toLowerCase().contains(newStr2[i2].toLowerCase())){
                s="NO"
                break
            }
        }
        return s
    }
}

