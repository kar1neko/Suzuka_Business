package com.example.suzuka_business_contest.ui.home

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.suzuka_business_contest.R
import com.example.suzuka_business_contest.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    //homefragment -> premiumfragment
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root
//
//        binding.BHomeUpgrade.setOnClickListener {
//            findNavController().navigate(R.id.action_homefragment_to_premiumfragment)
//        }
//
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.first_features_detail).setOnClickListener {
            val intent = Intent(activity, DoorsensorDetail::class.java)
            startActivity(intent)
        }
    }

    class DoorsensorDetail : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
            super.onCreate(savedInstanceState, persistentState)
            setContentView(R.layout.fragment_doorsensor_detail)
        }
    }

    // homefragment -> doorsensorfragment
//    class HomeFragment : Fragment(R.layout.fragment_home) {
//        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//            super.onViewCreated(view, savedInstanceState)
//
//            val navController = findNavController()
//            view.findViewById<Button>(R.id.first_features_detail).setOnClickListener {
//                navController.navigate(R.id.action_homefragment_to_doorsensorfragment)
//            }
//        }

   } //**IMPORTANT**

    //continuation of "homefragment -> premiumfragment"
//    override fun onDestroyView() {
//        super.onDestroyView()
//        _binding = null
//    }
//}