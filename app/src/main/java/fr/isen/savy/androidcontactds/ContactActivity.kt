package fr.isen.savy.androidcontactds

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.volley.Request
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import com.google.gson.Gson
import fr.isen.savy.androidcontactds.model.DataResult
import fr.isen.savy.androidcontactds.model.NameItems
import fr.isen.savy.androidcontactds.databinding.ActivityMainBinding
import fr.isen.savy.androidcontactds.model.PictureItems
import fr.isen.savy.androidcontactds.model.Results

class ContactActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var itemsList = ArrayList<NameItems>()
    private var itemsList2 = ArrayList<PictureItems>()
    private lateinit var myCategoryAdapter : ContactAdapter
    private var resultarray = ArrayList<Results>()
    private var namearray = ArrayList<NameItems>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        val menuName = intent.getStringExtra("categoryName") ?: ""
        val menuList = intent.getStringArrayListExtra("List_Meal")

        if (menuList != null) {
            supportActionBar?.title = menuName

            myCategoryAdapter = ContactAdapter(itemsList){
                val intent = Intent(this, ContactActivity::class.java)
                intent.putExtra("categoryName", "Contact")
                startActivity(intent)
            }
            val layoutManager = LinearLayoutManager(applicationContext)
            binding.contactList.layoutManager = layoutManager
            binding.contactList.adapter = myCategoryAdapter
            binding.contactList.layoutManager = LinearLayoutManager(this)
        }
        loadContactFromAPI()

    }
    private fun loadContactFromAPI(){
        val url = "https://randomuser.me/api/?results=10&nat=fr"
        val jsonRequest = JsonObjectRequest(
            Request.Method.GET, url, null,
            {
                Log.w("ContactActivity", "response : $it")
                println("avant handleAPIData")
                handleAPIData(it.toString())
                println("apres handleAPIData")
            },
            {
                Log.w("ContactActivity", "error : $it")
            })
        Volley.newRequestQueue(this).add(jsonRequest)
    }


    private fun handleAPIData(data: String){
        val contactData = Gson().fromJson(data, DataResult::class.java)
        val contactResults= contactData.data.firstOrNull { it.result == resultarray }
        val contactName= contactResults?.result?.firstOrNull { it.name == namearray }

        println("avant adapter")
        val adapter = binding.contactList.adapter as ContactAdapter
        adapter.refreshList(contactName?.name as ArrayList<NameItems>)
        println("apres adapter")
    }
}