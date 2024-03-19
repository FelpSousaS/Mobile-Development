package br.quixada.ufc.taskapp.ui.auth

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import br.quixada.ufc.taskapp.R
import br.quixada.ufc.taskapp.databinding.FragmentTelaLoginBinding


class Login : Fragment() {

    private var _binding: FragmentTelaLoginBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentTelaLoginBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initClicks()
    }

    private fun initClicks(){
        binding.txtCadastro.setOnClickListener{
            findNavController().navigate(R.id.action_login_to_cadastro2)
        }

        binding.txtRecSenha.setOnClickListener {
            findNavController().navigate(R.id.action_login_to_recuperarConta2)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}