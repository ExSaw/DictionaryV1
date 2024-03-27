package com.rickrip.dictionary.feature_dictionary.data.remote.dto


class Test {
    companion object{
        @JvmStatic
        fun main(args: Array<String>) {
            val x = listOf(1, 2, 3)

                .filter {
                    it >= 2
                }
                .map {
                    print("$it ")
                    it
                }
            print("before sum ")
            println(x.sum())
        }

    }

}

