package com.example.thirdmsixthhm

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridLayout
import androidx.recyclerview.widget.GridLayoutManager
import com.example.thirdmsixthhm.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding
    private val data = arrayListOf<Lesson>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentMainBinding.inflate(LayoutInflater.from(requireContext()),container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()
        val adapter = LessonAdapter(data)
        binding.recyclerview.layoutManager = GridLayoutManager(requireContext(),2)
        binding.recyclerview.adapter = adapter
    }

    private fun loadData() {
        data.add(Lesson("https://www.pngall.com/wp-content/uploads/9/History-Book.png","History",R.color.purple_200))
        data.add(Lesson("https://upload.wikimedia.org/wikipedia/commons/c/c3/Deus_mathematics.png","Math",R.color.red))
        data.add(Lesson("https://www.pngmart.com/files/19/Geometry-Pattern-PNG-Clipart.png","Geometry",R.color.orange))
        data.add(Lesson("https://upload.wikimedia.org/wikipedia/commons/7/7b/WikiProject_Biology_Logo_%28Deus_WikiProject%29.png","Biology",R.color.green))
        data.add(Lesson("https://upload.wikimedia.org/wikipedia/commons/f/ff/Deus_geography.png","Geography",R.color.yellow))
        data.add(Lesson("https://cdn-icons-png.flaticon.com/512/710/710481.png","Chemistry",R.color.purple_200))
        data.add(Lesson("https://cdn-icons-png.flaticon.com/512/188/188802.png","Physics",R.color.blue))
        data.add(Lesson("https://cdn-icons-png.flaticon.com/512/1593/1593412.png","Informatics",R.color.black))
        data.add(Lesson("https://www.pngmart.com/files/3/Music-PNG-Photos.png","Music",R.color.purple_500))
        data.add(Lesson("https://upload.wikimedia.org/wikipedia/commons/thumb/8/8c/P_philosophy.svg/1068px-P_philosophy.svg.png","Philosophy",R.color.teal_200))
    }
}