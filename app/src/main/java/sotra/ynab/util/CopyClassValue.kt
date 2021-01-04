package sotra.ynab.util

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

/**
 * Created by developers@appgain.io on 1/4/2021.
 */
class  CopyClassValue{
    companion object {
        inline fun <reified T: Any> getValue(  objToConvert : Any): T {
            val gson = Gson().toJson(objToConvert)
            val type  =  T::class.java
            return Gson().fromJson(gson, type)
        }
    }
}