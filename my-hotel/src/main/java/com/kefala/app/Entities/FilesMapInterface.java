package com.kefala.app.Entities;

import java.util.ArrayList;

/**
 * Created by kefala on 17/06/16.
 */
public interface FilesMapInterface {
    public void save();
    public ArrayList getAll();
    public Object getById(Integer id);

}
