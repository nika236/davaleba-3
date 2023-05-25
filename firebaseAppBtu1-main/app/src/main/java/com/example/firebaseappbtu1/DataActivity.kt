package com.example.firebaseappbtu1

import android.media.Image
import android.provider.ContactsContract.CommonDataKinds.Email

class DataActivity {

    data class School(val name: String,val students: Array<Student>)
    data class Student(val firstName: String,val lastName: String,
                       val personalNumber: Int,val profilePicture: Image, val emailAddress: Email){
        init {
            require(personalNumber.toString().length == 13) {"Personal number must be 13 digits"}
            require(emailAddress.toString().contains("@")) { "Invalid email address." }
        }
    }

}