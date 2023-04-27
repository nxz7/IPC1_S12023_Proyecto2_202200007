
package proyecto2;

import java.awt.Image;


/**
 *
 * @author natalia
 */

public class Imagenes extends EstructuraDeDatos {
    private NodoDoble inicio;
    private NodoDoble current;

    public Imagenes() {
        this.inicio = null;
    }

    @Override
    public void add(Object e) {
        if(inicio == null) {
            inicio = new NodoDoble((Image)e);
            index++;
            Mensaje("SE AGREGO " + e + "<<<<");
        } else {
            NodoDoble tmp = inicio;
            for (int i = 0; i < this.index; i++) {
                if(tmp != null){
                    if(tmp.getValor() != (Image)e){
                        if(tmp.getNext() == null) {
                            tmp.setNext(new NodoDoble((Image)e, tmp));
                            index++;
                            Mensaje("SE AGREGO " + e + "<<<<");
                        } else {
                            tmp = tmp.getNext();
                        }
                    } else {
                        Mensaje("Ya existe: " + e);
                        break;
                    }
                }
            }
        }
    }

    @Override
    public Object peek() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Object find(Object e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Object getNext() {
        if(current == null) {
            current = inicio;
            return current.getValor();
        } else if(current.getNext() != null) {
            current = current.getNext();
            return current.getValor();
        } else {
            return null;
        }
    }
    
    

    @Override
    public int getSize() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Object get(int i) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Object pop() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void delete(Object e) {
        if(!vacia()) {
            boolean eliminado = false;
            NodoDoble tmp = inicio;

            for (int i = 0; i < this.index; i++) {
                if(tmp.getValor() == (Image)e){
                    tmp.getBack().setNext(tmp.getNext());
                    tmp.getNext().setBack(tmp.getBack());
                    Mensaje("Se elimino: " + e);
                    index--;
                    eliminado = true;
                    break;
                                } else {
                tmp = tmp.getNext();
            }
        }
        if(!eliminado) {
            Mensaje("NO EXISTE " + e );
        }
    } else {
        Mensaje("LISTA VACIA " );
    }
}

     public boolean vacia() {
     return inicio == null;
}

    public void imprimir() {
    if(!vacia()) {
        NodoDoble tmp = inicio;
        while(tmp != null) {
            System.out.print(tmp.getValor() + " <--> ");
            tmp = tmp.getNext();
        }
    } else {
        System.out.println("La lista esta vacia.");
    }
}
    public Object getAnterior() {
        if(current == null) {
            current = inicio;
            return current.getValor();
        } else if(current.getBack() != null) {
            current = current.getBack();
            return current.getValor();
        } else {
            return null;
        }
    }
    
    public void EliminarCurrent() {
        if (!vacia() && current != null) {
        NodoDoble tmp = current;
        current = current.getBack();

        if (current != null) {
            current.setNext(tmp.getNext());
        } else {
            inicio = tmp.getNext();
        }

        if (tmp.getNext() != null) {
            tmp.getNext().setBack(current);
        }

        index--;
        Mensaje("Se elimino la imagen actual");
    } else {
        Mensaje("No se pudo eliminar la imagen actual");
    }
    }
    
    

public void Mensaje(String msg){
    System.out.println(msg);
}
}
