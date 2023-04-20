package com.melvin.laboratorio05

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.cardview.widget.CardView
import androidx.navigation.findNavController
import com.google.android.material.floatingactionbutton.FloatingActionButton

class BilbleFragment : Fragment() {
    private lateinit var addMovieButton : Button
    private lateinit var cardButton: CardView
    private lateinit var addMovieFloatingButton: FloatingActionButton
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_bilble, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bind(view);
        addMovieButton.setOnClickListener(){
            it.findNavController().navigate(R.id.action_bilbleFragment_to_movieFragment)
        }
        cardButton.setOnClickListener(){
            it.findNavController().navigate(R.id.action_bilbleFragment_to_movieFragment)
        }
        addMovieFloatingButton.setOnClickListener(){
            it.findNavController().navigate(R.id.action_bilbleFragment_to_createMovieFragment)
        }
    }

    private fun bind(view: View){
        addMovieButton = view.findViewById(R.id.next_button)as Button
        cardButton = view.findViewById(R.id.movie_card_View)
        addMovieFloatingButton = view.findViewById(R.id.add_floating_ActionButton)
    }

}