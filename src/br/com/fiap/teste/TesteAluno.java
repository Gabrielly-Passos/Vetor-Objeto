package br.com.fiap.teste;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Aluno;

public class TesteAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		int resp =0, intFaltas=0,
			intIdade=0, indice=0;
		
	   double dblMedia = 0;
	   String strNome = null;  
	   Aluno[] objeto = new Aluno[10];
	
	  while(resp == 0) {
		  strNome = JOptionPane.showInputDialog("Digite o nome do aluno");
		  dblMedia = Double.parseDouble(JOptionPane.showInputDialog("Digite a média"));
		  intFaltas = Integer.parseInt(JOptionPane.showInputDialog("Digite as faltas"));
		  intIdade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
		  
		  objeto[indice] = new Aluno();
		  
		  objeto[indice].setIdade(intIdade);
		  objeto[indice].setFaltas(intFaltas);
		  objeto[indice].setMedia(dblMedia); 
		  objeto[indice].setNome(strNome);
		  
		  indice+=1;
		  
		   
	        	 resp =JOptionPane.showConfirmDialog(null,
	        	       "Deseja continuar?", "CAMADAS",
	                	JOptionPane.YES_NO_OPTION,
	                 	JOptionPane.QUESTION_MESSAGE);
	        
		  
		  
		  
		  
		  
		  
		  
	  }
	}

}
