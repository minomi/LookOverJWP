package spms.dao;

import spms.vo.Project;

import java.util.List;

/**
 * IDE : IntelliJ IDEA
 * Created by minho on 2018. 9. 4..
 */
public interface ProjectDao {
    List<Project> selectList() throws Exception;
}