package com.example.getitemcountnpe

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_list.*

class ListFragment : Fragment() {

    private val adapter = SampleAdapter()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recycler_view.adapter = adapter
    }

    override fun onDestroyView() {
        super.onDestroyView()
        recycler_view.swapAdapter(null, false)
    }

    private class SampleViewHolder(val textView: TextView) : RecyclerView.ViewHolder(textView)

    private inner class SampleAdapter : RecyclerView.Adapter<SampleViewHolder>() {

        override fun getItemCount(): Int = 200

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SampleViewHolder {
            val textView = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false) as TextView
            return SampleViewHolder(textView)
        }

        @SuppressLint("SetTextI18n")
        override fun onBindViewHolder(holder: SampleViewHolder, position: Int) {
            val view = holder.textView
            view.text = "Item #$position"
            view.setOnClickListener {
                view.post {
                    (requireActivity() as MainActivity).viewDetail(position)
                }
                recycler_view.smoothScrollToPosition(itemCount - 1)
            }
        }

    }

}
