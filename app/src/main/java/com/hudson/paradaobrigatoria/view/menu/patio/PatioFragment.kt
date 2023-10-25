package com.hudson.paradaobrigatoria.view.menu.patio

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.hudson.paradaobrigatoria.databinding.FragmentPatioBinding
import com.hudson.paradaobrigatoria.domain.models.AppClient
import com.hudson.paradaobrigatoria.view.menu.patio.adapter.CarListAdapter

class PatioFragment : Fragment() {

    private var _binding: FragmentPatioBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val patioViewModel =
            ViewModelProvider(this).get(PatioViewModel::class.java)

        _binding = FragmentPatioBinding.inflate(inflater, container, false)
        val root: View = binding.root

        // teste
        var list = listOf<AppClient>(
            AppClient(plate = "xxx", model = "XXX", null, null, null, null, null),
            AppClient(plate = "yyy", model = "yyy", null, null, null, null, null),
            AppClient(plate = "zzz",model = "XXX", null, null,null, null, null),
            AppClient(plate = "aaa",model = "XXX", null, null,null, null, null),
            AppClient(plate = "ccc",model = "XXX", null, null,null, null, null),
            AppClient(plate = "eee",model = "XXX", null, null,null, null, null)
        )

        _binding!!.carListRecyclerview.adapter = context?.let { CarListAdapter(list, it) }


        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}