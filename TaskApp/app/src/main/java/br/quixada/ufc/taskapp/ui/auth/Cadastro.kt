package br.quixada.ufc.taskapp.ui.auth


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import br.quixada.ufc.taskapp.R
import br.quixada.ufc.taskapp.databinding.FragmentCadastroBinding


class Cadastro : Fragment() {

    private var _binding: FragmentCadastroBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCadastroBinding.inflate(layoutInflater, container, false )
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}