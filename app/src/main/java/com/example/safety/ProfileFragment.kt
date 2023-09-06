package com.example.safety

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ProfileFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val listMembers= listOf<MemberModel>(
            MemberModel("Akshata Kodak"),
            MemberModel("Sakshi Rathod"),
            MemberModel( "Nikhil Awatade"),
            MemberModel( "Prutha Patil"),
        )

        val adapter = MemberAdapter(listMembers)

        val recycler =requireView().findViewById<RecyclerView>(R.id.recycler_member)
        recycler.layoutManager=LinearLayoutManager(requireContext())
        recycler.adapter =adapter
    }


    companion object {

        @JvmStatic
        fun newInstance() = ProfileFragment()
    }
}