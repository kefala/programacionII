package com.cajero.app.Entities;

import java.util.List;

/**
 * Created by kefala on 19/06/16.
 */
public interface DAOInterface<MODEL_DTO> {
    String DIRECTORY_PATH = "cajeroFiles/";

    MODEL_DTO create(MODEL_DTO entity);

    void delete(MODEL_DTO entity);

    List<MODEL_DTO> getAll();

    MODEL_DTO find(Integer key);

    void update(MODEL_DTO entity);

    Integer getLastId();
}
