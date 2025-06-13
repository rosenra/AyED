package Practica1.Ejercicio6;

public class ejercicio6 {
/*A.¿En qué casos ArrayList ofrece un mejor rendimiento que LinkedList?
 
RTA: Accceso Aleatorio: ArrayList provee mayor rendimiento en acceso a elementos por índice 
debido a su estructura, su tiempo de acceso es constante (O(1)). En cambio, en linkedLinst, tenes que 
recorrer toda la lista hasta encontrar el elemento, por esto su orden es = (O(n)) donde n es = a la
longitud de la lista.
Iteración: en un bucle ArrayList es mas eficiente que LinkedList porque almacena los elementos en un registro
interno (localizacion contigua en memoria). Esto mejora la cache y permite un tiempo de acceso a los elementos
más rápido.En LinkedList hay que navegar a traves de los nodos enlzados lo cual es mas costoso en terminos de
rendimiento.

b. ¿Cuándo LinkedList puede ser más eficiente que ArrayList?

RTA:eliminaciones e incerciones: LinkedList es mas eficiente en , no tiene que hacer corrimientos pq tiene
un puntero al principio y al final (solo se modifican estos), por eso tiene O(1).Lo mismo si se quiere eliminar
o insertar en el medio de la lista, solo se reacomodan los punteros vecinos y mantiene el O(1). En arrayList,
hay que hacer corrimientos(desplazmiento y reasignacion),en algunos casos reacomodar todo el arreglo, 
para mantener la continuidad del arreglo (esto es costoso).

c. ¿Qué diferencia encuentra en el uso de la memoria en ArrayList y LinkedList?

LinkedList: cada nodo almacena referencias al elemento anterior,al siguiente (doblemente enlazada).Esta
referencia a los nodos vecinos causa una sobrecarga.En general,LinkedList ocupa mas memoria que ArrayList por
su necesidad de almacenar referencias a nodos vecinos.
ArrayList: almacenamiento dinámico, se puede redimensionar frente a una adición/eliminación.Por eso ArrayList 
tiende a ocupar más memoria que linkedList para la misma cantidad de elementos si la capacidad inicial es muy grande
o si se redimensiona constantemente.

d. ¿En qué casos sería preferible usar un ArrayList o un LinkedList?

RTA: ArrayList: cuando necesito acceso rapido y frecuente a los elementos por indice, operaciones de lectura,
acceso aleatorio, pocas eliminaciones/inserciones o que se realizan al final de la lista.Cuando se quiere mas eficiencia
que LinkedList para la misma cant de elementos.
RTA: LinkedList:  cuando necesitar hacer muchas inserciones/eliminaciones, principalmente al final,al principio y al medio
*/



}
