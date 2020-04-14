package subtask2

class TimeConverter {

    // TODO: Complete the following function
    fun toTextFormat(hour: String, minute: String): String {
        val s = arrayOf("one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty", "twenty one", "twenty two", "twenty three", "twenty four", "twenty five", "twenty six", "twenty seven", "twenty eight", "twenty nine")
        val min = minute.toInt()
        val h = hour.toInt()
        var finalStr = ""
        if (min in 0..30){
            finalStr = when (min) {
                15 -> { "quarter past "+s[h-1] }
                1 -> { "one minute past "+s[h-1] }
                0 -> { s[h-1]+" o' clock" }
                30 -> { "half past "+s[h-1] }
                else -> { s[min-1]+" minutes past "+s[h-1] }
            }
        } else if (min in 31..59){
            finalStr = when (min) {
                45 -> { "quarter to "+s[h] }
                59 -> { "one minute to "+s[h] }
                else -> { s[60-min-1]+" minutes to "+s[h] }
            }
        }
        return finalStr
    }
}
