package ru.vdv.mymemoryards.ui.trainings

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import ru.vdv.mymemoryards.databinding.FragmentTrainingsAreasBinding

class TrainingsAreasFragment : Fragment() {

    private var _binding: FragmentTrainingsAreasBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val TrainingsAreasViewModel =
            ViewModelProvider(this).get(TrainingsAreasViewModel::class.java)

        _binding = FragmentTrainingsAreasBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textDashboard
        TrainingsAreasViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}