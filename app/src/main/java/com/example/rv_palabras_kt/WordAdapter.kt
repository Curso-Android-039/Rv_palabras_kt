package com.example.rv_palabras_kt

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.rv_palabras_kt.databinding.WordItemListBinding


/*****************3.- EXTIENDO LA CLASE WORDADATER QUE CONTIENE LA CLASE INTERNA WORDVIEWHOLER */
class WordAdapter(
    /*****************1.- AÑADIR REPRESENTACIÓN DE LOS DATOS */
     private val  mWorlist : List<String>
): RecyclerView.Adapter<WordAdapter.WordViewHolder>() {





    /*****************2.Crear clase interna que se llama ViewHolder
     *  */ // INICIALIZAMOS TEXVIEW QUE ES DENTRO DEL XML  Y LLAMAMOS MBINDING QUE ES DE LA CLASE XML QUE CONTIENE TEXVIEW
    // NOS PEDIRA IMPLEMENTAR SU CONSTRUCTOR DE LA SUPER CLASE
    // CAMBIAMOS EL ELEMENTO ANTERIOR Y REFERENCIAMOS A LA CLASE BINDING QUE REPRESENTA NUESTRO DISEÑO

    inner class  WordViewHolder(mBinding : WordItemListBinding ):
        RecyclerView.ViewHolder(mBinding.root){
        internal val textView = mBinding.textView
    }


    //4 ESTE METODO INICIALIZA LAS VISTAS LAS INFLA
    // EN EL CONSTRUCTOR RECIBE UN OBJETO LE PASAMOS BINDING
    // INSTANCIAMOS VIEWBINDING PARA RETONAR NUESTRO VIEWHOLDER CON ESA DEPENDENCIA

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WordViewHolder {
        val mBinding = WordItemListBinding.inflate(LayoutInflater.from(parent.context),parent,false)
      return WordViewHolder(mBinding)
    }


    // 5  RECIBE LOS DATOS ENVIADOS DESDE EL METODO QUE GENERA LOS DATOS Y LOS SETEA AL TEXVIEW
    // CREMOAS UNA VARIABLE DE REFERENCIA DE CONTENIDO DE EL LISTADO Y LO ASIGNAMOS AL ELEMENTO
    // VISUAL QUE VIENE DEL HOLDER

    override fun onBindViewHolder(holder: WordViewHolder, position: Int) {
      val element = mWorlist[position]
        holder.textView.text = element
    }


    // 6 Este método lleva la cuenta de cuantos elementos hay en el listado
    override fun getItemCount(): Int {
        return  mWorlist.size -1
    }

}