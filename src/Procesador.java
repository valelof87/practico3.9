import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Procesador  {
	protected Queue <Tarea> tareas;
	
	public static void main(String[] args) {
		Queue <Tarea> tarea = new PriorityQueue<Tarea>();
		
		tarea.add(new Tarea(3,20,50));
		tarea.add(new Tarea(1,30,40));
		tarea.add(new Tarea(2,50,30));
		tarea.add(new Tarea(4,10,80));
		
		while (!tarea.isEmpty()) {
			Tarea a = tarea.remove();
			
            System.out.println("proximo a eliminar " + a.getPrioridad()+ " " + a.getUsoMemoria()+ " " + a.getUsoCPU());
		}
		
	}
	
}
