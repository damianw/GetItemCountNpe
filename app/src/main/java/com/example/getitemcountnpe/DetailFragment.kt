package com.example.getitemcountnpe

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView

class DetailFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.list_item, container, false)
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val position = arguments!!.getInt("position")
        (view as TextView).text = "Detail #$position"
    }

    companion object {

        fun newInstance(position: Int) = DetailFragment().apply {
            arguments = Bundle().apply {
                putInt("position", position)
            }
        }

    }

}
