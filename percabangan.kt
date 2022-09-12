//if
//if else
//if else if
//when=switch case

    fun main() {
        println("masukan nilai uts")
        val uts: Int = readLine()!!.toInt()
        println("masukan nilai uas")
        val uas: Int = readLine()!!.toInt()

        val na : Double = (0.4 * uts) + (0.6 * uas)
        println(na)

        if(na > 80){
            println("Selamat Anda anda naik semester ")
        } else {
            println("Maaf,anda cuti semester")
        }
    }
