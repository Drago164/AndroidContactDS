package fr.isen.savy.androidcontactds

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import fr.isen.savy.androidcontactds.model.NameItems
import fr.isen.savy.androidcontactds.model.PictureItems

internal class ContactAdapter(
        private var arrayListName: ArrayList<NameItems>,
        //private var arrayListPicture: ArrayList<PictureItems>,
        val onItemClickListener: () -> Unit) :

        RecyclerView.Adapter<ContactAdapter.MyViewHolder>() {

        internal inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
                val contentName: TextView = view.findViewById(R.id.information_contact)
                val contentImage: ImageView = view.findViewById(R.id.image_contact)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
                val view = LayoutInflater.from(parent.context)
                        .inflate(R.layout.contact_list, parent, false)
                return MyViewHolder(view)
        }

        override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
                val itemName = arrayListName[0]
                holder.contentName.text = itemName.ms
                holder.contentName.text = itemName.first
                holder.contentName.text = itemName.last
                        //Picasso.get().load(arrayListPicture[position].medium)
                                //.placeholder(R.drawable.contact)
                               // .into(holder.contentImage)
                holder.itemView.setOnClickListener {
                        onItemClickListener()
                }
        }

        override fun getItemCount(): Int = arrayListName.size
        fun refreshList(ContactFromAPI: ArrayList<NameItems>) {
                arrayListName = ContactFromAPI
                notifyDataSetChanged()
        }
        }