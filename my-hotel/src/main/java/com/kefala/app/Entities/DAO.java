package com.kefala.app.Entities;

import com.kefala.app.Models.DTO;

import java.io.*;
import java.util.*;

/**
 * Created by kefala on 19/06/16.
 */
public abstract class DAO<MODEL_DTO extends DTO> implements DAOInterface<MODEL_DTO> {

    private FileManager<MODEL_DTO> fileManager = new FileManager<MODEL_DTO>(DIRECTORY_PATH, getFileName());

    public MODEL_DTO create(MODEL_DTO model) {
        List<MODEL_DTO> currents = fileManager.readContent();
        model.setId(getLastId());
        currents.add(model);
        fileManager.writeList(currents);
        return model;
    }

    public void delete(MODEL_DTO model) {
        List<MODEL_DTO> currents = fileManager.readContent();
        int index = findIndex(model.getId());
        if(index >= 0){
            currents.remove(index);
        }
        fileManager.writeList(currents);
    }

    public List<MODEL_DTO> getAll() {
        return fileManager.readContent();
    }

    public MODEL_DTO find(Serializable key) {
        List<MODEL_DTO> currents = fileManager.readContent();
        MODEL_DTO model = null;
        for(MODEL_DTO obj: currents){
            if(obj.getId().equals(key)){
                model =obj;
            }
        }
        return model;
    }

    public void update(MODEL_DTO model) {
        List<MODEL_DTO> currents = fileManager.readContent();
        int index = findIndex(model.getId());
        if(index >=0){
            currents.remove(index);
            currents.add(model);
        }
        fileManager.writeList(currents);
    }


    protected int findIndex(Serializable key) {
        List<MODEL_DTO> currents = fileManager.readContent();
        int index = -1, i =0;
        for(MODEL_DTO obj: currents){
            if(obj.getId().equals(key)){
                index =i;
            }
            i++;
        }
        return index;
    }

    public abstract String getFileName();

    public Integer getLastId() {
        Integer key = 0;
        List<MODEL_DTO> currents = fileManager.readContent();
        if (currents != null && currents.size() > 0) {
            MODEL_DTO obj = Collections.max(currents, new Comparator<MODEL_DTO>() {
                public int compare(MODEL_DTO o1, MODEL_DTO o2) {
                    return o1.getId().compareTo(o2.getId());
                }
            });
            key = obj.getId();
        }

        return ++key;
    }

    public void deleteAll() {
        fileManager.writeList(new ArrayList<MODEL_DTO>());
    }

    public void setFileManager(FileManager<MODEL_DTO> fileManager) {
        this.fileManager = fileManager;
    }
}
