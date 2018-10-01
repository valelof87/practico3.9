
public class Tarea implements Comparable<Tarea>{
	protected int prioridad;
	protected int usoMemoria;
	protected int usoCPU;
	
	public Tarea() {
	}
	
	public Tarea (int prioridad, int usoMemoria,int usoCPU) {
		this.prioridad = prioridad;
		this.usoMemoria = usoMemoria;
		this.usoCPU = usoCPU;
	}
	
	public int getPrioridad() {
		return prioridad;
	}
	
	public void setPrioridad(int prioridad) {
		this.prioridad = prioridad;
	}
	
	public int getUsoMemoria() {
		return usoMemoria;
	}
	
	public void setUsoMemoria(int memoria) {
		this.usoMemoria = memoria;
	}
	
	public int getUsoCPU() {
		return usoCPU;
	}
	
	public void setUsoCPU(int usoCPU) {
		this.usoCPU = usoCPU;
	}
	
	@Override
	public int compareTo(Tarea o) {
		if (prioridad < o.getPrioridad()) {
            return -1;
        } else if (prioridad > o.getPrioridad()) {
            return 1;
        } else {
	
        	return 0;
        }
	}
	
}
