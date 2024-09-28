package com.example.rv_palabras_kt

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.rv_palabras_kt.databinding.FragmentFirstBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    // 1 -Creamos un list que represente los datos

    val datalist: MutableList<String> =ArrayList()



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root

    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

      // para probar que hay datos

        Log.d("Listado",setData().toString())
        // 1 INSTANCIAR EL ADAPTER Y LE PASAMOS LOS DATOS CON EL METODO PALABRAS
        val adapter =  WordAdapter(setData())
        // 2 LE PASAMOS EL ADAPTER AL RECYCLER VIEW
        binding.recyclerView.adapter= adapter
       binding.recyclerView.layoutManager = LinearLayoutManager(context)
        binding.recyclerView.setHasFixedSize(true)
         binding.fab.setOnClickListener {
            datalist.add("PALABRA " +datalist.size)


             // puede ser null ya que, podria  no se insertarse nada
            binding.recyclerView.adapter?.notifyItemInserted(datalist.size)
            binding.recyclerView.smoothScrollToPosition(datalist.size )

        }



    }



    // paso 2 crear listado de palabras

    fun setData(): List<String>{

        for (i in 0..98){

            datalist.add("Palabra: $i")
        }
        return  datalist
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}