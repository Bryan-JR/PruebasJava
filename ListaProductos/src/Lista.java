import javax.swing.*;

public class Lista {
    private Nodo inicio;
    private Nodo centro;
    private Nodo fin;
    
    public Lista(){
        inicio = null;
        centro = null;
        fin = null;
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
    
    
    public Nodo getCentro(int medio, Nodo ref){
        boolean encontrado = false;
        int cont = 0;
        while(cont != medio && !encontrado) {    
            cont++;
            if(cont==medio){
                centro = ref;
                encontrado = true;
            }
            
            ref = ref.getEnlace();
        }
        return centro;
    }
    
    public void ordenarLista(){
        Nodo temp, temp1, ant = null;
        int tam = getTam();
        for (int i = 1; i < tam; i++){
            temp = inicio;
            temp1 = temp.getEnlace();
            for (int j = 1; j <= tam-i; j++) {
                if(temp.getId()>temp1.getId()){
                    if(temp==inicio){
                        temp.setEnlace(temp1.getEnlace());
                        temp1.setEnlace(inicio);
                        inicio = temp1;
                        ant = temp1;
                        temp1 = temp.getEnlace();
                        if(temp.getEnlace()==null) fin = temp;
                    } else {
                        temp.setEnlace(temp1.getEnlace());
                        temp1.setEnlace(temp);
                        ant.setEnlace(temp1);
                        temp1 = temp.getEnlace();
                        if(temp.getEnlace()==null) fin = temp;
                    }
                } else {
                    ant = temp;
                    temp = temp.getEnlace();
                    temp1 = temp.getEnlace();
                }
            }
        }
    }
    
    public void busquedaBinarina(int id){
        int med = Math.round(getTam()/2)+1;
        Nodo der, izq, medio=getCentro(med, inicio);
        if(medio.getId()==id){
             JOptionPane.showMessageDialog(null, medio.info());
        }else if(id<medio.getId()){
            izq = medio;
            med = Math.round(med/2)+1;
            medio = getCentro(med, izq);
            busquedaBinarina(id);
        } else if(id>medio.getId()){
            der = medio;
            med = Math.round(med/2)+1;
            medio = getCentro(med, der);
            busquedaBinarina(id);
        }
    }
}
