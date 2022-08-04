package model;

import java.util.Arrays;

public class Nota {
private float notas[]=new float[10];

public Nota(float[] coletaNotas) {

}

public float[] getNotas() {
	return notas;
}
public void setNotas(float[] notas) {
	this.notas = notas;
}
public float GetSomaNotas(){
	return 0;
	
	
}
public float GetMediaNotas() {
	return 0;
	
	
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + Arrays.hashCode(notas);
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Nota other = (Nota) obj;
	return Arrays.equals(notas, other.notas);
}

@Override
public String toString() {
	return "Nota [notas=" + Arrays.toString(notas) + "]";
}
public float getSomaNotas() {
	float soma = 0;
	for(float nota : notas) {
		soma += nota;
	}
	return soma;
}

public float getMediaNotas() {
	return getSomaNotas() / notas.length;
}

}

	
	