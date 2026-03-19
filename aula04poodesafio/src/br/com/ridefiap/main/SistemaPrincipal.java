package br.com.ridefiap.main;
import br.com.ridefiap.model.Celular;
import br.com.ridefiap.model.Passageiro;

public class SistemaPrincipal {
public static void main(String[] args) {
// Instanciando Celular com o novo construtor
Celular meuCelular = new Celular("Iphone", "Cinza", 256);
Celular celulardoamigo = new Celular("Samsung", "Roxo", 128);
Passageiro passageiro1 = new Passageiro("Maria", 100.0);
Passageiro passageiro2 = new Passageiro("João", 50.0);

System.out.println("--- Estado Inicial dos Objetos ---");
System.out.println("Meu celular: " + meuCelular.getMarca() + ", Cor: " + meuCelular.getCor() + ", Capacidade: " + meuCelular.getCapacidadeemGb() + "GB");
System.out.println("Celular do amigo: " + celulardoamigo.getMarca() + ", Cor: " + celulardoamigo.getCor() + ", Capacidade: " + celulardoamigo.getCapacidadeemGb() + "GB");
System.out.println("Passageiro 1: " + passageiro1.getNome() + ", Saldo: " + passageiro1.getSaldo());
System.out.println("Passageiro 2: " + passageiro2.getNome() + ", Saldo: " + passageiro2.getSaldo() + "\n");

System.out.println("--- Testando setCapacidadeemGb() do Celular ---");
// Teste válido
meuCelular.setCapacidadeemGb(512);
System.out.println("Meu celular (após setCapacidadeemGb válido): " + meuCelular.getCapacidadeemGb() + "GB");
// Teste inválido (capacidade negativa)
meuCelular.setCapacidadeemGb(-100);
System.out.println("Meu celular (após setCapacidadeemGb inválido - negativo): " + meuCelular.getCapacidadeemGb() + "GB");
// Teste inválido (capacidade acima do limite)
meuCelular.setCapacidadeemGb(2000);
System.out.println("Meu celular (após setCapacidadeemGb inválido - acima do limite): " + meuCelular.getCapacidadeemGb() + "GB\n");

System.out.println("--- Testando setSaldo() do Passageiro ---");
// Teste válido
passageiro1.setSaldo(150.0);
System.out.println("Passageiro 1 (após setSaldo válido): " + passageiro1.getSaldo());
// Teste inválido (saldo negativo)
passageiro2.setSaldo(-20.0);
System.out.println("Passageiro 2 (após setSaldo inválido - negativo): " + passageiro2.getSaldo() + "\n");

System.out.println("--- Estado Final dos Objetos ---");
System.out.println("Meu celular: " + meuCelular.getMarca() + ", Cor: " + meuCelular.getCor() + ", Capacidade: " + meuCelular.getCapacidadeemGb() + "GB");
System.out.println("Celular do amigo: " + celulardoamigo.getMarca() + ", Cor: " + celulardoamigo.getCor() + ", Capacidade: " + celulardoamigo.getCapacidadeemGb() + "GB");
System.out.println("Passageiro 1: " + passageiro1.getNome() + ", Saldo: " + passageiro1.getSaldo());
System.out.println("Passageiro 2: " + passageiro2.getNome() + ", Saldo: " + passageiro2.getSaldo());
}
}
