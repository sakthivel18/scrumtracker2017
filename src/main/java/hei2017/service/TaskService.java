package hei2017.service;

import hei2017.entity.Task;

import java.util.List;

/**
 * Created by pic on 09/02/2017.
 */
public interface TaskService
{

    long count();

    void delete(Task task);

    void deleteOneById(Long id);

    Boolean exists(Long id);

    Boolean exists(String nom);

    List<Task> findAll();

    List<Task> findByTaskStories(Long idStory);

    Task findOneById(Long id);

    Task findOneByNom(String nom);

    void save(Task task);
}
