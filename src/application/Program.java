
package application;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entidade.enums.NiveldoTrabalhador;
import entidade2.Departamento;
import entidade2.HoraContrato;
import entidade2.Trabalhador;



public class Program {
	
	
	public static void main(String[] args) throws ParseException{
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); //instanciando objeto tipo Date para leitura de datas
		
		System.out.print("DIGITE O NOME DO DEPARTAMENTO:   ");
		String nomeDept = sc.nextLine();
		
		
		System.out.println("DIGITE OS DADOS DO TRABALHADOR: ");
		System.out.print("NOME:   ");
		String nome = sc.nextLine();
		System.out.print("LEVEL:  ");
		String level = sc.nextLine();
		System.out.print("SALARIO BASE:  ");
		double base = sc.nextDouble();
		
		Departamento departamento = new Departamento(nomeDept); //instanciando departamento e passando o nome que o usuario digitou
		Trabalhador trabalhador = new Trabalhador(nome, NiveldoTrabalhador.valueOf(level), base, departamento); //convertendo a string do nivel do trabalhador para enum por meio do valueof e passando a classe "departamento" como atributo do trabalhador
		
		
		System.out.print("QUANTOS CONTRATOS PARA ESSE TRABALHADOR:  ");
		int quantidade = sc.nextInt();
		
		for (int a = 1; a <= quantidade; a++) {
			
			System.out.println("DADOS DO CONTRATO #" + a);
			System.out.print("DATA (DD/MM/YYYY):  ");
			Date data = sdf.parse(sc.next());
			System.out.print("VALOR POR HORA:   ");
			double valorhora = sc.nextDouble();
			System.out.print("DURACAO:  ");
			int duracao = sc.nextInt();
			
			HoraContrato contrato = new HoraContrato(data, valorhora, duracao);
			trabalhador.adicionarContrato(contrato);
		}
		
		System.out.println();
		System.out.print("ENTRE COM O MES E ANO PARA CALCULAR O SALARIO TOTAL (MM/YYYY):    ");
		String mesAno = sc.next();
		int mes = Integer.parseInt(mesAno.substring(0, 2)); //cortanto a string da primeira posicao ate a terceira e armazendo numa variavel inteira
		int ano = Integer.parseInt(mesAno.substring(3));//cortanto a string da terceira posicao em diante e armazendo numa variavel inteira
		
		System.out.println("NOME:  " + trabalhador.getNome());
		System.out.println("DEPARTAMENTO:  " + trabalhador.getDepartamento().getNome());
		System.out.println("SALARIO TOTAL PARA  " + mesAno + ": "+  String.format("%.2f", trabalhador.salarioTotal(ano, mes)));
		sc.close();
	}

}
