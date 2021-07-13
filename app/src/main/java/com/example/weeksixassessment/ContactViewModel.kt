package com.example.weeksixassessment

import android.view.View
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.room.Database
import androidx.room.RoomDatabase

class ContactViewModel: ViewModel() {

    fun addContactItem(contactItem: ContactModel, database: ContactDatabase) {
        database.contactDao().addContactItem(contactItem)
    }

    fun getAllContactItems(database: ContactDatabase): LiveData<List<ContactModel>> {
        return database.contactDao().getAllContactItems()
    }
}