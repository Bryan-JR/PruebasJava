
import javax.swing.*;

public class Lista {
    private Nodo inicio;
    private Nodo fin;
    
    public Lista(){
        inicio = null;
    }
    
    public Nodo getInicio(){
        return inicio;
    }
    
    public boolean repetido(int id){
        boolean rep = false;
        Nodo aux = inicio;
        while(aux!=null && rep!=true){
            if(id==aux.getId()){
                rep = true;
            } else {
                aux = aux.getEnlace();
            }
        } return rep;
    }
    
    public int getTam(){
        Nodo temp = inicio;
        int cont = 0;
        while(temp!=null){
            cont++;
            temp = temp.getEnlace();
        }
        return cont;
    }
    
    
    
    public void AgregarProducto(Nodo producto){
        if(inicio==null){//Si el inicio es vacio, se crea la lista
            inicio = producto;
            fin = inicio;
            JOptionPane.showMessageDialog(null, "Se ha creado la lista y se agrego el producto!");
        } else {
            fin.setEnlace(producto);
            fin = producto;
            JOptionPane.showMessageDialog(null, "Producto guardado!");
        }
    }
}
