package com.example.weeksixassessment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.weeksixassessment.databinding.ContactItemBinding

class ContactAdapter(val contactItems: List<ContactModel>): RecyclerView.Adapter<ContactAdapter.ViewHolder>() {

    inner class  ViewHolder(val binding: ContactItemBinding): RecyclerView.ViewHolder(binding.root){

        fun bind(contactItem: ContactModel){
            binding.userName.text = contactItem.userFullName
            binding.userNumber.text = contactItem.userPhoneNumber
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding: contactItemBinding = ContactItemBinding.inflate(LayoutInflater.from(parent.context))

        return ViewHolder(binding)
    }

    override fun getItemCount() = contactItems.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(contactItems.get(position))
    }
}