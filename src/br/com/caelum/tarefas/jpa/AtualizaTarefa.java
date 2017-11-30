package br.com.caelum.tarefas.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.caelum.tarefas.modelo.Tarefa;

public class AtualizaTarefa {

  public static void main(String[] args) {
    Tarefa tarefa = new Tarefa();
    tarefa.setId(2L);
    tarefa.setDescricao("Continua estudando");
    tarefa.setFinalizado(true);
    
    EntityManagerFactory factory = Persistence.
    		createEntityManagerFactory("tarefas");
    EntityManager manager = factory.createEntityManager();
    
    manager.getTransaction().begin();
    manager.merge(tarefa);
    manager.getTransaction().commit();
    
    factory.close();
  }

}
