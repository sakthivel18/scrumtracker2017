package hei2017.service.Impl;

import hei2017.dao.ProjectDAO;
import hei2017.entity.Project;
import hei2017.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

/**
 * Created by pic on 09/02/2017.
 */
@Named
@Transactional
public class ProjectServiceImpl implements ProjectService
{
    @Inject
    ProjectDAO projectDAO;

    @Override
    public List<Project> findAll() {
        return projectDAO.findAll();
    }

    @Override
    public Project findOneByNom(String nom) {
        return projectDAO.findOneByNom(nom);
    }

    @Override
    public long count() {
        return projectDAO.count();
    }

    @Override
    public void save(Project project) {
        projectDAO.save(project);
    }

    @Override
    public Boolean exists(String nom) {
        if(null!=projectDAO.findOneByNom(nom))
            return true;
        else
            return false;
    }
}
