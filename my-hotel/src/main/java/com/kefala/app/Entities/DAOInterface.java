package com.kefala.app.Entities;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;

/**
 * Created by kefala on 19/06/16.
 */
public interface DAOInterface<MODEL_DTO> {
    String DIRECTORY_PATH = "files/";

    MODEL_DTO create(MODEL_DTO entity);

    void delete(MODEL_DTO entity);

    List<MODEL_DTO> getAll();

    MODEL_DTO find(Serializable key);

    void update(MODEL_DTO entity);

    Integer getLastId();
}
