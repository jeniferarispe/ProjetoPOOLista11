package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import interfaces.CalculaMedia;

public class Aluno implements CalculaMedia {
private String nome;
private List<Disciplina> disciplinas;

public Aluno() {
	disciplinas = new ArrayList<Disciplina>();
	
}
public Aluno(String nome) {
	this.nome=nome;
	disciplinas = new ArrayList<Disciplina>();
	
}

@Override
public int hashCode() {
	return Objects.hash(disciplinas, nome);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Aluno other = (Aluno) obj;
	return Objects.equals(disciplinas, other.disciplinas) && Objects.equals(nome, other.nome);
}
@Override
public String toString() {
	return "Aluno [nome=" + nome + ", disciplinas=" + disciplinas + "]";
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public List<Disciplina> getDisciplinas() {
	return disciplinas;
}
public void setDisciplinas(List<Disciplina> disciplinas) {
	this.disciplinas = disciplinas;
}
@Override
public float calcularMediaGeral() {
	// TODO Auto-generated method stub
	float somaNotas = 0;
	for (Disciplina disciplina : disciplinas) {
		somaNotas += disciplina.getMediaDisciplina();
	}
	return somaNotas / disciplinas.size();
}
@Override
public boolean calcularMediaGeral1() {

	if(calcularMediaGeral()>=7) {
		return true;
	}else return false;
}
public String situacao() {
	if(calcularMediaGeral1()) {
		
		return "APROVADO";
	}else if (calcularMediaGeral() < 7 && calcularMediaGeral() >= 5){
		return "RECUPERACAO";
	}else {
		return "REPROVADO";
	}
}

}
