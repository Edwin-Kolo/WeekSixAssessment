package com.example.weeksixassessment

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query


@Dao
interface ContactDAO {
    @Insert
    fun addContactItem(contactItem: ContactsModel)

    @Query("SELECT * from contacts_list")
    fun getAllContactItems(): LiveData<List<ContactsModel>>

    @Delete
    fun delete(contactItem: ContactsModel)
}