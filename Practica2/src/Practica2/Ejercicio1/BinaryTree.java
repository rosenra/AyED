package Practica2.Ejercicio1;
import java.util.*;
public class BinaryTree <T> {
	 private T data;
	    private BinaryTree<T> leftChild;   
	    private BinaryTree<T> rightChild; 

	    public BinaryTree() {
	        super();
	    }

	    public BinaryTree(T data) {
	        this.data = data;
	    }

	    public T getData() {
	        return data;
	    }

	    public void setData(T data) {
	        this.data = data;
	    }
	    /**
	     * Preguntar antes de invocar si hasLeftChild()
	     * @return
	     */
	    public BinaryTree<T> getLeftChild() {
	        return leftChild;
	    }
	    /**
	     * Preguntar antes de invocar si hasRightChild()
	     * @return
	     */
	    public BinaryTree<T> getRightChild() {
	        return rightChild;
	    }

	    public void addLeftChild(BinaryTree<T> child) {
	        this.leftChild = child;
	    }

	    public void addRightChild(BinaryTree<T> child) {
	        this.rightChild = child;
	    }

	    public void removeLeftChild() {
	        this.leftChild = null;
	    }

	    public void removeRightChild() {
	        this.rightChild = null;
	    }

	    public boolean isEmpty(){
	        return (this.isLeaf() && this.getData() == null);
	    }

	    public boolean isLeaf() {
	        return (!this.hasLeftChild() && !this.hasRightChild());
	    }

	    public boolean hasLeftChild() {
	        return this.leftChild!=null;
	    }

	    public boolean hasRightChild() {
	        return this.rightChild!=null;
	    }
	    @Override
	    public String toString() {
	        return this.getData().toString();
	    }
	    
	    public int contarHojas() {
	    	int rightC = 0;
	    	int leftC = 0;
	    	if(this.isEmpty()) {
	    		return 0;
	    	}else if (this.isLeaf()) {
	    		return 1;
	    	}else {
	    		if(this.hasLeftChild()) 
	    			leftC = this.getLeftChild().contarHojas();
	    		if(this.hasRightChild())
	    			rightC = this.getRightChild().contarHojas();
	    		return rightC +leftC;
	    	}
	    }
	    
	    public BinaryTree <T> espejo(){
	    	BinaryTree <T> treeEspejo = new BinaryTree<T>(this.getData());
	    	if (this.hasLeftChild()) {
	    		treeEspejo.addRightChild(this.getLeftChild().espejo());
	    	}
	    	if (this.hasRightChild()) {
	    		treeEspejo.addLeftChild(this.getRightChild().espejo());
	    	}
	    	return treeEspejo;
	    }
	    
	    public void entreNiveles(int m,int n) {
	    	if(this.isEmpty() || m<0 || m>n) return;
	    	Queue <BinaryTree<T>> cola = new LinkedList();
	    	cola.add(this);
	    	int nivelActual = 0;
	    	while (!cola.isEmpty()) {
	    		int nodoNivel = cola.size();//n° de nodos en el nivel act
	    		if (nivelActual >= m && nivelActual <=n) {
	    			for (int i=0;i< nodoNivel;i++) {
	    				BinaryTree <T> nodo = cola.remove();//saco el dato de la cola
	    				System.out.print(nodo.getData()+"|");
	    				if (nodo.hasLeftChild())
	    					cola.add(nodo.getLeftChild());//guardo los hijos del dato para el prox nivel
	    				if (nodo.hasRightChild())
	    					cola.add(nodo.getRightChild());
	    			}
	    		}else {
	    			for (int i=0;i< nodoNivel;i++) {
	    				cola.remove();//si no esta en el rango lo saco
	    			}
	    		}
	    		nivelActual++;
	    		System.out.println("");
	    	}
	    }
	    public void imprimirArbol() {
	        if(this.hasLeftChild()) this.getLeftChild().imprimirArbol();
	        System.out.print(this.getData() + " ");
	        if(this.hasRightChild()) this.getRightChild().imprimirArbol();
	    }
	    
	    public static void main (String[] args) {
	        System.out.println("Test metodos Arboles");
	        BinaryTree<Integer> ab = new BinaryTree<Integer>(4);
	        ab.addLeftChild(new BinaryTree<Integer>(2));
	        ab.addRightChild(new BinaryTree<Integer>(6));
	        ab.getLeftChild().addLeftChild(new BinaryTree<Integer>(1));
	        ab.getLeftChild().addRightChild(new BinaryTree<Integer>(3));
	        ab.getRightChild().addLeftChild(new BinaryTree<Integer>(5));
	        //ab.getRightChild().addRightChild(new BinaryTree<Integer>(8));
	        
	        System.out.println(ab.contarHojas());
	        System.out.println("Arbol original: ");
	        ab.imprimirArbol();
	        System.out.println("Arbol espejo: ");
	        BinaryTree<Integer> abEspejo = ab.espejo();
	        abEspejo.imprimirArbol();
	        System.out.println("");
	        System.out.println("Impresion Arbol por niveles 0 y 1");
	        ab.entreNiveles(0, 2);;
	    }
	    
	    
}
