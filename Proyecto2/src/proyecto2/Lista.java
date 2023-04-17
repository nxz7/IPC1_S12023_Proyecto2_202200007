
package proyecto2;


public class Lista extends EstructuraDeDatos {

    private Nodo primero;
    private Nodo ultimo;
    private int tam;
    
    public Lista(){
        this.primero=null;
        this.ultimo=null;
        this.tam=0;
  
    }
    
    public boolean ListaVacia(){
       return primero == null;
    
    }
    
    public void mostrar(){
    Nodo actual = new Nodo();
    actual=primero;
    int contador = 0;
    
    while(actual != null){
    System.out.println(contador + "."+ actual.getUsuario().getNombre());
    //System.out.println("----------");
    actual = actual.siguiente;
    contador++;
    }
    }
    
    
    @Override
    public void add(Object e) {
        Usuario nuevoUsuario = (Usuario)e;
        Nodo nuevoNodo = new Nodo();
        
        nuevoNodo.dato= nuevoUsuario;
        
        if(ListaVacia()){
        primero= nuevoNodo;
        primero.siguiente=null;
        
        ultimo=nuevoNodo;
        }else{
        ultimo.siguiente=nuevoNodo;
        nuevoNodo.siguiente=null;
        ultimo=nuevoNodo;
        }
        
        tam++;
    }
    
    

    @Override
    public Object peek() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object find(Object e) {
        Usuario usuarioBuscado = (Usuario) e;
    Nodo actual = primero;
    
    while (actual != null) {
        if (actual.getUsuario().equals(usuarioBuscado)) {
            return actual.getUsuario();
        }
        actual = actual.siguiente;
    }
    return null;
    }

    @Override
    public Object getNext() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int getSize() {
        return tam;
    }

    //ListaUsuarios.get(1);
    
    @Override
    public Object get(int i) {
    Nodo actual = new Nodo();
    actual=primero;
    int contador = 0;
    
    while(actual != null){
        if(contador==i){
            return actual.getUsuario().getNombre();
        }
        System.out.println(contador + "."+ actual.getUsuario().getNombre());
        actual = actual.siguiente;
        contador++;
    }
    return null;
    }
    

    @Override
    public Object pop() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Object e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
