package classeexecutavel;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JOptionPane;

import model.Aluno;
import model.Disciplina;
import model.Nota;
import model.Situacao;


public class classeexecutavel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		List<Aluno> alunos = new ArrayList<Aluno>();
	
		List<Nota> notas = new ArrayList<Nota>();
		
		int qtdAlunos = Integer.parseInt(JOptionPane.showInputDialog("Informe o Numero de Alunos: "));
		int qtdDisciplinas = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de disciplinas:"));
		
		
		for(int i = 0; i < qtdAlunos; i++) {
			List<Disciplina> disciplinas = new ArrayList<Disciplina>();
			Aluno aluno = new Aluno();
			
		
			String nome1 = JOptionPane.showInputDialog("Nome: ");
			aluno.setNome(nome1);
			alunos.add(aluno);
		
			for(int j = 0; j < qtdDisciplinas; j++) {
				Disciplina disciplina = new Disciplina();
				String nomeDisciplina = JOptionPane.showInputDialog("Nome Disciplina?");
				disciplina.setNomeDisciplina(nomeDisciplina);
				

				int nroNotas = Integer.parseInt(JOptionPane.showInputDialog("Notas?"));
				
				for(int w = 0; w <nroNotas;w++) {
					float[] coletaNotas = new float[4];
					for(int z = 0; z <= 3; z++) {
						float valorNota = Float.parseFloat(JOptionPane.showInputDialog(" Nota da Disciplina?"));
						coletaNotas[w] = valorNota;
					}
					Nota nota = new Nota(coletaNotas);
					notas.add(nota);
				disciplinas.add(disciplina);
			}	
		
			

			Map<String, List<Aluno>> mapAluno = new HashMap<String,List<Aluno>>();
			mapAluno.put(Situacao.APROVADO,new ArrayList<Aluno>());
			mapAluno.put(Situacao.REPROVADO,new ArrayList<Aluno>());
			mapAluno.put(Situacao.RECUPERACAO,new ArrayList<Aluno>());
			
			for(Aluno a : alunos) {
				
				if(a.situacao().equals(Situacao.APROVADO)) {
					mapAluno.get(Situacao.APROVADO).add(a);
				}else if(a.situacao().equals(Situacao.RECUPERACAO)) {
					mapAluno.get(Situacao.RECUPERACAO).add(a);
				}else {
					mapAluno.get(Situacao.REPROVADO).add(a);
				}
			
				System.out.println("Lista Aprovados-");
				for(Aluno aluno1: mapAluno.get(Situacao.APROVADO)){
							System.out.println("Aluno: "+aluno1.getNome());
							System.out.println("Media do Aluno: "+aluno1.calcularMediaGeral());
							System.out.println("Resultado: "+aluno1.calcularMediaGeral1());
							System.out.println("-------------------------------------------------------");
					
				}
				System.out.println("Recuperacao");
				for(Aluno aluno1: mapAluno.get(Situacao.RECUPERACAO)){
							System.out.println("Aluno: "+aluno1.getNome());
							System.out.println("Media do Aluno: "+aluno1.calcularMediaGeral());
							System.out.println("Resultado: "+aluno1.calcularMediaGeral1());
							System.out.println("-------------------------------------------------------");
					
				}
				System.out.println("Reprovados");
				for(Aluno aluno1: mapAluno.get(Situacao.REPROVADO)){
							System.out.println("Aluno: "+aluno1.getNome());
							System.out.println("Media do Aluno: "+aluno1.calcularMediaGeral());
							System.out.println("Resultado: "+aluno1.calcularMediaGeral1());
							System.out.println("-------------------------------------------------------");
				
			
				
				}
			
		
	}	


}
	}}}
