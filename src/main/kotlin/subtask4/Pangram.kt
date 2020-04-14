package subtask4

class Pangram {

    // TODO: Complete the following function
    fun getResult(inputString: String): String {
        var bool = true
        val newInputString = inputString.trim().replace("\\s+".toRegex(), " ")
        val arr = newInputString.split(" ")
        val list = arrayListOf<String>()
        val alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray()
        val alphabet2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray()
        val vowels = "eyuoaiEYIOAU".toCharArray()
        for (i in alphabet.indices){
            if (!inputString.contains(alphabet[i])&&!inputString.contains(alphabet2[i])){
                bool=false
                break
            }
        }
            for (i in arr.indices){
                var s = StringBuilder(arr[i])
                var count = 0
                for (t in s.indices){
                    if (bool){
                        if (vowels.contains(s[t])){
                            s[t]=s[t].toUpperCase()
                            count += 1
                        }
                    } else {
                        if ((alphabet+alphabet2).contains(s[t])&&!vowels.contains(s[t])){
                            s[t]=s[t].toUpperCase()
                            count += 1
                        }
                    }

                }
                s.insert(0, count)
                if (arr.isNotEmpty()){
                    list.add(s.toString())
                }
            }

        var newList = arrayListOf<String>()
        var v = 0

        while (newList.size!=list.size){
            for (i in list.indices){
                if (list[i][0]==v.toChar()){
                    newList.add(list[i])
                }
            }
            v += 1
        }

        var listString = ""
        if (!(newList.size==1&&newList[0] == "0")){
            for (i in newList.indices){
                if (i<newList.size-1){
                    listString = listString+newList[i]+" "
                } else {
                    listString += newList[i]
                }
            }
        }
        return listString
    }
}
