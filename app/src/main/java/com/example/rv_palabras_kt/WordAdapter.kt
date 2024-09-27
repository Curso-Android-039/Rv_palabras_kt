package com.example.rv_palabras_kt

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.rv_palabras_kt.databinding.WordItemListBinding


/*****************3.- EXTIENDO LA CLASE WORDADATER QUE CONTIENE LA CLASE INTERNA WORDVIEWHOLER */
class WordAdapter(
    /*****************1.- AÑADIR REPRESENTACIÓN DE LOS DATOS */
     private val  mWorlist : List<String>
): RecyclerView.Adapter<WordAdapter.WordViewHolder>() {






    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WordViewHolder {
        TODO("Not yet implemented")
    }



    override fun onBindViewHolder(holder: WordViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }




    /*****************2.Crear clase interna que se llama ViewHolder
     *  */ // INICIALIZAMOS TEXVIEW QUE ES DENTRO DEL XML  Y LLAMAMOS MBINDING QUE ES DE LA CLASE XML QUE CONTIENE TEXVIEW
    // NOS PEDIRA IMPLEMENTAR SU CONSTRUCTOR DE LA SUPER CLASE
    // CAMBIAMOS EL ELEMENTO ANTERIOR Y REFERENCIAMOS A LA CLASE BINDING QUE REPRESENTA NUESTRO DISEÑO

    inner class  WordViewHolder(mBinding : WordItemListBinding ):
        RecyclerView.ViewHolder(mBinding.root){
        internal val textView = mBinding.textView
    }
}